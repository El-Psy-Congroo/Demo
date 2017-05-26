package Util;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.io.File;
import java.util.Date;
import java.util.Properties;

/**
 * Created by Zhang on 2017/5/26.
 */
public class Mail {
    private String loginName="XXXXXXXXXX@qq.com";
    private String passWord="XXXXXXXXXXX";
    private String charset="GBK";
    private Session session;
    private Multipart multipart;
    MimeMessage mimeMessage;
    Properties props = new Properties();
    public  Mail(){
        //创建JavaMail需要用到的属性类：
        props.put("mail.smtp.auth", "true");
        //此处填写SMTP服务器
        props.put("mail.smtp.host", "smtp.qq.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.user", loginName);
        props.put("mail.password", passWord);
        Authenticator authenticator = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                // 用户名、密码
                String userName = props.getProperty("mail.user");
                String password = props.getProperty("mail.password");
                return new PasswordAuthentication(userName, password);
            }
        };
        session = Session.getInstance(props, authenticator);
        session.setDebug(true);
    }
    /**
     * 邮件发送基础设置
     * @param receivers 接收人邮箱，以字符串数组储存
     * @param title 邮箱标题
     */
    private void setMail(String []receivers,String title){
        Address[] receiver=new Address[receivers.length];
        try{
            //获取收件人地址
            for(int i=0;i<receivers.length;i++){
                receiver[i]=new InternetAddress(receivers[i]);
            }
            mimeMessage = new MimeMessage(session);
            //设置发送者
            mimeMessage.setFrom(new InternetAddress(loginName));
            //设置收件人邮箱：
            mimeMessage.setRecipients(Message.RecipientType.TO,receiver);
            //设置标题：
            mimeMessage.setSubject(title, charset);
            //设置发送日期：
            mimeMessage.setSentDate(new Date());
            //创建附件
            multipart = new MimeMultipart();
        }catch (Exception e){}
    }

    /**
     * 发送简易邮件(内容仅文本)
     * @param receivers 收件人邮箱地址，以字符串数组储存
     * @param title 邮件标题
     * @param content 邮件内容
     */
    public void SendSimpleMail(String []receivers,String title,String content) {
        try {
            //邮箱发送基础设置
            setMail(receivers,title);
            //创建邮件内容
            MimeBodyPart body = new MimeBodyPart();
            //设置邮件内容
            body.setText(content, charset);
            multipart.addBodyPart(body);//发件内容
        } catch (Exception e) {
        }
    }

    /**
     * 发送复杂邮件(内容支持HTML)
     * @param receivers 收件人邮箱地址，以字符串数组储存
     * @param title 邮件标题
     * @param mailContent 邮件内容
     * @param mimetype 内容类型(text/xml,text/plain)
     */
    public void SendHtmlMail(String []receivers,String title,String mailContent,String mimetype){
        try {
            //邮箱发送基础设置
            setMail(receivers,title);
            //创建邮件内容
            MimeBodyPart body = new MimeBodyPart();
            //设置邮件内容
            //复杂邮件
            body.setContent(mailContent, (mimetype!=null && !"".equals(mimetype) ? mimetype : "text/plain")+ ";charset="+ charset);
            multipart.addBodyPart(body);//发件内容
        } catch (Exception e) {
        }
    }
    public void addFile(File[]attachements) {
        try {
            if (attachements != null) {
                for (File attachement : attachements) {
                    MimeBodyPart attache = new MimeBodyPart();
                    attache.setDataHandler(new DataHandler(new FileDataSource(attachement)));
                    String fileName = getLastName(attachement.getName());
                    attache.setFileName(MimeUtility.encodeText(fileName, charset, null));
                    multipart.addBodyPart(attache);
                }
            }
        } catch (Exception e) {

        }
    }
    public void send(){
        try {
            //设置邮件内容（使用Multipart方式）
            mimeMessage.setContent(multipart);
            //发送邮件
            Transport.send(mimeMessage);
        }catch (Exception e){

        }
    }
    private static String getLastName(String fileName) {
        int pos = fileName.lastIndexOf("\\");
        if (pos > -1) {
            fileName = fileName.substring(pos + 1);
        }
        pos = fileName.lastIndexOf("/");
        if (pos > -1) {
            fileName = fileName.substring(pos + 1);
        }
        return fileName;
    }
}

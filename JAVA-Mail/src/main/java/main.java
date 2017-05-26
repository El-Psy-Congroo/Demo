import Util.Mail;

import java.io.File;

/**
 * Created by Zhang on 2017/5/26.
 * SendSimpleMail()方法设置接收人信息以及邮件纯文本内容
 * SendHtmlMail()方法设置接收人信息以及邮件复杂文本内容
 * addFile()可添加附件
 * 最后调用send()方法发送邮件
 */
public class main {
    public static void main(String[] args){
        Mail mail=new Mail();
        String []receive={"XXXXXX@qq.com"};
        mail.SendSimpleMail(receive,"测试","简易邮测试");
        /*File f[]=new File[1];
        f[0]= new File("C:\\Users\\Zhang\\Desktop\\34.jpg");
        mail.addFile(f);*/
        mail.send();
    }
}

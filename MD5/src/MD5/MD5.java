package MD5;

import java.security.MessageDigest;

/**
 * Created by Zhang on 2016/7/12.
 */
public class MD5 {
    static String md5(String inStr) {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
            byte[] byteArray = inStr.getBytes("utf-8");

            byte[] md5Bytes = md5.digest(byteArray);

            StringBuffer hexValue = new StringBuffer();

            for (int i = 0; i < md5Bytes.length; i++) {
                int val = ((int) md5Bytes[i]) & 0xff;
                if (val < 16)
                    hexValue.append("0");
                hexValue.append(Integer.toHexString(val));
            }

            return hexValue.toString();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }
    }
}

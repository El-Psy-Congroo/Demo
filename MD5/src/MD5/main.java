package MD5;

import java.util.Scanner;

/**
 * Created by Zhang on 2016/7/13.
 */
public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String s=input.nextLine();
        System.out.println(MD5.md5(s));
    }
}

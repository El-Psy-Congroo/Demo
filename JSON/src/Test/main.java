package Test;
import JSON.JsonBigData;
import JSON.JsonLittleData;
import model.Json;
import model.Member;

import java.io.IOException;

/**
 * Created by Zhang on 2016/8/11.
 */
public class main {
    public static void main(String[] args) throws IOException {
//      Member member=new Member();
//      member.setAge("21");member.setName("Zhang");member.setSex("M");
//
//      String toJson=JsonLittleData.ObjectToJson(member);
//      System.out.println(toJson);
//
//      Member newMember=JsonLittleData.JsonToObject(toJson,Member.class);
//      System.out.println(newMember.getName()+"\n"+newMember.getAge()+"\n"+newMember.getSex());

        Json json=new Json();

        String toJson= JsonBigData.ObjectToJson(json);
        System.out.println(toJson);
        Json newJson=JsonBigData.JsonToObject(toJson,Json.class);
        System.out.println(newJson.getMessages());
    }
}

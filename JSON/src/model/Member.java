package model;

import java.util.List;

/**
 * Created by Zhang on 2016/8/11.
 */
public class Member {
    private String name;
    private String age;
    private String sex;
    private List<Member> list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<Member> getList() {
        return list;
    }

    public void setList(List<Member> list) {
        this.list = list;
    }
}

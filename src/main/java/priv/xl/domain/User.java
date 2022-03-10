package priv.xl.domain;

import java.io.Serializable;

public class User implements Serializable {
    private String uname;
    private Integer age;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                '}';
    }
}

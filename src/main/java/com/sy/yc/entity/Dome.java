package com.sy.yc.entity;

/**
 * @ClassName Dome
 * @Description: TODO
 * @Author Administrator
 * @Date 2019/8/30
 * @Version V1.0
 **/
public class Dome {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "dome{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
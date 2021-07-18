package com.softeem.pojo;

import java.util.List;

/**
 * description:
 *
 * @author lyming
 * @date 2020/12/13 6:44 下午
 */
public class Form {
    private String username;
    private String lady;
    private List<Integer> reason;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLady() {
        return lady;
    }

    public void setLady(String lady) {
        this.lady = lady;
    }

    public List<Integer> getReason() {
        return reason;
    }

    public void setReason(List<Integer> reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Form{" +
                "username='" + username + '\'' +
                ", lady='" + lady + '\'' +
                ", reason=" + reason +
                '}';
    }
}

package com.springlc.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTo {
    @NotBlank(message = "* Your name can't be blank")
    @Size(min = 3, max = 15, message = "your name length should be between 3-15")
    private String userName;

    @NotBlank(message = "* Your crush name can't be blank")
    @Size(min = 3, max = 15, message = "your crush name length should be between 3-15")
    private String crushName;

    @AssertTrue(message = "you must agree to condition")
    private boolean tandc;

    public UserInfoDTo() {
        System.out.println("UserInfoDTo object created");
    }

    // Getters and setters
    public boolean isTandc() {
        return tandc;
    }

    public void setTandc(boolean tandc) {
        this.tandc = tandc;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCrushName() {
        return crushName;
    }

    public void setCrushName(String crushName) {
        this.crushName = crushName;
    }

    @Override
    public String toString() {
        return "UserInfoDTo [userName=" + userName + ", crushName=" + crushName + "]";
    }
}

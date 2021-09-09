package com.example.dailydairy;

public class UserProfile {
    public String userEmail;
    public String userName;
    public String userVillage;
    public UserProfile(){

    }

    public UserProfile(String userEmail, String userName, String userVillage) {
        this.userEmail = userEmail;
        this.userName = userName;
        this.userVillage = userVillage;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserVillage() {
        return userVillage;
    }

    public void setUserVillage(String userVillage) {
        this.userVillage = userVillage;
    }
}

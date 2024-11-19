package com.bigcorp.crm;

public class ServiceB {

    public boolean isValid(String userName){
        if(userName == null){
            return false;
        }
        if(userName.startsWith(" ") || userName.startsWith(" ")){
            return false;
        }
        if(userName.length() < 3 || userName.length() > 15){
            return false;
        }
        return userName.contains("super");
    }
}

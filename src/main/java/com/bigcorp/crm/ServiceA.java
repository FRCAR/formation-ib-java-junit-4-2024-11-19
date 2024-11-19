package com.bigcorp.crm;

import java.util.HashSet;
import java.util.Set;

public class ServiceA {

    private Set<String> users = new HashSet<>();

    private ServiceB serviceB;

    public void setServiceB(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    public boolean save(String userName) {
        if (!this.serviceB.isValid(userName)) {
            return false;
        }
        if (this.users.contains(userName)) {
            return false;
        }
        //else
        this.users.add(userName);
        return true;
    }
}

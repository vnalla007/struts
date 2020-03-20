package org.superbiz.struts;

import org.springframework.stereotype.Component;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Properties;

@Component
public class FindUser {

    private final UserService service;

    public FindUser(UserService service) {
        this.service = service;
    }


    private long id;
    private String errorMessage;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String execute() {

        try {
            this.user = service.find(id);
        } catch (Exception e) {
            this.errorMessage = e.getMessage();
            return "failure";
        }

        return "success";
    }
}
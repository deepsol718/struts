package com.example.action;

public class HelloAction {
    private String message;

    public String execute() {
        message = "Hello from Struts 2!";
        return "success";
    }

    public String getMessage() {
        return message;
    }
}

package com.example.restful_web_services.helloworld;

public class HelloWorldBean {

    private String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HelloWorldBean {");
        sb.append("message=").append(message);
        sb.append('}');
        return sb.toString();
    }

    

    
}

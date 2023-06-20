package com.spring.verifyemail.models;

public class Mail {

    private  String header;
    private  String text;
    private String to;

    public String getHeader() {
        return header;
    }

    public String getText() {
        return text;
    }

    public String getTo() {
        return to;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Mail() {

    }
}

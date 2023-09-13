package com.example.ws.model;

public class WsMessage {
    private String sender;

    public WsMessage(String sender, String context) {
        this.sender = sender;
        this.context = context;
    }

    public String getSender() {
        return sender;
    }

    public WsMessage() {
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    private String context;
}

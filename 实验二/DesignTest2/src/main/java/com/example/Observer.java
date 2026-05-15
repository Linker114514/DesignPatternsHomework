package com.example;

public interface Observer {
    public void update(String bookName, String author, String edition,boolean isAvailable);
}

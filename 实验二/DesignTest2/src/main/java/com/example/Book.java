package com.example;

import java.util.ArrayList;
public class Book implements Subject {
    private ArrayList observers;
    private String bookName;
    private String author;
    private String edition;
    private boolean isAvailable;


    public Book(String bookName, String author, String edition,boolean isAvailable) //构造方法
    {
        this.bookName = bookName;
        this.author = author;
        this.edition = edition;
        this.isAvailable = isAvailable;
        observers = new ArrayList();
    }

    public Book(){
        bookName = "";
        author = "";
        edition = "";
        isAvailable = false;
        observers = new ArrayList();
    }




    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(bookName, author, edition,isAvailable);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(String bookName, String author, String edition, boolean isAvailable) {
        this.bookName = bookName;
        this.author = author;
        this.edition = edition;
        measurementsChanged();
    }

    public void bookReturned() {
        this.isAvailable = true;
        System.out.println("\n【系统消息】：《" + bookName + "》已归还入库！");
        notifyObservers();
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getBookName() {
        return bookName;
    }

}

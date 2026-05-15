package com.example;

public class Member implements Observer {
    private String name; // 成员姓名

    public Member(String name) {
        this.name = name;
    }

    @Override
    public void update(String bookName, String author, String edition, boolean isAvailable) {
        if (isAvailable) {
            System.out.println(name + " 收到通知：《" + bookName + "》可以借阅了！");
            borrowBook(bookName);
        }
    }

    /** 模拟借书动作 */
    private void borrowBook(String bookName) {
        System.out.println(name + " 成功借阅了《" + bookName + "》！\n");
    }

}
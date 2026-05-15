package com.example;

public class Main {
    public static void main(String[] args) {
        // 1. 创建具体的书籍（主题）
        Book journeyBook = new Book("西游记","吴承恩","第一版",false);
        Book aloneBook = new Book("百年孤独","加西亚·马尔克斯","第一版",false);

        // 2. 创建具体的成员（观察者）
        Member memberA = new Member("刘华强");
        Member memberB = new Member("马冬梅");
        Member memberC = new Member("何塞");

        // 3. 成员订阅书籍
        journeyBook.registerObserver(memberA);
        journeyBook.registerObserver(memberB);

        aloneBook.registerObserver(memberA);
        aloneBook.registerObserver(memberC);

        // 4. 模拟一段时间后，书籍还没回来（无通知）
        System.out.println("--- 模拟运行一段时间，书籍还在被借阅中 ---");
        System.out.println("当前状态：《西游记》是否可借？ " + journeyBook.isAvailable());
        System.out.println("成员们暂时收不到通知。\n");

        // 5. 关键动作：书籍被归还了，触发通知机制
        System.out.println("--- 时间流逝，工作人员操作归还 ---");
        journeyBook.bookReturned();
        aloneBook.bookReturned();
    }
}
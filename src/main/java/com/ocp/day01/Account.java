package com.ocp.day01;

public class Account {
    //屬性
    private int balance; //帳戶餘額
    
    //查詢帳戶餘額方法
    int getBalance() {
        return balance;//方法停止並回傳餘額
    }

    public void setBalance(int balance) {
        this.balance = balance;
        if (balance < 0) {
            System.out.println("存款金額有錯");
        }
    }
     
    void withdraw(int money){//提款方法
        //驗症 money 是否符合條件
        if (money <= 0 ) {
            System.out.println("提款金額不符!");
            return;//存款方法到此結束
        }
        //驗症 money 是否大於 balance?
        if (money > balance) {
            System.out.println("帳戶餘額不足");
            return;//存款方法到此結束
        }
        balance -= money;
    }
    void deposit(int money){//存款方法
        //驗症 money 是否符合條件
        if (money <= 0) {
            System.out.println("存款金額不符!");
            return;//存款方法到此結束
        }
        balance += money;

    }
    
}


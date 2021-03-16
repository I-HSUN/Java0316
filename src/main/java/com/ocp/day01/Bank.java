package com.ocp.day01;

public class Bank {
    public static void main(String[] args) {
        Account a01 = new Account();//建立a01帳戶
        Account a02 = new Account();//建立a02帳戶
        Account a03 = new Account();//建立a03帳戶\
        a01.balance = 1000;
        a02.balance = 2000;
        a03.balance = 3000;
        System.out.printf("a01帳戶餘額: $%,d \n", a01.balance);
        System.out.printf("a02帳戶餘額: $%,d \n", a02.balance);        
        System.out.printf("a03帳戶餘額: $%,d \n", a03.balance);
        //存款
        System.out.println("a01存款500元後....");
        a01.deposit(500);
        System.out.printf("a01帳戶餘額: $%,d \n", a01.balance);
        //提款
        System.out.println("a02提款800元後...");
        a02.deposit(800);
        System.out.printf("a02帳戶餘額: $%,d \n", a02.balance);
    }
    
}

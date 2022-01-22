package com.ocp.day01;

public class Bank {
    public static void main(String[] args) {
        Account a01 = new Account();//建立一個 a01 帳戶物件
        Account a02 = new Account();//建立一個 a02 帳戶物件
        Account a03 = new Account();//建立一個 a03 帳戶物件
        //各帳戶開戶的第一次存款
        a01.deposit(1000);
        a02.deposit(2000);
        a03.deposit(3000);
        System.out.printf("a01 帳戶餘額: $%,d \n",a01.getBalance());
        System.out.printf("a02 帳戶餘額: $%,d \n",a02.getBalance());
        System.out.printf("a03 帳戶餘額: $%,d \n",a03.getBalance());
        //存款
        System.out.println("a01存款 500元 後...");
        a01.deposit(500);
        System.out.printf("a01 帳戶餘額: $%,d \n",a01.getBalance());
        //提款
        System.out.println("a02提款 800元 後...");
        a02.withdraw(800);
        System.out.printf("a02 帳戶餘額: $%,d \n",a02.getBalance());
        //存款
        System.out.println("a03 存款 -1200元 後...");
        a01.deposit(-1200);
        System.out.printf("a03 帳戶餘額: $%,d \n",a03.getBalance());
        //提款
        System.out.println("a03提款 5000元 後...");
        a02.withdraw(5000);
        System.out.printf("a03 帳戶餘額: $%,d \n",a03.getBalance());
    }
    
}

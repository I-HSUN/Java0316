package com.ocp.day16;

public class SevenEleven {
    public void submit(final int price){
        final String name = "微粒炸醬麵";
        class Transaction{
            void print(){
                System.out.printf("%s 交易金額: %d \n",name,price);
            } 
        }
        Transaction t = new Transaction();
        t.print();
    }
    
    public static void main(String[] args) {
        SevenEleven se = new SevenEleven();
        se.submit(100);
    }
}

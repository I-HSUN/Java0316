package com.lab.order_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    private static List<Food> order = new ArrayList<>();
    private static DataCenter dc = new DataCenter();
    private static ServiceCenter sc = new ServiceCenter();
    private static boolean play = true;
    
    public static void main(String[] args) {
        while (play) {            
            menu();            
        }
    }
    
    public  static void menu(){
        sc.menu();
        System.out.print("請輸入");
        Scanner scanner = new Scanner(System.in);
        int itemId = scanner.nextInt();
        switch(itemId){
            case 1:
                sc.printCatalog();
                break;
            case 2:
                System.out.println("請輸入no:");
                int addNo = scanner.nextInt();
                Food food = sc.getFoodByNo(addNo);
                order.add(food);
                break;
            case 3:
                for (int i=0;i<order.size();i++) {
                    System.out.printf("id: %d %s\n",i,order.get(i));                    
                }
                break;
            case 4:
                System.out.println("請輸入取消no:");
                int canceId = scanner.nextInt();
                order.remove(canceId);
                break;
            case 5:
                order=new ArrayList<>();
                break;
            case 6:
                int sum = order.stream().mapToInt(food::getPrice).sum();
                System.out.printf("結帳金額:%d\n",sum);
                play = false;
                break;
            case 0:
                play =false;
        }
    }
    
}

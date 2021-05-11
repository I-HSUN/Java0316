package com.lab.order_system;

import java.util.Set;

public class ServiceCenter {
    private Set<Food> catalog = new DataCenter().getCatalog();
//根據no來找Food
public Food getFoodByNo(int no){
return catalog.stream()
        .filter(food->food.getNo() ==no)
        .findFirst()
        .get();
}
//負責檢視Catalog
    public void printCatalog(){
        
        System.out.println("訂單系統");
        System.out.println("+--------------------------------------------");
        System.out.println("|序|　品名　|尺寸|price|");
        for (Food food : catalog) {
            System.out.println("|－|－－－－|－－|－－|");
            System.out.printf("|%2d|%s| %c|%3d|\n",
                    food.getNo(),food.getName(),food.getSize(),food.getPrice());
        }
        System.out.println("--------------------------------------------");
    }
    public void menu(){
        System.out.println("系統項目");
        System.out.println("-------------------");
        System.out.println("1.檢視Catalog");
        System.out.println("2.新增訂單餐點");
        System.out.println("3.查詢訂單餐點");
        System.out.println("4.取消餐點");
        System.out.println("5.刪除訂單");
        System.out.println("6.結帳");
        System.out.println("0.Exit");
    }
}

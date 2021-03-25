package com.ocp.day06;


/*
   某公司有18位員工，
其中10位在去年投資股票，一年的獲利率如下(單位：%)：
7.6 3.9 15.6 28.3 1.2 10.8 35.3 45.6 10.2 0.5
另外8位員工投資買公債一年內獲利率如下(單位：%)
6.8 7.2 6.8 7.5 6.9 7.9 7.9 7.1 7.2
試分別求此公司的員工投資股票與公債的獲利率變異係數
以及哪一種投資的獲利較穩健 ?


 */
public class Arraycv4 {
    public static void main(String[] args) {
        double[] stock = {7.6, 3.9, 15.6, 28.3, 1.2, 10.8, 35.3, 45.6, 10.2, 0.5};
        double[] bonds = {6.8, 7.2, 6.8, 7.5, 6.9, 7.9, 7.9, 7.1, 7.2};
        double stock_cv =MyMath.cv(stock);
        double bonds_cv =MyMath.cv(bonds);
        String result = (stock_cv < bonds_cv) ?"股票":"公債";
        System.out.printf("股票 cv : %.2f%% 公債 cv : %.2f%% %s集中度較高", stock_cv*100 , bonds_cv*100 ,result);
    }
}

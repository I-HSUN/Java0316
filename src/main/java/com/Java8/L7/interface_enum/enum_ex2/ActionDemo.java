package com.Java8.L7.interface_enum.enum_ex2;


public class ActionDemo {
    public static void main(String[] args) {
        play(Action.Right); //只能傳入Action實例
        play(Action.UP);
    }
    public static void play(Action action){ //宣告Action型態
        switch(action){
            case Stop:   //也就是Action.Stop    列舉Action實例
                System.out.println("播放停止動畫");
                break;
            case Right:   //也就是Action.Right
                System.out.println("播放向右動畫");
                break;
            case LEFT:   //也就是Action.LEFT
                System.out.println("播放向左動畫");
                break;
            case UP:   //也就是Action.UP
                System.out.println("播放向上動畫");
                break;
            case DoWN:   //也就是Action.DoWN
                System.out.println("播放向下動畫");
                break;
        }
    }
}

package com.Java8.L7.interface_enum.enum_ex1;


public class ActionDemo {
    public static void main(String[] args) {
        play(Action.Right);
        play(Action.UP);
    }
    public static void play(int action){
        switch(action){
            case Action.Stop:
                System.out.println("播放停止動畫");
                break;
            case Action.Right:
                System.out.println("播放向右動畫");
                break;
            case Action.LEFT:
                System.out.println("播放向左動畫");
                break;
            case Action.UP:
                System.out.println("播放向上動畫");
                break;
            case Action.DoWN:
                System.out.println("播放向下動畫");
                break;
            default:
                System.out.println("不支援動作");
        }
    }
}

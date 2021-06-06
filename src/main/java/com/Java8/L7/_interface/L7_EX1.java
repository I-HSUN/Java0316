package com.Java8.L7._interface;

        
public class L7_EX1 {
    static void doSwim(Fish fish){
        fish.swim();
    }
    static void doSwim(Human human){
        human.swim();
    }
    static void doSwim(Submarine submarine){
        submarine.swim();
    }
    static void doSwim(Seaplane seaplane){
        seaplane.swim();
    }
    static void doSwim(FlyingFish flyingFish){
        flyingFish.swim();
    }

    public static void main(String[] args) {
        Swimmeer swimmeer = new Shark(" ");
        Shark shark = (Shark)swimmeer;
        Fish fish = (Fish)swimmeer;
        doSwim(new Anemonefish("尼莫"));
        doSwim(new Shark("蘭尼"));
        doSwim(new Human("賈斯汀"));
        doSwim(new Submarine("黃色一號"));
        doSwim(new Seaplane("空軍零號"));
        doSwim(new FlyingFish("甚平"));
    }
    static void doSwim(Swimmeer swimmeer){
        swimmeer.swim();
    }
}

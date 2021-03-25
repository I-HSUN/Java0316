package com.ocp.day06;

public class ArrayBMICV {
    public static void main(String[] args) {
        String[] names = {"A","B","C","D","E"};
        double[] h = {172,168,164,170,176};
        double[] w = {62,57,58,64,64};
        Person[] persons =new Person[5];
        
        for (int i = 0; i < persons.length; i++) {
        Person p = new Person(names[i], h[i], w[i]);
        persons[i] = p;
        System.out.println(persons[i]);
        }
        for (Person p : persons) {
            System.out.printf("bmi : %.1f\n",p.bmi);
        }
        
        
    }
}

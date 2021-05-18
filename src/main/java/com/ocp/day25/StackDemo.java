package com.ocp.day25;

import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stack<Product>box = new Stack<>();
        box.push(new Product("Java", 100));
        box.push(new Product("Python", 80));
        box.push(new Product("C#", 100));
        System.out.println("箱子裡的書: " + box);
        while (!box.isEmpty()) {
            Product product = box.pop();
            System.out.println("書名: " + product.getName());
        }
        System.out.println("箱子裡的書" + box);
    }
    
}

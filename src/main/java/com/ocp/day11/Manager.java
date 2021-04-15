package com.ocp.day11;

public class Manager extends Employee{
    private int budger;

    public int getBudger() {
        return budger;
    }

    public void setBudger(int budger) {
        this.budger = budger;
    }

    @Override
    public String toString() {
        return "Manager{" + "budger=" + budger +", salary = " + getSalary() + '}' ;
    }
    
}
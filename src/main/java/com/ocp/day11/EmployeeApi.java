package com.ocp.day11;

import java.util.stream.Stream;

public class EmployeeApi {
    private static Employee[]employees;
    static {
                Employee e1 = new Employee();
        e1.setSalary(30000);
        Employee e2 = new Employee();
        e2.setSalary(40000);
        Employee e3 = new Employee();
        e3.setSalary(50000);
        Manager m1 = new Manager();
        m1.setSalary(70000);
        m1.setBudger(100000);
        Manager m2 = new Manager();
        m2.setSalary(80000);
        m2.setBudger(150000);
        Director d1 = new Director();
        d1.setSalary(200000);
        d1.setBudger(500000);
        d1.setStockOption(3000000);
        employees =new Employee[] {e1,e2,e3,m1,m2,d1}; 
    }
    //取得所有員工資料
    public static Employee[] getEmployees() {
        return employees;
    }
    //取得總薪資
    public static int getTotalSalary(){
        return Stream.of(employees)
            .mapToInt(e -> e.getSalary())
            .sum();
        }
    //取得平均薪資
    public static double getSalaryAvg () {
        return Stream.of(employees)
            .mapToInt(e -> e.getSalary())
            .average()
            .getAsDouble();
        }
    //取得總預算
    public static int getTotalBudger () {
        return Stream.of(employees)//Employee串流
                .filter(e ->e instanceof Manager)//Employee串流
                .map(e ->(Manager)e)//Manager串流
                .mapToInt(Manager::getBudger)//Manager串流
                .sum();
    }
    //員工總數
    public static int amount(){
    return employees.length;
    }
}

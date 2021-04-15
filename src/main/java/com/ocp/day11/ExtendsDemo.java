package com.ocp.day11;

import java.util.stream.Stream;

public class ExtendsDemo {
    public static void main(String[] args) {
        //操作 Employee,Manager,Director
        Employee e1 = new Employee();
        e1.setSalary(30000);
        Employee e2 = new Employee();
        e2.setSalary(40000);
        Employee e3 = new Employee();
        e3.setSalary(50000);
        //--------------------------------
        Manager m1 = new Manager();
        m1.setSalary(70000);
        m1.setBudger(100000);
        Manager m2 = new Manager();
        m2.setSalary(80000);
        m2.setBudger(150000);
        //--------------------------------
        Director d1 = new Director();
        d1.setSalary(200000);
        d1.setBudger(500000);
        d1.setStockOption(3000000);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(d1);
        //--------------------------------
        //請問總薪資(Salary)是多少
        System.out.println("請問總薪資(Salary)是多少");
        Employee [] employees ={e1,e2,e3,m1,m2,d1};
        int sum = 0;
        int sum2 = 0;
        
        for(int i = 0;i<employees.length;i++){
            sum += employees[i].getSalary();
        }
        System.out.printf("java7 for loop sum 總薪資 : %d\n",sum);
        //java7(for-each)-----------
        for (Employee e : employees) {
            sum2 += e.getSalary();
        }
        System.out.printf("java7 for-each sum2 總薪資 : %d\n",sum2);
        //Java8
        int sum3 = Stream.of(employees)
                .mapToInt(e->e.getSalary())
                .sum();
        System.out.printf("java8 sum3 總薪資 : %d\n",sum3);
        //Java8使用方法參考
        int sum4 = Stream.of(employees).mapToInt(Employee::getSalary).sum();
        System.out.printf("java8 使用方法參考:: sum4 總薪資 : %d\n",sum4);
        //請問Manager總薪資(Salary)是多少
        //java7
        int sum5 = 0;
        for (Employee e : employees) {
//            System.out.println(e.getClass().getSimpleName());//getName()全名
            if (e.getClass().getSimpleName().equals("Manager")) {
                sum5 += e.getSalary();
            }
            if (e.getClass().getSimpleName().equals("Director")) {
                sum5 += e.getSalary();
            }
        }
        System.out.printf("Manager :java7 for-each sum5 總薪資 : %d\n",sum5);
        //java8
        int sum6 = Stream.of(employees)
             .filter(e->e.getClass().getSimpleName().equals("Manager")|| 
                   e.getClass().getSimpleName().equals("Director"))
                     .mapToInt(e->e.getSalary())
                      .sum();
        System.out.printf("Manager : java8 sum6 總薪資 : %d\n",sum6);
        //請問Manager總薪資(Salary)是多少 Part2  
        //利用instanceof運算子
        for (Employee e : employees) {
            
            System.out.println(e instanceof Manager);
        }
        int sum7 = Stream.of(employees)
                    .filter(e -> e instanceof Manager)
                    .peek(System.out::print)//可以窺視過濾的內容
                    .mapToInt(e->e.getSalary())
                    .peek(System.out::print)//可以窺視轉換的內容
                    .sum();
        //peek顯示目前的內容
        System.out.printf("Manager : java8 filter instanceof sum7 總薪資 : %d\n",sum7);
    }
}

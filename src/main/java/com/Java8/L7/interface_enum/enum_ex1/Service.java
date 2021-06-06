package com.Java8.L7.interface_enum.enum_ex1;


public class Service implements Some,Other{

    @Override
    public void execute() {
        System.out.println("execute()");
    }

    @Override
    public void doOther() {
        System.out.println("doOther()");
    }

    @Override
    public void doSome() {
        System.out.println("doOther()");
    }

    @Override
    public void doService() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

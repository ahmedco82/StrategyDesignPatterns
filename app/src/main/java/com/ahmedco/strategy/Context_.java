package com.ahmedco.strategy;

public class Context_ {

    private Strategy strategy;

     // ( new  OperationAdd() ){  ( new  OperationAdd() ){

    public Context_(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){

        return strategy.doOperation(num1, num2);
    }
}
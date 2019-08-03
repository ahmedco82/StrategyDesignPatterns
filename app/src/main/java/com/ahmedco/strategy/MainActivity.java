package com.ahmedco.strategy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Test1();
    }

    private void Test1(){

         //  https://www.tutorialspoint.com/design_pattern/strategy_pattern
         //  algorithm can be changed at run time
        Context_ context = new Context_(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10,5));
        context = new Context_(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10,5));
        context = new Context_(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10,5));

    }
}

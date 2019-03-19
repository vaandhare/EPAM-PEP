/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epam.excercise2;

/**
 *
 * @author Vaibhav Andhare
 */
public class Calculator {

    public int Addition(int num1, int num2){
        return num1 + num2;
    }
    public int Substraction(int num1, int num2){
        return num1 - num2;
    }
    public int Multiplication(int num1,int num2){
        return num1 * num2;
    }
    public int Division(int num1, int num2){
        if (num2 != 0) return num1 / num2;
        else return 0;
    }
}

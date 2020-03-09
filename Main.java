package com.company;



public class Main {

    public static void main(String[] args) {


        areaCalculation(1,5);



for (int i = -10; i < 50; i++) {
    System.out.println(areaCalculation(5,i));

        }




    }

    public static int areaCalculation (int num1, int num2){

        if (num1 < 1 || num2 < 1) {
            System.out.println("Invalid input");
        } else {

        int area = num1 * num2;

        System.out.println("Area of the shape is " + area); }

return -1;

    }



















}

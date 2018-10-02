package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double chieucao,cannang,BMI;
	    Scanner scanner = new Scanner(System.in);
        System.out.printf("nhap vao chieu cao:");
        chieucao = scanner.nextDouble();
        System.out.printf("nhap vao can nang:");
        cannang = scanner.nextDouble();
        BMI = cannang/Math.pow(chieucao,2);
        System.out.printf("%-20s%s\n","bmi","Interpretation");
        if(BMI<18.5){
            System.out.printf("%-20.2f%s",BMI,"Underweight");
        }
        if(BMI>=18.5&&BMI<25){
            System.out.printf("%-20.2f%s",BMI,"Normal");
        }
        if(BMI>=25&&BMI<30){
            System.out.printf("%-20.2f%s",BMI,"Overweight");
        }
        if(BMI>=30){
            System.out.printf("%-20.2f%s",BMI,"Obese");
        }

    }
}

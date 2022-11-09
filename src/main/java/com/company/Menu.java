package com.company;



import java.util.Scanner;

public class Menu {
    public void displayMenu(){
        System.out.println("Please Choose the type of calculation");
        System.out.println("1) Arithmetic operation " +
                "\n2) Exponential calculation" +
                "\n3) Square root calculation" +
                "\n4) Exit");

    }

    public void menuSelection(){
        Scanner scan1 = new Scanner(System.in);

        displayMenu();
        switch (scan1.nextInt()){
            case 1:
                ArithmeticOperation();
                break;
            case 2:
                ExponentialCalculation();
                break;
            case 3:
                SquareRootOperation();
                break;
            case 4:
                System.out.println("Exiting");
                System.exit(0);
                break;
        }
    }
    public void ArithmeticOperation(){
        String parameterInput;
        double a, b;
        double result = 0;
        System.out.println("You have chosen option 1, Arithmetic Operation!");
        System.out.println("Please choose your operator(ie. '+', '-', '*', '/')");
        Scanner scan = new Scanner(System.in);
        parameterInput = scan.nextLine();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type two parameters (ie. 'numbers')");
        a = sc.nextDouble();
        b = sc.nextDouble();

        if(parameterInput.equals("+")){
            System.out.print("Sum is equal to : " + add(a,b));
        }
        else if(parameterInput.equals("-")){

            System.out.println("Subtraction is equal to : " + sub(a,b));
        }
        else if(parameterInput.equals("*")){
            System.out.println("Multiplication is equal to : " + mul(a,b));
        }
        else if(parameterInput.equals("/") && ((a > 0 ) && (b > 0))){
            System.out.println("Division is equal to : " + div(a,b));
        }else if ((a == 0) || (b == 0) && parameterInput.equals("/")){
            System.out.println("Cannot divide by 0");
        }
    }
    public double add(double number1, double number2){
        return number1 + number2;
    }
    public double sub(double number1, double number2){
        return number1 - number2;
    }
    public double mul(double number1, double number2){
        return number1 * number2;
    }
    public double div(double number1, double number2){
        return number1 / number2;
    }

    public double exp(double number1, double number2){
        return Math.pow(number1, number2);
    }
    public double squareRoot(double number){
        return Math.sqrt(number);
    }
    public double ExponentialCalculation(){
        double a, b;
        double result;
        System.out.println("You have chosen option 2, Exponential Calculation!");
        System.out.println("Please type the Base parameter");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        System.out.println("Please type the Exponent parameter");
        b = sc.nextDouble();
        System.out.println(a + " Power of " + b +" is equal to : " + Math.pow(a,b));
        result = exp(a,b);
        return result;
    }
    public double SquareRootOperation(){
        double a;
        System.out.println("You have chosen option 3, Square Root Calculation!");
        System.out.println("Please type a parameter");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        System.out.println("Square Root of " + a +" is equal to : " + Math.sqrt(a));
        return squareRoot(a);
    }
}

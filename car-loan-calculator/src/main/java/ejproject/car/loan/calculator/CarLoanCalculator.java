package ejproject.car.loan.calculator;

import java.util.Scanner;

public class CarLoanCalculator {

    public static void main(String[] args) {
        Scanner carMakeModel = new Scanner(System.in);
        System.out.print("Car Make & Model: ");
        String car = carMakeModel.nextLine();
        
        Scanner carPrice = new Scanner(System.in);
        System.out.print("Price: Php ");
        double price = carPrice.nextDouble();
        
                
        
    }
}

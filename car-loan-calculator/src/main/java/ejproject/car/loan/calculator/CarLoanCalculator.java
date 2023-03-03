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
        
        Scanner downPayment = new Scanner(System.in);
        System.out.print("Price: Php ");
        double dp = downPayment.nextDouble();
        
        Scanner paymentTerms = new Scanner(System.in);
        System.out.print("Payment Terms in Months (12, 24, 36, 48, 60): ");
        int terms = paymentTerms.nextIntI();
        
        double calculation = ((price-dp) / terms);
        double secondCalculation = ((price - dp) / terms);
    }
}

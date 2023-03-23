package ejproject.car.loan.calculator;

import java.util.Scanner;

public class CarLoanCalculator {

    public static void main(String[] args) {
        Scanner stringInput = new Scanner(System.in);
        System.out.println("GET THE COMPUTATION OF YOUR DREAM CAR LOAN!");
        Scanner carMakeModel = new Scanner(System.in);
        System.out.print("Car Make & Model: ");
        String car = carMakeModel.nextLine();
        
        Scanner carPrice = new Scanner(System.in);
        System.out.print("Price: Php ");
        double price = carPrice.nextDouble();
        
        Scanner downPayment = new Scanner(System.in);
        System.out.print("DownPayment: Php ");
        double dp = downPayment.nextDouble();
        
        Scanner paymentTerms = new Scanner(System.in);
        System.out.print("Payment Terms in Months (12, 24, 36, 48, 60): ");
        int terms = paymentTerms.nextInt();
        
        double calculation = ((price - dp) / terms);
        double secondCalculation = ((price - dp) / terms);

        switch (terms) {
            case 12:
                System.out.println((("Php ") + ((calculation * 0.515) + secondCalculation)) + ((" is your monthly amortization for 12 months or 1 year for your ") + car));
                break;
            case 24:
                System.out.println((("Php ") + ((calculation * 0.1019) + secondCalculation)) + ((" is your monthly amortization for 24 months or 2 years for your ") + car));
                break;
            case 36:
                System.out.println((("Php ") + ((calculation * 0.1563) + secondCalculation)) + ((" is your monthly amortization for 36 months or 3 years for your ") + car));
                break;
            case 48:
                System.out.println((("Php ") + ((calculation * 0.218) + secondCalculation)) + ((" is your monthly amortization for 48 months or 4 years for your ") + car));
                break;
            default:
                break;
            case 60:
                System.out.println((("Php ") + ((calculation * 0.35) + secondCalculation)) + ((" is your monthly amortization for 60 months or 5 years for your ") + car));
        }
   }
}

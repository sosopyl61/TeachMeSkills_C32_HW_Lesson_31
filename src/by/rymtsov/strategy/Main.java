package by.rymtsov.strategy;

import by.rymtsov.strategy.impl.FixedDiscount;
import by.rymtsov.strategy.impl.PercentageDiscount;
import by.rymtsov.strategy.impl.PermanentCustomerDiscount;
import by.rymtsov.strategy.service.PriceCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy fixedStrategy = new FixedDiscount();
        DiscountStrategy percentageStrategy = new PercentageDiscount();
        DiscountStrategy permanentCustomerStrategy = new PermanentCustomerDiscount(5);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the price: ");
            int price = scanner.nextInt();
            System.out.println("Price with fixed discount: " + PriceCalculator.calculatePrice(price, fixedStrategy));
            System.out.println("Price with percentage discount: " + PriceCalculator.calculatePrice(price, percentageStrategy));
            System.out.println("Price with permanent customer discount: " + PriceCalculator.calculatePrice(price, permanentCustomerStrategy));
        }
    }
}
package by.rymtsov.strategy.service;

import by.rymtsov.strategy.DiscountStrategy;

public class PriceCalculator {
    public static double calculatePrice(double price, DiscountStrategy discountStrategy) {
        return price - discountStrategy.getDiscountFromPrice(price);
    }
}

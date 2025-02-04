package by.rymtsov.strategy.impl;

import by.rymtsov.strategy.DiscountStrategy;

public class FixedDiscount implements DiscountStrategy {
    @Override
    public double getDiscountFromPrice(double price) {
        return 5;
    }
}

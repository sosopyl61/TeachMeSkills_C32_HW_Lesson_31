package by.rymtsov.strategy.impl;

import by.rymtsov.strategy.DiscountStrategy;

public class PercentageDiscount implements DiscountStrategy {
    @Override
    public double getDiscountFromPrice(double price) {
        return price * 0.15;
    }
}

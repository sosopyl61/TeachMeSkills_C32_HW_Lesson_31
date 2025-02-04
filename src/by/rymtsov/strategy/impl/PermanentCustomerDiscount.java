package by.rymtsov.strategy.impl;

import by.rymtsov.strategy.DiscountStrategy;

public class PermanentCustomerDiscount implements DiscountStrategy {

    private int yearsWithCompany;

    public PermanentCustomerDiscount(int yearsWithCompany) {
        this.yearsWithCompany = yearsWithCompany;
    }

    @Override
    public double getDiscountFromPrice(double price) {
        return 0.05 * yearsWithCompany * price;
    }
}

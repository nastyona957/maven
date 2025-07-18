package org.example;

public class BonusService {
    public long calculate(long amount, boolean registered) {
        int percet = registered ? 3 : 1;
        long bonus = amount * percet / 100;
        long limit = 500;
        if(bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}
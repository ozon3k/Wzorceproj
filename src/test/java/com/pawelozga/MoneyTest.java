package com.pawelozga;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MoneyTest {


    Money money;


    @BeforeEach
    public void setup(){

        money = new Money(50.0f, Money.Currency.EUR);

    }




    @Test
    void getCurrency() {

    }

    @Test
    void toStringTest() {
        Assertions.assertEquals("EUR 50.0", money.toString());
    }
}
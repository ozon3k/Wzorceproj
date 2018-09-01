package com.pawelozga;

public class Money {

    public enum Currency {
        PLN, USD, EUR, CZK, GBP
    }

    ;

    private float kwota;

    private Currency currency;


    public Money(float kwota, Currency currency) {
        this.kwota = kwota;
        this.currency = currency;
    }

    public float getKwota() {
        return kwota;
    }

    public void setKwota(float kwota) {
        this.kwota = kwota;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o){

        if (o instanceof Money){
            Money moneyToEqual = (Money) o;

            if (moneyToEqual.getCurrency().equals(this.getCurrency())){
                if(moneyToEqual.getKwota() == this.getKwota()){return true;}else{return false;}
            }
        }
        return false;
    }




    @Override
    public String toString() {
        return currency + " " + kwota;
    }
}

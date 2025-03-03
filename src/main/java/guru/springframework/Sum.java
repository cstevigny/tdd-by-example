package guru.springframework;

public class Sum implements Expression{
    Money augmend;
    Money addmend;

    public Sum(Money augmend, Money addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    public Money reduce(Bank bank, String toCurrency){
        int amount = this.augmend.amount + this.addmend.amount;
        return new Money(amount, toCurrency);

    }
}

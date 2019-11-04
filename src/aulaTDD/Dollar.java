package aulaTDD;

public class Dollar extends Money{
    Dollar(int amount) {
        super(amount);
     }
     Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
     }
     public boolean equals(Object object)  {
         Dollar dollar = (Dollar) object;
         return amount == dollar.amount;
     }
}
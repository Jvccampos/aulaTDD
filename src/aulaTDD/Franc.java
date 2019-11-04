package aulaTDD;

class Franc extends Money{   				
	Franc(int amount) {      
      super(amount);
    }					
    Franc times(int multiplier)  {      
       return new Franc(amount * multiplier);					
    }   
    public boolean equals(Object object) {					
       Franc franc = (Franc) object;      
       return amount == franc.amount;					
     }					
}

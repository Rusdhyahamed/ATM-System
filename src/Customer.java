/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Customer {
     String nic,name;
     double balance;
     int pin;  

    public Customer() {
    }


    public Customer(String nic, String name, double balance, int pin) {
        this.nic = nic;
        this.name = name;
        this.balance = balance;
        this.pin = pin;
    }

  

      public boolean withdraw(double amount)
      {
              if(this.balance-amount>=0)
              {
              this.balance-=amount;
              return true;
              
              }
              
              return false;
      
      }
     
     
    
      public void deposit(double amount)
      {
              this.balance+=amount;
       
      }

    public String getNic() {
        return nic;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    @Override
    public String toString() {
        return nic+";"+name+";"+ balance+";"+pin+ ";" ;
    }
      
      
      
      
     
     
     
}

package org.example;

public class AtmOperations1 implements AtmOperations{

      ATM atm=new ATM();
 int amount;
    @Override
    public void viewBalance() {
         atm .setBalance(atm.getBalance());
        System.out.println("your Account  Balance is  " + atm.getBalance());

    }

    @Override
    public void depositAmount(double amount) {

        atm.setBalance(atm.getBalance()+amount);
        viewBalance();
    }


    @Override
    public void withdrawAmount(double amount) {
 atm.setBalance(atm.getBalance()-amount);
  viewBalance();
    }}




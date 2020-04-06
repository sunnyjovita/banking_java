package com.company;

public class Bank_driver {
    public static void main(String args[]){
       Bank_account a1 = new Bank_account(10000);
       Bank_account a2 = new Bank_account(20000);
       Bank_customer c1 = new Bank_customer("Sunny", "Jovita");
       Bank_bank b1 = new Bank_bank("Hello Bank");
       System.out.println(b1.toString());
       b1.addCustomer("Hanita", "Metta");
       c1.setAccount(a1);
       System.out.println(c1.toString());
       System.out.println(b1.getNumberofCustomers());
       
    }
}

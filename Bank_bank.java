package com.company;

public class Bank_bank {
    private Bank_customer[] customers = new Bank_customer[100];
    private int NumberofCustomers;
    private String bankName;

    public Bank_bank(String bname){
        this.bankName = bname;
    }

    public Bank_bank(String bname, Bank_customer customers){
        this.bankName = bname;
        this.customers[0] = customers;
    }

    public void addCustomer(String f, String l){
        int i = NumberofCustomers++;
        customers[i] = new Bank_customer(f,l);
    }

    public int getNumberofCustomers(){
        return NumberofCustomers;
    }

    public Bank_customer getCustomer(int index){
        return this.customers[index];
    }

    @Override
    public String toString() {
        return "Bank name: " + this.bankName + ", " + getNumberofCustomers() + ", " +getCustomer(getNumberofCustomers()) ;
    }
}

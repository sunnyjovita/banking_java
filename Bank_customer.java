package com.company;

public class Bank_customer {
    private String firstname;
    private String lastname;
    private Bank_account account;

    public Bank_customer(){
    }

    public Bank_customer(String f, String l){
        this.firstname = f;
        this.lastname = l;
    }

    public Bank_customer(String f, String l, Bank_account account){
        this.firstname = f;
        this.lastname = l;
        this.account= account;
    }

    public String getFirstname(){
        return this.firstname;
    }

    public String getLastname(){
        return this.lastname;
    }

    public Bank_account getAccount(){
        return account;
    }

    public void setAccount(Bank_account acct){
        this.account = acct;
    }

    @Override
    public String toString() {
        return "Name: " + this.firstname + " " + this.lastname + ", "+ account.toString();
    }
}

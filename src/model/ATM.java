package model;

public class ATM {

    public static void main(String args[]){

        BankAccount account = new BankAccount();
        BankCustomer customer = new BankCustomer(account);
        Thread wife = new Thread(customer);
        Thread husband = new Thread(customer);

        wife.setName(" Kavindi");
        husband.setName(" Ruvini");

        wife.start();
        husband.start();
    }
}

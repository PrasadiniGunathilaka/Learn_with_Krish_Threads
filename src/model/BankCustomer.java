package model;

public class BankCustomer implements Runnable{

    private BankAccount account;

    public BankCustomer(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {

        for(int i = 1; i<10; i++){

            withdraw(5000);
            if(account.getBalance()>=0){
                System.out.println("Out of Cash");
            }
        }

    }

    private synchronized void withdraw(int amount){

        if(account.getBalance() >= amount){
            System.out.println(Thread.currentThread().getName()+ " " + amount);

            try{
                Thread.sleep(2000);
                account.setBalance(amount);
                System.out.println(Thread.currentThread().getName() + " " +amount+ " Remain : "+account.getBalance());
            }catch (InterruptedException e) {

                System.out.println("Server Error , Thank you");
            }
            } else{
                System.out.println("Your balance is less than you request");

        }
    }
}


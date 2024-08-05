package entities;

public class BankAccount {

    private String ownerName;
    private int countNumber;
    private double balance;

    // Construtor
    public BankAccount() {
        this.countNumber = generateAccountNumber();
        this.balance = 0.0;
    }

    // Getter e Setter para ownerName
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Getter para countNumber
    public int getCountNumber() {
        return countNumber;
    }

    // Getter para balance
    public double getBalance() {
        return balance;
    }

    // Método para depositar dinheiro
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    // Método para sacar dinheiro
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    // Método para gerar um número de conta aleatório
    private int generateAccountNumber() {
        return (int) (Math.random() * 10000);
    }
}

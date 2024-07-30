package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;
    public double percentage;

    public double netSalary() { //os parenteses indicam que isso é um método e pode receber um parâmetro
        double tx = grossSalary - tax;
        return tx;
    }

    public double increaseSalary() {
        double countP = grossSalary + (grossSalary * percentage/1000);
        return countP;
    }
}

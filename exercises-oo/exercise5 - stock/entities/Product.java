package entities;

public class Product {

    public String name;
    public double price;
    public int    quantity;

    public Product(String name, double price, int quantity) { //construtor, aqui não é definido um 'tipo'
        this.name     = name; //o this é utilizado para 'name' não se referenciar ao parâmetro acima, e sim ao atributo do próprio objeto
        this.price    = price; //diz que o atributo da classe recebe o parâmetro declarado no construtor
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return    name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
        //com o 'this', eu uso o atributo da classe, e não o parâmetro
        //estou somando o valor da variável 'quantity' + o valor do parâmetro que o usuário adicionou
    }

    public void removeProdutcts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name;
    }
}
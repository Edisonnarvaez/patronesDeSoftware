package pizzeria;

public class PizzaBocadillo implements PreparaPizza {

    private final PreparaPizza pizza;


    public PizzaBocadillo(PreparaPizza pizza) {
        this.pizza = pizza;
    }

    //public void construirPizza(PreparaPizza pizza) {
    @Override
    public void construirPizza() {
        this.pizza.construirPizza();
        System.out.println("Agregar Bocadillo");


    }

    @Override
    public double cost() {
        return pizza.cost() + 3000;
    }
}


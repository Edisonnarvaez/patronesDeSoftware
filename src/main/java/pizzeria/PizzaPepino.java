package pizzeria;

public class PizzaPepino implements PreparaPizza {

    private final PreparaPizza pizza;

    public PizzaPepino(PreparaPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void construirPizza() {
        this.pizza.construirPizza();
        System.out.println("Agregar Pepino");


    }

    @Override
    public double cost() {
        return pizza.cost() + 1000;
    }
}


package pizzeria;

public class PizzaJamon implements PreparaPizza {

    private final PreparaPizza pizza;

    public PizzaJamon(PreparaPizza pizza) {
        this.pizza = pizza;
    }

    //public void construirPizza(PreparaPizza pizza) {
    @Override
    public void construirPizza() {
        this.pizza.construirPizza();
        System.out.println("Agregar Jamon");


    }

    @Override
    public double cost() {
        return pizza.cost() + 2000;
    }
}


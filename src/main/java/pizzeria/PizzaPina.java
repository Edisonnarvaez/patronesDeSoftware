package pizzeria;

public class PizzaPina implements PreparaPizza {

    private final PreparaPizza pizza;

    public PizzaPina(PreparaPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void construirPizza() {
        this.pizza.construirPizza();
        System.out.println("Agregar Pina");


    }

    @Override
    public double cost() {
        return pizza.cost() + 1500;
    }
}


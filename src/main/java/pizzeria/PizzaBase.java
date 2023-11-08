package pizzeria;

public class PizzaBase implements PreparaPizza {


    @Override
    public void construirPizza() {
        System.out.println(("Pizza de queso"));

    }

    @Override
    public double cost() {
        return 5000;
    }
}


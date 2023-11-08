package pizzeria;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenidos a la Pizzeria Rica Pizza ");
        System.out.println("El valor de la Pazza basica con queso es de $ 5000 ");
        System.out.println("y el valor de los ingredientes son los siguientes: ");
        System.out.println(" Pepino : $ 1000" + " Jamon : $ 2000" + " Pina : $ 1500" + " Bocadillo : $ 3000");

        PuntosFidelizacion puntosFidelizacion = PuntosFidelizacion.getInstance();

        // Crear una pizza base
        PizzaBase pizzaBase = new PizzaBase();

        // Agregar ingredientes adicionales utilizando el patrón Decorator
        PizzaPepino conPepino = new PizzaPepino(pizzaBase);
        PizzaJamon conJamon = new PizzaJamon(conPepino);
        PizzaPina conPina = new PizzaPina(conJamon);
        PizzaBocadillo conBocadillo = new PizzaBocadillo(conPina);

        // Construir la pizza
        conBocadillo.construirPizza();

        // Calcular el costo de la pizza
        double costo = conBocadillo.cost();
        System.out.println("Costo de la pizza: $" + costo);

        // Acumular puntos de fidelización estos estan en relacion con el precio de la pizza
        puntosFidelizacion.acumularPuntos((int) costo);
        System.out.println("Puntos de fidelización acumulados: " + puntosFidelizacion.getPuntos());
    }

}
package cl.calculadora.java;

/**
 * Hola mundo!!!!! 
 * Versión: 1.0
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo!!");
        Core calculadora = new Core();
        System.out.println("1+2=" + String.format("%1$,.2f", calculadora.Suma(1, 2)));
        System.out.println("1-2=" + String.format("%1$,.2f", calculadora.Resta(1, 2)));
        System.out.println("10x2=" + String.format("%1$,.2f", calculadora.Multiplica(10, 2)));
        System.out.println("10/2=" + String.format("%1$,.2f", calculadora.Divide(10, 2)));

    }
}

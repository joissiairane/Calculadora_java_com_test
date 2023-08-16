/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package calculatorwithtest;

public class App {
	
    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("N�o � poss�vel dividir por zero.");
        }
        return (double) a / b;
    }
}



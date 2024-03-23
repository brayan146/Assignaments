package GenerateNumbers;

public class Printer {
    GenerateNumbers generateNumbers = new GenerateNumbers();
    ClasificadorPares clasificadorPares = new ClasificadorPares();

   /* todos los números
- solamente los pares
- solamente los impares
- solamente los multiplos de 5
            - solamente los multiplos de 7 */
    public void imprimir(){
        System.out.println("Todos los números: " +generateNumbers.printNumbers());

        System.out.println("Pares: " + clasificadorPares.clasificar(generateNumbers.generate(),2));

    }
}

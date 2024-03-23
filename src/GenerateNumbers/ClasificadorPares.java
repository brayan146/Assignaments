package GenerateNumbers;

public class ClasificadorPares implements ClasificarNumeros {
    public int clasificar(int[] numeros, int x) {
        int numero = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % x == 0) {
                numero++;
            }
        }
        return numero;
    }
}

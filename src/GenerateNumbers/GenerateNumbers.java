package GenerateNumbers;

/*escribir un programa que genere 20 numero aleatoriamente y mostrarlos de la siguiente manera:
- todos los números
- solamente los pares
- solamente los impares
- solamente los multiplos de 5
- solamente los multiplos de 7
 */
public class GenerateNumbers implements Generate<int[]>{
    private int[] numbers = new int[20];


    @Override
    public int[] generate() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        return numbers;
    }

   public void setNumbers(int[] numbers){
        this.numbers = numbers;
    }

    public String printNumbers(){
        String result = "";
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i] + " ";
        }
        return result;
    }
    public int[] getNumbers(){
        return numbers;
    }
}

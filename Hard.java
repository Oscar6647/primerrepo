public class Hard {
     public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        System.out.println("Array inicial: ");
        printArray(numbers); 

        int total = sumArray(numbers); 
        System.out.println("La suma de los números es: " + total);

        int promedio = calculateAverage(numbers);
        System.out.println("El promedio es: " + promedio);

        int max = findMax(numbers);
        System.out.println("El número máximo es: " + max);
        
        int min = findMin(numbers);
        System.out.println("El número mínimo es: " + min);
    }

    public static int sumArray(int[] array) {
        int sum = 0;

        for (int i = 0; i <= array.length; i++) {
            sum += array[i];
            System.out.println("Sumando: " + array[i] + " -> Suma actual: " + sum);
        }

        return sum;
    }

    public static int calculateAverage(int[] array) {
        int sum = sumArray(array);
        return sum / array.length;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

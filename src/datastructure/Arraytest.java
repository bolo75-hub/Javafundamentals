package datastructure;

import java.util.Arrays;
import java.util.Random;

import oopmodeling.planet;

public class Arraytest {

	public static void main(String[] args) {

        // Ejemplo básico de intercambio vacío
        switchValues();

        // Array de nombres
        String[] names = { "Pablo", "Juan" };
        System.out.println(names[1]);

        // Ejemplo de objetos tipo Planet
        planet[] planets = { new planet(), new planet() };

        sumUp();

        // Crear un array de 1000 enteros
        int[] nums = new int[1000];
        System.out.println("La longitud del array de números es " + nums.length);

        initializeArray(nums);

        findMaxMin(nums);

        int[] scores = { 12, 34, 3423, 32 };
        switchValues(scores, 0, 2);
        switchValues(scores, 2, 9);   // índices fuera de rango → se ignora
        switchValues(scores, 20, 90); // índices fuera de rango → se ignora
        switchValues(null, 20, 90);   // null → se ignora

        incrementArrayValues();

        reverse(scores);

        System.out.println("Array scores invertido: " + Arrays.toString(scores));

        int[] sliced = slice(scores, 1, 3);
        System.out.println("Slice (1,3): " + Arrays.toString(sliced));

        
        slice(scores, 2, 10);
        slice(scores, 10, 0);
    }

    // ----- MÉTODOS -----

    /** Extrae una porción del array si los índices son válidos. */
	
	
    private static int[] slice(int[] arr, int start, int end) {

    	if(arr == null) {
    		return null;
        }
    	if(start < 0 || end < 0 || start >= arr.length || end >= arr.length) {
    }
    if(start > end) {
    	return null;
    }
    }
    
    
    
    
    
    
    
    
    
    /** Invierte el orden de los elementos de un array. */
    private static void reverse(int[] arr) {
        if (arr == null || arr.length == 0) return;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("Array invertido: " + Arrays.toString(arr));
    }

    private static void switchValues() {
        // método vacío (placeholder)
    }

    /** Intercambia dos valores en un array si los índices son válidos. */
    static void switchValues(int[] arr, int index1, int index2) {
        if (arr == null) return;
        if (index1 < 0 || index2 < 0) return;
        if (index1 >= arr.length || index2 >= arr.length) return;

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        System.out.println("Intercambiados valores en índices " + index1 + " y " + index2);
    }

    /** Suma los elementos del array y muestra resultados parciales. */
    private static void sumUp() {
        int[] scores = { 12, 34, 3423, 32 };

        System.out.println("Primer elemento: " + scores[0]);
        System.out.println("Segundo elemento: " + scores[1]);
        System.out.println("Tercer elemento: " + scores[2]);

        try {
            System.out.println(scores[3445]); // causará excepción
        } catch (Exception e) {
            System.out.println("Error: índice fuera de rango.");
        }

        int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
            System.out.println("Suma parcial = " + totalScore);
        }

        System.out.println("Suma total = " + totalScore);
    }

    /** Encuentra el valor máximo y mínimo de un array. */
    private static void findMaxMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            System.out.println("Array vacío o nulo.");
            return;
        }

        int max = nums[0];
        int min = nums[0];

        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
    }

    /** Incrementa los valores de un array de floats. */
    private static void incrementArrayValues() {
        float[] salaries = { 234.324f, 23423.23f, 324.3f, 32423.34f };

        System.out.println("Salarios originales: " + Arrays.toString(salaries));

        for (int i = 0; i < salaries.length; i++) {
            salaries[i] += 10;
        }

        System.out.println("Salarios incrementados: " + Arrays.toString(salaries));
    }

    /** Inicializa un array con números aleatorios. */
    private static void initializeArray(int[] nums) {
        if (nums == null) return;

        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(-100000, 10000000);
        }

        System.out.println("Array inicializado con valores aleatorios.");
    }
}
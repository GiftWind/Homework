import java.util.Random;

public class sorting {
    public static int ARRAY_SIZE = 10;
    private static int[] array = new int[ARRAY_SIZE];
    private static Random generator = new Random();

    public static void createArray() {
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = generator.nextInt(10000);
        }
    }

    public static void printArray() {
        for (int i = 0; i < ARRAY_SIZE - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[ARRAY_SIZE - 1]);
    }

    public static void sort(int[] input) {
    	int gap = input.length;
    	boolean swap = false;
    	float shrink = 1.3f;
    	while (gap > 1 || swap) {
    		if (gap > 1) 
    			gap = (int) (gap / shrink);
    		int i = 0;
    		swap = false;
    		while (i + gap < input.length) {
    			if (input[i] > input[i + gap]) {
    				int temp = input[i];
    				input[i] = input[i + gap];
    				input[i + gap] = temp;
    				swap = true;
    			}
    			i++;	
    		}
     	}
    }

    public static void main(String[] args) {
        createArray();
        printArray();
        sort(array);
        printArray();
    }
}

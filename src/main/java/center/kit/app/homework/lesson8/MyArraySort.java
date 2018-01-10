package center.kit.app.homework.lesson8;

public class MyArraySort {
    public static int[] bubleSort(int[] inputArray) {
        for (int i = inputArray.length - 1; i >= 2; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        return inputArray;
    }
}

public class InsertionSort {
    /**
     * Basic implementation of Insertion Sort.
     * Created by Leonardo Sampaio
     * @param vector
     */
    public static void sort(int[] vector){
        for(int j = 1; j < vector.length; j++){
            int key = vector[j];
            int i = j - 1;
            while(i >= 0 && vector[i] > key){
                vector[i + 1] = vector[i];
                i = i - 1;
            }
            vector[i + 1] = key;
        }
    }
}
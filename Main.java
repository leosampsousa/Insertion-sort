import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] vector = new int[]{4,1,3,2,16,9,10,14,8,7};
        InsertionSort.sort(vector);
        System.out.println(Arrays.toString(vector));
    }
}

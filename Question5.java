package bob.athangtraining.basicjava;

import java.util.Arrays;
public class Question5 {
    public static void main(String[] args) {
        int[] arr = {0, 3, 4, 0, 1, 2, 5, 0};
        System.out.println("Before: " + Arrays.toString(arr));
        Question5 q = new Question5();
        q.moveRight(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }

    private void moveRight(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                arr[counter++] = arr[i];
            }
        }
        for (int i = counter; i< arr.length; i++){
            arr[i]=0;
        }
    }
}
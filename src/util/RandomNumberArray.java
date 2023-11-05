package util;

import java.util.Random;

public class RandomNumberArray {
    public static int[] getArray(int array_length, int index_limit) {
        int[] array = new int[array_length];
        int random_number;
        boolean flag;
        Random random = new Random();
        
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        
        for (int i = 0; i < array.length; i++) {
            while(array[i] == -1) {
                flag = true;
                random_number = random.nextInt(index_limit);
                if(i == 0) {
                    array[i] = random_number;
                    break;
                }
                for (int j = 0; j < i; j++) {
                    if(array[j] == random_number) flag = false;
                }
                if(flag) array[i] = random_number;
            }
        }
        
        return array;
    }
}

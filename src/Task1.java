//посчитать количество true в массиве

public class Task1 {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for(int i = 0; i < arrayOfSheeps.length; i++) {
            if(arrayOfSheeps[i] != null && arrayOfSheeps[i])
                count++;
        }
        return count;
    }
}

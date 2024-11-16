
//Вы получаете массив чисел, возвращаете сумму всех положительных чисел.
// [1,-4,7,12] => 1 + 7 + 12 = 20


public class Task2 {
    public static int sum(int[] arr){
        int result =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                result +=arr[i];
            }
        }
        return result;
    }
}

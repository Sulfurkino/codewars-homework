//35231 => [1,3,2,5,3]
//перевернуть список чисел и сделать из него массив, сделал но при помощи ответов
public class Task3 {
    public static int[] digitize(long n) {
        String[] nums = new StringBuilder(String.valueOf(n)).reverse().toString().split("");
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = Integer.parseInt(nums[i]);
        }
        return result;

    }
}

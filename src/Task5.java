//вернуть сумму корней чисел в массиве
//[1, 2, 2] он должен вернуть 9, потому что 1^2+2^2+2^2=9.
public class Task5 {
    public static int squareSum(int[] n)
    {
        int result = 0;
        for (int i = 0; i < n.length; i++) {
            result += Math.pow(n[i],2 );
        }
        return result;
    }
}

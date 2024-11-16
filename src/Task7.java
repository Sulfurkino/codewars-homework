//вернуть негативное число
public class Task7 {
    public static int makeNegative(final int x) {
        int result = 0;
        if(x>0) {
            result = 0 - x;
        } else if (x<0 || x == 0) {
            result = x;
        }
        return result;
    }
}

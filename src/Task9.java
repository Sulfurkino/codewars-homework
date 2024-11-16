//равно ли кол-во x и o в строке, если да то true, если нету ни одного ни другого тоже true

//возник вопрос, один тест почему-то не решён
public class Task9 {
    public static boolean getXO (String str) {
        int counterO = 0;
        int counterX =0;


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x'){
                counterX ++;
            } else if (str.charAt(i) == 'o') {
                counterO ++;
            }
        }

        return counterX == counterO;
    }
}

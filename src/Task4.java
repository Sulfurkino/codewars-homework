//найти в списке слово игла и указать её индекс в массиве
//["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found the needle at position 5"

public class Task4 {
    public static String findNeedle(Object[] haystack) {
        int index = 0;
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i].equals("needle")) {
                index = i;
                break;
            }
        }


        return "found the needle at position"+""+index;
    }
}

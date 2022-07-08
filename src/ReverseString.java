import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        StringBuilder timeStr = new StringBuilder();
        String reversedStr = "";
        long measuredTime;
        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            reversedStr = reverse(str);
            if (i == 999 || i == 9999 || i == 99999) {
                measuredTime = System.nanoTime();
                timeStr.append(measuredTime - startTime);
                timeStr.append(" ");
            }
        }

        System.out.println(str + " " + reversedStr + " " + timeStr);
    }

    static String reverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}

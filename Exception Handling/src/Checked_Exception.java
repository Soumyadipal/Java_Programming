import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Checked_Exception {
    public static void main(String[] args) {
        int result = 8 / 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

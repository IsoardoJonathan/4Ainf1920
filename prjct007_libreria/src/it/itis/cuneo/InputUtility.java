import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputUtility {

    private static InputStreamReader r = new InputStreamReader(System.in);
    private static BufferedReader br = new BufferedReader(r);

    public static String inputString(String outStr){
        String input = null;

        System.out.print(outStr);
        try {
            input = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }


    public static int inputInteger(String outStr){
        int input = 0;

        System.out.print(outStr);
        try {
            input = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }



    public static double inputDouble(String outStr){
        double input = 0;

        System.out.print(outStr);
        try {
            input = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }


    public static float inputFloat(String outStr) {
        float input = 0;

        System.out.print(outStr);
        try {
            input = Float.parseFloat(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }

}

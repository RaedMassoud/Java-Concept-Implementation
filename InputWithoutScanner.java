import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputWithoutScanner {

    public static void main(String [] a) throws IOException {

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine());

        bf.close();

        ///////////////////////////////

        /* The advantage of creating the buffered Reader inside the try block is
        that it will close the resource by itself */
        // Try with resources
        try(BufferedReader br0 = new BufferedReader(new InputStreamReader(System.in)))
        {
            num = Integer.parseInt(br0.readLine());
            System.out.println(num);
        }
    }
}

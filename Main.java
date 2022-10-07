import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        linear test = new linear(150);
        for (int i = 0; i < 150; ++i) {
            test.insert(i);
        }
        int pass =0;

        for (int i = 0; i < 150; ++i) {
            if(test.search(i)!=-1) ++pass;
        }
        System.out.println(pass);

    }
}
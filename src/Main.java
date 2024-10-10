
public class Main {
    public static void main(String[] args) {

       M1:
        for (int i = 3, j = 0; i > 0 ; i -- ) {
            M2:
            for ( ; j < 3 ; j++ ) {
                System.out.println(i + "" + j);
                if (j==0) continue M1;
            }
        }

    }
}
import java.util.*;

public class Al01Seq {
    static public void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        int start = sca.nextInt();
        int end = sca.nextInt();
        
        sca.close();

        int max = 0;

        for( int i=start ; i<=end ; i++ ) {
            int temp = seq(i, 0);
            max = temp > max ? temp : max;
        }

        System.out.println(start + " " + end + " " + max);
    }

    static public int seq(int num, int count) {
        if ( num == 1 ) {
            return count+1;
        } else if( (num % 2) == 0 ) {
            return seq((num/2), count+1);
        } else {
            return seq((num * 3 + 1), count+1);
        }
    }
}
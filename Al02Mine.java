import java.util.*;

public class Al02Mine {
    private static char[][] mineMap = null;
    //private static List<char[][]> mapList = new ArrayList<char[][]>();

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        int x = sca.nextInt();
        int y = sca.nextInt();
        sca.nextLine();

        mineMap = new char[x][y];
        char[][] resMap = new char[x][y];

        for( int i=0 ; i<y ; i++ ) {
            String str = sca.nextLine();
            for( int j=0 ; j<x ; j++ ) {
                mineMap[j][i] = str.charAt(j);
            }
        }

        for( int i=0 ; i<y ; i++ ) {
            for( int j=0 ; j<x ; j++ ) {
                if( '*' != mineMap[j][i] ) {
                    int count = 0;

                    if( checkMine(j-1, i-1) ) count++;
                    if( checkMine(j-1, i) ) count++;
                    if( checkMine(j-1, i+1) ) count++;
                    if( checkMine(j, i-1) ) count++;
                    if( checkMine(j, i+1) ) count++;
                    if( checkMine(j+1, i-1) ) count++;
                    if( checkMine(j+1, i) ) count++;
                    if( checkMine(j+1, i+1) ) count++;

                    resMap[j][i] = Character.forDigit(count, 10);
                } else {
                    resMap[j][i] = '*';
                }
            }
        }
        
        System.out.println("\nResult :");
        for( int i=0 ; i<y ; i++ ) {
            for( int j=0 ; j<x ; j++ ) {
                System.out.print(resMap[j][i]);
            }
            System.out.println();
        }
        
        sca.close();
    }

    public static boolean checkMine(int x, int y) {
        if( x < 0 || y < 0 || x >= mineMap.length || y >= mineMap[0].length )
            return false;
        else {
            if( '*' == mineMap[x][y] )
                return true;
            else
                return false;
        }
    }
}
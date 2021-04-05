/*
    File `TwoDAgain.java`
*/
class TwoDAgain {
    public static void main(String args[]) {
        int twoD[][] = new int[4][];

        for (int i = 0; i < 4; ++i)
            twoD[i] = new int[i + 1];
        
        int k = 0;
        for (int i = 0; i < 4; ++i) 
            for (int j = 0; j < i + 1; ++j)
                twoD[i][j] = k++;

        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < i + 1; ++j)
                System.out.print(twoD[i][j] + " ");

            System.out.println();
        }    
    }
}

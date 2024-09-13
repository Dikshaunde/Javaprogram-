public class SimplePattern {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                // Use (i + j) % 2 to alternate between 1 and 0
               if (i % j == 0 ) {
                   if(i < 3) { System.out.print((i+j-1 ) %2    + " ");}
                   else { System.out.print((i+j ) %2    + " ");}
               
            } else {
                System.out.print((i + j)%2   + " ");
            } 
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

/*import java.util.*;

class SodokuTest {
	public static void main(){
		Scanner scan = new Scanner( System.in );
		
		System.out.print( "Enter a file: ");
		String filename = scan.next();
	}
}*/

import java.util.*;

class SudokuTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a filename: ");
        String filename = scan.next();

        SimpleSudoku s = new SimpleSudoku(filename);
        s.solve();
        s.print();
    }
}
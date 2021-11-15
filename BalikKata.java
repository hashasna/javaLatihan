
import java.util.Scanner;

public class BalikKata {
    public static void main(String[] args) {
        //program text terbalik
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan text : ");
	      String textDibalik = in.nextLine();
        balikText(textDibalik); 
    }
	public static String balikText(String text) {
		String textTerbalik = "";
		//System.out.println(textTerbalik);
		int length = text.length();
		for(int i= length; i > 0; i--) {
			String s = text.substring(i-1,i);
			textTerbalik = textTerbalik + s;
			 //System.out.println(textTerbalik);
		}	
    System.out.println(textTerbalik);
		return textTerbalik;
		
	}
}

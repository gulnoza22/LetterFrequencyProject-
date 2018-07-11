package letters;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		LetterFrequency lf = new LetterFrequency("test5.txt");
		System.out.println("Words:\n" + lf);
		ArrayList<Integer> letterFreq  = lf.freq();
		System.out.println("Frequency:");
		int i = 0; 
		for(Integer f: letterFreq){
			System.out.println((char)(i+97) + ":" + f);
			//System.out.println( f);
			i++;
		}
		
	}

}

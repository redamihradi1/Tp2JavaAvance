package pk1;

import java.util.Arrays;
import java.util.Iterator;

public class Sequence {
	private int[] array;
	  
	
	private class SubSequence{
		public SubSequence(int lenght) {
			if(lenght <=0)throw
			new IllegalArgumentException("la taille doit etrte strictement positf");
			array = new int[lenght];
			
			for(int i=0;i<array.length;i++) {
				array[i]= (int)(Math.random()*1000);
			}
		}
		
		public int intAt(int index) {
			if(index < 0 || index >= array.length) 
				throw new IllegalArgumentException();
			return array[index];
		}
		
		public void afficher() {
			System.out.println(Arrays.toString(array));
			
		}
	}
	public static void main(String[] args) {
		Sequence sequence = new Sequence();
		Sequence.SubSequence subSequence = sequence.new SubSequence(10);
		
		subSequence.afficher();
		System.out.println(subSequence.intAt(2));
	}

}

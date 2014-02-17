package basisaufgaben;

import de.tudarmstadt.gdi1.project.alphabet.Alphabet;
import java.util.*;

public class basicalphabet implements Alphabet {
	
	private char[] characters = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l'};
	
	@Override
	public int getIndex(char chr){
		return characters.binarySearch(chr);
	}
	
	@Override
	public char getChar(int index){
		return characters[index];
		
	}
	
	@Override
	public int size(){
		return characters.length;
		
	}
	
	@Override
	public boolean contains(char chr){
		
	}
	
	@Override
	public boolean allows(String word){
		
	}
	@Override
	public String normalize(String input){
		
	}
	
	@Override
	public char[] asCharArray(){
		
	}

}

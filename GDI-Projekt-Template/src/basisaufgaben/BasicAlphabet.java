package basisaufgaben;

import de.tudarmstadt.gdi1.project.alphabet.Alphabet;

import java.util.*;

public class BasicAlphabet implements Alphabet {
	
	private char[] characters = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l'};
	
	@Override
	public int getIndex(char chr){
		return Arrays.binarySearch(characters, chr);
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
		boolean result=false;
		for (int i=0; i<=characters.length-1; i++){
			if (chr==characters[i]) result=true;}
		return result;
		
	}
	
	@Override
	public boolean allows(String word){
		boolean result=true;
		for (int i=0; i<=word.length()-1; i++){
			if (contains(word.charAt(i))==false) result=false;}
		return result;	
	}
	
	@Override
	public String normalize(String input){
		input=input.toLowerCase();
		String result="";
		for (int i=0; i<=input.length()-1; i++){
			if (contains(input.charAt(i))==true) result=result+input.charAt(i);}
		return result;	
	}
	
	@Override
	public char[] asCharArray(){
		return characters;
	}

	@Override
	public Iterator<Character> iterator() {
		return null;
	}
	
	

}
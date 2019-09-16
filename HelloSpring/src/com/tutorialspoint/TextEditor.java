package com.tutorialspoint;

public class TextEditor {
	private SpellChecker spellChecker;
	
	public TextEditor(SpellChecker spellChecker) {
		// TODO Auto-generated constructor stub
		System.out.println("Inside TextEditor constructor." );
	    this.spellChecker = spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}

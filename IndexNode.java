/*
 * Author: Colin Harker
 * Phone: (215)534-1817
 * Email: Colinharker55@gmail.com
 */
package trees;

/**
 *
 * @author Colin
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IndexNode  {

	// The word for this entry
	String word;
	// The number of occurrences for this word
	int occurences;
	// A list of line numbers for this word.
	List<Integer> list; 
	
	
	IndexNode left;
	IndexNode right;
	
	
	// Constructors
	// Constructor should take in a word and a line number
	// it should initialize the list and set occurrences to 1
	
	public IndexNode(String word, int line){
            list = new LinkedList<>();
            list.add(line);
            this.word = word;
            occurences = 1;         
        }
	
	
	// Complete This
	// return the word, the number of occurrences, and the lines it appears on.
	// string must be one line
	
        @Override
	public String toString(){
		return String.format("%16s occurs %-4s times and appears on line(s) %s", word, occurences, list);
	}
	
	
	
}


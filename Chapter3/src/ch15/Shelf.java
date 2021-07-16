package ch15;

import java.util.ArrayList;

public class Shelf {

	protected ArrayList<String> shelf;
	 
	 public Shelf() {
		 shelf = new ArrayList<String>();
	 }
	 
	 public ArrayList<String> getShelf(){
		 return shelf;
	 }
	 
	 public int getCount() { //물건의 개수를 반환
		 return shelf.size();
	 }

}

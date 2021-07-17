package ch13;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		//String 클래스는 이미 Comprable 인터페이스가 구현되어 있으므로 오름차순으로 정렬되어 출력됨
		for(String str : treeSet) {
			System.out.println(str);
		}
		
		/*
		 * TreeSet 클래스 활용하기
			객체의 정렬에 사용하는 클래스
			Set 인터페이스를 구현하여 중복을 허용하지 않고, 오름차순이나 내림차순으로 객체를 정렬할 수 있음
			내부적으로 이진검색트리(binary search tree)로 구현됨
			이진검색트리에 저장하기 위해 각 객체를 비교해야 함
			비교 대상이 되는 객체에 Comparable이나 Comparator 인터페이스를 구현 해야 TreeSet에 추가 될 수 있음
			String, Integer등 JDK의 많은 클래스들이 이미 Comparable을 구현했음
		 */

	}

}

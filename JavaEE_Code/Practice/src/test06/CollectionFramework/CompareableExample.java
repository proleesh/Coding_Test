package test06.CollectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class CompareableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("이지은", 35));
		treeSet.add(new Person("김수로", 25));
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ": " + person.age);
		}
		
	}

}

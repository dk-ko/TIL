package practice;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{
	// 비교 방법이 여러개라면 따로 클래스를 구성하는게 낫다.
	// 비교하는 경우 Comparator interface를 implements해 구현하는 것이 바람직.
	// java 표준라이브러리에 이미 구현된 정렬 메소드나 이진 탐색 메소드에서 객체를 비교할 때
	// Comparator Interface를 구현한 클래스 객체를 요구하기 때문 
	
	public enum Compare { BY_NAME_ASC, BY_NAME_DESC, BY_AGE_ASC, BY_AGE_DESC};
	private Compare compare;
	
	public PersonComparator(Compare compare){
		this.compare = compare;
	}
	
	@Override
	public int compare(Person p1, Person p2){
		if(p1 == p2) return 0;
		if(p1 == null) return -1;
		if(p2 == null) return 1;
		
		switch(compare){
		case BY_NAME_ASC: return p1.getName().compareTo(p2.getName());
		case BY_NAME_DESC: return p2.getName().compareTo(p1.getName());
		case BY_AGE_ASC: return p1.getAge() - p2.getAge();
		case BY_AGE_DESC: return p2.getAge() - p1.getAge();
		}
		
		return 0;
	}

}

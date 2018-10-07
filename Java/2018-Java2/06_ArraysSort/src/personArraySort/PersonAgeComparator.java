package personArraySort;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person>{
	@Override
	public int compare(Person p1, Person p2){
		int r = p1.age - p2.age; // 나이를 비교 
		if( r != 0) return r; // 나이가 같지 않으면 비교 결과 리턴 
		return p1.name.compareTo(p2.name); // 나이가 같으면 이름 비교 결과 리턴 
	}

}

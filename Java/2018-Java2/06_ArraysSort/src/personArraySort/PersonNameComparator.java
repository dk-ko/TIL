package personArraySort;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person>{
	@Override
	public int compare(Person p1, Person p2){
//		int r = p1.name.compareTo(p2.name); // 이름 비교 
//		if(r != 0) return r; // 이름이 같지 않으면 , 이름 비교 결과 리턴 
//		return p1.age - p2.age; // 이름이 같으면, 나이 비교 결과 리턴
		
		int r = p2.name.compareTo(p1.name); // 이름 비교 
		if(r != 0) return r; // 이름이 같지 않으면 , 이름 비교 결과 리턴 
		return p1.age - p2.age; // 이름이 같으면, 나이 비교 결과 리턴

	}

}

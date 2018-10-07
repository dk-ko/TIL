package personArraySort;

import java.util.Arrays;

public class PersonArrayLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] p = new Person[] {
				new Person("홍길동", 18),
				new Person("임꺽정", 22),
				new Person("전우치", 23)
		};
//		
//		Arrays.sort(p);
//		System.out.println(Arrays.toString(p));
		
		Arrays.sort(p, new PersonNameComparator());
		System.out.println(Arrays.toString(p));
		
		Arrays.sort(p, new PersonAgeComparator());
		System.out.println(Arrays.toString(p));
	}

}

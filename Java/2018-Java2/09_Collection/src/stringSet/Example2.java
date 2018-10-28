package stringSet;

import java.util.TreeSet;

class StringSet2 extends StringSet1 {
	TreeSet<String> list = new TreeSet<String>();
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringSet2 A = new StringSet2();
		for(int i=0; i<20; ++i){
			String s = String.format("%02d", i);
			A.add(s);
		}
		Example1.print("A", A);
		
		StringSet2 B = new StringSet2();
		for(int i=0; i<20; i+=2){
			String s = String.format("%02d", i);
			B.add(s);
		}
		Example1.print("B", B);
		
		StringSet2 C = new StringSet2();
		for(int i=0; i<20; i+=3){
			String s = String.format("%02d", i);
			C.add(s);
		}
		
		Example1.print("A 합집합 B", A.union(B));
		Example1.print("A 교집합 B", A.intersection(B));
		Example1.print("A 합집합 C", A.union(C));
		Example1.print("A 교집합 C", A.intersection(C));
		Example1.print("B 합집합 C", B.union(C));
		Example1.print("B 교집합 C", B.intersection(C));
		Example1.print("A 차집합 B", A.difference(B));
	}

}

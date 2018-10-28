package stringSet;

import java.util.ArrayList;
import java.util.Arrays;

class StringSet1 {
	ArrayList<String> list = new ArrayList<String>();
	
	public void add(String s) {
		list.add(s);
	}
	
	public void remove(String s){
		list.remove(s);
	}
	
	public boolean contains(String s) {
		return list.contains(s);
	}
	
	public StringSet1 union(StringSet1 set) {
		StringSet1 newSet = new StringSet1();
		newSet.list.addAll(this.list);
		newSet.list.removeAll(set.list);
		newSet.list.addAll(set.list);
		return newSet;
	}
	
	public StringSet1 intersection(StringSet1 set){
		StringSet1 newSet = new StringSet1();
		newSet.list.addAll(this.list);
		newSet.list.retainAll(set.list);
		return newSet;
	}
	
	public StringSet1 difference(StringSet1 set) {
		StringSet1 newSet = new StringSet1();
		newSet.list.addAll(this.list);
		newSet.list.removeAll(set.list);
		return newSet;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof StringSet1 == false) return false;
		StringSet1 set = (StringSet1) obj;
		return this.list.equals(set.list);
	}
	
	public String[] toArray() {
		return list.toArray(new String[0]);
	}
}

public class Example1 {

	static void print(String msg, StringSet1 set) {
		// TODO Auto-generated method stub
		String[] a = set.toArray();
		Arrays.sort(a);
		String temp = Arrays.toString(a);
		System.out.printf("%s: %s\n", msg, temp);	
	}
	
	public static void main(String[] args){
		StringSet1 A = new StringSet1();
		for(int i=0; i<20; ++i){
			String s = String.format("%02d", i);
			A.add(s);
		}
		print("A", A);
		
		StringSet1 B = new StringSet1();
		for(int i=0; i<20; i+=2){
			String s = String.format("%02d", i);
			B.add(s);
		}
		print("B", B);
		
		StringSet1 C = new StringSet1();
		for(int i=0; i<20; i+=3){
			String s = String.format("%02d", i);
			C.add(s);
		}
		print("C", C);
		
		print("A 합집합 B", A.union(B));
		print("A 교집합 B", A.intersection(B));
		print("A 합집합 C", A.union(C));
		print("A 교집합 C", A.intersection(C));
		print("B 합집합 C", B.union(C));
		print("B 교집합 C", B.intersection(C));
		print("A 차집합 B", A.difference(B));
	}

}

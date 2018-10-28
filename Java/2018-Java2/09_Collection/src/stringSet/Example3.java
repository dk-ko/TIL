package stringSet;

import java.util.Arrays;
import java.util.TreeSet;

class StringSet3 {
	TreeSet<String> list = new TreeSet<String>();
	
	public void add(String s) {
		list.add(s);
	}
	public void remove(String s){
		list.remove(s);
	}
	
	public boolean contains(String s) {
		return list.contains(s);
	}
	
	public StringSet3 union(StringSet3 set){
		StringSet3 newSet = new StringSet3();
		newSet.list.addAll(this.list);
		for(String s: set.list)
			if(newSet.contains(s) == false) newSet.add(s);
		return newSet;
	}
	
	public StringSet3 intersection(StringSet3 set){
		StringSet3 newSet = new StringSet3();
		for(String s: this.list)
			if(set.contains(s)) newSet.add(s);
		return newSet;
	}
	
	public StringSet3 difference(StringSet3 set){
		StringSet3 newSet = new StringSet3();
		for(String s:list)
			if(set.contains(s) == false) newSet.add(s);
		return newSet;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof StringSet3 == false) return false;
		StringSet3 set = (StringSet3) obj;
		return this.list.equals(set.list);
	}
	
	public String[] toArray() {
		return list.toArray(new String[0]);
	}
}

public class Example3 {
	static void print(String msg, StringSet3 set) {
		// TODO Auto-generated method stub
		String[] a = set.toArray();
		Arrays.sort(a);
		String temp = Arrays.toString(a);
		System.out.printf("%s: %s\n", msg, temp);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringSet3 A = new StringSet3(); 
		for (int i = 0; i < 20; ++i) {
			String s = String.format("%02d", i);
			A.add(s); 
		}
		print("A", A);
		
		StringSet3 B = new StringSet3(); 
		for (int i = 0; i < 20; i += 2) {
			String s = String.format("%02d", i);
			B.add(s); 
		}
		print("B", B);
		
		StringSet3 C = new StringSet3(); 
		for (int i = 0; i < 20; i += 3) {
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

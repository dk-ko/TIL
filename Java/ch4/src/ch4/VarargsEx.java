package ch4;

public class VarargsEx {
	String name;
	String age;
	
	VarargsEx(String ... person){
		name = person[0];
		age = person[1];
	}
	
	public void personPrint(String ... names){
		for (String name : names){
			System.out.print(name+"\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarargsEx va = new VarargsEx("Tom","25");
		System.out.println(va.name+"\t"+va.age+"\n");
		
		va.personPrint("dakyung");
		va.personPrint("a","b","c","d");
		
	}

}

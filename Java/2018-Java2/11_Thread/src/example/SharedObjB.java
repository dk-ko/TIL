package example;

public class SharedObjB extends SharedObjA{
	
	@Override
	synchronized void add(int i) {
		sum += i;
	}
}

package ch8;

public class ProducerConsumer {

	public static void main(String[] args) {
		Buffer b = new Buffer();
		Producer p = new Producer("Producer", b);
		Consumer c = new Consumer("Consumer", b);
		
		p.start();
		c.start();
	}
}

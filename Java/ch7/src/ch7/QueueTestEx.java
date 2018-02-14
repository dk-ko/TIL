package ch7;
import java.util.*;

public class QueueTestEx {

	public static void main(String[] args) {
		Queue<QueueDTO> waitQ = new LinkedList<>();
		
		waitQ.offer(new QueueDTO("입출금",1));
		waitQ.offer(new QueueDTO("대출",2));
		waitQ.offer(new QueueDTO("입출금",3));
		waitQ.offer(new QueueDTO("상담",4));
		
		while(waitQ.peek() != null){
			QueueDTO queue = waitQ.poll();
			switch(queue.operation){
				case "입출금":
					System.out.println(queue.number+"번 "+queue.operation+" 창구로 오세요");
					break;
				case "대출":
					System.out.println(queue.number+"번 "+queue.operation+" 창구로 오세요");
					break;
				default :
					System.out.println(queue.number+"번 "+queue.operation+" 창구로 오세요");
					break;
			}
		}
	}

}

class QueueDTO {
	public String operation;
	public int number;
	
	public QueueDTO(String operation, int number){
		this.operation = operation;
		this.number = number;
	}
}

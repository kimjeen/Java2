package pk26.arraylist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail","홍길동"));
		messageQueue.offer(new Message("sendSNS","임꺽정"));
		messageQueue.offer(new Message("sendKaKaotalk","홍두깨"));
		//empty : 비동기화를 제공하면서 비어있는 공간0으로 True값 반환
		//isEmpty : 동기화를 제공하여 null값 인지(즉 객체가 들어가 있으므로 비어있으면 null값으로 초기화됨.)
		
		
		//비어있지 않을때까지.
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
		switch (message.command) {
		case "sendMail":
			System.out.println(message.to +"님에게 메일을 보냅니다.");
			break;
		case "sendSNS":
			System.out.println(message.to +"님에게 SNS을 보냅니다.");
			break;
		case "sendKaKaotalk":
			System.out.println(message.to +"님에게 카톡을 보냅니다.");
			break;

		default:
			break;
		}
			
			
			
		}
		
		
	}

}

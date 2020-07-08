package pk26.arraylist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail","ȫ�浿"));
		messageQueue.offer(new Message("sendSNS","�Ӳ���"));
		messageQueue.offer(new Message("sendKaKaotalk","ȫ�α�"));
		//empty : �񵿱�ȭ�� �����ϸ鼭 ����ִ� ����0���� True�� ��ȯ
		//isEmpty : ����ȭ�� �����Ͽ� null�� ����(�� ��ü�� �� �����Ƿ� ��������� null������ �ʱ�ȭ��.)
		
		
		//������� ����������.
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
		switch (message.command) {
		case "sendMail":
			System.out.println(message.to +"�Կ��� ������ �����ϴ�.");
			break;
		case "sendSNS":
			System.out.println(message.to +"�Կ��� SNS�� �����ϴ�.");
			break;
		case "sendKaKaotalk":
			System.out.println(message.to +"�Կ��� ī���� �����ϴ�.");
			break;

		default:
			break;
		}
			
			
			
		}
		
		
	}

}

package test07.FIFO;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		/*
		 * Queue 인터페이스는 FIFO 자료구조에서 사용되는 메소드를 정의하고 있다.
		 */
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		//메시지 저장
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "이재용"));
		messageQueue.offer(new Message("sendKakaotalk", "카카오"));
		
		while(!messageQueue.isEmpty()) { //메시지 큐가 비었는지 확인
			Message message = messageQueue.poll(); //메시지 큐에서 한 개의 메시지 꺼냄
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카카오톡를 보냅니다.");
				break;
			}
		}
	}

}

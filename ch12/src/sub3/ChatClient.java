package sub3;

import java.net.Socket;

/*
 * 날짜: 2025/01/22
 * 이름: 변준영
 * 내용: 채팅 소켓 실습하기
 * 
 */
public class ChatClient {

	public static void main(String[] args) {
	
		System.out.println("[Client]");
		
		Socket socket= null;
		
		try {
		
			socket = new Socket("127.0.0.1",9001);
			
			Thread receiver = new ReceiverThread(socket);
			Thread sender = new SenderThread(socket);
			
			receiver.start();
			sender.start();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	//	System.out.println("Client 채팅 종료. . . ");
	}//main end
}

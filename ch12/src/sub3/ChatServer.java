package sub3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 날짜: 2025/01/22
 * 이름: 변준영
 * 내용: 채팅 소켓 실습하기
 * 
 */
public class ChatServer {

	public static void main(String[] args) {
		
		System.out.println("[Server]");
		
		ServerSocket serversocket = null;
		Socket socket= null;
		
		
		
		try {
			
			serversocket = new ServerSocket(9001);
			System.out.println("연결 대기. . .");
			socket= serversocket.accept();
			System.out.println("연결 수립. . .");
			
			Thread receiver= new ReceiverThread(socket);
			Thread sender= new SenderThread(socket);
			
			receiver.start();
			sender.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				serversocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
		System.out.println("Server 채팅 종료. . . ");
	}//main end
}

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter IP address:");
		String ip = sc.next();
		
		System.out.println("Enter port number:");
		int port = sc.nextInt();
		
		try(Socket Socket = new Socket(ip, port);
			InputStream is = Socket.getInputStream();
			OutputStream os = Socket.getOutputStream();
			){
			os.write(5);
			int response = is.read();
			System.out.println("Response from the server"+response);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
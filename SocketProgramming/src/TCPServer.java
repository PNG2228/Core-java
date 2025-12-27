import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.util.Scanner;

public class TCPServer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter port number:");
		int port = sc.nextInt();
		
		try(ServerSocket ss = new ServerSocket(port);
			java.net.Socket Socket = ss.accept();
			InputStream is = Socket.getInputStream();
			OutputStream os = Socket.getOutputStream();
			){
			int number = is.read();
			System.out.println("Data from the client: "+number);
			
			int fact = 1;
			for(int i=1;i<=number;i++) {
				fact *= i;
			}
			os.write(fact);
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}
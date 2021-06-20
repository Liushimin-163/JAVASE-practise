package Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8888);
        Socket socket=serverSocket.accept();
        InputStream inputStream=socket.getInputStream();
        byte[] data=new byte[1024];
        int len=-1;
        String str=new String(data,0,len);
        System.out.println(str);
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}

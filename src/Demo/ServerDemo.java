package Demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("server is running.");
        ServerSocket serverSocket=new ServerSocket(6666);
        Socket socket=serverSocket.accept();
        // Blocking phrase: waiting for client's reply.
        InputStream inputStream=socket.getInputStream();
        byte[] b=new byte[1024];
        int len=inputStream.read(b);
        String msg=new String(b,0,len);
        System.out.println("服务端接受信息...");
        System.out.println(msg);

        OutputStream outputStream=socket.getOutputStream();
        outputStream.write("已经收到信息".getBytes());
        outputStream.close();
       inputStream.close();
       socket.close();
       serverSocket.close();
    }


}


package Demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",6666);
        OutputStream outputStream=socket.getOutputStream();
        System.out.println("客户端启动信息...");
        outputStream.write("Hello".getBytes());
        //receive serverDemo's message.
        InputStream inputStream=socket.getInputStream();
        byte[] b=new byte[1024];
        int length=inputStream.read(b);
        String str=new String(b,0,length);
        System.out.println(str);


        outputStream.close();
        inputStream.close();
        socket.close();

    }
}

package Demo02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",7777);
        FileInputStream fileInputStream=new FileInputStream("Client\\logo2.png");
        OutputStream outputStream=socket.getOutputStream();

        //receive serverDemo's message.

        byte[] data=new byte[1024];
        int length=0;
        while( (length = fileInputStream.read(data))!=-1)
        {    outputStream.write(data,0,length);
            if(length<data.length){
            break;
        }

        }

        System.out.println("Client is waiting for response");
        InputStream socketInputStream=socket.getInputStream();
        byte[] socketData=new byte[1024];
        int socketLen=0;
        while((socketLen=socketInputStream.read(socketData))!=-1){
            String msg=new String(socketData,0,socketLen);
        }


        socketInputStream.close();
        outputStream.close();
        fileInputStream.close();
        socket.close();

    }
}

package Demo02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//图片上传
public class ServerDemo {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket=new ServerSocket(7777);
        Socket socket=serverSocket.accept();
        // Blocking phrase: waiting for client's reply.
        //创建输入流用于读取数据
        InputStream inputStream=socket.getInputStream();
        OutputStream outputStream=new FileOutputStream("Server\\newImg.png");

        byte[] b=new byte[1024];
        int len=-1;
        while((len=inputStream.read(b))!=-1){
            outputStream.write(b,0,len);
            if(len<b.length){
                break;
            }

        }


       OutputStream socketOutputStream= socket.getOutputStream();
        socketOutputStream.write("File upload successfully".getBytes());
        socketOutputStream.close();
        outputStream.close();
       inputStream.close();
       socket.close();
       serverSocket.close();
    }


}


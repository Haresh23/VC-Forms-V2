package VirtualCB;
import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Server
{
    public static void serverMethod()throws Exception
    {
            ServerSocket ss = new ServerSocket(7000);
            reg_details rd = new reg_details();
            System.out.println("Waiting");
            Socket s = ss.accept();
            System.out.println("Join");

    }
    public static void main(String[] args) throws Exception {
        serverMethod();
    }

}


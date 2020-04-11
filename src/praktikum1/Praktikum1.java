/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Thole
 */
public class Praktikum1 {

    /**
     * @param args the command line arguments
     * @throws java.net.UnknownHostException
     */
    public static void main(String[] args) throws UnknownHostException {
        System.out.println("Looking up local host");
        InetAddress localAddress = InetAddress.getLocalHost();
        //menampilkan nilai string alamat ip dalam format dotted decimal
        System.out.println("Name: " + localAddress.getHostName());
        //menampilkan alamat ip
        System.out.println("Name: " + localAddress.getHostAddress());
        System.out.println(localAddress);
    }
    
}

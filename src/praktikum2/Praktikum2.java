/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

import java.net.InetAddress;

/**
 *
 * @author Thole
 */
public class Praktikum2 {
    
    public static void main(String[] args) {
        try {
            //mendapatkan ip
            System.out.println("# Get hostname form current ip");
            String ip = "173.252.120.6";
            System.out.println("Hostame form ip \"" +ip + "\":" + InetAddress.getByName(ip).getHostName());
            
            //mendapatkan host
            System.out.println("\n# Get host address form current name");
            String host = "www.google.com";
            System.out.println("Host/IP: " + InetAddress.getByName(host).getHostAddress());
            System.out.println("Host/IP: " + InetAddress.getByName(host));
            
            //mengecek koneksi dari ip
            System.out.println("\n# Chack connection");
            InetAddress ia = InetAddress.getByName(host);
            if (ia.isReachable(3000)){
                System.out.println(ia +" is Reachabel");
            }else{
                System.out.println(ia +" is unReachabel");
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
    
}

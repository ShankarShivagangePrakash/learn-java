package java18features;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetResolver {

    public static void main(String[] args) throws UnknownHostException {

        // loadResolver() in InetAddress is the method which finds IP for a given domain name
        // we can use its default resolver, or we can use custom resolver also.
        InetAddress name = InetAddress.getByName("goto.com");
        System.out.println("IP Address: " + name.getHostAddress());
    }
}

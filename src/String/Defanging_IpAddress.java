/*1108. Defanging an Ip address
https://leetcode.com/problems/defanging-an-ip-address/*/
package String;

public class Defanging_IpAddress {
    public static void main(String[] args) {
        String str = "1.1.1.1";
        str = defangIPaddr(str);
        System.out.println(str);
    }
    static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if(address.charAt(i)=='.'){
                sb.append('[');
                sb.append('.');
                sb.append(']');
            }else {
                sb.append(address.charAt(i));
            }
        }
        address = String.valueOf(sb);
        return address;
    }
}

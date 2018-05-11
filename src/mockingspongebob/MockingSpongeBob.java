/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockingspongebob;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class MockingSpongeBob {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        
        for (int i=0;i<n;i++) {
            String returnText="";
            boolean upCase=false;

                    
            String sentence= sc.nextLine();
            for (int j=0;j<sentence.length();j++) {
                char c=sentence.charAt(j);
                if (c>='a' && c<='z' || c>='A' && c<='Z')
                {
                    if (upCase) returnText+=Character.toUpperCase(c);
                    else returnText+=Character.toLowerCase(c);
                    upCase=!upCase;
                } else {
                    returnText+=c;
                }
                
            }
            System.out.println(returnText);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication60;

/**
 *
 * @author sandi
 */
public class JavaApplication60 {
    public static int solution(int N) {
        String x = Integer.toBinaryString(N);
        System.out.println(x);
        int max =0;
        int count=0;
        for(int i = 0 ; i < x.length(); i++)
        { 
            if(x.charAt(i)=='1'){
                count=0;

            }

            else{
                count++;
            
            max = Math.max(max,count);
           
            }
    }
    return max;
}
    public static void main(String[] args) {
        int y = solution(78);
        System.out.println(y);
        
        
    }
    
}

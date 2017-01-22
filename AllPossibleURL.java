/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allpossibleurl;

/**
 *
 * @author sandi
 */
import java.util.regex.*; 
import java.util.Vector; 
public class AllPossibleURL 
{ 
private static void printAllPossibleURL(Vector<String> urls,String str) 
{ 
for(int i=0;i<urls.size();i++) 
{ 
Pattern pattern=Pattern.compile( "^"+ str +"[a-zA-Z]*" ); 
Matcher match =pattern.matcher(urls.elementAt( i )); 
if(match.find()) 
{ 
System.out.println( urls.elementAt( i ) ); 
} 
} 
} 
public static void main(String [] args) 
{ 
Vector<String> urls = new Vector<String>(); 
urls.add("team.com"); 
urls.add("tea.in"); 
urls.add("teamwork.org"); 
urls.add("teams.com"); 
urls.add("pot.uk"); 
urls.add("potter.in"); 
urls.add("post.com"); 
printAllPossibleURL(urls,"te"); 
char a = 'a';
System.out.println((int)a);
} 
}
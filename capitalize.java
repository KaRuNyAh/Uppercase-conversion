import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String s1=" ";
if((int)(s.charAt(0))>=97){
System.out.print(Character.toString(((int)(s.charAt(0)))-32));
}
else{
System.out.print(s.charAt(0));
}
for(int i=1;i<s.length();i++){
    if(s.charAt(i-1)==' '&&
    ((int)(s.charAt(i))>=97)
    &&(Character.isLetter(s.charAt(i)))
    ){
        
System.out.print(Character.toString(((int)(s.charAt(i))-32)));
        
    }
    else{
    System.out.print(s.charAt(i));
     }
}
	}
}

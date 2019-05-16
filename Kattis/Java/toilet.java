
import java.util.*;
import java.io.*;

class toilet {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String x=file.readLine();
		int a=0,b=0,c=0;
        char y =x.charAt(0);
        if(y=='U'&&x.charAt(1)=='D'){a+=2;b++;c++;}
        if(y=='D'&&x.charAt(1)=='U'){b+=2;a++;c++;}
        if(y=='U'&&x.charAt(1)=='U'){b++;}
        if(y=='D'&&x.charAt(1)=='D'){a++;}
        for(int i=2;i<x.length();i++){
            y=x.charAt(i-1);
            if(x.charAt(i)=='U'){
                b+=2;
                if(y=='D')c++;
            }else{
                a+=2;
                if(y=='U')c++;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
	}
}

import java.awt.Desktop;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.text.AbstractDocument.Content;

public class IOTest {
    public static void main(String[] args) throws MalformedURLException {
        //http://iosnetworkdemo.appspot.com/json.jsp?msg=helloWorld
        //此將此網址回傳的結果示在Console中
    	
    	URL url = new URL("http://iosnetworkdemo.appspot.com/json.jsp?msg=helloWorld");
        try(InputStream is = url.openStream();     
        	InputStreamReader isr = new InputStreamReader(is,"UTF8");
            BufferedReader br = new BufferedReader(isr);	
        	        		
//        	FileInputStream fis = new FileInputStream("c:\\iii\\a.txt")	;              	
        ){   	        	       	
        	char[] buffer = new char[1024];
        	int length = br.read(buffer);//read會回傳讀了多少進去buffer
            System.out.println("利用buffer讀出長度:"+length);
            for ( int i=0 ; i < length ; i++){
                char b = buffer[i];                
                System.out.print(b);
            }            
//        	int length;        	
//        	while ((length = bis.read(buffer)) != -1) {
//        		bos.write(buffer , 0, length);   
//            	System.out.println(fos);                                  
//            	System.out.println(bos);                      
//        	}     	
        	System.out.println("Finish");      	
 
		} catch (IOException e) {			 
			e.printStackTrace();
		}
        
        	

    }
}

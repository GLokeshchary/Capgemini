// import necessary packages

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
public class Assignment3Q1 {
    
    public static void main(String[] args)
        throws IOException
    {
        
        List<String> listOfStrings
            = new ArrayList<String>();
       
        
        BufferedReader bf = new BufferedReader(
            new FileReader("C:\\Users\\APPLE\\OneDrive\\Desktop\\Java11Assignments_StudentList.txt"));
       
     
        String line = bf.readLine();
       
      
        while (line != null) 
        {
            listOfStrings.add(line);
            line = bf.readLine();
        }
        bf.close();
       
        String[] array
            = listOfStrings.toArray(new String[0]);
       
       // int count=0;
        for(String data: array)
        {
            if(data != " ") 
            {
            	System.out.println(data);
               
            }
         }
    }
}
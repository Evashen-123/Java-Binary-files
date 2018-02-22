import java.io.*;
import javax.swing.*;

public class eg1
{
   public static void main(String[] args)
   {
      write();
      read();    
   }

 public static void write()
 {
 	try
   	{
     DataOutputStream os = new DataOutputStream(new FileOutputStream("numbers.dat"));
      String temp = JOptionPane.showInputDialog(null, "Enter positive integers [-1 to stop]");
      int num = Integer.parseInt(temp);
 		while(num != -1)
 		{
         os.writeInt(num);
        temp = JOptionPane.showInputDialog(null, "Enter positive integers [-1 to stop]");
        num = Integer.parseInt(temp);
       	}	  
        os.close( );
      }
      	catch(IOException e)
      	{
         		System.out.println(e.getMessage());
      	}
   }

public static void read()
{
    try
      {
       DataInputStream is = new DataInputStream(new 
     	FileInputStream("numbers.dat"));
         int num; 
         try
          {
         	while (true)
            {
             num = is.readInt( );
             System.out.println(num);
            }
         } 
      	catch(EOFException e)
        {
          	System.out.println("End of File reached");
         }
         is.close( );
      	}     
        
      	catch(FileNotFoundException e)
        	{
            	System.out.println(e.getMessage());
        	}
        
     	 catch(IOException e)
        	{
            	System.out.println(e.getMessage());
        	}
   }
}


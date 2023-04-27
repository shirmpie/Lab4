
import java.io.*;
public class TestExceptions{
    public static void main(String[] args){
try{
    File inputFile = new File("Sample.jpg");
    //Open the Output file
    File outputFile1 = new File("Output1.jpg");

    //Get file handlers in Byte Stream format
    FileInputStream in1 = new FileInputStream(inputFile);
    FileOutputStream out1 = new FileOutputStream(outputFile1);

    int c1;

    while ((c1 = in1.read()) != -1){   //Until end of file
        out1.write(c1);
    }
    in1.close();
    out1.close();
}catch(IOException e){
    System.out.println("Exception is: " + e);
}


    }
}



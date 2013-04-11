package lab1;

import java.io.*;

public class TextWriterApp {

    public static void main(String[] args) throws IOException {
        
        //Lab 1 Task 3 (Writing Portion)
        boolean append = true;

        File data = new File(File.separatorChar + "Advanced Java" + File.separatorChar
                + "Temp" + File.separatorChar + "ContactList.txt");

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(data, append)));

        out.println();
        out.print("Kling|");
        out.print("Beth|");
        out.print("2304 North Ave|");
        out.print("East Side|");
        out.print("WI|");
        out.print("58214|");
        out.print("beth.kling@gmail.com|");
        out.print("414-736-5666");
        out.close();
    }
}

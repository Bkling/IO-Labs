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
        out.print("Betsy|");
        out.print("517 South Worthington Street|");
        out.print("Greenfield|");
        out.print("WI|");
        out.print("53224|");
        out.print("betsy.kling@yahoo.com|");
        out.print("414-840-8041");
        out.close();
    }
}

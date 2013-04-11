package lab3;

import java.io.*;

public class TextReaderApp {

    public static void main(String[] args) {
        File data = new File(File.separatorChar + "Advanced Java" + File.separatorChar
                + "Temp" + File.separatorChar + "ContactList.txt");
        //Lab 3 Task 1
        String line;
        BufferedReader in = null;
        int lineNo;
        try {
            in = new BufferedReader(new FileReader(data));
            for (lineNo = 1; lineNo < data.length(); lineNo++) {
                if (lineNo == 2) {
                    line = in.readLine();
                    String[] pieces = line.split("\\|");
                    System.out.println("Record Number: " + lineNo + "\nCity: " + pieces[3]);
                } else {
                    in.readLine();
                }
            }
        } catch (IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }
    }
}

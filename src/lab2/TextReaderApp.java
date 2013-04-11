package lab2;

import java.io.*;
import java.util.Scanner;

public class TextReaderApp {

    public static void main(String[] args) {

//      Lab 1 Task 2
        File data = new File(File.separatorChar + "Advanced Java" + File.separatorChar
                + "Temp" + File.separatorChar + "ContactList.txt");
        String line;
        BufferedReader in = null;
        int lineNo = 1;
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter the index of what file you want to get:");
            String ind = keyboard.nextLine();
            int index = Integer.parseInt(ind);
            in = new BufferedReader(new FileReader(data));
            for (lineNo = 1; lineNo < data.length(); lineNo++) {
                if (lineNo == index) {
                    line = in.readLine();
                    String[] pieces = line.split("\\|");
                    System.out.println("Full Name: " + pieces[1] + " " + pieces[0] + "\nAddress: " + pieces[2]
                            + ", " + pieces[3] + ", " + pieces[4] + ", " + pieces[5] + "\nPhone: " + pieces[7]
                            + "\nEmail: " + pieces[6] + "\n");
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

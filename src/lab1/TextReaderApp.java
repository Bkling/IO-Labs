package lab1;

import java.io.*;

public class TextReaderApp {

    public static void main(String[] args) {

        /*
         * To check one of the labs uncomment that one and then run the file,
         * I did this so you can see what each task does according to the readme.txt
         */

        File data = new File(File.separatorChar + "Advanced Java" + File.separatorChar
                + "Temp" + File.separatorChar + "ContactList.txt");

        //Lab 1 Task 1
//        BufferedReader in = null;
//        try {
//            in = new BufferedReader(new FileReader(data));
//            String line = in.readLine();
//
//            while (line != null) {
//                String[] pieces = line.split("\\|");
//                System.out.println("Full Name: " + pieces[1] + " " + pieces[0] + "\nAddress: " + pieces[2]
//                        + ", " + pieces[3] + ", " + pieces[4] + ", " + pieces[5] + "\nPhone: " + pieces[7]
//                        + "\nEmail: " + pieces[6] + "\n");
//
//                line = in.readLine();
//            }
//
//        } catch (IOException ioe) {
//            System.out.println("Houston, we have a problem! reading this file");
//        } finally {
//            try {
//                in.close();
//            } catch (Exception e) {
//            }
//        }





        //Lab 1 Task 2
//        String line;
//        BufferedReader in = null;
//        int lineNo;
//        try {
//            in = new BufferedReader(new FileReader(data));
//            for (lineNo = 1; lineNo < 5; lineNo++) {
//                if (lineNo == 2) {
//                    line = in.readLine();
//                    String[] pieces = line.split("\\|");
//                    System.out.println("Full Name: " + pieces[1] + " " + pieces[0] + "\nAddress: " + pieces[2]
//                            + ", " + pieces[3] + ", " + pieces[4] + ", " + pieces[5] + "\nPhone: " + pieces[7]
//                            + "\nEmail: " + pieces[6] + "\n");
//                } else {
//                    in.readLine();
//                }
//            }
//        } catch (IOException ioe) {
//            System.out.println("Houston, we have a problem! reading this file");
//        } finally {
//            try {
//                in.close();
//            } catch (Exception e) {
//            }
//        }





        //Lab 1 Task 3
//        BufferedReader in = null;
//        try {
//            in = new BufferedReader(new FileReader(data));
//            String line = in.readLine();
//
//            while (line != null) {
//                String[] pieces = line.split("\\|");
//                System.out.println("Full Name: " + pieces[1] + " " + pieces[0] + "\nAddress: " + pieces[2]
//                        + ", " + pieces[3] + ", " + pieces[4] + ", " + pieces[5] + "\nPhone: " + pieces[7]
//                        + "\nEmail: " + pieces[6] + "\n");
//
//                line = in.readLine();
//            }
//
//        } catch (IOException ioe) {
//            System.out.println("Houston, we have a problem! reading this file");
//        } finally {
//            try {
//                in.close();
//            } catch (Exception e) {
//            }
//        }
    }
}

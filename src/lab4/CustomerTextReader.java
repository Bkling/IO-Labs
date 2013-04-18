package lab4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * This class reads a customer text reader using vertical bars (|) as
 * separators.
 *
 * @author Benjamin, Email Bkling@my.wctc.edu, Version 1.0
 */
public class CustomerTextReader implements TextReaderStrategy {

    /*
     * Properites of a CustomerTextReader, these properites also evade magic numbers.
     */
    private String ERROR = "Sorry, there was a problem reading this file.";
    private String VERT_BAR = "\\|";
    private String FULL_NAME = "Full Name: ";
    private String SPACE = " ";
    private String SPACE_W_COMMA = ", ";
    private String NEW_LINE = "\n";
    private String ADDRESS = "Address: ";
    private String PHONE = "Phone: ";
    private String EMAIL = "Email: ";
    private String info;

    /**
     * This method overrides the interface method to implement it's own.
     *
     * @param filePath - Uses the file path of file to reade it
     * @return -
     * @throws Exception - if an error occurs exception will be thrown.
     */
    @Override
    public String readFile(String filePath) throws Exception {

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(filePath));
            String line = in.readLine();
            while (line != null) {
                String[] pieces = line.split(VERT_BAR);
                info = FULL_NAME + pieces[1] + SPACE + pieces[0] + NEW_LINE + ADDRESS + pieces[2]
                        + SPACE_W_COMMA + pieces[3] + SPACE_W_COMMA + pieces[4] + SPACE_W_COMMA
                        + pieces[5] + NEW_LINE + PHONE + pieces[7]
                        + NEW_LINE + EMAIL + pieces[6] + NEW_LINE;
                line = in.readLine();
            }

        } catch (IOException ioe) {
            System.out.println(ERROR);
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }
        return info;
    }
}

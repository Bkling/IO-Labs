package lab4;

/**
 * This is an interface for the file reading side of the file service.
 *
 * @author Benjamin, Email Bkling@my.wctc.edu, Version 1.0
 */
public interface FileReaderStrategy {

    /**
     * This method is used so that all the readers below it have to override it,
     * and write their own readers.
     */
    public abstract String readFile() throws Exception;
}

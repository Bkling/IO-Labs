package lab4;

/**
 * This is a file service class that uses two components a reader and a writer,
 * and can be used in almost any program, but this file service cannot use
 * binary files.
 *
 * @author Benjamin, Email Bkling@my.wctc.edu, Version 1.0
 */
public class FileService {

    /*
     * Componenets of a file service
     */
    private FileReaderStrategy reader;
    private FileWriterStrategy writer;
    private String filePath;

    /*
     * Constructor
     */
    public FileService(FileReaderStrategy reader, FileWriterStrategy writer, String filePath) {
        this.reader = reader;
        this.writer = writer;
        this.filePath = filePath;
    }

    /*
     * Getters and Setters for the strategy objects
     */
    public FileReaderStrategy getReader() {
        return reader;
    }

    /**
     * This method sets a reader to be used in the file service class.
     *
     * @param reader - uses a reader to read from the file.
     * @throws Exception - if the reader is not there, it throws an exception.
     */
    public void setReader(FileReaderStrategy reader) throws Exception {
        if (reader == null) {
            throw new Exception();
        }
        this.reader = reader;
    }

    public FileWriterStrategy getWriter() {
        return writer;
    }

    /**
     * This method sets a writer to be used in the file service class.
     *
     * @param writer - uses a writer to write to the file.
     * @throws Exception - if the writer is not there, it throws an exception.
     */
    public void setWriter(FileWriterStrategy writer) throws Exception {
        if (writer == null) {
            throw new Exception();
        }
        this.writer = writer;
    }
}

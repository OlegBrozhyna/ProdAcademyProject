package OOPinterface;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFileSaveService {
    private File file;
    private String delimiter = ";";

    public TextFileSaveService(File file) {
        super();
        this.file = file;
    }

    public TextFileSaveService(File file, String delimiter) {
        super();
        this.file = file;
        this.delimiter = delimiter;
    }
    public void saveToCSVFile(GetFateToTextFile gdtt, Cat cat2, Cat cat3, Cat cat4, Cat cat5) throws IOExceptione, FileNotFoundException {
        String[] date = gdtt.textRepresentation().split(";");
        try(PrintWriter pw = new PrintWriter(file)){
            for (int i = 0; i < date.length; i++) {
                pw.print(date[i] + delimiter);
            }
            pw.print(date[date.length-1]);
        }catch (IOException e){
            throw e;
        }
    }

}

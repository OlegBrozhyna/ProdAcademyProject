package OOPinterface;

public interface GetDateToDB {
    public String[] getFileDescription();

    public default Object getFieldValue() {
        return null;
    }
}



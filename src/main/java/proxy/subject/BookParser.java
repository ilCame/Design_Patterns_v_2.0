package proxy.subject;

public class BookParser implements IBookParser {
    private final String book;
    private int elevation = 2;

    public BookParser(String book) {
        this.book = book;

        for(int i = 0; i < book.length(); i++){
            elevation *= elevation;
        }
    }

    @Override
    public int getNumbParser() {
        return elevation + book.length();
    }
}

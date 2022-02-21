package proxy.proxyclass;

import proxy.subject.BookParser;
import proxy.subject.IBookParser;

public class LazyBookParser implements IBookParser {
    private BookParser bookParser = null;
    private final String book;

    public LazyBookParser(String book) {
        this.book = book;
    }

    @Override
    public int getNumbParser() {
        if(this.bookParser == null){
            this.bookParser = new BookParser(book);
        }
        return this.bookParser.getNumbParser();
    }
}

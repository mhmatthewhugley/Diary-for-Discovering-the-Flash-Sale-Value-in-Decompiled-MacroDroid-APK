package javax.mail.search;

import javax.mail.Message;

public final class NotTerm extends SearchTerm {
    private static final long serialVersionUID = 7152293214217310216L;
    private SearchTerm term;

    public NotTerm(SearchTerm searchTerm) {
        this.term = searchTerm;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NotTerm)) {
            return false;
        }
        return ((NotTerm) obj).term.equals(this.term);
    }

    public SearchTerm getTerm() {
        return this.term;
    }

    public int hashCode() {
        return this.term.hashCode() << 1;
    }

    public boolean match(Message message) {
        return !this.term.match(message);
    }
}

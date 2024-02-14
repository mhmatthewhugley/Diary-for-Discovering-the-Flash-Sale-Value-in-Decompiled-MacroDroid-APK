package javax.mail.search;

import javax.mail.Message;

public final class AndTerm extends SearchTerm {
    private static final long serialVersionUID = -3583274505380989582L;
    private SearchTerm[] terms;

    public AndTerm(SearchTerm searchTerm, SearchTerm searchTerm2) {
        SearchTerm[] searchTermArr = new SearchTerm[2];
        this.terms = searchTermArr;
        searchTermArr[0] = searchTerm;
        searchTermArr[1] = searchTerm2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AndTerm)) {
            return false;
        }
        AndTerm andTerm = (AndTerm) obj;
        if (andTerm.terms.length != this.terms.length) {
            return false;
        }
        int i = 0;
        while (true) {
            SearchTerm[] searchTermArr = this.terms;
            if (i >= searchTermArr.length) {
                return true;
            }
            if (!searchTermArr[i].equals(andTerm.terms[i])) {
                return false;
            }
            i++;
        }
    }

    public SearchTerm[] getTerms() {
        return (SearchTerm[]) this.terms.clone();
    }

    public int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            SearchTerm[] searchTermArr = this.terms;
            if (i >= searchTermArr.length) {
                return i2;
            }
            i2 += searchTermArr[i].hashCode();
            i++;
        }
    }

    public boolean match(Message message) {
        int i = 0;
        while (true) {
            SearchTerm[] searchTermArr = this.terms;
            if (i >= searchTermArr.length) {
                return true;
            }
            if (!searchTermArr[i].match(message)) {
                return false;
            }
            i++;
        }
    }

    public AndTerm(SearchTerm[] searchTermArr) {
        this.terms = new SearchTerm[searchTermArr.length];
        for (int i = 0; i < searchTermArr.length; i++) {
            this.terms[i] = searchTermArr[i];
        }
    }
}

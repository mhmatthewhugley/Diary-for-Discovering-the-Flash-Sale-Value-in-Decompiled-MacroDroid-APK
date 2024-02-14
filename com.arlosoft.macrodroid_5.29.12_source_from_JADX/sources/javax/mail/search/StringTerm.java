package javax.mail.search;

public abstract class StringTerm extends SearchTerm {
    private static final long serialVersionUID = 1274042129007696269L;
    protected boolean ignoreCase;
    protected String pattern;

    protected StringTerm(String str) {
        this.pattern = str;
        this.ignoreCase = true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StringTerm)) {
            return false;
        }
        StringTerm stringTerm = (StringTerm) obj;
        if (this.ignoreCase) {
            if (!stringTerm.pattern.equalsIgnoreCase(this.pattern) || stringTerm.ignoreCase != this.ignoreCase) {
                return false;
            }
            return true;
        } else if (!stringTerm.pattern.equals(this.pattern) || stringTerm.ignoreCase != this.ignoreCase) {
            return false;
        } else {
            return true;
        }
    }

    public boolean getIgnoreCase() {
        return this.ignoreCase;
    }

    public String getPattern() {
        return this.pattern;
    }

    public int hashCode() {
        return this.ignoreCase ? this.pattern.hashCode() : ~this.pattern.hashCode();
    }

    /* access modifiers changed from: protected */
    public boolean match(String str) {
        int length = str.length() - this.pattern.length();
        for (int i = 0; i <= length; i++) {
            boolean z = this.ignoreCase;
            String str2 = this.pattern;
            if (str.regionMatches(z, i, str2, 0, str2.length())) {
                return true;
            }
        }
        return false;
    }

    protected StringTerm(String str, boolean z) {
        this.pattern = str;
        this.ignoreCase = z;
    }
}

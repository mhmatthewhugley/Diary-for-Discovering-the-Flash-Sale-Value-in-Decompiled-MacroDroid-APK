package javax.mail.search;

import java.util.Locale;
import javax.mail.Message;

public final class HeaderTerm extends StringTerm {
    private static final long serialVersionUID = 8342514650333389122L;
    private String headerName;

    public HeaderTerm(String str, String str2) {
        super(str2);
        this.headerName = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HeaderTerm)) {
            return false;
        }
        HeaderTerm headerTerm = (HeaderTerm) obj;
        if (!headerTerm.headerName.equalsIgnoreCase(this.headerName) || !super.equals(headerTerm)) {
            return false;
        }
        return true;
    }

    public String getHeaderName() {
        return this.headerName;
    }

    public int hashCode() {
        return this.headerName.toLowerCase(Locale.ENGLISH).hashCode() + super.hashCode();
    }

    public boolean match(Message message) {
        try {
            String[] header = message.getHeader(this.headerName);
            if (header == null) {
                return false;
            }
            for (String match : header) {
                if (super.match(match)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
        }
    }
}

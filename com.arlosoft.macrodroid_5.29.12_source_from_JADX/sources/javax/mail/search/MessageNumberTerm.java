package javax.mail.search;

import javax.mail.Message;

public final class MessageNumberTerm extends IntegerComparisonTerm {
    private static final long serialVersionUID = -5379625829658623812L;

    public MessageNumberTerm(int i) {
        super(3, i);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MessageNumberTerm)) {
            return false;
        }
        return super.equals(obj);
    }

    public boolean match(Message message) {
        try {
            return super.match(message.getMessageNumber());
        } catch (Exception unused) {
            return false;
        }
    }
}

package javax.mail.search;

import javax.mail.Address;
import javax.mail.Message;

public final class RecipientStringTerm extends AddressStringTerm {
    private static final long serialVersionUID = -8293562089611618849L;
    private Message.RecipientType type;

    public RecipientStringTerm(Message.RecipientType recipientType, String str) {
        super(str);
        this.type = recipientType;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof RecipientStringTerm) && ((RecipientStringTerm) obj).type.equals(this.type) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    public Message.RecipientType getRecipientType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + super.hashCode();
    }

    public boolean match(Message message) {
        try {
            Address[] recipients = message.getRecipients(this.type);
            if (recipients == null) {
                return false;
            }
            for (Address match : recipients) {
                if (super.match(match)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
        }
    }
}

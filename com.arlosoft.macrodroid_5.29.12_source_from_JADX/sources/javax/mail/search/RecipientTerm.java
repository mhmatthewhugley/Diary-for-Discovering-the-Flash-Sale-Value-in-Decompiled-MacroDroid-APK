package javax.mail.search;

import javax.mail.Address;
import javax.mail.Message;

public final class RecipientTerm extends AddressTerm {
    private static final long serialVersionUID = 6548700653122680468L;
    private Message.RecipientType type;

    public RecipientTerm(Message.RecipientType recipientType, Address address) {
        super(address);
        this.type = recipientType;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof RecipientTerm) && ((RecipientTerm) obj).type.equals(this.type) && super.equals(obj)) {
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

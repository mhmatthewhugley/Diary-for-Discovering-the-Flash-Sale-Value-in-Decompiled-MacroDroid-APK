package javax.mail.search;

import javax.mail.Flags;
import javax.mail.Message;
import javax.mail.MessagingException;

public final class FlagTerm extends SearchTerm {
    private static final long serialVersionUID = -142991500302030647L;
    private Flags flags;
    private boolean set;

    public FlagTerm(Flags flags2, boolean z) {
        this.flags = flags2;
        this.set = z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FlagTerm)) {
            return false;
        }
        FlagTerm flagTerm = (FlagTerm) obj;
        if (flagTerm.set != this.set || !flagTerm.flags.equals(this.flags)) {
            return false;
        }
        return true;
    }

    public Flags getFlags() {
        return (Flags) this.flags.clone();
    }

    public boolean getTestSet() {
        return this.set;
    }

    public int hashCode() {
        return this.set ? this.flags.hashCode() : ~this.flags.hashCode();
    }

    public boolean match(Message message) {
        try {
            Flags flags2 = message.getFlags();
            if (!this.set) {
                Flags.Flag[] systemFlags = this.flags.getSystemFlags();
                for (Flags.Flag contains : systemFlags) {
                    if (flags2.contains(contains)) {
                        return false;
                    }
                }
                String[] userFlags = this.flags.getUserFlags();
                for (String contains2 : userFlags) {
                    if (flags2.contains(contains2)) {
                        return false;
                    }
                }
                return true;
            } else if (flags2.contains(this.flags)) {
                return true;
            } else {
                return false;
            }
        } catch (RuntimeException | MessagingException unused) {
            return false;
        }
    }
}

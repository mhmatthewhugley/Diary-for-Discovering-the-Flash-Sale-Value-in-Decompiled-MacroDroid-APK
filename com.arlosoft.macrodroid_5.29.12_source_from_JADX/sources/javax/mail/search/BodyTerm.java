package javax.mail.search;

import java.io.IOException;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;

public final class BodyTerm extends StringTerm {
    private static final long serialVersionUID = -4888862527916911385L;

    public BodyTerm(String str) {
        super(str);
    }

    private boolean matchPart(Part part) {
        try {
            if (part.isMimeType("text/*")) {
                String str = (String) part.getContent();
                if (str == null) {
                    return false;
                }
                return super.match(str);
            }
            if (part.isMimeType("multipart/*")) {
                Multipart multipart = (Multipart) part.getContent();
                int count = multipart.getCount();
                for (int i = 0; i < count; i++) {
                    if (matchPart(multipart.getBodyPart(i))) {
                        return true;
                    }
                }
            } else if (part.isMimeType("message/rfc822")) {
                return matchPart((Part) part.getContent());
            }
            return false;
        } catch (IOException | RuntimeException | MessagingException unused) {
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BodyTerm)) {
            return false;
        }
        return super.equals(obj);
    }

    public boolean match(Message message) {
        return matchPart(message);
    }
}

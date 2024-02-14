package org.apache.commons.p353io;

import java.io.IOException;
import java.io.Serializable;

/* renamed from: org.apache.commons.io.TaggedIOException */
public class TaggedIOException extends IOExceptionWithCause {
    private static final long serialVersionUID = -6994123481142850163L;
    private final Serializable tag;

    public TaggedIOException(IOException iOException, Serializable serializable) {
        super(iOException.getMessage(), iOException);
        this.tag = serializable;
    }

    public static boolean isTaggedWith(Throwable th, Object obj) {
        return obj != null && (th instanceof TaggedIOException) && obj.equals(((TaggedIOException) th).tag);
    }

    public static void throwCauseIfTaggedWith(Throwable th, Object obj) throws IOException {
        if (isTaggedWith(th, obj)) {
            throw ((TaggedIOException) th).getCause();
        }
    }

    public Serializable getTag() {
        return this.tag;
    }

    public IOException getCause() {
        return (IOException) super.getCause();
    }
}

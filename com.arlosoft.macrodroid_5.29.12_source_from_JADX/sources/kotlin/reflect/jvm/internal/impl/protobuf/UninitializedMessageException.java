package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.List;

public class UninitializedMessageException extends RuntimeException {
    private final List<String> missingFields = null;

    public UninitializedMessageException(C14516o oVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: a */
    public InvalidProtocolBufferException mo73278a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}

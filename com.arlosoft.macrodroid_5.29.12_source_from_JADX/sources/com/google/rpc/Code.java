package com.google.rpc;

import com.google.protobuf.Internal;

public enum Code implements Internal.EnumLite {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    UNAUTHENTICATED(16),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNRECOGNIZED(-1);
    

    /* renamed from: J */
    private static final Internal.EnumLiteMap<Code> f57215J = null;
    private final int value;

    private static final class CodeVerifier implements Internal.EnumVerifier {

        /* renamed from: a */
        static final Internal.EnumVerifier f57226a = null;

        static {
            f57226a = new CodeVerifier();
        }

        private CodeVerifier() {
        }

        /* renamed from: a */
        public boolean mo60055a(int i) {
            return Code.m81598b(i) != null;
        }
    }

    static {
        f57215J = new Internal.EnumLiteMap<Code>() {
            /* renamed from: b */
            public Code mo60053a(int i) {
                return Code.m81598b(i);
            }
        };
    }

    private Code(int i) {
        this.value = i;
    }

    /* renamed from: b */
    public static Code m81598b(int i) {
        switch (i) {
            case 0:
                return OK;
            case 1:
                return CANCELLED;
            case 2:
                return UNKNOWN;
            case 3:
                return INVALID_ARGUMENT;
            case 4:
                return DEADLINE_EXCEEDED;
            case 5:
                return NOT_FOUND;
            case 6:
                return ALREADY_EXISTS;
            case 7:
                return PERMISSION_DENIED;
            case 8:
                return RESOURCE_EXHAUSTED;
            case 9:
                return FAILED_PRECONDITION;
            case 10:
                return ABORTED;
            case 11:
                return OUT_OF_RANGE;
            case 12:
                return UNIMPLEMENTED;
            case 13:
                return INTERNAL;
            case 14:
                return UNAVAILABLE;
            case 15:
                return DATA_LOSS;
            case 16:
                return UNAUTHENTICATED;
            default:
                return null;
        }
    }

    /* renamed from: c */
    public final int mo60052c() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

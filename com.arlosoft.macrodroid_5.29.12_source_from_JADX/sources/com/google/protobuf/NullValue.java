package com.google.protobuf;

import com.google.protobuf.Internal;

public enum NullValue implements Internal.EnumLite {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);
    

    /* renamed from: d */
    private static final Internal.EnumLiteMap<NullValue> f57037d = null;
    private final int value;

    private static final class NullValueVerifier implements Internal.EnumVerifier {

        /* renamed from: a */
        static final Internal.EnumVerifier f57039a = null;

        static {
            f57039a = new NullValueVerifier();
        }

        private NullValueVerifier() {
        }

        /* renamed from: a */
        public boolean mo60055a(int i) {
            return NullValue.m81029b(i) != null;
        }
    }

    static {
        f57037d = new Internal.EnumLiteMap<NullValue>() {
            /* renamed from: b */
            public NullValue mo60053a(int i) {
                return NullValue.m81029b(i);
            }
        };
    }

    private NullValue(int i) {
        this.value = i;
    }

    /* renamed from: b */
    public static NullValue m81029b(int i) {
        if (i != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    /* renamed from: c */
    public final int mo60052c() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

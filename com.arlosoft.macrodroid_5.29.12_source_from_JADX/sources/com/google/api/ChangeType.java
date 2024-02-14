package com.google.api;

import com.google.protobuf.Internal;

public enum ChangeType implements Internal.EnumLite {
    CHANGE_TYPE_UNSPECIFIED(0),
    ADDED(1),
    REMOVED(2),
    MODIFIED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: o */
    private static final Internal.EnumLiteMap<ChangeType> f52025o = null;
    private final int value;

    private static final class ChangeTypeVerifier implements Internal.EnumVerifier {

        /* renamed from: a */
        static final Internal.EnumVerifier f52027a = null;

        static {
            f52027a = new ChangeTypeVerifier();
        }

        private ChangeTypeVerifier() {
        }

        /* renamed from: a */
        public boolean mo60055a(int i) {
            return ChangeType.m71328b(i) != null;
        }
    }

    static {
        f52025o = new Internal.EnumLiteMap<ChangeType>() {
            /* renamed from: b */
            public ChangeType mo60053a(int i) {
                return ChangeType.m71328b(i);
            }
        };
    }

    private ChangeType(int i) {
        this.value = i;
    }

    /* renamed from: b */
    public static ChangeType m71328b(int i) {
        if (i == 0) {
            return CHANGE_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return ADDED;
        }
        if (i == 2) {
            return REMOVED;
        }
        if (i != 3) {
            return null;
        }
        return MODIFIED;
    }

    /* renamed from: c */
    public final int mo60052c() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

package com.google.api;

import com.google.protobuf.Internal;

public enum FieldBehavior implements Internal.EnumLite {
    FIELD_BEHAVIOR_UNSPECIFIED(0),
    OPTIONAL(1),
    REQUIRED(2),
    OUTPUT_ONLY(3),
    INPUT_ONLY(4),
    IMMUTABLE(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: s */
    private static final Internal.EnumLiteMap<FieldBehavior> f52052s = null;
    private final int value;

    private static final class FieldBehaviorVerifier implements Internal.EnumVerifier {

        /* renamed from: a */
        static final Internal.EnumVerifier f52054a = null;

        static {
            f52054a = new FieldBehaviorVerifier();
        }

        private FieldBehaviorVerifier() {
        }

        /* renamed from: a */
        public boolean mo60055a(int i) {
            return FieldBehavior.m71363b(i) != null;
        }
    }

    static {
        f52052s = new Internal.EnumLiteMap<FieldBehavior>() {
            /* renamed from: b */
            public FieldBehavior mo60053a(int i) {
                return FieldBehavior.m71363b(i);
            }
        };
    }

    private FieldBehavior(int i) {
        this.value = i;
    }

    /* renamed from: b */
    public static FieldBehavior m71363b(int i) {
        if (i == 0) {
            return FIELD_BEHAVIOR_UNSPECIFIED;
        }
        if (i == 1) {
            return OPTIONAL;
        }
        if (i == 2) {
            return REQUIRED;
        }
        if (i == 3) {
            return OUTPUT_ONLY;
        }
        if (i == 4) {
            return INPUT_ONLY;
        }
        if (i != 5) {
            return null;
        }
        return IMMUTABLE;
    }

    /* renamed from: d */
    public static Internal.EnumLiteMap<FieldBehavior> m71364d() {
        return f52052s;
    }

    /* renamed from: c */
    public final int mo60052c() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

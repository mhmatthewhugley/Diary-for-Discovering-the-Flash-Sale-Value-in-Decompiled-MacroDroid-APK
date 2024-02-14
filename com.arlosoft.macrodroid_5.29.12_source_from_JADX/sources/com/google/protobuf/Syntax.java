package com.google.protobuf;

import com.google.protobuf.Internal;

public enum Syntax implements Internal.EnumLite {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private static final Internal.EnumLiteMap<Syntax> f57109f = null;
    private final int value;

    private static final class SyntaxVerifier implements Internal.EnumVerifier {

        /* renamed from: a */
        static final Internal.EnumVerifier f57111a = null;

        static {
            f57111a = new SyntaxVerifier();
        }

        private SyntaxVerifier() {
        }

        /* renamed from: a */
        public boolean mo60055a(int i) {
            return Syntax.m81243b(i) != null;
        }
    }

    static {
        f57109f = new Internal.EnumLiteMap<Syntax>() {
            /* renamed from: b */
            public Syntax mo60053a(int i) {
                return Syntax.m81243b(i);
            }
        };
    }

    private Syntax(int i) {
        this.value = i;
    }

    /* renamed from: b */
    public static Syntax m81243b(int i) {
        if (i == 0) {
            return SYNTAX_PROTO2;
        }
        if (i != 1) {
            return null;
        }
        return SYNTAX_PROTO3;
    }

    /* renamed from: c */
    public final int mo60052c() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

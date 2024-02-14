package com.fasterxml.jackson.core;

import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: com.fasterxml.jackson.core.e */
/* compiled from: JsonParser */
public abstract class C6802e implements Closeable {

    /* renamed from: a */
    protected int f15780a;

    /* renamed from: com.fasterxml.jackson.core.e$a */
    /* compiled from: JsonParser */
    public enum C6803a {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false);
        
        private final boolean _defaultState;

        private C6803a(boolean z) {
            this._defaultState = z;
        }

        /* renamed from: b */
        public static int m25563b() {
            int i = 0;
            for (C6803a aVar : values()) {
                if (aVar.mo33876d()) {
                    i |= aVar.mo33877e();
                }
            }
            return i;
        }

        /* renamed from: d */
        public boolean mo33876d() {
            return this._defaultState;
        }

        /* renamed from: e */
        public int mo33877e() {
            return 1 << ordinal();
        }
    }

    protected C6802e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public JsonParseException mo33859b(String str) {
        return new JsonParseException(str, mo33863f());
    }

    /* renamed from: c */
    public abstract BigInteger mo33860c() throws IOException, JsonParseException;

    public abstract void close() throws IOException;

    /* renamed from: e */
    public byte mo33862e() throws IOException, JsonParseException {
        int o = mo33869o();
        if (o >= -128 && o <= 255) {
            return (byte) o;
        }
        throw mo33859b("Numeric value (" + mo33872s() + ") out of range of Java byte");
    }

    /* renamed from: f */
    public abstract C6801d mo33863f();

    /* renamed from: g */
    public abstract String mo33864g() throws IOException, JsonParseException;

    /* renamed from: h */
    public abstract C6805g mo33865h();

    /* renamed from: i */
    public abstract BigDecimal mo33866i() throws IOException, JsonParseException;

    /* renamed from: j */
    public abstract double mo33867j() throws IOException, JsonParseException;

    /* renamed from: m */
    public abstract float mo33868m() throws IOException, JsonParseException;

    /* renamed from: o */
    public abstract int mo33869o() throws IOException, JsonParseException;

    /* renamed from: p */
    public abstract long mo33870p() throws IOException, JsonParseException;

    /* renamed from: r */
    public short mo33871r() throws IOException, JsonParseException {
        int o = mo33869o();
        if (o >= -32768 && o <= 32767) {
            return (short) o;
        }
        throw mo33859b("Numeric value (" + mo33872s() + ") out of range of Java short");
    }

    /* renamed from: s */
    public abstract String mo33872s() throws IOException, JsonParseException;

    /* renamed from: u */
    public boolean mo33873u(C6803a aVar) {
        return (aVar.mo33877e() & this.f15780a) != 0;
    }

    /* renamed from: v */
    public abstract C6805g mo33874v() throws IOException, JsonParseException;

    /* renamed from: w */
    public abstract C6802e mo33875w() throws IOException, JsonParseException;
}

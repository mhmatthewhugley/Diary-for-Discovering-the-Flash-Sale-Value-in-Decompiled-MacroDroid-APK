package com.fasterxml.jackson.core;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: com.fasterxml.jackson.core.c */
/* compiled from: JsonGenerator */
public abstract class C6799c implements Closeable, Flushable {

    /* renamed from: a */
    protected C6807i f15770a;

    /* renamed from: com.fasterxml.jackson.core.c$a */
    /* compiled from: JsonGenerator */
    public enum C6800a {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        WRITE_NUMBERS_AS_STRINGS(false),
        FLUSH_PASSED_TO_STREAM(true),
        ESCAPE_NON_ASCII(false);
        
        private final boolean _defaultState;
        private final int _mask;

        private C6800a(boolean z) {
            this._mask = 1 << ordinal();
            this._defaultState = z;
        }

        /* renamed from: b */
        public static int m25543b() {
            int i = 0;
            for (C6800a aVar : values()) {
                if (aVar.mo33853d()) {
                    i |= aVar.mo33854e();
                }
            }
            return i;
        }

        /* renamed from: d */
        public boolean mo33853d() {
            return this._defaultState;
        }

        /* renamed from: e */
        public int mo33854e() {
            return this._mask;
        }
    }

    protected C6799c() {
    }

    /* renamed from: A */
    public abstract void mo33831A() throws IOException, JsonGenerationException;

    /* renamed from: B */
    public abstract void mo33832B(String str) throws IOException, JsonGenerationException;

    /* renamed from: b */
    public C6807i mo33833b() {
        return this.f15770a;
    }

    /* renamed from: c */
    public C6799c mo33834c(C6807i iVar) {
        this.f15770a = iVar;
        return this;
    }

    /* renamed from: e */
    public abstract C6799c mo33835e();

    /* renamed from: f */
    public abstract void mo33836f(boolean z) throws IOException, JsonGenerationException;

    public abstract void flush() throws IOException;

    /* renamed from: g */
    public abstract void mo33838g() throws IOException, JsonGenerationException;

    /* renamed from: h */
    public abstract void mo33839h() throws IOException, JsonGenerationException;

    /* renamed from: i */
    public abstract void mo33840i(String str) throws IOException, JsonGenerationException;

    /* renamed from: j */
    public abstract void mo33841j() throws IOException, JsonGenerationException;

    /* renamed from: m */
    public abstract void mo33842m(double d) throws IOException, JsonGenerationException;

    /* renamed from: o */
    public abstract void mo33843o(float f) throws IOException, JsonGenerationException;

    /* renamed from: p */
    public abstract void mo33844p(int i) throws IOException, JsonGenerationException;

    /* renamed from: r */
    public abstract void mo33845r(long j) throws IOException, JsonGenerationException;

    /* renamed from: s */
    public abstract void mo33846s(BigDecimal bigDecimal) throws IOException, JsonGenerationException;

    /* renamed from: u */
    public abstract void mo33847u(BigInteger bigInteger) throws IOException, JsonGenerationException;

    /* renamed from: v */
    public abstract void mo33848v(char c) throws IOException, JsonGenerationException;

    /* renamed from: w */
    public abstract void mo33849w(C6821j jVar) throws IOException, JsonGenerationException;

    /* renamed from: x */
    public abstract void mo33850x(String str) throws IOException, JsonGenerationException;

    /* renamed from: y */
    public abstract void mo33851y(char[] cArr, int i, int i2) throws IOException, JsonGenerationException;

    /* renamed from: z */
    public abstract void mo33852z() throws IOException, JsonGenerationException;
}

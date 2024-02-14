package com.fasterxml.jackson.core;

/* renamed from: com.fasterxml.jackson.core.a */
/* compiled from: JsonEncoding */
public enum C6796a {
    UTF8("UTF-8", false),
    UTF16_BE("UTF-16BE", true),
    UTF16_LE("UTF-16LE", false),
    UTF32_BE("UTF-32BE", true),
    UTF32_LE("UTF-32LE", false);
    
    protected final boolean _bigEndian;
    protected final String _javaName;

    private C6796a(String str, boolean z) {
        this._javaName = str;
        this._bigEndian = z;
    }

    /* renamed from: b */
    public String mo33808b() {
        return this._javaName;
    }

    /* renamed from: d */
    public boolean mo33809d() {
        return this._bigEndian;
    }
}

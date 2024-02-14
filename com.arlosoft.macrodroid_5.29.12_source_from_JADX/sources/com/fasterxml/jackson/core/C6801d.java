package com.fasterxml.jackson.core;

import java.io.Serializable;

/* renamed from: com.fasterxml.jackson.core.d */
/* compiled from: JsonLocation */
public class C6801d implements Serializable {

    /* renamed from: a */
    public static final C6801d f15779a = new C6801d("N/A", -1, -1, -1, -1);
    private static final long serialVersionUID = 1;
    final int _columnNr;
    final int _lineNr;
    final Object _sourceRef;
    final long _totalBytes;
    final long _totalChars;

    public C6801d(Object obj, long j, int i, int i2) {
        this(obj, -1, j, i, i2);
    }

    /* renamed from: a */
    public long mo33855a() {
        return this._totalBytes;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C6801d)) {
            return false;
        }
        C6801d dVar = (C6801d) obj;
        Object obj2 = this._sourceRef;
        if (obj2 == null) {
            if (dVar._sourceRef != null) {
                return false;
            }
        } else if (!obj2.equals(dVar._sourceRef)) {
            return false;
        }
        if (this._lineNr == dVar._lineNr && this._columnNr == dVar._columnNr && this._totalChars == dVar._totalChars && mo33855a() == dVar.mo33855a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object obj = this._sourceRef;
        return ((((obj == null ? 1 : obj.hashCode()) ^ this._lineNr) + this._columnNr) ^ ((int) this._totalChars)) + ((int) this._totalBytes);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(80);
        sb.append("[Source: ");
        Object obj = this._sourceRef;
        if (obj == null) {
            sb.append("UNKNOWN");
        } else {
            sb.append(obj.toString());
        }
        sb.append("; line: ");
        sb.append(this._lineNr);
        sb.append(", column: ");
        sb.append(this._columnNr);
        sb.append(']');
        return sb.toString();
    }

    public C6801d(Object obj, long j, long j2, int i, int i2) {
        this._sourceRef = obj;
        this._totalBytes = j;
        this._totalChars = j2;
        this._lineNr = i;
        this._columnNr = i2;
    }
}

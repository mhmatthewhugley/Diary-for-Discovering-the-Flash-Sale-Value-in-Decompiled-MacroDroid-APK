package com.fasterxml.jackson.core.p072io;

import com.fasterxml.jackson.core.C6821j;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: com.fasterxml.jackson.core.io.k */
/* compiled from: SerializedString */
public class C6818k implements C6821j, Serializable {
    protected char[] _quotedChars;
    protected byte[] _quotedUTF8Ref;
    protected byte[] _unquotedUTF8Ref;
    protected final String _value;

    /* renamed from: a */
    protected transient String f15855a;

    public C6818k(String str) {
        if (str != null) {
            this._value = str;
            return;
        }
        throw new IllegalStateException("Null String illegal for SerializedString");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        this.f15855a = objectInputStream.readUTF();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this._value);
    }

    /* renamed from: a */
    public final byte[] mo33924a() {
        byte[] bArr = this._unquotedUTF8Ref;
        if (bArr != null) {
            return bArr;
        }
        byte[] c = C6813f.m25612d().mo33914c(this._value);
        this._unquotedUTF8Ref = c;
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this._value.equals(((C6818k) obj)._value);
    }

    public final String getValue() {
        return this._value;
    }

    public final int hashCode() {
        return this._value.hashCode();
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        return new C6818k(this.f15855a);
    }

    public final String toString() {
        return this._value;
    }
}

package com.fasterxml.jackson.core;

import java.io.IOException;

public class JsonProcessingException extends IOException {
    static final long serialVersionUID = 123;
    protected C6801d _location;

    protected JsonProcessingException(String str, C6801d dVar, Throwable th) {
        super(str);
        if (th != null) {
            initCause(th);
        }
        this._location = dVar;
    }

    /* renamed from: a */
    public C6801d mo33804a() {
        return this._location;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo33805b() {
        return null;
    }

    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        C6801d a = mo33804a();
        String b = mo33805b();
        if (a == null && b == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(message);
        if (b != null) {
            sb.append(b);
        }
        if (a != null) {
            sb.append(10);
            sb.append(" at ");
            sb.append(a.toString());
        }
        return sb.toString();
    }

    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    protected JsonProcessingException(String str, C6801d dVar) {
        this(str, dVar, (Throwable) null);
    }
}

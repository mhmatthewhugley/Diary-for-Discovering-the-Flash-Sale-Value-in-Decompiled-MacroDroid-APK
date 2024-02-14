package com.android.p023dx.p024cf.iface;

import com.android.dex.util.ExceptionWithContext;

/* renamed from: com.android.dx.cf.iface.ParseException */
public class ParseException extends ExceptionWithContext {
    public ParseException(String str) {
        super(str);
    }

    public ParseException(Throwable th) {
        super(th);
    }

    public ParseException(String str, Throwable th) {
        super(str, th);
    }
}

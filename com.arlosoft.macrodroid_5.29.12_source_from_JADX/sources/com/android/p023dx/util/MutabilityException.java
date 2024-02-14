package com.android.p023dx.util;

import com.android.dex.util.ExceptionWithContext;

/* renamed from: com.android.dx.util.MutabilityException */
public class MutabilityException extends ExceptionWithContext {
    public MutabilityException(String str) {
        super(str);
    }

    public MutabilityException(Throwable th) {
        super(th);
    }

    public MutabilityException(String str, Throwable th) {
        super(str, th);
    }
}

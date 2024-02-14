package com.google.android.play.core.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.play:core@@1.10.3 */
public abstract class zzcm implements Closeable {
    /* renamed from: b */
    public abstract long mo59655b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract InputStream mo59656c(long j, long j2) throws IOException;

    /* renamed from: e */
    public final synchronized InputStream mo59862e() throws IOException {
        return mo59656c(0, mo59655b());
    }
}

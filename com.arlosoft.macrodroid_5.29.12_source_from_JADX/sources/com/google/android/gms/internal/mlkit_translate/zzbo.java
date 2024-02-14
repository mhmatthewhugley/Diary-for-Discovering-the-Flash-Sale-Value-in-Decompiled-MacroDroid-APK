package com.google.android.gms.internal.mlkit_translate;

import java.io.IOException;
import java.io.StringWriter;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public class zzbo {
    /* renamed from: c */
    public final zzbr mo52101c() {
        if (this instanceof zzbr) {
            return (zzbr) this;
        }
        toString();
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            zzdv zzdv = new zzdv(stringWriter);
            zzdv.mo52198o(true);
            zzdr.f43219V.mo52122b(zzdv, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}

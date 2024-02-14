package com.google.android.gms.internal.mlkit_translate;

import java.io.IOException;
import java.io.StringReader;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzbt {
    /* renamed from: a */
    public static zzbo m61649a(zzdt zzdt) throws zzbp, zzbv {
        boolean r = zzdt.mo52183r();
        zzdt.mo52181o(true);
        try {
            zzbo a = zzcj.m61673a(zzdt);
            zzdt.mo52181o(r);
            return a;
        } catch (StackOverflowError e) {
            throw new zzbs("Failed parsing JSON source: " + zzdt + " to Json", e);
        } catch (OutOfMemoryError e2) {
            throw new zzbs("Failed parsing JSON source: " + zzdt + " to Json", e2);
        } catch (Throwable th) {
            zzdt.mo52181o(r);
            throw th;
        }
    }

    /* renamed from: b */
    public static zzbo m61650b(String str) throws zzbv {
        try {
            zzdt zzdt = new zzdt(new StringReader(str));
            zzbo a = m61649a(zzdt);
            if (!(a instanceof zzbq)) {
                if (zzdt.mo52186u() != 10) {
                    throw new zzbv("Did not consume the entire document.");
                }
            }
            return a;
        } catch (zzdw e) {
            throw new zzbv((Throwable) e);
        } catch (IOException e2) {
            throw new zzbp(e2);
        } catch (NumberFormatException e3) {
            throw new zzbv((Throwable) e3);
        }
    }
}

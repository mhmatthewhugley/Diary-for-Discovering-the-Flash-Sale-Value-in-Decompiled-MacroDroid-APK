package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class VersionInfo {

    /* renamed from: a */
    protected int f1714a;

    /* renamed from: b */
    protected int f1715b;

    /* renamed from: c */
    protected int f1716c;

    /* renamed from: a */
    public int mo19748a() {
        return this.f1714a;
    }

    /* renamed from: b */
    public int mo19749b() {
        return this.f1716c;
    }

    /* renamed from: c */
    public int mo19750c() {
        return this.f1715b;
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "%d.%d.%d", new Object[]{Integer.valueOf(this.f1714a), Integer.valueOf(this.f1715b), Integer.valueOf(this.f1716c)});
    }
}

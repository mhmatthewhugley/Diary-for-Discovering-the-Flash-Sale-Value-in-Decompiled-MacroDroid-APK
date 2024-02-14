package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzfwv implements Comparator {
    protected zzfwv() {
    }

    /* renamed from: b */
    public static zzfwv m51207b(Comparator comparator) {
        if (comparator instanceof zzfwv) {
            return (zzfwv) comparator;
        }
        return new zzfuz(comparator);
    }

    /* renamed from: c */
    public static zzfwv m51208c() {
        return zzfwt.f36501a;
    }

    /* renamed from: a */
    public zzfwv mo46509a() {
        return new zzfxe(this);
    }

    public abstract int compare(Object obj, Object obj2);
}

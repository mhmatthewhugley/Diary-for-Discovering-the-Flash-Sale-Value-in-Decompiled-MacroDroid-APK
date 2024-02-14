package com.google.android.play.core.internal;

import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzcq implements zzcs, zzco {

    /* renamed from: c */
    private static final Object f51711c = new Object();

    /* renamed from: a */
    private volatile zzcs f51712a;

    /* renamed from: b */
    private volatile Object f51713b = f51711c;

    private zzcq(zzcs zzcs) {
        this.f51712a = zzcs;
    }

    /* renamed from: a */
    public static zzco m70942a(zzcs zzcs) {
        if (zzcs instanceof zzco) {
            return (zzco) zzcs;
        }
        Objects.requireNonNull(zzcs);
        return new zzcq(zzcs);
    }

    /* renamed from: b */
    public static zzcs m70943b(zzcs zzcs) {
        Objects.requireNonNull(zzcs);
        if (zzcs instanceof zzcq) {
            return zzcs;
        }
        return new zzcq(zzcs);
    }

    public final Object zza() {
        Object obj = this.f51713b;
        Object obj2 = f51711c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f51713b;
                if (obj == obj2) {
                    obj = this.f51712a.zza();
                    Object obj3 = this.f51713b;
                    if (obj3 != obj2) {
                        if (obj3 != obj) {
                            String valueOf = String.valueOf(obj3);
                            String valueOf2 = String.valueOf(obj);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f51713b = obj;
                    this.f51712a = null;
                }
            }
        }
        return obj;
    }
}

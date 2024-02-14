package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfuv extends zzfuj {

    /* renamed from: a */
    private final Object f36446a;

    /* renamed from: c */
    private int f36447c;

    /* renamed from: d */
    final /* synthetic */ zzfux f36448d;

    zzfuv(zzfux zzfux, int i) {
        this.f36448d = zzfux;
        this.f36446a = zzfux.m51049i(zzfux, i);
        this.f36447c = i;
    }

    /* renamed from: a */
    private final void m51038a() {
        int i = this.f36447c;
        if (i == -1 || i >= this.f36448d.size() || !zzfss.m50929a(this.f36446a, zzfux.m51049i(this.f36448d, this.f36447c))) {
            this.f36447c = this.f36448d.m51059z(this.f36446a);
        }
    }

    public final Object getKey() {
        return this.f36446a;
    }

    public final Object getValue() {
        Map n = this.f36448d.mo46381n();
        if (n != null) {
            return n.get(this.f36446a);
        }
        m51038a();
        int i = this.f36447c;
        if (i == -1) {
            return null;
        }
        return zzfux.m51052l(this.f36448d, i);
    }

    public final Object setValue(Object obj) {
        Map n = this.f36448d.mo46381n();
        if (n != null) {
            return n.put(this.f36446a, obj);
        }
        m51038a();
        int i = this.f36447c;
        if (i == -1) {
            this.f36448d.put(this.f36446a, obj);
            return null;
        }
        Object l = zzfux.m51052l(this.f36448d, i);
        zzfux.m51054p(this.f36448d, this.f36447c, obj);
        return l;
    }
}

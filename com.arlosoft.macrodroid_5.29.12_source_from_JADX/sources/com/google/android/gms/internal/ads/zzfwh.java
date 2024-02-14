package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class zzfwh extends AbstractMap {

    /* renamed from: a */
    private transient Set f36495a;

    /* renamed from: c */
    private transient Set f36496c;

    /* renamed from: d */
    private transient Collection f36497d;

    zzfwh() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Set mo46209a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Set mo46232b() {
        return new zzfwf(this);
    }

    public final Set entrySet() {
        Set set = this.f36495a;
        if (set != null) {
            return set;
        }
        Set a = mo46209a();
        this.f36495a = a;
        return a;
    }

    public Set keySet() {
        Set set = this.f36496c;
        if (set != null) {
            return set;
        }
        Set b = mo46232b();
        this.f36496c = b;
        return b;
    }

    public final Collection values() {
        Collection collection = this.f36497d;
        if (collection != null) {
            return collection;
        }
        zzfwg zzfwg = new zzfwg(this);
        this.f36497d = zzfwg;
        return zzfwg;
    }
}

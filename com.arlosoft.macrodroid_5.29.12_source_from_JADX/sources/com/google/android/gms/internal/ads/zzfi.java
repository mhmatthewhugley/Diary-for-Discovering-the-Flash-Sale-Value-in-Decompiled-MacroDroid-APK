package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfi extends zzfvd {

    /* renamed from: a */
    private final Map f35804a;

    public zzfi(Map map) {
        this.f35804a = map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo45754b() {
        return this.f35804a;
    }

    public final boolean containsKey(@Nullable Object obj) {
        return obj != null && super.containsKey(obj);
    }

    public final boolean containsValue(@Nullable Object obj) {
        return super.mo46401f(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Map mo45757d() {
        return this.f35804a;
    }

    public final Set entrySet() {
        return zzfxi.m51243b(this.f35804a.entrySet(), zzfg.f35732a);
    }

    public final boolean equals(@Nullable Object obj) {
        return obj != null && super.mo46402g(obj);
    }

    @Nullable
    public final /* synthetic */ Object get(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f35804a.get(obj);
    }

    public final int hashCode() {
        return super.mo46400e();
    }

    public final boolean isEmpty() {
        if (this.f35804a.isEmpty() || (super.size() == 1 && super.containsKey((Object) null))) {
            return true;
        }
        return false;
    }

    public final Set keySet() {
        return zzfxi.m51243b(this.f35804a.keySet(), zzfh.f35773a);
    }

    public final int size() {
        return super.size() - (super.containsKey((Object) null) ? 1 : 0);
    }
}

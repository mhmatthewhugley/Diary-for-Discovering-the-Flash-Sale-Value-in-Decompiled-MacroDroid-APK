package com.google.android.play.core.splitinstall.testing;

import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zza extends zzs {

    /* renamed from: a */
    private Integer f51815a;

    /* renamed from: b */
    private Map f51816b;

    zza() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzs mo59980a(int i) {
        this.f51815a = Integer.valueOf(i);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final zzs mo59981b(Map map) {
        Objects.requireNonNull(map, "Null splitInstallErrorCodeByModule");
        this.f51816b = map;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final zzt mo59982c() {
        if (this.f51816b != null) {
            return new zzc(this.f51815a, this.f51816b, (zzb) null);
        }
        throw new IllegalStateException("Missing required properties: splitInstallErrorCodeByModule");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Map mo59983d() {
        Map map = this.f51816b;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
    }
}

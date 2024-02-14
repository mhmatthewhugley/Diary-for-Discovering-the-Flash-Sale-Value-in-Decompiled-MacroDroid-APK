package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfmc {

    /* renamed from: a */
    private JSONObject f36095a;

    /* renamed from: b */
    private final zzfml f36096b;

    public zzfmc(zzfml zzfml) {
        this.f36096b = zzfml;
    }

    @VisibleForTesting
    /* renamed from: a */
    public final JSONObject mo45957a() {
        return this.f36095a;
    }

    /* renamed from: b */
    public final void mo45958b() {
        this.f36096b.mo45974b(new zzfmm(this, (byte[]) null));
    }

    /* renamed from: c */
    public final void mo45959c(JSONObject jSONObject, HashSet hashSet, long j) {
        this.f36096b.mo45974b(new zzfmn(this, hashSet, jSONObject, j, (byte[]) null));
    }

    /* renamed from: d */
    public final void mo45960d(JSONObject jSONObject, HashSet hashSet, long j) {
        this.f36096b.mo45974b(new zzfmo(this, hashSet, jSONObject, j, (byte[]) null));
    }

    @VisibleForTesting
    /* renamed from: e */
    public final void mo45961e(JSONObject jSONObject) {
        this.f36095a = jSONObject;
    }
}

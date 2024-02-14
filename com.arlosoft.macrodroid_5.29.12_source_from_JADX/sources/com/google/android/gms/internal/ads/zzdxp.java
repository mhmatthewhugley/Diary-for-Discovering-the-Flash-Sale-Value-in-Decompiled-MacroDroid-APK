package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdxp {

    /* renamed from: a */
    private final Map f33330a = new ConcurrentHashMap();

    /* renamed from: b */
    final /* synthetic */ zzdxq f33331b;

    @VisibleForTesting
    zzdxp(zzdxq zzdxq) {
        this.f33331b = zzdxq;
    }

    /* renamed from: b */
    public final zzdxp mo45041b(String str, String str2) {
        this.f33330a.put(str, str2);
        return this;
    }

    /* renamed from: c */
    public final zzdxp mo45042c(String str, @Nullable String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f33330a.put(str, str2);
        }
        return this;
    }

    /* renamed from: d */
    public final zzdxp mo45043d(zzfdk zzfdk) {
        this.f33330a.put("aai", zzfdk.f35558x);
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27098d6)).booleanValue()) {
            mo45042c("rid", zzfdk.f35550p0);
        }
        return this;
    }

    /* renamed from: e */
    public final zzdxp mo45044e(zzfdn zzfdn) {
        this.f33330a.put("gqi", zzfdn.f35566b);
        return this;
    }

    /* renamed from: f */
    public final String mo45045f() {
        return this.f33331b.f33332a.mo45053b(this.f33330a);
    }

    /* renamed from: g */
    public final void mo45046g() {
        this.f33331b.f33333b.execute(new zzdxo(this));
    }

    /* renamed from: h */
    public final void mo45047h() {
        this.f33331b.f33333b.execute(new zzdxn(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo45048i() {
        this.f33331b.f33332a.mo45056e(this.f33330a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo45049j() {
        this.f33331b.f33332a.mo45055d(this.f33330a);
    }
}

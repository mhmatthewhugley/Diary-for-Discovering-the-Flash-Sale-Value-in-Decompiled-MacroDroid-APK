package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeqx implements zzevd {
    @Nullable
    @VisibleForTesting

    /* renamed from: a */
    final String f34738a;
    @VisibleForTesting

    /* renamed from: b */
    final int f34739b;

    public zzeqx(@Nullable String str, int i) {
        this.f34738a = str;
        this.f34739b = i;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!TextUtils.isEmpty(this.f34738a) && this.f34739b != -1) {
            Bundle a = zzfeq.m50020a(bundle, "pii");
            bundle.putBundle("pii", a);
            a.putString("pvid", this.f34738a);
            a.putInt("pvid_s", this.f34739b);
        }
    }
}

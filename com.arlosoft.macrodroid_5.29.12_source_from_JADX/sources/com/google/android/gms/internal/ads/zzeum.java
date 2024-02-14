package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeum implements zzevd {
    @Nullable

    /* renamed from: a */
    private final String f34954a;

    public zzeum(@Nullable String str) {
        this.f34954a = str;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!TextUtils.isEmpty(this.f34954a)) {
            bundle.putString("query_info", this.f34954a);
        }
    }
}

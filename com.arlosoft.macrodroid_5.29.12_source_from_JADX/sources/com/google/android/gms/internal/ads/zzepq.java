package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzepq implements zzevd {
    @Nullable

    /* renamed from: a */
    private final String f34664a;

    public zzepq(@Nullable String str) {
        this.f34664a = str;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f34664a;
        if (str != null) {
            bundle.putString("arek", str);
        }
    }
}

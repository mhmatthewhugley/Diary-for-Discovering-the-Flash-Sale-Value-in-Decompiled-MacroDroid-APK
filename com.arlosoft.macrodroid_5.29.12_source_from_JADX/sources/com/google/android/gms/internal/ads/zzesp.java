package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzesp implements zzevd {

    /* renamed from: a */
    private final Boolean f34847a;

    public zzesp(Boolean bool) {
        this.f34847a = bool;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        Bundle bundle = (Bundle) obj;
        Boolean bool = this.f34847a;
        if (bool != null) {
            bundle.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}

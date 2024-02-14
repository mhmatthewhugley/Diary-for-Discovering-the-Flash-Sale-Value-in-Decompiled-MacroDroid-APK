package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzest implements zzevd {

    /* renamed from: a */
    private final String f34855a;

    /* renamed from: b */
    private final boolean f34856b;

    /* renamed from: c */
    private final boolean f34857c;

    public zzest(String str, boolean z, boolean z2) {
        this.f34855a = str;
        this.f34856b = z;
        this.f34857c = z2;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.f34855a.isEmpty()) {
            bundle.putString("inspector_extras", this.f34855a);
        }
        bundle.putInt("test_mode", this.f34856b ? 1 : 0);
        bundle.putInt("linked_device", this.f34857c ? 1 : 0);
    }
}

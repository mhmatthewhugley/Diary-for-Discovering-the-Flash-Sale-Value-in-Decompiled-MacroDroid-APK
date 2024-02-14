package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfli {

    /* renamed from: a */
    private final zzfmp f36054a;

    /* renamed from: b */
    private final String f36055b;

    /* renamed from: c */
    private final zzfkx f36056c;

    /* renamed from: d */
    private final String f36057d = "Ad overlay";

    public zzfli(View view, zzfkx zzfkx, @Nullable String str) {
        this.f36054a = new zzfmp(view);
        this.f36055b = view.getClass().getCanonicalName();
        this.f36056c = zzfkx;
    }

    /* renamed from: a */
    public final zzfkx mo45908a() {
        return this.f36056c;
    }

    /* renamed from: b */
    public final zzfmp mo45909b() {
        return this.f36054a;
    }

    /* renamed from: c */
    public final String mo45910c() {
        return this.f36057d;
    }

    /* renamed from: d */
    public final String mo45911d() {
        return this.f36055b;
    }
}

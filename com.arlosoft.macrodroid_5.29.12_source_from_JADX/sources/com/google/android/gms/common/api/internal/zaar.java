package com.google.android.gms.common.api.internal;

import androidx.annotation.BinderThread;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zaar extends zac {

    /* renamed from: a */
    private final WeakReference f3286a;

    zaar(zaaw zaaw) {
        this.f3286a = new WeakReference(zaaw);
    }

    @BinderThread
    /* renamed from: C2 */
    public final void mo21446C2(zak zak) {
        zaaw zaaw = (zaaw) this.f3286a.get();
        if (zaaw != null) {
            zaaw.f3289a.mo21462q(new zaaq(this, zaaw, zaaw, zak));
        }
    }
}

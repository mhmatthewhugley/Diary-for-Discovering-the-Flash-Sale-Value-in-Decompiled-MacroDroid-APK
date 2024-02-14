package com.google.android.play.core.internal;

import androidx.annotation.Nullable;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
public abstract class zzah implements Runnable {
    @Nullable

    /* renamed from: a */
    private final zzi f51660a;

    zzah() {
        this.f51660a = null;
    }

    public zzah(@Nullable zzi zzi) {
        this.f51660a = zzi;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo59556a();

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public final zzi mo59810b() {
        return this.f51660a;
    }

    /* renamed from: c */
    public final void mo59811c(Exception exc) {
        zzi zzi = this.f51660a;
        if (zzi != null) {
            zzi.mo60033d(exc);
        }
    }

    public final void run() {
        try {
            mo59556a();
        } catch (Exception e) {
            mo59811c(e);
        }
    }
}

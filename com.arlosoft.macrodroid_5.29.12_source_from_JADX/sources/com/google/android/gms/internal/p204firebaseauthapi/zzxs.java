package com.google.android.gms.internal.p204firebaseauthapi;

import android.app.Activity;
import androidx.annotation.MainThread;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxs */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzxs extends LifecycleCallback {

    /* renamed from: c */
    private final List f40610c;

    private zzxs(LifecycleFragment lifecycleFragment, List list) {
        super(lifecycleFragment);
        this.f3200a.mo21373t("PhoneAuthActivityStopCallback", this);
        this.f40610c = list;
    }

    /* renamed from: l */
    public static void m58411l(Activity activity, List list) {
        LifecycleFragment c = LifecycleCallback.m3791c(activity);
        if (((zzxs) c.mo21374u("PhoneAuthActivityStopCallback", zzxs.class)) == null) {
            new zzxs(c, list);
        }
    }

    @MainThread
    /* renamed from: k */
    public final void mo21370k() {
        synchronized (this.f40610c) {
            this.f40610c.clear();
        }
    }
}

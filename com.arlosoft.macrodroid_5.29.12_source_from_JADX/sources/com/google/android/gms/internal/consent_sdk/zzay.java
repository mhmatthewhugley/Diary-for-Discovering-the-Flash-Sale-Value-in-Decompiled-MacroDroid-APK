package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import androidx.annotation.UiThread;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import java.util.concurrent.atomic.AtomicReference;

@UiThread
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class zzay implements ConsentForm {

    /* renamed from: a */
    private final Application f39333a;

    /* renamed from: b */
    private final zzbi f39334b;

    /* renamed from: c */
    private final zzam f39335c;

    /* renamed from: d */
    private Dialog f39336d;

    /* renamed from: e */
    private zzbg f39337e;

    /* renamed from: f */
    private final AtomicReference<zzax> f39338f;

    /* renamed from: g */
    private final AtomicReference<ConsentForm.OnConsentFormDismissedListener> f39339g;

    /* renamed from: h */
    private final AtomicReference<zzaw> f39340h;

    /* renamed from: f */
    private final void m55941f() {
        Dialog dialog = this.f39336d;
        if (dialog != null) {
            dialog.dismiss();
            this.f39336d = null;
        }
        this.f39334b.mo48703a((Activity) null);
        zzaw andSet = this.f39340h.getAndSet((Object) null);
        if (andSet != null) {
            andSet.f39330c.f39333a.unregisterActivityLifecycleCallbacks(andSet);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzbg mo48689a() {
        return this.f39337e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo48690b(int i) {
        m55941f();
        ConsentForm.OnConsentFormDismissedListener andSet = this.f39339g.getAndSet((Object) null);
        if (andSet != null) {
            this.f39335c.mo48677d(3);
            andSet.mo60045a((FormError) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo48691c(zzj zzj) {
        m55941f();
        ConsentForm.OnConsentFormDismissedListener andSet = this.f39339g.getAndSet((Object) null);
        if (andSet != null) {
            andSet.mo60045a(zzj.mo48720a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo48692d() {
        zzax andSet = this.f39338f.getAndSet((Object) null);
        if (andSet != null) {
            andSet.mo48688b(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo48693e(zzj zzj) {
        zzax andSet = this.f39338f.getAndSet((Object) null);
        if (andSet != null) {
            andSet.mo48687a(zzj.mo48720a());
        }
    }
}

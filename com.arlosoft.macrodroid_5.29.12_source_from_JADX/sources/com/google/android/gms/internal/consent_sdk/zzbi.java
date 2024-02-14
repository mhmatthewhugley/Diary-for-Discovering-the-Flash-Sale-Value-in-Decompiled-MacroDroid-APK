package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class zzbi extends ContextWrapper {

    /* renamed from: a */
    private Activity f39351a;

    /* renamed from: a */
    public final void mo48703a(Activity activity) {
        this.f39351a = activity;
    }

    public final Object getSystemService(String str) {
        Activity activity = this.f39351a;
        if (activity != null) {
            return activity.getSystemService(str);
        }
        return super.getSystemService(str);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.f39351a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        super.startActivity(intent);
    }
}

package com.google.firebase.auth.internal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p204firebaseauthapi.zzxc;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzaw extends BroadcastReceiver {

    /* renamed from: a */
    private final WeakReference f4621a;

    /* renamed from: b */
    private final TaskCompletionSource f4622b;

    /* renamed from: c */
    final /* synthetic */ zzax f4623c;

    zzaw(zzax zzax, Activity activity, TaskCompletionSource taskCompletionSource) {
        this.f4623c = zzax;
        this.f4621a = new WeakReference(activity);
        this.f4622b = taskCompletionSource;
    }

    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f4621a.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f4622b.mo56138b(zzxc.m58359a(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            zzax.m6189e(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
                this.f4622b.mo56139c(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
                zzax.m6189e(context);
                return;
            }
            TaskCompletionSource taskCompletionSource = this.f4622b;
            taskCompletionSource.mo56138b(zzxc.m58359a(zzai.m6170a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
        } else if (zzbl.m6231d(intent)) {
            this.f4622b.mo56138b(zzxc.m58359a(zzbl.m6228a(intent)));
            zzax.m6189e(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
            this.f4622b.mo56138b(zzxc.m58359a(zzai.m6170a("WEB_CONTEXT_CANCELED")));
            zzax.m6189e(context);
        }
    }
}

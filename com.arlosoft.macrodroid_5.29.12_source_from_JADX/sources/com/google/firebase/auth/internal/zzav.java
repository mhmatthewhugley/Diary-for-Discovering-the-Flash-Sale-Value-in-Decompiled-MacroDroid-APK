package com.google.firebase.auth.internal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p204firebaseauthapi.zzxc;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.lang.ref.WeakReference;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzav extends BroadcastReceiver {

    /* renamed from: a */
    private final WeakReference f4616a;

    /* renamed from: b */
    private final TaskCompletionSource f4617b;

    /* renamed from: c */
    private final FirebaseAuth f4618c;

    /* renamed from: d */
    private final FirebaseUser f4619d;

    /* renamed from: e */
    final /* synthetic */ zzax f4620e;

    zzav(zzax zzax, Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        this.f4620e = zzax;
        this.f4616a = new WeakReference(activity);
        this.f4617b = taskCompletionSource;
        this.f4618c = firebaseAuth;
        this.f4619d = firebaseUser;
    }

    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f4616a.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f4617b.mo56138b(zzxc.m58359a(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            zzax.m6189e(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
                this.f4618c.mo22626s(zzax.m6191i(intent)).mo23708i(new zzaq(this.f4620e, this.f4617b, context)).mo23705f(new zzap(this.f4620e, this.f4617b, context));
            } else if ("com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra)) {
                this.f4619d.mo22656t2(zzax.m6191i(intent)).mo23708i(new zzas(this.f4620e, this.f4617b, context)).mo23705f(new zzar(this.f4620e, this.f4617b, context));
            } else if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
                this.f4619d.mo22657u2(zzax.m6191i(intent)).mo23708i(new zzau(this.f4620e, this.f4617b, context)).mo23705f(new zzat(this.f4620e, this.f4617b, context));
            } else {
                TaskCompletionSource taskCompletionSource = this.f4617b;
                taskCompletionSource.mo56138b(zzxc.m58359a(zzai.m6170a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
            }
        } else if (zzbl.m6231d(intent)) {
            this.f4617b.mo56138b(zzxc.m58359a(zzbl.m6228a(intent)));
            zzax.m6189e(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
            this.f4617b.mo56138b(zzxc.m58359a(zzai.m6170a("WEB_CONTEXT_CANCELED")));
            zzax.m6189e(context);
        }
    }
}

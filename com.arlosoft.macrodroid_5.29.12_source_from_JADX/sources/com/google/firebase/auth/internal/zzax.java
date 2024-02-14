package com.google.firebase.auth.internal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.VisibleForTesting;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.p204firebaseauthapi.zzaay;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.zze;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzax {

    /* renamed from: c */
    private static zzax f4624c;

    /* renamed from: a */
    private boolean f4625a = false;

    /* renamed from: b */
    private BroadcastReceiver f4626b;

    private zzax() {
    }

    /* renamed from: a */
    public static zzax m6185a() {
        if (f4624c == null) {
            f4624c = new zzax();
        }
        return f4624c;
    }

    @VisibleForTesting
    /* renamed from: e */
    static void m6189e(Context context) {
        zzax zzax = f4624c;
        zzax.f4625a = false;
        if (zzax.f4626b != null) {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(f4624c.f4626b);
        }
        f4624c.f4626b = null;
    }

    /* renamed from: h */
    private final void m6190h(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.f4626b = broadcastReceiver;
        LocalBroadcastManager.getInstance(activity).registerReceiver(broadcastReceiver, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
    }

    /* renamed from: i */
    private static final AuthCredential m6191i(Intent intent) {
        Preconditions.m4488k(intent);
        zzaay zzaay = (zzaay) SafeParcelableSerializer.m4590b(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", zzaay.CREATOR);
        zzaay.mo48812o2(true);
        return zze.m6315p2(zzaay);
    }

    /* renamed from: f */
    public final boolean mo22754f(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (this.f4625a) {
            return false;
        }
        m6190h(activity, new zzav(this, activity, taskCompletionSource, firebaseAuth, firebaseUser));
        this.f4625a = true;
        return true;
    }

    /* renamed from: g */
    public final boolean mo22755g(Activity activity, TaskCompletionSource taskCompletionSource) {
        if (this.f4625a) {
            return false;
        }
        m6190h(activity, new zzaw(this, activity, taskCompletionSource));
        this.f4625a = true;
        return true;
    }
}

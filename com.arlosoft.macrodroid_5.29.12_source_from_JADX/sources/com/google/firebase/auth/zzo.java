package com.google.firebase.auth;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.zze;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzo implements OnCompleteListener {

    /* renamed from: a */
    final /* synthetic */ String f4732a;

    /* renamed from: c */
    final /* synthetic */ long f4733c;

    /* renamed from: d */
    final /* synthetic */ TimeUnit f4734d;

    /* renamed from: f */
    final /* synthetic */ PhoneAuthProvider.OnVerificationStateChangedCallbacks f4735f;

    /* renamed from: g */
    final /* synthetic */ Activity f4736g;

    /* renamed from: o */
    final /* synthetic */ Executor f4737o;

    /* renamed from: p */
    final /* synthetic */ boolean f4738p;

    /* renamed from: s */
    final /* synthetic */ FirebaseAuth f4739s;

    zzo(FirebaseAuth firebaseAuth, String str, long j, TimeUnit timeUnit, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Activity activity, Executor executor, boolean z) {
        this.f4739s = firebaseAuth;
        this.f4732a = str;
        this.f4733c = j;
        this.f4734d = timeUnit;
        this.f4735f = onVerificationStateChangedCallbacks;
        this.f4736g = activity;
        this.f4737o = executor;
        this.f4738p = z;
    }

    /* renamed from: a */
    public final void mo21120a(Task task) {
        String str;
        String str2;
        if (!task.mo23719t()) {
            Log.e("FirebaseAuth", "Error while validating application identity: ".concat(String.valueOf(task.mo23714o() != null ? task.mo23714o().getMessage() : "")));
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
            str2 = null;
            str = null;
        } else {
            String b = ((zze) task.mo23715p()).mo22785b();
            str2 = ((zze) task.mo23715p()).mo22784a();
            str = b;
        }
        this.f4739s.mo22596H(this.f4732a, this.f4733c, this.f4734d, this.f4735f, this.f4736g, this.f4737o, this.f4738p, str2, str);
    }
}

package com.google.firebase.auth;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.zzag;
import com.google.firebase.auth.internal.zze;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzp implements OnCompleteListener {

    /* renamed from: a */
    final /* synthetic */ PhoneAuthOptions f4740a;

    /* renamed from: c */
    final /* synthetic */ FirebaseAuth f4741c;

    zzp(FirebaseAuth firebaseAuth, PhoneAuthOptions phoneAuthOptions) {
        this.f4741c = firebaseAuth;
        this.f4740a = phoneAuthOptions;
    }

    /* renamed from: a */
    public final void mo21120a(Task task) {
        String str;
        String str2;
        if (!task.mo23719t()) {
            String str3 = "Error while validating application identity: ";
            if (task.mo23714o() != null) {
                str3 = str3.concat(String.valueOf(task.mo23714o().getMessage()));
            }
            Log.e("FirebaseAuth", str3);
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
            str2 = null;
            str = null;
        } else {
            String b = ((zze) task.mo23715p()).mo22785b();
            str = ((zze) task.mo23715p()).mo22784a();
            str2 = b;
        }
        long longValue = this.f4740a.mo22691h().longValue();
        PhoneAuthProvider.OnVerificationStateChangedCallbacks T = this.f4741c.m5987J(this.f4740a.mo22692i(), this.f4740a.mo22689f());
        zzag zzag = (zzag) Preconditions.m4488k(this.f4740a.mo22687d());
        if (zzag.mo22741p2()) {
            this.f4741c.f4502e.mo49950e(zzag, (String) Preconditions.m4488k(this.f4740a.mo22692i()), this.f4741c.f4506i, longValue, this.f4740a.mo22688e() != null, this.f4740a.mo22694k(), str2, str, this.f4741c.mo22597I(), T, this.f4740a.mo22693j(), this.f4740a.mo22685b());
        } else {
            this.f4741c.f4502e.mo49951f(zzag, (PhoneMultiFactorInfo) Preconditions.m4488k(this.f4740a.mo22690g()), this.f4741c.f4506i, longValue, this.f4740a.mo22688e() != null, this.f4740a.mo22694k(), str2, str, this.f4741c.mo22597I(), T, this.f4740a.mo22693j(), this.f4740a.mo22685b());
        }
    }
}

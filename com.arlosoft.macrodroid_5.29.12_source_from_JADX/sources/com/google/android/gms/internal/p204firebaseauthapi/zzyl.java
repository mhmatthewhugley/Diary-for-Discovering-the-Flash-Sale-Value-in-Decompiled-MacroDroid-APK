package com.google.android.gms.internal.p204firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzyl {
    /* renamed from: a */
    public static zzabg m58481a(PhoneAuthCredential phoneAuthCredential) {
        if (!TextUtils.isEmpty(phoneAuthCredential.mo22682u2())) {
            return zzabg.m56098b(phoneAuthCredential.mo22680s2(), phoneAuthCredential.mo22682u2(), phoneAuthCredential.mo22683v2());
        }
        return zzabg.m56097a(phoneAuthCredential.mo22681t2(), phoneAuthCredential.mo22677n2(), phoneAuthCredential.mo22683v2());
    }
}

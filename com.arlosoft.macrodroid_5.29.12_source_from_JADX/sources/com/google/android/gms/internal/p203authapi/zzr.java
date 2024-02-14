package com.google.android.gms.internal.p203authapi;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* renamed from: com.google.android.gms.internal.auth-api.zzr */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzr {
    /* renamed from: a */
    public static PendingIntent m55741a(Context context, @Nullable Auth.AuthCredentialsOptions authCredentialsOptions, HintRequest hintRequest, @Nullable String str) {
        String str2;
        String str3;
        Preconditions.m4489l(context, "context must not be null");
        Preconditions.m4489l(hintRequest, "request must not be null");
        if (authCredentialsOptions == null) {
            str2 = null;
        } else {
            str2 = authCredentialsOptions.mo20772d();
        }
        if (TextUtils.isEmpty(str)) {
            str3 = zzba.m55706a();
        } else {
            str3 = (String) Preconditions.m4488k(str);
        }
        Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", str2);
        putExtra.putExtra("logSessionId", str3);
        SafeParcelableSerializer.m4594f(hintRequest, putExtra, "com.google.android.gms.credentials.HintRequest");
        return PendingIntent.getActivity(context, 2000, putExtra, 134217728);
    }
}

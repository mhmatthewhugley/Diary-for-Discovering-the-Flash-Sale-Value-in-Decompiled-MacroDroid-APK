package com.google.android.gms.internal.p204firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzyk {

    /* renamed from: a */
    private final String f40647a;

    /* renamed from: b */
    private final String f40648b;

    public zzyk(Context context, String str) {
        Preconditions.m4488k(context);
        String g = Preconditions.m4484g(str);
        this.f40647a = g;
        try {
            byte[] a = AndroidUtilsLight.m4839a(context, g);
            if (a == null) {
                Log.e("FBA-PackageInfo", "single cert required: ".concat(String.valueOf(str)));
                this.f40648b = null;
                return;
            }
            this.f40648b = Hex.m4886c(a, false);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: ".concat(String.valueOf(str)));
            this.f40648b = null;
        }
    }

    @Nullable
    /* renamed from: a */
    public final String mo50075a() {
        return this.f40648b;
    }

    /* renamed from: b */
    public final String mo50076b() {
        return this.f40647a;
    }
}

package com.google.firebase.auth.internal;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzbe {

    /* renamed from: a */
    private boolean f4640a;
    @Nullable

    /* renamed from: b */
    private String f4641b;

    private zzbe() {
    }

    @Nullable
    /* renamed from: a */
    public static zzbe m6209a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map b = zzaz.m6196b(str);
        try {
            zzbe zzbe = new zzbe();
            Object obj = b.get("basicIntegrity");
            boolean z = false;
            if (obj != null && ((Boolean) obj).booleanValue()) {
                z = true;
            }
            zzbe.f4640a = z;
            String str2 = (String) b.get("advice");
            if (str2 == null) {
                str2 = "";
            }
            zzbe.f4641b = str2;
            return zzbe;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: b */
    public final String mo22764b() {
        return this.f4641b;
    }

    /* renamed from: c */
    public final boolean mo22765c() {
        return this.f4640a;
    }
}

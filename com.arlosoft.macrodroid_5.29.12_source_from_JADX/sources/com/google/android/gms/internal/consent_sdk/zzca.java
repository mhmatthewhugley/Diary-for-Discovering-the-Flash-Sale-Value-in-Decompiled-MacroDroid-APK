package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Set;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class zzca {
    @Nullable
    /* renamed from: a */
    public static zzby m55968a(Context context, String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("/", -1);
        int length = split.length;
        if (length == 1) {
            str3 = String.valueOf(context.getPackageName()).concat("_preferences");
            str2 = split[0];
        } else {
            if (length == 2) {
                str3 = split[0];
                str2 = split[1];
            }
            return null;
        }
        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2)) {
            return new zzby(str3, str2);
        }
        return null;
    }

    /* renamed from: b */
    public static void m55969b(Context context, Set<String> set) {
        zzbz zzbz = new zzbz(context);
        for (String next : set) {
            zzby a = m55968a(context, next);
            if (a == null) {
                String valueOf = String.valueOf(next);
                if (valueOf.length() != 0) {
                    "clearKeys: unable to process key: ".concat(valueOf);
                }
            } else {
                zzbz.m55965d(a.f39403a).remove(a.f39404b);
            }
        }
        zzbz.mo48711b();
    }
}

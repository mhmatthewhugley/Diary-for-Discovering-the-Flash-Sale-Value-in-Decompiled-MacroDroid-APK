package com.google.android.gms.internal.p204firebaseauthapi;

import android.app.Activity;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzyp {

    /* renamed from: a */
    private static final Map f40653a = new ArrayMap();

    /* renamed from: a */
    public static PhoneAuthProvider.OnVerificationStateChangedCallbacks m58486a(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, zzyb zzyb) {
        m58490e(str, zzyb);
        return new zzyn(onVerificationStateChangedCallbacks, str);
    }

    /* renamed from: c */
    public static void m58488c() {
        f40653a.clear();
    }

    /* renamed from: d */
    public static boolean m58489d(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Activity activity, Executor executor) {
        Map map = f40653a;
        if (map.containsKey(str)) {
            zzyo zzyo = (zzyo) map.get(str);
            if (DefaultClock.m4871d().mo21950a() - zzyo.f40652b < 120000) {
                zzyb zzyb = zzyo.f40651a;
                if (zzyb == null) {
                    return true;
                }
                zzyb.mo50070g(onVerificationStateChangedCallbacks, activity, executor, str);
                return true;
            }
            m58490e(str, (zzyb) null);
            return false;
        }
        m58490e(str, (zzyb) null);
        return false;
    }

    /* renamed from: e */
    private static void m58490e(String str, @Nullable zzyb zzyb) {
        f40653a.put(str, new zzyo(zzyb, DefaultClock.m4871d().mo21950a()));
    }
}

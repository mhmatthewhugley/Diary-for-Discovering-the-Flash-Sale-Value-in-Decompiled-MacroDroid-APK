package com.arlosoft.macrodroid.utils;

import android.content.Context;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.utils.f1 */
/* compiled from: SigningHelper.kt */
public final class C6380f1 {

    /* renamed from: a */
    public static final C6380f1 f14971a = new C6380f1();

    private C6380f1() {
    }

    /* renamed from: a */
    public final String mo32421a(Context context) {
        C13706o.m87929f(context, "context");
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            C13706o.m87928e(signatureArr, "sigs");
            if (!(!(signatureArr.length == 0))) {
                return null;
            }
            byte[] byteArray = signatureArr[0].toByteArray();
            MessageDigest instance = MessageDigest.getInstance("SHA");
            C13706o.m87928e(instance, "getInstance(\"SHA\")");
            instance.update(byteArray);
            String encodeToString = Base64.encodeToString(instance.digest(), 0);
            C13706o.m87928e(encodeToString, "encodeToString(md.digest(), Base64.DEFAULT)");
            return C15177w.m93672R0(encodeToString).toString();
        } catch (Exception unused) {
            return null;
        }
    }
}

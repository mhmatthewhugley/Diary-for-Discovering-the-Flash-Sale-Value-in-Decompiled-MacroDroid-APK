package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzec {

    /* renamed from: b */
    protected static final AtomicReference f46663b = new AtomicReference();

    /* renamed from: c */
    protected static final AtomicReference f46664c = new AtomicReference();

    /* renamed from: d */
    protected static final AtomicReference f46665d = new AtomicReference();

    /* renamed from: a */
    private final zzeb f46666a;

    public zzec(zzeb zzeb) {
        this.f46666a = zzeb;
    }

    /* renamed from: g */
    private static final String m65544g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.m4488k(strArr);
        Preconditions.m4488k(strArr2);
        Preconditions.m4488k(atomicReference);
        Preconditions.m4478a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            String str3 = strArr[i];
            if (str == str3 || str.equals(str3)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo55084a(Object[] objArr) {
        String str;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = mo55085b(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo55085b(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!this.f46666a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str2 : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(mo55088e(str2));
            sb.append("=");
            Object obj = bundle.get(str2);
            if (obj instanceof Bundle) {
                str = mo55084a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                str = mo55084a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                str = mo55084a(((ArrayList) obj).toArray());
            } else {
                str = String.valueOf(obj);
            }
            sb.append(str);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo55086c(zzaw zzaw) {
        String str;
        if (!this.f46666a.zza()) {
            return zzaw.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzaw.f46481d);
        sb.append(",name=");
        sb.append(mo55087d(zzaw.f46479a));
        sb.append(",params=");
        zzau zzau = zzaw.f46480c;
        if (zzau == null) {
            str = null;
        } else if (!this.f46666a.zza()) {
            str = zzau.toString();
        } else {
            str = mo55085b(zzau.mo55016m2());
        }
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo55087d(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f46666a.zza()) {
            return str;
        }
        return m65544g(str, zzgo.f46903c, zzgo.f46901a, f46663b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo55088e(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f46666a.zza()) {
            return str;
        }
        return m65544g(str, zzgp.f46906b, zzgp.f46905a, f46664c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo55089f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f46666a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m65544g(str, zzgq.f46910b, zzgq.f46909a, f46665d);
        }
        return "experiment_id(" + str + ")";
    }
}

package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import org.apache.commons.cli.HelpFormatter;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzeh extends zzgl {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public char f46678c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f46679d = -1;
    @GuardedBy("this")

    /* renamed from: e */
    private String f46680e;

    /* renamed from: f */
    private final zzef f46681f = new zzef(this, 6, false, false);

    /* renamed from: g */
    private final zzef f46682g = new zzef(this, 6, true, false);

    /* renamed from: h */
    private final zzef f46683h = new zzef(this, 6, false, true);

    /* renamed from: i */
    private final zzef f46684i = new zzef(this, 5, false, false);

    /* renamed from: j */
    private final zzef f46685j = new zzef(this, 5, true, false);

    /* renamed from: k */
    private final zzef f46686k = new zzef(this, 5, false, true);

    /* renamed from: l */
    private final zzef f46687l = new zzef(this, 4, false, false);

    /* renamed from: m */
    private final zzef f46688m = new zzef(this, 3, false, false);

    /* renamed from: n */
    private final zzef f46689n = new zzef(this, 2, false, false);

    zzeh(zzfr zzfr) {
        super(zzfr);
    }

    @VisibleForTesting
    /* renamed from: A */
    static String m65560A(boolean z, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            if (obj.toString().charAt(0) == '-') {
                str = HelpFormatter.DEFAULT_OPT_PREFIX;
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            return str + round + "..." + str + round2;
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String G = m65563G(zzfr.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m65563G(className).equals(G)) {
                        sb.append(": ");
                        sb.append(stackTraceElement);
                        break;
                    }
                    i++;
                }
                return sb.toString();
            } else if (obj instanceof zzeg) {
                return ((zzeg) obj).f46677a;
            } else {
                if (z) {
                    return HelpFormatter.DEFAULT_OPT_PREFIX;
                }
                return obj.toString();
            }
        }
    }

    /* renamed from: G */
    private static String m65563G(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: x */
    protected static Object m65566x(String str) {
        if (str == null) {
            return null;
        }
        return new zzeg(str);
    }

    /* renamed from: y */
    static String m65567y(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String A = m65560A(z, obj);
        String A2 = m65560A(z, obj2);
        String A3 = m65560A(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(A)) {
            sb.append(str2);
            sb.append(A);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(A2)) {
            sb.append(str2);
            sb.append(A2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(A3)) {
            sb.append(str3);
            sb.append(A3);
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    /* renamed from: C */
    public final String mo55095C() {
        String str;
        synchronized (this) {
            if (this.f46680e == null) {
                if (this.f46899a.mo55199Q() != null) {
                    this.f46680e = this.f46899a.mo55199Q();
                } else {
                    this.f46680e = this.f46899a.mo55219x().mo54938u();
                }
            }
            Preconditions.m4488k(this.f46680e);
            str = this.f46680e;
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final void mo55096F(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(mo55095C(), i)) {
            Log.println(i, mo55095C(), m65567y(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            Preconditions.m4488k(str);
            zzfo G = this.f46899a.mo55190G();
            if (G == null) {
                Log.println(6, mo55095C(), "Scheduler not set. Not logging error/warn");
            } else if (!G.mo55246l()) {
                Log.println(6, mo55095C(), "Scheduler not initialized. Not logging error/warn");
            } else {
                G.mo55181x(new zzee(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo55000g() {
        return false;
    }

    /* renamed from: o */
    public final zzef mo55097o() {
        return this.f46688m;
    }

    /* renamed from: p */
    public final zzef mo55098p() {
        return this.f46681f;
    }

    /* renamed from: q */
    public final zzef mo55099q() {
        return this.f46683h;
    }

    /* renamed from: r */
    public final zzef mo55100r() {
        return this.f46682g;
    }

    /* renamed from: s */
    public final zzef mo55101s() {
        return this.f46687l;
    }

    /* renamed from: t */
    public final zzef mo55102t() {
        return this.f46689n;
    }

    /* renamed from: u */
    public final zzef mo55103u() {
        return this.f46684i;
    }

    /* renamed from: v */
    public final zzef mo55104v() {
        return this.f46686k;
    }

    /* renamed from: w */
    public final zzef mo55105w() {
        return this.f46685j;
    }
}

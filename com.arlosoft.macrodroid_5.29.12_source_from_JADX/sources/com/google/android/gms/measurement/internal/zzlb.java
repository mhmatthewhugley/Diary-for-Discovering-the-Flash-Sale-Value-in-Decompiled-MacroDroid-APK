package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcf;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzlb extends zzgl {

    /* renamed from: g */
    private static final String[] f47295g = {"firebase_", "google_", "ga_"};

    /* renamed from: h */
    private static final String[] f47296h = {"_err"};

    /* renamed from: c */
    private SecureRandom f47297c;

    /* renamed from: d */
    private final AtomicLong f47298d = new AtomicLong(0);

    /* renamed from: e */
    private int f47299e;

    /* renamed from: f */
    private Integer f47300f = null;

    zzlb(zzfr zzfr) {
        super(zzfr);
    }

    /* renamed from: W */
    static boolean m66120W(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: X */
    static boolean m66121X(String str) {
        Preconditions.m4484g(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    static boolean m66122Y(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.m4488k(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: Z */
    static boolean m66123Z(Context context, boolean z) {
        Preconditions.m4488k(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return m66130i0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return m66130i0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: a0 */
    public static boolean m66124a0(String str) {
        return !f47296h[0].equals(str);
    }

    /* renamed from: d0 */
    static final boolean m66125d0(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    @VisibleForTesting
    /* renamed from: e0 */
    static final boolean m66126e0(String str) {
        Preconditions.m4488k(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: f0 */
    private final int m66127f0(String str) {
        if ("_ldl".equals(str)) {
            this.f46899a.mo55219x();
            return 2048;
        } else if (Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID.equals(str)) {
            this.f46899a.mo55219x();
            return 256;
        } else if ("_lgclid".equals(str)) {
            this.f46899a.mo55219x();
            return 100;
        } else {
            this.f46899a.mo55219x();
            return 36;
        }
    }

    /* renamed from: g0 */
    private final Object m66128g0(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0 : 1);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return mo55605p(obj.toString(), i, z);
            }
            if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle u0 = mo55613u0((Bundle) parcelable);
                    if (!u0.isEmpty()) {
                        arrayList.add(u0);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* renamed from: h0 */
    private static boolean m66129h0(String str, String[] strArr) {
        Preconditions.m4488k(strArr);
        for (String a : strArr) {
            if (zzkz.m66118a(str, a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i0 */
    private static boolean m66130i0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @VisibleForTesting
    /* renamed from: q0 */
    static long m66131q0(byte[] bArr) {
        Preconditions.m4488k(bArr);
        int length = bArr.length;
        int i = 0;
        Preconditions.m4493p(length > 0);
        int i2 = length - 1;
        long j = 0;
        while (i2 >= 0 && i2 >= bArr.length - 8) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
            i2--;
        }
        return j;
    }

    /* renamed from: r */
    static MessageDigest m66132r() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_MD5);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: t */
    public static ArrayList m66133t(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzac zzac = (zzac) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzac.f46410a);
            bundle.putString("origin", zzac.f46411c);
            bundle.putLong("creation_timestamp", zzac.f46413f);
            bundle.putString("name", zzac.f46412d.f47282c);
            zzgn.m65767b(bundle, Preconditions.m4488k(zzac.f46412d.mo55568l2()));
            bundle.putBoolean("active", zzac.f46414g);
            String str = zzac.f46415o;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzaw zzaw = zzac.f46416p;
            if (zzaw != null) {
                bundle.putString("timed_out_event_name", zzaw.f46479a);
                zzau zzau = zzaw.f46480c;
                if (zzau != null) {
                    bundle.putBundle("timed_out_event_params", zzau.mo55016m2());
                }
            }
            bundle.putLong("trigger_timeout", zzac.f46417s);
            zzaw zzaw2 = zzac.f46418z;
            if (zzaw2 != null) {
                bundle.putString("triggered_event_name", zzaw2.f46479a);
                zzau zzau2 = zzaw2.f46480c;
                if (zzau2 != null) {
                    bundle.putBundle("triggered_event_params", zzau2.mo55016m2());
                }
            }
            bundle.putLong("triggered_timestamp", zzac.f46412d.f47283d);
            bundle.putLong("time_to_live", zzac.f46408A);
            zzaw zzaw3 = zzac.f46409B;
            if (zzaw3 != null) {
                bundle.putString("expired_event_name", zzaw3.f46479a);
                zzau zzau3 = zzaw3.f46480c;
                if (zzau3 != null) {
                    bundle.putBundle("expired_event_params", zzau3.mo55016m2());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    @WorkerThread
    /* renamed from: w */
    public static void m66134w(zzie zzie, Bundle bundle, boolean z) {
        if (!(bundle == null || zzie == null)) {
            if (!bundle.containsKey("_sc") || z) {
                String str = zzie.f47057a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = zzie.f47058b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", zzie.f47059c);
                return;
            }
            z = false;
        }
        if (bundle != null && zzie == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo55573A(zzla zzla, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m66125d0(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        zzla.mo55327a(str, "_err", bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo55574C(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                this.f46899a.mo55221z().mo55104v().mo55093c("Not putting event parameter. Invalid value type. name, type", this.f46899a.mo55187D().mo55088e(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    /* renamed from: D */
    public final void mo55575D(zzcf zzcf, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zzcf.mo50779m1(bundle);
        } catch (RemoteException e) {
            this.f46899a.mo55221z().mo55103u().mo55092b("Error returning boolean value to wrapper", e);
        }
    }

    /* renamed from: E */
    public final void mo55576E(zzcf zzcf, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcf.mo50779m1(bundle);
        } catch (RemoteException e) {
            this.f46899a.mo55221z().mo55103u().mo55092b("Error returning bundle list to wrapper", e);
        }
    }

    /* renamed from: F */
    public final void mo55577F(zzcf zzcf, Bundle bundle) {
        try {
            zzcf.mo50779m1(bundle);
        } catch (RemoteException e) {
            this.f46899a.mo55221z().mo55103u().mo55092b("Error returning bundle value to wrapper", e);
        }
    }

    /* renamed from: G */
    public final void mo55578G(zzcf zzcf, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcf.mo50779m1(bundle);
        } catch (RemoteException e) {
            this.f46899a.mo55221z().mo55103u().mo55092b("Error returning byte array to wrapper", e);
        }
    }

    /* renamed from: H */
    public final void mo55579H(zzcf zzcf, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            zzcf.mo50779m1(bundle);
        } catch (RemoteException e) {
            this.f46899a.mo55221z().mo55103u().mo55092b("Error returning int value to wrapper", e);
        }
    }

    /* renamed from: I */
    public final void mo55580I(zzcf zzcf, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            zzcf.mo50779m1(bundle);
        } catch (RemoteException e) {
            this.f46899a.mo55221z().mo55103u().mo55092b("Error returning long value to wrapper", e);
        }
    }

    /* renamed from: J */
    public final void mo55581J(zzcf zzcf, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcf.mo50779m1(bundle);
        } catch (RemoteException e) {
            this.f46899a.mo55221z().mo55103u().mo55092b("Error returning string value to wrapper", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo55582K(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int i;
        String str4;
        int i2;
        String str5 = str2;
        Bundle bundle2 = bundle;
        List list2 = list;
        if (bundle2 != null) {
            this.f46899a.mo55219x();
            int i3 = 0;
            for (String str6 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str6)) {
                    int m0 = !z ? mo55600m0(str6) : 0;
                    if (m0 == 0) {
                        m0 = mo55598l0(str6);
                    }
                    i = m0;
                } else {
                    i = 0;
                }
                if (i != 0) {
                    mo55614v(bundle, i, str6, str6, i == 3 ? str6 : null);
                    bundle2.remove(str6);
                } else {
                    if (mo55592U(bundle2.get(str6))) {
                        this.f46899a.mo55221z().mo55104v().mo55094d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str5, str3, str6);
                        str4 = str6;
                        i2 = 22;
                    } else {
                        String str7 = str3;
                        str4 = str6;
                        i2 = mo55586O(str, str2, str6, bundle2.get(str6), bundle, list, z, false);
                    }
                    if (i2 != 0 && !"_ev".equals(str4)) {
                        mo55614v(bundle, i2, str4, str4, bundle2.get(str4));
                        bundle2.remove(str4);
                    } else if (m66121X(str4) && !m66129h0(str4, zzgp.f46908d) && (i3 = i3 + 1) > 0) {
                        this.f46899a.mo55221z().mo55099q().mo55093c("Item cannot contain custom parameters", this.f46899a.mo55187D().mo55087d(str5), this.f46899a.mo55187D().mo55085b(bundle2));
                        m66125d0(bundle2, 23);
                        bundle2.remove(str4);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final boolean mo55583L(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (m66126e0(str)) {
                return true;
            }
            if (this.f46899a.mo55214o()) {
                this.f46899a.mo55221z().mo55099q().mo55092b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzeh.m65566x(str));
            }
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            if (this.f46899a.mo55214o()) {
                this.f46899a.mo55221z().mo55099q().mo55091a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (m66126e0(str2)) {
            return true;
        } else {
            this.f46899a.mo55221z().mo55099q().mo55092b("Invalid admob_app_id. Analytics disabled.", zzeh.m65566x(str2));
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean mo55584M(String str, int i, String str2) {
        if (str2 == null) {
            this.f46899a.mo55221z().mo55099q().mo55092b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            this.f46899a.mo55221z().mo55099q().mo55094d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final boolean mo55585N(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f46899a.mo55221z().mo55099q().mo55092b("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.m4488k(str2);
        String[] strArr3 = f47295g;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.f46899a.mo55221z().mo55099q().mo55093c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m66129h0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m66129h0(str2, strArr2)) {
            return true;
        }
        this.f46899a.mo55221z().mo55099q().mo55093c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d1  */
    @androidx.annotation.WorkerThread
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo55586O(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            r13 = this;
            r7 = r13
            r8 = r16
            r0 = r17
            r1 = r18
            r13.mo55073e()
            boolean r2 = r13.mo55592U(r0)
            java.lang.String r3 = "param"
            r4 = 17
            r5 = 0
            if (r2 == 0) goto L_0x00ad
            if (r21 == 0) goto L_0x00aa
            java.lang.String[] r2 = com.google.android.gms.measurement.internal.zzgp.f46907c
            boolean r2 = m66129h0(r8, r2)
            if (r2 != 0) goto L_0x0022
            r0 = 20
            return r0
        L_0x0022:
            com.google.android.gms.measurement.internal.zzfr r2 = r7.f46899a
            com.google.android.gms.measurement.internal.zzjm r2 = r2.mo55194L()
            r2.mo55073e()
            r2.mo55140f()
            boolean r6 = r2.mo55443A()
            if (r6 != 0) goto L_0x0035
            goto L_0x0047
        L_0x0035:
            com.google.android.gms.measurement.internal.zzfr r2 = r2.f46899a
            com.google.android.gms.measurement.internal.zzlb r2 = r2.mo55196N()
            int r2 = r2.mo55604o0()
            r6 = 200900(0x310c4, float:2.81521E-40)
            if (r2 >= r6) goto L_0x0047
            r0 = 25
            return r0
        L_0x0047:
            com.google.android.gms.measurement.internal.zzfr r2 = r7.f46899a
            r2.mo55219x()
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x0055
            r6 = r0
            android.os.Parcelable[] r6 = (android.os.Parcelable[]) r6
            int r6 = r6.length
            goto L_0x0060
        L_0x0055:
            boolean r6 = r0 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x00ad
            r6 = r0
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
        L_0x0060:
            r9 = 200(0xc8, float:2.8E-43)
            if (r6 <= r9) goto L_0x00ad
            com.google.android.gms.measurement.internal.zzfr r10 = r7.f46899a
            com.google.android.gms.measurement.internal.zzeh r10 = r10.mo55221z()
            com.google.android.gms.measurement.internal.zzef r10 = r10.mo55104v()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r11 = "Parameter array is too long; discarded. Value kind, name, array length"
            r10.mo55094d(r11, r3, r8, r6)
            com.google.android.gms.measurement.internal.zzfr r6 = r7.f46899a
            r6.mo55219x()
            if (r2 == 0) goto L_0x008e
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r6 = r2.length
            if (r6 <= r9) goto L_0x00a7
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r9)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x00a7
        L_0x008e:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x00a7
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r6 = r2.size()
            if (r6 <= r9) goto L_0x00a7
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r5, r9)
            r6.<init>(r2)
            r1.putParcelableArrayList(r8, r6)
        L_0x00a7:
            r9 = 17
            goto L_0x00ae
        L_0x00aa:
            r0 = 21
            return r0
        L_0x00ad:
            r9 = 0
        L_0x00ae:
            boolean r1 = m66120W(r15)
            if (r1 != 0) goto L_0x00c3
            boolean r1 = m66120W(r16)
            if (r1 == 0) goto L_0x00bb
            goto L_0x00c3
        L_0x00bb:
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            r1.mo55219x()
            r1 = 100
            goto L_0x00ca
        L_0x00c3:
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            r1.mo55219x()
            r1 = 256(0x100, float:3.59E-43)
        L_0x00ca:
            boolean r1 = r13.mo55587P(r3, r8, r1, r0)
            if (r1 == 0) goto L_0x00d1
            return r9
        L_0x00d1:
            if (r21 == 0) goto L_0x0161
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00e8
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.mo55582K(r1, r2, r3, r4, r5, r6)
            goto L_0x0160
        L_0x00e8:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x011f
            r10 = r0
            android.os.Parcelable[] r10 = (android.os.Parcelable[]) r10
            int r11 = r10.length
            r12 = 0
        L_0x00f1:
            if (r12 >= r11) goto L_0x0160
            r0 = r10[r12]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x010d
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzeh r1 = r1.mo55221z()
            com.google.android.gms.measurement.internal.zzef r1 = r1.mo55104v()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.mo55093c(r2, r0, r8)
            goto L_0x0161
        L_0x010d:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.mo55582K(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + 1
            goto L_0x00f1
        L_0x011f:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x0161
            r10 = r0
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r11 = r10.size()
            r12 = 0
        L_0x012b:
            if (r12 >= r11) goto L_0x0160
            java.lang.Object r0 = r10.get(r12)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x014e
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzeh r1 = r1.mo55221z()
            com.google.android.gms.measurement.internal.zzef r1 = r1.mo55104v()
            if (r0 == 0) goto L_0x0146
            java.lang.Class r0 = r0.getClass()
            goto L_0x0148
        L_0x0146:
            java.lang.String r0 = "null"
        L_0x0148:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r1.mo55093c(r2, r0, r8)
            goto L_0x0161
        L_0x014e:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.mo55582K(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + 1
            goto L_0x012b
        L_0x0160:
            return r9
        L_0x0161:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlb.mo55586O(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final boolean mo55587P(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i) {
                this.f46899a.mo55221z().mo55104v().mo55094d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final boolean mo55588Q(String str, String str2) {
        if (str2 == null) {
            this.f46899a.mo55221z().mo55099q().mo55092b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f46899a.mo55221z().mo55099q().mo55092b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    this.f46899a.mo55221z().mo55099q().mo55093c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f46899a.mo55221z().mo55099q().mo55093c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final boolean mo55589R(String str, String str2) {
        if (str2 == null) {
            this.f46899a.mo55221z().mo55099q().mo55092b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f46899a.mo55221z().mo55099q().mo55092b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.f46899a.mo55221z().mo55099q().mo55093c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f46899a.mo55221z().mo55099q().mo55093c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: S */
    public final boolean mo55590S(String str) {
        mo55073e();
        if (Wrappers.m4929a(this.f46899a.mo55202c()).mo21958a(str) == 0) {
            return true;
        }
        this.f46899a.mo55221z().mo55097o().mo55092b("Permission not granted", str);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final boolean mo55591T(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String s = this.f46899a.mo55219x().mo54936s();
        this.f46899a.mo55207h();
        return s.equals(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final boolean mo55592U(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: V */
    public final boolean mo55593V(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo f = Wrappers.m4929a(context).mo21963f(str, 64);
            if (f == null || (signatureArr = f.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e) {
            this.f46899a.mo55221z().mo55098p().mo55092b("Error obtaining certificate", e);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            this.f46899a.mo55221z().mo55098p().mo55092b("Package name not found", e2);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final boolean mo55594b0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Preconditions.m4488k(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else {
            if (isEmpty) {
                return TextUtils.isEmpty(str3) || !str3.equals(str4);
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final byte[] mo55595c0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: f */
    public final void mo55126f() {
        mo55073e();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f46899a.mo55221z().mo55103u().mo55091a("Utils falling back to Random for random id");
            }
        }
        this.f47298d.set(nextLong);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo55000g() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final int mo55596j0(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = mo55587P("user property referrer", str, m66127f0(str), obj);
        } else {
            z = mo55587P("user property", str, m66127f0(str), obj);
        }
        return z ? 0 : 7;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public final int mo55597k0(String str) {
        if (!mo55588Q(NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        if (!mo55585N(NotificationCompat.CATEGORY_EVENT, zzgo.f46901a, zzgo.f46902b, str)) {
            return 13;
        }
        this.f46899a.mo55219x();
        if (!mo55584M(NotificationCompat.CATEGORY_EVENT, 40, str)) {
            return 2;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public final int mo55598l0(String str) {
        if (!mo55588Q("event param", str)) {
            return 3;
        }
        if (!mo55585N("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f46899a.mo55219x();
        if (!mo55584M("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final Object mo55599m(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            this.f46899a.mo55219x();
            return m66128g0(256, obj, true, true);
        }
        if (m66120W(str)) {
            this.f46899a.mo55219x();
        } else {
            this.f46899a.mo55219x();
            i = 100;
        }
        return m66128g0(i, obj, false, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public final int mo55600m0(String str) {
        if (!mo55589R("event param", str)) {
            return 3;
        }
        if (!mo55585N("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f46899a.mo55219x();
        if (!mo55584M("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final Object mo55601n(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return m66128g0(m66127f0(str), obj, true, false);
        }
        return m66128g0(m66127f0(str), obj, false, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public final int mo55602n0(String str) {
        if (!mo55588Q("user property", str)) {
            return 6;
        }
        if (!mo55585N("user property", zzgq.f46909a, (String[]) null, str)) {
            return 15;
        }
        this.f46899a.mo55219x();
        if (!mo55584M("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final String mo55603o() {
        byte[] bArr = new byte[16];
        mo55609s().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* renamed from: o0 */
    public final int mo55604o0() {
        if (this.f47300f == null) {
            this.f47300f = Integer.valueOf(GoogleApiAvailabilityLight.m3542h().mo21171b(this.f46899a.mo55202c()) / 1000);
        }
        return this.f47300f.intValue();
    }

    /* renamed from: p */
    public final String mo55605p(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* renamed from: p0 */
    public final int mo55606p0(int i) {
        return GoogleApiAvailabilityLight.m3542h().mo21157j(this.f46899a.mo55202c(), GooglePlayServicesUtilLight.f3065a);
    }

    /* renamed from: q */
    public final URL mo55607q(long j, String str, String str2, long j2) {
        try {
            Preconditions.m4484g(str2);
            Preconditions.m4484g(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{74029L, Integer.valueOf(mo55604o0())}), str2, str, Long.valueOf(j2)});
            if (str.equals(this.f46899a.mo55219x().mo54937t())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            this.f46899a.mo55221z().mo55098p().mo55092b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* renamed from: r0 */
    public final long mo55608r0() {
        long andIncrement;
        long j;
        if (this.f47298d.get() == 0) {
            synchronized (this.f47298d) {
                long nextLong = new Random(System.nanoTime() ^ this.f46899a.mo55201a().mo21950a()).nextLong();
                int i = this.f47299e + 1;
                this.f47299e = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f47298d) {
            this.f47298d.compareAndSet(-1, 1);
            andIncrement = this.f47298d.getAndIncrement();
        }
        return andIncrement;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: s */
    public final SecureRandom mo55609s() {
        mo55073e();
        if (this.f47297c == null) {
            this.f47297c = new SecureRandom();
        }
        return this.f47297c;
    }

    /* renamed from: s0 */
    public final long mo55610s0(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public final Bundle mo55611t0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str7 = uri.getQueryParameter("utm_campaign");
                    str6 = uri.getQueryParameter("utm_source");
                    str5 = uri.getQueryParameter("utm_medium");
                    str4 = uri.getQueryParameter("gclid");
                    str3 = uri.getQueryParameter("utm_id");
                    str2 = uri.getQueryParameter("dclid");
                    str = uri.getQueryParameter("srsltid");
                } else {
                    str7 = null;
                    str6 = null;
                    str5 = null;
                    str4 = null;
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                if (TextUtils.isEmpty(str7) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str7)) {
                    bundle.putString("campaign", str7);
                }
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString("source", str6);
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString("medium", str5);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("gclid", str4);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("campaign_id", str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("dclid", str2);
                }
                String queryParameter6 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("source_platform", queryParameter6);
                }
                String queryParameter7 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("creative_format", queryParameter7);
                }
                String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("marketing_tactic", queryParameter8);
                }
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("srsltid", str);
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                this.f46899a.mo55221z().mo55103u().mo55092b("Install referrer url isn't a hierarchical URI", e);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: u */
    public final void mo55612u(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.f46899a.mo55221z().mo55103u().mo55092b("Params already contained engagement", Long.valueOf(j2));
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public final Bundle mo55613u0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object m = mo55599m(str, bundle.get(str));
                if (m == null) {
                    this.f46899a.mo55221z().mo55104v().mo55092b("Param value can't be null", this.f46899a.mo55187D().mo55088e(str));
                } else {
                    mo55574C(bundle2, str, m);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo55614v(Bundle bundle, int i, String str, String str2, Object obj) {
        if (m66125d0(bundle, i)) {
            this.f46899a.mo55219x();
            bundle.putString("_ev", mo55605p(str, 40, true));
            if (obj != null) {
                Preconditions.m4488k(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) obj.toString().length());
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0106 A[SYNTHETIC] */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo55615v0(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List r24, boolean r25) {
        /*
            r20 = this;
            r9 = r20
            r10 = r22
            r11 = r23
            r12 = r24
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.zzgo.f46904d
            boolean r13 = m66129h0(r10, r0)
            if (r11 == 0) goto L_0x010b
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>(r11)
            com.google.android.gms.measurement.internal.zzfr r0 = r9.f46899a
            com.google.android.gms.measurement.internal.zzag r0 = r0.mo55219x()
            int r8 = r0.mo54928k()
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r23.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = 0
        L_0x0030:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0109
            java.lang.Object r0 = r16.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r12 == 0) goto L_0x0048
            boolean r0 = r12.contains(r7)
            if (r0 != 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r2 = 0
            goto L_0x0057
        L_0x0048:
            if (r25 != 0) goto L_0x004f
            int r0 = r9.mo55600m0(r7)
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            if (r0 != 0) goto L_0x0056
            int r0 = r9.mo55598l0(r7)
        L_0x0056:
            r2 = r0
        L_0x0057:
            if (r2 == 0) goto L_0x006d
            r0 = 3
            if (r2 != r0) goto L_0x005e
            r5 = r7
            goto L_0x005f
        L_0x005e:
            r5 = 0
        L_0x005f:
            r0 = r20
            r1 = r15
            r3 = r7
            r4 = r7
            r0.mo55614v(r1, r2, r3, r4, r5)
            r15.remove(r7)
            r14 = r8
            goto L_0x0106
        L_0x006d:
            java.lang.Object r4 = r11.get(r7)
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r7
            r5 = r15
            r6 = r24
            r19 = r7
            r7 = r25
            r14 = r8
            r8 = r13
            int r2 = r0.mo55586O(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 17
            if (r2 != r0) goto L_0x0098
            r2 = 17
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r0 = r20
            r1 = r15
            r3 = r19
            r4 = r19
            r0.mo55614v(r1, r2, r3, r4, r5)
            goto L_0x00ba
        L_0x0098:
            if (r2 == 0) goto L_0x00ba
            java.lang.String r0 = "_ev"
            r6 = r19
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x00bc
            r0 = 21
            if (r2 != r0) goto L_0x00aa
            r3 = r10
            goto L_0x00ab
        L_0x00aa:
            r3 = r6
        L_0x00ab:
            java.lang.Object r5 = r11.get(r6)
            r0 = r20
            r1 = r15
            r4 = r6
            r0.mo55614v(r1, r2, r3, r4, r5)
            r15.remove(r6)
            goto L_0x0106
        L_0x00ba:
            r6 = r19
        L_0x00bc:
            boolean r0 = m66121X(r6)
            if (r0 == 0) goto L_0x0106
            int r0 = r18 + 1
            if (r0 <= r14) goto L_0x0104
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Event can't contain more than "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " params"
            r1.append(r2)
            com.google.android.gms.measurement.internal.zzfr r2 = r9.f46899a
            com.google.android.gms.measurement.internal.zzeh r2 = r2.mo55221z()
            com.google.android.gms.measurement.internal.zzef r2 = r2.mo55099q()
            java.lang.String r1 = r1.toString()
            com.google.android.gms.measurement.internal.zzfr r3 = r9.f46899a
            com.google.android.gms.measurement.internal.zzec r3 = r3.mo55187D()
            java.lang.String r3 = r3.mo55087d(r10)
            com.google.android.gms.measurement.internal.zzfr r4 = r9.f46899a
            com.google.android.gms.measurement.internal.zzec r4 = r4.mo55187D()
            java.lang.String r4 = r4.mo55085b(r11)
            r2.mo55093c(r1, r3, r4)
            r1 = 5
            m66125d0(r15, r1)
            r15.remove(r6)
        L_0x0104:
            r18 = r0
        L_0x0106:
            r8 = r14
            goto L_0x0030
        L_0x0109:
            r14 = r15
            goto L_0x010c
        L_0x010b:
            r14 = 0
        L_0x010c:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlb.mo55615v0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public final zzaw mo55616w0(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo55597k0(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle v0 = mo55615v0(str, str2, bundle3, CollectionUtils.m4862b("_o"), true);
            if (z) {
                v0 = mo55613u0(v0);
            }
            Preconditions.m4488k(v0);
            return new zzaw(str2, new zzau(v0), str3, j);
        }
        this.f46899a.mo55221z().mo55098p().mo55092b("Invalid conditional property event name", this.f46899a.mo55187D().mo55089f(str2));
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo55617x(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    this.f46899a.mo55196N().mo55574C(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo55618y(zzei zzei, int i) {
        int i2 = 0;
        for (String str : new TreeSet(zzei.f46693d.keySet())) {
            if (m66121X(str) && (i2 = i2 + 1) > i) {
                this.f46899a.mo55221z().mo55099q().mo55093c("Event can't contain more than " + i + " params", this.f46899a.mo55187D().mo55087d(zzei.f46690a), this.f46899a.mo55187D().mo55085b(zzei.f46693d));
                m66125d0(zzei.f46693d, 5);
                zzei.f46693d.remove(str);
            }
        }
    }
}

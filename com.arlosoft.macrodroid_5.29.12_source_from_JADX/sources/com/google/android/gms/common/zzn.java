package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.errorprone.annotations.CheckReturnValue;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.security.MessageDigest;

@CheckReturnValue
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class zzn {

    /* renamed from: a */
    static final zzl f3985a = new zzf(zzj.m4938A1("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));

    /* renamed from: b */
    static final zzl f3986b = new zzg(zzj.m4938A1("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));

    /* renamed from: c */
    static final zzl f3987c = new zzh(zzj.m4938A1("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: d */
    static final zzl f3988d = new zzi(zzj.m4938A1("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: e */
    private static volatile zzaf f3989e;

    /* renamed from: f */
    private static final Object f3990f = new Object();

    /* renamed from: g */
    private static Context f3991g;

    /* renamed from: a */
    static zzx m4945a(String str, zzj zzj, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m4950f(str, zzj, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    static zzx m4946b(String str, boolean z, boolean z2, boolean z3) {
        return m4951g(str, z, false, false, true);
    }

    /* renamed from: c */
    static /* synthetic */ String m4947c(boolean z, String str, zzj zzj) throws Exception {
        String str2 = true != (!z && m4950f(str, zzj, true, false).f4007a) ? "not allowed" : "debug cert rejected";
        MessageDigest b = AndroidUtilsLight.m4840b(KeyPropertiesCompact.DIGEST_SHA256);
        Preconditions.m4488k(b);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", new Object[]{str2, str, Hex.m4884a(b.digest(zzj.mo21975g8())), Boolean.valueOf(z), "12451000.false"});
    }

    /* renamed from: d */
    static synchronized void m4948d(Context context) {
        synchronized (zzn.class) {
            if (f3991g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f3991g = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    static boolean m4949e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            m4952h();
            boolean g = f3989e.mo21790g();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return g;
        } catch (RemoteException | DynamiteModule.LoadingException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* renamed from: f */
    private static zzx m4950f(String str, zzj zzj, boolean z, boolean z2) {
        try {
            m4952h();
            Preconditions.m4488k(f3991g);
            try {
                return f3989e.mo21787D7(new zzs(str, zzj, z, z2), ObjectWrapper.m5051g8(f3991g.getPackageManager())) ? zzx.m4957b() : new zzv(new zze(z, str, zzj), (zzu) null);
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return zzx.m4959d("module call", e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            return zzx.m4959d("module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    /* renamed from: g */
    private static zzx m4951g(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        zzx zzx;
        zzq zzq;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Preconditions.m4488k(f3991g);
            try {
                m4952h();
                zzo zzo = new zzo(str, z, false, ObjectWrapper.m5051g8(f3991g), false);
                if (z4) {
                    zzq = f3989e.mo21789X8(zzo);
                } else {
                    zzq = f3989e.mo21788N9(zzo);
                }
                if (zzq.mo21980l2()) {
                    zzx = zzx.m4960f(zzq.mo21981m2());
                } else {
                    String zza = zzq.zza();
                    PackageManager.NameNotFoundException nameNotFoundException = zzq.mo21982n2() == 4 ? new PackageManager.NameNotFoundException() : null;
                    if (zza == null) {
                        zza = "error checking package certificate";
                    }
                    zzx = zzx.m4961g(zzq.mo21981m2(), zzq.mo21982n2(), zza, nameNotFoundException);
                }
            } catch (DynamiteModule.LoadingException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                zzx = zzx.m4959d("module init: ".concat(String.valueOf(e.getMessage())), e);
            }
        } catch (RemoteException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            zzx = zzx.m4959d("module call", e2);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return zzx;
    }

    /* renamed from: h */
    private static void m4952h() throws DynamiteModule.LoadingException {
        if (f3989e == null) {
            Preconditions.m4488k(f3991g);
            synchronized (f3990f) {
                if (f3989e == null) {
                    f3989e = zzae.m4671t1(DynamiteModule.m5096e(f3991g, DynamiteModule.f4044f, "com.google.android.gms.googlecertificates").mo22054d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            }
        }
    }
}

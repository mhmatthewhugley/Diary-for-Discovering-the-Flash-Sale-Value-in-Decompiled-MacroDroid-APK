package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.play.core.splitcompat.zza;
import com.google.android.play.core.splitcompat.zze;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzay {

    /* renamed from: a */
    private final zze f51696a;

    /* renamed from: b */
    private final zzau f51697b;

    /* renamed from: c */
    private final Context f51698c;

    /* renamed from: d */
    private final zzax f51699d;
    @Nullable

    /* renamed from: e */
    private PackageInfo f51700e;

    public zzay(Context context, zze zze, zzau zzau) {
        zzax zzax = new zzax(new zza(zze));
        this.f51696a = zze;
        this.f51697b = zzau;
        this.f51698c = context;
        this.f51699d = zzax;
    }

    @Nullable
    /* renamed from: d */
    private final PackageInfo m70836d() {
        if (this.f51700e == null) {
            try {
                this.f51700e = this.f51698c.getPackageManager().getPackageInfo(this.f51698c.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.f51700e;
    }

    @Nullable
    /* renamed from: e */
    private static X509Certificate m70837e(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e) {
            Log.e("SplitCompat", "Cannot decode certificate.", e);
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo59827a(File[] fileArr) throws IOException, XmlPullParserException {
        long j;
        PackageInfo d = m70836d();
        if (Build.VERSION.SDK_INT >= 28) {
            j = d.getLongVersionCode();
        } else {
            j = (long) d.versionCode;
        }
        AssetManager assetManager = (AssetManager) zzbw.m70886c(AssetManager.class);
        int length = fileArr.length;
        do {
            length--;
            if (length < 0) {
                return true;
            }
            this.f51699d.mo59826b(assetManager, fileArr[length]);
        } while (j == this.f51699d.mo59825a());
        return false;
    }

    /* renamed from: b */
    public final boolean mo59828b(List list) throws IOException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.f51696a.mo59947g(((Intent) it.next()).getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0083, code lost:
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r6).length() + 32);
        r3.append("Downloaded split ");
        r3.append(r6);
        r3.append(" is not signed.");
        android.util.Log.e("SplitCompat", r3.toString());
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo59829c(java.io.File[] r13) {
        /*
            r12 = this;
            java.lang.String r0 = " is not signed."
            java.lang.String r1 = "Downloaded split "
            android.content.pm.PackageInfo r2 = r12.m70836d()
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x002a
            android.content.pm.Signature[] r5 = r2.signatures
            if (r5 != 0) goto L_0x0011
            goto L_0x002a
        L_0x0011:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.content.pm.Signature[] r2 = r2.signatures
            int r5 = r2.length
            r6 = 0
        L_0x001a:
            if (r6 >= r5) goto L_0x002a
            r7 = r2[r6]
            java.security.cert.X509Certificate r7 = m70837e(r7)
            if (r7 == 0) goto L_0x0027
            r3.add(r7)
        L_0x0027:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x002a:
            java.lang.String r2 = "SplitCompat"
            if (r3 == 0) goto L_0x00d2
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x0036
            goto L_0x00d2
        L_0x0036:
            int r5 = r13.length
        L_0x0037:
            int r5 = r5 + -1
            if (r5 < 0) goto L_0x00d0
            r6 = r13[r5]
            java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x00c9 }
            java.security.cert.X509Certificate[][] r7 = com.google.android.play.core.internal.zzi.m70952a(r6)     // Catch:{ Exception -> 0x00a3 }
            if (r7 == 0) goto L_0x0083
            int r8 = r7.length     // Catch:{ Exception -> 0x00c9 }
            if (r8 == 0) goto L_0x0083
            r8 = r7[r4]     // Catch:{ Exception -> 0x00c9 }
            int r8 = r8.length     // Catch:{ Exception -> 0x00c9 }
            if (r8 != 0) goto L_0x0050
            goto L_0x0083
        L_0x0050:
            boolean r6 = r3.isEmpty()     // Catch:{ Exception -> 0x00c9 }
            if (r6 == 0) goto L_0x005c
            java.lang.String r13 = "No certificates found for app."
            android.util.Log.e(r2, r13)     // Catch:{ Exception -> 0x00c9 }
            goto L_0x00c3
        L_0x005c:
            java.util.Iterator r6 = r3.iterator()     // Catch:{ Exception -> 0x00c9 }
        L_0x0060:
            boolean r8 = r6.hasNext()     // Catch:{ Exception -> 0x00c9 }
            if (r8 == 0) goto L_0x0037
            java.lang.Object r8 = r6.next()     // Catch:{ Exception -> 0x00c9 }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ Exception -> 0x00c9 }
            int r9 = r7.length     // Catch:{ Exception -> 0x00c9 }
            r10 = 0
        L_0x006e:
            if (r10 >= r9) goto L_0x007d
            r11 = r7[r10]     // Catch:{ Exception -> 0x00c9 }
            r11 = r11[r4]     // Catch:{ Exception -> 0x00c9 }
            boolean r11 = r11.equals(r8)     // Catch:{ Exception -> 0x00c9 }
            if (r11 != 0) goto L_0x0060
            int r10 = r10 + 1
            goto L_0x006e
        L_0x007d:
            java.lang.String r13 = "There's an app certificate that doesn't sign the split."
            android.util.Log.i(r2, r13)     // Catch:{ Exception -> 0x00c9 }
            goto L_0x00c3
        L_0x0083:
            java.lang.String r13 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00c9 }
            int r13 = r13.length()     // Catch:{ Exception -> 0x00c9 }
            int r13 = r13 + 32
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c9 }
            r3.<init>(r13)     // Catch:{ Exception -> 0x00c9 }
            r3.append(r1)     // Catch:{ Exception -> 0x00c9 }
            r3.append(r6)     // Catch:{ Exception -> 0x00c9 }
            r3.append(r0)     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r13 = r3.toString()     // Catch:{ Exception -> 0x00c9 }
            android.util.Log.e(r2, r13)     // Catch:{ Exception -> 0x00c9 }
            goto L_0x00c3
        L_0x00a3:
            r13 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00c9 }
            int r3 = r3.length()     // Catch:{ Exception -> 0x00c9 }
            int r3 = r3 + 32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c9 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x00c9 }
            r5.append(r1)     // Catch:{ Exception -> 0x00c9 }
            r5.append(r6)     // Catch:{ Exception -> 0x00c9 }
            r5.append(r0)     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x00c9 }
            android.util.Log.e(r2, r0, r13)     // Catch:{ Exception -> 0x00c9 }
        L_0x00c3:
            java.lang.String r13 = "Split verification failure."
            android.util.Log.e(r2, r13)     // Catch:{ Exception -> 0x00c9 }
            return r4
        L_0x00c9:
            r13 = move-exception
            java.lang.String r0 = "Split verification error."
            android.util.Log.e(r2, r0, r13)
            return r4
        L_0x00d0:
            r13 = 1
            return r13
        L_0x00d2:
            java.lang.String r13 = "No app certificates found."
            android.util.Log.e(r2, r13)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.zzay.mo59829c(java.io.File[]):boolean");
    }
}

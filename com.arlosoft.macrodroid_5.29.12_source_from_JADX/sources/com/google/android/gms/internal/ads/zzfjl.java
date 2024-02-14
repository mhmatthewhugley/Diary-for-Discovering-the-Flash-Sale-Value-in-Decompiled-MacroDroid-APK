package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfjl implements zzfjj {

    /* renamed from: a */
    private final Context f35890a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f35891b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f35892c = -1;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f35893d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f35894e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f35895f = "";
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f35896g = "";
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f35897h = "";
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f35898i = "";

    /* renamed from: j */
    private boolean f35899j = false;

    /* renamed from: k */
    private boolean f35900k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final int f35901l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f35902m = 2;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f35903n = 2;

    zzfjl(Context context, int i) {
        this.f35890a = context;
        this.f35901l = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzfjj mo45793a(zzfdv zzfdv) {
        mo45806o(zzfdv);
        return this;
    }

    /* renamed from: b */
    public final synchronized zzfjl mo45804b(int i) {
        this.f35902m = i;
        return this;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ zzfjj mo45794c() {
        mo45810t();
        return this;
    }

    /* renamed from: e */
    public final synchronized boolean mo45795e() {
        return this.f35900k;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ zzfjj mo45796f() {
        mo45811u();
        return this;
    }

    /* renamed from: f0 */
    public final /* bridge */ /* synthetic */ zzfjj mo45797f0(String str) {
        mo45807p(str);
        return this;
    }

    /* renamed from: g */
    public final boolean mo45798g() {
        return !TextUtils.isEmpty(this.f35897h);
    }

    @Nullable
    /* renamed from: h */
    public final synchronized zzfjn mo45799h() {
        if (this.f35899j) {
            return null;
        }
        this.f35899j = true;
        if (!this.f35900k) {
            mo45810t();
        }
        if (this.f35892c < 0) {
            mo45811u();
        }
        return new zzfjn(this, (zzfjm) null);
    }

    /* renamed from: h0 */
    public final /* bridge */ /* synthetic */ zzfjj mo45800h0(String str) {
        mo45808q(str);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return r2;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.zzfjl mo45805n(com.google.android.gms.ads.internal.client.zze r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.os.IBinder r3 = r3.f1938g     // Catch:{ all -> 0x0023 }
            if (r3 != 0) goto L_0x0007
            monitor-exit(r2)
            return r2
        L_0x0007:
            com.google.android.gms.internal.ads.zzdct r3 = (com.google.android.gms.internal.ads.zzdct) r3     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r3.mo44571i()     // Catch:{ all -> 0x0023 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x0015
            r2.f35895f = r0     // Catch:{ all -> 0x0023 }
        L_0x0015:
            java.lang.String r3 = r3.mo19996g()     // Catch:{ all -> 0x0023 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0021
            r2.f35896g = r3     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r2)
            return r2
        L_0x0023:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjl.mo45805n(com.google.android.gms.ads.internal.client.zze):com.google.android.gms.internal.ads.zzfjl");
    }

    /* renamed from: o */
    public final synchronized zzfjl mo45806o(zzfdv zzfdv) {
        if (!TextUtils.isEmpty(zzfdv.f35587b.f35566b)) {
            this.f35895f = zzfdv.f35587b.f35566b;
        }
        Iterator it = zzfdv.f35586a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfdk zzfdk = (zzfdk) it.next();
            if (!TextUtils.isEmpty(zzfdk.f35524c0)) {
                this.f35896g = zzfdk.f35524c0;
                break;
            }
        }
        return this;
    }

    /* renamed from: o0 */
    public final /* bridge */ /* synthetic */ zzfjj mo45801o0(boolean z) {
        mo45809s(z);
        return this;
    }

    /* renamed from: p */
    public final synchronized zzfjl mo45807p(String str) {
        this.f35897h = str;
        return this;
    }

    /* renamed from: q */
    public final synchronized zzfjl mo45808q(String str) {
        this.f35898i = str;
        return this;
    }

    /* renamed from: q0 */
    public final /* bridge */ /* synthetic */ zzfjj mo45802q0(int i) {
        mo45804b(i);
        return this;
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ zzfjj mo45803r(zze zze) {
        mo45805n(zze);
        return this;
    }

    /* renamed from: s */
    public final synchronized zzfjl mo45809s(boolean z) {
        this.f35893d = z;
        return this;
    }

    /* renamed from: t */
    public final synchronized zzfjl mo45810t() {
        this.f35894e = zzt.m2906s().mo20255j(this.f35890a);
        Resources resources = this.f35890a.getResources();
        int i = 2;
        if (resources != null) {
            Configuration configuration = resources.getConfiguration();
            if (configuration != null) {
                i = configuration.orientation == 2 ? 4 : 3;
            }
        }
        this.f35903n = i;
        this.f35891b = zzt.m2889b().mo21952c();
        this.f35900k = true;
        return this;
    }

    /* renamed from: u */
    public final synchronized zzfjl mo45811u() {
        this.f35892c = zzt.m2889b().mo21952c();
        return this;
    }
}

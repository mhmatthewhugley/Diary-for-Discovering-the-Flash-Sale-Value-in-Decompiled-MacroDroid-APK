package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbjh {
    @VisibleForTesting

    /* renamed from: a */
    final BlockingQueue f27326a = new ArrayBlockingQueue(100);
    @VisibleForTesting

    /* renamed from: b */
    final LinkedHashMap f27327b = new LinkedHashMap();
    @VisibleForTesting

    /* renamed from: c */
    final Map f27328c = new HashMap();
    @VisibleForTesting

    /* renamed from: d */
    String f27329d;
    @VisibleForTesting

    /* renamed from: e */
    Context f27330e;
    @VisibleForTesting

    /* renamed from: f */
    String f27331f;

    /* renamed from: g */
    private final HashSet f27332g = new HashSet(Arrays.asList(new String[]{"noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"}));

    /* renamed from: h */
    private AtomicBoolean f27333h;

    /* renamed from: i */
    private File f27334i;

    /* renamed from: c */
    public static /* synthetic */ void m43552c(zzbjh zzbjh) {
        while (true) {
            try {
                zzbjr zzbjr = (zzbjr) zzbjh.f27326a.take();
                zzbjq a = zzbjr.mo42687a();
                if (!TextUtils.isEmpty(a.mo42686b())) {
                    zzbjh.m43553g(zzbjh.mo42674b(zzbjh.f27327b, zzbjr.mo42688b()), a);
                }
            } catch (InterruptedException e) {
                zzcgp.m45230h("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a7 A[SYNTHETIC, Splitter:B:38:0x00a7] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b2 A[SYNTHETIC, Splitter:B:44:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m43553g(java.util.Map r5, com.google.android.gms.internal.ads.zzbjq r6) {
        /*
            r4 = this;
            java.lang.String r0 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            java.lang.String r1 = r4.f27329d
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0014:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r1.appendQueryParameter(r3, r2)
            goto L_0x0014
        L_0x0030:
            android.net.Uri r5 = r1.build()
            java.lang.String r5 = r5.toString()
            if (r6 == 0) goto L_0x006f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            java.lang.String r5 = r6.mo42686b()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0055
            java.lang.String r5 = "&it="
            r1.append(r5)
            java.lang.String r5 = r6.mo42686b()
            r1.append(r5)
        L_0x0055:
            java.lang.String r5 = r6.mo42685a()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x006b
            java.lang.String r5 = "&blat="
            r1.append(r5)
            java.lang.String r5 = r6.mo42685a()
            r1.append(r5)
        L_0x006b:
            java.lang.String r5 = r1.toString()
        L_0x006f:
            java.util.concurrent.atomic.AtomicBoolean r6 = r4.f27333h
            boolean r6 = r6.get()
            if (r6 == 0) goto L_0x00c1
            java.io.File r6 = r4.f27334i
            if (r6 == 0) goto L_0x00bb
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x009f }
            r3 = 1
            r2.<init>(r6, r3)     // Catch:{ IOException -> 0x009f }
            byte[] r5 = r5.getBytes()     // Catch:{ IOException -> 0x009a, all -> 0x0097 }
            r2.write(r5)     // Catch:{ IOException -> 0x009a, all -> 0x0097 }
            r5 = 10
            r2.write(r5)     // Catch:{ IOException -> 0x009a, all -> 0x0097 }
            r2.close()     // Catch:{ IOException -> 0x0092 }
            return
        L_0x0092:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzcgp.m45230h(r0, r5)
            return
        L_0x0097:
            r5 = move-exception
            r1 = r2
            goto L_0x00b0
        L_0x009a:
            r5 = move-exception
            r1 = r2
            goto L_0x00a0
        L_0x009d:
            r5 = move-exception
            goto L_0x00b0
        L_0x009f:
            r5 = move-exception
        L_0x00a0:
            java.lang.String r6 = "CsiReporter: Cannot write to file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.zzcgp.m45230h(r6, r5)     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x00af
            r1.close()     // Catch:{ IOException -> 0x00ab }
            return
        L_0x00ab:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzcgp.m45230h(r0, r5)
        L_0x00af:
            return
        L_0x00b0:
            if (r1 == 0) goto L_0x00ba
            r1.close()     // Catch:{ IOException -> 0x00b6 }
            goto L_0x00ba
        L_0x00b6:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzcgp.m45230h(r0, r6)
        L_0x00ba:
            throw r5
        L_0x00bb:
            java.lang.String r5 = "CsiReporter: File doesn't exists. Cannot write CSI data to file."
            com.google.android.gms.internal.ads.zzcgp.m45229g(r5)
            return
        L_0x00c1:
            com.google.android.gms.ads.internal.zzt.m2905r()
            android.content.Context r6 = r4.f27330e
            java.lang.String r0 = r4.f27331f
            com.google.android.gms.ads.internal.util.zzs.m2757h(r6, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbjh.m43553g(java.util.Map, com.google.android.gms.internal.ads.zzbjq):void");
    }

    /* renamed from: a */
    public final zzbjn mo42673a(String str) {
        zzbjn zzbjn = (zzbjn) this.f27328c.get(str);
        return zzbjn != null ? zzbjn : zzbjn.f27335a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map mo42674b(Map map, @Nullable Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, mo42673a(str).mo42678a(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    /* renamed from: d */
    public final void mo42675d(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.f27330e = context;
        this.f27331f = str;
        this.f27329d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f27333h = atomicBoolean;
        atomicBoolean.set(((Boolean) zzbkn.f27416c.mo42728e()).booleanValue());
        if (this.f27333h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f27334i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f27327b.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzchc.f28456a.execute(new zzbjg(this));
        Map map2 = this.f27328c;
        zzbjn zzbjn = zzbjn.f27336b;
        map2.put("action", zzbjn);
        this.f27328c.put("ad_format", zzbjn);
        this.f27328c.put("e", zzbjn.f27337c);
    }

    /* renamed from: e */
    public final void mo42676e(String str) {
        if (!this.f27332g.contains(str)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sdkVersion", this.f27331f);
            linkedHashMap.put("ue", str);
            m43553g(mo42674b(this.f27327b, linkedHashMap), (zzbjq) null);
        }
    }

    /* renamed from: f */
    public final boolean mo42677f(zzbjr zzbjr) {
        return this.f27326a.offer(zzbjr);
    }
}

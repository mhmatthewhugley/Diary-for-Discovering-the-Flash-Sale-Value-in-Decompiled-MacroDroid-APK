package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzdxl;
import com.google.android.gms.internal.ads.zzdxv;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zze implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzdxv f2543a;

    /* renamed from: c */
    public final /* synthetic */ zzdxl f2544c;

    /* renamed from: d */
    public final /* synthetic */ String f2545d;

    /* renamed from: f */
    public final /* synthetic */ Pair[] f2546f;

    public /* synthetic */ zze(zzdxv zzdxv, zzdxl zzdxl, String str, Pair[] pairArr) {
        this.f2543a = zzdxv;
        this.f2544c = zzdxl;
        this.f2545d = str;
        this.f2546f = pairArr;
    }

    public final void run() {
        Map map;
        zzdxv zzdxv = this.f2543a;
        zzdxl zzdxl = this.f2544c;
        String str = this.f2545d;
        Pair[] pairArr = this.f2546f;
        if (zzdxl == null) {
            map = zzdxv.mo45054c();
        } else {
            map = zzdxl.mo45036a();
        }
        map.put("action", str);
        for (Pair pair : pairArr) {
            map.put((String) pair.first, (String) pair.second);
        }
        zzdxv.mo45056e(map);
    }
}

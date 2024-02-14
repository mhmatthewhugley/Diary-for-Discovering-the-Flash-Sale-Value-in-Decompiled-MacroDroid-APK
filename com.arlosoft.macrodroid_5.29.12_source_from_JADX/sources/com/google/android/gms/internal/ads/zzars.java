package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzars implements PackageManager.OnChecksumsReadyListener {

    /* renamed from: a */
    public final /* synthetic */ zzfzy f25392a;

    public /* synthetic */ zzars(zzfzy zzfzy) {
        this.f25392a = zzfzy;
    }

    public final void onChecksumsReady(List list) {
        zzfzy zzfzy = this.f25392a;
        if (list == null) {
            zzfzy.mo46080f((Object) null);
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum apkChecksum = (ApkChecksum) list.get(i);
                if (apkChecksum.getType() == 8) {
                    zzfzy.mo46080f(zzaqh.m42130c(apkChecksum.getValue()));
                    return;
                }
            }
            zzfzy.mo46080f((Object) null);
        } catch (Throwable unused) {
            zzfzy.mo46080f((Object) null);
        }
    }
}

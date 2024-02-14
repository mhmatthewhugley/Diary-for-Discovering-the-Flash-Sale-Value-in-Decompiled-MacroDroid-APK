package com.google.android.gms.internal.mlkit_common;

import android.os.SystemClock;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class zznc {

    /* renamed from: a */
    private static final GmsLogger f43071a = new GmsLogger("RemoteModelUtils", "");

    @WorkerThread
    /* renamed from: a */
    public static zzjg m61543a(RemoteModel remoteModel, SharedPrefManager sharedPrefManager, zzms zzms) {
        zzji zzji;
        ModelType b = zzms.mo51988b();
        String a = remoteModel.mo64528a();
        zzjm zzjm = new zzjm();
        zzjh zzjh = new zzjh();
        zzjh.mo51912c(remoteModel.mo64530c());
        zzjh.mo51913d(zzjj.CLOUD);
        zzjh.mo51910a(zzad.m61139b(a));
        int ordinal = b.ordinal();
        if (ordinal == 2) {
            zzji = zzji.BASE_TRANSLATE;
        } else if (ordinal == 4) {
            zzji = zzji.CUSTOM;
        } else if (ordinal != 5) {
            zzji = zzji.TYPE_UNKNOWN;
        } else {
            zzji = zzji.BASE_DIGITAL_INK;
        }
        zzjh.mo51911b(zzji);
        zzjm.mo51921b(zzjh.mo51914g());
        zzjp c = zzjm.mo51922c();
        zzjd zzjd = new zzjd();
        zzjd.mo51899d(zzms.mo51989c());
        zzjd.mo51898c(zzms.mo51990d());
        zzjd.mo51897b(Long.valueOf((long) zzms.mo51987a()));
        zzjd.mo51901f(c);
        if (zzms.mo51994g()) {
            long i = sharedPrefManager.mo64575i(remoteModel);
            if (i == 0) {
                f43071a.mo21708h("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                long j = sharedPrefManager.mo64576j(remoteModel);
                if (j == 0) {
                    j = SystemClock.elapsedRealtime();
                    sharedPrefManager.mo64581o(remoteModel, j);
                }
                zzjd.mo51902g(Long.valueOf(j - i));
            }
        }
        if (zzms.mo51993f()) {
            long i2 = sharedPrefManager.mo64575i(remoteModel);
            if (i2 == 0) {
                f43071a.mo21708h("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                zzjd.mo51900e(Long.valueOf(SystemClock.elapsedRealtime() - i2));
            }
        }
        return zzjd.mo51903i();
    }
}

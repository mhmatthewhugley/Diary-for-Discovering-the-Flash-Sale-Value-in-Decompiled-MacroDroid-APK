package com.google.android.gms.internal.mlkit_translate;

import android.os.SystemClock;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzqh {

    /* renamed from: a */
    private static final GmsLogger f44456a = new GmsLogger("RemoteModelUtils", "");

    @WorkerThread
    /* renamed from: a */
    public static zzll m62201a(RemoteModel remoteModel, SharedPrefManager sharedPrefManager, zzpw zzpw) {
        zzln zzln;
        ModelType b = zzpw.mo52422b();
        String a = remoteModel.mo64528a();
        zzlr zzlr = new zzlr();
        zzlm zzlm = new zzlm();
        zzlm.mo52277c(remoteModel.mo64530c());
        zzlm.mo52278d(zzlo.CLOUD);
        zzlm.mo52275a(zzl.m61937b(a));
        int i = zzqg.f44455a[b.ordinal()];
        if (i == 1) {
            zzln = zzln.BASE_TRANSLATE;
        } else if (i == 2) {
            zzln = zzln.BASE_DIGITAL_INK;
        } else if (i != 3) {
            zzln = zzln.TYPE_UNKNOWN;
        } else {
            zzln = zzln.CUSTOM;
        }
        zzlm.mo52276b(zzln);
        zzlr.mo52286b(zzlm.mo52279g());
        zzlu c = zzlr.mo52287c();
        zzli zzli = new zzli();
        zzli.mo52266d(zzpw.mo52423c());
        zzli.mo52265c(zzpw.mo52424d());
        zzli.mo52264b(Long.valueOf((long) zzpw.mo52421a()));
        zzli.mo52267e(c);
        if (zzpw.mo52428g()) {
            long i2 = sharedPrefManager.mo64575i(remoteModel);
            if (i2 == 0) {
                f44456a.mo21708h("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                long j = sharedPrefManager.mo64576j(remoteModel);
                if (j == 0) {
                    j = SystemClock.elapsedRealtime();
                    sharedPrefManager.mo64581o(remoteModel, j);
                }
                zzli.mo52268f(Long.valueOf(j - i2));
            }
        }
        return zzli.mo52269h();
    }
}

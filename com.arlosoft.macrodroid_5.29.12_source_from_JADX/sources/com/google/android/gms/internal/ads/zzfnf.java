package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.ShowFirstParty;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;

@ShowFirstParty
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfnf {
    /* renamed from: a */
    public static zzana m50612a(Context context, String str, String str2) {
        return new zzfne(context, str, str2).mo46000b(SamsungIrisUnlockModule.IRIS_ERROR_NEED_TO_RETRY);
    }
}

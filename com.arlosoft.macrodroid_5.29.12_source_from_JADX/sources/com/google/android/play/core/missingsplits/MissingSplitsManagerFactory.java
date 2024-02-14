package com.google.android.play.core.missingsplits;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicReference;

@Deprecated
/* compiled from: com.google.android.play:core@@1.10.3 */
public final class MissingSplitsManagerFactory {

    /* renamed from: a */
    private static final AtomicReference f51733a = new AtomicReference((Object) null);

    private MissingSplitsManagerFactory() {
    }

    @NonNull
    @Deprecated
    /* renamed from: a */
    public static MissingSplitsManager m71034a(@NonNull Context context) {
        return new zzb(context, Runtime.getRuntime(), new zza(context, context.getPackageManager()), f51733a);
    }
}

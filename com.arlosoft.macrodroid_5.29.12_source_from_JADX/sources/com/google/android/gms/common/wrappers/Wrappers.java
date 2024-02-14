package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class Wrappers {

    /* renamed from: b */
    private static Wrappers f3968b = new Wrappers();
    @Nullable

    /* renamed from: a */
    private PackageManagerWrapper f3969a = null;

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static PackageManagerWrapper m4929a(@NonNull Context context) {
        return f3968b.mo21966b(context);
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: b */
    public final synchronized PackageManagerWrapper mo21966b(@NonNull Context context) {
        if (this.f3969a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f3969a = new PackageManagerWrapper(context);
        }
        return this.f3969a;
    }
}

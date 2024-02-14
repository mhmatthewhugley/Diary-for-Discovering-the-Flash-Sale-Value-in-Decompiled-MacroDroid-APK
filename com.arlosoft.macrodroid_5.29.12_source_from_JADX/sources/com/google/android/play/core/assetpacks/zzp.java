package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzp {

    /* renamed from: a */
    private final Context f51632a;

    public zzp(Context context) {
        this.f51632a = context;
    }

    @Nullable
    /* renamed from: b */
    static String m70752b(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString("local_testing_dir");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo59786a() {
        return this.f51632a;
    }
}

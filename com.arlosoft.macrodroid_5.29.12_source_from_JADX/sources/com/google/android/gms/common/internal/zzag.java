package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzag {

    /* renamed from: a */
    private static final Object f3744a = new Object();

    /* renamed from: b */
    private static boolean f3745b;
    @Nullable

    /* renamed from: c */
    private static String f3746c;

    /* renamed from: d */
    private static int f3747d;

    /* renamed from: a */
    public static int m4676a(Context context) {
        m4677b(context);
        return f3747d;
    }

    /* renamed from: b */
    private static void m4677b(Context context) {
        synchronized (f3744a) {
            if (!f3745b) {
                f3745b = true;
                try {
                    Bundle bundle = Wrappers.m4929a(context).mo21960c(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f3746c = bundle.getString("com.google.app.id");
                        f3747d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}

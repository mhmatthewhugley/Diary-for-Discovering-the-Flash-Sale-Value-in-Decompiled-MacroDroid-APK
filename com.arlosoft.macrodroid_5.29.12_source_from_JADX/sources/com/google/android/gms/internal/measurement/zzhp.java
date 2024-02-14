package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzhp {

    /* renamed from: a */
    static volatile zzig f41491a = zzig.m60303c();

    /* renamed from: b */
    private static final Object f41492b = new Object();

    /* renamed from: a */
    public static boolean m60277a(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        } else if (f41491a.mo51286b()) {
            return ((Boolean) f41491a.mo51285a()).booleanValue();
        } else {
            synchronized (f41492b) {
                if (f41491a.mo51286b()) {
                    boolean booleanValue = ((Boolean) f41491a.mo51285a()).booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (resolveContentProvider != null) {
                        if (!"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        }
                    }
                    f41491a = zzig.m60304d(Boolean.valueOf(z));
                    return ((Boolean) f41491a.mo51285a()).booleanValue();
                }
                try {
                    if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                        z = true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                f41491a = zzig.m60304d(Boolean.valueOf(z));
                return ((Boolean) f41491a.mo51285a()).booleanValue();
            }
        }
    }
}

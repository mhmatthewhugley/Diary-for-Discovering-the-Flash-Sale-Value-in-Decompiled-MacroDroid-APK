package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.core.content.PermissionChecker;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzhn implements zzhk {
    @GuardedBy("GservicesLoader.class")

    /* renamed from: c */
    private static zzhn f41487c;

    /* renamed from: a */
    private final Context f41488a;

    /* renamed from: b */
    private final ContentObserver f41489b;

    private zzhn() {
        this.f41488a = null;
        this.f41489b = null;
    }

    private zzhn(Context context) {
        this.f41488a = context;
        zzhm zzhm = new zzhm(this, (Handler) null);
        this.f41489b = zzhm;
        context.getContentResolver().registerContentObserver(zzha.f41456a, true, zzhm);
    }

    /* renamed from: a */
    static zzhn m60271a(Context context) {
        zzhn zzhn;
        zzhn zzhn2;
        synchronized (zzhn.class) {
            if (f41487c == null) {
                if (PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    zzhn2 = new zzhn(context);
                } else {
                    zzhn2 = new zzhn();
                }
                f41487c = zzhn2;
            }
            zzhn = f41487c;
        }
        return zzhn;
    }

    /* renamed from: d */
    static synchronized void m60272d() {
        Context context;
        synchronized (zzhn.class) {
            zzhn zzhn = f41487c;
            if (!(zzhn == null || (context = zzhn.f41488a) == null || zzhn.f41489b == null)) {
                context.getContentResolver().unregisterContentObserver(f41487c.f41489b);
            }
            f41487c = null;
        }
    }

    /* renamed from: b */
    public final String mo51268t(String str) {
        Context context = this.f41488a;
        if (context != null && !zzhb.m60258a(context)) {
            try {
                return (String) zzhi.m60269a(new zzhl(this, str));
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ String mo51273c(String str) {
        return zzha.m60255a(this.f41488a.getContentResolver(), str, (String) null);
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.p023dx.rop.code.RegisterSpec;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfok implements zzfna {

    /* renamed from: a */
    private final Object f36193a;

    /* renamed from: b */
    private final zzfol f36194b;

    /* renamed from: c */
    private final zzfow f36195c;

    /* renamed from: d */
    private final zzfmx f36196d;

    zzfok(@NonNull Object obj, @NonNull zzfol zzfol, @NonNull zzfow zzfow, @NonNull zzfmx zzfmx) {
        this.f36193a = obj;
        this.f36194b = zzfol;
        this.f36195c = zzfow;
        this.f36196d = zzfmx;
    }

    @Nullable
    /* renamed from: i */
    private static String m50671i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzanm F = zzann.m41973F();
        F.mo41755u(5);
        F.mo41753n(zzgpw.m52564R(bArr));
        return Base64.encodeToString(((zzann) F.mo47341h()).mo47050p(), 11);
    }

    @Nullable
    /* renamed from: j */
    private final synchronized byte[] m50672j(Map map, Map map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.f36196d.mo45982c(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.f36193a.getClass().getDeclaredMethod("xss", new Class[]{Map.class, Map.class}).invoke(this.f36193a, new Object[]{null, map2});
    }

    /* renamed from: a */
    public final synchronized void mo45993a(String str, MotionEvent motionEvent) throws zzfou {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", (Object) null);
            hashMap.put("evt", motionEvent);
            this.f36193a.getClass().getDeclaredMethod("he", new Class[]{Map.class}).invoke(this.f36193a, new Object[]{hashMap});
            this.f36196d.mo45983d(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfou((int) SamsungIrisUnlockModule.IRIS_REQUEST_IR_PREVIEW_ENABLE, (Throwable) e);
        }
    }

    @Nullable
    /* renamed from: b */
    public final synchronized String mo45994b(Context context, String str, View view, Activity activity) {
        Map a;
        a = this.f36195c.mo41797a();
        a.put("f", RegisterSpec.PREFIX);
        a.put("ctx", context);
        a.put("aid", (Object) null);
        a.put("view", view);
        a.put("act", activity);
        return m50671i(m50672j((Map) null, a));
    }

    @Nullable
    /* renamed from: c */
    public final synchronized String mo45995c(Context context, String str) {
        Map zzb;
        zzb = this.f36195c.zzb();
        zzb.put("f", "q");
        zzb.put("ctx", context);
        zzb.put("aid", (Object) null);
        return m50671i(m50672j((Map) null, zzb));
    }

    @Nullable
    /* renamed from: d */
    public final synchronized String mo45996d(Context context, String str, String str2, View view, Activity activity) {
        Map zza;
        zza = this.f36195c.zza();
        zza.put("f", "c");
        zza.put("ctx", context);
        zza.put("cs", str2);
        zza.put("aid", (Object) null);
        zza.put("view", view);
        zza.put("act", activity);
        return m50671i(m50672j((Map) null, zza));
    }

    /* renamed from: e */
    public final synchronized int mo46035e() throws zzfou {
        try {
        } catch (Exception e) {
            throw new zzfou(2006, (Throwable) e);
        }
        return ((Integer) this.f36193a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.f36193a, new Object[0])).intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final zzfol mo46036f() {
        return this.f36194b;
    }

    /* renamed from: g */
    public final synchronized void mo46037g() throws zzfou {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f36193a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.f36193a, new Object[0]);
            this.f36196d.mo45983d(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfou(2003, (Throwable) e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final synchronized boolean mo46038h() throws zzfou {
        try {
        } catch (Exception e) {
            throw new zzfou(2001, (Throwable) e);
        }
        return ((Boolean) this.f36193a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.f36193a, new Object[0])).booleanValue();
    }
}

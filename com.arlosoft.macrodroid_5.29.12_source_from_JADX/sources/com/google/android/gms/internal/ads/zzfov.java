package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import dalvik.system.DexClassLoader;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfov {

    /* renamed from: g */
    private static final HashMap f36220g = new HashMap();

    /* renamed from: a */
    private final Context f36221a;

    /* renamed from: b */
    private final zzfow f36222b;

    /* renamed from: c */
    private final zzfmx f36223c;

    /* renamed from: d */
    private final zzfms f36224d;
    @Nullable

    /* renamed from: e */
    private zzfok f36225e;

    /* renamed from: f */
    private final Object f36226f = new Object();

    public zzfov(@NonNull Context context, @NonNull zzfow zzfow, @NonNull zzfmx zzfmx, @NonNull zzfms zzfms) {
        this.f36221a = context;
        this.f36222b = zzfow;
        this.f36223c = zzfmx;
        this.f36224d = zzfms;
    }

    /* renamed from: d */
    private final synchronized Class m50711d(@NonNull zzfol zzfol) throws zzfou {
        String O = zzfol.mo46039a().mo41864O();
        HashMap hashMap = f36220g;
        Class cls = (Class) hashMap.get(O);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.f36224d.mo45978a(zzfol.mo46041c())) {
                File b = zzfol.mo46040b();
                if (!b.exists()) {
                    b.mkdirs();
                }
                Class loadClass = new DexClassLoader(zzfol.mo46041c().getAbsolutePath(), b.getAbsolutePath(), (String) null, this.f36221a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(O, loadClass);
                return loadClass;
            }
            throw new zzfou(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e) {
            throw new zzfou(2026, (Throwable) e);
        } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e2) {
            throw new zzfou(2008, e2);
        }
    }

    @Nullable
    /* renamed from: a */
    public final zzfna mo46058a() {
        zzfok zzfok;
        synchronized (this.f36226f) {
            zzfok = this.f36225e;
        }
        return zzfok;
    }

    @Nullable
    /* renamed from: b */
    public final zzfol mo46059b() {
        synchronized (this.f36226f) {
            zzfok zzfok = this.f36225e;
            if (zzfok == null) {
                return null;
            }
            zzfol f = zzfok.mo46036f();
            return f;
        }
    }

    /* renamed from: c */
    public final boolean mo46060c(@NonNull zzfol zzfol) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Class d = m50711d(zzfol);
            zzfok zzfok = new zzfok(d.getDeclaredConstructor(new Class[]{Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE}).newInstance(new Object[]{this.f36221a, "msa-r", zzfol.mo46043e(), null, new Bundle(), 2}), zzfol, this.f36222b, this.f36223c);
            if (zzfok.mo46038h()) {
                int e = zzfok.mo46035e();
                if (e == 0) {
                    synchronized (this.f36226f) {
                        zzfok zzfok2 = this.f36225e;
                        if (zzfok2 != null) {
                            try {
                                zzfok2.mo46037g();
                            } catch (zzfou e2) {
                                this.f36223c.mo45982c(e2.mo46057a(), -1, e2);
                            }
                        }
                        this.f36225e = zzfok;
                    }
                    this.f36223c.mo45983d(PathInterpolatorCompat.MAX_NUM_POINTS, System.currentTimeMillis() - currentTimeMillis);
                    return true;
                }
                throw new zzfou(4001, "ci: " + e);
            }
            throw new zzfou(4000, "init failed");
        } catch (Exception e3) {
            throw new zzfou((int) SamsungIrisUnlockModule.IRIS_REQUEST_FACTORY_TEST_CAMERA_VERSION, (Throwable) e3);
        } catch (zzfou e4) {
            this.f36223c.mo45982c(e4.mo46057a(), System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        } catch (Exception e5) {
            this.f36223c.mo45982c(4010, System.currentTimeMillis() - currentTimeMillis, e5);
            return false;
        }
    }
}

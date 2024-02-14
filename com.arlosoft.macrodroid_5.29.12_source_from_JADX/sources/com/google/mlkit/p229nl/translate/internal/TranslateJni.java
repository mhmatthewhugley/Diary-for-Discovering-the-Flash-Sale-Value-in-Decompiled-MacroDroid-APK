package com.google.mlkit.p229nl.translate.internal;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_translate.zzc;
import com.google.android.gms.internal.mlkit_translate.zzv;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.ModelResource;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import java.io.File;
import java.nio.charset.Charset;

/* renamed from: com.google.mlkit.nl.translate.internal.TranslateJni */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public class TranslateJni extends ModelResource {

    /* renamed from: j */
    private static boolean f56440j;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zzaf f56441d;

    /* renamed from: e */
    private final zzt f56442e;

    /* renamed from: f */
    private final ModelFileHelper f56443f;

    /* renamed from: g */
    private final String f56444g;

    /* renamed from: h */
    private final String f56445h;

    /* renamed from: i */
    private long f56446i;

    @VisibleForTesting
    public TranslateJni(zzaf zzaf, zzt zzt, ModelFileHelper modelFileHelper, String str, String str2) {
        this.f56441d = zzaf;
        this.f56442e = zzt;
        this.f56443f = modelFileHelper;
        this.f56444g = str;
        this.f56445h = str2;
    }

    @VisibleForTesting
    /* renamed from: l */
    public static void m79163l() throws MlKitException {
        if (!f56440j) {
            try {
                System.loadLibrary("translate_jni");
                f56440j = true;
            } catch (UnsatisfiedLinkError e) {
                throw new MlKitException("Couldn't load translate native code library.", 12, e);
            }
        }
    }

    /* renamed from: m */
    private final File m79164m(String str) {
        return this.f56443f.mo64594f(str, ModelType.TRANSLATE, false);
    }

    private native void nativeDestroy(long j);

    private native long nativeInit(String str, String str2, String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) throws zzl;

    @UsedByNative("translate_jni.cc")
    private static Exception newLoadingException(int i) {
        return new zzl(i, (zzk) null);
    }

    @UsedByNative("translate_jni.cc")
    private static Exception newTranslateException(int i) {
        return new zzn(i, (zzm) null);
    }

    /* renamed from: c */
    public final void mo64561c() throws MlKitException {
        Exception exc;
        String str;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Preconditions.m4493p(this.f56446i == 0);
            m79163l();
            zzv b = zzad.m79185b(this.f56444g, this.f56445h);
            if (b.size() < 2) {
                exc = null;
            } else {
                String absolutePath = m79164m(zzad.m79189f((String) b.get(0), (String) b.get(1))).getAbsolutePath();
                zzp zzp = new zzp(this, (zzo) null);
                zzp.mo64688a(absolutePath, (String) b.get(0), (String) b.get(1));
                zzp zzp2 = new zzp(this, (zzo) null);
                if (b.size() > 2) {
                    String absolutePath2 = m79164m(zzad.m79189f((String) b.get(1), (String) b.get(2))).getAbsolutePath();
                    zzp2.mo64688a(absolutePath2, (String) b.get(1), (String) b.get(2));
                    str = absolutePath2;
                } else {
                    str = null;
                }
                String str2 = this.f56444g;
                String str3 = zzp2.f56535c;
                String str4 = str2;
                exc = null;
                long nativeInit = nativeInit(str4, this.f56445h, absolutePath, str, zzp.f56533a, zzp2.f56533a, zzp.f56534b, zzp2.f56534b, zzp.f56535c, str3);
                this.f56446i = nativeInit;
                Preconditions.m4493p(nativeInit != 0);
            }
            this.f56442e.mo64705q(elapsedRealtime, exc);
        } catch (zzl e) {
            if (e.mo64686a() != 1) {
                if (e.mo64686a() != 8) {
                    throw new MlKitException("Error loading translation model", 2, e);
                }
            }
            throw new MlKitException("Translation model files not found. Make sure to call downloadModelIfNeeded and if that fails, delete the models and retry.", 5, e);
        } catch (Exception e2) {
            this.f56442e.mo64705q(elapsedRealtime, e2);
            throw e2;
        }
    }

    /* renamed from: e */
    public final void mo64563e() {
        long j = this.f56446i;
        if (j != 0) {
            nativeDestroy(j);
            this.f56446i = 0;
        }
    }

    @NonNull
    /* renamed from: k */
    public final String mo64647k(@NonNull String str) throws MlKitException {
        if (this.f56444g.equals(this.f56445h)) {
            return str;
        }
        try {
            long j = this.f56446i;
            Charset charset = zzc.f43169c;
            return new String(nativeTranslate(j, str.getBytes(charset)), charset);
        } catch (zzn e) {
            throw new MlKitException("Error translating", 2, e);
        }
    }

    @VisibleForTesting
    @NonNull
    public native byte[] nativeTranslate(long j, @NonNull byte[] bArr) throws zzn;
}

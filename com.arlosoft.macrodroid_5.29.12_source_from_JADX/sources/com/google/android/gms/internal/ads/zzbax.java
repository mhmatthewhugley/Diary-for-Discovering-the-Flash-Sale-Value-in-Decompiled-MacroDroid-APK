package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbax extends Surface {

    /* renamed from: d */
    private static boolean f26440d;

    /* renamed from: f */
    private static boolean f26441f;

    /* renamed from: a */
    private final zzbav f26442a;

    /* renamed from: c */
    private boolean f26443c;

    /* synthetic */ zzbax(zzbav zzbav, SurfaceTexture surfaceTexture, boolean z, zzbaw zzbaw) {
        super(surfaceTexture);
        this.f26442a = zzbav;
    }

    /* renamed from: a */
    public static zzbax m43006a(Context context, boolean z) {
        if (zzbar.f26418a >= 17) {
            boolean z2 = true;
            if (z && !m43007b(context)) {
                z2 = false;
            }
            zzbac.m42926e(z2);
            return new zzbav().mo42355a(z);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    /* renamed from: b */
    public static synchronized boolean m43007b(Context context) {
        boolean z;
        synchronized (zzbax.class) {
            if (!f26441f) {
                int i = zzbar.f26418a;
                if (i >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (i == 24) {
                            String str = zzbar.f26421d;
                            if ((str.startsWith("SM-G950") || str.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                            }
                        }
                        z2 = true;
                    }
                    f26440d = z2;
                }
                f26441f = true;
            }
            z = f26440d;
        }
        return z;
    }

    public final void release() {
        super.release();
        synchronized (this.f26442a) {
            if (!this.f26443c) {
                this.f26442a.mo42356b();
                this.f26443c = true;
            }
        }
    }
}

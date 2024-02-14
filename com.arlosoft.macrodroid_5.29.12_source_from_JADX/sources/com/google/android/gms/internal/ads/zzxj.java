package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import androidx.annotation.RequiresApi;

@RequiresApi(17)
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzxj extends Surface {

    /* renamed from: f */
    private static int f38896f;

    /* renamed from: g */
    private static boolean f38897g;

    /* renamed from: a */
    public final boolean f38898a;

    /* renamed from: c */
    private final zzxh f38899c;

    /* renamed from: d */
    private boolean f38900d;

    /* synthetic */ zzxj(zzxh zzxh, SurfaceTexture surfaceTexture, boolean z, zzxi zzxi) {
        super(surfaceTexture);
        this.f38899c = zzxh;
        this.f38898a = z;
    }

    /* renamed from: a */
    public static zzxj m55365a(Context context, boolean z) {
        int i = 0;
        boolean z2 = true;
        if (z && !m55366b(context)) {
            z2 = false;
        }
        zzdd.m47212f(z2);
        zzxh zzxh = new zzxh();
        if (z) {
            i = f38896f;
        }
        return zzxh.mo48389a(i);
    }

    /* renamed from: b */
    public static synchronized boolean m55366b(Context context) {
        int i;
        synchronized (zzxj.class) {
            if (!f38897g) {
                int i2 = zzen.f34500a;
                int i3 = 2;
                if (i2 >= 24) {
                    if (i2 < 26) {
                        if (!"samsung".equals(zzen.f34502c)) {
                            if ("XT1650".equals(zzen.f34503d)) {
                            }
                        }
                    }
                    if (i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                        if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                            String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                            if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                                i3 = 1;
                            }
                            f38896f = i3;
                            f38897g = true;
                        }
                    }
                }
                i3 = 0;
                f38896f = i3;
                f38897g = true;
            }
            i = f38896f;
        }
        return i != 0;
    }

    public final void release() {
        super.release();
        synchronized (this.f38899c) {
            if (!this.f38900d) {
                this.f38899c.mo48390b();
                this.f38900d = true;
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;

@RequiresApi(17)
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdj implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: p */
    private static final int[] f32338p = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a */
    private final Handler f32339a;

    /* renamed from: c */
    private final int[] f32340c = new int[1];
    @Nullable

    /* renamed from: d */
    private EGLDisplay f32341d;
    @Nullable

    /* renamed from: f */
    private EGLContext f32342f;
    @Nullable

    /* renamed from: g */
    private EGLSurface f32343g;
    @Nullable

    /* renamed from: o */
    private SurfaceTexture f32344o;

    public zzdj(Handler handler, @Nullable zzdi zzdi) {
        this.f32339a = handler;
    }

    /* renamed from: a */
    public final SurfaceTexture mo44664a() {
        SurfaceTexture surfaceTexture = this.f32344o;
        Objects.requireNonNull(surfaceTexture);
        return surfaceTexture;
    }

    /* renamed from: b */
    public final void mo44665b(int i) throws zzdk {
        EGLSurface eGLSurface;
        int[] iArr;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        zzdl.m47513a(eglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr2 = new int[2];
        zzdl.m47513a(EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1), "eglInitialize failed");
        this.f32341d = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f32338p, 0, eGLConfigArr, 0, 1, iArr3, 0);
        zzdl.m47513a(eglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null, zzen.m49168i("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]));
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f32341d, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        zzdl.m47513a(eglCreateContext != null, "eglCreateContext failed");
        this.f32342f = eglCreateContext;
        EGLDisplay eGLDisplay = this.f32341d;
        if (i == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            zzdl.m47513a(eGLSurface != null, "eglCreatePbufferSurface failed");
        }
        zzdl.m47513a(EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eglCreateContext), "eglMakeCurrent failed");
        this.f32343g = eGLSurface;
        GLES20.glGenTextures(1, this.f32340c, 0);
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append(10);
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(glGetError));
            z = true;
        }
        if (!z) {
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f32340c[0]);
            this.f32344o = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this);
            return;
        }
        throw new zzdk(sb.toString());
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final void mo44666c() {
        this.f32339a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f32344o;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f32340c, 0);
            }
            EGLDisplay eGLDisplay = this.f32341d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f32341d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f32343g;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f32341d, this.f32343g);
            }
            EGLContext eGLContext = this.f32342f;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f32341d, eGLContext);
            }
            int i = zzen.f34500a;
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f32341d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f32341d);
            }
            this.f32341d = null;
            this.f32342f = null;
            this.f32343g = null;
            this.f32344o = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.f32341d;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f32341d;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f32343g;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f32341d, this.f32343g);
            }
            EGLContext eGLContext2 = this.f32342f;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f32341d, eGLContext2);
            }
            int i2 = zzen.f34500a;
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay6 = this.f32341d;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f32341d);
            }
            this.f32341d = null;
            this.f32342f = null;
            this.f32343g = null;
            this.f32344o = null;
            throw th;
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f32339a.post(this);
    }

    public final void run() {
        SurfaceTexture surfaceTexture = this.f32344o;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzciw extends Thread implements SurfaceTexture.OnFrameAvailableListener, zzciu {

    /* renamed from: S */
    private static final float[] f28554S = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: A */
    private float f28555A;

    /* renamed from: B */
    private float f28556B;

    /* renamed from: C */
    private int f28557C;

    /* renamed from: D */
    private int f28558D;

    /* renamed from: E */
    private SurfaceTexture f28559E;

    /* renamed from: F */
    private SurfaceTexture f28560F;

    /* renamed from: G */
    private int f28561G;

    /* renamed from: H */
    private int f28562H;

    /* renamed from: I */
    private int f28563I;

    /* renamed from: J */
    private final FloatBuffer f28564J;

    /* renamed from: K */
    private final CountDownLatch f28565K;

    /* renamed from: L */
    private final Object f28566L;

    /* renamed from: M */
    private EGL10 f28567M;

    /* renamed from: N */
    private EGLDisplay f28568N;

    /* renamed from: O */
    private EGLContext f28569O;

    /* renamed from: P */
    private EGLSurface f28570P;

    /* renamed from: Q */
    private volatile boolean f28571Q;

    /* renamed from: R */
    private volatile boolean f28572R;

    /* renamed from: a */
    private final zzciv f28573a;

    /* renamed from: c */
    private final float[] f28574c = new float[9];

    /* renamed from: d */
    private final float[] f28575d = new float[9];

    /* renamed from: f */
    private final float[] f28576f = new float[9];

    /* renamed from: g */
    private final float[] f28577g = new float[9];

    /* renamed from: o */
    private final float[] f28578o = new float[9];

    /* renamed from: p */
    private final float[] f28579p = new float[9];

    /* renamed from: s */
    private final float[] f28580s = new float[9];

    /* renamed from: z */
    private float f28581z = Float.NaN;

    public zzciw(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = f28554S;
        int length = fArr.length;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f28564J = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        zzciv zzciv = new zzciv(context);
        this.f28573a = zzciv;
        zzciv.mo43729a(this);
        this.f28565K = new CountDownLatch(1);
        this.f28566L = new Object();
    }

    /* renamed from: g */
    private static final void m45422g(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e("SphericalVideoRenderer", str + ": glError " + glGetError);
        }
    }

    /* renamed from: h */
    private static final void m45423h(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    /* renamed from: i */
    private static final void m45424i(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = (double) f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    /* renamed from: j */
    private static final void m45425j(float[] fArr, float f) {
        double d = (double) f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    /* renamed from: k */
    private static final int m45426k(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        m45422g("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            m45422g("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            m45422g("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            m45422g("getShaderiv");
            if (iArr[0] == 0) {
                Log.e("SphericalVideoRenderer", "Could not compile shader " + i + ":");
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                m45422g("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    @Nullable
    /* renamed from: a */
    public final SurfaceTexture mo43735a() {
        if (this.f28560F == null) {
            return null;
        }
        try {
            this.f28565K.await();
        } catch (InterruptedException unused) {
        }
        return this.f28559E;
    }

    /* renamed from: b */
    public final void mo43736b(int i, int i2) {
        synchronized (this.f28566L) {
            this.f28558D = i;
            this.f28557C = i2;
            this.f28571Q = true;
            this.f28566L.notifyAll();
        }
    }

    /* renamed from: c */
    public final void mo43737c(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f28558D = i;
        this.f28557C = i2;
        this.f28560F = surfaceTexture;
    }

    /* renamed from: d */
    public final void mo43738d() {
        synchronized (this.f28566L) {
            this.f28572R = true;
            this.f28560F = null;
            this.f28566L.notifyAll();
        }
    }

    /* renamed from: e */
    public final void mo43739e(float f, float f2) {
        int i = this.f28558D;
        int i2 = this.f28557C;
        float f3 = i > i2 ? (float) i : (float) i2;
        this.f28555A -= (f * 1.7453293f) / f3;
        float f4 = this.f28556B - ((f2 * 1.7453293f) / f3);
        this.f28556B = f4;
        if (f4 < -1.5707964f) {
            this.f28556B = -1.5707964f;
            f4 = -1.5707964f;
        }
        if (f4 > 1.5707964f) {
            this.f28556B = 1.5707964f;
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: f */
    public final boolean mo43740f() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f28570P;
        boolean z = false;
        if (!(eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE))) {
            z = this.f28567M.eglDestroySurface(this.f28568N, this.f28570P) | this.f28567M.eglMakeCurrent(this.f28568N, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f28570P = null;
        }
        EGLContext eGLContext = this.f28569O;
        if (eGLContext != null) {
            z |= this.f28567M.eglDestroyContext(this.f28568N, eGLContext);
            this.f28569O = null;
        }
        EGLDisplay eGLDisplay = this.f28568N;
        if (eGLDisplay == null) {
            return z;
        }
        boolean eglTerminate = this.f28567M.eglTerminate(eGLDisplay);
        this.f28568N = null;
        return eglTerminate | z;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f28563I++;
        synchronized (this.f28566L) {
            this.f28566L.notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01bf A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            android.graphics.SurfaceTexture r0 = r15.f28560F
            if (r0 == 0) goto L_0x039b
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            r15.f28567M = r0
            java.lang.Object r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglGetDisplay(r1)
            r15.f28568N = r0
            javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            if (r0 != r1) goto L_0x0020
        L_0x001d:
            r0 = 0
            goto L_0x0087
        L_0x0020:
            int[] r1 = new int[r3]
            javax.microedition.khronos.egl.EGL10 r7 = r15.f28567M
            boolean r0 = r7.eglInitialize(r0, r1)
            if (r0 != 0) goto L_0x002b
            goto L_0x001d
        L_0x002b:
            int[] r0 = new int[r5]
            javax.microedition.khronos.egl.EGLConfig[] r1 = new javax.microedition.khronos.egl.EGLConfig[r5]
            r7 = 11
            int[] r9 = new int[r7]
            r9 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r15.f28567M
            javax.microedition.khronos.egl.EGLDisplay r8 = r15.f28568N
            r11 = 1
            r10 = r1
            r12 = r0
            boolean r7 = r7.eglChooseConfig(r8, r9, r10, r11, r12)
            if (r7 != 0) goto L_0x0045
        L_0x0043:
            r0 = r4
            goto L_0x004b
        L_0x0045:
            r0 = r0[r6]
            if (r0 <= 0) goto L_0x0043
            r0 = r1[r6]
        L_0x004b:
            if (r0 != 0) goto L_0x004e
            goto L_0x001d
        L_0x004e:
            int[] r1 = new int[r2]
            r1 = {12440, 2, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r15.f28567M
            javax.microedition.khronos.egl.EGLDisplay r8 = r15.f28568N
            javax.microedition.khronos.egl.EGLContext r9 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            javax.microedition.khronos.egl.EGLContext r1 = r7.eglCreateContext(r8, r0, r9, r1)
            r15.f28569O = r1
            if (r1 == 0) goto L_0x001d
            javax.microedition.khronos.egl.EGLContext r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            if (r1 != r7) goto L_0x0066
            goto L_0x001d
        L_0x0066:
            javax.microedition.khronos.egl.EGL10 r1 = r15.f28567M
            javax.microedition.khronos.egl.EGLDisplay r7 = r15.f28568N
            android.graphics.SurfaceTexture r8 = r15.f28560F
            javax.microedition.khronos.egl.EGLSurface r0 = r1.eglCreateWindowSurface(r7, r0, r8, r4)
            r15.f28570P = r0
            if (r0 == 0) goto L_0x001d
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 != r1) goto L_0x0079
            goto L_0x001d
        L_0x0079:
            javax.microedition.khronos.egl.EGL10 r1 = r15.f28567M
            javax.microedition.khronos.egl.EGLDisplay r7 = r15.f28568N
            javax.microedition.khronos.egl.EGLContext r8 = r15.f28569O
            boolean r0 = r1.eglMakeCurrent(r7, r0, r0, r8)
            if (r0 != 0) goto L_0x0086
            goto L_0x001d
        L_0x0086:
            r0 = 1
        L_0x0087:
            com.google.android.gms.internal.ads.zzbiu r1 = com.google.android.gms.internal.ads.zzbjc.f27083c1
            com.google.android.gms.internal.ads.zzbja r7 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r7 = r7.mo42663b(r1)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r1.mo42651m()
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00a8
            com.google.android.gms.internal.ads.zzbja r7 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r1 = r7.mo42663b(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00aa
        L_0x00a8:
            java.lang.String r1 = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}"
        L_0x00aa:
            r7 = 35633(0x8b31, float:4.9932E-41)
            int r1 = m45426k(r7, r1)
            if (r1 != 0) goto L_0x00b6
        L_0x00b3:
            r8 = 0
            goto L_0x0138
        L_0x00b6:
            com.google.android.gms.internal.ads.zzbiu r7 = com.google.android.gms.internal.ads.zzbjc.f27093d1
            com.google.android.gms.internal.ads.zzbja r8 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r8 = r8.mo42663b(r7)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r7.mo42651m()
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x00d7
            com.google.android.gms.internal.ads.zzbja r8 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r7 = r8.mo42663b(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x00d9
        L_0x00d7:
            java.lang.String r7 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}"
        L_0x00d9:
            r8 = 35632(0x8b30, float:4.9931E-41)
            int r7 = m45426k(r8, r7)
            if (r7 != 0) goto L_0x00e3
            goto L_0x00b3
        L_0x00e3:
            int r8 = android.opengl.GLES20.glCreateProgram()
            java.lang.String r9 = "createProgram"
            m45422g(r9)
            if (r8 == 0) goto L_0x0138
            android.opengl.GLES20.glAttachShader(r8, r1)
            java.lang.String r1 = "attachShader"
            m45422g(r1)
            android.opengl.GLES20.glAttachShader(r8, r7)
            java.lang.String r1 = "attachShader"
            m45422g(r1)
            android.opengl.GLES20.glLinkProgram(r8)
            java.lang.String r1 = "linkProgram"
            m45422g(r1)
            int[] r1 = new int[r5]
            r7 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r8, r7, r1, r6)
            java.lang.String r7 = "getProgramiv"
            m45422g(r7)
            r1 = r1[r6]
            if (r1 == r5) goto L_0x0130
            java.lang.String r1 = "SphericalVideoRenderer"
            java.lang.String r7 = "Could not link program: "
            android.util.Log.e(r1, r7)
            java.lang.String r1 = "SphericalVideoRenderer"
            java.lang.String r7 = android.opengl.GLES20.glGetProgramInfoLog(r8)
            android.util.Log.e(r1, r7)
            android.opengl.GLES20.glDeleteProgram(r8)
            java.lang.String r1 = "deleteProgram"
            m45422g(r1)
            goto L_0x00b3
        L_0x0130:
            android.opengl.GLES20.glValidateProgram(r8)
            java.lang.String r1 = "validateProgram"
            m45422g(r1)
        L_0x0138:
            r15.f28561G = r8
            android.opengl.GLES20.glUseProgram(r8)
            java.lang.String r1 = "useProgram"
            m45422g(r1)
            int r1 = r15.f28561G
            java.lang.String r7 = "aPosition"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r1, r7)
            r9 = 3
            r10 = 5126(0x1406, float:7.183E-42)
            r11 = 0
            r12 = 12
            java.nio.FloatBuffer r13 = r15.f28564J
            r8 = r1
            android.opengl.GLES20.glVertexAttribPointer(r8, r9, r10, r11, r12, r13)
            java.lang.String r7 = "vertexAttribPointer"
            m45422g(r7)
            android.opengl.GLES20.glEnableVertexAttribArray(r1)
            java.lang.String r1 = "enableVertexAttribArray"
            m45422g(r1)
            int[] r1 = new int[r5]
            android.opengl.GLES20.glGenTextures(r5, r1, r6)
            java.lang.String r7 = "genTextures"
            m45422g(r7)
            r1 = r1[r6]
            r7 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r7, r1)
            java.lang.String r8 = "bindTextures"
            m45422g(r8)
            r8 = 10240(0x2800, float:1.4349E-41)
            r9 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m45422g(r8)
            r8 = 10241(0x2801, float:1.435E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m45422g(r8)
            r8 = 10242(0x2802, float:1.4352E-41)
            r9 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m45422g(r8)
            r8 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r7 = "texParameteri"
            m45422g(r7)
            int r7 = r15.f28561G
            java.lang.String r8 = "uVMat"
            int r7 = android.opengl.GLES20.glGetUniformLocation(r7, r8)
            r15.f28562H = r7
            r8 = 9
            float[] r8 = new float[r8]
            r8 = {1065353216, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216} // fill-array
            android.opengl.GLES20.glUniformMatrix3fv(r7, r5, r6, r8, r6)
            int r7 = r15.f28561G
            if (r0 == 0) goto L_0x036d
            if (r7 != 0) goto L_0x01c3
            goto L_0x036d
        L_0x01c3:
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r1)
            r15.f28559E = r0
            r0.setOnFrameAvailableListener(r15)
            java.util.concurrent.CountDownLatch r0 = r15.f28565K
            r0.countDown()
            com.google.android.gms.internal.ads.zzciv r0 = r15.f28573a
            r0.mo43730b()
            r15.f28571Q = r5     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
        L_0x01d9:
            boolean r0 = r15.f28572R     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            if (r0 != 0) goto L_0x0318
        L_0x01dd:
            int r0 = r15.f28563I     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            if (r0 <= 0) goto L_0x01ed
            android.graphics.SurfaceTexture r0 = r15.f28559E     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r0.updateTexImage()     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r0 = r15.f28563I     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r0 = r0 + -1
            r15.f28563I = r0     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            goto L_0x01dd
        L_0x01ed:
            com.google.android.gms.internal.ads.zzciv r0 = r15.f28573a     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r1 = r15.f28574c     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            boolean r0 = r0.mo43732d(r1)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r1 = 5
            r7 = 4
            r8 = -1077342245(0xffffffffbfc90fdb, float:-1.5707964)
            if (r0 == 0) goto L_0x0267
            float r0 = r15.f28581z     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            boolean r0 = java.lang.Float.isNaN(r0)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            if (r0 == 0) goto L_0x025c
            float[] r0 = r15.f28574c     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r9 = new float[r2]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r10 = 0
            r9[r6] = r10     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r11 = 1065353216(0x3f800000, float:1.0)
            r9[r5] = r11     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r9[r3] = r10     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r10 = new float[r2]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r11 = r0[r6]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r12 = r9[r6]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r11 = r11 * r12
            r13 = r0[r5]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r14 = r9[r5]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r13 = r13 * r14
            float r11 = r11 + r13
            r13 = r0[r3]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r9 = r9[r3]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r13 = r13 * r9
            float r11 = r11 + r13
            r10[r6] = r11     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r11 = r0[r2]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r11 = r11 * r12
            r13 = r0[r7]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r13 = r13 * r14
            float r11 = r11 + r13
            r13 = r0[r1]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r13 = r13 * r9
            float r11 = r11 + r13
            r10[r5] = r11     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r11 = 6
            r11 = r0[r11]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r11 = r11 * r12
            r12 = 7
            r12 = r0[r12]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r12 = r12 * r14
            float r11 = r11 + r12
            r12 = 8
            r0 = r0[r12]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r0 = r0 * r9
            float r11 = r11 + r0
            r10[r3] = r11     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r0 = r10[r5]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            double r11 = (double) r0     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r0 = r10[r6]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            double r9 = (double) r0     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            double r9 = java.lang.Math.atan2(r11, r9)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r0 = (float) r9     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r0 = r0 + r8
            float r0 = -r0
            r15.f28581z = r0     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
        L_0x025c:
            float[] r0 = r15.f28579p     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r8 = r15.f28581z     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r9 = r15.f28555A     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r8 = r8 + r9
            m45425j(r0, r8)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            goto L_0x0273
        L_0x0267:
            float[] r0 = r15.f28574c     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            m45424i(r0, r8)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r0 = r15.f28579p     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r8 = r15.f28555A     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            m45425j(r0, r8)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
        L_0x0273:
            float[] r0 = r15.f28575d     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r8 = 1070141403(0x3fc90fdb, float:1.5707964)
            m45424i(r0, r8)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r0 = r15.f28576f     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r8 = r15.f28579p     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r9 = r15.f28575d     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            m45423h(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r0 = r15.f28577g     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r8 = r15.f28574c     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r9 = r15.f28576f     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            m45423h(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r0 = r15.f28578o     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r8 = r15.f28556B     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            m45424i(r0, r8)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r0 = r15.f28580s     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r8 = r15.f28578o     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r9 = r15.f28577g     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            m45423h(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r0 = r15.f28562H     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r8 = r15.f28580s     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            android.opengl.GLES20.glUniformMatrix3fv(r0, r5, r6, r8, r6)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            android.opengl.GLES20.glDrawArrays(r1, r6, r7)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            java.lang.String r0 = "drawArrays"
            m45422g(r0)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            android.opengl.GLES20.glFinish()     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            javax.microedition.khronos.egl.EGL10 r0 = r15.f28567M     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            javax.microedition.khronos.egl.EGLDisplay r1 = r15.f28568N     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            javax.microedition.khronos.egl.EGLSurface r7 = r15.f28570P     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r0.eglSwapBuffers(r1, r7)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            boolean r0 = r15.f28571Q     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            if (r0 == 0) goto L_0x02fe
            int r0 = r15.f28558D     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r1 = r15.f28557C     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            android.opengl.GLES20.glViewport(r6, r6, r0, r1)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            java.lang.String r0 = "viewport"
            m45422g(r0)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r0 = r15.f28561G     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            java.lang.String r1 = "uFOVx"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r1 = r15.f28561G     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            java.lang.String r7 = "uFOVy"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r7)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r7 = r15.f28558D     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r8 = r15.f28557C     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r9 = 1063216883(0x3f5f66f3, float:0.87266463)
            if (r7 <= r8) goto L_0x02f1
            android.opengl.GLES20.glUniform1f(r0, r9)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r0 = r15.f28557C     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r0 = r0 * r9
            int r7 = r15.f28558D     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r7 = (float) r7     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r0 = r0 / r7
            android.opengl.GLES20.glUniform1f(r1, r0)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            goto L_0x02fc
        L_0x02f1:
            float r7 = (float) r7     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r7 = r7 * r9
            float r8 = (float) r8     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r7 = r7 / r8
            android.opengl.GLES20.glUniform1f(r0, r7)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            android.opengl.GLES20.glUniform1f(r1, r9)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
        L_0x02fc:
            r15.f28571Q = r6     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
        L_0x02fe:
            java.lang.Object r0 = r15.f28566L     // Catch:{ InterruptedException -> 0x01d9 }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x01d9 }
            boolean r1 = r15.f28572R     // Catch:{ all -> 0x0315 }
            if (r1 != 0) goto L_0x0312
            boolean r1 = r15.f28571Q     // Catch:{ all -> 0x0315 }
            if (r1 != 0) goto L_0x0312
            int r1 = r15.f28563I     // Catch:{ all -> 0x0315 }
            if (r1 != 0) goto L_0x0312
            java.lang.Object r1 = r15.f28566L     // Catch:{ all -> 0x0315 }
            r1.wait()     // Catch:{ all -> 0x0315 }
        L_0x0312:
            monitor-exit(r0)     // Catch:{ all -> 0x0315 }
            goto L_0x01d9
        L_0x0315:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0315 }
            throw r1     // Catch:{ InterruptedException -> 0x01d9 }
        L_0x0318:
            com.google.android.gms.internal.ads.zzciv r0 = r15.f28573a
            r0.mo43731c()
            android.graphics.SurfaceTexture r0 = r15.f28559E
            r0.setOnFrameAvailableListener(r4)
            r15.f28559E = r4
            r15.mo43740f()
            return
        L_0x0328:
            r0 = move-exception
            java.lang.String r1 = "SphericalVideoProcessor died."
            com.google.android.gms.internal.ads.zzcgp.m45227e(r1, r0)     // Catch:{ all -> 0x035c }
            com.google.android.gms.internal.ads.zzcfy r1 = com.google.android.gms.ads.internal.zzt.m2904q()     // Catch:{ all -> 0x035c }
            java.lang.String r2 = "SphericalVideoProcessor.run.2"
            r1.mo43503t(r0, r2)     // Catch:{ all -> 0x035c }
            com.google.android.gms.internal.ads.zzciv r0 = r15.f28573a
            r0.mo43731c()
            android.graphics.SurfaceTexture r0 = r15.f28559E
            r0.setOnFrameAvailableListener(r4)
            r15.f28559E = r4
            r15.mo43740f()
            return
        L_0x0347:
            java.lang.String r0 = "SphericalVideoProcessor halted unexpectedly."
            com.google.android.gms.internal.ads.zzcgp.m45229g(r0)     // Catch:{ all -> 0x035c }
            com.google.android.gms.internal.ads.zzciv r0 = r15.f28573a
            r0.mo43731c()
            android.graphics.SurfaceTexture r0 = r15.f28559E
            r0.setOnFrameAvailableListener(r4)
            r15.f28559E = r4
            r15.mo43740f()
            return
        L_0x035c:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzciv r1 = r15.f28573a
            r1.mo43731c()
            android.graphics.SurfaceTexture r1 = r15.f28559E
            r1.setOnFrameAvailableListener(r4)
            r15.f28559E = r4
            r15.mo43740f()
            throw r0
        L_0x036d:
            java.lang.String r0 = "EGL initialization failed: "
            javax.microedition.khronos.egl.EGL10 r1 = r15.f28567M
            int r1 = r1.eglGetError()
            java.lang.String r1 = android.opengl.GLUtils.getEGLErrorString(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = r0.concat(r1)
            com.google.android.gms.internal.ads.zzcgp.m45226d(r0)
            com.google.android.gms.internal.ads.zzcfy r1 = com.google.android.gms.ads.internal.zzt.m2904q()
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r0)
            java.lang.String r0 = "SphericalVideoProcessor.run.1"
            r1.mo43503t(r2, r0)
            r15.mo43740f()
            java.util.concurrent.CountDownLatch r0 = r15.f28565K
            r0.countDown()
            return
        L_0x039b:
            java.lang.String r0 = "SphericalVideoProcessor started with no output texture."
            com.google.android.gms.internal.ads.zzcgp.m45226d(r0)
            java.util.concurrent.CountDownLatch r0 = r15.f28565K
            r0.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzciw.run():void");
    }

    public final void zza() {
        synchronized (this.f28566L) {
            this.f28566L.notifyAll();
        }
    }
}

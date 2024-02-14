package dev.skomlach.biometric.compat.utils.activityView;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import android.view.ViewDebug;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.misc.C12114c;
import dev.skomlach.common.misc.C12120d;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/activityView/BlurUtil;", "", "Landroid/view/View;", "view", "Ldev/skomlach/biometric/compat/utils/activityView/BlurUtil$OnPublishListener;", "listener", "Lja/u;", "fallbackViewCapture", "Landroid/graphics/Bitmap;", "bkg", "blur", "takeScreenshotAndBlur", "Ljava/lang/reflect/Method;", "m", "Ljava/lang/reflect/Method;", "<init>", "()V", "OnPublishListener", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BlurUtil.kt */
public final class BlurUtil {
    public static final BlurUtil INSTANCE = new BlurUtil();

    /* renamed from: m */
    private static Method f58330m;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0007"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/activityView/BlurUtil$OnPublishListener;", "", "Landroid/graphics/Bitmap;", "originalBitmap", "blurredBitmap", "Lja/u;", "onBlurredScreenshot", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: BlurUtil.kt */
    public interface OnPublishListener {
        void onBlurredScreenshot(Bitmap bitmap, Bitmap bitmap2);
    }

    static {
        Method method;
        Class<ViewDebug> cls = ViewDebug.class;
        try {
            method = cls.getDeclaredMethod("performViewCapture", new Class[]{View.class, Boolean.TYPE});
            method.setAccessible(true);
        } catch (Throwable unused) {
            method = null;
        }
        f58330m = method;
    }

    private BlurUtil() {
    }

    private final void blur(View view, Bitmap bitmap, OnPublishListener onPublishListener) {
        if (bitmap.getHeight() != 0 && bitmap.getWidth() != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (C12120d.f58384a.mo68316c()) {
                C12114c.f58379a.mo68305g(new C12087c(onPublishListener, bitmap));
                return;
            }
            FastBlur fastBlur = FastBlur.INSTANCE;
            Context context = view.getContext();
            C13706o.m87928e(context, "view.context");
            C12114c.f58379a.mo68305g(new C12085a(currentTimeMillis, onPublishListener, bitmap, fastBlur.mo68136of(context, bitmap, new FastBlurConfig(bitmap.getWidth(), bitmap.getHeight(), 4, 4, 0, 16, (C13695i) null))));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: blur$lambda-6  reason: not valid java name */
    public static final void m101352blur$lambda6(OnPublishListener onPublishListener, Bitmap bitmap) {
        C13706o.m87929f(onPublishListener, "$listener");
        C13706o.m87929f(bitmap, "$bkg");
        onPublishListener.onBlurredScreenshot(bitmap, (Bitmap) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: blur$lambda-7  reason: not valid java name */
    public static final void m101353blur$lambda7(long j, OnPublishListener onPublishListener, Bitmap bitmap, Bitmap bitmap2) {
        C13706o.m87929f(onPublishListener, "$listener");
        C13706o.m87929f(bitmap, "$bkg");
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        long currentTimeMillis = System.currentTimeMillis() - j;
        biometricLoggerImpl.mo68217d("BlurUtil.Blurring time - " + currentTimeMillis + " ms");
        onPublishListener.onBlurredScreenshot(bitmap, bitmap2);
    }

    private final void fallbackViewCapture(View view, OnPublishListener onPublishListener) {
        boolean isDrawingCacheEnabled;
        long currentTimeMillis = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_4444);
                view.draw(new Canvas(createBitmap));
                BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
                biometricLoggerImpl.mo68217d("BlurUtil.takeScreenshot#2 time - " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                C13706o.m87928e(createBitmap, "bm");
                blur(view, createBitmap, onPublishListener);
                return;
            } catch (Throwable th) {
                BiometricLoggerImpl.INSTANCE.mo68218e(th);
            }
        }
        try {
            isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            if (!isDrawingCacheEnabled) {
                view.setDrawingCacheEnabled(true);
                view.buildDrawingCache();
            }
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                Bitmap createBitmap2 = Bitmap.createBitmap(drawingCache);
                BiometricLoggerImpl biometricLoggerImpl2 = BiometricLoggerImpl.INSTANCE;
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                biometricLoggerImpl2.mo68217d("BlurUtil.takeScreenshot#3 time - " + currentTimeMillis2 + " ms");
                BlurUtil blurUtil = INSTANCE;
                C13706o.m87928e(createBitmap2, "bm");
                blurUtil.blur(view, createBitmap2, onPublishListener);
            }
            if (!isDrawingCacheEnabled) {
                view.destroyDrawingCache();
                view.setDrawingCacheEnabled(false);
            }
        } catch (Throwable th2) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th2);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00da  */
    /* renamed from: takeScreenshotAndBlur$lambda-4  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m101354takeScreenshotAndBlur$lambda4(android.view.View r9, dev.skomlach.biometric.compat.utils.activityView.BlurUtil.OnPublishListener r10) {
        /*
            java.lang.String r0 = "$view"
            kotlin.jvm.internal.C13706o.m87929f(r9, r0)
            java.lang.String r0 = "$listener"
            kotlin.jvm.internal.C13706o.m87929f(r10, r0)
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "Blackberry"
            r2 = 1
            boolean r0 = kotlin.text.C15176v.m93641v(r0, r1, r2)
            r1 = 0
            r3 = 0
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "os.name"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r4 = "QNX"
            boolean r0 = kotlin.text.C15176v.m93641v(r0, r4, r2)
            if (r0 == 0) goto L_0x007c
        L_0x0025:
            java.lang.Class r0 = r9.getClass()     // Catch:{ all -> 0x0077 }
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()     // Catch:{ all -> 0x0077 }
            java.lang.String r4 = "view::class.java.declaredFields"
            kotlin.jvm.internal.C13706o.m87928e(r0, r4)     // Catch:{ all -> 0x0077 }
            int r4 = r0.length     // Catch:{ all -> 0x0077 }
            r5 = 0
        L_0x0034:
            if (r5 >= r4) goto L_0x0048
            r6 = r0[r5]     // Catch:{ all -> 0x0077 }
            java.lang.String r7 = r6.getName()     // Catch:{ all -> 0x0077 }
            java.lang.String r8 = "mPowerSaveScalingMode"
            boolean r7 = kotlin.jvm.internal.C13706o.m87924a(r7, r8)     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0045
            goto L_0x0049
        L_0x0045:
            int r5 = r5 + 1
            goto L_0x0034
        L_0x0048:
            r6 = r1
        L_0x0049:
            if (r6 == 0) goto L_0x0050
            boolean r0 = r6.isAccessible()     // Catch:{ all -> 0x0077 }
            goto L_0x0051
        L_0x0050:
            r0 = 1
        L_0x0051:
            if (r6 != 0) goto L_0x0054
            goto L_0x0057
        L_0x0054:
            r6.setAccessible(r2)     // Catch:{ all -> 0x006d }
        L_0x0057:
            if (r6 == 0) goto L_0x005e
            java.lang.Object r4 = r6.get(r9)     // Catch:{ all -> 0x006d }
            goto L_0x005f
        L_0x005e:
            r4 = r1
        L_0x005f:
            if (r4 != 0) goto L_0x0063
            r4 = 1
            goto L_0x0064
        L_0x0063:
            r4 = 0
        L_0x0064:
            if (r0 != 0) goto L_0x0078
            if (r6 != 0) goto L_0x0069
            goto L_0x0078
        L_0x0069:
            r6.setAccessible(r3)     // Catch:{ all -> 0x0077 }
            goto L_0x0078
        L_0x006d:
            r4 = move-exception
            if (r0 != 0) goto L_0x0076
            if (r6 != 0) goto L_0x0073
            goto L_0x0076
        L_0x0073:
            r6.setAccessible(r3)     // Catch:{ all -> 0x0077 }
        L_0x0076:
            throw r4     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r4 = 0
        L_0x0078:
            if (r4 == 0) goto L_0x007c
            r0 = 1
            goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            if (r0 != 0) goto L_0x00da
            java.lang.reflect.Method r0 = f58330m
            if (r0 == 0) goto L_0x00da
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00d4 }
            r6[r3] = r9     // Catch:{ all -> 0x00d4 }
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00d4 }
            r6[r2] = r7     // Catch:{ all -> 0x00d4 }
            java.lang.Object r0 = r0.invoke(r1, r6)     // Catch:{ all -> 0x00d4 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x00d4 }
            if (r0 == 0) goto L_0x00d9
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r1 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE     // Catch:{ all -> 0x00cd }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00cd }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00cd }
            long r6 = r6 - r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cd }
            r4.<init>()     // Catch:{ all -> 0x00cd }
            java.lang.String r5 = "BlurUtil.takeScreenshot#1 time - "
            r4.append(r5)     // Catch:{ all -> 0x00cd }
            r4.append(r6)     // Catch:{ all -> 0x00cd }
            java.lang.String r5 = " ms"
            r4.append(r5)     // Catch:{ all -> 0x00cd }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00cd }
            r2[r3] = r4     // Catch:{ all -> 0x00cd }
            r1.mo68217d(r2)     // Catch:{ all -> 0x00cd }
            dev.skomlach.biometric.compat.utils.activityView.BlurUtil r1 = INSTANCE     // Catch:{ all -> 0x00cd }
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ all -> 0x00cd }
            android.graphics.Bitmap r0 = r0.copy(r2, r3)     // Catch:{ all -> 0x00cd }
            java.lang.String r2 = "bm.copy(Bitmap.Config.ARGB_4444, false)"
            kotlin.jvm.internal.C13706o.m87928e(r0, r2)     // Catch:{ all -> 0x00cd }
            r1.blur(r9, r0, r10)     // Catch:{ all -> 0x00cd }
            goto L_0x00d9
        L_0x00cd:
            r0 = move-exception
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r1 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE     // Catch:{ all -> 0x00d4 }
            r1.mo68218e((java.lang.Throwable) r0)     // Catch:{ all -> 0x00d4 }
            goto L_0x00d9
        L_0x00d4:
            dev.skomlach.biometric.compat.utils.activityView.BlurUtil r0 = INSTANCE
            r0.fallbackViewCapture(r9, r10)
        L_0x00d9:
            return
        L_0x00da:
            dev.skomlach.biometric.compat.utils.activityView.BlurUtil r0 = INSTANCE
            r0.fallbackViewCapture(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.activityView.BlurUtil.m101354takeScreenshotAndBlur$lambda4(android.view.View, dev.skomlach.biometric.compat.utils.activityView.BlurUtil$OnPublishListener):void");
    }

    public final void takeScreenshotAndBlur(View view, OnPublishListener onPublishListener) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(onPublishListener, "listener");
        C12114c.f58379a.mo68308k(new C12086b(view, onPublishListener));
    }
}

package dev.skomlach.biometric.compat.utils.activityView;

import android.graphics.RenderEffect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.misc.C12120d;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0018\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0003J\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0002R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/activityView/WindowBackgroundBlurring;", "", "Lja/u;", "updateBackground", "Landroid/graphics/Bitmap;", "bm", "setDrawable", "setupListeners", "resetListeners", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/ViewGroup;", "contentView", "Landroid/view/View;", "v", "Landroid/view/View;", "Landroid/graphics/RenderEffect;", "renderEffect", "Landroid/graphics/RenderEffect;", "", "isAttached", "Z", "drawingInProgress", "biometricsLayout", "dev/skomlach/biometric/compat/utils/activityView/WindowBackgroundBlurring$attachStateChangeListener$1", "attachStateChangeListener", "Ldev/skomlach/biometric/compat/utils/activityView/WindowBackgroundBlurring$attachStateChangeListener$1;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onDrawListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "<init>", "(Landroid/view/ViewGroup;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: WindowBackgroundBlurring.kt */
public final class WindowBackgroundBlurring {
    private final WindowBackgroundBlurring$attachStateChangeListener$1 attachStateChangeListener = new WindowBackgroundBlurring$attachStateChangeListener$1(this);
    private View biometricsLayout;
    private ViewGroup contentView;
    private boolean drawingInProgress;
    private boolean isAttached;
    private final ViewTreeObserver.OnPreDrawListener onDrawListener = new C12091g(this);
    private final ViewGroup parentView;
    private RenderEffect renderEffect;

    /* renamed from: v */
    private View f58331v;

    public WindowBackgroundBlurring(ViewGroup viewGroup) {
        C13706o.m87929f(viewGroup, "parentView");
        this.parentView = viewGroup;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.parentView.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                this.contentView = (ViewGroup) childAt;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onDrawListener$lambda-0  reason: not valid java name */
    public static final boolean m101357onDrawListener$lambda0(WindowBackgroundBlurring windowBackgroundBlurring) {
        C13706o.m87929f(windowBackgroundBlurring, "this$0");
        windowBackgroundBlurring.updateBackground();
        return true;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059 A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setDrawable(android.graphics.Bitmap r7) {
        /*
            r6 = this;
            boolean r0 = r6.isAttached
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r6.drawingInProgress
            if (r0 == 0) goto L_0x000a
            goto L_0x00d0
        L_0x000a:
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r0 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Class<dev.skomlach.biometric.compat.utils.activityView.WindowBackgroundBlurring> r3 = dev.skomlach.biometric.compat.utils.activityView.WindowBackgroundBlurring.class
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = ".setDrawable"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r4 = 0
            r2[r4] = r3
            r0.mo68217d(r2)
            r6.drawingInProgress = r1
            android.view.View r0 = r6.f58331v     // Catch:{ all -> 0x00be }
            r2 = 0
            if (r0 == 0) goto L_0x0056
            dev.skomlach.common.misc.d r3 = dev.skomlach.common.misc.C12120d.f58384a     // Catch:{ all -> 0x00be }
            boolean r3 = r3.mo68316c()     // Catch:{ all -> 0x00be }
            if (r3 == 0) goto L_0x0047
            android.view.ViewGroup r0 = r6.contentView     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x0056
            android.graphics.RenderEffect r3 = r6.renderEffect     // Catch:{ all -> 0x00be }
            r0.setRenderEffect(r3)     // Catch:{ all -> 0x00be }
            ja.u r0 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x00be }
            goto L_0x0057
        L_0x0047:
            android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x00be }
            android.content.res.Resources r5 = r0.getResources()     // Catch:{ all -> 0x00be }
            r3.<init>(r5, r7)     // Catch:{ all -> 0x00be }
            androidx.core.view.ViewCompat.setBackground(r0, r3)     // Catch:{ all -> 0x00be }
            ja.u r0 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x00be }
            goto L_0x0057
        L_0x0056:
            r0 = r2
        L_0x0057:
            if (r0 != 0) goto L_0x00c4
            android.content.ContextWrapper r0 = new android.content.ContextWrapper     // Catch:{ all -> 0x00be }
            android.view.ViewGroup r3 = r6.parentView     // Catch:{ all -> 0x00be }
            android.content.Context r3 = r3.getContext()     // Catch:{ all -> 0x00be }
            r0.<init>(r3)     // Catch:{ all -> 0x00be }
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)     // Catch:{ all -> 0x00be }
            int r3 = dev.skomlach.biometric.compat.C12021R.C12026layout.blurred_screen     // Catch:{ all -> 0x00be }
            android.view.View r0 = r0.inflate(r3, r2, r4)     // Catch:{ all -> 0x00be }
            java.lang.Object r2 = r0.getTag()     // Catch:{ all -> 0x00be }
            r0.setTag(r2)     // Catch:{ all -> 0x00be }
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r2)     // Catch:{ all -> 0x00be }
            int r2 = dev.skomlach.biometric.compat.C12021R.C12024id.biometrics_layout     // Catch:{ all -> 0x00be }
            android.view.View r2 = r0.findViewById(r2)     // Catch:{ all -> 0x00be }
            r6.biometricsLayout = r2     // Catch:{ all -> 0x00be }
            r0.setFocusable(r1)     // Catch:{ all -> 0x00be }
            r0.setClickable(r1)     // Catch:{ all -> 0x00be }
            r0.setLongClickable(r1)     // Catch:{ all -> 0x00be }
            dev.skomlach.biometric.compat.utils.activityView.f r1 = dev.skomlach.biometric.compat.utils.activityView.C12090f.f58343a     // Catch:{ all -> 0x00be }
            r0.setOnTouchListener(r1)     // Catch:{ all -> 0x00be }
            dev.skomlach.common.misc.d r1 = dev.skomlach.common.misc.C12120d.f58384a     // Catch:{ all -> 0x00be }
            boolean r1 = r1.mo68316c()     // Catch:{ all -> 0x00be }
            if (r1 == 0) goto L_0x00aa
            android.graphics.Shader$TileMode r7 = android.graphics.Shader.TileMode.DECAL     // Catch:{ all -> 0x00be }
            r1 = 1103626240(0x41c80000, float:25.0)
            android.graphics.RenderEffect r7 = android.graphics.RenderEffect.createBlurEffect(r1, r1, r7)     // Catch:{ all -> 0x00be }
            r6.renderEffect = r7     // Catch:{ all -> 0x00be }
            android.view.ViewGroup r1 = r6.contentView     // Catch:{ all -> 0x00be }
            if (r1 == 0) goto L_0x00b6
            r1.setRenderEffect(r7)     // Catch:{ all -> 0x00be }
            goto L_0x00b6
        L_0x00aa:
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x00be }
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ all -> 0x00be }
            r1.<init>(r2, r7)     // Catch:{ all -> 0x00be }
            androidx.core.view.ViewCompat.setBackground(r0, r1)     // Catch:{ all -> 0x00be }
        L_0x00b6:
            android.view.ViewGroup r7 = r6.parentView     // Catch:{ all -> 0x00be }
            r7.addView(r0)     // Catch:{ all -> 0x00be }
            r6.f58331v = r0     // Catch:{ all -> 0x00be }
            goto L_0x00c4
        L_0x00be:
            r7 = move-exception
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r0 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r0.mo68218e((java.lang.Throwable) r7)
        L_0x00c4:
            android.view.View r7 = r6.f58331v
            if (r7 == 0) goto L_0x00d0
            dev.skomlach.biometric.compat.utils.activityView.h r0 = new dev.skomlach.biometric.compat.utils.activityView.h
            r0.<init>(r6)
            r7.post(r0)
        L_0x00d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.activityView.WindowBackgroundBlurring.setDrawable(android.graphics.Bitmap):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: setDrawable$lambda-5$lambda-4$lambda-3  reason: not valid java name */
    public static final boolean m101358setDrawable$lambda5$lambda4$lambda3(View view, MotionEvent motionEvent) {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: setDrawable$lambda-6  reason: not valid java name */
    public static final void m101359setDrawable$lambda6(WindowBackgroundBlurring windowBackgroundBlurring) {
        C13706o.m87929f(windowBackgroundBlurring, "this$0");
        windowBackgroundBlurring.drawingInProgress = false;
    }

    private final void updateBackground() {
        if (this.isAttached && !this.drawingInProgress) {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = WindowBackgroundBlurring.class.getName();
            biometricLoggerImpl.mo68217d(name + ".updateBackground");
            try {
                ViewGroup viewGroup = this.contentView;
                if (viewGroup != null) {
                    BlurUtil.INSTANCE.takeScreenshotAndBlur(viewGroup, new WindowBackgroundBlurring$updateBackground$1$1(this));
                }
            } catch (Throwable th) {
                BiometricLoggerImpl.INSTANCE.mo68218e(th);
            }
        }
    }

    public final void resetListeners() {
        ViewGroup viewGroup;
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String name = WindowBackgroundBlurring.class.getName();
        biometricLoggerImpl.mo68217d(name + ".resetListeners");
        this.isAttached = false;
        try {
            this.parentView.removeOnAttachStateChangeListener(this.attachStateChangeListener);
            this.parentView.getViewTreeObserver().removeOnPreDrawListener(this.onDrawListener);
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
        try {
            if (C12120d.f58384a.mo68316c() && (viewGroup = this.contentView) != null) {
                viewGroup.setRenderEffect((RenderEffect) null);
            }
            View view = this.f58331v;
            if (view != null) {
                this.parentView.removeView(view);
            }
        } catch (Throwable th2) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th2);
        }
    }

    public final void setupListeners() {
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String name = WindowBackgroundBlurring.class.getName();
        biometricLoggerImpl.mo68217d(name + ".setupListeners");
        this.isAttached = true;
        try {
            updateBackground();
            this.parentView.addOnAttachStateChangeListener(this.attachStateChangeListener);
            this.parentView.getViewTreeObserver().addOnPreDrawListener(this.onDrawListener);
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }
}

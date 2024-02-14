package dev.skomlach.biometric.compat.utils.activityView;

import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.palette.graphics.Palette;
import dev.skomlach.biometric.compat.BiometricAuthRequest;
import dev.skomlach.biometric.compat.BiometricConfirmation;
import dev.skomlach.biometric.compat.BiometricManagerCompat;
import dev.skomlach.biometric.compat.BiometricPromptCompat;
import dev.skomlach.biometric.compat.BiometricType;
import dev.skomlach.biometric.compat.C12021R;
import dev.skomlach.biometric.compat.utils.DialogMainColor;
import dev.skomlach.biometric.compat.utils.activityView.ActivityViewWatcher;
import dev.skomlach.biometric.compat.utils.activityView.IconStateHelper;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.biometric.compat.utils.statusbar.ColorUtil;
import dev.skomlach.biometric.compat.utils.themes.DarkLightThemes;
import dev.skomlach.common.misc.C12120d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007*\u00011\u0018\u00002\u00020\u0001:\u0001=B\u001f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u0012\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010#R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\n078BX\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006>"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/activityView/WindowForegroundBlurring;", "Ldev/skomlach/biometric/compat/utils/activityView/IconStateHelper$IconStateListener;", "Lja/u;", "updateBackground", "Landroid/graphics/Bitmap;", "bm", "setDrawable", "updateBiometricIconsLayout", "updateDefaultColor", "updateIcons", "Ldev/skomlach/biometric/compat/BiometricType;", "type", "Ldev/skomlach/biometric/compat/utils/activityView/WindowForegroundBlurring$IconStates;", "iconStates", "setIconState", "setupListeners", "resetListeners", "onError", "onSuccess", "reset", "Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;", "compatBuilder", "Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/ViewGroup;", "Ldev/skomlach/biometric/compat/utils/activityView/ActivityViewWatcher$ForceToCloseCallback;", "forceToCloseCallback", "Ldev/skomlach/biometric/compat/utils/activityView/ActivityViewWatcher$ForceToCloseCallback;", "Landroidx/fragment/app/FragmentActivity;", "context", "Landroidx/fragment/app/FragmentActivity;", "contentView", "Landroid/view/View;", "v", "Landroid/view/View;", "Landroid/graphics/RenderEffect;", "renderEffect", "Landroid/graphics/RenderEffect;", "", "isAttached", "Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "drawingInProgress", "Ljava/util/concurrent/atomic/AtomicBoolean;", "biometricsLayout", "", "defaultColor", "I", "dev/skomlach/biometric/compat/utils/activityView/WindowForegroundBlurring$attachStateChangeListener$1", "attachStateChangeListener", "Ldev/skomlach/biometric/compat/utils/activityView/WindowForegroundBlurring$attachStateChangeListener$1;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onDrawListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "getList", "()Ljava/util/List;", "list", "<init>", "(Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;Landroid/view/ViewGroup;Ldev/skomlach/biometric/compat/utils/activityView/ActivityViewWatcher$ForceToCloseCallback;)V", "IconStates", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: WindowForegroundBlurring.kt */
public final class WindowForegroundBlurring implements IconStateHelper.IconStateListener {
    private final WindowForegroundBlurring$attachStateChangeListener$1 attachStateChangeListener = new WindowForegroundBlurring$attachStateChangeListener$1(this);
    private View biometricsLayout;
    private final BiometricPromptCompat.Builder compatBuilder;
    private ViewGroup contentView;
    private final FragmentActivity context;
    private int defaultColor;
    private AtomicBoolean drawingInProgress = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public final ActivityViewWatcher.ForceToCloseCallback forceToCloseCallback;
    /* access modifiers changed from: private */
    public volatile boolean isAttached;
    private final ViewTreeObserver.OnPreDrawListener onDrawListener = new C12094j(this);
    private final ViewGroup parentView;
    private RenderEffect renderEffect;

    /* renamed from: v */
    private View f58332v;

    @Metadata(mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/activityView/WindowForegroundBlurring$IconStates;", "", "(Ljava/lang/String;I)V", "WAITING", "ERROR", "SUCCESS", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: WindowForegroundBlurring.kt */
    public enum IconStates {
        WAITING,
        ERROR,
        SUCCESS
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: WindowForegroundBlurring.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BiometricType.values().length];
            iArr[BiometricType.BIOMETRIC_FACE.ordinal()] = 1;
            iArr[BiometricType.BIOMETRIC_IRIS.ordinal()] = 2;
            iArr[BiometricType.BIOMETRIC_HEARTRATE.ordinal()] = 3;
            iArr[BiometricType.BIOMETRIC_VOICE.ordinal()] = 4;
            iArr[BiometricType.BIOMETRIC_PALMPRINT.ordinal()] = 5;
            iArr[BiometricType.BIOMETRIC_BEHAVIOR.ordinal()] = 6;
            iArr[BiometricType.BIOMETRIC_FINGERPRINT.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IconStates.values().length];
            iArr2[IconStates.WAITING.ordinal()] = 1;
            iArr2[IconStates.ERROR.ordinal()] = 2;
            iArr2[IconStates.SUCCESS.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public WindowForegroundBlurring(BiometricPromptCompat.Builder builder, ViewGroup viewGroup, ActivityViewWatcher.ForceToCloseCallback forceToCloseCallback2) {
        C13706o.m87929f(builder, "compatBuilder");
        C13706o.m87929f(viewGroup, "parentView");
        C13706o.m87929f(forceToCloseCallback2, "forceToCloseCallback");
        this.compatBuilder = builder;
        this.parentView = viewGroup;
        this.forceToCloseCallback = forceToCloseCallback2;
        FragmentActivity context2 = builder.getContext();
        this.context = context2;
        this.defaultColor = DialogMainColor.INSTANCE.getColor(context2, !DarkLightThemes.isNightMode$default(DarkLightThemes.INSTANCE, builder.getContext(), false, 2, (Object) null));
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String name = WindowForegroundBlurring.class.getName();
        boolean isDark = ColorUtil.INSTANCE.isDark(this.defaultColor);
        String hexString = Integer.toHexString(this.defaultColor);
        biometricLoggerImpl.mo68220e(name + ".updateDefaultColor isDark -  " + isDark + "; color - " + hexString);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.parentView.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                this.contentView = (ViewGroup) childAt;
            }
        }
        ViewGroup viewGroup2 = this.contentView;
        if (viewGroup2 != null) {
            viewGroup2.post(new C12098n(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-4  reason: not valid java name */
    public static final void m101360_init_$lambda4(WindowForegroundBlurring windowForegroundBlurring) {
        C13706o.m87929f(windowForegroundBlurring, "this$0");
        View inflate = LayoutInflater.from(new ContextWrapper(windowForegroundBlurring.context)).inflate(C12021R.C12026layout.blurred_screen, (ViewGroup) null, false);
        inflate.setTag(inflate.getTag());
        inflate.setAlpha(1.0f);
        windowForegroundBlurring.biometricsLayout = inflate.findViewById(C12021R.C12024id.biometrics_layout);
        inflate.setFocusable(true);
        inflate.setClickable(true);
        inflate.setLongClickable(true);
        inflate.setOnTouchListener(C12093i.f58346a);
        if (C12120d.f58384a.mo68316c()) {
            RenderEffect createBlurEffect = RenderEffect.createBlurEffect(12.0f, 12.0f, Shader.TileMode.DECAL);
            windowForegroundBlurring.renderEffect = createBlurEffect;
            ViewGroup viewGroup = windowForegroundBlurring.contentView;
            if (viewGroup != null) {
                viewGroup.setRenderEffect(createBlurEffect);
            }
        } else {
            ViewCompat.setBackground(inflate, new ColorDrawable(0));
        }
        windowForegroundBlurring.f58332v = inflate;
    }

    private final List<BiometricType> getList() {
        Iterable iterable;
        if (this.compatBuilder.isBackgroundBiometricIconsEnabled()) {
            iterable = new ArrayList(this.compatBuilder.getAllAvailableTypes());
        } else {
            iterable = C13614t.m87748j();
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (BiometricManagerCompat.isBiometricReady(new BiometricAuthRequest(this.compatBuilder.getBiometricAuthRequest().getApi(), (BiometricType) next, (BiometricConfirmation) null, 4, (C13695i) null))) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: lambda-4$lambda-3$lambda-2  reason: not valid java name */
    public static final boolean m101361lambda4$lambda3$lambda2(View view, MotionEvent motionEvent) {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: onDrawListener$lambda-1  reason: not valid java name */
    public static final boolean m101362onDrawListener$lambda1(WindowForegroundBlurring windowForegroundBlurring) {
        C13706o.m87929f(windowForegroundBlurring, "this$0");
        windowForegroundBlurring.updateBackground();
        return true;
    }

    /* access modifiers changed from: private */
    public final void setDrawable(Bitmap bitmap) {
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String name = WindowForegroundBlurring.class.getName();
        biometricLoggerImpl.mo68217d(name + ".setDrawable");
        try {
            View view = this.f58332v;
            if (view != null) {
                if (C12120d.f58384a.mo68316c()) {
                    ViewGroup viewGroup = this.contentView;
                    if (viewGroup != null) {
                        viewGroup.setRenderEffect(this.renderEffect);
                    }
                } else {
                    ViewCompat.setBackground(view, new BitmapDrawable(view.getResources(), bitmap));
                }
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
        View view2 = this.f58332v;
        if (view2 != null) {
            view2.post(new C12097m(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setDrawable$lambda-7  reason: not valid java name */
    public static final void m101363setDrawable$lambda7(WindowForegroundBlurring windowForegroundBlurring) {
        C13706o.m87929f(windowForegroundBlurring, "this$0");
        windowForegroundBlurring.updateBiometricIconsLayout();
        windowForegroundBlurring.drawingInProgress.set(false);
    }

    private final void setIconState(BiometricType biometricType, IconStates iconStates) {
        int i;
        int i2;
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String name = WindowForegroundBlurring.class.getName();
        biometricLoggerImpl.mo68217d(name + ".setIconState " + biometricType + "=" + iconStates);
        try {
            View view = this.biometricsLayout;
            if (view != null) {
                int i3 = WhenMappings.$EnumSwitchMapping$1[iconStates.ordinal()];
                if (i3 == 1) {
                    i = this.defaultColor;
                } else if (i3 == 2) {
                    i = SupportMenu.CATEGORY_MASK;
                } else if (i3 == 3) {
                    i = -16711936;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                view.findViewById(C12021R.C12024id.biometric_divider).setBackgroundColor(this.defaultColor);
                if (biometricType == null) {
                    i2 = -1;
                } else {
                    i2 = WhenMappings.$EnumSwitchMapping$0[biometricType.ordinal()];
                }
                switch (i2) {
                    case 1:
                        int i4 = C12021R.C12024id.face;
                        View findViewById = view.findViewById(i4);
                        if (findViewById != null) {
                            findViewById.setTag(iconStates);
                        }
                        ImageViewCompat.setImageTintList((ImageView) view.findViewById(i4), ColorStateList.valueOf(i));
                        return;
                    case 2:
                        int i5 = C12021R.C12024id.iris;
                        View findViewById2 = view.findViewById(i5);
                        if (findViewById2 != null) {
                            findViewById2.setTag(iconStates);
                        }
                        ImageViewCompat.setImageTintList((ImageView) view.findViewById(i5), ColorStateList.valueOf(i));
                        return;
                    case 3:
                        int i6 = C12021R.C12024id.heartrate;
                        View findViewById3 = view.findViewById(i6);
                        if (findViewById3 != null) {
                            findViewById3.setTag(iconStates);
                        }
                        ImageViewCompat.setImageTintList((ImageView) view.findViewById(i6), ColorStateList.valueOf(i));
                        return;
                    case 4:
                        int i7 = C12021R.C12024id.voice;
                        View findViewById4 = view.findViewById(i7);
                        if (findViewById4 != null) {
                            findViewById4.setTag(iconStates);
                        }
                        ImageViewCompat.setImageTintList((ImageView) view.findViewById(i7), ColorStateList.valueOf(i));
                        return;
                    case 5:
                        int i8 = C12021R.C12024id.palm;
                        View findViewById5 = view.findViewById(i8);
                        if (findViewById5 != null) {
                            findViewById5.setTag(iconStates);
                        }
                        ImageViewCompat.setImageTintList((ImageView) view.findViewById(i8), ColorStateList.valueOf(i));
                        return;
                    case 6:
                        int i9 = C12021R.C12024id.typing;
                        View findViewById6 = view.findViewById(i9);
                        if (findViewById6 != null) {
                            findViewById6.setTag(iconStates);
                        }
                        ImageViewCompat.setImageTintList((ImageView) view.findViewById(i9), ColorStateList.valueOf(i));
                        return;
                    case 7:
                        int i10 = C12021R.C12024id.fingerprint;
                        View findViewById7 = view.findViewById(i10);
                        if (findViewById7 != null) {
                            findViewById7.setTag(iconStates);
                        }
                        ImageViewCompat.setImageTintList((ImageView) view.findViewById(i10), ColorStateList.valueOf(i));
                        return;
                    default:
                        return;
                }
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setupListeners$lambda-9  reason: not valid java name */
    public static final void m101364setupListeners$lambda9(WindowForegroundBlurring windowForegroundBlurring) {
        C13706o.m87929f(windowForegroundBlurring, "this$0");
        View view = windowForegroundBlurring.f58332v;
        if (view != null) {
            windowForegroundBlurring.parentView.addView(view);
        }
        windowForegroundBlurring.updateBiometricIconsLayout();
    }

    private final void updateBackground() {
        if (this.isAttached && !this.drawingInProgress.get()) {
            this.drawingInProgress.set(true);
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = WindowForegroundBlurring.class.getName();
            biometricLoggerImpl.mo68217d(name + ".updateBackground");
            try {
                ViewGroup viewGroup = this.contentView;
                if (viewGroup != null) {
                    BlurUtil.INSTANCE.takeScreenshotAndBlur(viewGroup, new WindowForegroundBlurring$updateBackground$1$1(this));
                }
            } catch (Throwable th) {
                BiometricLoggerImpl.INSTANCE.mo68218e(th);
            }
        }
    }

    private final void updateBiometricIconsLayout() {
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String name = WindowForegroundBlurring.class.getName();
        biometricLoggerImpl.mo68217d(name + ".updateBiometricIconsLayout");
        try {
            View view = this.biometricsLayout;
            if (view != null) {
                View findViewById = view.findViewById(C12021R.C12024id.face);
                if (findViewById != null) {
                    C13706o.m87928e(findViewById, "findViewById<View>(R.id.face)");
                    findViewById.setVisibility(getList().contains(BiometricType.BIOMETRIC_FACE) ? 0 : 8);
                    if (findViewById.getTag() == null) {
                        findViewById.setTag(IconStates.WAITING);
                    }
                }
                View findViewById2 = view.findViewById(C12021R.C12024id.iris);
                if (findViewById2 != null) {
                    C13706o.m87928e(findViewById2, "findViewById<View>(R.id.iris)");
                    findViewById2.setVisibility(getList().contains(BiometricType.BIOMETRIC_IRIS) ? 0 : 8);
                    if (findViewById2.getTag() == null) {
                        findViewById2.setTag(IconStates.WAITING);
                    }
                }
                View findViewById3 = view.findViewById(C12021R.C12024id.fingerprint);
                if (findViewById3 != null) {
                    C13706o.m87928e(findViewById3, "findViewById<View>(R.id.fingerprint)");
                    findViewById3.setVisibility(getList().contains(BiometricType.BIOMETRIC_FINGERPRINT) ? 0 : 8);
                    if (findViewById3.getTag() == null) {
                        findViewById3.setTag(IconStates.WAITING);
                    }
                }
                View findViewById4 = view.findViewById(C12021R.C12024id.heartrate);
                if (findViewById4 != null) {
                    C13706o.m87928e(findViewById4, "findViewById<View>(R.id.heartrate)");
                    findViewById4.setVisibility(getList().contains(BiometricType.BIOMETRIC_HEARTRATE) ? 0 : 8);
                    if (findViewById4.getTag() == null) {
                        findViewById4.setTag(IconStates.WAITING);
                    }
                }
                View findViewById5 = view.findViewById(C12021R.C12024id.voice);
                if (findViewById5 != null) {
                    C13706o.m87928e(findViewById5, "findViewById<View>(R.id.voice)");
                    findViewById5.setVisibility(getList().contains(BiometricType.BIOMETRIC_VOICE) ? 0 : 8);
                    if (findViewById5.getTag() == null) {
                        findViewById5.setTag(IconStates.WAITING);
                    }
                }
                View findViewById6 = view.findViewById(C12021R.C12024id.palm);
                if (findViewById6 != null) {
                    C13706o.m87928e(findViewById6, "findViewById<View>(R.id.palm)");
                    findViewById6.setVisibility(getList().contains(BiometricType.BIOMETRIC_PALMPRINT) ? 0 : 8);
                    if (findViewById6.getTag() == null) {
                        findViewById6.setTag(IconStates.WAITING);
                    }
                }
                View findViewById7 = view.findViewById(C12021R.C12024id.typing);
                if (findViewById7 != null) {
                    C13706o.m87928e(findViewById7, "findViewById<View>(R.id.typing)");
                    findViewById7.setVisibility(getList().contains(BiometricType.BIOMETRIC_BEHAVIOR) ? 0 : 8);
                    if (findViewById7.getTag() == null) {
                        findViewById7.setTag(IconStates.WAITING);
                    }
                }
                updateIcons();
                if (getList().isEmpty()) {
                    view.setVisibility(8);
                } else {
                    view.setVisibility(0);
                }
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    /* access modifiers changed from: private */
    public final void updateDefaultColor(Bitmap bitmap) {
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String name = WindowForegroundBlurring.class.getName();
        biometricLoggerImpl.mo68217d(name + ".updateDefaultColor");
        try {
            Palette.from(bitmap).generate(new C12095k(this));
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: updateDefaultColor$lambda-20  reason: not valid java name */
    public static final void m101365updateDefaultColor$lambda20(WindowForegroundBlurring windowForegroundBlurring, Palette palette) {
        Class<WindowForegroundBlurring> cls = WindowForegroundBlurring.class;
        C13706o.m87929f(windowForegroundBlurring, "this$0");
        try {
            boolean isNightMode$default = DarkLightThemes.isNightMode$default(DarkLightThemes.INSTANCE, windowForegroundBlurring.compatBuilder.getContext(), false, 2, (Object) null);
            DialogMainColor dialogMainColor = DialogMainColor.INSTANCE;
            int color = dialogMainColor.getColor(windowForegroundBlurring.context, !isNightMode$default);
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = cls.getName();
            ColorUtil colorUtil = ColorUtil.INSTANCE;
            boolean isDark = colorUtil.isDark(color);
            String hexString = Integer.toHexString(color);
            biometricLoggerImpl.mo68217d(name + ".updateDefaultColor#0 isDark -  " + isDark + "; color - " + hexString);
            if (palette != null) {
                color = dialogMainColor.getColor(windowForegroundBlurring.context, colorUtil.isDark(palette.getDominantColor(color)));
            }
            windowForegroundBlurring.defaultColor = color;
            String name2 = cls.getName();
            boolean isDark2 = colorUtil.isDark(windowForegroundBlurring.defaultColor);
            String hexString2 = Integer.toHexString(windowForegroundBlurring.defaultColor);
            biometricLoggerImpl.mo68217d(name2 + ".updateDefaultColor#2 isDark - " + isDark2 + "; color - " + hexString2);
            windowForegroundBlurring.updateIcons();
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    private final void updateIcons() {
        BiometricLoggerImpl.INSTANCE.mo68217d(WindowForegroundBlurring.class.getName() + ".updateIcons");
        try {
            View view = this.biometricsLayout;
            if (view != null) {
                for (BiometricType biometricType : BiometricType.values()) {
                    Object obj = null;
                    switch (WhenMappings.$EnumSwitchMapping$0[biometricType.ordinal()]) {
                        case 1:
                            View findViewById = view.findViewById(C12021R.C12024id.face);
                            if (findViewById != null) {
                                obj = findViewById.getTag();
                            }
                            C13706o.m87927d(obj, "null cannot be cast to non-null type dev.skomlach.biometric.compat.utils.activityView.WindowForegroundBlurring.IconStates");
                            setIconState(biometricType, (IconStates) obj);
                            break;
                        case 2:
                            View findViewById2 = view.findViewById(C12021R.C12024id.iris);
                            if (findViewById2 != null) {
                                obj = findViewById2.getTag();
                            }
                            C13706o.m87927d(obj, "null cannot be cast to non-null type dev.skomlach.biometric.compat.utils.activityView.WindowForegroundBlurring.IconStates");
                            setIconState(biometricType, (IconStates) obj);
                            break;
                        case 3:
                            View findViewById3 = view.findViewById(C12021R.C12024id.heartrate);
                            if (findViewById3 != null) {
                                obj = findViewById3.getTag();
                            }
                            C13706o.m87927d(obj, "null cannot be cast to non-null type dev.skomlach.biometric.compat.utils.activityView.WindowForegroundBlurring.IconStates");
                            setIconState(biometricType, (IconStates) obj);
                            break;
                        case 4:
                            View findViewById4 = view.findViewById(C12021R.C12024id.voice);
                            if (findViewById4 != null) {
                                obj = findViewById4.getTag();
                            }
                            C13706o.m87927d(obj, "null cannot be cast to non-null type dev.skomlach.biometric.compat.utils.activityView.WindowForegroundBlurring.IconStates");
                            setIconState(biometricType, (IconStates) obj);
                            break;
                        case 5:
                            View findViewById5 = view.findViewById(C12021R.C12024id.palm);
                            if (findViewById5 != null) {
                                obj = findViewById5.getTag();
                            }
                            C13706o.m87927d(obj, "null cannot be cast to non-null type dev.skomlach.biometric.compat.utils.activityView.WindowForegroundBlurring.IconStates");
                            setIconState(biometricType, (IconStates) obj);
                            break;
                        case 6:
                            View findViewById6 = view.findViewById(C12021R.C12024id.typing);
                            if (findViewById6 != null) {
                                obj = findViewById6.getTag();
                            }
                            C13706o.m87927d(obj, "null cannot be cast to non-null type dev.skomlach.biometric.compat.utils.activityView.WindowForegroundBlurring.IconStates");
                            setIconState(biometricType, (IconStates) obj);
                            break;
                        case 7:
                            View findViewById7 = view.findViewById(C12021R.C12024id.fingerprint);
                            if (findViewById7 != null) {
                                obj = findViewById7.getTag();
                            }
                            C13706o.m87927d(obj, "null cannot be cast to non-null type dev.skomlach.biometric.compat.utils.activityView.WindowForegroundBlurring.IconStates");
                            setIconState(biometricType, (IconStates) obj);
                            break;
                    }
                }
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    public void onError(BiometricType biometricType) {
        updateBiometricIconsLayout();
        setIconState(biometricType, IconStates.ERROR);
    }

    public void onSuccess(BiometricType biometricType) {
        updateBiometricIconsLayout();
        setIconState(biometricType, IconStates.SUCCESS);
    }

    public void reset(BiometricType biometricType) {
        updateBiometricIconsLayout();
        setIconState(biometricType, IconStates.WAITING);
    }

    public final void resetListeners() {
        ViewGroup viewGroup;
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String name = WindowForegroundBlurring.class.getName();
        biometricLoggerImpl.mo68217d(name + ".resetListeners");
        this.isAttached = false;
        try {
            this.parentView.getViewTreeObserver().removeOnPreDrawListener(this.onDrawListener);
            this.parentView.removeOnAttachStateChangeListener(this.attachStateChangeListener);
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
        try {
            if (C12120d.f58384a.mo68316c() && (viewGroup = this.contentView) != null) {
                viewGroup.setRenderEffect((RenderEffect) null);
            }
            View view = this.f58332v;
            if (view != null) {
                this.parentView.removeView(view);
            }
        } catch (Throwable th2) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th2);
        }
        IconStateHelper.INSTANCE.unregisterListener(this);
    }

    public final void setupListeners() {
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String name = WindowForegroundBlurring.class.getName();
        biometricLoggerImpl.mo68217d(name + ".setupListeners");
        this.isAttached = true;
        try {
            ViewGroup viewGroup = this.contentView;
            if (viewGroup != null) {
                viewGroup.post(new C12096l(this));
            }
            updateBackground();
            IconStateHelper.INSTANCE.registerListener(this);
            this.parentView.addOnAttachStateChangeListener(this.attachStateChangeListener);
            this.parentView.getViewTreeObserver().addOnPreDrawListener(this.onDrawListener);
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }
}

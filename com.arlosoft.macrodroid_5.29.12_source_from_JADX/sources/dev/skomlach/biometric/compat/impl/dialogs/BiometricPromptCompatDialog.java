package dev.skomlach.biometric.compat.impl.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatDialog;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.core.p007os.BuildCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import dev.skomlach.biometric.compat.C12021R;
import dev.skomlach.biometric.compat.utils.WindowFocusChangedListener;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.biometric.compat.utils.monet.Extension_ColorKt;
import dev.skomlach.biometric.compat.utils.monet.SystemColorScheme;
import dev.skomlach.biometric.compat.utils.monet.colors.Srgb;
import dev.skomlach.biometric.compat.utils.statusbar.ColorUtil;
import dev.skomlach.biometric.compat.utils.themes.DarkLightThemes;
import dev.skomlach.common.misc.C12120d;
import kotlin.Metadata;
import kotlin.jvm.internal.C13684d0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001O\u0018\u0000 W2\u00020\u0001:\u0002WXB\u0007¢\u0006\u0004\bU\u0010VJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0003J\u001a\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0012\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0019J&\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010!\u001a\u00020 2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\"\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J#\u0010%\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010#*\u0004\u0018\u00010\u000b2\u0006\u0010$\u001a\u00020\b¢\u0006\u0004\b%\u0010&J\u0010\u0010)\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010'R\u0018\u0010*\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010+R(\u0010.\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010,8\u0006@BX\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R(\u00102\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010,8\u0006@BX\u000e¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R(\u00104\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010,8\u0006@BX\u000e¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00101R(\u00106\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010,8\u0006@BX\u000e¢\u0006\f\n\u0004\b6\u0010/\u001a\u0004\b7\u00101R(\u00109\u001a\u0004\u0018\u0001082\b\u0010-\u001a\u0004\u0018\u0001088\u0006@BX\u000e¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R(\u0010>\u001a\u0004\u0018\u00010=2\b\u0010-\u001a\u0004\u0018\u00010=8\u0006@BX\u000e¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR(\u0010B\u001a\u0004\u0018\u00010\u000b2\b\u0010-\u001a\u0004\u0018\u00010\u000b8\u0006@BX\u000e¢\u0006\f\n\u0004\bB\u0010+\u001a\u0004\bC\u0010DR(\u0010E\u001a\u0004\u0018\u00010\u000b2\b\u0010-\u001a\u0004\u0018\u00010\u000b8\u0006@BX\u000e¢\u0006\f\n\u0004\bE\u0010+\u001a\u0004\bF\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010I\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010K\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0011\u0010S\u001a\u00020R8F¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006Y"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/dialogs/BiometricPromptCompatDialog;", "Landroidx/fragment/app/DialogFragment;", "Landroid/content/Context;", "context", "Lja/u;", "updateMonetColorsInternal", "", "name", "", "color", "findNearestColor", "Landroid/view/View;", "view", "setTextToTextViews", "dismiss", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "makeVisible", "makeInvisible", "Landroid/content/DialogInterface$OnDismissListener;", "dialogInterface", "setOnDismissListener", "Landroid/content/DialogInterface$OnCancelListener;", "setOnCancelListener", "Landroid/content/DialogInterface$OnShowListener;", "setOnShowListener", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "Landroid/app/Dialog;", "onCreateDialog", "onViewCreated", "T", "id", "findViewById", "(I)Landroid/view/View;", "Ldev/skomlach/biometric/compat/utils/WindowFocusChangedListener;", "listener", "setWindowFocusChangedListener", "containerView", "Landroid/view/View;", "Landroid/widget/TextView;", "<set-?>", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "subtitle", "getSubtitle", "description", "getDescription", "status", "getStatus", "Landroid/widget/Button;", "negativeButton", "Landroid/widget/Button;", "getNegativeButton", "()Landroid/widget/Button;", "Ldev/skomlach/biometric/compat/impl/dialogs/FingerprintIconView;", "fingerprintIcon", "Ldev/skomlach/biometric/compat/impl/dialogs/FingerprintIconView;", "getFingerprintIcon", "()Ldev/skomlach/biometric/compat/impl/dialogs/FingerprintIconView;", "authPreview", "getAuthPreview", "()Landroid/view/View;", "rootView", "getRootView", "focusListener", "Ldev/skomlach/biometric/compat/utils/WindowFocusChangedListener;", "dismissDialogInterface", "Landroid/content/DialogInterface$OnDismissListener;", "cancelDialogInterface", "Landroid/content/DialogInterface$OnCancelListener;", "onShowDialogInterface", "Landroid/content/DialogInterface$OnShowListener;", "dev/skomlach/biometric/compat/impl/dialogs/BiometricPromptCompatDialog$wallpaperChangedReceiver$1", "wallpaperChangedReceiver", "Ldev/skomlach/biometric/compat/impl/dialogs/BiometricPromptCompatDialog$wallpaperChangedReceiver$1;", "", "isShowing", "()Z", "<init>", "()V", "Companion", "ScreenProtection", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricPromptCompatDialog.kt */
public final class BiometricPromptCompatDialog extends DialogFragment {
    public static final Companion Companion = new Companion((C13695i) null);
    public static final String TAG = "dev.skomlach.biometric.compat.impl.dialogs.BiometricPromptCompatDialogImpl";
    private View authPreview;
    private DialogInterface.OnCancelListener cancelDialogInterface;
    private View containerView;
    private TextView description;
    private DialogInterface.OnDismissListener dismissDialogInterface;
    private FingerprintIconView fingerprintIcon;
    private WindowFocusChangedListener focusListener;
    private Button negativeButton;
    private DialogInterface.OnShowListener onShowDialogInterface;
    private View rootView;
    private TextView status;
    private TextView subtitle;
    private TextView title;
    /* access modifiers changed from: private */
    public final BiometricPromptCompatDialog$wallpaperChangedReceiver$1 wallpaperChangedReceiver = new BiometricPromptCompatDialog$wallpaperChangedReceiver$1(this);

    @Metadata(mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/dialogs/BiometricPromptCompatDialog$Companion;", "", "()V", "TAG", "", "getFragment", "Ldev/skomlach/biometric/compat/impl/dialogs/BiometricPromptCompatDialog;", "isInscreenLayout", "", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: BiometricPromptCompatDialog.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public final BiometricPromptCompatDialog getFragment(boolean z) {
            BiometricPromptCompatDialog biometricPromptCompatDialog = new BiometricPromptCompatDialog();
            Bundle bundle = new Bundle();
            bundle.putBoolean("isInscreenLayout", z);
            biometricPromptCompatDialog.setArguments(bundle);
            return biometricPromptCompatDialog;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000b"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/dialogs/BiometricPromptCompatDialog$ScreenProtection;", "", "Landroid/view/Window;", "window", "Lja/u;", "applyProtectionInWindow", "Landroid/view/View;", "view", "applyProtectionInView", "<init>", "(Ldev/skomlach/biometric/compat/impl/dialogs/BiometricPromptCompatDialog;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: BiometricPromptCompatDialog.kt */
    private final class ScreenProtection {
        public ScreenProtection() {
        }

        public final void applyProtectionInView(View view) {
            C13706o.m87929f(view, "view");
            try {
                if (Build.VERSION.SDK_INT >= 26 && ViewCompat.getImportantForAutofill(view) != 8) {
                    ViewCompat.setImportantForAutofill(view, 8);
                }
                view.setAccessibilityDelegate(new C12049x676a879d());
            } catch (Exception e) {
                BiometricLoggerImpl.INSTANCE.mo68219e(e, e.getMessage());
            }
        }

        public final void applyProtectionInWindow(Window window) {
            View view;
            if (window != null) {
                try {
                    view = window.findViewById(16908290);
                } catch (Exception e) {
                    BiometricLoggerImpl.INSTANCE.mo68219e(e, "ActivityContextProvider");
                    return;
                }
            } else {
                view = null;
            }
            if (view != null) {
                applyProtectionInView(view);
            }
        }
    }

    @RequiresApi(31)
    private final void findNearestColor(String str, int i) {
        SystemColorScheme systemColorScheme = new SystemColorScheme();
        Integer num = null;
        double d = Double.MAX_VALUE;
        String str2 = null;
        for (Integer intValue : systemColorScheme.getAccent1().keySet()) {
            int intValue2 = intValue.intValue();
            Srgb srgb = systemColorScheme.getAccent1().get(Integer.valueOf(intValue2));
            if (srgb != null) {
                double colorDistance = ColorUtil.INSTANCE.colorDistance(Extension_ColorKt.toArgb(srgb), i);
                if (colorDistance <= d) {
                    num = Integer.valueOf(intValue2);
                    str2 = "accent1";
                    d = colorDistance;
                }
            }
        }
        for (Integer intValue3 : systemColorScheme.getAccent2().keySet()) {
            int intValue4 = intValue3.intValue();
            Srgb srgb2 = systemColorScheme.getAccent2().get(Integer.valueOf(intValue4));
            if (srgb2 != null) {
                double colorDistance2 = ColorUtil.INSTANCE.colorDistance(Extension_ColorKt.toArgb(srgb2), i);
                if (colorDistance2 <= d) {
                    num = Integer.valueOf(intValue4);
                    str2 = "accent2";
                    d = colorDistance2;
                }
            }
        }
        for (Integer intValue5 : systemColorScheme.getAccent3().keySet()) {
            int intValue6 = intValue5.intValue();
            Srgb srgb3 = systemColorScheme.getAccent3().get(Integer.valueOf(intValue6));
            if (srgb3 != null) {
                double colorDistance3 = ColorUtil.INSTANCE.colorDistance(Extension_ColorKt.toArgb(srgb3), i);
                if (colorDistance3 <= d) {
                    num = Integer.valueOf(intValue6);
                    str2 = "accent3";
                    d = colorDistance3;
                }
            }
        }
        for (Integer intValue7 : systemColorScheme.getNeutral1().keySet()) {
            int intValue8 = intValue7.intValue();
            Srgb srgb4 = systemColorScheme.getNeutral1().get(Integer.valueOf(intValue8));
            if (srgb4 != null) {
                double colorDistance4 = ColorUtil.INSTANCE.colorDistance(Extension_ColorKt.toArgb(srgb4), i);
                if (colorDistance4 <= d) {
                    num = Integer.valueOf(intValue8);
                    str2 = "neutral1";
                    d = colorDistance4;
                }
            }
        }
        for (Integer intValue9 : systemColorScheme.getNeutral2().keySet()) {
            int intValue10 = intValue9.intValue();
            Srgb srgb5 = systemColorScheme.getNeutral2().get(Integer.valueOf(intValue10));
            if (srgb5 != null) {
                double colorDistance5 = ColorUtil.INSTANCE.colorDistance(Extension_ColorKt.toArgb(srgb5), i);
                if (colorDistance5 <= d) {
                    num = Integer.valueOf(intValue10);
                    str2 = "neutral2";
                    d = colorDistance5;
                }
            }
        }
        BiometricLoggerImpl.INSTANCE.mo68220e("MonetColor " + str + " = " + str2 + "[" + num + "]; distance=" + d);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-4  reason: not valid java name */
    public static final void m101335onCreateView$lambda4(BiometricPromptCompatDialog biometricPromptCompatDialog, C13684d0 d0Var) {
        Context context;
        WindowFocusChangedListener windowFocusChangedListener;
        C13706o.m87929f(biometricPromptCompatDialog, "this$0");
        C13706o.m87929f(d0Var, "$lastKnownFocus");
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        biometricLoggerImpl.mo68217d("WindowFocusChangedListenerDialog.OnGlobalLayoutListener called");
        View findViewById = biometricPromptCompatDialog.findViewById(16908290);
        T valueOf = findViewById != null ? Boolean.valueOf(findViewById.hasWindowFocus()) : null;
        if (!C13706o.m87924a(valueOf, d0Var.element)) {
            d0Var.element = valueOf;
            biometricLoggerImpl.mo68220e("WindowFocusChangedListenerDialog.hasFocus(1) - " + valueOf);
            if (!(biometricPromptCompatDialog.focusListener == null || findViewById == null || !ViewCompat.isAttachedToWindow(findViewById) || (windowFocusChangedListener = biometricPromptCompatDialog.focusListener) == null)) {
                windowFocusChangedListener.hasFocus(findViewById.hasWindowFocus());
            }
            if (findViewById != null && (context = findViewById.getContext()) != null) {
                biometricPromptCompatDialog.updateMonetColorsInternal(context);
            }
        }
    }

    private final void setTextToTextViews(View view, int i) {
        if ((view instanceof TextView) && !(view instanceof Button)) {
            ((TextView) view).setTextColor(i);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                setTextToTextViews(viewGroup.getChildAt(i2), i);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void updateMonetColorsInternal(Context context) {
        ViewGroup viewGroup;
        C13339u uVar;
        ViewGroup viewGroup2;
        C13339u uVar2;
        ViewGroup viewGroup3;
        C13339u uVar3;
        ViewGroup viewGroup4;
        C13339u uVar4;
        C12120d dVar = C12120d.f58384a;
        boolean d = dVar.mo68317d();
        Integer valueOf = Integer.valueOf(TypedValues.Custom.TYPE_INT);
        if (d) {
            int color = ContextCompat.getColor(context, dVar.mo68316c() ? C12021R.C12022color.material_blue_500 : C12021R.C12022color.material_deep_teal_500);
            int color2 = ContextCompat.getColor(context, C12021R.C12022color.textColor);
            try {
                SystemColorScheme systemColorScheme = new SystemColorScheme();
                if (DarkLightThemes.INSTANCE.isNightModeCompatWithInscreen(context)) {
                    FingerprintIconView fingerprintIconView = this.fingerprintIcon;
                    if (fingerprintIconView != null) {
                        Srgb srgb = systemColorScheme.getAccent1().get(100);
                        fingerprintIconView.tintColor(srgb != null ? Integer.valueOf(Extension_ColorKt.toArgb(srgb)) : null);
                    }
                    TextView textView = this.status;
                    if (textView != null) {
                        Srgb srgb2 = systemColorScheme.getNeutral1().get(200);
                        textView.setTextColor(srgb2 != null ? Extension_ColorKt.toArgb(srgb2) : color2);
                    }
                    Button button = this.negativeButton;
                    if (button != null) {
                        Srgb srgb3 = systemColorScheme.getAccent1().get(100);
                        if (srgb3 != null) {
                            color = Extension_ColorKt.toArgb(srgb3);
                        }
                        button.setTextColor(color);
                    }
                    View view = this.rootView;
                    if (view != null && (viewGroup4 = (ViewGroup) view.findViewById(C12021R.C12024id.dialogLayout)) != null) {
                        Srgb srgb4 = systemColorScheme.getNeutral1().get(50);
                        if (srgb4 != null) {
                            color2 = Extension_ColorKt.toArgb(srgb4);
                        }
                        setTextToTextViews(viewGroup4, color2);
                        Srgb srgb5 = systemColorScheme.getNeutral1().get(valueOf);
                        if (srgb5 != null) {
                            ViewCompat.setBackgroundTintList(viewGroup4, ColorStateList.valueOf(Extension_ColorKt.toArgb(srgb5)));
                            uVar4 = C13339u.f61331a;
                        } else {
                            uVar4 = null;
                        }
                        if (uVar4 == null) {
                            ViewCompat.setBackgroundTintList(viewGroup4, (ColorStateList) null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                FingerprintIconView fingerprintIconView2 = this.fingerprintIcon;
                if (fingerprintIconView2 != null) {
                    Srgb srgb6 = systemColorScheme.getAccent1().get(100);
                    fingerprintIconView2.tintColor(srgb6 != null ? Integer.valueOf(Extension_ColorKt.toArgb(srgb6)) : null);
                }
                Button button2 = this.negativeButton;
                if (button2 != null) {
                    Srgb srgb7 = systemColorScheme.getAccent1().get(600);
                    if (srgb7 != null) {
                        color = Extension_ColorKt.toArgb(srgb7);
                    }
                    button2.setTextColor(color);
                }
                TextView textView2 = this.status;
                if (textView2 != null) {
                    Srgb srgb8 = systemColorScheme.getNeutral1().get(500);
                    textView2.setTextColor(srgb8 != null ? Extension_ColorKt.toArgb(srgb8) : color2);
                }
                View view2 = this.rootView;
                if (view2 != null && (viewGroup3 = (ViewGroup) view2.findViewById(C12021R.C12024id.dialogLayout)) != null) {
                    Srgb srgb9 = systemColorScheme.getNeutral1().get(valueOf);
                    if (srgb9 != null) {
                        color2 = Extension_ColorKt.toArgb(srgb9);
                    }
                    setTextToTextViews(viewGroup3, color2);
                    Srgb srgb10 = systemColorScheme.getNeutral1().get(50);
                    if (srgb10 != null) {
                        ViewCompat.setBackgroundTintList(viewGroup3, ColorStateList.valueOf(Extension_ColorKt.toArgb(srgb10)));
                        uVar3 = C13339u.f61331a;
                    } else {
                        uVar3 = null;
                    }
                    if (uVar3 == null) {
                        ViewCompat.setBackgroundTintList(viewGroup3, (ColorStateList) null);
                    }
                }
            } catch (Throwable th) {
                BiometricLoggerImpl.INSTANCE.mo68219e(th, "Monet colors");
            }
        } else if (dVar.mo68316c()) {
            int color3 = ContextCompat.getColor(context, dVar.mo68316c() ? C12021R.C12022color.material_blue_500 : C12021R.C12022color.material_deep_teal_500);
            int color4 = ContextCompat.getColor(context, C12021R.C12022color.textColor);
            try {
                SystemColorScheme systemColorScheme2 = new SystemColorScheme();
                if (DarkLightThemes.INSTANCE.isNightModeCompatWithInscreen(context)) {
                    FingerprintIconView fingerprintIconView3 = this.fingerprintIcon;
                    if (fingerprintIconView3 != null) {
                        Srgb srgb11 = systemColorScheme2.getAccent1().get(300);
                        fingerprintIconView3.tintColor(srgb11 != null ? Integer.valueOf(Extension_ColorKt.toArgb(srgb11)) : null);
                    }
                    Button button3 = this.negativeButton;
                    if (button3 != null) {
                        Srgb srgb12 = systemColorScheme2.getAccent2().get(100);
                        if (srgb12 != null) {
                            color3 = Extension_ColorKt.toArgb(srgb12);
                        }
                        button3.setTextColor(color3);
                    }
                    View view3 = this.rootView;
                    if (view3 != null && (viewGroup2 = (ViewGroup) view3.findViewById(C12021R.C12024id.dialogLayout)) != null) {
                        Srgb srgb13 = systemColorScheme2.getNeutral1().get(50);
                        if (srgb13 != null) {
                            color4 = Extension_ColorKt.toArgb(srgb13);
                        }
                        setTextToTextViews(viewGroup2, color4);
                        Srgb srgb14 = systemColorScheme2.getNeutral1().get(valueOf);
                        if (srgb14 != null) {
                            ViewCompat.setBackgroundTintList(viewGroup2, ColorStateList.valueOf(Extension_ColorKt.toArgb(srgb14)));
                            uVar2 = C13339u.f61331a;
                        } else {
                            uVar2 = null;
                        }
                        if (uVar2 == null) {
                            ViewCompat.setBackgroundTintList(viewGroup2, (ColorStateList) null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                FingerprintIconView fingerprintIconView4 = this.fingerprintIcon;
                if (fingerprintIconView4 != null) {
                    Srgb srgb15 = systemColorScheme2.getAccent1().get(600);
                    fingerprintIconView4.tintColor(srgb15 != null ? Integer.valueOf(Extension_ColorKt.toArgb(srgb15)) : null);
                }
                Button button4 = this.negativeButton;
                if (button4 != null) {
                    Srgb srgb16 = systemColorScheme2.getNeutral2().get(500);
                    if (srgb16 != null) {
                        color3 = Extension_ColorKt.toArgb(srgb16);
                    }
                    button4.setTextColor(color3);
                }
                View view4 = this.rootView;
                if (view4 != null && (viewGroup = (ViewGroup) view4.findViewById(C12021R.C12024id.dialogLayout)) != null) {
                    Srgb srgb17 = systemColorScheme2.getNeutral1().get(valueOf);
                    if (srgb17 != null) {
                        color4 = Extension_ColorKt.toArgb(srgb17);
                    }
                    setTextToTextViews(viewGroup, color4);
                    Srgb srgb18 = systemColorScheme2.getNeutral1().get(50);
                    if (srgb18 != null) {
                        ViewCompat.setBackgroundTintList(viewGroup, ColorStateList.valueOf(Extension_ColorKt.toArgb(srgb18)));
                        uVar = C13339u.f61331a;
                    } else {
                        uVar = null;
                    }
                    if (uVar == null) {
                        ViewCompat.setBackgroundTintList(viewGroup, (ColorStateList) null);
                    }
                }
            } catch (Throwable th2) {
                BiometricLoggerImpl.INSTANCE.mo68219e(th2, "Monet colors");
            }
        }
    }

    public void dismiss() {
        if (isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            C13706o.m87928e(parentFragmentManager, "parentFragmentManager");
            BiometricPromptCompatDialog biometricPromptCompatDialog = (BiometricPromptCompatDialog) parentFragmentManager.findFragmentByTag(TAG);
            if (biometricPromptCompatDialog == null) {
                return;
            }
            if (biometricPromptCompatDialog.isAdded()) {
                biometricPromptCompatDialog.dismissAllowingStateLoss();
            } else {
                parentFragmentManager.beginTransaction().remove(biometricPromptCompatDialog).commitAllowingStateLoss();
            }
        }
    }

    public final <T extends View> T findViewById(int i) {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    public final View getAuthPreview() {
        return this.authPreview;
    }

    public final TextView getDescription() {
        return this.description;
    }

    public final FingerprintIconView getFingerprintIcon() {
        return this.fingerprintIcon;
    }

    public final Button getNegativeButton() {
        return this.negativeButton;
    }

    public final View getRootView() {
        return this.rootView;
    }

    public final TextView getStatus() {
        return this.status;
    }

    public final TextView getSubtitle() {
        return this.subtitle;
    }

    public final TextView getTitle() {
        return this.title;
    }

    public final boolean isShowing() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog.isShowing();
        }
        return false;
    }

    public final void makeInvisible() {
        View view = this.containerView;
        if (view != null) {
            view.setAlpha(0.01f);
        }
    }

    public final void makeVisible() {
        View view = this.containerView;
        if (view != null) {
            view.setAlpha(1.0f);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C12021R.style.Theme_BiometricPromptDialog);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(new ContextThemeWrapper(requireContext(), getTheme()), getTheme());
        DarkLightThemes darkLightThemes = DarkLightThemes.INSTANCE;
        Context context = appCompatDialog.getContext();
        C13706o.m87928e(context, "context");
        int nightModeCompatWithInscreen = darkLightThemes.getNightModeCompatWithInscreen(context);
        int i = -1;
        if (nightModeCompatWithInscreen != 0) {
            if (nightModeCompatWithInscreen == 2) {
                i = 2;
            } else if (!BuildCompat.isAtLeastP()) {
                i = 1;
            }
        } else if (!BuildCompat.isAtLeastP()) {
            i = 0;
        }
        appCompatDialog.getDelegate().setLocalNightMode(i);
        appCompatDialog.setCanceledOnTouchOutside(true);
        appCompatDialog.setOnShowListener(this.onShowDialogInterface);
        return appCompatDialog;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        ViewTreeObserver viewTreeObserver;
        C13706o.m87929f(layoutInflater, "inflater");
        Bundle arguments = getArguments();
        boolean z = true;
        if (arguments == null || !arguments.getBoolean("isInscreenLayout")) {
            z = false;
        }
        if (z) {
            i = C12021R.C12026layout.biometric_prompt_dialog_content_inscreen;
        } else {
            i = C12021R.C12026layout.biometric_prompt_dialog_content;
        }
        this.containerView = layoutInflater.inflate(i, viewGroup, false);
        C13684d0 d0Var = new C13684d0();
        View view = this.containerView;
        if (!(view == null || (viewTreeObserver = view.getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnGlobalLayoutListener(new C12050a(this, d0Var));
        }
        View view2 = this.containerView;
        View findViewById = view2 != null ? view2.findViewById(C12021R.C12024id.dialogContent) : null;
        this.rootView = findViewById;
        if (findViewById != null) {
            findViewById.addOnAttachStateChangeListener(new BiometricPromptCompatDialog$onCreateView$2(this));
        }
        View view3 = this.rootView;
        this.title = view3 != null ? (TextView) view3.findViewById(C12021R.C12024id.title) : null;
        View view4 = this.rootView;
        this.subtitle = view4 != null ? (TextView) view4.findViewById(C12021R.C12024id.subtitle) : null;
        View view5 = this.rootView;
        this.description = view5 != null ? (TextView) view5.findViewById(C12021R.C12024id.description) : null;
        View view6 = this.rootView;
        this.status = view6 != null ? (TextView) view6.findViewById(C12021R.C12024id.status) : null;
        View view7 = this.rootView;
        this.negativeButton = view7 != null ? (Button) view7.findViewById(16908313) : null;
        View view8 = this.rootView;
        this.fingerprintIcon = view8 != null ? (FingerprintIconView) view8.findViewById(C12021R.C12024id.fingerprint_icon) : null;
        View view9 = this.rootView;
        this.authPreview = view9 != null ? view9.findViewById(C12021R.C12024id.auth_preview) : null;
        View view10 = this.rootView;
        if (view10 != null) {
            view10.setOnClickListener((View.OnClickListener) null);
        }
        return this.containerView;
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        C13706o.m87929f(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                View view2 = this.containerView;
                if (view2 != null) {
                    view2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    i = view2.getMeasuredHeight();
                } else {
                    i = -2;
                }
                attributes.height = i;
                attributes.gravity = 80;
                window.setAttributes(attributes);
                new ScreenProtection().applyProtectionInWindow(window);
            }
            dialog.setOnCancelListener(this.cancelDialogInterface);
            dialog.setOnDismissListener(this.dismissDialogInterface);
        }
    }

    public final void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        C13339u uVar;
        C13706o.m87929f(onCancelListener, "dialogInterface");
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnCancelListener(onCancelListener);
            uVar = C13339u.f61331a;
        } else {
            uVar = null;
        }
        if (uVar == null) {
            this.cancelDialogInterface = onCancelListener;
        }
    }

    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        C13339u uVar;
        C13706o.m87929f(onDismissListener, "dialogInterface");
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnDismissListener(onDismissListener);
            uVar = C13339u.f61331a;
        } else {
            uVar = null;
        }
        if (uVar == null) {
            this.dismissDialogInterface = onDismissListener;
        }
    }

    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        C13339u uVar;
        C13706o.m87929f(onShowListener, "dialogInterface");
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(onShowListener);
            uVar = C13339u.f61331a;
        } else {
            uVar = null;
        }
        if (uVar == null) {
            this.onShowDialogInterface = onShowListener;
        }
    }

    public final void setWindowFocusChangedListener(WindowFocusChangedListener windowFocusChangedListener) {
        this.focusListener = windowFocusChangedListener;
    }
}

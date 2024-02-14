package dev.skomlach.biometric.compat.impl;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.CancellationHelper;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.AuthenticationResult;
import dev.skomlach.biometric.compat.BiometricAuthRequest;
import dev.skomlach.biometric.compat.BiometricConfirmation;
import dev.skomlach.biometric.compat.BiometricCryptoObject;
import dev.skomlach.biometric.compat.BiometricCryptographyPurpose;
import dev.skomlach.biometric.compat.BiometricPromptCompat;
import dev.skomlach.biometric.compat.BiometricType;
import dev.skomlach.biometric.compat.C12021R;
import dev.skomlach.biometric.compat.engine.BiometricAuthentication;
import dev.skomlach.biometric.compat.engine.BiometricAuthenticationListener;
import dev.skomlach.biometric.compat.engine.core.RestartPredicatesImpl;
import dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate;
import dev.skomlach.biometric.compat.impl.AuthResult;
import dev.skomlach.biometric.compat.impl.dialogs.BiometricPromptCompatDialogImpl;
import dev.skomlach.biometric.compat.utils.DevicesWithKnownBugs;
import dev.skomlach.biometric.compat.utils.HardwareAccessImpl;
import dev.skomlach.biometric.compat.utils.Vibro;
import dev.skomlach.biometric.compat.utils.activityView.IconStateHelper;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.biometric.compat.utils.monet.Extension_ColorKt;
import dev.skomlach.biometric.compat.utils.monet.SystemColorScheme;
import dev.skomlach.biometric.compat.utils.monet.colors.Srgb;
import dev.skomlach.biometric.compat.utils.notification.BiometricNotificationManager;
import dev.skomlach.biometric.compat.utils.themes.DarkLightThemes;
import dev.skomlach.common.misc.C12114c;
import dev.skomlach.common.misc.C12120d;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C13684d0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001LB\u000f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\bJ\u0010KJ\u001c\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J&\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J&\u0010\u0019\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0002J\u0012\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016J\b\u0010\u001e\u001a\u00020\rH\u0016J\b\u0010\u001f\u001a\u00020\rH\u0016J\b\u0010 \u001a\u00020\rH\u0016J\b\u0010!\u001a\u00020\rH\u0016J\b\u0010\"\u001a\u00020\rH\u0016R\u001a\u0010$\u001a\u00020#8\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103R\"\u00107\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000105\u0012\u0004\u0012\u000206048\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001e\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:098\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0017\u0010A\u001a\u00020@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006M"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/BiometricPromptApi28Impl;", "Ldev/skomlach/biometric/compat/impl/IBiometricPromptImpl;", "Ldev/skomlach/biometric/compat/impl/AuthCallback;", "", "str", "", "color", "getFixedString", "", "hasPrimaryFinished", "hasSecondaryFinished", "Landroidx/biometric/BiometricPrompt;", "biometricPrompt", "Lja/u;", "showSystemUi", "Ldev/skomlach/biometric/compat/impl/AuthResult$AuthResultState;", "authResult", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "cryptoObject", "Ldev/skomlach/biometric/compat/AuthenticationFailureReason;", "reason", "checkAuthResultForPrimary", "Ldev/skomlach/biometric/compat/AuthenticationResult;", "module", "failureReason", "checkAuthResultForSecondary", "Ldev/skomlach/biometric/compat/BiometricPromptCompat$AuthenticationCallback;", "cbk", "authenticate", "cancelAuthentication", "startAuth", "stopAuth", "cancelAuth", "onUiOpened", "onUiClosed", "Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;", "builder", "Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;", "getBuilder", "()Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;", "Landroidx/biometric/BiometricPrompt$PromptInfo;", "biometricPromptInfo", "Landroidx/biometric/BiometricPrompt$PromptInfo;", "Landroidx/biometric/BiometricPrompt;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "Ldev/skomlach/biometric/compat/impl/dialogs/BiometricPromptCompatDialogImpl;", "dialog", "Ldev/skomlach/biometric/compat/impl/dialogs/BiometricPromptCompatDialogImpl;", "callback", "Ldev/skomlach/biometric/compat/BiometricPromptCompat$AuthenticationCallback;", "", "Ldev/skomlach/biometric/compat/BiometricType;", "Ldev/skomlach/biometric/compat/impl/AuthResult;", "authFinished", "Ljava/util/Map;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/biometric/BiometricFragment;", "biometricFragment", "Ljava/util/concurrent/atomic/AtomicReference;", "Ldev/skomlach/biometric/compat/engine/BiometricAuthenticationListener;", "fmAuthCallback", "Ldev/skomlach/biometric/compat/engine/BiometricAuthenticationListener;", "Landroidx/biometric/BiometricPrompt$AuthenticationCallback;", "authCallback", "Landroidx/biometric/BiometricPrompt$AuthenticationCallback;", "getAuthCallback", "()Landroidx/biometric/BiometricPrompt$AuthenticationCallback;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isFingerprint", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isSamsungWorkaroundRequired", "()Z", "<init>", "(Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;)V", "BiometricAuthenticationCallbackImpl", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricPromptApi28Impl.kt */
public final class BiometricPromptApi28Impl implements IBiometricPromptImpl, AuthCallback {
    private final BiometricPrompt.AuthenticationCallback authCallback;
    private final Map<BiometricType, AuthResult> authFinished = new HashMap();
    private AtomicReference<BiometricFragment> biometricFragment = new AtomicReference<>((Object) null);
    private final BiometricPrompt biometricPrompt;
    private final BiometricPrompt.PromptInfo biometricPromptInfo;
    private final BiometricPromptCompat.Builder builder;
    /* access modifiers changed from: private */
    public BiometricPromptCompat.AuthenticationCallback callback;
    /* access modifiers changed from: private */
    public BiometricPromptCompatDialogImpl dialog;
    private final BiometricAuthenticationListener fmAuthCallback = new BiometricAuthenticationCallbackImpl();
    private final AtomicBoolean isFingerprint;
    /* access modifiers changed from: private */
    public final RestartPredicate restartPredicate = RestartPredicatesImpl.defaultPredicate();

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\f\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\u0010"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/BiometricPromptApi28Impl$BiometricAuthenticationCallbackImpl;", "Ldev/skomlach/biometric/compat/engine/BiometricAuthenticationListener;", "Ldev/skomlach/biometric/compat/AuthenticationResult;", "module", "Lja/u;", "onSuccess", "", "msg", "onHelp", "Ldev/skomlach/biometric/compat/AuthenticationFailureReason;", "failureReason", "Ldev/skomlach/biometric/compat/BiometricType;", "onFailure", "onCanceled", "<init>", "(Ldev/skomlach/biometric/compat/impl/BiometricPromptApi28Impl;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: BiometricPromptApi28Impl.kt */
    private final class BiometricAuthenticationCallbackImpl implements BiometricAuthenticationListener {
        public BiometricAuthenticationCallbackImpl() {
        }

        public void onCanceled(BiometricType biometricType) {
            BiometricPromptApi28Impl.this.cancelAuth();
            BiometricPromptApi28Impl.this.cancelAuthentication();
        }

        public void onFailure(AuthenticationFailureReason authenticationFailureReason, BiometricType biometricType) {
            BiometricPromptApi28Impl.this.checkAuthResultForSecondary(new AuthenticationResult(biometricType, (BiometricCryptoObject) null, 2, (C13695i) null), AuthResult.AuthResultState.FATAL_ERROR, authenticationFailureReason);
        }

        public void onHelp(CharSequence charSequence) {
            BiometricPromptCompatDialogImpl access$getDialog$p;
            if (!(charSequence == null || charSequence.length() == 0) && BiometricPromptApi28Impl.this.dialog != null && (access$getDialog$p = BiometricPromptApi28Impl.this.dialog) != null) {
                access$getDialog$p.onHelp(charSequence);
            }
        }

        public void onSuccess(AuthenticationResult authenticationResult) {
            BiometricPromptApi28Impl.checkAuthResultForSecondary$default(BiometricPromptApi28Impl.this, authenticationResult, AuthResult.AuthResultState.SUCCESS, (AuthenticationFailureReason) null, 4, (Object) null);
        }
    }

    public BiometricPromptApi28Impl(BiometricPromptCompat.Builder builder2) {
        C13706o.m87929f(builder2, "builder");
        this.builder = builder2;
        BiometricPromptApi28Impl$authCallback$1 biometricPromptApi28Impl$authCallback$1 = new BiometricPromptApi28Impl$authCallback$1(this);
        this.authCallback = biometricPromptApi28Impl$authCallback$1;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.isFingerprint = atomicBoolean;
        BiometricPrompt.PromptInfo.Builder builder3 = new BiometricPrompt.PromptInfo.Builder();
        CharSequence title = getBuilder().getTitle();
        if (title != null) {
            builder3.setTitle(title);
        }
        CharSequence subtitle = getBuilder().getSubtitle();
        if (subtitle != null) {
            builder3.setSubtitle(subtitle);
        }
        CharSequence description = getBuilder().getDescription();
        if (description != null) {
            builder3.setDescription(description);
        }
        if (!(atomicBoolean.get() && DevicesWithKnownBugs.INSTANCE.isHideDialogInstantly())) {
            FragmentActivity context = getBuilder().getContext();
            C12120d dVar = C12120d.f58384a;
            int color = ContextCompat.getColor(context, dVar.mo68316c() ? C12021R.C12022color.material_blue_500 : C12021R.C12022color.material_deep_teal_500);
            if (dVar.mo68316c()) {
                SystemColorScheme systemColorScheme = new SystemColorScheme();
                if (DarkLightThemes.INSTANCE.isNightModeCompatWithInscreen(getBuilder().getContext())) {
                    Srgb srgb = systemColorScheme.getAccent2().get(100);
                    if (srgb != null) {
                        color = Extension_ColorKt.toArgb(srgb);
                    }
                } else {
                    Srgb srgb2 = systemColorScheme.getNeutral2().get(500);
                    if (srgb2 != null) {
                        color = Extension_ColorKt.toArgb(srgb2);
                    }
                }
            }
            String string = getBuilder().getContext().getString(17039360);
            if (dVar.mo68315b()) {
                builder3.setNegativeButtonText(string);
            } else {
                builder3.setNegativeButtonText(getFixedString(string, color));
            }
        }
        builder3.setDeviceCredentialAllowed(false);
        builder3.setAllowedAuthenticators(getBuilder().getCryptographyPurpose() != null ? 15 : 255);
        builder3.setConfirmationRequired(false);
        BiometricPrompt.PromptInfo build = builder3.build();
        C13706o.m87928e(build, "promptInfoBuilder.build()");
        this.biometricPromptInfo = build;
        this.biometricPrompt = new BiometricPrompt(getBuilder().getContext(), C12114c.f58379a.mo68303d(), (BiometricPrompt.AuthenticationCallback) biometricPromptApi28Impl$authCallback$1);
        atomicBoolean.set(getBuilder().getPrimaryAvailableTypes().contains(BiometricType.BIOMETRIC_FINGERPRINT));
    }

    /* access modifiers changed from: private */
    public final void checkAuthResultForPrimary(AuthResult.AuthResultState authResultState, BiometricPrompt.CryptoObject cryptoObject, AuthenticationFailureReason authenticationFailureReason) {
        BiometricCryptoObject biometricCryptoObject;
        C13684d0 d0Var = new C13684d0();
        d0Var.element = authenticationFailureReason;
        boolean z = false;
        if (C13566b0.m87414O(C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, AuthenticationFailureReason.AUTHENTICATION_FAILED), d0Var.element)) {
            HardwareAccessImpl.Companion.getInstance(getBuilder().getBiometricAuthRequest()).lockout();
            d0Var.element = AuthenticationFailureReason.LOCKED_OUT;
        }
        T t = null;
        if (cryptoObject == null) {
            biometricCryptoObject = null;
        } else {
            biometricCryptoObject = new BiometricCryptoObject(cryptoObject.getSignature(), cryptoObject.getCipher(), cryptoObject.getMac());
        }
        boolean z2 = false;
        for (BiometricType next : isSamsungWorkaroundRequired() ? getBuilder().getAllAvailableTypes() : getBuilder().getPrimaryAvailableTypes()) {
            this.authFinished.put(next, new AuthResult(authResultState, new AuthenticationResult(next, biometricCryptoObject), (AuthenticationFailureReason) d0Var.element));
            BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl = this.dialog;
            if (biometricPromptCompatDialogImpl != null) {
                biometricPromptCompatDialogImpl.setAuthFinishedCopy(this.authFinished);
            }
            if (AuthResult.AuthResultState.SUCCESS == authResultState) {
                IconStateHelper.INSTANCE.successType(next);
            } else {
                IconStateHelper.INSTANCE.errorType(next);
            }
            BiometricNotificationManager.INSTANCE.dismiss(next);
            z2 = true;
        }
        if (z2 && getBuilder().getBiometricAuthRequest().getConfirmation() == BiometricConfirmation.ALL && AuthResult.AuthResultState.SUCCESS == authResultState) {
            Vibro.INSTANCE.start();
        }
        ArrayList arrayList = new ArrayList(this.authFinished.keySet());
        ArrayList arrayList2 = new ArrayList(getBuilder().getAllAvailableTypes());
        arrayList2.removeAll(arrayList);
        BiometricLoggerImpl.INSTANCE.mo68217d("checkAuthResultForPrimary.authFinished - " + getBuilder().getBiometricAuthRequest() + ": " + arrayList2 + "; (" + this.authFinished + " / " + getBuilder().getAllAvailableTypes() + ")");
        T t2 = null;
        for (T next2 : this.authFinished.values()) {
            if (((AuthResult) next2).getAuthResultState() == AuthResult.AuthResultState.FATAL_ERROR) {
                t2 = next2;
            }
        }
        AuthResult authResult = (AuthResult) t2;
        for (T next3 : this.authFinished.values()) {
            if (((AuthResult) next3).getAuthResultState() == AuthResult.AuthResultState.SUCCESS) {
                t = next3;
            }
        }
        AuthResult authResult2 = (AuthResult) t;
        BiometricLoggerImpl.INSTANCE.mo68217d("checkAuthResultForPrimary.authFinished - " + getBuilder().getBiometricAuthRequest() + ": " + authResult + "/" + authResult2);
        if (((authResult2 != null || arrayList2.isEmpty()) && getBuilder().getBiometricAuthRequest().getConfirmation() == BiometricConfirmation.ANY) || (getBuilder().getBiometricAuthRequest().getConfirmation() == BiometricConfirmation.ALL && (DevicesWithKnownBugs.INSTANCE.isSamsung() || arrayList2.isEmpty()))) {
            C12114c.f58379a.mo68305g(new C12063f(this, authResult2, authResult, d0Var));
        } else if (!arrayList2.isEmpty()) {
            if (this.dialog == null) {
                BiometricPromptCompat.Builder builder2 = getBuilder();
                BiometricPromptApi28Impl$checkAuthResultForPrimary$2 biometricPromptApi28Impl$checkAuthResultForPrimary$2 = new BiometricPromptApi28Impl$checkAuthResultForPrimary$2(this);
                if (getBuilder().getSecondaryAvailableTypes().contains(BiometricType.BIOMETRIC_FINGERPRINT) && DevicesWithKnownBugs.INSTANCE.getHasUnderDisplayFingerprint()) {
                    z = true;
                }
                BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl2 = new BiometricPromptCompatDialogImpl(builder2, biometricPromptApi28Impl$checkAuthResultForPrimary$2, z);
                this.dialog = biometricPromptCompatDialogImpl2;
                biometricPromptCompatDialogImpl2.setAuthFinishedCopy(this.authFinished);
            }
            BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl3 = this.dialog;
            if (biometricPromptCompatDialogImpl3 != null) {
                biometricPromptCompatDialogImpl3.showDialog();
            }
        }
    }

    static /* synthetic */ void checkAuthResultForPrimary$default(BiometricPromptApi28Impl biometricPromptApi28Impl, AuthResult.AuthResultState authResultState, BiometricPrompt.CryptoObject cryptoObject, AuthenticationFailureReason authenticationFailureReason, int i, Object obj) {
        if ((i & 4) != 0) {
            authenticationFailureReason = null;
        }
        biometricPromptApi28Impl.checkAuthResultForPrimary(authResultState, cryptoObject, authenticationFailureReason);
    }

    /* access modifiers changed from: private */
    /* renamed from: checkAuthResultForPrimary$lambda-26  reason: not valid java name */
    public static final void m101307checkAuthResultForPrimary$lambda26(BiometricPromptApi28Impl biometricPromptApi28Impl, AuthResult authResult, AuthResult authResult2, C13684d0 d0Var) {
        boolean z;
        AuthenticationResult authenticationResult;
        AuthenticationResult successData;
        BiometricCryptoObject biometricCryptoObject;
        C13706o.m87929f(biometricPromptApi28Impl, "this$0");
        C13706o.m87929f(d0Var, "$failureReason");
        biometricPromptApi28Impl.cancelAuthentication();
        if (authResult != null) {
            Map<BiometricType, AuthResult> map = biometricPromptApi28Impl.authFinished;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<Map.Entry<BiometricType, AuthResult>> it = map.entrySet().iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((AuthResult) next.getValue()).getAuthResultState() != AuthResult.AuthResultState.SUCCESS) {
                    z = false;
                }
                if (z) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            BiometricCryptographyPurpose cryptographyPurpose = biometricPromptApi28Impl.getBuilder().getCryptographyPurpose();
            if ((cryptographyPurpose != null ? Integer.valueOf(cryptographyPurpose.getPurpose()) : null) != null) {
                z = false;
            }
            BiometricPromptCompat.AuthenticationCallback authenticationCallback = biometricPromptApi28Impl.callback;
            if (authenticationCallback != null) {
                List<BiometricType> F0 = C13566b0.m87402F0(linkedHashMap.keySet());
                ArrayList arrayList = new ArrayList();
                for (BiometricType biometricType : F0) {
                    AuthResult authResult3 = (AuthResult) linkedHashMap.get(biometricType);
                    if (authResult3 == null || (successData = authResult3.getSuccessData()) == null) {
                        authenticationResult = null;
                    } else {
                        BiometricType confirmed = successData.getConfirmed();
                        if (z) {
                            biometricCryptoObject = null;
                        } else {
                            biometricCryptoObject = successData.getCryptoObject();
                        }
                        authenticationResult = new AuthenticationResult(confirmed, biometricCryptoObject);
                    }
                    if (authenticationResult != null) {
                        arrayList.add(authenticationResult);
                    }
                }
                authenticationCallback.onSucceeded(C13566b0.m87407K0(arrayList));
            }
        } else if (authResult2 == null) {
        } else {
            if (d0Var.element == AuthenticationFailureReason.LOCKED_OUT) {
                C12114c.f58379a.mo68306h(new C12047c(biometricPromptApi28Impl, authResult2), 2000);
                return;
            }
            BiometricPromptCompat.AuthenticationCallback authenticationCallback2 = biometricPromptApi28Impl.callback;
            if (authenticationCallback2 != null) {
                BiometricPromptCompat.AuthenticationCallback.onFailed$default(authenticationCallback2, authResult2.getFailureReason(), (CharSequence) null, 2, (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: checkAuthResultForPrimary$lambda-26$lambda-25  reason: not valid java name */
    public static final void m101308checkAuthResultForPrimary$lambda26$lambda25(BiometricPromptApi28Impl biometricPromptApi28Impl, AuthResult authResult) {
        C13706o.m87929f(biometricPromptApi28Impl, "this$0");
        BiometricPromptCompat.AuthenticationCallback authenticationCallback = biometricPromptApi28Impl.callback;
        if (authenticationCallback != null) {
            BiometricPromptCompat.AuthenticationCallback.onFailed$default(authenticationCallback, authResult.getFailureReason(), (CharSequence) null, 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final void checkAuthResultForSecondary(AuthenticationResult authenticationResult, AuthResult.AuthResultState authResultState, AuthenticationFailureReason authenticationFailureReason) {
        T t = null;
        if (authResultState == AuthResult.AuthResultState.SUCCESS) {
            IconStateHelper.INSTANCE.successType(authenticationResult != null ? authenticationResult.getConfirmed() : null);
            if (getBuilder().getBiometricAuthRequest().getConfirmation() == BiometricConfirmation.ALL) {
                Vibro.INSTANCE.start();
            }
        } else if (authResultState == AuthResult.AuthResultState.FATAL_ERROR) {
            IconStateHelper.INSTANCE.errorType(authenticationResult != null ? authenticationResult.getConfirmed() : null);
            BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl = this.dialog;
            if (biometricPromptCompatDialogImpl != null) {
                biometricPromptCompatDialogImpl.onFailure(authenticationFailureReason == AuthenticationFailureReason.LOCKED_OUT);
            }
        }
        if (!C13566b0.m87414O(C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, AuthenticationFailureReason.AUTHENTICATION_FAILED), authenticationFailureReason)) {
            this.authFinished.put(authenticationResult != null ? authenticationResult.getConfirmed() : null, new AuthResult(authResultState, authenticationResult, authenticationFailureReason));
            BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl2 = this.dialog;
            if (biometricPromptCompatDialogImpl2 != null) {
                biometricPromptCompatDialogImpl2.setAuthFinishedCopy(this.authFinished);
            }
            BiometricNotificationManager.INSTANCE.dismiss(authenticationResult != null ? authenticationResult.getConfirmed() : null);
            ArrayList arrayList = new ArrayList(this.authFinished.keySet());
            ArrayList arrayList2 = new ArrayList(getBuilder().getAllAvailableTypes());
            arrayList2.removeAll(arrayList);
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            BiometricAuthRequest biometricAuthRequest = getBuilder().getBiometricAuthRequest();
            Map<BiometricType, AuthResult> map = this.authFinished;
            HashSet<BiometricType> allAvailableTypes = getBuilder().getAllAvailableTypes();
            biometricLoggerImpl.mo68217d("checkAuthResultForSecondary.authFinished - " + biometricAuthRequest + ": " + arrayList2 + "; (" + map + " / " + allAvailableTypes + ")");
            T t2 = null;
            for (T next : this.authFinished.values()) {
                if (((AuthResult) next).getAuthResultState() == AuthResult.AuthResultState.FATAL_ERROR) {
                    t2 = next;
                }
            }
            AuthResult authResult = (AuthResult) t2;
            for (T next2 : this.authFinished.values()) {
                if (((AuthResult) next2).getAuthResultState() == AuthResult.AuthResultState.SUCCESS) {
                    t = next2;
                }
            }
            AuthResult authResult2 = (AuthResult) t;
            BiometricLoggerImpl biometricLoggerImpl2 = BiometricLoggerImpl.INSTANCE;
            BiometricAuthRequest biometricAuthRequest2 = getBuilder().getBiometricAuthRequest();
            biometricLoggerImpl2.mo68217d("checkAuthResultForSecondary.authFinished - " + biometricAuthRequest2 + ": " + authResult + "/" + authResult2);
            if (((authResult2 != null || arrayList2.isEmpty()) && getBuilder().getBiometricAuthRequest().getConfirmation() == BiometricConfirmation.ANY) || (getBuilder().getBiometricAuthRequest().getConfirmation() == BiometricConfirmation.ALL && arrayList2.isEmpty())) {
                C12114c.f58379a.mo68305g(new C12062e(this, authResult2, authResult));
            }
        }
    }

    static /* synthetic */ void checkAuthResultForSecondary$default(BiometricPromptApi28Impl biometricPromptApi28Impl, AuthenticationResult authenticationResult, AuthResult.AuthResultState authResultState, AuthenticationFailureReason authenticationFailureReason, int i, Object obj) {
        if ((i & 4) != 0) {
            authenticationFailureReason = null;
        }
        biometricPromptApi28Impl.checkAuthResultForSecondary(authenticationResult, authResultState, authenticationFailureReason);
    }

    /* access modifiers changed from: private */
    /* renamed from: checkAuthResultForSecondary$lambda-33  reason: not valid java name */
    public static final void m101309checkAuthResultForSecondary$lambda33(BiometricPromptApi28Impl biometricPromptApi28Impl, AuthResult authResult, AuthResult authResult2) {
        boolean z;
        AuthenticationResult authenticationResult;
        AuthenticationResult successData;
        BiometricCryptoObject biometricCryptoObject;
        C13706o.m87929f(biometricPromptApi28Impl, "this$0");
        biometricPromptApi28Impl.cancelAuthentication();
        if (authResult != null) {
            Map<BiometricType, AuthResult> map = biometricPromptApi28Impl.authFinished;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<Map.Entry<BiometricType, AuthResult>> it = map.entrySet().iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((AuthResult) next.getValue()).getAuthResultState() != AuthResult.AuthResultState.SUCCESS) {
                    z = false;
                }
                if (z) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            BiometricCryptographyPurpose cryptographyPurpose = biometricPromptApi28Impl.getBuilder().getCryptographyPurpose();
            if ((cryptographyPurpose != null ? Integer.valueOf(cryptographyPurpose.getPurpose()) : null) != null) {
                z = false;
            }
            BiometricPromptCompat.AuthenticationCallback authenticationCallback = biometricPromptApi28Impl.callback;
            if (authenticationCallback != null) {
                List<BiometricType> F0 = C13566b0.m87402F0(linkedHashMap.keySet());
                ArrayList arrayList = new ArrayList();
                for (BiometricType biometricType : F0) {
                    AuthResult authResult3 = (AuthResult) linkedHashMap.get(biometricType);
                    if (authResult3 == null || (successData = authResult3.getSuccessData()) == null) {
                        authenticationResult = null;
                    } else {
                        BiometricType confirmed = successData.getConfirmed();
                        if (z) {
                            biometricCryptoObject = null;
                        } else {
                            biometricCryptoObject = successData.getCryptoObject();
                        }
                        authenticationResult = new AuthenticationResult(confirmed, biometricCryptoObject);
                    }
                    if (authenticationResult != null) {
                        arrayList.add(authenticationResult);
                    }
                }
                authenticationCallback.onSucceeded(C13566b0.m87407K0(arrayList));
            }
        } else if (authResult2 == null) {
        } else {
            if (authResult2.getFailureReason() != AuthenticationFailureReason.LOCKED_OUT) {
                BiometricPromptCompat.AuthenticationCallback authenticationCallback2 = biometricPromptApi28Impl.callback;
                if (authenticationCallback2 != null) {
                    BiometricPromptCompat.AuthenticationCallback.onFailed$default(authenticationCallback2, authResult2.getFailureReason(), (CharSequence) null, 2, (Object) null);
                    return;
                }
                return;
            }
            HardwareAccessImpl.Companion.getInstance(biometricPromptApi28Impl.getBuilder().getBiometricAuthRequest()).lockout();
            C12114c.f58379a.mo68306h(new C12048d(biometricPromptApi28Impl, authResult2), 2000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: checkAuthResultForSecondary$lambda-33$lambda-32  reason: not valid java name */
    public static final void m101310checkAuthResultForSecondary$lambda33$lambda32(BiometricPromptApi28Impl biometricPromptApi28Impl, AuthResult authResult) {
        C13706o.m87929f(biometricPromptApi28Impl, "this$0");
        BiometricPromptCompat.AuthenticationCallback authenticationCallback = biometricPromptApi28Impl.callback;
        if (authenticationCallback != null) {
            BiometricPromptCompat.AuthenticationCallback.onFailed$default(authenticationCallback, authResult.getFailureReason(), (CharSequence) null, 2, (Object) null);
        }
    }

    private final CharSequence getFixedString(CharSequence charSequence, @ColorInt int i) {
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new ForegroundColorSpan(i), 0, spannableString.length(), 33);
        return spannableString;
    }

    private final boolean hasPrimaryFinished() {
        ArrayList arrayList = new ArrayList(this.authFinished.keySet());
        ArrayList arrayList2 = new ArrayList(getBuilder().getPrimaryAvailableTypes());
        arrayList2.removeAll(arrayList);
        return arrayList2.isEmpty();
    }

    private final boolean hasSecondaryFinished() {
        ArrayList arrayList = new ArrayList(this.authFinished.keySet());
        ArrayList arrayList2 = new ArrayList(getBuilder().getSecondaryAvailableTypes());
        arrayList2.removeAll(arrayList);
        return arrayList2.isEmpty();
    }

    /* access modifiers changed from: private */
    public final boolean isSamsungWorkaroundRequired() {
        HashSet<BiometricType> allAvailableTypes = getBuilder().getAllAvailableTypes();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = allAvailableTypes.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((BiometricType) next) != BiometricType.BIOMETRIC_ANY) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        if (!DevicesWithKnownBugs.INSTANCE.isSamsung() || arrayList.size() <= 1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:46|47|48|49) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00b5 */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00af A[SYNTHETIC, Splitter:B:46:0x00af] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bb A[Catch:{ BiometricCryptoException -> 0x001e, BiometricCryptoException -> 0x00cb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void showSystemUi(androidx.biometric.BiometricPrompt r8) {
        /*
            r7 = this;
            java.lang.String r0 = "BiometricPromptCompat"
            r1 = 0
            dev.skomlach.biometric.compat.BiometricPromptCompat$Builder r2 = r7.getBuilder()     // Catch:{ BiometricCryptoException -> 0x00cb }
            dev.skomlach.biometric.compat.BiometricCryptographyPurpose r2 = r2.getCryptographyPurpose()     // Catch:{ BiometricCryptoException -> 0x00cb }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0049
            dev.skomlach.biometric.compat.crypto.BiometricCryptoObjectHelper r2 = dev.skomlach.biometric.compat.crypto.BiometricCryptoObjectHelper.INSTANCE     // Catch:{ BiometricCryptoException -> 0x001e }
            dev.skomlach.biometric.compat.BiometricPromptCompat$Builder r5 = r7.getBuilder()     // Catch:{ BiometricCryptoException -> 0x001e }
            dev.skomlach.biometric.compat.BiometricCryptographyPurpose r5 = r5.getCryptographyPurpose()     // Catch:{ BiometricCryptoException -> 0x001e }
            dev.skomlach.biometric.compat.BiometricCryptoObject r0 = r2.getBiometricCryptoObject(r0, r5, r4)     // Catch:{ BiometricCryptoException -> 0x001e }
            goto L_0x004a
        L_0x001e:
            r2 = move-exception
            dev.skomlach.biometric.compat.BiometricPromptCompat$Builder r5 = r7.getBuilder()     // Catch:{ BiometricCryptoException -> 0x00cb }
            dev.skomlach.biometric.compat.BiometricCryptographyPurpose r5 = r5.getCryptographyPurpose()     // Catch:{ BiometricCryptoException -> 0x00cb }
            if (r5 == 0) goto L_0x0033
            int r5 = r5.getPurpose()     // Catch:{ BiometricCryptoException -> 0x00cb }
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r5 != r6) goto L_0x0033
            r5 = 1
            goto L_0x0034
        L_0x0033:
            r5 = 0
        L_0x0034:
            if (r5 == 0) goto L_0x0048
            dev.skomlach.biometric.compat.crypto.BiometricCryptoObjectHelper r2 = dev.skomlach.biometric.compat.crypto.BiometricCryptoObjectHelper.INSTANCE     // Catch:{ BiometricCryptoException -> 0x00cb }
            r2.deleteCrypto(r0)     // Catch:{ BiometricCryptoException -> 0x00cb }
            dev.skomlach.biometric.compat.BiometricPromptCompat$Builder r5 = r7.getBuilder()     // Catch:{ BiometricCryptoException -> 0x00cb }
            dev.skomlach.biometric.compat.BiometricCryptographyPurpose r5 = r5.getCryptographyPurpose()     // Catch:{ BiometricCryptoException -> 0x00cb }
            dev.skomlach.biometric.compat.BiometricCryptoObject r0 = r2.getBiometricCryptoObject(r0, r5, r4)     // Catch:{ BiometricCryptoException -> 0x00cb }
            goto L_0x004a
        L_0x0048:
            throw r2     // Catch:{ BiometricCryptoException -> 0x00cb }
        L_0x0049:
            r0 = r1
        L_0x004a:
            if (r0 == 0) goto L_0x0051
            javax.crypto.Cipher r2 = r0.getCipher()     // Catch:{ BiometricCryptoException -> 0x00cb }
            goto L_0x0052
        L_0x0051:
            r2 = r1
        L_0x0052:
            if (r2 == 0) goto L_0x0064
            if (r0 == 0) goto L_0x0062
            javax.crypto.Cipher r0 = r0.getCipher()     // Catch:{ BiometricCryptoException -> 0x00cb }
            if (r0 == 0) goto L_0x0062
            androidx.biometric.BiometricPrompt$CryptoObject r2 = new androidx.biometric.BiometricPrompt$CryptoObject     // Catch:{ BiometricCryptoException -> 0x00cb }
            r2.<init>((javax.crypto.Cipher) r0)     // Catch:{ BiometricCryptoException -> 0x00cb }
            goto L_0x0093
        L_0x0062:
            r2 = r1
            goto L_0x0093
        L_0x0064:
            if (r0 == 0) goto L_0x006b
            javax.crypto.Mac r2 = r0.getMac()     // Catch:{ BiometricCryptoException -> 0x00cb }
            goto L_0x006c
        L_0x006b:
            r2 = r1
        L_0x006c:
            if (r2 == 0) goto L_0x007c
            if (r0 == 0) goto L_0x0062
            javax.crypto.Mac r0 = r0.getMac()     // Catch:{ BiometricCryptoException -> 0x00cb }
            if (r0 == 0) goto L_0x0062
            androidx.biometric.BiometricPrompt$CryptoObject r2 = new androidx.biometric.BiometricPrompt$CryptoObject     // Catch:{ BiometricCryptoException -> 0x00cb }
            r2.<init>((javax.crypto.Mac) r0)     // Catch:{ BiometricCryptoException -> 0x00cb }
            goto L_0x0093
        L_0x007c:
            if (r0 == 0) goto L_0x0083
            java.security.Signature r2 = r0.getSignature()     // Catch:{ BiometricCryptoException -> 0x00cb }
            goto L_0x0084
        L_0x0083:
            r2 = r1
        L_0x0084:
            if (r2 == 0) goto L_0x0062
            if (r0 == 0) goto L_0x0062
            java.security.Signature r0 = r0.getSignature()     // Catch:{ BiometricCryptoException -> 0x00cb }
            if (r0 == 0) goto L_0x0062
            androidx.biometric.BiometricPrompt$CryptoObject r2 = new androidx.biometric.BiometricPrompt$CryptoObject     // Catch:{ BiometricCryptoException -> 0x00cb }
            r2.<init>((java.security.Signature) r0)     // Catch:{ BiometricCryptoException -> 0x00cb }
        L_0x0093:
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r0 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE     // Catch:{ BiometricCryptoException -> 0x00cb }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ BiometricCryptoException -> 0x00cb }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ BiometricCryptoException -> 0x00cb }
            r5.<init>()     // Catch:{ BiometricCryptoException -> 0x00cb }
            java.lang.String r6 = "BiometricPromptCompat.authenticate:  Crypto="
            r5.append(r6)     // Catch:{ BiometricCryptoException -> 0x00cb }
            r5.append(r2)     // Catch:{ BiometricCryptoException -> 0x00cb }
            java.lang.String r5 = r5.toString()     // Catch:{ BiometricCryptoException -> 0x00cb }
            r4[r3] = r5     // Catch:{ BiometricCryptoException -> 0x00cb }
            r0.mo68217d(r4)     // Catch:{ BiometricCryptoException -> 0x00cb }
            if (r2 == 0) goto L_0x00bb
            androidx.biometric.BiometricPrompt$PromptInfo r0 = r7.biometricPromptInfo     // Catch:{ all -> 0x00b5 }
            r8.authenticate(r0, r2)     // Catch:{ all -> 0x00b5 }
            goto L_0x00c0
        L_0x00b5:
            androidx.biometric.BiometricPrompt$PromptInfo r0 = r7.biometricPromptInfo     // Catch:{ BiometricCryptoException -> 0x00cb }
            r8.authenticate(r0)     // Catch:{ BiometricCryptoException -> 0x00cb }
            goto L_0x00c0
        L_0x00bb:
            androidx.biometric.BiometricPrompt$PromptInfo r0 = r7.biometricPromptInfo     // Catch:{ BiometricCryptoException -> 0x00cb }
            r8.authenticate(r0)     // Catch:{ BiometricCryptoException -> 0x00cb }
        L_0x00c0:
            dev.skomlach.common.misc.c r8 = dev.skomlach.common.misc.C12114c.f58379a     // Catch:{ BiometricCryptoException -> 0x00cb }
            dev.skomlach.biometric.compat.impl.a r0 = new dev.skomlach.biometric.compat.impl.a     // Catch:{ BiometricCryptoException -> 0x00cb }
            r0.<init>(r7)     // Catch:{ BiometricCryptoException -> 0x00cb }
            r8.mo68308k(r0)     // Catch:{ BiometricCryptoException -> 0x00cb }
            goto L_0x00d8
        L_0x00cb:
            r8 = move-exception
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r0 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r0.mo68218e((java.lang.Throwable) r8)
            dev.skomlach.biometric.compat.impl.AuthResult$AuthResultState r8 = dev.skomlach.biometric.compat.impl.AuthResult.AuthResultState.FATAL_ERROR
            dev.skomlach.biometric.compat.AuthenticationFailureReason r0 = dev.skomlach.biometric.compat.AuthenticationFailureReason.CRYPTO_ERROR
            r7.checkAuthResultForPrimary(r8, r1, r0)
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.impl.BiometricPromptApi28Impl.showSystemUi(androidx.biometric.BiometricPrompt):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: showSystemUi$lambda-16  reason: not valid java name */
    public static final void m101311showSystemUi$lambda16(BiometricPromptApi28Impl biometricPromptApi28Impl) {
        Method method;
        boolean isAccessible;
        C13706o.m87929f(biometricPromptApi28Impl, "this$0");
        try {
            Method[] declaredMethods = BiometricPrompt.class.getDeclaredMethods();
            C13706o.m87928e(declaredMethods, "BiometricPrompt::class.java.declaredMethods");
            int length = declaredMethods.length;
            for (int i = 0; i < length; i++) {
                method = declaredMethods[i];
                if (method.getParameterTypes().length == 1 && C13706o.m87924a(method.getParameterTypes()[0], FragmentManager.class) && C13706o.m87924a(method.getReturnType(), BiometricFragment.class)) {
                    isAccessible = method.isAccessible();
                    if (!isAccessible) {
                        method.setAccessible(true);
                    }
                    biometricPromptApi28Impl.biometricFragment.set((BiometricFragment) method.invoke((Object) null, new Object[]{biometricPromptApi28Impl.getBuilder().getContext().getSupportFragmentManager()}));
                    if (!isAccessible) {
                        method.setAccessible(false);
                        return;
                    }
                    return;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: startAuth$lambda-10  reason: not valid java name */
    public static final void m101312startAuth$lambda10(AtomicBoolean atomicBoolean, Set set, long j, BiometricPromptApi28Impl biometricPromptApi28Impl, long j2) {
        C13706o.m87929f(atomicBoolean, "$finalTaskExecuted");
        C13706o.m87929f(set, "$successList");
        C13706o.m87929f(biometricPromptApi28Impl, "this$0");
        atomicBoolean.set(true);
        BiometricAuthentication.INSTANCE.cancelAuthentication();
        if (!set.isEmpty()) {
            C12114c.f58379a.mo68306h(new C12045b(biometricPromptApi28Impl, j2, set), j);
        } else if (!biometricPromptApi28Impl.hasPrimaryFinished()) {
            biometricPromptApi28Impl.showSystemUi(biometricPromptApi28Impl.biometricPrompt);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: startAuth$lambda-10$lambda-9  reason: not valid java name */
    public static final void m101313startAuth$lambda10$lambda9(BiometricPromptApi28Impl biometricPromptApi28Impl, long j, Set set) {
        C13706o.m87929f(biometricPromptApi28Impl, "this$0");
        C13706o.m87929f(set, "$successList");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        FragmentActivity context = biometricPromptApi28Impl.getBuilder().getContext();
        C12114c cVar = C12114c.f58379a;
        biometricPromptApi28Impl.showSystemUi(new BiometricPrompt(context, cVar.mo68303d(), (BiometricPrompt.AuthenticationCallback) new BiometricPromptApi28Impl$startAuth$finalTask$1$1$1(biometricPromptApi28Impl, atomicBoolean, set)));
        cVar.mo68306h(new C12064g(atomicBoolean, biometricPromptApi28Impl, set), j);
    }

    /* access modifiers changed from: private */
    /* renamed from: startAuth$lambda-10$lambda-9$lambda-8  reason: not valid java name */
    public static final void m101314startAuth$lambda10$lambda9$lambda8(AtomicBoolean atomicBoolean, BiometricPromptApi28Impl biometricPromptApi28Impl, Set set) {
        C13706o.m87929f(atomicBoolean, "$dialogClosed");
        C13706o.m87929f(biometricPromptApi28Impl, "this$0");
        C13706o.m87929f(set, "$successList");
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            biometricPromptApi28Impl.stopAuth();
            BiometricPromptCompat.AuthenticationCallback authenticationCallback = biometricPromptApi28Impl.callback;
            if (authenticationCallback != null) {
                authenticationCallback.onSucceeded(set);
            }
        }
    }

    public void authenticate(BiometricPromptCompat.AuthenticationCallback authenticationCallback) {
        boolean z = true;
        BiometricLoggerImpl.INSTANCE.mo68217d("BiometricPromptApi28Impl.authenticate():");
        this.callback = authenticationCallback;
        onUiOpened();
        DevicesWithKnownBugs devicesWithKnownBugs = DevicesWithKnownBugs.INSTANCE;
        if (devicesWithKnownBugs.isMissedBiometricUI()) {
            BiometricPromptCompat.Builder builder2 = getBuilder();
            if (!this.isFingerprint.get() || !devicesWithKnownBugs.getHasUnderDisplayFingerprint()) {
                z = false;
            }
            BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl = new BiometricPromptCompatDialogImpl(builder2, this, z);
            this.dialog = biometricPromptCompatDialogImpl;
            biometricPromptCompatDialogImpl.showDialog();
            return;
        }
        startAuth();
    }

    public void cancelAuth() {
        BiometricPromptCompat.AuthenticationCallback authenticationCallback = this.callback;
        if (authenticationCallback != null) {
            authenticationCallback.onCanceled();
        }
    }

    public void cancelAuthentication() {
        BiometricLoggerImpl.INSTANCE.mo68217d("BiometricPromptApi28Impl.cancelAuthentication():");
        BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl = this.dialog;
        if (biometricPromptCompatDialogImpl == null) {
            stopAuth();
        } else if (biometricPromptCompatDialogImpl != null) {
            biometricPromptCompatDialogImpl.dismissDialog();
        }
        onUiClosed();
    }

    public final BiometricPrompt.AuthenticationCallback getAuthCallback() {
        return this.authCallback;
    }

    public BiometricPromptCompat.Builder getBuilder() {
        return this.builder;
    }

    public void onUiClosed() {
        BiometricPromptCompat.AuthenticationCallback authenticationCallback = this.callback;
        if (authenticationCallback != null) {
            authenticationCallback.onUIClosed();
        }
    }

    public void onUiOpened() {
        BiometricPromptCompat.AuthenticationCallback authenticationCallback = this.callback;
        if (authenticationCallback != null) {
            authenticationCallback.onUIOpened();
        }
    }

    public void startAuth() {
        BiometricLoggerImpl.INSTANCE.mo68217d("BiometricPromptApi28Impl.startAuth():");
        HashSet<BiometricType> allAvailableTypes = getBuilder().getAllAvailableTypes();
        ArrayList arrayList = new ArrayList();
        for (T next : allAvailableTypes) {
            if (((BiometricType) next) != BiometricType.BIOMETRIC_ANY) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            if (((BiometricType) next2) != BiometricType.BIOMETRIC_FINGERPRINT) {
                arrayList2.add(next2);
            }
        }
        if (!isSamsungWorkaroundRequired()) {
            if (!hasSecondaryFinished()) {
                HashSet hashSet = new HashSet(getBuilder().getSecondaryAvailableTypes());
                if (true ^ hashSet.isEmpty()) {
                    BiometricAuthentication.INSTANCE.authenticate(getBuilder().getCryptographyPurpose(), (View) null, (List<? extends BiometricType>) new ArrayList(hashSet), this.fmAuthCallback);
                }
            }
            if (!hasPrimaryFinished()) {
                showSystemUi(this.biometricPrompt);
                return;
            }
            return;
        }
        long integer = (long) getBuilder().getContext().getResources().getInteger(17694722);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        BiometricAuthentication.INSTANCE.authenticate(getBuilder().getCryptographyPurpose(), (View) null, (List<? extends BiometricType>) new ArrayList(arrayList2), (BiometricAuthenticationListener) new BiometricPromptApi28Impl$startAuth$1(linkedHashSet));
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C12065h hVar = new C12065h(atomicBoolean, linkedHashSet, integer, this, 1500);
        long j = integer;
        BiometricPromptApi28Impl$startAuth$resultCheckTask$1 biometricPromptApi28Impl$startAuth$resultCheckTask$1 = new BiometricPromptApi28Impl$startAuth$resultCheckTask$1(atomicBoolean, linkedHashSet, hVar, j);
        C12114c cVar = C12114c.f58379a;
        cVar.mo68306h(hVar, 1500);
        cVar.mo68306h(biometricPromptApi28Impl$startAuth$resultCheckTask$1, j);
    }

    public void stopAuth() {
        C13339u uVar;
        BiometricLoggerImpl.INSTANCE.mo68217d("BiometricPromptApi28Impl.stopAuth():");
        BiometricAuthentication.INSTANCE.cancelAuthentication();
        BiometricFragment biometricFragment2 = this.biometricFragment.get();
        if (biometricFragment2 != null) {
            CancellationHelper.INSTANCE.forceCancel(biometricFragment2);
            uVar = C13339u.f61331a;
        } else {
            uVar = null;
        }
        if (uVar == null) {
            this.biometricPrompt.cancelAuthentication();
        }
        this.biometricFragment.set((Object) null);
    }
}

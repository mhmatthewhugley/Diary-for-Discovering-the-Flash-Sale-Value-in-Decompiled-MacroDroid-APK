package dev.skomlach.biometric.compat;

import android.view.Window;
import androidx.biometric.C0265R;
import androidx.fragment.app.FragmentActivity;
import dev.skomlach.biometric.compat.BiometricPromptCompat;
import dev.skomlach.biometric.compat.crypto.CryptographyManager;
import dev.skomlach.biometric.compat.utils.DialogMainColor;
import dev.skomlach.biometric.compat.utils.HardwareAccessImpl;
import dev.skomlach.biometric.compat.utils.activityView.ActivityViewWatcher;
import dev.skomlach.biometric.compat.utils.device.DeviceInfoManager;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.biometric.compat.utils.notification.BiometricNotificationManager;
import dev.skomlach.biometric.compat.utils.statusbar.StatusBarTools;
import dev.skomlach.biometric.compat.utils.themes.DarkLightThemes;
import dev.skomlach.common.misc.C12114c;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, mo71668d2 = {"dev/skomlach/biometric/compat/BiometricPromptCompat$startAuth$1$callback$1", "Ldev/skomlach/biometric/compat/BiometricPromptCompat$AuthenticationCallback;", "", "Ldev/skomlach/biometric/compat/AuthenticationResult;", "result", "Lja/u;", "onSucceeded", "onCanceled", "Ldev/skomlach/biometric/compat/AuthenticationFailureReason;", "reason", "", "description", "onFailed", "onUIOpened", "onUIClosed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isOpened", "Ljava/util/concurrent/atomic/AtomicBoolean;", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricPromptCompat.kt */
public final class BiometricPromptCompat$startAuth$1$callback$1 extends BiometricPromptCompat.AuthenticationCallback {
    final /* synthetic */ ActivityViewWatcher $activityViewWatcher;
    final /* synthetic */ BiometricPromptCompat.AuthenticationCallback $callbackOuter;
    private AtomicBoolean isOpened = new AtomicBoolean(false);
    final /* synthetic */ BiometricPromptCompat this$0;

    @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: BiometricPromptCompat.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuthenticationFailureReason.values().length];
            iArr[AuthenticationFailureReason.LOCKED_OUT.ordinal()] = 1;
            iArr[AuthenticationFailureReason.NO_HARDWARE.ordinal()] = 2;
            iArr[AuthenticationFailureReason.NO_BIOMETRICS_REGISTERED.ordinal()] = 3;
            iArr[AuthenticationFailureReason.HARDWARE_UNAVAILABLE.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    BiometricPromptCompat$startAuth$1$callback$1(BiometricPromptCompat biometricPromptCompat, BiometricPromptCompat.AuthenticationCallback authenticationCallback, ActivityViewWatcher activityViewWatcher) {
        this.this$0 = biometricPromptCompat;
        this.$callbackOuter = authenticationCallback;
        this.$activityViewWatcher = activityViewWatcher;
    }

    /* access modifiers changed from: private */
    /* renamed from: onUIClosed$lambda-2  reason: not valid java name */
    public static final void m101300onUIClosed$lambda2(BiometricPromptCompat biometricPromptCompat, ActivityViewWatcher activityViewWatcher) {
        C13706o.m87929f(biometricPromptCompat, "this$0");
        if (DeviceInfoManager.INSTANCE.hasUnderDisplayFingerprint(BiometricPromptCompat.Companion.getDeviceInfo()) && biometricPromptCompat.builder.isNotificationEnabled()) {
            BiometricNotificationManager.INSTANCE.dismissAll();
        }
        if (activityViewWatcher != null) {
            activityViewWatcher.resetListeners();
        }
        StatusBarTools statusBarTools = StatusBarTools.INSTANCE;
        Window window = biometricPromptCompat.builder.getContext().getWindow();
        C13706o.m87928e(window, "builder.getContext().window");
        statusBarTools.setNavBarAndStatusBarColors(window, biometricPromptCompat.builder.getNavBarColor(), biometricPromptCompat.builder.getDividerColor(), biometricPromptCompat.builder.getStatusBarColor());
    }

    public void onCanceled() {
        BiometricLoggerImpl.INSTANCE.mo68217d("BiometricPromptCompat.AuthenticationCallback.onCanceled");
        try {
            this.$callbackOuter.onCanceled();
        } finally {
            onUIClosed();
        }
    }

    public void onFailed(AuthenticationFailureReason authenticationFailureReason, CharSequence charSequence) {
        int i;
        String str;
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        biometricLoggerImpl.mo68217d("BiometricPromptCompat.AuthenticationCallback.onFailed=" + authenticationFailureReason);
        if (charSequence == null) {
            if (authenticationFailureReason == null) {
                i = -1;
            } else {
                try {
                    i = WhenMappings.$EnumSwitchMapping$0[authenticationFailureReason.ordinal()];
                } catch (Throwable th) {
                    onUIClosed();
                    throw th;
                }
            }
            if (i == 1) {
                str = this.this$0.appContext.getString(C0265R.string.fingerprint_error_lockout);
            } else if (i == 2) {
                str = this.this$0.appContext.getString(C0265R.string.fingerprint_error_hw_not_present);
            } else if (i == 3) {
                str = this.this$0.appContext.getString(C0265R.string.fingerprint_error_no_fingerprints);
            } else if (i != 4) {
                str = null;
            } else {
                str = this.this$0.appContext.getString(C0265R.string.fingerprint_error_hw_not_available);
            }
            this.$callbackOuter.onFailed(authenticationFailureReason, str);
        } else {
            this.$callbackOuter.onFailed(authenticationFailureReason, charSequence);
        }
        onUIClosed();
    }

    public void onSucceeded(Set<AuthenticationResult> set) {
        C13706o.m87929f(set, "result");
        Set<AuthenticationResult> J0 = C13566b0.m87406J0(set);
        try {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            biometricLoggerImpl.mo68217d("BiometricPromptCompat.AuthenticationCallback.onSucceeded1 = " + J0);
            if (this.this$0.builder.shouldAutoVerifyCryptoAfterSuccess()) {
                CryptographyManager cryptographyManager = CryptographyManager.INSTANCE;
                String packageName = this.this$0.appContext.getPackageName();
                C13706o.m87928e(packageName, "appContext.packageName");
                Charset forName = Charset.forName("UTF-8");
                C13706o.m87928e(forName, "forName(\"UTF-8\")");
                byte[] bytes = packageName.getBytes(forName);
                C13706o.m87928e(bytes, "this as java.lang.String).getBytes(charset)");
                if (cryptographyManager.encryptData(bytes, J0) == null) {
                    onCanceled();
                    return;
                }
                ArrayList arrayList = new ArrayList(C13616u.m87774u(J0, 10));
                for (AuthenticationResult confirmed : J0) {
                    arrayList.add(new AuthenticationResult(confirmed.getConfirmed(), (BiometricCryptoObject) null, 2, (C13695i) null));
                }
                J0.clear();
                J0.addAll(arrayList);
            }
            BiometricLoggerImpl biometricLoggerImpl2 = BiometricLoggerImpl.INSTANCE;
            biometricLoggerImpl2.mo68217d("BiometricPromptCompat.AuthenticationCallback.onSucceeded2 = " + J0);
            if (this.this$0.builder.getBiometricAuthRequest().getApi() != BiometricApi.AUTO) {
                HardwareAccessImpl.Companion.getInstance(this.this$0.builder.getBiometricAuthRequest()).updateBiometricEnrollChanged();
            } else {
                HardwareAccessImpl.Companion companion = HardwareAccessImpl.Companion;
                companion.getInstance(new BiometricAuthRequest(BiometricApi.BIOMETRIC_API, this.this$0.builder.getBiometricAuthRequest().getType(), (BiometricConfirmation) null, 4, (C13695i) null)).updateBiometricEnrollChanged();
                companion.getInstance(new BiometricAuthRequest(BiometricApi.LEGACY_API, this.this$0.builder.getBiometricAuthRequest().getType(), (BiometricConfirmation) null, 4, (C13695i) null)).updateBiometricEnrollChanged();
            }
            this.$callbackOuter.onSucceeded(C13566b0.m87407K0(J0));
            onUIClosed();
        } finally {
            onUIClosed();
        }
    }

    public void onUIClosed() {
        BiometricLoggerImpl.INSTANCE.mo68217d("BiometricPromptCompat.AuthenticationCallback.onUIClosed");
        if (this.isOpened.get()) {
            this.isOpened.set(false);
            C12042i iVar = new C12042i(this.this$0, this.$activityViewWatcher);
            C12114c cVar = C12114c.f58379a;
            cVar.mo68305g(iVar);
            cVar.mo68306h(iVar, (long) this.this$0.appContext.getResources().getInteger(17694722));
            this.$callbackOuter.onUIClosed();
            Runnable access$getStopWatcher$p = this.this$0.stopWatcher;
            if (access$getStopWatcher$p != null) {
                access$getStopWatcher$p.run();
            }
            this.this$0.stopWatcher = null;
            try {
                this.this$0.getImpl().getBuilder().getContext().getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this.this$0.fragmentLifecycleCallbacks);
            } catch (Throwable unused) {
            }
            BiometricPromptCompat.authFlowInProgress.set(false);
        }
    }

    public void onUIOpened() {
        BiometricLoggerImpl.INSTANCE.mo68217d("BiometricPromptCompat.AuthenticationCallback.onUIOpened");
        if (!this.isOpened.get()) {
            this.isOpened.set(true);
            this.$callbackOuter.onUIOpened();
            if (DeviceInfoManager.INSTANCE.hasUnderDisplayFingerprint(BiometricPromptCompat.Companion.getDeviceInfo()) && this.this$0.builder.isNotificationEnabled()) {
                BiometricNotificationManager.INSTANCE.showNotification(this.this$0.builder);
            }
            StatusBarTools statusBarTools = StatusBarTools.INSTANCE;
            Window window = this.this$0.builder.getContext().getWindow();
            C13706o.m87928e(window, "builder.getContext().window");
            DialogMainColor dialogMainColor = DialogMainColor.INSTANCE;
            FragmentActivity context = this.this$0.builder.getContext();
            DarkLightThemes darkLightThemes = DarkLightThemes.INSTANCE;
            statusBarTools.setNavBarAndStatusBarColors(window, dialogMainColor.getColor(context, darkLightThemes.isNightModeCompatWithInscreen(this.this$0.builder.getContext())), dialogMainColor.getColor(this.this$0.builder.getContext(), true ^ darkLightThemes.isNightModeCompatWithInscreen(this.this$0.builder.getContext())), this.this$0.builder.getStatusBarColor());
            ActivityViewWatcher activityViewWatcher = this.$activityViewWatcher;
            if (activityViewWatcher != null) {
                activityViewWatcher.setupListeners();
            }
        }
    }
}

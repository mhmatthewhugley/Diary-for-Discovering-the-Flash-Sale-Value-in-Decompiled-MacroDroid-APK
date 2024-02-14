package dev.skomlach.biometric.compat.engine.internal.face.facelock;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.view.View;
import androidx.core.p007os.CancellationSignal;
import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.BiometricCryptoObject;
import dev.skomlach.biometric.compat.engine.BiometricInitListener;
import dev.skomlach.biometric.compat.engine.BiometricMethod;
import dev.skomlach.biometric.compat.engine.core.Core;
import dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener;
import dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate;
import dev.skomlach.biometric.compat.engine.internal.AbstractBiometricModule;
import dev.skomlach.biometric.compat.utils.LockType;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.Set;
import javax.crypto.Cipher;
import kotlin.Metadata;
import org.apache.commons.cli.HelpFormatter;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001+B\u0011\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b)\u0010*J\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0002R\u00020\u0000H\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J0\u0010\u0014\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\b\u0018\u00010\u0002R\u00020\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010\"\u001a\u00020\n8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010$R\u0014\u0010(\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010$¨\u0006,"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FacelockOldModule;", "Ldev/skomlach/biometric/compat/engine/internal/AbstractBiometricModule;", "Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FacelockOldModule$ProxyListener;", "proxyListener", "Lja/u;", "authorize", "stopAuth", "", "", "getManagers", "", "hasEnrolled", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "authenticate", "Landroid/view/View;", "targetView", "setCallerView", "Ldev/skomlach/biometric/compat/engine/BiometricInitListener;", "Ldev/skomlach/biometric/compat/engine/BiometricInitListener;", "Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FaceLockHelper;", "faceLockHelper", "Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FaceLockHelper;", "facelockProxyListener", "Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FacelockOldModule$ProxyListener;", "Ljava/lang/ref/WeakReference;", "viewWeakReference", "Ljava/lang/ref/WeakReference;", "isManagerAccessible", "Z", "()Z", "setManagerAccessible", "(Z)V", "isUserAuthCanByUsedWithCrypto", "isHardwarePresent", "<init>", "(Ldev/skomlach/biometric/compat/engine/BiometricInitListener;)V", "ProxyListener", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: FacelockOldModule.kt */
public final class FacelockOldModule extends AbstractBiometricModule {
    /* access modifiers changed from: private */
    public FaceLockHelper faceLockHelper = new FaceLockHelper(new FacelockOldModule$faceLockInterface$1(this));
    /* access modifiers changed from: private */
    public ProxyListener facelockProxyListener;
    private boolean isManagerAccessible;
    /* access modifiers changed from: private */
    public BiometricInitListener listener;
    /* access modifiers changed from: private */
    public WeakReference<View> viewWeakReference = new WeakReference<>((Object) null);

    @Metadata(mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000eJ\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FacelockOldModule$ProxyListener;", "", "biometricCryptoObject", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "restartPredicate", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "cancellationSignal", "Landroidx/core/os/CancellationSignal;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "(Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FacelockOldModule;Ldev/skomlach/biometric/compat/BiometricCryptoObject;Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;Landroidx/core/os/CancellationSignal;Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;)V", "errorTs", "", "skipTimeout", "", "onAuthenticationAcquired", "Ljava/lang/Void;", "acquireInfo", "onAuthenticationError", "errMsgId", "errString", "", "onAuthenticationFailed", "onAuthenticationHelp", "helpMsgId", "helpString", "onAuthenticationSucceeded", "result", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: FacelockOldModule.kt */
    public final class ProxyListener {
        private final BiometricCryptoObject biometricCryptoObject;
        private final CancellationSignal cancellationSignal;
        private long errorTs = System.currentTimeMillis();
        private final AuthenticationListener listener;
        private final RestartPredicate restartPredicate;
        private final int skipTimeout;

        public ProxyListener(BiometricCryptoObject biometricCryptoObject2, RestartPredicate restartPredicate2, CancellationSignal cancellationSignal2, AuthenticationListener authenticationListener) {
            this.biometricCryptoObject = biometricCryptoObject2;
            this.restartPredicate = restartPredicate2;
            this.cancellationSignal = cancellationSignal2;
            this.listener = authenticationListener;
            this.skipTimeout = FacelockOldModule.this.getContext().getResources().getInteger(17694720);
        }

        public final Void onAuthenticationAcquired(int i) {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = FacelockOldModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationAcquired " + i);
            return null;
        }

        public final Void onAuthenticationError(int i, CharSequence charSequence) {
            AuthenticationFailureReason authenticationFailureReason;
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = FacelockOldModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationError: " + i + HelpFormatter.DEFAULT_OPT_PREFIX + charSequence);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs <= ((long) this.skipTimeout)) {
                return null;
            }
            this.errorTs = currentTimeMillis;
            AuthenticationFailureReason authenticationFailureReason2 = AuthenticationFailureReason.UNKNOWN;
            switch (i) {
                case 1:
                case 2:
                case 3:
                    authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
                    break;
                case 4:
                    authenticationFailureReason = AuthenticationFailureReason.NO_BIOMETRICS_REGISTERED;
                    break;
                case 6:
                    authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
                    break;
                case 7:
                    authenticationFailureReason = AuthenticationFailureReason.AUTHENTICATION_FAILED;
                    break;
                case 8:
                    authenticationFailureReason = AuthenticationFailureReason.TIMEOUT;
                    break;
                default:
                    Core.INSTANCE.cancelAuthentication(FacelockOldModule.this);
                    AuthenticationListener authenticationListener = this.listener;
                    if (authenticationListener != null) {
                        authenticationListener.onCanceled(FacelockOldModule.this.tag());
                        break;
                    }
                    break;
            }
            if (FacelockOldModule.this.restartCauseTimeout(authenticationFailureReason)) {
                FacelockOldModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
            } else {
                if (authenticationFailureReason != AuthenticationFailureReason.TIMEOUT) {
                    RestartPredicate restartPredicate2 = this.restartPredicate;
                    if (!(restartPredicate2 != null && restartPredicate2.invoke(authenticationFailureReason))) {
                        if (C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, AuthenticationFailureReason.AUTHENTICATION_FAILED).contains(authenticationFailureReason)) {
                            FacelockOldModule.this.lockout();
                            authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                        }
                        AuthenticationListener authenticationListener2 = this.listener;
                        if (authenticationListener2 != null) {
                            authenticationListener2.onFailure(authenticationFailureReason, FacelockOldModule.this.tag());
                        }
                    }
                }
                AuthenticationListener authenticationListener3 = this.listener;
                if (authenticationListener3 != null) {
                    authenticationListener3.onFailure(authenticationFailureReason, FacelockOldModule.this.tag());
                }
                FacelockOldModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
            }
            return null;
        }

        public final Void onAuthenticationFailed() {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = FacelockOldModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationFailed");
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs <= ((long) this.skipTimeout)) {
                return null;
            }
            this.errorTs = currentTimeMillis;
            AuthenticationListener authenticationListener = this.listener;
            if (authenticationListener != null) {
                authenticationListener.onFailure(AuthenticationFailureReason.AUTHENTICATION_FAILED, FacelockOldModule.this.tag());
            }
            return null;
        }

        public final Void onAuthenticationHelp(int i, CharSequence charSequence) {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = FacelockOldModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationError: " + i + HelpFormatter.DEFAULT_OPT_PREFIX + charSequence);
            return null;
        }

        public final Void onAuthenticationSucceeded(Object obj) {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = FacelockOldModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationSucceeded " + obj);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs <= ((long) this.skipTimeout)) {
                return null;
            }
            this.errorTs = currentTimeMillis;
            AuthenticationListener authenticationListener = this.listener;
            if (authenticationListener != null) {
                int tag = FacelockOldModule.this.tag();
                BiometricCryptoObject biometricCryptoObject2 = this.biometricCryptoObject;
                Signature signature = biometricCryptoObject2 != null ? biometricCryptoObject2.getSignature() : null;
                BiometricCryptoObject biometricCryptoObject3 = this.biometricCryptoObject;
                Cipher cipher = biometricCryptoObject3 != null ? biometricCryptoObject3.getCipher() : null;
                BiometricCryptoObject biometricCryptoObject4 = this.biometricCryptoObject;
                authenticationListener.onSuccess(tag, new BiometricCryptoObject(signature, cipher, biometricCryptoObject4 != null ? biometricCryptoObject4.getMac() : null));
            }
            return null;
        }
    }

    public FacelockOldModule(BiometricInitListener biometricInitListener) {
        super(BiometricMethod.FACELOCK);
        this.listener = biometricInitListener;
        if (!isHardwarePresent()) {
            BiometricInitListener biometricInitListener2 = this.listener;
            if (biometricInitListener2 != null) {
                if (biometricInitListener2 != null) {
                    biometricInitListener2.initFinished(getBiometricMethod(), this);
                }
                this.listener = null;
                return;
            }
            return;
        }
        FaceLockHelper faceLockHelper2 = this.faceLockHelper;
        if (faceLockHelper2 != null) {
            faceLockHelper2.initFacelock();
        }
    }

    private final void authorize(ProxyListener proxyListener) {
        this.facelockProxyListener = proxyListener;
        FaceLockHelper faceLockHelper2 = this.faceLockHelper;
        if (faceLockHelper2 != null) {
            faceLockHelper2.stopFaceLock();
        }
        FaceLockHelper faceLockHelper3 = this.faceLockHelper;
        if (faceLockHelper3 != null) {
            faceLockHelper3.initFacelock();
        }
    }

    public void authenticate(BiometricCryptoObject biometricCryptoObject, CancellationSignal cancellationSignal, AuthenticationListener authenticationListener, RestartPredicate restartPredicate) throws SecurityException {
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String name = getName();
        BiometricMethod biometricMethod = getBiometricMethod();
        biometricLoggerImpl.mo68217d(name + ".authenticate - " + biometricMethod + "; Crypto=" + biometricCryptoObject);
        try {
            String name2 = getName();
            biometricLoggerImpl.mo68217d(name2 + ": Facelock call authorize");
            authorize(new ProxyListener(biometricCryptoObject, restartPredicate, cancellationSignal, authenticationListener));
        } catch (Throwable th) {
            BiometricLoggerImpl biometricLoggerImpl2 = BiometricLoggerImpl.INSTANCE;
            String name3 = getName();
            biometricLoggerImpl2.mo68219e(th, name3 + ": authenticate failed unexpectedly");
            if (authenticationListener != null) {
                authenticationListener.onFailure(AuthenticationFailureReason.UNKNOWN, tag());
            }
        }
    }

    public Set<Object> getManagers() {
        return C13627z0.m87806d();
    }

    public boolean hasEnrolled() throws SecurityException {
        return LockType.INSTANCE.isBiometricWeakEnabled(getContext());
    }

    public boolean isHardwarePresent() {
        FaceLockHelper faceLockHelper2 = this.faceLockHelper;
        boolean z = true;
        if ((faceLockHelper2 != null && !faceLockHelper2.faceUnlockAvailable()) || !getContext().getPackageManager().hasSystemFeature("android.hardware.camera.front")) {
            return false;
        }
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) getContext().getSystemService("device_policy");
        if (devicePolicyManager == null || !devicePolicyManager.getCameraDisabled((ComponentName) null)) {
            z = false;
        }
        if (z) {
            return false;
        }
        return hasEnrolled();
    }

    public boolean isManagerAccessible() {
        return this.isManagerAccessible;
    }

    public boolean isUserAuthCanByUsedWithCrypto() {
        return false;
    }

    public final void setCallerView(View view) {
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String name = getName();
        biometricLoggerImpl.mo68217d(name + ".setCallerView: " + view);
        this.viewWeakReference = new WeakReference<>(view);
    }

    public void setManagerAccessible(boolean z) {
        this.isManagerAccessible = z;
    }

    public final void stopAuth() {
        FaceLockHelper faceLockHelper2 = this.faceLockHelper;
        if (faceLockHelper2 != null) {
            faceLockHelper2.stopFaceLock();
        }
        FaceLockHelper faceLockHelper3 = this.faceLockHelper;
        if (faceLockHelper3 != null) {
            faceLockHelper3.destroy();
        }
    }
}

package dev.skomlach.biometric.compat.engine.internal.face.miui;

import androidx.core.p007os.CancellationSignal;
import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.BiometricCryptoObject;
import dev.skomlach.biometric.compat.engine.BiometricInitListener;
import dev.skomlach.biometric.compat.engine.BiometricMethod;
import dev.skomlach.biometric.compat.engine.core.Core;
import dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener;
import dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate;
import dev.skomlach.biometric.compat.engine.internal.AbstractBiometricModule;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.IMiuiFaceManager;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.MiuiFaceFactory;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miuiface;
import dev.skomlach.biometric.compat.utils.BiometricErrorLockoutPermanentFix;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.misc.C12114c;
import java.security.Signature;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.Metadata;
import org.apache.commons.cli.HelpFormatter;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001bB\u0013\b\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J0\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u001c"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/MiuiFaceUnlockModule;", "Ldev/skomlach/biometric/compat/engine/internal/AbstractBiometricModule;", "", "", "getManagers", "", "hasEnrolled", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Lja/u;", "authenticate", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager;", "manager", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager;", "isUserAuthCanByUsedWithCrypto", "()Z", "isManagerAccessible", "isHardwarePresent", "Ldev/skomlach/biometric/compat/engine/BiometricInitListener;", "<init>", "(Ldev/skomlach/biometric/compat/engine/BiometricInitListener;)V", "AuthCallback", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: MiuiFaceUnlockModule.kt */
public final class MiuiFaceUnlockModule extends AbstractBiometricModule {
    /* access modifiers changed from: private */
    public IMiuiFaceManager manager;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b \u0010!J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/MiuiFaceUnlockModule$AuthCallback;", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$AuthenticationCallback;", "", "errMsgId", "", "errString", "Lja/u;", "onAuthenticationError", "helpMsgId", "helpString", "onAuthenticationHelp", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miuiface;", "miuiface", "onAuthenticationSucceeded", "onAuthenticationFailed", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Landroidx/core/os/CancellationSignal;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "", "errorTs", "J", "skipTimeout", "I", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/face/miui/MiuiFaceUnlockModule;Ldev/skomlach/biometric/compat/BiometricCryptoObject;Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;Landroidx/core/os/CancellationSignal;Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: MiuiFaceUnlockModule.kt */
    public final class AuthCallback extends IMiuiFaceManager.AuthenticationCallback {
        private final BiometricCryptoObject biometricCryptoObject;
        private final CancellationSignal cancellationSignal;
        private long errorTs = System.currentTimeMillis();
        private final AuthenticationListener listener;
        private final RestartPredicate restartPredicate;
        private final int skipTimeout;

        public AuthCallback(BiometricCryptoObject biometricCryptoObject2, RestartPredicate restartPredicate2, CancellationSignal cancellationSignal2, AuthenticationListener authenticationListener) {
            this.biometricCryptoObject = biometricCryptoObject2;
            this.restartPredicate = restartPredicate2;
            this.cancellationSignal = cancellationSignal2;
            this.listener = authenticationListener;
            this.skipTimeout = MiuiFaceUnlockModule.this.getContext().getResources().getInteger(17694720);
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
            AuthenticationFailureReason authenticationFailureReason;
            IMiuiFaceManager access$getManager$p;
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            boolean z = true;
            String name = MiuiFaceUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationError: " + i + HelpFormatter.DEFAULT_OPT_PREFIX + charSequence);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationFailureReason authenticationFailureReason2 = AuthenticationFailureReason.UNKNOWN;
                if (i == 1) {
                    authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
                } else if (i == 2) {
                    authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
                } else if (i == 3) {
                    authenticationFailureReason = AuthenticationFailureReason.TIMEOUT;
                } else if (i == 4) {
                    authenticationFailureReason = AuthenticationFailureReason.SENSOR_FAILED;
                } else if (i == 7) {
                    MiuiFaceUnlockModule.this.lockout();
                    authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                } else if (i == 9) {
                    BiometricErrorLockoutPermanentFix.INSTANCE.setBiometricSensorPermanentlyLocked(MiuiFaceUnlockModule.this.getBiometricMethod().getBiometricType());
                    authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
                } else if (i == 11) {
                    authenticationFailureReason = AuthenticationFailureReason.NO_BIOMETRICS_REGISTERED;
                } else if (i != 12) {
                    Core.INSTANCE.cancelAuthentication(MiuiFaceUnlockModule.this);
                    AuthenticationListener authenticationListener = this.listener;
                    if (authenticationListener != null) {
                        authenticationListener.onCanceled(MiuiFaceUnlockModule.this.tag());
                        return;
                    }
                    return;
                } else {
                    authenticationFailureReason = AuthenticationFailureReason.NO_HARDWARE;
                }
                if (MiuiFaceUnlockModule.this.restartCauseTimeout(authenticationFailureReason)) {
                    MiuiFaceUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                if (authenticationFailureReason != AuthenticationFailureReason.TIMEOUT) {
                    RestartPredicate restartPredicate2 = this.restartPredicate;
                    if (!(restartPredicate2 != null && restartPredicate2.invoke(authenticationFailureReason))) {
                        if (C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, AuthenticationFailureReason.AUTHENTICATION_FAILED).contains(authenticationFailureReason)) {
                            MiuiFaceUnlockModule.this.lockout();
                            authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                        }
                        AuthenticationListener authenticationListener2 = this.listener;
                        if (authenticationListener2 != null) {
                            authenticationListener2.onFailure(authenticationFailureReason, MiuiFaceUnlockModule.this.tag());
                        }
                        IMiuiFaceManager access$getManager$p2 = MiuiFaceUnlockModule.this.manager;
                        if (access$getManager$p2 == null || access$getManager$p2.isReleased()) {
                            z = false;
                        }
                        if (z && (access$getManager$p = MiuiFaceUnlockModule.this.manager) != null) {
                            access$getManager$p.release();
                            return;
                        }
                        return;
                    }
                }
                AuthenticationListener authenticationListener3 = this.listener;
                if (authenticationListener3 != null) {
                    authenticationListener3.onFailure(authenticationFailureReason, MiuiFaceUnlockModule.this.tag());
                }
                MiuiFaceUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
            }
        }

        public void onAuthenticationFailed() {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = MiuiFaceUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationFailed: ");
            AuthenticationListener authenticationListener = this.listener;
            if (authenticationListener != null) {
                authenticationListener.onFailure(AuthenticationFailureReason.TIMEOUT, MiuiFaceUnlockModule.this.tag());
            }
            MiuiFaceUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = MiuiFaceUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationHelp: " + i + HelpFormatter.DEFAULT_OPT_PREFIX + charSequence);
            AuthenticationListener authenticationListener = this.listener;
            if (authenticationListener != null) {
                authenticationListener.onHelp(charSequence);
            }
        }

        public void onAuthenticationSucceeded(Miuiface miuiface) {
            IMiuiFaceManager access$getManager$p;
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            boolean z = true;
            String name = MiuiFaceUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationSucceeded: " + miuiface);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationListener authenticationListener = this.listener;
                if (authenticationListener != null) {
                    int tag = MiuiFaceUnlockModule.this.tag();
                    BiometricCryptoObject biometricCryptoObject2 = this.biometricCryptoObject;
                    Mac mac = null;
                    Signature signature = biometricCryptoObject2 != null ? biometricCryptoObject2.getSignature() : null;
                    BiometricCryptoObject biometricCryptoObject3 = this.biometricCryptoObject;
                    Cipher cipher = biometricCryptoObject3 != null ? biometricCryptoObject3.getCipher() : null;
                    BiometricCryptoObject biometricCryptoObject4 = this.biometricCryptoObject;
                    if (biometricCryptoObject4 != null) {
                        mac = biometricCryptoObject4.getMac();
                    }
                    authenticationListener.onSuccess(tag, new BiometricCryptoObject(signature, cipher, mac));
                }
                IMiuiFaceManager access$getManager$p2 = MiuiFaceUnlockModule.this.manager;
                if (access$getManager$p2 == null || access$getManager$p2.isReleased()) {
                    z = false;
                }
                if (z && (access$getManager$p = MiuiFaceUnlockModule.this.manager) != null) {
                    access$getManager$p.release();
                }
            }
        }
    }

    public MiuiFaceUnlockModule(BiometricInitListener biometricInitListener) {
        super(BiometricMethod.FACE_MIUI);
        try {
            IMiuiFaceManager faceManager = MiuiFaceFactory.INSTANCE.getFaceManager(2);
            this.manager = faceManager;
            if (!(faceManager != null && !faceManager.isFaceFeatureSupport())) {
                IMiuiFaceManager iMiuiFaceManager = this.manager;
                if (iMiuiFaceManager != null) {
                    iMiuiFaceManager.isFaceFeatureSupport();
                }
                IMiuiFaceManager iMiuiFaceManager2 = this.manager;
                if (iMiuiFaceManager2 != null) {
                    iMiuiFaceManager2.getEnrolledFaces();
                }
                BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
                IMiuiFaceManager iMiuiFaceManager3 = this.manager;
                biometricLoggerImpl.mo68220e("MiuiFaceUnlockModule - " + iMiuiFaceManager3);
                if (biometricInitListener != null) {
                    biometricInitListener.initFinished(getBiometricMethod(), this);
                    return;
                }
                return;
            }
            throw new RuntimeException("Miui 3DFace not supported");
        } catch (Throwable th) {
            if (AbstractBiometricModule.Companion.getDEBUG_MANAGERS()) {
                BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            }
            this.manager = null;
        }
    }

    public void authenticate(BiometricCryptoObject biometricCryptoObject, CancellationSignal cancellationSignal, AuthenticationListener authenticationListener, RestartPredicate restartPredicate) throws SecurityException {
        android.os.CancellationSignal cancellationSignal2;
        AuthenticationListener authenticationListener2 = authenticationListener;
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String name = getName();
        BiometricMethod biometricMethod = getBiometricMethod();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(".authenticate - ");
        sb.append(biometricMethod);
        sb.append("; Crypto=");
        BiometricCryptoObject biometricCryptoObject2 = biometricCryptoObject;
        sb.append(biometricCryptoObject);
        biometricLoggerImpl.mo68217d(sb.toString());
        IMiuiFaceManager iMiuiFaceManager = this.manager;
        if (iMiuiFaceManager != null) {
            try {
                AuthCallback authCallback = new AuthCallback(biometricCryptoObject, restartPredicate, cancellationSignal, authenticationListener);
                if (cancellationSignal == null) {
                    cancellationSignal2 = null;
                } else {
                    cancellationSignal2 = (android.os.CancellationSignal) cancellationSignal.getCancellationSignalObject();
                }
                if (cancellationSignal2 != null) {
                    if (!iMiuiFaceManager.isFaceUnlockInited()) {
                        iMiuiFaceManager.preInitAuthen();
                    }
                    iMiuiFaceManager.authenticate(cancellationSignal2, 0, authCallback, C12114c.f58379a.mo68304e(), (int) TimeUnit.SECONDS.toMillis(30));
                    return;
                }
                throw new IllegalArgumentException("CancellationSignal cann't be null");
            } catch (Throwable th) {
                BiometricLoggerImpl biometricLoggerImpl2 = BiometricLoggerImpl.INSTANCE;
                String name2 = getName();
                biometricLoggerImpl2.mo68219e(th, name2 + ": authenticate failed unexpectedly");
            }
        }
        if (authenticationListener2 != null) {
            authenticationListener.onFailure(AuthenticationFailureReason.UNKNOWN, tag());
        }
    }

    public Set<Object> getManagers() {
        HashSet hashSet = new HashSet();
        IMiuiFaceManager iMiuiFaceManager = this.manager;
        if (iMiuiFaceManager != null) {
            hashSet.add(iMiuiFaceManager);
        }
        return hashSet;
    }

    public boolean hasEnrolled() {
        List<Miuiface> enrolledFaces;
        try {
            IMiuiFaceManager iMiuiFaceManager = this.manager;
            if (!(iMiuiFaceManager != null && iMiuiFaceManager.isFaceFeatureSupport())) {
                return false;
            }
            IMiuiFaceManager iMiuiFaceManager2 = this.manager;
            return iMiuiFaceManager2 != null && (enrolledFaces = iMiuiFaceManager2.getEnrolledFaces()) != null && (enrolledFaces.isEmpty() ^ true);
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            return false;
        }
    }

    public boolean isHardwarePresent() {
        try {
            IMiuiFaceManager iMiuiFaceManager = this.manager;
            return iMiuiFaceManager != null && iMiuiFaceManager.isFaceFeatureSupport();
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            return false;
        }
    }

    public boolean isManagerAccessible() {
        return this.manager != null;
    }

    public boolean isUserAuthCanByUsedWithCrypto() {
        return false;
    }
}

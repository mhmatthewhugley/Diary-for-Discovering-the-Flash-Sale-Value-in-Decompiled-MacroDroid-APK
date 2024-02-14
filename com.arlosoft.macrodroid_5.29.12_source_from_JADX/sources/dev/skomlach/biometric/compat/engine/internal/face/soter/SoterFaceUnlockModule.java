package dev.skomlach.biometric.compat.engine.internal.face.soter;

import androidx.core.p007os.CancellationSignal;
import com.tencent.soter.core.biometric.BiometricManagerCompat;
import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.BiometricCryptoObject;
import dev.skomlach.biometric.compat.engine.BiometricInitListener;
import dev.skomlach.biometric.compat.engine.BiometricMethod;
import dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener;
import dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate;
import dev.skomlach.biometric.compat.engine.internal.AbstractBiometricModule;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.misc.C12114c;
import java.security.Signature;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.cli.HelpFormatter;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u001bB\u0013\b\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J0\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001c"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/soter/SoterFaceUnlockModule;", "Ldev/skomlach/biometric/compat/engine/internal/AbstractBiometricModule;", "", "", "getManagers", "", "hasEnrolled", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Lja/u;", "authenticate", "Ldev/skomlach/biometric/compat/engine/BiometricInitListener;", "Ldev/skomlach/biometric/compat/engine/BiometricInitListener;", "Lcom/tencent/soter/core/biometric/BiometricManagerCompat;", "manager", "Lcom/tencent/soter/core/biometric/BiometricManagerCompat;", "isManagerAccessible", "()Z", "isHardwarePresent", "<init>", "(Ldev/skomlach/biometric/compat/engine/BiometricInitListener;)V", "AuthCallback", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: SoterFaceUnlockModule.kt */
public final class SoterFaceUnlockModule extends AbstractBiometricModule {
    private final BiometricInitListener listener;
    private BiometricManagerCompat manager;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/soter/SoterFaceUnlockModule$AuthCallback;", "Lcom/tencent/soter/core/biometric/BiometricManagerCompat$AuthenticationCallback;", "", "errMsgId", "", "errString", "Lja/u;", "onAuthenticationError", "helpMsgId", "helpString", "onAuthenticationHelp", "Lcom/tencent/soter/core/biometric/BiometricManagerCompat$AuthenticationResult;", "result", "onAuthenticationSucceeded", "onAuthenticationFailed", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Landroidx/core/os/CancellationSignal;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "", "errorTs", "J", "skipTimeout", "I", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/face/soter/SoterFaceUnlockModule;Ldev/skomlach/biometric/compat/BiometricCryptoObject;Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;Landroidx/core/os/CancellationSignal;Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: SoterFaceUnlockModule.kt */
    public final class AuthCallback extends BiometricManagerCompat.AuthenticationCallback {
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
            this.skipTimeout = SoterFaceUnlockModule.this.getContext().getResources().getInteger(17694720);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0090  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onAuthenticationError(int r11, java.lang.CharSequence r12) {
            /*
                r10 = this;
                java.lang.String r0 = "errString"
                kotlin.jvm.internal.C13706o.m87929f(r12, r0)
                dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r0 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                dev.skomlach.biometric.compat.engine.internal.face.soter.SoterFaceUnlockModule r3 = dev.skomlach.biometric.compat.engine.internal.face.soter.SoterFaceUnlockModule.this
                java.lang.String r3 = r3.getName()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r3)
                java.lang.String r3 = ".onAuthenticationError: "
                r4.append(r3)
                r4.append(r11)
                java.lang.String r3 = "-"
                r4.append(r3)
                r4.append(r12)
                java.lang.String r12 = r4.toString()
                r3 = 0
                r2[r3] = r12
                r0.mo68217d(r2)
                long r4 = java.lang.System.currentTimeMillis()
                long r6 = r10.errorTs
                long r6 = r4 - r6
                int r12 = r10.skipTimeout
                long r8 = (long) r12
                int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r12 > 0) goto L_0x0042
                return
            L_0x0042:
                r10.errorTs = r4
                dev.skomlach.biometric.compat.AuthenticationFailureReason r12 = dev.skomlach.biometric.compat.AuthenticationFailureReason.UNKNOWN
                r12 = 2
                if (r11 == r1) goto L_0x0078
                if (r11 == r12) goto L_0x0075
                r0 = 3
                if (r11 == r0) goto L_0x0072
                r0 = 7
                if (r11 == r0) goto L_0x006a
                r0 = 8
                if (r11 == r0) goto L_0x0078
                dev.skomlach.biometric.compat.engine.core.Core r11 = dev.skomlach.biometric.compat.engine.core.Core.INSTANCE
                dev.skomlach.biometric.compat.engine.internal.face.soter.SoterFaceUnlockModule r12 = dev.skomlach.biometric.compat.engine.internal.face.soter.SoterFaceUnlockModule.this
                r11.cancelAuthentication(r12)
                dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener r11 = r10.listener
                if (r11 == 0) goto L_0x0069
                dev.skomlach.biometric.compat.engine.internal.face.soter.SoterFaceUnlockModule r12 = dev.skomlach.biometric.compat.engine.internal.face.soter.SoterFaceUnlockModule.this
                int r12 = r12.tag()
                r11.onCanceled(r12)
            L_0x0069:
                return
            L_0x006a:
                dev.skomlach.biometric.compat.engine.internal.face.soter.SoterFaceUnlockModule r11 = dev.skomlach.biometric.compat.engine.internal.face.soter.SoterFaceUnlockModule.this
                r11.lockout()
                dev.skomlach.biometric.compat.AuthenticationFailureReason r11 = dev.skomlach.biometric.compat.AuthenticationFailureReason.LOCKED_OUT
                goto L_0x007a
            L_0x0072:
                dev.skomlach.biometric.compat.AuthenticationFailureReason r11 = dev.skomlach.biometric.compat.AuthenticationFailureReason.TIMEOUT
                goto L_0x007a
            L_0x0075:
                dev.skomlach.biometric.compat.AuthenticationFailureReason r11 = dev.skomlach.biometric.compat.AuthenticationFailureReason.HARDWARE_UNAVAILABLE
                goto L_0x007a
            L_0x0078:
                dev.skomlach.biometric.compat.AuthenticationFailureReason r11 = dev.skomlach.biometric.compat.AuthenticationFailureReason.HARDWARE_UNAVAILABLE
            L_0x007a:
                dev.skomlach.biometric.compat.engine.internal.face.soter.SoterFaceUnlockModule r0 = dev.skomlach.biometric.compat.engine.internal.face.soter.SoterFaceUnlockModule.this
                boolean r0 = r0.restartCauseTimeout(r11)
                if (r0 == 0) goto L_0x0090
                dev.skomlach.biometric.compat.engine.internal.face.soter.SoterFaceUnlockModule r11 = dev.skomlach.biometric.compat.engine.internal.face.soter.SoterFaceUnlockModule.this
                dev.skomlach.biometric.compat.BiometricCryptoObject r12 = r10.biometricCryptoObject
                androidx.core.os.CancellationSignal r0 = r10.cancellationSignal
                dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener r1 = r10.listener
                dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate r2 = r10.restartPredicate
                r11.authenticate(r12, r0, r1, r2)
                goto L_0x00e7
            L_0x0090:
                dev.skomlach.biometric.compat.AuthenticationFailureReason r0 = dev.skomlach.biometric.compat.AuthenticationFailureReason.TIMEOUT
                if (r11 == r0) goto L_0x00cd
                dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate r0 = r10.restartPredicate
                if (r0 == 0) goto L_0x00a0
                boolean r0 = r0.invoke(r11)
                if (r0 != r1) goto L_0x00a0
                r0 = 1
                goto L_0x00a1
            L_0x00a0:
                r0 = 0
            L_0x00a1:
                if (r0 == 0) goto L_0x00a4
                goto L_0x00cd
            L_0x00a4:
                dev.skomlach.biometric.compat.AuthenticationFailureReason[] r12 = new dev.skomlach.biometric.compat.AuthenticationFailureReason[r12]
                dev.skomlach.biometric.compat.AuthenticationFailureReason r0 = dev.skomlach.biometric.compat.AuthenticationFailureReason.SENSOR_FAILED
                r12[r3] = r0
                dev.skomlach.biometric.compat.AuthenticationFailureReason r0 = dev.skomlach.biometric.compat.AuthenticationFailureReason.AUTHENTICATION_FAILED
                r12[r1] = r0
                java.util.List r12 = kotlin.collections.C13614t.m87754p(r12)
                boolean r12 = r12.contains(r11)
                if (r12 == 0) goto L_0x00bf
                dev.skomlach.biometric.compat.engine.internal.face.soter.SoterFaceUnlockModule r11 = dev.skomlach.biometric.compat.engine.internal.face.soter.SoterFaceUnlockModule.this
                r11.lockout()
                dev.skomlach.biometric.compat.AuthenticationFailureReason r11 = dev.skomlach.biometric.compat.AuthenticationFailureReason.LOCKED_OUT
            L_0x00bf:
                dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener r12 = r10.listener
                if (r12 == 0) goto L_0x00e7
                dev.skomlach.biometric.compat.engine.internal.face.soter.SoterFaceUnlockModule r0 = dev.skomlach.biometric.compat.engine.internal.face.soter.SoterFaceUnlockModule.this
                int r0 = r0.tag()
                r12.onFailure(r11, r0)
                goto L_0x00e7
            L_0x00cd:
                dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener r12 = r10.listener
                if (r12 == 0) goto L_0x00da
                dev.skomlach.biometric.compat.engine.internal.face.soter.SoterFaceUnlockModule r0 = dev.skomlach.biometric.compat.engine.internal.face.soter.SoterFaceUnlockModule.this
                int r0 = r0.tag()
                r12.onFailure(r11, r0)
            L_0x00da:
                dev.skomlach.biometric.compat.engine.internal.face.soter.SoterFaceUnlockModule r11 = dev.skomlach.biometric.compat.engine.internal.face.soter.SoterFaceUnlockModule.this
                dev.skomlach.biometric.compat.BiometricCryptoObject r12 = r10.biometricCryptoObject
                androidx.core.os.CancellationSignal r0 = r10.cancellationSignal
                dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener r1 = r10.listener
                dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate r2 = r10.restartPredicate
                r11.authenticate(r12, r0, r1, r2)
            L_0x00e7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.engine.internal.face.soter.SoterFaceUnlockModule.AuthCallback.onAuthenticationError(int, java.lang.CharSequence):void");
        }

        public void onAuthenticationFailed() {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = SoterFaceUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationFailed: ");
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationFailureReason authenticationFailureReason = AuthenticationFailureReason.AUTHENTICATION_FAILED;
                RestartPredicate restartPredicate2 = this.restartPredicate;
                if (restartPredicate2 != null && restartPredicate2.invoke(authenticationFailureReason)) {
                    AuthenticationListener authenticationListener = this.listener;
                    if (authenticationListener != null) {
                        authenticationListener.onFailure(authenticationFailureReason, SoterFaceUnlockModule.this.tag());
                    }
                    SoterFaceUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                if (C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, authenticationFailureReason).contains(authenticationFailureReason)) {
                    SoterFaceUnlockModule.this.lockout();
                    authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                }
                AuthenticationListener authenticationListener2 = this.listener;
                if (authenticationListener2 != null) {
                    authenticationListener2.onFailure(authenticationFailureReason, SoterFaceUnlockModule.this.tag());
                }
            }
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            C13706o.m87929f(charSequence, "helpString");
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = SoterFaceUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationHelp: " + i + HelpFormatter.DEFAULT_OPT_PREFIX + charSequence);
            AuthenticationListener authenticationListener = this.listener;
            if (authenticationListener != null) {
                authenticationListener.onHelp(charSequence);
            }
        }

        public void onAuthenticationSucceeded(BiometricManagerCompat.AuthenticationResult authenticationResult) {
            C13706o.m87929f(authenticationResult, "result");
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = SoterFaceUnlockModule.this.getName();
            BiometricManagerCompat.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationSucceeded: " + authenticationResult + "; Crypto=" + cryptoObject);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationListener authenticationListener = this.listener;
                if (authenticationListener != null) {
                    int tag = SoterFaceUnlockModule.this.tag();
                    BiometricManagerCompat.CryptoObject cryptoObject2 = authenticationResult.getCryptoObject();
                    Mac mac = null;
                    Signature signature = cryptoObject2 != null ? cryptoObject2.getSignature() : null;
                    BiometricManagerCompat.CryptoObject cryptoObject3 = authenticationResult.getCryptoObject();
                    Cipher cipher = cryptoObject3 != null ? cryptoObject3.getCipher() : null;
                    BiometricManagerCompat.CryptoObject cryptoObject4 = authenticationResult.getCryptoObject();
                    if (cryptoObject4 != null) {
                        mac = cryptoObject4.getMac();
                    }
                    authenticationListener.onSuccess(tag, new BiometricCryptoObject(signature, cipher, mac));
                }
            }
        }
    }

    public SoterFaceUnlockModule(BiometricInitListener biometricInitListener) {
        super(BiometricMethod.FACE_SOTERAPI);
        BiometricManagerCompat biometricManagerCompat;
        this.listener = biometricInitListener;
        try {
            biometricManagerCompat = BiometricManagerCompat.from(getContext(), 2);
        } catch (Throwable th) {
            if (AbstractBiometricModule.Companion.getDEBUG_MANAGERS()) {
                BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            }
            biometricManagerCompat = null;
        }
        this.manager = biometricManagerCompat;
        BiometricInitListener biometricInitListener2 = this.listener;
        if (biometricInitListener2 != null) {
            biometricInitListener2.initFinished(getBiometricMethod(), this);
        }
    }

    public void authenticate(BiometricCryptoObject biometricCryptoObject, CancellationSignal cancellationSignal, AuthenticationListener authenticationListener, RestartPredicate restartPredicate) throws SecurityException {
        android.os.CancellationSignal cancellationSignal2;
        BiometricCryptoObject biometricCryptoObject2 = biometricCryptoObject;
        AuthenticationListener authenticationListener2 = authenticationListener;
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        biometricLoggerImpl.mo68217d(getName() + ".authenticate - " + getBiometricMethod() + "; Crypto=" + biometricCryptoObject);
        BiometricManagerCompat biometricManagerCompat = this.manager;
        if (biometricManagerCompat != null) {
            try {
                AuthCallback authCallback = new AuthCallback(biometricCryptoObject, restartPredicate, cancellationSignal, authenticationListener);
                BiometricManagerCompat.CryptoObject cryptoObject = null;
                if (cancellationSignal == null) {
                    cancellationSignal2 = null;
                } else {
                    cancellationSignal2 = (android.os.CancellationSignal) cancellationSignal.getCancellationSignalObject();
                }
                if (cancellationSignal2 != null) {
                    if (biometricCryptoObject2 != null) {
                        if (biometricCryptoObject.getCipher() != null) {
                            cryptoObject = new BiometricManagerCompat.CryptoObject(biometricCryptoObject.getCipher());
                        } else if (biometricCryptoObject.getMac() != null) {
                            cryptoObject = new BiometricManagerCompat.CryptoObject(biometricCryptoObject.getMac());
                        } else if (biometricCryptoObject.getSignature() != null) {
                            cryptoObject = new BiometricManagerCompat.CryptoObject(biometricCryptoObject.getSignature());
                        }
                    }
                    biometricLoggerImpl.mo68217d(getName() + ".authenticate:  Crypto=" + cryptoObject);
                    biometricManagerCompat.authenticate(cryptoObject, 0, cancellationSignal2, authCallback, C12114c.f58379a.mo68304e());
                    return;
                }
                throw new IllegalArgumentException("CancellationSignal cann't be null");
            } catch (Throwable th) {
                BiometricLoggerImpl.INSTANCE.mo68219e(th, getName() + ": authenticate failed unexpectedly");
            }
        }
        if (authenticationListener2 != null) {
            authenticationListener2.onFailure(AuthenticationFailureReason.UNKNOWN, tag());
        }
    }

    public Set<Object> getManagers() {
        return C13627z0.m87806d();
    }

    public boolean hasEnrolled() {
        try {
            BiometricManagerCompat biometricManagerCompat = this.manager;
            if (biometricManagerCompat != null && biometricManagerCompat.isHardwareDetected()) {
                BiometricManagerCompat biometricManagerCompat2 = this.manager;
                if (biometricManagerCompat2 != null && biometricManagerCompat2.hasEnrolledBiometric()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            return false;
        }
    }

    public boolean isHardwarePresent() {
        try {
            BiometricManagerCompat biometricManagerCompat = this.manager;
            return biometricManagerCompat != null && biometricManagerCompat.isHardwareDetected();
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            return false;
        }
    }

    public boolean isManagerAccessible() {
        return this.manager != null;
    }
}

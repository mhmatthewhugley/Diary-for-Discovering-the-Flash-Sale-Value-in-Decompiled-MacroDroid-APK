package dev.skomlach.biometric.compat.engine.internal.face.samsung;

import android.view.View;
import androidx.core.p007os.CancellationSignal;
import com.samsung.android.bio.face.SemBioFaceManager;
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
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import org.apache.commons.cli.HelpFormatter;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001aB\u0013\b\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J0\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u001c"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/samsung/SamsungFaceUnlockModule;", "Ldev/skomlach/biometric/compat/engine/internal/AbstractBiometricModule;", "", "", "getManagers", "", "hasEnrolled", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Lja/u;", "authenticate", "Lcom/samsung/android/bio/face/SemBioFaceManager;", "manager", "Lcom/samsung/android/bio/face/SemBioFaceManager;", "isManagerAccessible", "()Z", "isHardwarePresent", "Ldev/skomlach/biometric/compat/engine/BiometricInitListener;", "<init>", "(Ldev/skomlach/biometric/compat/engine/BiometricInitListener;)V", "Companion", "AuthCallback", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: SamsungFaceUnlockModule.kt */
public final class SamsungFaceUnlockModule extends AbstractBiometricModule {
    public static final Companion Companion = new Companion((C13695i) null);
    public static final int FACE_ACQUIRED_FAKE = 4;
    public static final int FACE_ACQUIRED_GOOD = 0;
    public static final int FACE_ACQUIRED_INVALID = 2;
    public static final int FACE_ACQUIRED_LOW_QUALITY = 3;
    public static final int FACE_ACQUIRED_MISALIGNED = 7;
    public static final int FACE_ACQUIRED_PROCESS_FAIL = 1;
    public static final int FACE_ACQUIRED_TOO_BIG = 5;
    public static final int FACE_ACQUIRED_TOO_SMALL = 6;
    public static final int FACE_ERROR_CAMERA_FAILURE = 10003;
    public static final int FACE_ERROR_CAMERA_UNAVAILABLE = 10005;
    public static final int FACE_ERROR_CANCELED = 5;
    public static final int FACE_ERROR_HW_UNAVAILABLE = 1;
    public static final int FACE_ERROR_IDENTIFY_FAILURE_BROKEN_DATABASE = 1004;
    public static final int FACE_ERROR_LOCKOUT = 10001;
    public static final int FACE_ERROR_NO_SPACE = 4;
    public static final int FACE_ERROR_TEMPLATE_CORRUPTED = 1004;
    public static final int FACE_ERROR_TIMEOUT = 3;
    public static final int FACE_ERROR_UNABLE_TO_PROCESS = 2;
    public static final int FACE_OK = 0;
    private SemBioFaceManager manager;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b \u0010!J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/samsung/SamsungFaceUnlockModule$AuthCallback;", "Lcom/samsung/android/bio/face/SemBioFaceManager$AuthenticationCallback;", "", "errMsgId", "", "errString", "Lja/u;", "onAuthenticationError", "helpMsgId", "helpString", "onAuthenticationHelp", "Lcom/samsung/android/bio/face/SemBioFaceManager$AuthenticationResult;", "result", "onAuthenticationSucceeded", "onAuthenticationFailed", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Landroidx/core/os/CancellationSignal;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "", "errorTs", "J", "skipTimeout", "I", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/face/samsung/SamsungFaceUnlockModule;Ldev/skomlach/biometric/compat/BiometricCryptoObject;Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;Landroidx/core/os/CancellationSignal;Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: SamsungFaceUnlockModule.kt */
    public final class AuthCallback extends SemBioFaceManager.AuthenticationCallback {
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
            this.skipTimeout = SamsungFaceUnlockModule.this.getContext().getResources().getInteger(17694720);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0092  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onAuthenticationError(int r11, java.lang.CharSequence r12) {
            /*
                r10 = this;
                dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r0 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                dev.skomlach.biometric.compat.engine.internal.face.samsung.SamsungFaceUnlockModule r3 = dev.skomlach.biometric.compat.engine.internal.face.samsung.SamsungFaceUnlockModule.this
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
                if (r12 > 0) goto L_0x003d
                return
            L_0x003d:
                r10.errorTs = r4
                dev.skomlach.biometric.compat.AuthenticationFailureReason r12 = dev.skomlach.biometric.compat.AuthenticationFailureReason.UNKNOWN
                r12 = 2
                if (r11 == r1) goto L_0x007a
                if (r11 == r12) goto L_0x0077
                r0 = 3
                if (r11 == r0) goto L_0x0074
                r0 = 4
                if (r11 == r0) goto L_0x0071
                r0 = 10001(0x2711, float:1.4014E-41)
                if (r11 == r0) goto L_0x0069
                r0 = 10005(0x2715, float:1.402E-41)
                if (r11 == r0) goto L_0x007a
                dev.skomlach.biometric.compat.engine.core.Core r11 = dev.skomlach.biometric.compat.engine.core.Core.INSTANCE
                dev.skomlach.biometric.compat.engine.internal.face.samsung.SamsungFaceUnlockModule r12 = dev.skomlach.biometric.compat.engine.internal.face.samsung.SamsungFaceUnlockModule.this
                r11.cancelAuthentication(r12)
                dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener r11 = r10.listener
                if (r11 == 0) goto L_0x0068
                dev.skomlach.biometric.compat.engine.internal.face.samsung.SamsungFaceUnlockModule r12 = dev.skomlach.biometric.compat.engine.internal.face.samsung.SamsungFaceUnlockModule.this
                int r12 = r12.tag()
                r11.onCanceled(r12)
            L_0x0068:
                return
            L_0x0069:
                dev.skomlach.biometric.compat.engine.internal.face.samsung.SamsungFaceUnlockModule r11 = dev.skomlach.biometric.compat.engine.internal.face.samsung.SamsungFaceUnlockModule.this
                r11.lockout()
                dev.skomlach.biometric.compat.AuthenticationFailureReason r11 = dev.skomlach.biometric.compat.AuthenticationFailureReason.LOCKED_OUT
                goto L_0x007c
            L_0x0071:
                dev.skomlach.biometric.compat.AuthenticationFailureReason r11 = dev.skomlach.biometric.compat.AuthenticationFailureReason.SENSOR_FAILED
                goto L_0x007c
            L_0x0074:
                dev.skomlach.biometric.compat.AuthenticationFailureReason r11 = dev.skomlach.biometric.compat.AuthenticationFailureReason.TIMEOUT
                goto L_0x007c
            L_0x0077:
                dev.skomlach.biometric.compat.AuthenticationFailureReason r11 = dev.skomlach.biometric.compat.AuthenticationFailureReason.HARDWARE_UNAVAILABLE
                goto L_0x007c
            L_0x007a:
                dev.skomlach.biometric.compat.AuthenticationFailureReason r11 = dev.skomlach.biometric.compat.AuthenticationFailureReason.HARDWARE_UNAVAILABLE
            L_0x007c:
                dev.skomlach.biometric.compat.engine.internal.face.samsung.SamsungFaceUnlockModule r0 = dev.skomlach.biometric.compat.engine.internal.face.samsung.SamsungFaceUnlockModule.this
                boolean r0 = r0.restartCauseTimeout(r11)
                if (r0 == 0) goto L_0x0092
                dev.skomlach.biometric.compat.engine.internal.face.samsung.SamsungFaceUnlockModule r11 = dev.skomlach.biometric.compat.engine.internal.face.samsung.SamsungFaceUnlockModule.this
                dev.skomlach.biometric.compat.BiometricCryptoObject r12 = r10.biometricCryptoObject
                androidx.core.os.CancellationSignal r0 = r10.cancellationSignal
                dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener r1 = r10.listener
                dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate r2 = r10.restartPredicate
                r11.authenticate(r12, r0, r1, r2)
                goto L_0x00e9
            L_0x0092:
                dev.skomlach.biometric.compat.AuthenticationFailureReason r0 = dev.skomlach.biometric.compat.AuthenticationFailureReason.TIMEOUT
                if (r11 == r0) goto L_0x00cf
                dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate r0 = r10.restartPredicate
                if (r0 == 0) goto L_0x00a2
                boolean r0 = r0.invoke(r11)
                if (r0 != r1) goto L_0x00a2
                r0 = 1
                goto L_0x00a3
            L_0x00a2:
                r0 = 0
            L_0x00a3:
                if (r0 == 0) goto L_0x00a6
                goto L_0x00cf
            L_0x00a6:
                dev.skomlach.biometric.compat.AuthenticationFailureReason[] r12 = new dev.skomlach.biometric.compat.AuthenticationFailureReason[r12]
                dev.skomlach.biometric.compat.AuthenticationFailureReason r0 = dev.skomlach.biometric.compat.AuthenticationFailureReason.SENSOR_FAILED
                r12[r3] = r0
                dev.skomlach.biometric.compat.AuthenticationFailureReason r0 = dev.skomlach.biometric.compat.AuthenticationFailureReason.AUTHENTICATION_FAILED
                r12[r1] = r0
                java.util.List r12 = kotlin.collections.C13614t.m87754p(r12)
                boolean r12 = r12.contains(r11)
                if (r12 == 0) goto L_0x00c1
                dev.skomlach.biometric.compat.engine.internal.face.samsung.SamsungFaceUnlockModule r11 = dev.skomlach.biometric.compat.engine.internal.face.samsung.SamsungFaceUnlockModule.this
                r11.lockout()
                dev.skomlach.biometric.compat.AuthenticationFailureReason r11 = dev.skomlach.biometric.compat.AuthenticationFailureReason.LOCKED_OUT
            L_0x00c1:
                dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener r12 = r10.listener
                if (r12 == 0) goto L_0x00e9
                dev.skomlach.biometric.compat.engine.internal.face.samsung.SamsungFaceUnlockModule r0 = dev.skomlach.biometric.compat.engine.internal.face.samsung.SamsungFaceUnlockModule.this
                int r0 = r0.tag()
                r12.onFailure(r11, r0)
                goto L_0x00e9
            L_0x00cf:
                dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener r12 = r10.listener
                if (r12 == 0) goto L_0x00dc
                dev.skomlach.biometric.compat.engine.internal.face.samsung.SamsungFaceUnlockModule r0 = dev.skomlach.biometric.compat.engine.internal.face.samsung.SamsungFaceUnlockModule.this
                int r0 = r0.tag()
                r12.onFailure(r11, r0)
            L_0x00dc:
                dev.skomlach.biometric.compat.engine.internal.face.samsung.SamsungFaceUnlockModule r11 = dev.skomlach.biometric.compat.engine.internal.face.samsung.SamsungFaceUnlockModule.this
                dev.skomlach.biometric.compat.BiometricCryptoObject r12 = r10.biometricCryptoObject
                androidx.core.os.CancellationSignal r0 = r10.cancellationSignal
                dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener r1 = r10.listener
                dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate r2 = r10.restartPredicate
                r11.authenticate(r12, r0, r1, r2)
            L_0x00e9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.engine.internal.face.samsung.SamsungFaceUnlockModule.AuthCallback.onAuthenticationError(int, java.lang.CharSequence):void");
        }

        public void onAuthenticationFailed() {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = SamsungFaceUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationFailed: ");
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationFailureReason authenticationFailureReason = AuthenticationFailureReason.AUTHENTICATION_FAILED;
                RestartPredicate restartPredicate2 = this.restartPredicate;
                if (restartPredicate2 != null && restartPredicate2.invoke(authenticationFailureReason)) {
                    AuthenticationListener authenticationListener = this.listener;
                    if (authenticationListener != null) {
                        authenticationListener.onFailure(authenticationFailureReason, SamsungFaceUnlockModule.this.tag());
                    }
                    SamsungFaceUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                if (C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, authenticationFailureReason).contains(authenticationFailureReason)) {
                    SamsungFaceUnlockModule.this.lockout();
                    authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                }
                AuthenticationListener authenticationListener2 = this.listener;
                if (authenticationListener2 != null) {
                    authenticationListener2.onFailure(authenticationFailureReason, SamsungFaceUnlockModule.this.tag());
                }
            }
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = SamsungFaceUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationHelp: " + i + HelpFormatter.DEFAULT_OPT_PREFIX + charSequence);
            AuthenticationListener authenticationListener = this.listener;
            if (authenticationListener != null) {
                authenticationListener.onHelp(charSequence);
            }
        }

        public void onAuthenticationSucceeded(SemBioFaceManager.AuthenticationResult authenticationResult) {
            SemBioFaceManager.CryptoObject cryptoObject;
            SemBioFaceManager.CryptoObject cryptoObject2;
            SemBioFaceManager.CryptoObject cryptoObject3;
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            Object[] objArr = new Object[1];
            String name = SamsungFaceUnlockModule.this.getName();
            Mac mac = null;
            SemBioFaceManager.CryptoObject cryptoObject4 = authenticationResult != null ? authenticationResult.getCryptoObject() : null;
            objArr[0] = name + ".onAuthenticationSucceeded: " + authenticationResult + "; Crypto=" + cryptoObject4;
            biometricLoggerImpl.mo68217d(objArr);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationListener authenticationListener = this.listener;
                if (authenticationListener != null) {
                    int tag = SamsungFaceUnlockModule.this.tag();
                    Signature signature = (authenticationResult == null || (cryptoObject3 = authenticationResult.getCryptoObject()) == null) ? null : cryptoObject3.getSignature();
                    Cipher cipher = (authenticationResult == null || (cryptoObject2 = authenticationResult.getCryptoObject()) == null) ? null : cryptoObject2.getCipher();
                    if (!(authenticationResult == null || (cryptoObject = authenticationResult.getCryptoObject()) == null)) {
                        mac = cryptoObject.getMac();
                    }
                    authenticationListener.onSuccess(tag, new BiometricCryptoObject(signature, cipher, mac));
                }
            }
        }
    }

    @Metadata(mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/samsung/SamsungFaceUnlockModule$Companion;", "", "()V", "FACE_ACQUIRED_FAKE", "", "FACE_ACQUIRED_GOOD", "FACE_ACQUIRED_INVALID", "FACE_ACQUIRED_LOW_QUALITY", "FACE_ACQUIRED_MISALIGNED", "FACE_ACQUIRED_PROCESS_FAIL", "FACE_ACQUIRED_TOO_BIG", "FACE_ACQUIRED_TOO_SMALL", "FACE_ERROR_CAMERA_FAILURE", "FACE_ERROR_CAMERA_UNAVAILABLE", "FACE_ERROR_CANCELED", "FACE_ERROR_HW_UNAVAILABLE", "FACE_ERROR_IDENTIFY_FAILURE_BROKEN_DATABASE", "FACE_ERROR_LOCKOUT", "FACE_ERROR_NO_SPACE", "FACE_ERROR_TEMPLATE_CORRUPTED", "FACE_ERROR_TIMEOUT", "FACE_ERROR_UNABLE_TO_PROCESS", "FACE_OK", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: SamsungFaceUnlockModule.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }
    }

    public SamsungFaceUnlockModule(BiometricInitListener biometricInitListener) {
        super(BiometricMethod.FACE_SAMSUNG);
        SemBioFaceManager semBioFaceManager;
        try {
            semBioFaceManager = SemBioFaceManager.getInstance(getContext());
        } catch (Throwable th) {
            if (AbstractBiometricModule.Companion.getDEBUG_MANAGERS()) {
                BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            }
            semBioFaceManager = null;
            SemBioFaceManager semBioFaceManager2 = null;
        }
        this.manager = semBioFaceManager;
        if (biometricInitListener != null) {
            biometricInitListener.initFinished(getBiometricMethod(), this);
        }
    }

    public void authenticate(BiometricCryptoObject biometricCryptoObject, CancellationSignal cancellationSignal, AuthenticationListener authenticationListener, RestartPredicate restartPredicate) throws SecurityException {
        android.os.CancellationSignal cancellationSignal2;
        SemBioFaceManager.CryptoObject cryptoObject;
        BiometricCryptoObject biometricCryptoObject2 = biometricCryptoObject;
        AuthenticationListener authenticationListener2 = authenticationListener;
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        biometricLoggerImpl.mo68217d(getName() + ".authenticate - " + getBiometricMethod() + "; Crypto=" + biometricCryptoObject);
        SemBioFaceManager semBioFaceManager = this.manager;
        if (semBioFaceManager != null) {
            try {
                SemBioFaceManager.AuthenticationCallback authCallback = new AuthCallback(biometricCryptoObject, restartPredicate, cancellationSignal, authenticationListener);
                SemBioFaceManager.CryptoObject cryptoObject2 = null;
                if (cancellationSignal == null) {
                    cancellationSignal2 = null;
                } else {
                    cancellationSignal2 = (android.os.CancellationSignal) cancellationSignal.getCancellationSignalObject();
                }
                if (cancellationSignal2 != null) {
                    if (biometricCryptoObject2 != null) {
                        if (biometricCryptoObject.getCipher() != null) {
                            cryptoObject = new SemBioFaceManager.CryptoObject(biometricCryptoObject.getCipher(), (byte[]) null);
                        } else if (biometricCryptoObject.getMac() != null) {
                            cryptoObject = new SemBioFaceManager.CryptoObject(biometricCryptoObject.getMac(), (byte[]) null);
                        } else if (biometricCryptoObject.getSignature() != null) {
                            cryptoObject = new SemBioFaceManager.CryptoObject(biometricCryptoObject.getSignature(), (byte[]) null);
                        }
                        cryptoObject2 = cryptoObject;
                    }
                    biometricLoggerImpl.mo68217d(getName() + ".authenticate:  Crypto=" + cryptoObject2);
                    semBioFaceManager.authenticate(cryptoObject2, cancellationSignal2, 0, authCallback, C12114c.f58379a.mo68304e(), (View) null);
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
        HashSet hashSet = new HashSet();
        SemBioFaceManager semBioFaceManager = this.manager;
        if (semBioFaceManager != null) {
            hashSet.add(semBioFaceManager);
        }
        return hashSet;
    }

    public boolean hasEnrolled() {
        try {
            SemBioFaceManager semBioFaceManager = this.manager;
            if (semBioFaceManager != null && semBioFaceManager.isHardwareDetected()) {
                SemBioFaceManager semBioFaceManager2 = this.manager;
                if (semBioFaceManager2 != null && semBioFaceManager2.hasEnrolledFaces()) {
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
            SemBioFaceManager semBioFaceManager = this.manager;
            return semBioFaceManager != null && semBioFaceManager.isHardwareDetected();
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            return false;
        }
    }

    public boolean isManagerAccessible() {
        return this.manager != null;
    }
}

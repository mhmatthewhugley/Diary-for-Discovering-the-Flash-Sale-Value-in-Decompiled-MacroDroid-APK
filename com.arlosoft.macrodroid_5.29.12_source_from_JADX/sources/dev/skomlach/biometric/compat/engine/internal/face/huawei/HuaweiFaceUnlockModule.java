package dev.skomlach.biometric.compat.engine.internal.face.huawei;

import android.content.Context;
import androidx.core.p007os.CancellationSignal;
import com.huawei.facerecognition.FaceManager;
import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.BiometricCryptoObject;
import dev.skomlach.biometric.compat.engine.BiometricInitListener;
import dev.skomlach.biometric.compat.engine.BiometricMethod;
import dev.skomlach.biometric.compat.engine.core.Core;
import dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener;
import dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate;
import dev.skomlach.biometric.compat.engine.internal.AbstractBiometricModule;
import dev.skomlach.biometric.compat.engine.internal.face.huawei.impl.HuaweiFaceManager;
import dev.skomlach.biometric.compat.engine.internal.face.huawei.impl.HuaweiFaceManagerFactory;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.misc.C12114c;
import java.lang.reflect.InvocationTargetException;
import java.security.Signature;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.cli.HelpFormatter;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002%&B\u0011\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b#\u0010$J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J0\u0010\u0014\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001f¨\u0006'"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/huawei/HuaweiFaceUnlockModule;", "Ldev/skomlach/biometric/compat/engine/internal/AbstractBiometricModule;", "", "", "getManagers", "manager", "", "", "getIds", "", "hasEnrolled", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Lja/u;", "authenticate", "Ldev/skomlach/biometric/compat/engine/internal/face/huawei/impl/HuaweiFaceManager;", "huaweiFaceManagerLegacy", "Ldev/skomlach/biometric/compat/engine/internal/face/huawei/impl/HuaweiFaceManager;", "Lcom/huawei/facerecognition/FaceManager;", "huawei3DFaceManager", "Lcom/huawei/facerecognition/FaceManager;", "getFaceManager", "()Lcom/huawei/facerecognition/FaceManager;", "faceManager", "isUserAuthCanByUsedWithCrypto", "()Z", "isManagerAccessible", "isHardwarePresent", "Ldev/skomlach/biometric/compat/engine/BiometricInitListener;", "<init>", "(Ldev/skomlach/biometric/compat/engine/BiometricInitListener;)V", "AuthCallback3DFace", "AuthCallbackLegacy", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: HuaweiFaceUnlockModule.kt */
public final class HuaweiFaceUnlockModule extends AbstractBiometricModule {
    private FaceManager huawei3DFaceManager;
    private HuaweiFaceManager huaweiFaceManagerLegacy;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/huawei/HuaweiFaceUnlockModule$AuthCallback3DFace;", "Lcom/huawei/facerecognition/FaceManager$AuthenticationCallback;", "", "errMsgId", "", "errString", "Lja/u;", "onAuthenticationError", "helpMsgId", "helpString", "onAuthenticationHelp", "Lcom/huawei/facerecognition/FaceManager$AuthenticationResult;", "result", "onAuthenticationSucceeded", "onAuthenticationFailed", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Landroidx/core/os/CancellationSignal;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "", "errorTs", "J", "skipTimeout", "I", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/face/huawei/HuaweiFaceUnlockModule;Ldev/skomlach/biometric/compat/BiometricCryptoObject;Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;Landroidx/core/os/CancellationSignal;Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: HuaweiFaceUnlockModule.kt */
    private final class AuthCallback3DFace extends FaceManager.AuthenticationCallback {
        private final BiometricCryptoObject biometricCryptoObject;
        private final CancellationSignal cancellationSignal;
        private long errorTs = System.currentTimeMillis();
        private final AuthenticationListener listener;
        private final RestartPredicate restartPredicate;
        private final int skipTimeout;

        public AuthCallback3DFace(BiometricCryptoObject biometricCryptoObject2, RestartPredicate restartPredicate2, CancellationSignal cancellationSignal2, AuthenticationListener authenticationListener) {
            this.biometricCryptoObject = biometricCryptoObject2;
            this.restartPredicate = restartPredicate2;
            this.cancellationSignal = cancellationSignal2;
            this.listener = authenticationListener;
            this.skipTimeout = HuaweiFaceUnlockModule.this.getContext().getResources().getInteger(17694720);
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
            AuthenticationFailureReason authenticationFailureReason;
            C13706o.m87929f(charSequence, "errString");
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = HuaweiFaceUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationError: " + i + HelpFormatter.DEFAULT_OPT_PREFIX + charSequence);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationFailureReason authenticationFailureReason2 = AuthenticationFailureReason.UNKNOWN;
                if (i == -101) {
                    authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
                } else if (i == 103) {
                    authenticationFailureReason = AuthenticationFailureReason.AUTHENTICATION_FAILED;
                } else if (i == 113) {
                    authenticationFailureReason = AuthenticationFailureReason.TIMEOUT;
                } else if (i != 129) {
                    Core.INSTANCE.cancelAuthentication(HuaweiFaceUnlockModule.this);
                    AuthenticationListener authenticationListener = this.listener;
                    if (authenticationListener != null) {
                        authenticationListener.onCanceled(HuaweiFaceUnlockModule.this.tag());
                        return;
                    }
                    return;
                } else {
                    HuaweiFaceUnlockModule.this.lockout();
                    authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                }
                if (HuaweiFaceUnlockModule.this.restartCauseTimeout(authenticationFailureReason)) {
                    HuaweiFaceUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                if (authenticationFailureReason != AuthenticationFailureReason.TIMEOUT) {
                    RestartPredicate restartPredicate2 = this.restartPredicate;
                    if (!(restartPredicate2 != null && restartPredicate2.invoke(authenticationFailureReason))) {
                        if (C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, AuthenticationFailureReason.AUTHENTICATION_FAILED).contains(authenticationFailureReason)) {
                            HuaweiFaceUnlockModule.this.lockout();
                            authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                        }
                        AuthenticationListener authenticationListener2 = this.listener;
                        if (authenticationListener2 != null) {
                            authenticationListener2.onFailure(authenticationFailureReason, HuaweiFaceUnlockModule.this.tag());
                            return;
                        }
                        return;
                    }
                }
                AuthenticationListener authenticationListener3 = this.listener;
                if (authenticationListener3 != null) {
                    authenticationListener3.onFailure(authenticationFailureReason, HuaweiFaceUnlockModule.this.tag());
                }
                HuaweiFaceUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
            }
        }

        public void onAuthenticationFailed() {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = HuaweiFaceUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationFailed: ");
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationFailureReason authenticationFailureReason = AuthenticationFailureReason.AUTHENTICATION_FAILED;
                RestartPredicate restartPredicate2 = this.restartPredicate;
                if (restartPredicate2 != null && restartPredicate2.invoke(authenticationFailureReason)) {
                    AuthenticationListener authenticationListener = this.listener;
                    if (authenticationListener != null) {
                        authenticationListener.onFailure(authenticationFailureReason, HuaweiFaceUnlockModule.this.tag());
                    }
                    HuaweiFaceUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                if (C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, authenticationFailureReason).contains(authenticationFailureReason)) {
                    HuaweiFaceUnlockModule.this.lockout();
                    authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                }
                AuthenticationListener authenticationListener2 = this.listener;
                if (authenticationListener2 != null) {
                    authenticationListener2.onFailure(authenticationFailureReason, HuaweiFaceUnlockModule.this.tag());
                }
            }
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            C13706o.m87929f(charSequence, "helpString");
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = HuaweiFaceUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationHelp: " + i + HelpFormatter.DEFAULT_OPT_PREFIX + charSequence);
            AuthenticationListener authenticationListener = this.listener;
            if (authenticationListener != null) {
                authenticationListener.onHelp(charSequence);
            }
        }

        public void onAuthenticationSucceeded(FaceManager.AuthenticationResult authenticationResult) {
            C13706o.m87929f(authenticationResult, "result");
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = HuaweiFaceUnlockModule.this.getName();
            FaceManager.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationSucceeded: " + authenticationResult + "; Crypto=" + cryptoObject);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationListener authenticationListener = this.listener;
                if (authenticationListener != null) {
                    int tag = HuaweiFaceUnlockModule.this.tag();
                    FaceManager.CryptoObject cryptoObject2 = authenticationResult.getCryptoObject();
                    Mac mac = null;
                    Signature signature = cryptoObject2 != null ? cryptoObject2.getSignature() : null;
                    FaceManager.CryptoObject cryptoObject3 = authenticationResult.getCryptoObject();
                    Cipher cipher = cryptoObject3 != null ? cryptoObject3.getCipher() : null;
                    FaceManager.CryptoObject cryptoObject4 = authenticationResult.getCryptoObject();
                    if (cryptoObject4 != null) {
                        mac = cryptoObject4.getMac();
                    }
                    authenticationListener.onSuccess(tag, new BiometricCryptoObject(signature, cipher, mac));
                }
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/huawei/HuaweiFaceUnlockModule$AuthCallbackLegacy;", "Ldev/skomlach/biometric/compat/engine/internal/face/huawei/impl/HuaweiFaceManager$AuthenticatorCallback;", "", "errMsgId", "Lja/u;", "onAuthenticationError", "helpMsgId", "onAuthenticationStatus", "onAuthenticationSucceeded", "onAuthenticationFailed", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Landroidx/core/os/CancellationSignal;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "", "errorTs", "J", "skipTimeout", "I", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/face/huawei/HuaweiFaceUnlockModule;Ldev/skomlach/biometric/compat/BiometricCryptoObject;Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;Landroidx/core/os/CancellationSignal;Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: HuaweiFaceUnlockModule.kt */
    private final class AuthCallbackLegacy extends HuaweiFaceManager.AuthenticatorCallback {
        private final BiometricCryptoObject biometricCryptoObject;
        private final CancellationSignal cancellationSignal;
        private long errorTs = System.currentTimeMillis();
        private final AuthenticationListener listener;
        private final RestartPredicate restartPredicate;
        private final int skipTimeout;

        public AuthCallbackLegacy(BiometricCryptoObject biometricCryptoObject2, RestartPredicate restartPredicate2, CancellationSignal cancellationSignal2, AuthenticationListener authenticationListener) {
            this.biometricCryptoObject = biometricCryptoObject2;
            this.restartPredicate = restartPredicate2;
            this.cancellationSignal = cancellationSignal2;
            this.listener = authenticationListener;
            this.skipTimeout = HuaweiFaceUnlockModule.this.getContext().getResources().getInteger(17694720);
        }

        public void onAuthenticationError(int i) {
            AuthenticationFailureReason authenticationFailureReason;
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = HuaweiFaceUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationError: " + i);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationFailureReason authenticationFailureReason2 = AuthenticationFailureReason.UNKNOWN;
                if (i == -101) {
                    authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
                } else if (i == 103) {
                    authenticationFailureReason = AuthenticationFailureReason.AUTHENTICATION_FAILED;
                } else if (i == 113) {
                    authenticationFailureReason = AuthenticationFailureReason.TIMEOUT;
                } else if (i != 129) {
                    Core.INSTANCE.cancelAuthentication(HuaweiFaceUnlockModule.this);
                    AuthenticationListener authenticationListener = this.listener;
                    if (authenticationListener != null) {
                        authenticationListener.onCanceled(HuaweiFaceUnlockModule.this.tag());
                        return;
                    }
                    return;
                } else {
                    HuaweiFaceUnlockModule.this.lockout();
                    authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                }
                if (HuaweiFaceUnlockModule.this.restartCauseTimeout(authenticationFailureReason)) {
                    HuaweiFaceUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                if (authenticationFailureReason != AuthenticationFailureReason.TIMEOUT) {
                    RestartPredicate restartPredicate2 = this.restartPredicate;
                    if (!(restartPredicate2 != null && restartPredicate2.invoke(authenticationFailureReason))) {
                        if (C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, AuthenticationFailureReason.AUTHENTICATION_FAILED).contains(authenticationFailureReason)) {
                            HuaweiFaceUnlockModule.this.lockout();
                            authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                        }
                        AuthenticationListener authenticationListener2 = this.listener;
                        if (authenticationListener2 != null) {
                            authenticationListener2.onFailure(authenticationFailureReason, HuaweiFaceUnlockModule.this.tag());
                            return;
                        }
                        return;
                    }
                }
                AuthenticationListener authenticationListener3 = this.listener;
                if (authenticationListener3 != null) {
                    authenticationListener3.onFailure(authenticationFailureReason, HuaweiFaceUnlockModule.this.tag());
                }
                HuaweiFaceUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
            }
        }

        public void onAuthenticationFailed() {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = HuaweiFaceUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationFailed: ");
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationFailureReason authenticationFailureReason = AuthenticationFailureReason.AUTHENTICATION_FAILED;
                RestartPredicate restartPredicate2 = this.restartPredicate;
                if (restartPredicate2 != null && restartPredicate2.invoke(authenticationFailureReason)) {
                    AuthenticationListener authenticationListener = this.listener;
                    if (authenticationListener != null) {
                        authenticationListener.onFailure(authenticationFailureReason, HuaweiFaceUnlockModule.this.tag());
                    }
                    HuaweiFaceUnlockModule.this.authenticate(this.biometricCryptoObject, this.cancellationSignal, this.listener, this.restartPredicate);
                    return;
                }
                if (C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, authenticationFailureReason).contains(authenticationFailureReason)) {
                    HuaweiFaceUnlockModule.this.lockout();
                    authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
                }
                AuthenticationListener authenticationListener2 = this.listener;
                if (authenticationListener2 != null) {
                    authenticationListener2.onFailure(authenticationFailureReason, HuaweiFaceUnlockModule.this.tag());
                }
            }
        }

        public void onAuthenticationStatus(int i) {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = HuaweiFaceUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationHelp: " + i);
            AuthenticationListener authenticationListener = this.listener;
            if (authenticationListener != null) {
                authenticationListener.onHelp((CharSequence) null);
            }
        }

        public void onAuthenticationSucceeded() {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = HuaweiFaceUnlockModule.this.getName();
            biometricLoggerImpl.mo68217d(name + ".onAuthenticationSucceeded: ");
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
                this.errorTs = currentTimeMillis;
                AuthenticationListener authenticationListener = this.listener;
                if (authenticationListener != null) {
                    int tag = HuaweiFaceUnlockModule.this.tag();
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
            }
        }
    }

    public HuaweiFaceUnlockModule(BiometricInitListener biometricInitListener) {
        super(BiometricMethod.FACE_HUAWEI);
        C12114c.f58379a.mo68305g(new C12034a(this, biometricInitListener));
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final void m101304_init_$lambda0(HuaweiFaceUnlockModule huaweiFaceUnlockModule, BiometricInitListener biometricInitListener) {
        C13706o.m87929f(huaweiFaceUnlockModule, "this$0");
        try {
            huaweiFaceUnlockModule.huawei3DFaceManager = huaweiFaceUnlockModule.getFaceManager();
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = huaweiFaceUnlockModule.getName();
            FaceManager faceManager = huaweiFaceUnlockModule.huawei3DFaceManager;
            biometricLoggerImpl.mo68217d(name + ".huawei3DFaceManager - " + faceManager);
        } catch (Throwable th) {
            if (AbstractBiometricModule.Companion.getDEBUG_MANAGERS()) {
                BiometricLoggerImpl.INSTANCE.mo68219e(th, huaweiFaceUnlockModule.getName());
            }
            huaweiFaceUnlockModule.huawei3DFaceManager = null;
        }
        try {
            huaweiFaceUnlockModule.huaweiFaceManagerLegacy = HuaweiFaceManagerFactory.INSTANCE.getHuaweiFaceManager();
            BiometricLoggerImpl biometricLoggerImpl2 = BiometricLoggerImpl.INSTANCE;
            String name2 = huaweiFaceUnlockModule.getName();
            HuaweiFaceManager huaweiFaceManager = huaweiFaceUnlockModule.huaweiFaceManagerLegacy;
            biometricLoggerImpl2.mo68217d(name2 + ".huaweiFaceManagerLegacy - " + huaweiFaceManager);
        } catch (Throwable th2) {
            if (AbstractBiometricModule.Companion.getDEBUG_MANAGERS()) {
                BiometricLoggerImpl.INSTANCE.mo68219e(th2, huaweiFaceUnlockModule.getName());
            }
            huaweiFaceUnlockModule.huaweiFaceManagerLegacy = null;
        }
        if (biometricInitListener != null) {
            biometricInitListener.initFinished(huaweiFaceUnlockModule.getBiometricMethod(), huaweiFaceUnlockModule);
        }
    }

    private final FaceManager getFaceManager() {
        try {
            Object invoke = Class.forName("com.huawei.facerecognition.FaceManagerFactory").getDeclaredMethod("getFaceManager", new Class[]{Context.class}).invoke((Object) null, new Object[]{getContext()});
            C13706o.m87927d(invoke, "null cannot be cast to non-null type com.huawei.facerecognition.FaceManager");
            return (FaceManager) invoke;
        } catch (ClassNotFoundException unused) {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name = getName();
            biometricLoggerImpl.mo68217d(name + ".Throw exception: ClassNotFoundException");
            return null;
        } catch (NoSuchMethodException unused2) {
            BiometricLoggerImpl biometricLoggerImpl2 = BiometricLoggerImpl.INSTANCE;
            String name2 = getName();
            biometricLoggerImpl2.mo68217d(name2 + ".Throw exception: NoSuchMethodException");
            return null;
        } catch (IllegalAccessException unused3) {
            BiometricLoggerImpl biometricLoggerImpl3 = BiometricLoggerImpl.INSTANCE;
            String name3 = getName();
            biometricLoggerImpl3.mo68217d(name3 + ".Throw exception: IllegalAccessException");
            return null;
        } catch (InvocationTargetException unused4) {
            BiometricLoggerImpl biometricLoggerImpl4 = BiometricLoggerImpl.INSTANCE;
            String name4 = getName();
            biometricLoggerImpl4.mo68217d(name4 + ".Throw exception: InvocationTargetException");
            return null;
        }
    }

    public void authenticate(BiometricCryptoObject biometricCryptoObject, CancellationSignal cancellationSignal, AuthenticationListener authenticationListener, RestartPredicate restartPredicate) throws SecurityException {
        android.os.CancellationSignal cancellationSignal2;
        HuaweiFaceManager huaweiFaceManager;
        FaceManager faceManager;
        BiometricCryptoObject biometricCryptoObject2 = biometricCryptoObject;
        AuthenticationListener authenticationListener2 = authenticationListener;
        try {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            biometricLoggerImpl.mo68217d(getName() + ".authenticate - " + getBiometricMethod() + "; Crypto=" + biometricCryptoObject2);
            FaceManager.CryptoObject cryptoObject = null;
            if (cancellationSignal == null) {
                cancellationSignal2 = null;
            } else {
                cancellationSignal2 = (android.os.CancellationSignal) cancellationSignal.getCancellationSignalObject();
            }
            if (cancellationSignal2 != null) {
                FaceManager faceManager2 = this.huawei3DFaceManager;
                if (faceManager2 != null && faceManager2.isHardwareDetected()) {
                    FaceManager faceManager3 = this.huawei3DFaceManager;
                    if ((faceManager3 != null && faceManager3.hasEnrolledTemplates()) && (faceManager = this.huawei3DFaceManager) != null) {
                        if (biometricCryptoObject2 != null) {
                            if (biometricCryptoObject.getCipher() != null) {
                                cryptoObject = new FaceManager.CryptoObject(biometricCryptoObject.getCipher());
                            } else if (biometricCryptoObject.getMac() != null) {
                                cryptoObject = new FaceManager.CryptoObject(biometricCryptoObject.getMac());
                            } else if (biometricCryptoObject.getSignature() != null) {
                                cryptoObject = new FaceManager.CryptoObject(biometricCryptoObject.getSignature());
                            }
                        }
                        FaceManager.CryptoObject cryptoObject2 = cryptoObject;
                        AuthCallback3DFace authCallback3DFace = new AuthCallback3DFace(biometricCryptoObject, restartPredicate, cancellationSignal, authenticationListener);
                        biometricLoggerImpl.mo68217d(getName() + ".authenticate:  Crypto=" + cryptoObject2);
                        faceManager.authenticate(cryptoObject2, cancellationSignal2, 0, authCallback3DFace, C12114c.f58379a.mo68304e());
                        return;
                    }
                }
                HuaweiFaceManager huaweiFaceManager2 = this.huaweiFaceManagerLegacy;
                if (huaweiFaceManager2 != null && huaweiFaceManager2.isHardwareDetected()) {
                    HuaweiFaceManager huaweiFaceManager3 = this.huaweiFaceManagerLegacy;
                    if ((huaweiFaceManager3 != null && huaweiFaceManager3.hasEnrolledTemplates()) && (huaweiFaceManager = this.huaweiFaceManagerLegacy) != null) {
                        try {
                            huaweiFaceManager.authenticate(0, 0, new AuthCallbackLegacy(biometricCryptoObject, restartPredicate, cancellationSignal, authenticationListener));
                            return;
                        } catch (Throwable th) {
                            BiometricLoggerImpl.INSTANCE.mo68219e(th, getName() + ": authenticate failed unexpectedly");
                        }
                    }
                }
                if (authenticationListener2 != null) {
                    authenticationListener2.onFailure(AuthenticationFailureReason.UNKNOWN, tag());
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("CancellationSignal cann't be null");
        } catch (Throwable th2) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th2, getName() + ": authenticate failed unexpectedly");
        }
    }

    public List<String> getIds(Object obj) {
        int[] enrolledTemplates;
        C13706o.m87929f(obj, "manager");
        ArrayList arrayList = new ArrayList(super.getIds(obj));
        HuaweiFaceManager huaweiFaceManager = this.huaweiFaceManagerLegacy;
        if (!(huaweiFaceManager == null || (enrolledTemplates = huaweiFaceManager.getEnrolledTemplates()) == null)) {
            for (int valueOf : enrolledTemplates) {
                arrayList.add(String.valueOf(valueOf));
            }
        }
        return arrayList;
    }

    public Set<Object> getManagers() {
        HashSet hashSet = new HashSet();
        FaceManager faceManager = this.huawei3DFaceManager;
        if (faceManager != null) {
            hashSet.add(faceManager);
        }
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        if (r5 < r4) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        r6 = r2[r5];
        r7 = r6.getName();
        kotlin.jvm.internal.C13706o.m87928e(r7, "it.name");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (kotlin.text.C15177w.m93659L(r7, "hasEnrolled", true) != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r6 == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        r2 = r6.isAccessible();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r6.setAccessible(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        if (r6 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        r4 = r6.getReturnType();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005e, code lost:
        if (kotlin.jvm.internal.C13706o.m87924a(r4, java.lang.Boolean.TYPE) == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0060, code lost:
        if (r6 != null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0062, code lost:
        r3 = r6.invoke(r9.huawei3DFaceManager, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006a, code lost:
        r3 = kotlin.jvm.internal.C13706o.m87924a((java.lang.Boolean) r3, java.lang.Boolean.TRUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0073, code lost:
        if (r6 != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0075, code lost:
        r4 = r6.getReturnType();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007a, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0081, code lost:
        if (kotlin.jvm.internal.C13706o.m87924a(r4, java.lang.Integer.TYPE) != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0083, code lost:
        if (r6 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0085, code lost:
        r3 = r6.invoke(r9.huawei3DFaceManager, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008d, code lost:
        r3 = (java.lang.Integer) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008f, code lost:
        if (r3 != null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0091, code lost:
        r3 = r3.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0096, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0097, code lost:
        if (r3 > 0) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0099, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009b, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r6.setAccessible(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a4, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00b7, code lost:
        if (r2 == false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00b9, code lost:
        if (r6 == null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00bc, code lost:
        r6.setAccessible(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00bf, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c0, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00c1, code lost:
        dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE.mo68219e(r2, getName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r2 = r9.huawei3DFaceManager;
        r3 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0012 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003f A[Catch:{ all -> 0x0054, all -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004f A[Catch:{ all -> 0x0054, all -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0057 A[Catch:{ all -> 0x0054, all -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0060 A[Catch:{ all -> 0x0054, all -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0073 A[Catch:{ all -> 0x0054, all -> 0x00c0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasEnrolled() {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            com.huawei.facerecognition.FaceManager r2 = r9.huawei3DFaceManager     // Catch:{ all -> 0x0012 }
            if (r2 == 0) goto L_0x000f
            boolean r2 = r2.hasEnrolledTemplates()     // Catch:{ all -> 0x0012 }
            if (r2 != r0) goto L_0x000f
            r2 = 1
            goto L_0x00a5
        L_0x000f:
            r2 = 0
            goto L_0x00a5
        L_0x0012:
            com.huawei.facerecognition.FaceManager r2 = r9.huawei3DFaceManager     // Catch:{ all -> 0x00c0 }
            r3 = 0
            if (r2 == 0) goto L_0x003c
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x00c0 }
            java.lang.reflect.Method[] r2 = r2.getDeclaredMethods()     // Catch:{ all -> 0x00c0 }
            if (r2 == 0) goto L_0x003c
            int r4 = r2.length     // Catch:{ all -> 0x00c0 }
            r5 = 0
        L_0x0023:
            if (r5 >= r4) goto L_0x003c
            r6 = r2[r5]     // Catch:{ all -> 0x00c0 }
            java.lang.String r7 = r6.getName()     // Catch:{ all -> 0x00c0 }
            java.lang.String r8 = "it.name"
            kotlin.jvm.internal.C13706o.m87928e(r7, r8)     // Catch:{ all -> 0x00c0 }
            java.lang.String r8 = "hasEnrolled"
            boolean r7 = kotlin.text.C15177w.m93659L(r7, r8, r0)     // Catch:{ all -> 0x00c0 }
            if (r7 == 0) goto L_0x0039
            goto L_0x003d
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x0023
        L_0x003c:
            r6 = r3
        L_0x003d:
            if (r6 == 0) goto L_0x0044
            boolean r2 = r6.isAccessible()     // Catch:{ all -> 0x00c0 }
            goto L_0x0045
        L_0x0044:
            r2 = 1
        L_0x0045:
            if (r2 != 0) goto L_0x004d
            if (r6 != 0) goto L_0x004a
            goto L_0x004d
        L_0x004a:
            r6.setAccessible(r0)     // Catch:{ all -> 0x0054 }
        L_0x004d:
            if (r6 == 0) goto L_0x0057
            java.lang.Class r4 = r6.getReturnType()     // Catch:{ all -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r3 = move-exception
            goto L_0x00b7
        L_0x0057:
            r4 = r3
        L_0x0058:
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0054 }
            boolean r4 = kotlin.jvm.internal.C13706o.m87924a(r4, r5)     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x0073
            if (r6 == 0) goto L_0x006a
            com.huawei.facerecognition.FaceManager r3 = r9.huawei3DFaceManager     // Catch:{ all -> 0x0054 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x0054 }
            java.lang.Object r3 = r6.invoke(r3, r4)     // Catch:{ all -> 0x0054 }
        L_0x006a:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0054 }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0054 }
            boolean r3 = kotlin.jvm.internal.C13706o.m87924a(r3, r4)     // Catch:{ all -> 0x0054 }
            goto L_0x009c
        L_0x0073:
            if (r6 == 0) goto L_0x007a
            java.lang.Class r4 = r6.getReturnType()     // Catch:{ all -> 0x0054 }
            goto L_0x007b
        L_0x007a:
            r4 = r3
        L_0x007b:
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0054 }
            boolean r4 = kotlin.jvm.internal.C13706o.m87924a(r4, r5)     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x009b
            if (r6 == 0) goto L_0x008d
            com.huawei.facerecognition.FaceManager r3 = r9.huawei3DFaceManager     // Catch:{ all -> 0x0054 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x0054 }
            java.lang.Object r3 = r6.invoke(r3, r4)     // Catch:{ all -> 0x0054 }
        L_0x008d:
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0054 }
            if (r3 == 0) goto L_0x0096
            int r3 = r3.intValue()     // Catch:{ all -> 0x0054 }
            goto L_0x0097
        L_0x0096:
            r3 = 0
        L_0x0097:
            if (r3 <= 0) goto L_0x009b
            r3 = 1
            goto L_0x009c
        L_0x009b:
            r3 = 0
        L_0x009c:
            if (r2 != 0) goto L_0x00a4
            if (r6 != 0) goto L_0x00a1
            goto L_0x00a4
        L_0x00a1:
            r6.setAccessible(r1)     // Catch:{ all -> 0x00c0 }
        L_0x00a4:
            r2 = r3
        L_0x00a5:
            com.huawei.facerecognition.FaceManager r3 = r9.huawei3DFaceManager     // Catch:{ all -> 0x00c0 }
            if (r3 == 0) goto L_0x00b1
            boolean r3 = r3.isHardwareDetected()     // Catch:{ all -> 0x00c0 }
            if (r3 != r0) goto L_0x00b1
            r3 = 1
            goto L_0x00b2
        L_0x00b1:
            r3 = 0
        L_0x00b2:
            if (r3 == 0) goto L_0x00ce
            if (r2 == 0) goto L_0x00ce
            return r0
        L_0x00b7:
            if (r2 != 0) goto L_0x00bf
            if (r6 != 0) goto L_0x00bc
            goto L_0x00bf
        L_0x00bc:
            r6.setAccessible(r1)     // Catch:{ all -> 0x00c0 }
        L_0x00bf:
            throw r3     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r2 = move-exception
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r3 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r5 = r9.getName()
            r4[r1] = r5
            r3.mo68219e(r2, r4)
        L_0x00ce:
            dev.skomlach.biometric.compat.engine.internal.face.huawei.impl.HuaweiFaceManager r2 = r9.huaweiFaceManagerLegacy     // Catch:{ all -> 0x00ed }
            if (r2 == 0) goto L_0x00da
            boolean r2 = r2.isHardwareDetected()     // Catch:{ all -> 0x00ed }
            if (r2 != r0) goto L_0x00da
            r2 = 1
            goto L_0x00db
        L_0x00da:
            r2 = 0
        L_0x00db:
            if (r2 == 0) goto L_0x00fb
            dev.skomlach.biometric.compat.engine.internal.face.huawei.impl.HuaweiFaceManager r2 = r9.huaweiFaceManagerLegacy     // Catch:{ all -> 0x00ed }
            if (r2 == 0) goto L_0x00e9
            boolean r2 = r2.hasEnrolledTemplates()     // Catch:{ all -> 0x00ed }
            if (r2 != r0) goto L_0x00e9
            r2 = 1
            goto L_0x00ea
        L_0x00e9:
            r2 = 0
        L_0x00ea:
            if (r2 == 0) goto L_0x00fb
            return r0
        L_0x00ed:
            r2 = move-exception
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r3 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r4 = r9.getName()
            r0[r1] = r4
            r3.mo68219e(r2, r0)
        L_0x00fb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.engine.internal.face.huawei.HuaweiFaceUnlockModule.hasEnrolled():boolean");
    }

    public boolean isHardwarePresent() {
        try {
            FaceManager faceManager = this.huawei3DFaceManager;
            if (faceManager != null && faceManager.isHardwareDetected()) {
                return true;
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
        }
        try {
            HuaweiFaceManager huaweiFaceManager = this.huaweiFaceManagerLegacy;
            return huaweiFaceManager != null && huaweiFaceManager.isHardwareDetected();
        } catch (Throwable th2) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th2, getName());
        }
    }

    public boolean isManagerAccessible() {
        return (this.huaweiFaceManagerLegacy == null && this.huawei3DFaceManager == null) ? false : true;
    }

    public boolean isUserAuthCanByUsedWithCrypto() {
        return this.huawei3DFaceManager != null;
    }
}

package dev.skomlach.biometric.compat.engine.internal.fingerprint;

import androidx.core.p007os.CancellationSignal;
import com.samsung.android.sdk.pass.SpassFingerprint;
import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.BiometricCryptoObject;
import dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener;
import dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, mo71668d2 = {"dev/skomlach/biometric/compat/engine/internal/fingerprint/SamsungFingerprintModule$authenticate$1$callback$1", "Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;", "Ldev/skomlach/biometric/compat/AuthenticationFailureReason;", "reason", "Lja/u;", "fail", "", "status", "onFinished", "onReady", "onStarted", "onCompleted", "", "errorTs", "J", "skipTimeout", "I", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: SamsungFingerprintModule.kt */
public final class SamsungFingerprintModule$authenticate$1$callback$1 implements SpassFingerprint.IdentifyListener {
    final /* synthetic */ BiometricCryptoObject $biometricCryptoObject;
    final /* synthetic */ CancellationSignal $cancellationSignal;
    final /* synthetic */ AuthenticationListener $listener;
    final /* synthetic */ RestartPredicate $restartPredicate;
    private long errorTs = System.currentTimeMillis();
    private final int skipTimeout;
    final /* synthetic */ SamsungFingerprintModule this$0;

    SamsungFingerprintModule$authenticate$1$callback$1(SamsungFingerprintModule samsungFingerprintModule, AuthenticationListener authenticationListener, BiometricCryptoObject biometricCryptoObject, CancellationSignal cancellationSignal, RestartPredicate restartPredicate) {
        this.this$0 = samsungFingerprintModule;
        this.$listener = authenticationListener;
        this.$biometricCryptoObject = biometricCryptoObject;
        this.$cancellationSignal = cancellationSignal;
        this.$restartPredicate = restartPredicate;
        this.skipTimeout = samsungFingerprintModule.getContext().getResources().getInteger(17694720);
    }

    private final void fail(AuthenticationFailureReason authenticationFailureReason) {
        if (this.this$0.restartCauseTimeout(authenticationFailureReason)) {
            this.this$0.authenticate(this.$biometricCryptoObject, this.$cancellationSignal, this.$listener, this.$restartPredicate);
            return;
        }
        RestartPredicate restartPredicate = this.$restartPredicate;
        if (restartPredicate != null && restartPredicate.invoke(authenticationFailureReason)) {
            AuthenticationListener authenticationListener = this.$listener;
            if (authenticationListener != null) {
                authenticationListener.onFailure(authenticationFailureReason, this.this$0.tag());
            }
            this.this$0.authenticate(this.$biometricCryptoObject, this.$cancellationSignal, this.$listener, this.$restartPredicate);
            return;
        }
        if (C13566b0.m87414O(C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, AuthenticationFailureReason.AUTHENTICATION_FAILED), authenticationFailureReason)) {
            this.this$0.lockout();
            authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
        }
        AuthenticationListener authenticationListener2 = this.$listener;
        if (authenticationListener2 != null) {
            authenticationListener2.onFailure(authenticationFailureReason, this.this$0.tag());
        }
    }

    public void onCompleted() {
    }

    public void onFinished(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
            this.errorTs = currentTimeMillis;
            if (i != 0) {
                if (i != 4) {
                    if (i != 12) {
                        if (i == 16) {
                            fail(AuthenticationFailureReason.AUTHENTICATION_FAILED);
                            return;
                        } else if (i != 100) {
                            if (i != 7) {
                                if (i != 8) {
                                    fail(AuthenticationFailureReason.UNKNOWN);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    fail(AuthenticationFailureReason.SENSOR_FAILED);
                    return;
                }
                fail(AuthenticationFailureReason.TIMEOUT);
                return;
            }
            AuthenticationListener authenticationListener = this.$listener;
            if (authenticationListener != null) {
                int tag = this.this$0.tag();
                BiometricCryptoObject biometricCryptoObject = this.$biometricCryptoObject;
                Mac mac = null;
                Signature signature = biometricCryptoObject != null ? biometricCryptoObject.getSignature() : null;
                BiometricCryptoObject biometricCryptoObject2 = this.$biometricCryptoObject;
                Cipher cipher = biometricCryptoObject2 != null ? biometricCryptoObject2.getCipher() : null;
                BiometricCryptoObject biometricCryptoObject3 = this.$biometricCryptoObject;
                if (biometricCryptoObject3 != null) {
                    mac = biometricCryptoObject3.getMac();
                }
                authenticationListener.onSuccess(tag, new BiometricCryptoObject(signature, cipher, mac));
            }
        }
    }

    public void onReady() {
    }

    public void onStarted() {
    }
}

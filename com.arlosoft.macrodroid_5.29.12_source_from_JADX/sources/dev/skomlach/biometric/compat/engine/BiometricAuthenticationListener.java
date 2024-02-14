package dev.skomlach.biometric.compat.engine;

import androidx.annotation.WorkerThread;
import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.AuthenticationResult;
import dev.skomlach.biometric.compat.BiometricType;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'J\u001c\u0010\r\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH'J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH'¨\u0006\u000f"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/BiometricAuthenticationListener;", "", "Ldev/skomlach/biometric/compat/AuthenticationResult;", "result", "Lja/u;", "onSuccess", "", "msg", "onHelp", "Ldev/skomlach/biometric/compat/AuthenticationFailureReason;", "failureReason", "Ldev/skomlach/biometric/compat/BiometricType;", "module", "onFailure", "onCanceled", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricAuthenticationListener.kt */
public interface BiometricAuthenticationListener {
    @WorkerThread
    void onCanceled(BiometricType biometricType);

    @WorkerThread
    void onFailure(AuthenticationFailureReason authenticationFailureReason, BiometricType biometricType);

    @WorkerThread
    void onHelp(CharSequence charSequence);

    @WorkerThread
    void onSuccess(AuthenticationResult authenticationResult);
}

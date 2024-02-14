package dev.skomlach.biometric.compat.engine.core;

import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate;
import kotlin.Metadata;

@Metadata(mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, mo71668d2 = {"dev/skomlach/biometric/compat/engine/core/RestartPredicatesImpl$restartTimeouts$1", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "timeoutRestarts", "", "invoke", "", "reason", "Ldev/skomlach/biometric/compat/AuthenticationFailureReason;", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: RestartPredicatesImpl.kt */
public final class RestartPredicatesImpl$restartTimeouts$1 implements RestartPredicate {
    final /* synthetic */ int $timeoutRestartCount;
    private int timeoutRestarts;

    RestartPredicatesImpl$restartTimeouts$1(int i) {
        this.$timeoutRestartCount = i;
    }

    public boolean invoke(AuthenticationFailureReason authenticationFailureReason) {
        if (!C13566b0.m87414O(C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, AuthenticationFailureReason.AUTHENTICATION_FAILED), authenticationFailureReason)) {
            return false;
        }
        int i = this.timeoutRestarts;
        this.timeoutRestarts = i + 1;
        if (i < this.$timeoutRestartCount) {
            return true;
        }
        return false;
    }
}

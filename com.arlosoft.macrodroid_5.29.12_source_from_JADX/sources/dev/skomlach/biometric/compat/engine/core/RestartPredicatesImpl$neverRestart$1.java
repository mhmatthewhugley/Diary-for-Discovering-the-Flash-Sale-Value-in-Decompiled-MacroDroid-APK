package dev.skomlach.biometric.compat.engine.core;

import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate;
import kotlin.Metadata;

@Metadata(mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002¨\u0006\u0006"}, mo71668d2 = {"dev/skomlach/biometric/compat/engine/core/RestartPredicatesImpl$neverRestart$1", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "invoke", "", "reason", "Ldev/skomlach/biometric/compat/AuthenticationFailureReason;", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: RestartPredicatesImpl.kt */
public final class RestartPredicatesImpl$neverRestart$1 implements RestartPredicate {
    RestartPredicatesImpl$neverRestart$1() {
    }

    public boolean invoke(AuthenticationFailureReason authenticationFailureReason) {
        return false;
    }
}

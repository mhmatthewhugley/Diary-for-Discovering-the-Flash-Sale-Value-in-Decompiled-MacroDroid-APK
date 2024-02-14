package dev.skomlach.biometric.compat.engine.core;

import dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate;
import kotlin.Metadata;

@Metadata(mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/core/RestartPredicatesImpl;", "", "()V", "defaultPredicate", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "neverRestart", "restartTimeouts", "timeoutRestartCount", "", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: RestartPredicatesImpl.kt */
public final class RestartPredicatesImpl {
    public static final RestartPredicatesImpl INSTANCE = new RestartPredicatesImpl();

    private RestartPredicatesImpl() {
    }

    public static final RestartPredicate defaultPredicate() {
        return INSTANCE.restartTimeouts(5);
    }

    public final RestartPredicate neverRestart() {
        return new RestartPredicatesImpl$neverRestart$1();
    }

    public final RestartPredicate restartTimeouts(int i) {
        return new RestartPredicatesImpl$restartTimeouts$1(i);
    }
}

package dev.skomlach.biometric.compat.engine.core.interfaces;

import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import kotlin.Metadata;

@Metadata(mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H¦\u0002¨\u0006\u0006"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "", "invoke", "", "reason", "Ldev/skomlach/biometric/compat/AuthenticationFailureReason;", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: RestartPredicate.kt */
public interface RestartPredicate {
    boolean invoke(AuthenticationFailureReason authenticationFailureReason);
}

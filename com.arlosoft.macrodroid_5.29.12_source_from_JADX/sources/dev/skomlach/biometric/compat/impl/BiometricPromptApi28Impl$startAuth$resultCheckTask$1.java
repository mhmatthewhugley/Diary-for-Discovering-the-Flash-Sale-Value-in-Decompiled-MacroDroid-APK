package dev.skomlach.biometric.compat.impl;

import dev.skomlach.biometric.compat.AuthenticationResult;
import dev.skomlach.common.misc.C12114c;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo71668d2 = {"dev/skomlach/biometric/compat/impl/BiometricPromptApi28Impl$startAuth$resultCheckTask$1", "Ljava/lang/Runnable;", "Lja/u;", "run", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricPromptApi28Impl.kt */
public final class BiometricPromptApi28Impl$startAuth$resultCheckTask$1 implements Runnable {
    final /* synthetic */ Runnable $finalTask;
    final /* synthetic */ AtomicBoolean $finalTaskExecuted;
    final /* synthetic */ long $shortDelayMillis;
    final /* synthetic */ Set<AuthenticationResult> $successList;

    BiometricPromptApi28Impl$startAuth$resultCheckTask$1(AtomicBoolean atomicBoolean, Set<AuthenticationResult> set, Runnable runnable, long j) {
        this.$finalTaskExecuted = atomicBoolean;
        this.$successList = set;
        this.$finalTask = runnable;
        this.$shortDelayMillis = j;
    }

    public void run() {
        if (this.$finalTaskExecuted.get()) {
            return;
        }
        if (!this.$successList.isEmpty()) {
            C12114c.f58379a.mo68307i(this.$finalTask);
            this.$finalTask.run();
            return;
        }
        C12114c.f58379a.mo68306h(this, this.$shortDelayMillis);
    }
}

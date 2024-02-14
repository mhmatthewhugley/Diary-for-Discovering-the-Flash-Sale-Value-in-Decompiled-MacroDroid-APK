package dev.skomlach.biometric.compat;

import androidx.biometric.BiometricFragment;
import androidx.biometric.FingerprintDialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import dev.skomlach.biometric.compat.impl.dialogs.BiometricPromptCompatDialog;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.misc.C12114c;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo71668d2 = {"dev/skomlach/biometric/compat/BiometricPromptCompat$fragmentLifecycleCallbacks$1", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "Landroidx/fragment/app/FragmentManager;", "fm", "Landroidx/fragment/app/Fragment;", "f", "Lja/u;", "onFragmentResumed", "onFragmentPaused", "Ljava/util/concurrent/atomic/AtomicInteger;", "atomicBoolean", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/lang/Runnable;", "dismissTask", "Ljava/lang/Runnable;", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricPromptCompat.kt */
public final class BiometricPromptCompat$fragmentLifecycleCallbacks$1 extends FragmentManager.FragmentLifecycleCallbacks {
    private final AtomicInteger atomicBoolean = new AtomicInteger(0);
    private final Runnable dismissTask;
    final /* synthetic */ BiometricPromptCompat this$0;

    BiometricPromptCompat$fragmentLifecycleCallbacks$1(BiometricPromptCompat biometricPromptCompat) {
        this.this$0 = biometricPromptCompat;
        this.dismissTask = new C12041h(this, biometricPromptCompat);
    }

    /* access modifiers changed from: private */
    /* renamed from: dismissTask$lambda-0  reason: not valid java name */
    public static final void m101299dismissTask$lambda0(BiometricPromptCompat$fragmentLifecycleCallbacks$1 biometricPromptCompat$fragmentLifecycleCallbacks$1, BiometricPromptCompat biometricPromptCompat) {
        C13706o.m87929f(biometricPromptCompat$fragmentLifecycleCallbacks$1, "this$0");
        C13706o.m87929f(biometricPromptCompat, "this$1");
        if (biometricPromptCompat$fragmentLifecycleCallbacks$1.atomicBoolean.get() <= 0) {
            BiometricLoggerImpl.INSTANCE.mo68220e("BiometricPromptCompat.dismissTask");
            biometricPromptCompat.cancelAuthentication();
        }
    }

    public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        C13706o.m87929f(fragmentManager, "fm");
        C13706o.m87929f(fragment, "f");
        if ((fragment instanceof BiometricFragment) || (fragment instanceof FingerprintDialogFragment) || (fragment instanceof BiometricPromptCompatDialog)) {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            biometricLoggerImpl.mo68217d("BiometricPromptCompat.FragmentLifecycleCallbacks.onFragmentPaused - " + fragment);
            this.atomicBoolean.decrementAndGet();
            C12114c cVar = C12114c.f58379a;
            cVar.mo68307i(this.dismissTask);
            cVar.mo68306h(this.dismissTask, (long) this.this$0.appContext.getResources().getInteger(17694722));
        }
    }

    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        C13706o.m87929f(fragmentManager, "fm");
        C13706o.m87929f(fragment, "f");
        if ((fragment instanceof BiometricFragment) || (fragment instanceof FingerprintDialogFragment) || (fragment instanceof BiometricPromptCompatDialog)) {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            biometricLoggerImpl.mo68217d("BiometricPromptCompat.FragmentLifecycleCallbacks.onFragmentResumed - " + fragment);
            this.atomicBoolean.incrementAndGet();
        }
    }
}

package dev.skomlach.biometric.compat.utils.hardware;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import dev.skomlach.biometric.compat.BiometricAuthRequest;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.biometric.compat.utils.notification.BiometricNotificationManager;
import dev.skomlach.common.contextprovider.C12104a;
import dev.skomlach.common.misc.C12120d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15561w1;

@Metadata(mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/hardware/Android29Hardware;", "Ldev/skomlach/biometric/compat/utils/hardware/Android28Hardware;", "authRequest", "Ldev/skomlach/biometric/compat/BiometricAuthRequest;", "(Ldev/skomlach/biometric/compat/BiometricAuthRequest;)V", "isAnyBiometricEnrolled", "", "()Z", "isAnyHardwareAvailable", "Companion", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: Android29Hardware.kt */
public final class Android29Hardware extends Android28Hardware {
    public static final Companion Companion;
    /* access modifiers changed from: private */
    public static final Context appContext = C12104a.f58372a.mo68283g();
    /* access modifiers changed from: private */
    public static AtomicInteger cachedCanAuthenticateValue = new AtomicInteger(12);
    /* access modifiers changed from: private */
    public static long checkStartedTs;
    /* access modifiers changed from: private */
    public static C15561w1 job;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0003R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/hardware/Android29Hardware$Companion;", "", "", "canAuthenticate", "Lja/u;", "updateCodeSync", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "Ljava/util/concurrent/atomic/AtomicInteger;", "cachedCanAuthenticateValue", "Ljava/util/concurrent/atomic/AtomicInteger;", "", "checkStartedTs", "J", "Lkotlinx/coroutines/w1;", "job", "Lkotlinx/coroutines/w1;", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: Android29Hardware.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final int canAuthenticate() {
            C15561w1 access$getJob$cp = Android29Hardware.job;
            boolean z = false;
            if ((access$getJob$cp != null && access$getJob$cp.mo74487b()) && System.currentTimeMillis() - Android29Hardware.checkStartedTs >= TimeUnit.SECONDS.toMillis(30)) {
                C15561w1 access$getJob$cp2 = Android29Hardware.job;
                if (access$getJob$cp2 != null) {
                    C15561w1.C15562a.m94723a(access$getJob$cp2, (CancellationException) null, 1, (Object) null);
                }
                Android29Hardware.job = null;
            }
            C15561w1 access$getJob$cp3 = Android29Hardware.job;
            if (access$getJob$cp3 != null && access$getJob$cp3.mo74487b()) {
                z = true;
            }
            if (!z) {
                Android29Hardware.checkStartedTs = System.currentTimeMillis();
                Android29Hardware.job = C15473j.m94492d(C15503p1.f64723a, C15186a1.m93730b(), (C15486m0) null, new Android29Hardware$Companion$canAuthenticate$1((C13635d<? super Android29Hardware$Companion$canAuthenticate$1>) null), 2, (Object) null);
            }
            return Android29Hardware.cachedCanAuthenticateValue.get();
        }

        /* access modifiers changed from: private */
        public final void updateCodeSync() {
            int i = 12;
            try {
                BiometricManager biometricManager = (BiometricManager) Android29Hardware.appContext.getSystemService(BiometricManager.class);
                if (biometricManager == null) {
                    biometricManager = (BiometricManager) Android29Hardware.appContext.getSystemService(BiometricNotificationManager.CHANNEL_ID);
                }
                if (biometricManager != null) {
                    if (C12120d.f58384a.mo68315b()) {
                        i = biometricManager.canAuthenticate(255);
                    } else {
                        i = biometricManager.canAuthenticate();
                    }
                }
                BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
                biometricLoggerImpl.mo68220e("Android29Hardware - canAuthenticate=" + i);
            } catch (Throwable th) {
                BiometricLoggerImpl biometricLoggerImpl2 = BiometricLoggerImpl.INSTANCE;
                biometricLoggerImpl2.mo68220e("Android29Hardware - canAuthenticate=" + 12);
                Android29Hardware.cachedCanAuthenticateValue.set(12);
                throw th;
            }
            Android29Hardware.cachedCanAuthenticateValue.set(i);
        }
    }

    static {
        Companion companion = new Companion((C13695i) null);
        Companion = companion;
        int unused = companion.canAuthenticate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Android29Hardware(BiometricAuthRequest biometricAuthRequest) {
        super(biometricAuthRequest);
        C13706o.m87929f(biometricAuthRequest, "authRequest");
    }

    public boolean isAnyBiometricEnrolled() {
        int access$canAuthenticate = Companion.canAuthenticate();
        if (access$canAuthenticate == 0) {
            return true;
        }
        return (access$canAuthenticate == 11 || access$canAuthenticate == 15) ? false : true;
    }

    public boolean isAnyHardwareAvailable() {
        int access$canAuthenticate = Companion.canAuthenticate();
        if (access$canAuthenticate == 0) {
            return true;
        }
        return (access$canAuthenticate == 12 || access$canAuthenticate == 15) ? false : true;
    }
}

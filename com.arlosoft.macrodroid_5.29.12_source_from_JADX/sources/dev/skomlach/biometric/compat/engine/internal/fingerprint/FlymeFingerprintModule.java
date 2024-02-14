package dev.skomlach.biometric.compat.engine.internal.fingerprint;

import android.os.IBinder;
import androidx.core.p007os.CancellationSignal;
import com.fingerprints.service.FingerprintManager;
import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.BiometricCryptoObject;
import dev.skomlach.biometric.compat.engine.BiometricInitListener;
import dev.skomlach.biometric.compat.engine.BiometricMethod;
import dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener;
import dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate;
import dev.skomlach.biometric.compat.engine.internal.AbstractBiometricModule;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J0\u0010\u0015\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\u000b8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001b¨\u0006#"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/fingerprint/FlymeFingerprintModule;", "Ldev/skomlach/biometric/compat/engine/internal/AbstractBiometricModule;", "Lja/u;", "cancelFingerprintServiceFingerprintRequest", "", "", "getManagers", "manager", "", "", "getIds", "", "hasEnrolled", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "authenticate", "Lcom/fingerprints/service/FingerprintManager;", "mFingerprintServiceFingerprintManager", "Lcom/fingerprints/service/FingerprintManager;", "isManagerAccessible", "Z", "()Z", "setManagerAccessible", "(Z)V", "isUserAuthCanByUsedWithCrypto", "isHardwarePresent", "Ldev/skomlach/biometric/compat/engine/BiometricInitListener;", "<init>", "(Ldev/skomlach/biometric/compat/engine/BiometricInitListener;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: FlymeFingerprintModule.kt */
public final class FlymeFingerprintModule extends AbstractBiometricModule {
    private boolean isManagerAccessible;
    private FingerprintManager mFingerprintServiceFingerprintManager;

    public FlymeFingerprintModule(BiometricInitListener biometricInitListener) {
        super(BiometricMethod.FINGERPRINT_FLYME);
        boolean z;
        try {
            if (((IBinder) Class.forName("android.os.ServiceManager").getMethod("getService", new Class[]{String.class}).invoke((Object) null, new Object[]{"fingerprints_service"})) != null) {
                FingerprintManager open = FingerprintManager.open();
                this.mFingerprintServiceFingerprintManager = open;
                if (open != null) {
                    if (open != null && open.isSurpport()) {
                        z = true;
                        setManagerAccessible(z);
                    }
                }
                z = false;
                setManagerAccessible(z);
            }
        } catch (Throwable th) {
            cancelFingerprintServiceFingerprintRequest();
            throw th;
        }
        cancelFingerprintServiceFingerprintRequest();
        if (biometricInitListener != null) {
            biometricInitListener.initFinished(getBiometricMethod(), this);
        }
    }

    /* access modifiers changed from: private */
    public final void cancelFingerprintServiceFingerprintRequest() {
        try {
            FingerprintManager fingerprintManager = this.mFingerprintServiceFingerprintManager;
            if (fingerprintManager != null) {
                fingerprintManager.abort();
            }
            FingerprintManager fingerprintManager2 = this.mFingerprintServiceFingerprintManager;
            if (fingerprintManager2 != null) {
                fingerprintManager2.release();
            }
            this.mFingerprintServiceFingerprintManager = null;
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
        }
    }

    public void authenticate(BiometricCryptoObject biometricCryptoObject, CancellationSignal cancellationSignal, AuthenticationListener authenticationListener, RestartPredicate restartPredicate) throws SecurityException {
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String name = getName();
        BiometricMethod biometricMethod = getBiometricMethod();
        biometricLoggerImpl.mo68217d(name + ".authenticate - " + biometricMethod + "; Crypto=" + biometricCryptoObject);
        if (isManagerAccessible()) {
            try {
                cancelFingerprintServiceFingerprintRequest();
                this.mFingerprintServiceFingerprintManager = FingerprintManager.open();
                FlymeFingerprintModule$authenticate$callback$1 flymeFingerprintModule$authenticate$callback$1 = new FlymeFingerprintModule$authenticate$callback$1(this, authenticationListener, biometricCryptoObject, cancellationSignal, restartPredicate);
                FingerprintManager fingerprintManager = this.mFingerprintServiceFingerprintManager;
                if (fingerprintManager != null) {
                    fingerprintManager.startIdentify(flymeFingerprintModule$authenticate$callback$1, fingerprintManager != null ? fingerprintManager.getIds() : null);
                    return;
                }
                return;
            } catch (Throwable th) {
                BiometricLoggerImpl biometricLoggerImpl2 = BiometricLoggerImpl.INSTANCE;
                String name2 = getName();
                biometricLoggerImpl2.mo68219e(th, name2 + ": authenticate failed unexpectedly");
            }
        }
        if (authenticationListener != null) {
            authenticationListener.onFailure(AuthenticationFailureReason.UNKNOWN, tag());
        }
        cancelFingerprintServiceFingerprintRequest();
    }

    public List<String> getIds(Object obj) {
        int[] ids;
        C13706o.m87929f(obj, "manager");
        ArrayList arrayList = new ArrayList();
        FingerprintManager fingerprintManager = this.mFingerprintServiceFingerprintManager;
        if (!(fingerprintManager == null || (ids = fingerprintManager.getIds()) == null)) {
            C13706o.m87928e(ids, "ids");
            for (int valueOf : ids) {
                arrayList.add(String.valueOf(valueOf));
            }
        }
        return arrayList;
    }

    public Set<Object> getManagers() {
        HashSet hashSet = new HashSet();
        FingerprintManager fingerprintManager = this.mFingerprintServiceFingerprintManager;
        if (fingerprintManager != null) {
            hashSet.add(fingerprintManager);
        }
        return hashSet;
    }

    public boolean hasEnrolled() {
        boolean z = false;
        if (isManagerAccessible()) {
            try {
                FingerprintManager open = FingerprintManager.open();
                this.mFingerprintServiceFingerprintManager = open;
                int[] ids = open != null ? open.getIds() : null;
                if (ids != null) {
                    if (!(ids.length == 0)) {
                        z = true;
                    }
                }
                return z;
            } catch (Throwable th) {
                BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            } finally {
                cancelFingerprintServiceFingerprintRequest();
            }
        }
        return false;
    }

    public boolean isHardwarePresent() {
        boolean z = false;
        if (isManagerAccessible()) {
            try {
                FingerprintManager open = FingerprintManager.open();
                this.mFingerprintServiceFingerprintManager = open;
                if (open != null && open.isFingerEnable()) {
                    z = true;
                }
                return z;
            } catch (Throwable th) {
                BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            } finally {
                cancelFingerprintServiceFingerprintRequest();
            }
        }
        return false;
    }

    public boolean isManagerAccessible() {
        return this.isManagerAccessible;
    }

    public boolean isUserAuthCanByUsedWithCrypto() {
        return false;
    }

    public void setManagerAccessible(boolean z) {
        this.isManagerAccessible = z;
    }
}

package dev.skomlach.biometric.compat.engine.internal.fingerprint;

import android.app.Activity;
import android.util.SparseArray;
import androidx.core.p007os.CancellationSignal;
import com.samsung.android.sdk.pass.Spass;
import com.samsung.android.sdk.pass.SpassFingerprint;
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

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010#¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J0\u0010\u0015\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u000e\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006&"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/fingerprint/SamsungFingerprintModule;", "Ldev/skomlach/biometric/compat/engine/internal/AbstractBiometricModule;", "Lja/u;", "cancelFingerprintRequest", "", "", "getManagers", "manager", "", "", "getIds", "", "hasEnrolled", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "authenticate", "Landroid/app/Activity;", "context", "openSettings", "Lcom/samsung/android/sdk/pass/Spass;", "mSpass", "Lcom/samsung/android/sdk/pass/Spass;", "Lcom/samsung/android/sdk/pass/SpassFingerprint;", "mSpassFingerprint", "Lcom/samsung/android/sdk/pass/SpassFingerprint;", "isUserAuthCanByUsedWithCrypto", "()Z", "isManagerAccessible", "isHardwarePresent", "Ldev/skomlach/biometric/compat/engine/BiometricInitListener;", "<init>", "(Ldev/skomlach/biometric/compat/engine/BiometricInitListener;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: SamsungFingerprintModule.kt */
public final class SamsungFingerprintModule extends AbstractBiometricModule {
    private Spass mSpass;
    private SpassFingerprint mSpassFingerprint;

    public SamsungFingerprintModule(BiometricInitListener biometricInitListener) {
        super(BiometricMethod.FINGERPRINT_SAMSUNG);
        try {
            Spass spass = new Spass();
            this.mSpass = spass;
            spass.initialize(getContext());
            Spass spass2 = this.mSpass;
            if (!(spass2 != null && !spass2.isFeatureEnabled(0))) {
                this.mSpassFingerprint = new SpassFingerprint(getContext());
                if (biometricInitListener != null) {
                    biometricInitListener.initFinished(getBiometricMethod(), this);
                    return;
                }
                return;
            }
            throw new RuntimeException("No hardware");
        } catch (Throwable th) {
            if (AbstractBiometricModule.Companion.getDEBUG_MANAGERS()) {
                BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            }
            this.mSpass = null;
            this.mSpassFingerprint = null;
        }
    }

    private final void cancelFingerprintRequest() {
        try {
            SpassFingerprint spassFingerprint = this.mSpassFingerprint;
            if (spassFingerprint != null) {
                spassFingerprint.cancelIdentify();
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: openSettings$lambda-8  reason: not valid java name */
    public static final void m101306openSettings$lambda8() {
    }

    public void authenticate(BiometricCryptoObject biometricCryptoObject, CancellationSignal cancellationSignal, AuthenticationListener authenticationListener, RestartPredicate restartPredicate) throws SecurityException {
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String name = getName();
        BiometricMethod biometricMethod = getBiometricMethod();
        biometricLoggerImpl.mo68217d(name + ".authenticate - " + biometricMethod + "; Crypto=" + biometricCryptoObject);
        SpassFingerprint spassFingerprint = this.mSpassFingerprint;
        if (spassFingerprint != null) {
            try {
                cancelFingerprintRequest();
                spassFingerprint.startIdentify(new SamsungFingerprintModule$authenticate$1$callback$1(this, authenticationListener, biometricCryptoObject, cancellationSignal, restartPredicate));
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
    }

    public List<String> getIds(Object obj) {
        SparseArray registeredFingerprintName;
        SparseArray registeredFingerprintUniqueID;
        C13706o.m87929f(obj, "manager");
        ArrayList arrayList = new ArrayList();
        try {
            SpassFingerprint spassFingerprint = this.mSpassFingerprint;
            if (!(spassFingerprint == null || (registeredFingerprintUniqueID = spassFingerprint.getRegisteredFingerprintUniqueID()) == null)) {
                C13706o.m87928e(registeredFingerprintUniqueID, "registeredFingerprintUniqueID");
                int size = registeredFingerprintUniqueID.size();
                for (int i = 0; i < size; i++) {
                    Object obj2 = registeredFingerprintUniqueID.get(i);
                    String str = obj2 instanceof String ? (String) obj2 : null;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
            }
        } catch (Throwable unused) {
            SpassFingerprint spassFingerprint2 = this.mSpassFingerprint;
            if (!(spassFingerprint2 == null || (registeredFingerprintName = spassFingerprint2.getRegisteredFingerprintName()) == null)) {
                C13706o.m87928e(registeredFingerprintName, "registeredFingerprintName");
                int size2 = registeredFingerprintName.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Object obj3 = registeredFingerprintName.get(i2);
                    String str2 = obj3 instanceof String ? (String) obj3 : null;
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                }
            }
        }
        return arrayList;
    }

    public Set<Object> getManagers() {
        HashSet hashSet = new HashSet();
        SpassFingerprint spassFingerprint = this.mSpassFingerprint;
        if (spassFingerprint != null) {
            hashSet.add(spassFingerprint);
        }
        return hashSet;
    }

    public boolean hasEnrolled() {
        try {
            SpassFingerprint spassFingerprint = this.mSpassFingerprint;
            return spassFingerprint != null && spassFingerprint.hasRegisteredFinger();
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
        }
    }

    public boolean isHardwarePresent() {
        try {
            Spass spass = this.mSpass;
            return spass != null && spass.isFeatureEnabled(0);
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, getName());
            return false;
        }
    }

    public boolean isManagerAccessible() {
        return (this.mSpass == null || this.mSpassFingerprint == null) ? false : true;
    }

    public boolean isUserAuthCanByUsedWithCrypto() {
        return false;
    }

    public final boolean openSettings(Activity activity) {
        C13706o.m87929f(activity, "context");
        try {
            SpassFingerprint spassFingerprint = this.mSpassFingerprint;
            if (spassFingerprint != null) {
                spassFingerprint.registerFinger(activity, C12038a.f58251a);
            }
            return true;
        } catch (Exception e) {
            BiometricLoggerImpl.INSTANCE.mo68219e(e, getName());
            return false;
        }
    }
}

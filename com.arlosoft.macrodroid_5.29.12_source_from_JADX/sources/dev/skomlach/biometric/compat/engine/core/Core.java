package dev.skomlach.biometric.compat.engine.core;

import androidx.core.p007os.CancellationSignal;
import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.BiometricCryptoObject;
import dev.skomlach.biometric.compat.BiometricCryptographyPurpose;
import dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener;
import dev.skomlach.biometric.compat.engine.core.interfaces.BiometricModule;
import dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\b\u001a\u00020\u0007J(\u0010\u000f\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J,\u0010\u000f\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u0012\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bRT\u0010\u0018\u001aB\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00160\u0016 \u0015* \u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00160\u0016\u0018\u00010\u00170\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019RT\u0010\u001b\u001aB\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u001a0\u001a\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00040\u0004 \u0015* \u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u001a0\u001a\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00170\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001d¨\u0006!"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/core/Core;", "", "Lja/u;", "cleanModules", "Ldev/skomlach/biometric/compat/engine/core/interfaces/BiometricModule;", "module", "registerModule", "", "hasEnrolled", "Ldev/skomlach/biometric/compat/BiometricCryptographyPurpose;", "purpose", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "listener", "Ldev/skomlach/biometric/compat/engine/core/interfaces/RestartPredicate;", "restartPredicate", "authenticate", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "cancelAuthentication", "authenticateWithoutRestart", "", "kotlin.jvm.PlatformType", "Landroidx/core/os/CancellationSignal;", "", "cancellationSignals", "Ljava/util/Map;", "", "reprintModuleHashMap", "isLockOut", "()Z", "isHardwareDetected", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: Core.kt */
public final class Core {
    public static final Core INSTANCE = new Core();
    private static final Map<BiometricModule, CancellationSignal> cancellationSignals = Collections.synchronizedMap(new HashMap());
    private static final Map<Integer, BiometricModule> reprintModuleHashMap = Collections.synchronizedMap(new HashMap());

    private Core() {
    }

    public static /* synthetic */ void authenticate$default(Core core, BiometricCryptographyPurpose biometricCryptographyPurpose, AuthenticationListener authenticationListener, RestartPredicate restartPredicate, int i, Object obj) {
        if ((i & 4) != 0) {
            restartPredicate = RestartPredicatesImpl.defaultPredicate();
        }
        core.authenticate(biometricCryptographyPurpose, authenticationListener, restartPredicate);
    }

    public final void authenticate(BiometricCryptographyPurpose biometricCryptographyPurpose, AuthenticationListener authenticationListener) {
        authenticate$default(this, biometricCryptographyPurpose, authenticationListener, (RestartPredicate) null, 4, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c0, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c1, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00df, code lost:
        r9 = dev.skomlach.biometric.compat.AuthenticationFailureReason.INTERNAL_ERROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e1, code lost:
        if (r2 != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e3, code lost:
        r11 = r2.tag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e8, code lost:
        r11 = new dev.skomlach.biometric.compat.engine.internal.DummyBiometricModule((dev.skomlach.biometric.compat.engine.BiometricInitListener) null).tag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f1, code lost:
        r10.onFailure(r9, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c0 A[Catch:{ BiometricCryptoException -> 0x0084, all -> 0x00c0, BiometricCryptoException -> 0x00c3, all -> 0x00c0 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:9:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void authenticate(dev.skomlach.biometric.compat.BiometricCryptographyPurpose r9, dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener r10, dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate r11) {
        /*
            r8 = this;
            r0 = 0
            java.util.Map<java.lang.Integer, dev.skomlach.biometric.compat.engine.core.interfaces.BiometricModule> r1 = reprintModuleHashMap     // Catch:{ BiometricCryptoException -> 0x00f5, all -> 0x00d6 }
            java.util.Collection r1 = r1.values()     // Catch:{ BiometricCryptoException -> 0x00f5, all -> 0x00d6 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ BiometricCryptoException -> 0x00f5, all -> 0x00d6 }
            r2 = r0
        L_0x000c:
            boolean r3 = r1.hasNext()     // Catch:{ BiometricCryptoException -> 0x00d4, all -> 0x00d2 }
            if (r3 == 0) goto L_0x0113
            java.lang.Object r3 = r1.next()     // Catch:{ BiometricCryptoException -> 0x00d4, all -> 0x00d2 }
            dev.skomlach.biometric.compat.engine.core.interfaces.BiometricModule r3 = (dev.skomlach.biometric.compat.engine.core.interfaces.BiometricModule) r3     // Catch:{ BiometricCryptoException -> 0x00d4, all -> 0x00d2 }
            if (r9 == 0) goto L_0x00c6
            boolean r2 = r3.isUserAuthCanByUsedWithCrypto()     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            r4 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r5 = "BiometricModule"
            if (r2 != 0) goto L_0x0066
            boolean r2 = r3.isBiometricEnrollChanged()     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            if (r2 == 0) goto L_0x0066
            int r2 = r9.getPurpose()     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            if (r2 != r4) goto L_0x0048
            dev.skomlach.biometric.compat.crypto.BiometricCryptoObjectHelper r2 = dev.skomlach.biometric.compat.crypto.BiometricCryptoObjectHelper.INSTANCE     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            int r4 = r3.tag()     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            r6.<init>()     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            r6.append(r5)     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            r6.append(r4)     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            java.lang.String r4 = r6.toString()     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            r2.deleteCrypto(r4)     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
        L_0x0048:
            dev.skomlach.biometric.compat.crypto.BiometricCryptoObjectHelper r2 = dev.skomlach.biometric.compat.crypto.BiometricCryptoObjectHelper.INSTANCE     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            int r4 = r3.tag()     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            r6.<init>()     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            r6.append(r5)     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            r6.append(r4)     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            java.lang.String r4 = r6.toString()     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            boolean r5 = r3.isUserAuthCanByUsedWithCrypto()     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            dev.skomlach.biometric.compat.BiometricCryptoObject r2 = r2.getBiometricCryptoObject(r4, r9, r5)     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            goto L_0x00c7
        L_0x0066:
            dev.skomlach.biometric.compat.crypto.BiometricCryptoObjectHelper r2 = dev.skomlach.biometric.compat.crypto.BiometricCryptoObjectHelper.INSTANCE     // Catch:{ BiometricCryptoException -> 0x0084, all -> 0x00c0 }
            int r6 = r3.tag()     // Catch:{ BiometricCryptoException -> 0x0084, all -> 0x00c0 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ BiometricCryptoException -> 0x0084, all -> 0x00c0 }
            r7.<init>()     // Catch:{ BiometricCryptoException -> 0x0084, all -> 0x00c0 }
            r7.append(r5)     // Catch:{ BiometricCryptoException -> 0x0084, all -> 0x00c0 }
            r7.append(r6)     // Catch:{ BiometricCryptoException -> 0x0084, all -> 0x00c0 }
            java.lang.String r6 = r7.toString()     // Catch:{ BiometricCryptoException -> 0x0084, all -> 0x00c0 }
            boolean r7 = r3.isUserAuthCanByUsedWithCrypto()     // Catch:{ BiometricCryptoException -> 0x0084, all -> 0x00c0 }
            dev.skomlach.biometric.compat.BiometricCryptoObject r2 = r2.getBiometricCryptoObject(r6, r9, r7)     // Catch:{ BiometricCryptoException -> 0x0084, all -> 0x00c0 }
            goto L_0x00c7
        L_0x0084:
            r2 = move-exception
            int r6 = r9.getPurpose()     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            if (r6 != r4) goto L_0x00bf
            dev.skomlach.biometric.compat.crypto.BiometricCryptoObjectHelper r2 = dev.skomlach.biometric.compat.crypto.BiometricCryptoObjectHelper.INSTANCE     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            int r4 = r3.tag()     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            r6.<init>()     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            r6.append(r5)     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            r6.append(r4)     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            java.lang.String r4 = r6.toString()     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            r2.deleteCrypto(r4)     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            int r4 = r3.tag()     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            r6.<init>()     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            r6.append(r5)     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            r6.append(r4)     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            java.lang.String r4 = r6.toString()     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            boolean r5 = r3.isUserAuthCanByUsedWithCrypto()     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            dev.skomlach.biometric.compat.BiometricCryptoObject r2 = r2.getBiometricCryptoObject(r4, r9, r5)     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            goto L_0x00c7
        L_0x00bf:
            throw r2     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
        L_0x00c0:
            r9 = move-exception
            r2 = r3
            goto L_0x00d8
        L_0x00c3:
            r9 = move-exception
            r2 = r3
            goto L_0x00f7
        L_0x00c6:
            r2 = r0
        L_0x00c7:
            java.lang.String r4 = "module"
            kotlin.jvm.internal.C13706o.m87928e(r3, r4)     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            r8.authenticate(r2, r3, r10, r11)     // Catch:{ BiometricCryptoException -> 0x00c3, all -> 0x00c0 }
            r2 = r3
            goto L_0x000c
        L_0x00d2:
            r9 = move-exception
            goto L_0x00d8
        L_0x00d4:
            r9 = move-exception
            goto L_0x00f7
        L_0x00d6:
            r9 = move-exception
            r2 = r0
        L_0x00d8:
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r11 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r11.mo68218e((java.lang.Throwable) r9)
            if (r10 == 0) goto L_0x0113
            dev.skomlach.biometric.compat.AuthenticationFailureReason r9 = dev.skomlach.biometric.compat.AuthenticationFailureReason.INTERNAL_ERROR
            if (r2 == 0) goto L_0x00e8
            int r11 = r2.tag()
            goto L_0x00f1
        L_0x00e8:
            dev.skomlach.biometric.compat.engine.internal.DummyBiometricModule r11 = new dev.skomlach.biometric.compat.engine.internal.DummyBiometricModule
            r11.<init>(r0)
            int r11 = r11.tag()
        L_0x00f1:
            r10.onFailure(r9, r11)
            goto L_0x0113
        L_0x00f5:
            r9 = move-exception
            r2 = r0
        L_0x00f7:
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r11 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r11.mo68218e((java.lang.Throwable) r9)
            if (r10 == 0) goto L_0x0113
            dev.skomlach.biometric.compat.AuthenticationFailureReason r9 = dev.skomlach.biometric.compat.AuthenticationFailureReason.CRYPTO_ERROR
            if (r2 == 0) goto L_0x0107
            int r11 = r2.tag()
            goto L_0x0110
        L_0x0107:
            dev.skomlach.biometric.compat.engine.internal.DummyBiometricModule r11 = new dev.skomlach.biometric.compat.engine.internal.DummyBiometricModule
            r11.<init>(r0)
            int r11 = r11.tag()
        L_0x0110:
            r10.onFailure(r9, r11)
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.engine.core.Core.authenticate(dev.skomlach.biometric.compat.BiometricCryptographyPurpose, dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener, dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate):void");
    }

    public final void authenticateWithoutRestart(BiometricCryptographyPurpose biometricCryptographyPurpose, AuthenticationListener authenticationListener) {
        authenticate(biometricCryptographyPurpose, authenticationListener, RestartPredicatesImpl.INSTANCE.neverRestart());
    }

    public final void cancelAuthentication() {
        for (BiometricModule next : reprintModuleHashMap.values()) {
            C13706o.m87928e(next, "module");
            cancelAuthentication(next);
        }
    }

    public final void cleanModules() {
        try {
            reprintModuleHashMap.clear();
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    public final boolean hasEnrolled() {
        try {
            for (BiometricModule hasEnrolled : reprintModuleHashMap.values()) {
                if (hasEnrolled.hasEnrolled()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
            return false;
        }
    }

    public final boolean isHardwareDetected() {
        try {
            for (BiometricModule isHardwarePresent : reprintModuleHashMap.values()) {
                if (isHardwarePresent.isHardwarePresent()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
            return false;
        }
    }

    public final boolean isLockOut() {
        try {
            for (BiometricModule isLockOut : reprintModuleHashMap.values()) {
                if (isLockOut.isLockOut()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
            return false;
        }
    }

    public final void registerModule(BiometricModule biometricModule) {
        if (biometricModule != null) {
            try {
                Map<Integer, BiometricModule> map = reprintModuleHashMap;
                if (!map.containsKey(Integer.valueOf(biometricModule.tag()))) {
                    if (biometricModule.isHardwarePresent()) {
                        C13706o.m87928e(map, "reprintModuleHashMap");
                        map.put(Integer.valueOf(biometricModule.tag()), biometricModule);
                    }
                }
            } catch (Throwable th) {
                BiometricLoggerImpl.INSTANCE.mo68218e(th);
            }
        }
    }

    public final void cancelAuthentication(BiometricModule biometricModule) {
        C13706o.m87929f(biometricModule, "module");
        try {
            Map<BiometricModule, CancellationSignal> map = cancellationSignals;
            CancellationSignal cancellationSignal = map.get(biometricModule);
            if (cancellationSignal != null && !cancellationSignal.isCanceled()) {
                cancellationSignal.cancel();
            }
            map.remove(biometricModule);
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    public final void authenticate(BiometricCryptoObject biometricCryptoObject, BiometricModule biometricModule, AuthenticationListener authenticationListener, RestartPredicate restartPredicate) {
        C13706o.m87929f(biometricModule, "module");
        try {
            if (!biometricModule.isHardwarePresent() || !biometricModule.hasEnrolled() || biometricModule.isLockOut()) {
                String simpleName = biometricModule.getClass().getSimpleName();
                throw new RuntimeException("Module " + simpleName + " not ready");
            }
            cancelAuthentication(biometricModule);
            CancellationSignal cancellationSignal = new CancellationSignal();
            Map<BiometricModule, CancellationSignal> map = cancellationSignals;
            C13706o.m87928e(map, "cancellationSignals");
            map.put(biometricModule, cancellationSignal);
            biometricModule.authenticate(biometricCryptoObject, cancellationSignal, authenticationListener, restartPredicate);
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
            if (authenticationListener != null) {
                authenticationListener.onFailure(AuthenticationFailureReason.INTERNAL_ERROR, biometricModule.tag());
            }
        }
    }
}

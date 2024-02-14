package dev.skomlach.biometric.compat.utils;

import android.content.SharedPreferences;
import dev.skomlach.biometric.compat.BiometricType;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p269g9.C12317a;
import p297ja.C13329n;
import p297ja.C13332o;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/BiometricLockoutFix;", "", "Ldev/skomlach/biometric/compat/BiometricType;", "biometricType", "Lja/u;", "lockout", "", "isLockOut", "", "TS_PREF", "Ljava/lang/String;", "", "timeout", "J", "Landroid/content/SharedPreferences;", "preferences", "Landroid/content/SharedPreferences;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricLockoutFix.kt */
public final class BiometricLockoutFix {
    public static final BiometricLockoutFix INSTANCE = new BiometricLockoutFix();
    public static final String TS_PREF = "timestamp_";
    private static final ReentrantLock lock = new ReentrantLock();
    private static final SharedPreferences preferences = C12317a.f58995a.mo68640a("BiometricCompat_Storage");
    private static final long timeout = TimeUnit.SECONDS.toMillis(31);

    private BiometricLockoutFix() {
    }

    public final boolean isLockOut(BiometricType biometricType) {
        C13706o.m87929f(biometricType, "biometricType");
        try {
            ReentrantLock reentrantLock = lock;
            C13329n.C13330a aVar = C13329n.f61327a;
            reentrantLock.lock();
            C13329n.m85676a(C13339u.f61331a);
        } catch (Throwable th) {
            ReentrantLock reentrantLock2 = lock;
            try {
                C13329n.C13330a aVar2 = C13329n.f61327a;
                reentrantLock2.unlock();
                C13329n.m85676a(C13339u.f61331a);
            } catch (Throwable th2) {
                C13329n.C13330a aVar3 = C13329n.f61327a;
                C13329n.m85676a(C13332o.m85684a(th2));
            }
            throw th;
        }
        SharedPreferences sharedPreferences = preferences;
        String name = biometricType.name();
        long j = sharedPreferences.getLong("timestamp_-" + name, 0);
        boolean z = true;
        if (j <= 0) {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String name2 = biometricType.name();
            biometricLoggerImpl.mo68217d("BiometricLockoutFix.lockout is FALSE(2) for " + name2);
        } else if (System.currentTimeMillis() - j >= timeout) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            String name3 = biometricType.name();
            edit.putLong("timestamp_-" + name3, 0).apply();
            BiometricLoggerImpl biometricLoggerImpl2 = BiometricLoggerImpl.INSTANCE;
            String name4 = biometricType.name();
            biometricLoggerImpl2.mo68217d("BiometricLockoutFix.lockout is FALSE(1) for " + name4);
        } else {
            BiometricLoggerImpl biometricLoggerImpl3 = BiometricLoggerImpl.INSTANCE;
            String name5 = biometricType.name();
            biometricLoggerImpl3.mo68217d("BiometricLockoutFix.lockout is TRUE for " + name5);
            ReentrantLock reentrantLock3 = lock;
            C13329n.C13330a aVar4 = C13329n.f61327a;
            reentrantLock3.unlock();
            C13329n.m85676a(C13339u.f61331a);
            return z;
        }
        z = false;
        ReentrantLock reentrantLock32 = lock;
        try {
            C13329n.C13330a aVar42 = C13329n.f61327a;
            reentrantLock32.unlock();
            C13329n.m85676a(C13339u.f61331a);
        } catch (Throwable th3) {
            C13329n.C13330a aVar5 = C13329n.f61327a;
            C13329n.m85676a(C13332o.m85684a(th3));
        }
        return z;
    }

    public final void lockout(BiometricType biometricType) {
        C13706o.m87929f(biometricType, "biometricType");
        try {
            ReentrantLock reentrantLock = lock;
            C13329n.C13330a aVar = C13329n.f61327a;
            reentrantLock.lock();
            C13329n.m85676a(C13339u.f61331a);
        } catch (Throwable th) {
            ReentrantLock reentrantLock2 = lock;
            try {
                C13329n.C13330a aVar2 = C13329n.f61327a;
                reentrantLock2.unlock();
                C13329n.m85676a(C13339u.f61331a);
            } catch (Throwable th2) {
                C13329n.C13330a aVar3 = C13329n.f61327a;
                C13329n.m85676a(C13332o.m85684a(th2));
            }
            throw th;
        }
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String name = biometricType.name();
        biometricLoggerImpl.mo68217d("BiometricLockoutFix.setLockout for " + name);
        SharedPreferences.Editor edit = preferences.edit();
        String name2 = biometricType.name();
        edit.putLong("timestamp_-" + name2, System.currentTimeMillis()).apply();
        ReentrantLock reentrantLock3 = lock;
        try {
            C13329n.C13330a aVar4 = C13329n.f61327a;
            reentrantLock3.unlock();
            C13329n.m85676a(C13339u.f61331a);
        } catch (Throwable th3) {
            C13329n.C13330a aVar5 = C13329n.f61327a;
            C13329n.m85676a(C13332o.m85684a(th3));
        }
    }
}

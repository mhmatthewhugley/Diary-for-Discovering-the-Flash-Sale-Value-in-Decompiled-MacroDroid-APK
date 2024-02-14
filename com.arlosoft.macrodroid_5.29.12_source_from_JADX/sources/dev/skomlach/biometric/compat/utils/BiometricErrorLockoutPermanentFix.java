package dev.skomlach.biometric.compat.utils;

import android.content.SharedPreferences;
import dev.skomlach.biometric.compat.BiometricType;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p269g9.C12317a;
import p297ja.C13329n;
import p297ja.C13332o;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\n\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/BiometricErrorLockoutPermanentFix;", "", "Ldev/skomlach/biometric/compat/BiometricType;", "type", "Lja/u;", "setBiometricSensorPermanentlyLocked", "resetBiometricSensorPermanentlyLocked", "", "isBiometricSensorPermanentlyLocked", "", "TS_PREF", "Ljava/lang/String;", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricErrorLockoutPermanentFix.kt */
public final class BiometricErrorLockoutPermanentFix {
    public static final BiometricErrorLockoutPermanentFix INSTANCE = new BiometricErrorLockoutPermanentFix();
    private static final String TS_PREF = "user_unlock_device";
    private static final ReentrantLock lock = new ReentrantLock();
    private static final SharedPreferences sharedPreferences = C12317a.f58995a.mo68640a("BiometricCompat_ErrorLockoutPermanentFix");

    private BiometricErrorLockoutPermanentFix() {
    }

    public final boolean isBiometricSensorPermanentlyLocked(BiometricType biometricType) {
        C13706o.m87929f(biometricType, "type");
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
        boolean z = !sharedPreferences.getBoolean("user_unlock_device-" + biometricType.name(), true);
        ReentrantLock reentrantLock3 = lock;
        try {
            C13329n.C13330a aVar4 = C13329n.f61327a;
            reentrantLock3.unlock();
            C13329n.m85676a(C13339u.f61331a);
        } catch (Throwable th3) {
            C13329n.C13330a aVar5 = C13329n.f61327a;
            C13329n.m85676a(C13332o.m85684a(th3));
        }
        return z;
    }

    public final void resetBiometricSensorPermanentlyLocked() {
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
        sharedPreferences.edit().clear().apply();
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

    public final void setBiometricSensorPermanentlyLocked(BiometricType biometricType) {
        C13706o.m87929f(biometricType, "type");
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
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String name = biometricType.name();
        edit.putBoolean("user_unlock_device-" + name, false).apply();
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

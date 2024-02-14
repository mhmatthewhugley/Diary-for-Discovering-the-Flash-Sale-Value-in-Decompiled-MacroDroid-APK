package dev.skomlach.biometric.compat.utils.hardware;

import android.content.Context;
import android.content.pm.PackageManager;
import dev.skomlach.biometric.compat.BiometricAuthRequest;
import dev.skomlach.biometric.compat.BiometricType;
import dev.skomlach.biometric.compat.engine.BiometricAuthentication;
import dev.skomlach.biometric.compat.engine.core.interfaces.BiometricModule;
import dev.skomlach.biometric.compat.utils.BiometricLockoutFix;
import dev.skomlach.biometric.compat.utils.LockType;
import dev.skomlach.common.contextprovider.C12104a;
import java.security.KeyStore;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15561w1;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\u0006\u0010\n\u001a\u00020\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011¨\u0006\u001f"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/hardware/Android28Hardware;", "Ldev/skomlach/biometric/compat/utils/hardware/AbstractHardware;", "Ldev/skomlach/biometric/compat/BiometricType;", "type", "", "isHardwareAvailableForType", "isLockedOutForType", "isBiometricEnrolledForType", "Lja/u;", "updateBiometricEnrollChanged", "lockout", "Ljava/util/ArrayList;", "", "getBiometricFeatures", "()Ljava/util/ArrayList;", "biometricFeatures", "getHasAnyHardware", "()Z", "hasAnyHardware", "isAnyLockedOut", "isHardwareAvailable", "isBiometricEnrolled", "isLockedOut", "isBiometricEnrollChanged", "isAnyHardwareAvailable", "isAnyBiometricEnrolled", "Ldev/skomlach/biometric/compat/BiometricAuthRequest;", "authRequest", "<init>", "(Ldev/skomlach/biometric/compat/BiometricAuthRequest;)V", "Companion", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: Android28Hardware.kt */
public class Android28Hardware extends AbstractHardware {
    public static final Companion Companion;
    /* access modifiers changed from: private */
    public static final Context appContext = C12104a.f58372a.mo68283g();
    /* access modifiers changed from: private */
    public static AtomicBoolean cachedIsBiometricEnrollChangedValue = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public static AtomicBoolean cachedIsBiometricEnrolledValue = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public static long checkEnrollChangedStartedTs;
    /* access modifiers changed from: private */
    public static long checkEnrolledStartedTs;
    /* access modifiers changed from: private */
    public static C15561w1 jobEnrollChanged;
    /* access modifiers changed from: private */
    public static C15561w1 jobEnrolled;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0019"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/hardware/Android28Hardware$Companion;", "", "", "biometricEnrollChanged", "Lja/u;", "updateBiometricChanged", "biometricEnrolled", "updateBiometricEnrolled", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cachedIsBiometricEnrollChangedValue", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cachedIsBiometricEnrolledValue", "", "checkEnrollChangedStartedTs", "J", "checkEnrolledStartedTs", "Lkotlinx/coroutines/w1;", "jobEnrollChanged", "Lkotlinx/coroutines/w1;", "jobEnrolled", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: Android28Hardware.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean biometricEnrollChanged() {
            C15561w1 access$getJobEnrollChanged$cp = Android28Hardware.jobEnrollChanged;
            boolean z = false;
            if ((access$getJobEnrollChanged$cp != null && access$getJobEnrollChanged$cp.mo74487b()) && System.currentTimeMillis() - Android28Hardware.checkEnrollChangedStartedTs >= TimeUnit.SECONDS.toMillis(30)) {
                C15561w1 access$getJobEnrollChanged$cp2 = Android28Hardware.jobEnrollChanged;
                if (access$getJobEnrollChanged$cp2 != null) {
                    C15561w1.C15562a.m94723a(access$getJobEnrollChanged$cp2, (CancellationException) null, 1, (Object) null);
                }
                Android28Hardware.jobEnrollChanged = null;
            }
            C15561w1 access$getJobEnrollChanged$cp3 = Android28Hardware.jobEnrollChanged;
            if (access$getJobEnrollChanged$cp3 != null && access$getJobEnrollChanged$cp3.mo74487b()) {
                z = true;
            }
            if (!z) {
                Android28Hardware.checkEnrollChangedStartedTs = System.currentTimeMillis();
                Android28Hardware.jobEnrollChanged = C15473j.m94492d(C15503p1.f64723a, C15186a1.m93730b(), (C15486m0) null, new Android28Hardware$Companion$biometricEnrollChanged$1((C13635d<? super Android28Hardware$Companion$biometricEnrollChanged$1>) null), 2, (Object) null);
            }
            return Android28Hardware.cachedIsBiometricEnrollChangedValue.get();
        }

        /* access modifiers changed from: private */
        public final boolean biometricEnrolled() {
            C15561w1 access$getJobEnrolled$cp = Android28Hardware.jobEnrolled;
            boolean z = false;
            if ((access$getJobEnrolled$cp != null && access$getJobEnrolled$cp.mo74487b()) && System.currentTimeMillis() - Android28Hardware.checkEnrolledStartedTs >= TimeUnit.SECONDS.toMillis(30)) {
                C15561w1 access$getJobEnrolled$cp2 = Android28Hardware.jobEnrolled;
                if (access$getJobEnrolled$cp2 != null) {
                    C15561w1.C15562a.m94723a(access$getJobEnrolled$cp2, (CancellationException) null, 1, (Object) null);
                }
                Android28Hardware.jobEnrolled = null;
            }
            C15561w1 access$getJobEnrolled$cp3 = Android28Hardware.jobEnrolled;
            if (access$getJobEnrolled$cp3 != null && access$getJobEnrolled$cp3.mo74487b()) {
                z = true;
            }
            if (!z) {
                Android28Hardware.checkEnrolledStartedTs = System.currentTimeMillis();
                Android28Hardware.jobEnrolled = C15473j.m94492d(C15503p1.f64723a, C15186a1.m93730b(), (C15486m0) null, new Android28Hardware$Companion$biometricEnrolled$1((C13635d<? super Android28Hardware$Companion$biometricEnrolled$1>) null), 2, (Object) null);
            }
            return Android28Hardware.cachedIsBiometricEnrolledValue.get();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b2, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void updateBiometricChanged() {
            /*
                r6 = this;
                r0 = 1
                java.lang.String r1 = "BiometricKey"
                java.lang.String r2 = "AndroidKeyStore"
                java.security.KeyStore r2 = java.security.KeyStore.getInstance(r2)     // Catch:{ all -> 0x0075 }
                r3 = 0
                r2.load(r3)     // Catch:{ all -> 0x0075 }
                boolean r4 = r2.containsAlias(r1)     // Catch:{ all -> 0x0075 }
                if (r4 == 0) goto L_0x0018
                java.security.Key r2 = r2.getKey(r1, r3)     // Catch:{ all -> 0x0075 }
                goto L_0x0054
            L_0x0018:
                java.lang.String r3 = "AES"
                java.security.Provider r2 = r2.getProvider()     // Catch:{ all -> 0x0075 }
                javax.crypto.KeyGenerator r2 = javax.crypto.KeyGenerator.getInstance(r3, r2)     // Catch:{ all -> 0x0075 }
                android.security.keystore.KeyGenParameterSpec$Builder r3 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch:{ all -> 0x0075 }
                r4 = 3
                r3.<init>(r1, r4)     // Catch:{ all -> 0x0075 }
                java.lang.String r4 = "CBC"
                java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ all -> 0x0075 }
                android.security.keystore.KeyGenParameterSpec$Builder r3 = r3.setBlockModes(r4)     // Catch:{ all -> 0x0075 }
                java.lang.String r4 = "PKCS7Padding"
                java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ all -> 0x0075 }
                android.security.keystore.KeyGenParameterSpec$Builder r3 = r3.setEncryptionPaddings(r4)     // Catch:{ all -> 0x0075 }
                android.security.keystore.KeyGenParameterSpec$Builder r3 = r3.setUserAuthenticationRequired(r0)     // Catch:{ all -> 0x0075 }
                android.security.keystore.KeyGenParameterSpec$Builder r3 = r3.setInvalidatedByBiometricEnrollment(r0)     // Catch:{ all -> 0x0075 }
                java.lang.String r4 = "Builder(\n               …BiometricEnrollment(true)"
                kotlin.jvm.internal.C13706o.m87928e(r3, r4)     // Catch:{ all -> 0x0075 }
                android.security.keystore.KeyGenParameterSpec r3 = r3.build()     // Catch:{ all -> 0x0075 }
                r2.init(r3)     // Catch:{ all -> 0x0075 }
                javax.crypto.SecretKey r2 = r2.generateKey()     // Catch:{ all -> 0x0075 }
            L_0x0054:
                java.lang.String r3 = "AES/CBC/PKCS7Padding"
                javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r3)     // Catch:{ all -> 0x0075 }
                r3.init(r0, r2)     // Catch:{ all -> 0x0075 }
                java.lang.String r2 = "UTF-8"
                java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)     // Catch:{ all -> 0x0075 }
                java.lang.String r4 = "forName(\"UTF-8\")"
                kotlin.jvm.internal.C13706o.m87928e(r2, r4)     // Catch:{ all -> 0x0075 }
                byte[] r1 = r1.getBytes(r2)     // Catch:{ all -> 0x0075 }
                java.lang.String r2 = "this as java.lang.String).getBytes(charset)"
                kotlin.jvm.internal.C13706o.m87928e(r1, r2)     // Catch:{ all -> 0x0075 }
                r3.doFinal(r1)     // Catch:{ all -> 0x0075 }
                goto L_0x00b3
            L_0x0075:
                r1 = move-exception
                boolean r2 = r1 instanceof javax.crypto.IllegalBlockSizeException
                if (r2 == 0) goto L_0x0082
                java.util.concurrent.atomic.AtomicBoolean r1 = dev.skomlach.biometric.compat.utils.hardware.Android28Hardware.cachedIsBiometricEnrollChangedValue
                r1.set(r0)
                return
            L_0x0082:
                java.lang.Throwable r2 = r1.getCause()
            L_0x0086:
                r5 = r2
                r2 = r1
                r1 = r5
                if (r1 == 0) goto L_0x00b3
                boolean r2 = kotlin.jvm.internal.C13706o.m87924a(r1, r2)
                if (r2 != 0) goto L_0x00b3
                boolean r2 = r1 instanceof java.lang.IllegalStateException
                if (r2 != 0) goto L_0x00ab
                java.lang.Class r2 = r1.getClass()
                java.lang.String r2 = r2.getName()
                java.lang.String r3 = "android.security.KeyStoreException"
                boolean r2 = kotlin.jvm.internal.C13706o.m87924a(r2, r3)
                if (r2 == 0) goto L_0x00a6
                goto L_0x00ab
            L_0x00a6:
                java.lang.Throwable r2 = r1.getCause()
                goto L_0x0086
            L_0x00ab:
                java.util.concurrent.atomic.AtomicBoolean r1 = dev.skomlach.biometric.compat.utils.hardware.Android28Hardware.cachedIsBiometricEnrollChangedValue
                r1.set(r0)
                return
            L_0x00b3:
                java.util.concurrent.atomic.AtomicBoolean r0 = dev.skomlach.biometric.compat.utils.hardware.Android28Hardware.cachedIsBiometricEnrollChangedValue
                r1 = 0
                r0.set(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.hardware.Android28Hardware.Companion.updateBiometricChanged():void");
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c0, code lost:
            if (r4 == null) goto L_0x00c3;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x008e A[Catch:{ all -> 0x00cb, all -> 0x00d1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x009b A[SYNTHETIC, Splitter:B:29:0x009b] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void updateBiometricEnrolled() {
            /*
                r8 = this;
                android.content.Context r0 = dev.skomlach.biometric.compat.utils.hardware.Android28Hardware.appContext
                java.lang.String r1 = "keyguard"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0018
                boolean r0 = r0.isDeviceSecure()
                if (r0 != r2) goto L_0x0018
                r0 = 1
                goto L_0x0019
            L_0x0018:
                r0 = 0
            L_0x0019:
                if (r0 == 0) goto L_0x00da
                dev.skomlach.biometric.compat.engine.BiometricAuthentication r0 = dev.skomlach.biometric.compat.engine.BiometricAuthentication.INSTANCE
                boolean r0 = r0.hasEnrolled()
                if (r0 != 0) goto L_0x00d2
                dev.skomlach.biometric.compat.utils.LockType r0 = dev.skomlach.biometric.compat.utils.LockType.INSTANCE
                android.content.Context r3 = dev.skomlach.biometric.compat.utils.hardware.Android28Hardware.appContext
                boolean r0 = r0.isBiometricWeakEnabled(r3)
                if (r0 == 0) goto L_0x0031
                goto L_0x00d2
            L_0x0031:
                java.util.UUID r0 = java.util.UUID.randomUUID()
                java.lang.String r0 = r0.toString()
                java.lang.String r3 = "randomUUID().toString()"
                kotlin.jvm.internal.C13706o.m87928e(r0, r3)
                r3 = 0
                java.lang.String r4 = "AndroidKeyStore"
                java.security.KeyStore r4 = java.security.KeyStore.getInstance(r4)     // Catch:{ all -> 0x0086 }
                r4.load(r3)     // Catch:{ all -> 0x0084 }
                java.lang.String r3 = "AES"
                java.security.Provider r5 = r4.getProvider()     // Catch:{ all -> 0x0084 }
                javax.crypto.KeyGenerator r3 = javax.crypto.KeyGenerator.getInstance(r3, r5)     // Catch:{ all -> 0x0084 }
                android.security.keystore.KeyGenParameterSpec$Builder r5 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch:{ all -> 0x0084 }
                r6 = 3
                r5.<init>(r0, r6)     // Catch:{ all -> 0x0084 }
                java.lang.String r6 = "CBC"
                java.lang.String[] r6 = new java.lang.String[]{r6}     // Catch:{ all -> 0x0084 }
                android.security.keystore.KeyGenParameterSpec$Builder r5 = r5.setBlockModes(r6)     // Catch:{ all -> 0x0084 }
                java.lang.String r6 = "PKCS7Padding"
                java.lang.String[] r6 = new java.lang.String[]{r6}     // Catch:{ all -> 0x0084 }
                android.security.keystore.KeyGenParameterSpec$Builder r5 = r5.setEncryptionPaddings(r6)     // Catch:{ all -> 0x0084 }
                android.security.keystore.KeyGenParameterSpec$Builder r5 = r5.setUserAuthenticationRequired(r2)     // Catch:{ all -> 0x0084 }
                android.security.keystore.KeyGenParameterSpec$Builder r5 = r5.setInvalidatedByBiometricEnrollment(r2)     // Catch:{ all -> 0x0084 }
                java.lang.String r6 = "Builder(\n               …BiometricEnrollment(true)"
                kotlin.jvm.internal.C13706o.m87928e(r5, r6)     // Catch:{ all -> 0x0084 }
                android.security.keystore.KeyGenParameterSpec r5 = r5.build()     // Catch:{ all -> 0x0084 }
                r3.init(r5)     // Catch:{ all -> 0x0084 }
            L_0x0080:
                r4.deleteEntry(r0)     // Catch:{ all -> 0x00c3 }
                goto L_0x00c3
            L_0x0084:
                r3 = move-exception
                goto L_0x008a
            L_0x0086:
                r4 = move-exception
                r7 = r4
                r4 = r3
                r3 = r7
            L_0x008a:
                boolean r5 = r3 instanceof java.security.InvalidAlgorithmParameterException     // Catch:{ all -> 0x00cb }
                if (r5 == 0) goto L_0x009b
                java.util.concurrent.atomic.AtomicBoolean r2 = dev.skomlach.biometric.compat.utils.hardware.Android28Hardware.cachedIsBiometricEnrolledValue     // Catch:{ all -> 0x00cb }
                r2.set(r1)     // Catch:{ all -> 0x00cb }
                if (r4 == 0) goto L_0x009a
                r4.deleteEntry(r0)     // Catch:{ all -> 0x009a }
            L_0x009a:
                return
            L_0x009b:
                java.lang.Throwable r5 = r3.getCause()     // Catch:{ all -> 0x00cb }
            L_0x009f:
                r7 = r5
                r5 = r3
                r3 = r7
                if (r3 == 0) goto L_0x00c0
                boolean r5 = kotlin.jvm.internal.C13706o.m87924a(r3, r5)     // Catch:{ all -> 0x00cb }
                if (r5 != 0) goto L_0x00c0
                boolean r5 = r3 instanceof java.lang.IllegalStateException     // Catch:{ all -> 0x00cb }
                if (r5 == 0) goto L_0x00bb
                java.util.concurrent.atomic.AtomicBoolean r2 = dev.skomlach.biometric.compat.utils.hardware.Android28Hardware.cachedIsBiometricEnrolledValue     // Catch:{ all -> 0x00cb }
                r2.set(r1)     // Catch:{ all -> 0x00cb }
                if (r4 == 0) goto L_0x00ba
                r4.deleteEntry(r0)     // Catch:{ all -> 0x00ba }
            L_0x00ba:
                return
            L_0x00bb:
                java.lang.Throwable r5 = r3.getCause()     // Catch:{ all -> 0x00cb }
                goto L_0x009f
            L_0x00c0:
                if (r4 == 0) goto L_0x00c3
                goto L_0x0080
            L_0x00c3:
                java.util.concurrent.atomic.AtomicBoolean r0 = dev.skomlach.biometric.compat.utils.hardware.Android28Hardware.cachedIsBiometricEnrolledValue
                r0.set(r2)
                return
            L_0x00cb:
                r1 = move-exception
                if (r4 == 0) goto L_0x00d1
                r4.deleteEntry(r0)     // Catch:{ all -> 0x00d1 }
            L_0x00d1:
                throw r1
            L_0x00d2:
                java.util.concurrent.atomic.AtomicBoolean r0 = dev.skomlach.biometric.compat.utils.hardware.Android28Hardware.cachedIsBiometricEnrolledValue
                r0.set(r2)
                return
            L_0x00da:
                java.util.concurrent.atomic.AtomicBoolean r0 = dev.skomlach.biometric.compat.utils.hardware.Android28Hardware.cachedIsBiometricEnrolledValue
                r0.set(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.hardware.Android28Hardware.Companion.updateBiometricEnrolled():void");
        }
    }

    static {
        Companion companion = new Companion((C13695i) null);
        Companion = companion;
        boolean unused = companion.biometricEnrollChanged();
        boolean unused2 = companion.biometricEnrolled();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Android28Hardware(BiometricAuthRequest biometricAuthRequest) {
        super(biometricAuthRequest);
        C13706o.m87929f(biometricAuthRequest, "authRequest");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059 A[Catch:{ all -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a A[Catch:{ all -> 0x00d6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.ArrayList<java.lang.String> getBiometricFeatures() {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<android.content.pm.PackageManager> r1 = android.content.pm.PackageManager.class
            java.lang.reflect.Field[] r1 = r1.getFields()     // Catch:{ all -> 0x00d6 }
            java.lang.String r2 = "fields"
            kotlin.jvm.internal.C13706o.m87928e(r1, r2)     // Catch:{ all -> 0x00d6 }
            int r2 = r1.length     // Catch:{ all -> 0x00d6 }
            r3 = 0
            r4 = 0
        L_0x0013:
            if (r4 >= r2) goto L_0x00dc
            r5 = r1[r4]     // Catch:{ all -> 0x00d6 }
            int r6 = r5.getModifiers()     // Catch:{ all -> 0x00d6 }
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)     // Catch:{ all -> 0x00d6 }
            if (r6 == 0) goto L_0x00d2
            java.lang.Class r6 = r5.getType()     // Catch:{ all -> 0x00d6 }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r6 = kotlin.jvm.internal.C13706o.m87924a(r6, r7)     // Catch:{ all -> 0x00d6 }
            if (r6 == 0) goto L_0x00d2
            r6 = 0
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00d6 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00d6 }
            if (r5 == 0) goto L_0x00d2
            java.lang.String r7 = ".hardware."
            r8 = 2
            boolean r7 = kotlin.text.C15177w.m93663N(r5, r7, r3, r8, r6)     // Catch:{ all -> 0x00d6 }
            java.lang.String r9 = ".sensor."
            r10 = 1
            if (r7 == 0) goto L_0x004a
            boolean r7 = kotlin.text.C15177w.m93663N(r5, r9, r3, r8, r6)     // Catch:{ all -> 0x00d6 }
            if (r7 != 0) goto L_0x004a
            r7 = 1
            goto L_0x004b
        L_0x004a:
            r7 = 0
        L_0x004b:
            java.lang.String r11 = "com."
            boolean r11 = kotlin.text.C15176v.m93634I(r5, r11, r3, r8, r6)     // Catch:{ all -> 0x00d6 }
            if (r11 == 0) goto L_0x005a
            boolean r9 = kotlin.text.C15177w.m93663N(r5, r9, r3, r8, r6)     // Catch:{ all -> 0x00d6 }
            if (r9 != 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r10 = 0
        L_0x005b:
            if (r7 != 0) goto L_0x005f
            if (r10 == 0) goto L_0x00d2
        L_0x005f:
            java.lang.String r7 = ".fingerprint"
            boolean r7 = kotlin.text.C15176v.m93640u(r5, r7, r3, r8, r6)     // Catch:{ all -> 0x00d6 }
            if (r7 != 0) goto L_0x00cf
            java.lang.String r7 = ".face"
            boolean r7 = kotlin.text.C15176v.m93640u(r5, r7, r3, r8, r6)     // Catch:{ all -> 0x00d6 }
            if (r7 != 0) goto L_0x00cf
            java.lang.String r7 = ".iris"
            boolean r7 = kotlin.text.C15176v.m93640u(r5, r7, r3, r8, r6)     // Catch:{ all -> 0x00d6 }
            if (r7 != 0) goto L_0x00cf
            java.lang.String r7 = ".biometric"
            boolean r7 = kotlin.text.C15176v.m93640u(r5, r7, r3, r8, r6)     // Catch:{ all -> 0x00d6 }
            if (r7 != 0) goto L_0x00cf
            java.lang.String r7 = ".palm"
            boolean r7 = kotlin.text.C15176v.m93640u(r5, r7, r3, r8, r6)     // Catch:{ all -> 0x00d6 }
            if (r7 != 0) goto L_0x00cf
            java.lang.String r7 = ".voice"
            boolean r7 = kotlin.text.C15176v.m93640u(r5, r7, r3, r8, r6)     // Catch:{ all -> 0x00d6 }
            if (r7 != 0) goto L_0x00cf
            java.lang.String r7 = ".heartrate"
            boolean r7 = kotlin.text.C15176v.m93640u(r5, r7, r3, r8, r6)     // Catch:{ all -> 0x00d6 }
            if (r7 != 0) goto L_0x00cf
            java.lang.String r7 = ".fingerprint."
            boolean r7 = kotlin.text.C15177w.m93663N(r5, r7, r3, r8, r6)     // Catch:{ all -> 0x00d6 }
            if (r7 != 0) goto L_0x00cf
            java.lang.String r7 = ".face."
            boolean r7 = kotlin.text.C15177w.m93663N(r5, r7, r3, r8, r6)     // Catch:{ all -> 0x00d6 }
            if (r7 != 0) goto L_0x00cf
            java.lang.String r7 = ".iris."
            boolean r7 = kotlin.text.C15177w.m93663N(r5, r7, r3, r8, r6)     // Catch:{ all -> 0x00d6 }
            if (r7 != 0) goto L_0x00cf
            java.lang.String r7 = ".biometric."
            boolean r7 = kotlin.text.C15177w.m93663N(r5, r7, r3, r8, r6)     // Catch:{ all -> 0x00d6 }
            if (r7 != 0) goto L_0x00cf
            java.lang.String r7 = ".palm."
            boolean r7 = kotlin.text.C15177w.m93663N(r5, r7, r3, r8, r6)     // Catch:{ all -> 0x00d6 }
            if (r7 != 0) goto L_0x00cf
            java.lang.String r7 = ".voice."
            boolean r7 = kotlin.text.C15177w.m93663N(r5, r7, r3, r8, r6)     // Catch:{ all -> 0x00d6 }
            if (r7 != 0) goto L_0x00cf
            java.lang.String r7 = ".heartrate."
            boolean r6 = kotlin.text.C15177w.m93663N(r5, r7, r3, r8, r6)     // Catch:{ all -> 0x00d6 }
            if (r6 == 0) goto L_0x00d2
        L_0x00cf:
            r0.add(r5)     // Catch:{ all -> 0x00d6 }
        L_0x00d2:
            int r4 = r4 + 1
            goto L_0x0013
        L_0x00d6:
            r1 = move-exception
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r2 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r2.mo68218e((java.lang.Throwable) r1)
        L_0x00dc:
            kotlin.collections.C13622x.m87780x(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.hardware.Android28Hardware.getBiometricFeatures():java.util.ArrayList");
    }

    private final boolean getHasAnyHardware() {
        if (BiometricAuthentication.INSTANCE.isHardwareDetected()) {
            return true;
        }
        PackageManager packageManager = appContext.getPackageManager();
        Iterator<String> it = getBiometricFeatures().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (packageManager != null && packageManager.hasSystemFeature(next)) {
                return true;
            }
        }
        return false;
    }

    private final boolean isAnyLockedOut() {
        for (BiometricType biometricType : BiometricType.values()) {
            if (biometricType != BiometricType.BIOMETRIC_ANY && BiometricLockoutFix.INSTANCE.isLockOut(biometricType)) {
                return true;
            }
        }
        return false;
    }

    private final boolean isBiometricEnrolledForType(BiometricType biometricType) {
        if (!isAnyBiometricEnrolled()) {
            return false;
        }
        BiometricAuthentication biometricAuthentication = BiometricAuthentication.INSTANCE;
        BiometricType biometricType2 = BiometricType.BIOMETRIC_FINGERPRINT;
        BiometricModule availableBiometricModule = biometricAuthentication.getAvailableBiometricModule(biometricType2);
        boolean z = availableBiometricModule != null && availableBiometricModule.hasEnrolled();
        if (biometricType == biometricType2) {
            return z;
        }
        if (biometricType == BiometricType.BIOMETRIC_FACE && LockType.INSTANCE.isBiometricEnabledInSettings(appContext, "face")) {
            return true;
        }
        if (biometricType == BiometricType.BIOMETRIC_IRIS && LockType.INSTANCE.isBiometricEnabledInSettings(appContext, "iris")) {
            return true;
        }
        if (biometricType == BiometricType.BIOMETRIC_PALMPRINT && LockType.INSTANCE.isBiometricEnabledInSettings(appContext, "palm")) {
            return true;
        }
        if (biometricType == BiometricType.BIOMETRIC_VOICE && LockType.INSTANCE.isBiometricEnabledInSettings(appContext, "voice")) {
            return true;
        }
        if (biometricType == BiometricType.BIOMETRIC_HEARTRATE && LockType.INSTANCE.isBiometricEnabledInSettings(appContext, "heartrate")) {
            return true;
        }
        if (z || !isHardwareAvailableForType(biometricType)) {
            return false;
        }
        return true;
    }

    private final boolean isHardwareAvailableForType(BiometricType biometricType) {
        BiometricModule availableBiometricModule;
        if (isAnyHardwareAvailable()) {
            BiometricType biometricType2 = BiometricType.BIOMETRIC_FINGERPRINT;
            if (biometricType == biometricType2 && (availableBiometricModule = BiometricAuthentication.INSTANCE.getAvailableBiometricModule(biometricType2)) != null && availableBiometricModule.isHardwarePresent()) {
                return true;
            }
            PackageManager packageManager = appContext.getPackageManager();
            Iterator<String> it = getBiometricFeatures().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (packageManager.hasSystemFeature(next)) {
                    C13706o.m87928e(next, "f");
                    if ((C15176v.m93640u(next, ".face", false, 2, (Object) null) || C15177w.m93663N(next, ".face.", false, 2, (Object) null)) && biometricType == BiometricType.BIOMETRIC_FACE) {
                        return true;
                    }
                    if ((C15176v.m93640u(next, ".iris", false, 2, (Object) null) || C15177w.m93663N(next, ".iris.", false, 2, (Object) null)) && biometricType == BiometricType.BIOMETRIC_IRIS) {
                        return true;
                    }
                    if ((C15176v.m93640u(next, ".fingerprint", false, 2, (Object) null) || C15177w.m93663N(next, ".fingerprint.", false, 2, (Object) null)) && biometricType == BiometricType.BIOMETRIC_FINGERPRINT) {
                        return true;
                    }
                    if ((C15176v.m93640u(next, ".palm", false, 2, (Object) null) || C15177w.m93663N(next, ".palm.", false, 2, (Object) null)) && biometricType == BiometricType.BIOMETRIC_PALMPRINT) {
                        return true;
                    }
                    if ((C15176v.m93640u(next, ".voice", false, 2, (Object) null) || C15177w.m93663N(next, ".voice.", false, 2, (Object) null)) && biometricType == BiometricType.BIOMETRIC_VOICE) {
                        return true;
                    }
                    if ((C15176v.m93640u(next, ".heartrate", false, 2, (Object) null) || C15177w.m93663N(next, ".heartrate.", false, 2, (Object) null)) && biometricType == BiometricType.BIOMETRIC_HEARTRATE) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final boolean isLockedOutForType(BiometricType biometricType) {
        return BiometricLockoutFix.INSTANCE.isLockOut(biometricType);
    }

    public boolean isAnyBiometricEnrolled() {
        return Companion.biometricEnrolled();
    }

    public boolean isAnyHardwareAvailable() {
        return getHasAnyHardware();
    }

    public boolean isBiometricEnrollChanged() {
        if (getBiometricAuthRequest().getType() == BiometricType.BIOMETRIC_ANY) {
            return Companion.biometricEnrollChanged();
        }
        return false;
    }

    public boolean isBiometricEnrolled() {
        if (getBiometricAuthRequest().getType() == BiometricType.BIOMETRIC_ANY) {
            return isAnyBiometricEnrolled();
        }
        return isBiometricEnrolledForType(getBiometricAuthRequest().getType());
    }

    public boolean isHardwareAvailable() {
        if (getBiometricAuthRequest().getType() == BiometricType.BIOMETRIC_ANY) {
            return isAnyHardwareAvailable();
        }
        return isHardwareAvailableForType(getBiometricAuthRequest().getType());
    }

    public boolean isLockedOut() {
        if (getBiometricAuthRequest().getType() == BiometricType.BIOMETRIC_ANY) {
            return isAnyLockedOut();
        }
        return isLockedOutForType(getBiometricAuthRequest().getType());
    }

    public final void lockout() {
        if (isLockedOut()) {
            return;
        }
        if (getBiometricAuthRequest().getType() == BiometricType.BIOMETRIC_ANY) {
            for (BiometricType biometricType : BiometricType.values()) {
                if (biometricType != BiometricType.BIOMETRIC_ANY && isHardwareAvailableForType(biometricType) && isBiometricEnrolledForType(biometricType)) {
                    BiometricLockoutFix.INSTANCE.lockout(biometricType);
                }
            }
            return;
        }
        BiometricLockoutFix.INSTANCE.lockout(getBiometricAuthRequest().getType());
    }

    public void updateBiometricEnrollChanged() {
        if (isBiometricEnrollChanged()) {
            try {
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                instance.load((KeyStore.LoadStoreParameter) null);
                if (instance.containsAlias("BiometricKey")) {
                    instance.deleteEntry("BiometricKey");
                }
            } catch (Throwable unused) {
            }
        }
    }
}

package dev.skomlach.biometric.compat.utils;

import androidx.core.p007os.BuildCompat;
import dev.skomlach.biometric.compat.BiometricApi;
import dev.skomlach.biometric.compat.BiometricAuthRequest;
import dev.skomlach.biometric.compat.utils.hardware.Android28Hardware;
import dev.skomlach.biometric.compat.utils.hardware.Android29Hardware;
import dev.skomlach.biometric.compat.utils.hardware.HardwareInfo;
import dev.skomlach.biometric.compat.utils.hardware.LegacyHardware;
import dev.skomlach.common.misc.C12114c;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0017"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/HardwareAccessImpl;", "", "Lja/u;", "updateBiometricEnrollChanged", "lockout", "Ldev/skomlach/biometric/compat/BiometricAuthRequest;", "biometricAuthRequest", "Ldev/skomlach/biometric/compat/BiometricAuthRequest;", "getBiometricAuthRequest", "()Ldev/skomlach/biometric/compat/BiometricAuthRequest;", "Ldev/skomlach/biometric/compat/utils/hardware/HardwareInfo;", "hardwareInfo", "Ldev/skomlach/biometric/compat/utils/hardware/HardwareInfo;", "", "isNewBiometricApi", "()Z", "isHardwareAvailable", "isBiometricEnrolled", "isLockedOut", "isBiometricEnrollChanged", "<init>", "(Ldev/skomlach/biometric/compat/BiometricAuthRequest;)V", "Companion", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: HardwareAccessImpl.kt */
public final class HardwareAccessImpl {
    public static final Companion Companion = new Companion((C13695i) null);
    private final BiometricAuthRequest biometricAuthRequest;
    private HardwareInfo hardwareInfo;

    @Metadata(mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/HardwareAccessImpl$Companion;", "", "()V", "getInstance", "Ldev/skomlach/biometric/compat/utils/HardwareAccessImpl;", "api", "Ldev/skomlach/biometric/compat/BiometricAuthRequest;", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: HardwareAccessImpl.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public final HardwareAccessImpl getInstance(BiometricAuthRequest biometricAuthRequest) {
            C13706o.m87929f(biometricAuthRequest, "api");
            return new HardwareAccessImpl(biometricAuthRequest, (C13695i) null);
        }
    }

    private HardwareAccessImpl(BiometricAuthRequest biometricAuthRequest2) {
        HardwareInfo hardwareInfo2;
        this.biometricAuthRequest = biometricAuthRequest2;
        if (biometricAuthRequest2.getApi() == BiometricApi.LEGACY_API) {
            this.hardwareInfo = new LegacyHardware(biometricAuthRequest2);
        } else if (biometricAuthRequest2.getApi() != BiometricApi.BIOMETRIC_API) {
            if (BuildCompat.isAtLeastQ()) {
                hardwareInfo2 = new Android29Hardware(biometricAuthRequest2);
            } else if (BuildCompat.isAtLeastP()) {
                hardwareInfo2 = new Android28Hardware(biometricAuthRequest2);
            } else {
                hardwareInfo2 = new LegacyHardware(biometricAuthRequest2);
            }
            this.hardwareInfo = hardwareInfo2;
        } else if (BuildCompat.isAtLeastQ()) {
            this.hardwareInfo = new Android29Hardware(biometricAuthRequest2);
        } else if (BuildCompat.isAtLeastP()) {
            this.hardwareInfo = new Android28Hardware(biometricAuthRequest2);
        }
    }

    public /* synthetic */ HardwareAccessImpl(BiometricAuthRequest biometricAuthRequest2, C13695i iVar) {
        this(biometricAuthRequest2);
    }

    /* access modifiers changed from: private */
    /* renamed from: updateBiometricEnrollChanged$lambda-0  reason: not valid java name */
    public static final void m101348updateBiometricEnrollChanged$lambda0(HardwareAccessImpl hardwareAccessImpl) {
        C13706o.m87929f(hardwareAccessImpl, "this$0");
        HardwareInfo hardwareInfo2 = hardwareAccessImpl.hardwareInfo;
        if (hardwareInfo2 != null) {
            hardwareInfo2.updateBiometricEnrollChanged();
        }
    }

    public final BiometricAuthRequest getBiometricAuthRequest() {
        return this.biometricAuthRequest;
    }

    public final boolean isBiometricEnrollChanged() {
        HardwareInfo hardwareInfo2 = this.hardwareInfo;
        if (hardwareInfo2 != null) {
            return hardwareInfo2.isBiometricEnrollChanged();
        }
        return false;
    }

    public final boolean isBiometricEnrolled() {
        HardwareInfo hardwareInfo2 = this.hardwareInfo;
        if (hardwareInfo2 != null) {
            return hardwareInfo2.isBiometricEnrolled();
        }
        return false;
    }

    public final boolean isHardwareAvailable() {
        HardwareInfo hardwareInfo2 = this.hardwareInfo;
        if (hardwareInfo2 != null) {
            return hardwareInfo2.isHardwareAvailable();
        }
        return false;
    }

    public final boolean isLockedOut() {
        HardwareInfo hardwareInfo2 = this.hardwareInfo;
        if (hardwareInfo2 != null) {
            return hardwareInfo2.isLockedOut();
        }
        return false;
    }

    public final boolean isNewBiometricApi() {
        return !(this.hardwareInfo instanceof LegacyHardware);
    }

    public final void lockout() {
        if (isNewBiometricApi()) {
            HardwareInfo hardwareInfo2 = this.hardwareInfo;
            C13706o.m87927d(hardwareInfo2, "null cannot be cast to non-null type dev.skomlach.biometric.compat.utils.hardware.Android28Hardware");
            ((Android28Hardware) hardwareInfo2).lockout();
        }
    }

    public final void updateBiometricEnrollChanged() {
        C12114c.f58379a.mo68308k(new C12099b(this));
    }
}

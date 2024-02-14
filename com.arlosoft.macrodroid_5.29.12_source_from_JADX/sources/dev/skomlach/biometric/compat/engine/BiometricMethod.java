package dev.skomlach.biometric.compat.engine;

import com.android.p023dx.p026io.Opcodes;
import dev.skomlach.biometric.compat.BiometricType;
import kotlin.Metadata;

@Metadata(mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/BiometricMethod;", "", "id", "", "biometricType", "Ldev/skomlach/biometric/compat/BiometricType;", "(Ljava/lang/String;IILdev/skomlach/biometric/compat/BiometricType;)V", "getBiometricType", "()Ldev/skomlach/biometric/compat/BiometricType;", "getId", "()I", "FINGERPRINT_API23", "FINGERPRINT_SUPPORT", "FINGERPRINT_SAMSUNG", "FINGERPRINT_FLYME", "FINGERPRINT_SOTERAPI", "FACE_ANDROIDAPI", "FACE_SAMSUNG", "FACE_OPPO", "FACE_HUAWEI", "FACE_SOTERAPI", "FACE_MIUI", "FACE_VIVO", "FACELOCK", "IRIS_ANDROIDAPI", "IRIS_SAMSUNG", "DUMMY_BIOMETRIC", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: BiometricMethod.kt */
public enum BiometricMethod {
    FINGERPRINT_API23(100, r1),
    FINGERPRINT_SUPPORT(101, r1),
    FINGERPRINT_SAMSUNG(102, r1),
    FINGERPRINT_FLYME(103, r1),
    FINGERPRINT_SOTERAPI(104, r1),
    FACE_ANDROIDAPI(201, r1),
    FACE_SAMSUNG(202, r1),
    FACE_OPPO(203, r1),
    FACE_HUAWEI(205, r1),
    FACE_SOTERAPI(206, r1),
    FACE_MIUI(207, r1),
    FACE_VIVO(Opcodes.RSUB_INT, r1),
    FACELOCK(299, r1),
    IRIS_ANDROIDAPI(300, r1),
    IRIS_SAMSUNG(301, r1),
    DUMMY_BIOMETRIC(9999, BiometricType.BIOMETRIC_ANY);
    
    private final BiometricType biometricType;

    /* renamed from: id */
    private final int f58241id;

    private BiometricMethod(int i, BiometricType biometricType2) {
        this.f58241id = i;
        this.biometricType = biometricType2;
    }

    public final BiometricType getBiometricType() {
        return this.biometricType;
    }

    public final int getId() {
        return this.f58241id;
    }
}

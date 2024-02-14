package dev.skomlach.biometric.compat;

import androidx.annotation.DrawableRes;
import kotlin.Metadata;

@Metadata(mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/BiometricType;", "", "iconId", "", "(Ljava/lang/String;II)V", "getIconId", "()I", "BIOMETRIC_ANY", "BIOMETRIC_FINGERPRINT", "BIOMETRIC_FACE", "BIOMETRIC_IRIS", "BIOMETRIC_VOICE", "BIOMETRIC_PALMPRINT", "BIOMETRIC_HEARTRATE", "BIOMETRIC_BEHAVIOR", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: BiometricType.kt */
public enum BiometricType {
    BIOMETRIC_ANY(r1),
    BIOMETRIC_FINGERPRINT(r1),
    BIOMETRIC_FACE(C12021R.C12023drawable.bio_ic_face),
    BIOMETRIC_IRIS(C12021R.C12023drawable.bio_ic_iris),
    BIOMETRIC_VOICE(C12021R.C12023drawable.bio_ic_voice),
    BIOMETRIC_PALMPRINT(C12021R.C12023drawable.bio_ic_palm),
    BIOMETRIC_HEARTRATE(C12021R.C12023drawable.bio_ic_heartrate),
    BIOMETRIC_BEHAVIOR(C12021R.C12023drawable.bio_ic_behavior);
    
    private final int iconId;

    private BiometricType(@DrawableRes int i) {
        this.iconId = i;
    }

    public final int getIconId() {
        return this.iconId;
    }
}

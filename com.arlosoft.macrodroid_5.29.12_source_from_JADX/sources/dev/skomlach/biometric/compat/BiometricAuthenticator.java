package dev.skomlach.biometric.compat;

import kotlin.Metadata;

@Metadata(mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/BiometricAuthenticator;", "", "()V", "TYPE_FACE", "", "TYPE_FINGERPRINT", "TYPE_IRIS", "TYPE_NONE", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: BiometricAuthenticator.kt */
public final class BiometricAuthenticator {
    public static final BiometricAuthenticator INSTANCE = new BiometricAuthenticator();
    public static final int TYPE_FACE = 4;
    public static final int TYPE_FINGERPRINT = 1;
    public static final int TYPE_IRIS = 2;
    public static final int TYPE_NONE = 0;

    private BiometricAuthenticator() {
    }
}

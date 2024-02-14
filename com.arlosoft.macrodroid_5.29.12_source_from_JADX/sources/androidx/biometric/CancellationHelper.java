package androidx.biometric;

import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\b"}, mo71668d2 = {"Landroidx/biometric/CancellationHelper;", "", "Landroidx/biometric/BiometricFragment;", "biometricFragment", "Lja/u;", "forceCancel", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: CancellationHelper.kt */
public final class CancellationHelper {
    public static final CancellationHelper INSTANCE = new CancellationHelper();

    private CancellationHelper() {
    }

    public final void forceCancel(BiometricFragment biometricFragment) {
        if (biometricFragment != null) {
            try {
                biometricFragment.cancelAuthentication(3);
            } catch (Throwable unused) {
            }
        }
    }
}

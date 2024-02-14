package dev.skomlach.biometric.compat;

import dev.skomlach.biometric.compat.BiometricPromptCompat;
import dev.skomlach.biometric.compat.utils.HardwareAccessImpl;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13708q;
import p370qa.C16254a;

@Metadata(mo71667d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo71668d2 = {"<anonymous>", "Ljava/util/HashSet;", "Ldev/skomlach/biometric/compat/BiometricType;", "invoke"}, mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: BiometricPromptCompat.kt */
final class BiometricPromptCompat$Builder$primaryAvailableTypes$2 extends C13708q implements C16254a<HashSet<BiometricType>> {
    final /* synthetic */ BiometricPromptCompat.Builder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BiometricPromptCompat$Builder$primaryAvailableTypes$2(BiometricPromptCompat.Builder builder) {
        super(0);
        this.this$0 = builder;
    }

    public final HashSet<BiometricType> invoke() {
        HashSet<BiometricType> hashSet = new HashSet<>();
        BiometricApi biometricApi = HardwareAccessImpl.Companion.getInstance(this.this$0.biometricAuthRequest).isNewBiometricApi() ? BiometricApi.BIOMETRIC_API : BiometricApi.LEGACY_API;
        if (this.this$0.biometricAuthRequest.getType() == BiometricType.BIOMETRIC_ANY) {
            for (BiometricType biometricType : BiometricType.values()) {
                if (biometricType != BiometricType.BIOMETRIC_ANY) {
                    BiometricAuthRequest biometricAuthRequest = new BiometricAuthRequest(biometricApi, biometricType, (BiometricConfirmation) null, 4, (C13695i) null);
                    BiometricLoggerImpl.INSTANCE.mo68217d("primaryAvailableTypes - " + biometricAuthRequest + " -> " + BiometricManagerCompat.isHardwareDetected(biometricAuthRequest));
                    if (BiometricManagerCompat.isBiometricReady(biometricAuthRequest)) {
                        hashSet.add(biometricType);
                    }
                }
            }
        } else if (BiometricManagerCompat.isBiometricReady(this.this$0.biometricAuthRequest)) {
            hashSet.add(this.this$0.biometricAuthRequest.getType());
        }
        return hashSet;
    }
}

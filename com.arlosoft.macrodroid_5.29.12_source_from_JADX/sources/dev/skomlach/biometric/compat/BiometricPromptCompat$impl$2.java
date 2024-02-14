package dev.skomlach.biometric.compat;

import dev.skomlach.biometric.compat.impl.IBiometricPromptImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.C13708q;
import p370qa.C16254a;

@Metadata(mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"<anonymous>", "", "invoke", "()Ldev/skomlach/biometric/compat/impl/IBiometricPromptImpl;"}, mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: BiometricPromptCompat.kt */
final class BiometricPromptCompat$impl$2 extends C13708q implements C16254a<IBiometricPromptImpl> {
    final /* synthetic */ BiometricPromptCompat this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BiometricPromptCompat$impl$2(BiometricPromptCompat biometricPromptCompat) {
        super(0);
        this.this$0 = biometricPromptCompat;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final dev.skomlach.biometric.compat.impl.IBiometricPromptImpl invoke() {
        /*
            r10 = this;
            dev.skomlach.biometric.compat.BiometricPromptCompat r0 = r10.this$0
            dev.skomlach.biometric.compat.BiometricPromptCompat$Builder r0 = r0.builder
            dev.skomlach.biometric.compat.BiometricAuthRequest r0 = r0.getBiometricAuthRequest()
            dev.skomlach.biometric.compat.BiometricApi r0 = r0.getApi()
            dev.skomlach.biometric.compat.BiometricApi r1 = dev.skomlach.biometric.compat.BiometricApi.BIOMETRIC_API
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0070
            dev.skomlach.biometric.compat.BiometricPromptCompat r0 = r10.this$0
            dev.skomlach.biometric.compat.BiometricPromptCompat$Builder r0 = r0.builder
            dev.skomlach.biometric.compat.BiometricAuthRequest r0 = r0.getBiometricAuthRequest()
            dev.skomlach.biometric.compat.BiometricApi r0 = r0.getApi()
            dev.skomlach.biometric.compat.BiometricApi r1 = dev.skomlach.biometric.compat.BiometricApi.AUTO
            if (r0 != r1) goto L_0x006a
            dev.skomlach.biometric.compat.utils.HardwareAccessImpl$Companion r0 = dev.skomlach.biometric.compat.utils.HardwareAccessImpl.Companion
            dev.skomlach.biometric.compat.BiometricPromptCompat r1 = r10.this$0
            dev.skomlach.biometric.compat.BiometricPromptCompat$Builder r1 = r1.builder
            dev.skomlach.biometric.compat.BiometricAuthRequest r1 = r1.getBiometricAuthRequest()
            dev.skomlach.biometric.compat.utils.HardwareAccessImpl r0 = r0.getInstance(r1)
            boolean r0 = r0.isNewBiometricApi()
            if (r0 == 0) goto L_0x006a
            dev.skomlach.biometric.compat.BiometricPromptCompat r0 = r10.this$0
            dev.skomlach.biometric.compat.BiometricPromptCompat$Builder r0 = r0.builder
            java.util.Set r0 = r0.getPrimaryAvailableTypes()
            java.util.Iterator r0 = r0.iterator()
        L_0x004a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x006a
            java.lang.Object r1 = r0.next()
            r6 = r1
            dev.skomlach.biometric.compat.BiometricType r6 = (dev.skomlach.biometric.compat.BiometricType) r6
            dev.skomlach.biometric.compat.BiometricAuthRequest r1 = new dev.skomlach.biometric.compat.BiometricAuthRequest
            dev.skomlach.biometric.compat.BiometricApi r5 = dev.skomlach.biometric.compat.BiometricApi.BIOMETRIC_API
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            boolean r1 = dev.skomlach.biometric.compat.BiometricManagerCompat.isBiometricReady(r1)
            if (r1 == 0) goto L_0x004a
            r0 = 1
            goto L_0x006b
        L_0x006a:
            r0 = 0
        L_0x006b:
            if (r0 == 0) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            r0 = 0
            goto L_0x0071
        L_0x0070:
            r0 = 1
        L_0x0071:
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r1 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "BiometricPromptCompat.IBiometricPromptImpl - "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r2[r3] = r4
            r1.mo68217d(r2)
            if (r0 == 0) goto L_0x0099
            dev.skomlach.biometric.compat.impl.BiometricPromptApi28Impl r0 = new dev.skomlach.biometric.compat.impl.BiometricPromptApi28Impl
            dev.skomlach.biometric.compat.BiometricPromptCompat r1 = r10.this$0
            dev.skomlach.biometric.compat.BiometricPromptCompat$Builder r1 = r1.builder
            r0.<init>(r1)
            goto L_0x00a4
        L_0x0099:
            dev.skomlach.biometric.compat.impl.BiometricPromptGenericImpl r0 = new dev.skomlach.biometric.compat.impl.BiometricPromptGenericImpl
            dev.skomlach.biometric.compat.BiometricPromptCompat r1 = r10.this$0
            dev.skomlach.biometric.compat.BiometricPromptCompat$Builder r1 = r1.builder
            r0.<init>(r1)
        L_0x00a4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.BiometricPromptCompat$impl$2.invoke():dev.skomlach.biometric.compat.impl.IBiometricPromptImpl");
    }
}

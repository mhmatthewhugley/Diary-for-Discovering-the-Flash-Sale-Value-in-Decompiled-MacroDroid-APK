package dev.skomlach.biometric.compat;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/BiometricCryptographyPurpose;", "", "purpose", "", "initVector", "", "(I[B)V", "getInitVector", "()[B", "getPurpose", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: BiometricCryptographyPurpose.kt */
public final class BiometricCryptographyPurpose {
    public static final Companion Companion = new Companion((C13695i) null);
    public static final int DECRYPT = 1001;
    public static final int ENCRYPT = 1000;
    private final byte[] initVector;
    private final int purpose;

    @Metadata(mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/BiometricCryptographyPurpose$Companion;", "", "()V", "DECRYPT", "", "ENCRYPT", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: BiometricCryptographyPurpose.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }
    }

    public BiometricCryptographyPurpose(int i, byte[] bArr) {
        this.purpose = i;
        this.initVector = bArr;
    }

    public static /* synthetic */ BiometricCryptographyPurpose copy$default(BiometricCryptographyPurpose biometricCryptographyPurpose, int i, byte[] bArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = biometricCryptographyPurpose.purpose;
        }
        if ((i2 & 2) != 0) {
            bArr = biometricCryptographyPurpose.initVector;
        }
        return biometricCryptographyPurpose.copy(i, bArr);
    }

    public final int component1() {
        return this.purpose;
    }

    public final byte[] component2() {
        return this.initVector;
    }

    public final BiometricCryptographyPurpose copy(int i, byte[] bArr) {
        return new BiometricCryptographyPurpose(i, bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C13706o.m87924a(BiometricCryptographyPurpose.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C13706o.m87927d(obj, "null cannot be cast to non-null type dev.skomlach.biometric.compat.BiometricCryptographyPurpose");
        BiometricCryptographyPurpose biometricCryptographyPurpose = (BiometricCryptographyPurpose) obj;
        if (this.purpose != biometricCryptographyPurpose.purpose) {
            return false;
        }
        byte[] bArr = this.initVector;
        if (bArr != null) {
            byte[] bArr2 = biometricCryptographyPurpose.initVector;
            return bArr2 != null && Arrays.equals(bArr, bArr2);
        } else if (biometricCryptographyPurpose.initVector != null) {
            return false;
        }
    }

    public final byte[] getInitVector() {
        return this.initVector;
    }

    public final int getPurpose() {
        return this.purpose;
    }

    public int hashCode() {
        int i = this.purpose * 31;
        byte[] bArr = this.initVector;
        return i + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public String toString() {
        int i = this.purpose;
        String arrays = Arrays.toString(this.initVector);
        return "BiometricCryptographyPurpose(purpose=" + i + ", initVector=" + arrays + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BiometricCryptographyPurpose(int i, byte[] bArr, int i2, C13695i iVar) {
        this(i, (i2 & 2) != 0 ? null : bArr);
    }
}

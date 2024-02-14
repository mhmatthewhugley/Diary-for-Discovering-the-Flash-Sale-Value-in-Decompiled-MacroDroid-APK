package dev.skomlach.biometric.compat;

import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/BiometricCryptographyResult;", "", "biometricType", "Ldev/skomlach/biometric/compat/BiometricType;", "data", "", "initializationVector", "(Ldev/skomlach/biometric/compat/BiometricType;[B[B)V", "getBiometricType", "()Ldev/skomlach/biometric/compat/BiometricType;", "getData", "()[B", "getInitializationVector", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: BiometricCryptographyResult.kt */
public final class BiometricCryptographyResult {
    private final BiometricType biometricType;
    private final byte[] data;
    private final byte[] initializationVector;

    public BiometricCryptographyResult(BiometricType biometricType2, byte[] bArr, byte[] bArr2) {
        C13706o.m87929f(biometricType2, "biometricType");
        C13706o.m87929f(bArr, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        this.biometricType = biometricType2;
        this.data = bArr;
        this.initializationVector = bArr2;
    }

    public static /* synthetic */ BiometricCryptographyResult copy$default(BiometricCryptographyResult biometricCryptographyResult, BiometricType biometricType2, byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            biometricType2 = biometricCryptographyResult.biometricType;
        }
        if ((i & 2) != 0) {
            bArr = biometricCryptographyResult.data;
        }
        if ((i & 4) != 0) {
            bArr2 = biometricCryptographyResult.initializationVector;
        }
        return biometricCryptographyResult.copy(biometricType2, bArr, bArr2);
    }

    public final BiometricType component1() {
        return this.biometricType;
    }

    public final byte[] component2() {
        return this.data;
    }

    public final byte[] component3() {
        return this.initializationVector;
    }

    public final BiometricCryptographyResult copy(BiometricType biometricType2, byte[] bArr, byte[] bArr2) {
        C13706o.m87929f(biometricType2, "biometricType");
        C13706o.m87929f(bArr, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        return new BiometricCryptographyResult(biometricType2, bArr, bArr2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C13706o.m87924a(BiometricCryptographyResult.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C13706o.m87927d(obj, "null cannot be cast to non-null type dev.skomlach.biometric.compat.BiometricCryptographyResult");
        BiometricCryptographyResult biometricCryptographyResult = (BiometricCryptographyResult) obj;
        if (this.biometricType != biometricCryptographyResult.biometricType || !Arrays.equals(this.data, biometricCryptographyResult.data)) {
            return false;
        }
        byte[] bArr = this.initializationVector;
        if (bArr != null) {
            byte[] bArr2 = biometricCryptographyResult.initializationVector;
            return bArr2 != null && Arrays.equals(bArr, bArr2);
        } else if (biometricCryptographyResult.initializationVector != null) {
            return false;
        }
    }

    public final BiometricType getBiometricType() {
        return this.biometricType;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final byte[] getInitializationVector() {
        return this.initializationVector;
    }

    public int hashCode() {
        int hashCode = ((this.biometricType.hashCode() * 31) + Arrays.hashCode(this.data)) * 31;
        byte[] bArr = this.initializationVector;
        return hashCode + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public String toString() {
        BiometricType biometricType2 = this.biometricType;
        String arrays = Arrays.toString(this.data);
        String arrays2 = Arrays.toString(this.initializationVector);
        return "BiometricCryptographyResult(biometricType=" + biometricType2 + ", data=" + arrays + ", initializationVector=" + arrays2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BiometricCryptographyResult(BiometricType biometricType2, byte[] bArr, byte[] bArr2, int i, C13695i iVar) {
        this(biometricType2, bArr, (i & 4) != 0 ? null : bArr2);
    }
}

package dev.skomlach.biometric.compat;

import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/BiometricAuthRequest;", "", "api", "Ldev/skomlach/biometric/compat/BiometricApi;", "type", "Ldev/skomlach/biometric/compat/BiometricType;", "confirmation", "Ldev/skomlach/biometric/compat/BiometricConfirmation;", "(Ldev/skomlach/biometric/compat/BiometricApi;Ldev/skomlach/biometric/compat/BiometricType;Ldev/skomlach/biometric/compat/BiometricConfirmation;)V", "getApi", "()Ldev/skomlach/biometric/compat/BiometricApi;", "getConfirmation", "()Ldev/skomlach/biometric/compat/BiometricConfirmation;", "getType", "()Ldev/skomlach/biometric/compat/BiometricType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: BiometricAuthRequest.kt */
public final class BiometricAuthRequest {
    private final BiometricApi api;
    private final BiometricConfirmation confirmation;
    private final BiometricType type;

    public BiometricAuthRequest() {
        this((BiometricApi) null, (BiometricType) null, (BiometricConfirmation) null, 7, (C13695i) null);
    }

    public BiometricAuthRequest(BiometricApi biometricApi, BiometricType biometricType, BiometricConfirmation biometricConfirmation) {
        C13706o.m87929f(biometricApi, "api");
        C13706o.m87929f(biometricType, "type");
        C13706o.m87929f(biometricConfirmation, "confirmation");
        this.api = biometricApi;
        this.type = biometricType;
        this.confirmation = biometricConfirmation;
    }

    public static /* synthetic */ BiometricAuthRequest copy$default(BiometricAuthRequest biometricAuthRequest, BiometricApi biometricApi, BiometricType biometricType, BiometricConfirmation biometricConfirmation, int i, Object obj) {
        if ((i & 1) != 0) {
            biometricApi = biometricAuthRequest.api;
        }
        if ((i & 2) != 0) {
            biometricType = biometricAuthRequest.type;
        }
        if ((i & 4) != 0) {
            biometricConfirmation = biometricAuthRequest.confirmation;
        }
        return biometricAuthRequest.copy(biometricApi, biometricType, biometricConfirmation);
    }

    public final BiometricApi component1() {
        return this.api;
    }

    public final BiometricType component2() {
        return this.type;
    }

    public final BiometricConfirmation component3() {
        return this.confirmation;
    }

    public final BiometricAuthRequest copy(BiometricApi biometricApi, BiometricType biometricType, BiometricConfirmation biometricConfirmation) {
        C13706o.m87929f(biometricApi, "api");
        C13706o.m87929f(biometricType, "type");
        C13706o.m87929f(biometricConfirmation, "confirmation");
        return new BiometricAuthRequest(biometricApi, biometricType, biometricConfirmation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiometricAuthRequest)) {
            return false;
        }
        BiometricAuthRequest biometricAuthRequest = (BiometricAuthRequest) obj;
        return this.api == biometricAuthRequest.api && this.type == biometricAuthRequest.type && this.confirmation == biometricAuthRequest.confirmation;
    }

    public final BiometricApi getApi() {
        return this.api;
    }

    public final BiometricConfirmation getConfirmation() {
        return this.confirmation;
    }

    public final BiometricType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.api.hashCode() * 31) + this.type.hashCode()) * 31) + this.confirmation.hashCode();
    }

    public String toString() {
        BiometricApi biometricApi = this.api;
        BiometricType biometricType = this.type;
        BiometricConfirmation biometricConfirmation = this.confirmation;
        return "BiometricAuthRequest(api=" + biometricApi + ", type=" + biometricType + ", confirmation=" + biometricConfirmation + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BiometricAuthRequest(BiometricApi biometricApi, BiometricType biometricType, BiometricConfirmation biometricConfirmation, int i, C13695i iVar) {
        this((i & 1) != 0 ? BiometricApi.AUTO : biometricApi, (i & 2) != 0 ? BiometricType.BIOMETRIC_ANY : biometricType, (i & 4) != 0 ? BiometricConfirmation.ANY : biometricConfirmation);
    }
}

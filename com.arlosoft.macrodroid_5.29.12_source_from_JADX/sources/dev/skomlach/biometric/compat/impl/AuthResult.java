package dev.skomlach.biometric.compat.impl;

import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.AuthenticationResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u001aB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/AuthResult;", "", "authResultState", "Ldev/skomlach/biometric/compat/impl/AuthResult$AuthResultState;", "successData", "Ldev/skomlach/biometric/compat/AuthenticationResult;", "failureReason", "Ldev/skomlach/biometric/compat/AuthenticationFailureReason;", "(Ldev/skomlach/biometric/compat/impl/AuthResult$AuthResultState;Ldev/skomlach/biometric/compat/AuthenticationResult;Ldev/skomlach/biometric/compat/AuthenticationFailureReason;)V", "getAuthResultState", "()Ldev/skomlach/biometric/compat/impl/AuthResult$AuthResultState;", "getFailureReason", "()Ldev/skomlach/biometric/compat/AuthenticationFailureReason;", "getSuccessData", "()Ldev/skomlach/biometric/compat/AuthenticationResult;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "AuthResultState", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: AuthResult.kt */
public final class AuthResult {
    private final AuthResultState authResultState;
    private final AuthenticationFailureReason failureReason;
    private final AuthenticationResult successData;

    @Metadata(mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/AuthResult$AuthResultState;", "", "(Ljava/lang/String;I)V", "SUCCESS", "FATAL_ERROR", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: AuthResult.kt */
    public enum AuthResultState {
        SUCCESS,
        FATAL_ERROR
    }

    public AuthResult(AuthResultState authResultState2, AuthenticationResult authenticationResult, AuthenticationFailureReason authenticationFailureReason) {
        C13706o.m87929f(authResultState2, "authResultState");
        this.authResultState = authResultState2;
        this.successData = authenticationResult;
        this.failureReason = authenticationFailureReason;
    }

    public static /* synthetic */ AuthResult copy$default(AuthResult authResult, AuthResultState authResultState2, AuthenticationResult authenticationResult, AuthenticationFailureReason authenticationFailureReason, int i, Object obj) {
        if ((i & 1) != 0) {
            authResultState2 = authResult.authResultState;
        }
        if ((i & 2) != 0) {
            authenticationResult = authResult.successData;
        }
        if ((i & 4) != 0) {
            authenticationFailureReason = authResult.failureReason;
        }
        return authResult.copy(authResultState2, authenticationResult, authenticationFailureReason);
    }

    public final AuthResultState component1() {
        return this.authResultState;
    }

    public final AuthenticationResult component2() {
        return this.successData;
    }

    public final AuthenticationFailureReason component3() {
        return this.failureReason;
    }

    public final AuthResult copy(AuthResultState authResultState2, AuthenticationResult authenticationResult, AuthenticationFailureReason authenticationFailureReason) {
        C13706o.m87929f(authResultState2, "authResultState");
        return new AuthResult(authResultState2, authenticationResult, authenticationFailureReason);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthResult)) {
            return false;
        }
        AuthResult authResult = (AuthResult) obj;
        return this.authResultState == authResult.authResultState && C13706o.m87924a(this.successData, authResult.successData) && this.failureReason == authResult.failureReason;
    }

    public final AuthResultState getAuthResultState() {
        return this.authResultState;
    }

    public final AuthenticationFailureReason getFailureReason() {
        return this.failureReason;
    }

    public final AuthenticationResult getSuccessData() {
        return this.successData;
    }

    public int hashCode() {
        int hashCode = this.authResultState.hashCode() * 31;
        AuthenticationResult authenticationResult = this.successData;
        int i = 0;
        int hashCode2 = (hashCode + (authenticationResult == null ? 0 : authenticationResult.hashCode())) * 31;
        AuthenticationFailureReason authenticationFailureReason = this.failureReason;
        if (authenticationFailureReason != null) {
            i = authenticationFailureReason.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        AuthResultState authResultState2 = this.authResultState;
        AuthenticationResult authenticationResult = this.successData;
        AuthenticationFailureReason authenticationFailureReason = this.failureReason;
        return "AuthResult(authResultState=" + authResultState2 + ", successData=" + authenticationResult + ", failureReason=" + authenticationFailureReason + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AuthResult(AuthResultState authResultState2, AuthenticationResult authenticationResult, AuthenticationFailureReason authenticationFailureReason, int i, C13695i iVar) {
        this(authResultState2, (i & 2) != 0 ? null : authenticationResult, (i & 4) != 0 ? null : authenticationFailureReason);
    }
}

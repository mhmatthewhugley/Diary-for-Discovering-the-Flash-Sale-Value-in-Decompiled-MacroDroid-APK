package androidx.biometric.auth;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, mo71668d2 = {"Landroidx/biometric/auth/AuthPromptErrorException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorCode", "", "errorMessage", "", "(ILjava/lang/CharSequence;)V", "getErrorCode", "()I", "getErrorMessage", "()Ljava/lang/CharSequence;", "biometric-ktx_release"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
/* compiled from: AuthPromptErrorException.kt */
public final class AuthPromptErrorException extends Exception {
    private final int errorCode;
    private final CharSequence errorMessage;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthPromptErrorException(int i, CharSequence charSequence) {
        super(charSequence.toString());
        C13706o.m87929f(charSequence, "errorMessage");
        this.errorCode = i;
        this.errorMessage = charSequence;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final CharSequence getErrorMessage() {
        return this.errorMessage;
    }
}

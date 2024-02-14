package androidx.biometric.auth;

import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15492n;
import p297ja.C13329n;
import p297ja.C13332o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, mo71668d2 = {"Landroidx/biometric/auth/CoroutineAuthPromptCallback;", "Landroidx/biometric/auth/AuthPromptCallback;", "Landroidx/fragment/app/FragmentActivity;", "activity", "", "errorCode", "", "errString", "Lja/u;", "onAuthenticationError", "Landroidx/biometric/BiometricPrompt$AuthenticationResult;", "result", "onAuthenticationSucceeded", "onAuthenticationFailed", "Lkotlinx/coroutines/n;", "continuation", "Lkotlinx/coroutines/n;", "<init>", "(Lkotlinx/coroutines/n;)V", "biometric-ktx_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: CoroutineAuthPromptCallback.kt */
public final class CoroutineAuthPromptCallback extends AuthPromptCallback {
    private final C15492n<BiometricPrompt.AuthenticationResult> continuation;

    public CoroutineAuthPromptCallback(C15492n<? super BiometricPrompt.AuthenticationResult> nVar) {
        C13706o.m87929f(nVar, "continuation");
        this.continuation = nVar;
    }

    public void onAuthenticationError(FragmentActivity fragmentActivity, int i, CharSequence charSequence) {
        C13706o.m87929f(charSequence, "errString");
        C15492n<BiometricPrompt.AuthenticationResult> nVar = this.continuation;
        AuthPromptErrorException authPromptErrorException = new AuthPromptErrorException(i, charSequence);
        C13329n.C13330a aVar = C13329n.f61327a;
        nVar.resumeWith(C13329n.m85676a(C13332o.m85684a(authPromptErrorException)));
    }

    public void onAuthenticationFailed(FragmentActivity fragmentActivity) {
        C15492n<BiometricPrompt.AuthenticationResult> nVar = this.continuation;
        AuthPromptFailureException authPromptFailureException = new AuthPromptFailureException();
        C13329n.C13330a aVar = C13329n.f61327a;
        nVar.resumeWith(C13329n.m85676a(C13332o.m85684a(authPromptFailureException)));
    }

    public void onAuthenticationSucceeded(FragmentActivity fragmentActivity, BiometricPrompt.AuthenticationResult authenticationResult) {
        C13706o.m87929f(authenticationResult, "result");
        C15492n<BiometricPrompt.AuthenticationResult> nVar = this.continuation;
        C13329n.C13330a aVar = C13329n.f61327a;
        nVar.resumeWith(C13329n.m85676a(authenticationResult));
    }
}

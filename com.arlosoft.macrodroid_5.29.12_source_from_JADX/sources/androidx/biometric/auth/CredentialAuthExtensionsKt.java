package androidx.biometric.auth;

import androidx.annotation.RequiresApi;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.auth.CredentialAuthPrompt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15497o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a>\u0010\u0011\u001a\u00020\u0010*\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007\u001a5\u0010\u0012\u001a\u00020\u0005*\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a>\u0010\u0011\u001a\u00020\u0010*\u00020\u00142\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007\u001a5\u0010\u0012\u001a\u00020\u0005*\u00020\u00142\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0015\u001a>\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0003\u001a\u001a\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0003\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, mo71668d2 = {"Landroidx/biometric/auth/CredentialAuthPrompt;", "Landroidx/biometric/auth/AuthPromptHost;", "host", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "crypto", "Landroidx/biometric/BiometricPrompt$AuthenticationResult;", "authenticate", "(Landroidx/biometric/auth/CredentialAuthPrompt;Landroidx/biometric/auth/AuthPromptHost;Landroidx/biometric/BiometricPrompt$CryptoObject;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/fragment/app/FragmentActivity;", "", "title", "description", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/biometric/auth/AuthPromptCallback;", "callback", "Landroidx/biometric/auth/AuthPrompt;", "startCredentialAuthentication", "authenticateWithCredentials", "(Landroidx/fragment/app/FragmentActivity;Landroidx/biometric/BiometricPrompt$CryptoObject;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Landroidx/biometric/BiometricPrompt$CryptoObject;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/coroutines/d;)Ljava/lang/Object;", "startCredentialAuthenticationInternal", "buildCredentialAuthPrompt", "biometric-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: CredentialAuthExtensions.kt */
public final class CredentialAuthExtensionsKt {
    @RequiresApi(30)
    public static final Object authenticate(CredentialAuthPrompt credentialAuthPrompt, AuthPromptHost authPromptHost, BiometricPrompt.CryptoObject cryptoObject, C13635d<? super BiometricPrompt.AuthenticationResult> dVar) {
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74864z();
        AuthPrompt startAuthentication = credentialAuthPrompt.startAuthentication(authPromptHost, cryptoObject, C0271a.f317a, new CoroutineAuthPromptCallback(oVar));
        C13706o.m87928e(startAuthentication, "startAuthentication(\n   …k(continuation)\n        )");
        oVar.mo74843d(new CredentialAuthExtensionsKt$authenticate$2$1(startAuthentication));
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w;
    }

    @RequiresApi(30)
    public static final Object authenticateWithCredentials(FragmentActivity fragmentActivity, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, C13635d<? super BiometricPrompt.AuthenticationResult> dVar) {
        return authenticate(buildCredentialAuthPrompt(charSequence, charSequence2), new AuthPromptHost(fragmentActivity), cryptoObject, dVar);
    }

    public static /* synthetic */ Object authenticateWithCredentials$default(FragmentActivity fragmentActivity, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, C13635d dVar, int i, Object obj) {
        if ((i & 4) != 0) {
            charSequence2 = null;
        }
        return authenticateWithCredentials(fragmentActivity, cryptoObject, charSequence, charSequence2, (C13635d<? super BiometricPrompt.AuthenticationResult>) dVar);
    }

    @RequiresApi(30)
    private static final CredentialAuthPrompt buildCredentialAuthPrompt(CharSequence charSequence, CharSequence charSequence2) {
        CredentialAuthPrompt.Builder builder = new CredentialAuthPrompt.Builder(charSequence);
        if (charSequence2 != null) {
            builder.setDescription(charSequence2);
        }
        CredentialAuthPrompt build = builder.build();
        C13706o.m87928e(build, "buildCredentialAuthPrompt");
        return build;
    }

    @RequiresApi(30)
    public static final AuthPrompt startCredentialAuthentication(FragmentActivity fragmentActivity, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, Executor executor, AuthPromptCallback authPromptCallback) {
        C13706o.m87929f(fragmentActivity, "<this>");
        C13706o.m87929f(charSequence, "title");
        C13706o.m87929f(authPromptCallback, "callback");
        return startCredentialAuthenticationInternal(new AuthPromptHost(fragmentActivity), cryptoObject, charSequence, charSequence2, executor, authPromptCallback);
    }

    public static /* synthetic */ AuthPrompt startCredentialAuthentication$default(FragmentActivity fragmentActivity, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, Executor executor, AuthPromptCallback authPromptCallback, int i, Object obj) {
        return startCredentialAuthentication(fragmentActivity, cryptoObject, charSequence, (i & 4) != 0 ? null : charSequence2, (i & 8) != 0 ? null : executor, authPromptCallback);
    }

    @RequiresApi(30)
    private static final AuthPrompt startCredentialAuthenticationInternal(AuthPromptHost authPromptHost, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, Executor executor, AuthPromptCallback authPromptCallback) {
        CredentialAuthPrompt buildCredentialAuthPrompt = buildCredentialAuthPrompt(charSequence, charSequence2);
        if (executor == null) {
            AuthPrompt startAuthentication = buildCredentialAuthPrompt.startAuthentication(authPromptHost, cryptoObject, authPromptCallback);
            C13706o.m87928e(startAuthentication, "{\n        prompt.startAu…, crypto, callback)\n    }");
            return startAuthentication;
        }
        AuthPrompt startAuthentication2 = buildCredentialAuthPrompt.startAuthentication(authPromptHost, cryptoObject, executor, authPromptCallback);
        C13706o.m87928e(startAuthentication2, "{\n        prompt.startAu…executor, callback)\n    }");
        return startAuthentication2;
    }

    public static /* synthetic */ Object authenticateWithCredentials$default(Fragment fragment, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, C13635d dVar, int i, Object obj) {
        if ((i & 4) != 0) {
            charSequence2 = null;
        }
        return authenticateWithCredentials(fragment, cryptoObject, charSequence, charSequence2, (C13635d<? super BiometricPrompt.AuthenticationResult>) dVar);
    }

    public static /* synthetic */ AuthPrompt startCredentialAuthentication$default(Fragment fragment, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, Executor executor, AuthPromptCallback authPromptCallback, int i, Object obj) {
        return startCredentialAuthentication(fragment, cryptoObject, charSequence, (i & 4) != 0 ? null : charSequence2, (i & 8) != 0 ? null : executor, authPromptCallback);
    }

    @RequiresApi(30)
    public static final Object authenticateWithCredentials(Fragment fragment, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, C13635d<? super BiometricPrompt.AuthenticationResult> dVar) {
        return authenticate(buildCredentialAuthPrompt(charSequence, charSequence2), new AuthPromptHost(fragment), cryptoObject, dVar);
    }

    @RequiresApi(30)
    public static final AuthPrompt startCredentialAuthentication(Fragment fragment, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, Executor executor, AuthPromptCallback authPromptCallback) {
        C13706o.m87929f(fragment, "<this>");
        C13706o.m87929f(charSequence, "title");
        C13706o.m87929f(authPromptCallback, "callback");
        return startCredentialAuthenticationInternal(new AuthPromptHost(fragment), cryptoObject, charSequence, charSequence2, executor, authPromptCallback);
    }
}

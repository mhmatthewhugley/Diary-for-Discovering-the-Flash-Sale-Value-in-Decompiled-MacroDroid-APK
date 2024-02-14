package androidx.biometric.auth;

import androidx.annotation.RequiresApi;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.auth.Class3BiometricOrCredentialAuthPrompt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15497o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aT\u0010\u0014\u001a\u00020\u0013*\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007\u001aK\u0010\u0015\u001a\u00020\u0005*\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001aT\u0010\u0014\u001a\u00020\u0013*\u00020\u00172\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007\u001aK\u0010\u0015\u001a\u00020\u0005*\u00020\u00172\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0018\u001aP\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003\u001a,\u0010\u001a\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\rH\u0003\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, mo71668d2 = {"Landroidx/biometric/auth/Class3BiometricOrCredentialAuthPrompt;", "Landroidx/biometric/auth/AuthPromptHost;", "host", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "crypto", "Landroidx/biometric/BiometricPrompt$AuthenticationResult;", "authenticate", "(Landroidx/biometric/auth/Class3BiometricOrCredentialAuthPrompt;Landroidx/biometric/auth/AuthPromptHost;Landroidx/biometric/BiometricPrompt$CryptoObject;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/fragment/app/FragmentActivity;", "", "title", "subtitle", "description", "", "confirmationRequired", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/biometric/auth/AuthPromptCallback;", "callback", "Landroidx/biometric/auth/AuthPrompt;", "startClass3BiometricOrCredentialAuthentication", "authenticateWithClass3BiometricsOrCredentials", "(Landroidx/fragment/app/FragmentActivity;Landroidx/biometric/BiometricPrompt$CryptoObject;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Landroidx/biometric/BiometricPrompt$CryptoObject;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "startClass3BiometricOrCredentialAuthenticationInternal", "buildClass3BiometricOrCredentialAuthPrompt", "biometric-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: Class3BiometricOrCredentialAuthExtensions.kt */
public final class Class3BiometricOrCredentialAuthExtensionsKt {
    @RequiresApi(30)
    public static final Object authenticate(Class3BiometricOrCredentialAuthPrompt class3BiometricOrCredentialAuthPrompt, AuthPromptHost authPromptHost, BiometricPrompt.CryptoObject cryptoObject, C13635d<? super BiometricPrompt.AuthenticationResult> dVar) {
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74864z();
        AuthPrompt startAuthentication = class3BiometricOrCredentialAuthPrompt.startAuthentication(authPromptHost, cryptoObject, C0271a.f317a, new CoroutineAuthPromptCallback(oVar));
        C13706o.m87928e(startAuthentication, "startAuthentication(\n   …k(continuation)\n        )");
        oVar.mo74843d(new Class3BiometricOrCredentialAuthExtensionsKt$authenticate$2$1(startAuthentication));
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w;
    }

    @RequiresApi(30)
    public static final Object authenticateWithClass3BiometricsOrCredentials(FragmentActivity fragmentActivity, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, C13635d<? super BiometricPrompt.AuthenticationResult> dVar) {
        return authenticate(buildClass3BiometricOrCredentialAuthPrompt(charSequence, charSequence2, charSequence3, z), new AuthPromptHost(fragmentActivity), cryptoObject, dVar);
    }

    public static /* synthetic */ Object authenticateWithClass3BiometricsOrCredentials$default(FragmentActivity fragmentActivity, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, C13635d dVar, int i, Object obj) {
        return authenticateWithClass3BiometricsOrCredentials(fragmentActivity, cryptoObject, charSequence, (i & 4) != 0 ? null : charSequence2, (i & 8) != 0 ? null : charSequence3, (i & 16) != 0 ? true : z, (C13635d<? super BiometricPrompt.AuthenticationResult>) dVar);
    }

    @RequiresApi(30)
    private static final Class3BiometricOrCredentialAuthPrompt buildClass3BiometricOrCredentialAuthPrompt(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z) {
        Class3BiometricOrCredentialAuthPrompt.Builder builder = new Class3BiometricOrCredentialAuthPrompt.Builder(charSequence);
        if (charSequence2 != null) {
            builder.setSubtitle(charSequence2);
        }
        if (charSequence3 != null) {
            builder.setDescription(charSequence3);
        }
        builder.setConfirmationRequired(z);
        Class3BiometricOrCredentialAuthPrompt build = builder.build();
        C13706o.m87928e(build, "Builder(title)\n    .appl…uired)\n    }\n    .build()");
        return build;
    }

    @RequiresApi(30)
    public static final AuthPrompt startClass3BiometricOrCredentialAuthentication(FragmentActivity fragmentActivity, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, Executor executor, AuthPromptCallback authPromptCallback) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        C13706o.m87929f(fragmentActivity, "<this>");
        C13706o.m87929f(charSequence, "title");
        AuthPromptCallback authPromptCallback2 = authPromptCallback;
        C13706o.m87929f(authPromptCallback2, "callback");
        return startClass3BiometricOrCredentialAuthenticationInternal(new AuthPromptHost(fragmentActivity), cryptoObject, charSequence, charSequence2, charSequence3, z, executor, authPromptCallback2);
    }

    public static /* synthetic */ AuthPrompt startClass3BiometricOrCredentialAuthentication$default(FragmentActivity fragmentActivity, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, Executor executor, AuthPromptCallback authPromptCallback, int i, Object obj) {
        return startClass3BiometricOrCredentialAuthentication(fragmentActivity, cryptoObject, charSequence, (i & 4) != 0 ? null : charSequence2, (i & 8) != 0 ? null : charSequence3, (i & 16) != 0 ? true : z, (i & 32) != 0 ? null : executor, authPromptCallback);
    }

    @RequiresApi(30)
    private static final AuthPrompt startClass3BiometricOrCredentialAuthenticationInternal(AuthPromptHost authPromptHost, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, Executor executor, AuthPromptCallback authPromptCallback) {
        Class3BiometricOrCredentialAuthPrompt buildClass3BiometricOrCredentialAuthPrompt = buildClass3BiometricOrCredentialAuthPrompt(charSequence, charSequence2, charSequence3, z);
        if (executor == null) {
            AuthPrompt startAuthentication = buildClass3BiometricOrCredentialAuthPrompt.startAuthentication(authPromptHost, cryptoObject, authPromptCallback);
            C13706o.m87928e(startAuthentication, "{\n        prompt.startAu…, crypto, callback)\n    }");
            return startAuthentication;
        }
        AuthPrompt startAuthentication2 = buildClass3BiometricOrCredentialAuthPrompt.startAuthentication(authPromptHost, cryptoObject, executor, authPromptCallback);
        C13706o.m87928e(startAuthentication2, "{\n        prompt.startAu…executor, callback)\n    }");
        return startAuthentication2;
    }

    public static /* synthetic */ Object authenticateWithClass3BiometricsOrCredentials$default(Fragment fragment, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, C13635d dVar, int i, Object obj) {
        return authenticateWithClass3BiometricsOrCredentials(fragment, cryptoObject, charSequence, (i & 4) != 0 ? null : charSequence2, (i & 8) != 0 ? null : charSequence3, (i & 16) != 0 ? true : z, (C13635d<? super BiometricPrompt.AuthenticationResult>) dVar);
    }

    public static /* synthetic */ AuthPrompt startClass3BiometricOrCredentialAuthentication$default(Fragment fragment, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, Executor executor, AuthPromptCallback authPromptCallback, int i, Object obj) {
        return startClass3BiometricOrCredentialAuthentication(fragment, cryptoObject, charSequence, (i & 4) != 0 ? null : charSequence2, (i & 8) != 0 ? null : charSequence3, (i & 16) != 0 ? true : z, (i & 32) != 0 ? null : executor, authPromptCallback);
    }

    @RequiresApi(30)
    public static final Object authenticateWithClass3BiometricsOrCredentials(Fragment fragment, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, C13635d<? super BiometricPrompt.AuthenticationResult> dVar) {
        return authenticate(buildClass3BiometricOrCredentialAuthPrompt(charSequence, charSequence2, charSequence3, z), new AuthPromptHost(fragment), cryptoObject, dVar);
    }

    @RequiresApi(30)
    public static final AuthPrompt startClass3BiometricOrCredentialAuthentication(Fragment fragment, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, Executor executor, AuthPromptCallback authPromptCallback) {
        Fragment fragment2 = fragment;
        C13706o.m87929f(fragment, "<this>");
        C13706o.m87929f(charSequence, "title");
        AuthPromptCallback authPromptCallback2 = authPromptCallback;
        C13706o.m87929f(authPromptCallback2, "callback");
        return startClass3BiometricOrCredentialAuthenticationInternal(new AuthPromptHost(fragment), cryptoObject, charSequence, charSequence2, charSequence3, z, executor, authPromptCallback2);
    }
}

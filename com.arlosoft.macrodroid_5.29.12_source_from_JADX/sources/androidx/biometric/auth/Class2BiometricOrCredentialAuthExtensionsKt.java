package androidx.biometric.auth;

import androidx.biometric.BiometricPrompt;
import androidx.biometric.auth.Class2BiometricOrCredentialAuthPrompt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15497o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aH\u0010\u0012\u001a\u00020\u0011*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f\u001aA\u0010\u0013\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aH\u0010\u0012\u001a\u00020\u0011*\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f\u001aA\u0010\u0013\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0016\u001aF\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u001a2\u0010\u0018\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, mo71668d2 = {"Landroidx/biometric/auth/Class2BiometricOrCredentialAuthPrompt;", "Landroidx/biometric/auth/AuthPromptHost;", "host", "Landroidx/biometric/BiometricPrompt$AuthenticationResult;", "authenticate", "(Landroidx/biometric/auth/Class2BiometricOrCredentialAuthPrompt;Landroidx/biometric/auth/AuthPromptHost;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/fragment/app/FragmentActivity;", "", "title", "subtitle", "description", "", "confirmationRequired", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/biometric/auth/AuthPromptCallback;", "callback", "Landroidx/biometric/auth/AuthPrompt;", "startClass2BiometricOrCredentialAuthentication", "authenticateWithClass2BiometricsOrCredentials", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "startClass2BiometricOrCredentialAuthenticationInternal", "buildClass2BiometricOrCredentialAuthPrompt", "biometric-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: Class2BiometricOrCredentialAuthExtensions.kt */
public final class Class2BiometricOrCredentialAuthExtensionsKt {
    public static final Object authenticate(Class2BiometricOrCredentialAuthPrompt class2BiometricOrCredentialAuthPrompt, AuthPromptHost authPromptHost, C13635d<? super BiometricPrompt.AuthenticationResult> dVar) {
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74864z();
        AuthPrompt startAuthentication = class2BiometricOrCredentialAuthPrompt.startAuthentication(authPromptHost, C0271a.f317a, new CoroutineAuthPromptCallback(oVar));
        C13706o.m87928e(startAuthentication, "startAuthentication(\n   …k(continuation)\n        )");
        oVar.mo74843d(new Class2BiometricOrCredentialAuthExtensionsKt$authenticate$2$1(startAuthentication));
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w;
    }

    public static final Object authenticateWithClass2BiometricsOrCredentials(FragmentActivity fragmentActivity, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, C13635d<? super BiometricPrompt.AuthenticationResult> dVar) {
        return authenticate(buildClass2BiometricOrCredentialAuthPrompt(charSequence, charSequence2, charSequence3, z), new AuthPromptHost(fragmentActivity), dVar);
    }

    public static /* synthetic */ Object authenticateWithClass2BiometricsOrCredentials$default(FragmentActivity fragmentActivity, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, C13635d dVar, int i, Object obj) {
        return authenticateWithClass2BiometricsOrCredentials(fragmentActivity, charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? null : charSequence3, (i & 8) != 0 ? true : z, (C13635d<? super BiometricPrompt.AuthenticationResult>) dVar);
    }

    private static final Class2BiometricOrCredentialAuthPrompt buildClass2BiometricOrCredentialAuthPrompt(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z) {
        Class2BiometricOrCredentialAuthPrompt.Builder builder = new Class2BiometricOrCredentialAuthPrompt.Builder(charSequence);
        if (charSequence2 != null) {
            builder.setSubtitle(charSequence2);
        }
        if (charSequence3 != null) {
            builder.setDescription(charSequence3);
        }
        builder.setConfirmationRequired(z);
        Class2BiometricOrCredentialAuthPrompt build = builder.build();
        C13706o.m87928e(build, "Builder(title)\n    .appl…uired)\n    }\n    .build()");
        return build;
    }

    static /* synthetic */ Class2BiometricOrCredentialAuthPrompt buildClass2BiometricOrCredentialAuthPrompt$default(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            charSequence2 = null;
        }
        if ((i & 4) != 0) {
            charSequence3 = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return buildClass2BiometricOrCredentialAuthPrompt(charSequence, charSequence2, charSequence3, z);
    }

    public static final AuthPrompt startClass2BiometricOrCredentialAuthentication(FragmentActivity fragmentActivity, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, Executor executor, AuthPromptCallback authPromptCallback) {
        C13706o.m87929f(fragmentActivity, "<this>");
        C13706o.m87929f(charSequence, "title");
        C13706o.m87929f(authPromptCallback, "callback");
        return startClass2BiometricOrCredentialAuthenticationInternal(new AuthPromptHost(fragmentActivity), charSequence, charSequence2, charSequence3, z, executor, authPromptCallback);
    }

    public static /* synthetic */ AuthPrompt startClass2BiometricOrCredentialAuthentication$default(FragmentActivity fragmentActivity, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, Executor executor, AuthPromptCallback authPromptCallback, int i, Object obj) {
        return startClass2BiometricOrCredentialAuthentication(fragmentActivity, charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? null : charSequence3, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : executor, authPromptCallback);
    }

    private static final AuthPrompt startClass2BiometricOrCredentialAuthenticationInternal(AuthPromptHost authPromptHost, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, Executor executor, AuthPromptCallback authPromptCallback) {
        Class2BiometricOrCredentialAuthPrompt buildClass2BiometricOrCredentialAuthPrompt = buildClass2BiometricOrCredentialAuthPrompt(charSequence, charSequence2, charSequence3, z);
        if (executor == null) {
            AuthPrompt startAuthentication = buildClass2BiometricOrCredentialAuthPrompt.startAuthentication(authPromptHost, authPromptCallback);
            C13706o.m87928e(startAuthentication, "{\n        prompt.startAu…ion(host, callback)\n    }");
            return startAuthentication;
        }
        AuthPrompt startAuthentication2 = buildClass2BiometricOrCredentialAuthPrompt.startAuthentication(authPromptHost, executor, authPromptCallback);
        C13706o.m87928e(startAuthentication2, "{\n        prompt.startAu…executor, callback)\n    }");
        return startAuthentication2;
    }

    public static /* synthetic */ Object authenticateWithClass2BiometricsOrCredentials$default(Fragment fragment, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, C13635d dVar, int i, Object obj) {
        return authenticateWithClass2BiometricsOrCredentials(fragment, charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? null : charSequence3, (i & 8) != 0 ? true : z, (C13635d<? super BiometricPrompt.AuthenticationResult>) dVar);
    }

    public static /* synthetic */ AuthPrompt startClass2BiometricOrCredentialAuthentication$default(Fragment fragment, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, Executor executor, AuthPromptCallback authPromptCallback, int i, Object obj) {
        return startClass2BiometricOrCredentialAuthentication(fragment, charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? null : charSequence3, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : executor, authPromptCallback);
    }

    public static final Object authenticateWithClass2BiometricsOrCredentials(Fragment fragment, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, C13635d<? super BiometricPrompt.AuthenticationResult> dVar) {
        return authenticate(buildClass2BiometricOrCredentialAuthPrompt(charSequence, charSequence2, charSequence3, z), new AuthPromptHost(fragment), dVar);
    }

    public static final AuthPrompt startClass2BiometricOrCredentialAuthentication(Fragment fragment, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, Executor executor, AuthPromptCallback authPromptCallback) {
        C13706o.m87929f(fragment, "<this>");
        C13706o.m87929f(charSequence, "title");
        C13706o.m87929f(authPromptCallback, "callback");
        return startClass2BiometricOrCredentialAuthenticationInternal(new AuthPromptHost(fragment), charSequence, charSequence2, charSequence3, z, executor, authPromptCallback);
    }
}

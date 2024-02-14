package androidx.biometric.auth;

import androidx.biometric.BiometricPrompt;
import androidx.biometric.auth.Class2BiometricAuthPrompt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15497o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aP\u0010\u0013\u001a\u00020\u0012*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010\u001aI\u0010\u0014\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aP\u0010\u0013\u001a\u00020\u0012*\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010\u001aI\u0010\u0014\u001a\u00020\u0003*\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0017\u001aN\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a4\u0010\u0019\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\fH\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, mo71668d2 = {"Landroidx/biometric/auth/Class2BiometricAuthPrompt;", "Landroidx/biometric/auth/AuthPromptHost;", "host", "Landroidx/biometric/BiometricPrompt$AuthenticationResult;", "authenticate", "(Landroidx/biometric/auth/Class2BiometricAuthPrompt;Landroidx/biometric/auth/AuthPromptHost;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/fragment/app/FragmentActivity;", "", "title", "negativeButtonText", "subtitle", "description", "", "confirmationRequired", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/biometric/auth/AuthPromptCallback;", "callback", "Landroidx/biometric/auth/AuthPrompt;", "startClass2BiometricAuthentication", "authenticateWithClass2Biometrics", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "startClass2BiometricAuthenticationInternal", "buildClass2BiometricAuthPrompt", "biometric-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: Class2BiometricAuthExtensions.kt */
public final class Class2BiometricAuthExtensionsKt {
    public static final Object authenticate(Class2BiometricAuthPrompt class2BiometricAuthPrompt, AuthPromptHost authPromptHost, C13635d<? super BiometricPrompt.AuthenticationResult> dVar) {
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74864z();
        AuthPrompt startAuthentication = class2BiometricAuthPrompt.startAuthentication(authPromptHost, C0271a.f317a, new CoroutineAuthPromptCallback(oVar));
        C13706o.m87928e(startAuthentication, "startAuthentication(\n   …k(continuation)\n        )");
        oVar.mo74843d(new Class2BiometricAuthExtensionsKt$authenticate$2$1(startAuthentication));
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w;
    }

    public static final Object authenticateWithClass2Biometrics(FragmentActivity fragmentActivity, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, C13635d<? super BiometricPrompt.AuthenticationResult> dVar) {
        return authenticate(buildClass2BiometricAuthPrompt(charSequence, charSequence2, charSequence3, charSequence4, z), new AuthPromptHost(fragmentActivity), dVar);
    }

    public static /* synthetic */ Object authenticateWithClass2Biometrics$default(FragmentActivity fragmentActivity, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, C13635d dVar, int i, Object obj) {
        return authenticateWithClass2Biometrics(fragmentActivity, charSequence, charSequence2, (i & 4) != 0 ? null : charSequence3, (i & 8) != 0 ? null : charSequence4, (i & 16) != 0 ? true : z, (C13635d<? super BiometricPrompt.AuthenticationResult>) dVar);
    }

    private static final Class2BiometricAuthPrompt buildClass2BiometricAuthPrompt(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z) {
        Class2BiometricAuthPrompt.Builder builder = new Class2BiometricAuthPrompt.Builder(charSequence, charSequence2);
        if (charSequence3 != null) {
            builder.setSubtitle(charSequence3);
        }
        if (charSequence4 != null) {
            builder.setDescription(charSequence4);
        }
        builder.setConfirmationRequired(z);
        Class2BiometricAuthPrompt build = builder.build();
        C13706o.m87928e(build, "Builder(title, negativeB…uired)\n    }\n    .build()");
        return build;
    }

    public static final AuthPrompt startClass2BiometricAuthentication(FragmentActivity fragmentActivity, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, Executor executor, AuthPromptCallback authPromptCallback) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        C13706o.m87929f(fragmentActivity, "<this>");
        C13706o.m87929f(charSequence, "title");
        C13706o.m87929f(charSequence2, "negativeButtonText");
        AuthPromptCallback authPromptCallback2 = authPromptCallback;
        C13706o.m87929f(authPromptCallback2, "callback");
        return startClass2BiometricAuthenticationInternal(new AuthPromptHost(fragmentActivity), charSequence, charSequence2, charSequence3, charSequence4, z, executor, authPromptCallback2);
    }

    public static /* synthetic */ AuthPrompt startClass2BiometricAuthentication$default(FragmentActivity fragmentActivity, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, Executor executor, AuthPromptCallback authPromptCallback, int i, Object obj) {
        return startClass2BiometricAuthentication(fragmentActivity, charSequence, charSequence2, (i & 4) != 0 ? null : charSequence3, (i & 8) != 0 ? null : charSequence4, (i & 16) != 0 ? true : z, (i & 32) != 0 ? null : executor, authPromptCallback);
    }

    private static final AuthPrompt startClass2BiometricAuthenticationInternal(AuthPromptHost authPromptHost, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, Executor executor, AuthPromptCallback authPromptCallback) {
        Class2BiometricAuthPrompt buildClass2BiometricAuthPrompt = buildClass2BiometricAuthPrompt(charSequence, charSequence2, charSequence3, charSequence4, z);
        if (executor == null) {
            AuthPrompt startAuthentication = buildClass2BiometricAuthPrompt.startAuthentication(authPromptHost, authPromptCallback);
            C13706o.m87928e(startAuthentication, "{\n        prompt.startAu…ion(host, callback)\n    }");
            return startAuthentication;
        }
        AuthPrompt startAuthentication2 = buildClass2BiometricAuthPrompt.startAuthentication(authPromptHost, executor, authPromptCallback);
        C13706o.m87928e(startAuthentication2, "{\n        prompt.startAu…executor, callback)\n    }");
        return startAuthentication2;
    }

    public static /* synthetic */ Object authenticateWithClass2Biometrics$default(Fragment fragment, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, C13635d dVar, int i, Object obj) {
        return authenticateWithClass2Biometrics(fragment, charSequence, charSequence2, (i & 4) != 0 ? null : charSequence3, (i & 8) != 0 ? null : charSequence4, (i & 16) != 0 ? true : z, (C13635d<? super BiometricPrompt.AuthenticationResult>) dVar);
    }

    public static /* synthetic */ AuthPrompt startClass2BiometricAuthentication$default(Fragment fragment, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, Executor executor, AuthPromptCallback authPromptCallback, int i, Object obj) {
        return startClass2BiometricAuthentication(fragment, charSequence, charSequence2, (i & 4) != 0 ? null : charSequence3, (i & 8) != 0 ? null : charSequence4, (i & 16) != 0 ? true : z, (i & 32) != 0 ? null : executor, authPromptCallback);
    }

    public static final Object authenticateWithClass2Biometrics(Fragment fragment, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, C13635d<? super BiometricPrompt.AuthenticationResult> dVar) {
        return authenticate(buildClass2BiometricAuthPrompt(charSequence, charSequence2, charSequence3, charSequence4, z), new AuthPromptHost(fragment), dVar);
    }

    public static final AuthPrompt startClass2BiometricAuthentication(Fragment fragment, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, Executor executor, AuthPromptCallback authPromptCallback) {
        Fragment fragment2 = fragment;
        C13706o.m87929f(fragment, "<this>");
        C13706o.m87929f(charSequence, "title");
        C13706o.m87929f(charSequence2, "negativeButtonText");
        AuthPromptCallback authPromptCallback2 = authPromptCallback;
        C13706o.m87929f(authPromptCallback2, "callback");
        return startClass2BiometricAuthenticationInternal(new AuthPromptHost(fragment), charSequence, charSequence2, charSequence3, charSequence4, z, executor, authPromptCallback2);
    }
}

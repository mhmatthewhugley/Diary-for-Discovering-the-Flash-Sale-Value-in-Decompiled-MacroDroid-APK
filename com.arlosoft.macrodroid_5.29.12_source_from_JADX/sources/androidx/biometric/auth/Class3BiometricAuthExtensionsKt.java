package androidx.biometric.auth;

import androidx.biometric.BiometricPrompt;
import androidx.biometric.auth.Class3BiometricAuthPrompt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15497o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aZ\u0010\u0015\u001a\u00020\u0014*\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012\u001aS\u0010\u0015\u001a\u00020\u0005*\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001aZ\u0010\u0015\u001a\u00020\u0014*\u00020\u00172\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012\u001aS\u0010\u0015\u001a\u00020\u0005*\u00020\u00172\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0018\u001aX\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u001a4\u0010\u001a\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, mo71668d2 = {"Landroidx/biometric/auth/Class3BiometricAuthPrompt;", "Landroidx/biometric/auth/AuthPromptHost;", "host", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "crypto", "Landroidx/biometric/BiometricPrompt$AuthenticationResult;", "authenticate", "(Landroidx/biometric/auth/Class3BiometricAuthPrompt;Landroidx/biometric/auth/AuthPromptHost;Landroidx/biometric/BiometricPrompt$CryptoObject;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/fragment/app/FragmentActivity;", "", "title", "negativeButtonText", "subtitle", "description", "", "confirmationRequired", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/biometric/auth/AuthPromptCallback;", "callback", "Landroidx/biometric/auth/AuthPrompt;", "authenticateWithClass3Biometrics", "(Landroidx/fragment/app/FragmentActivity;Landroidx/biometric/BiometricPrompt$CryptoObject;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Landroidx/biometric/BiometricPrompt$CryptoObject;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "startClass3BiometricAuthenticationInternal", "buildClass3BiometricAuthPrompt", "biometric-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: Class3BiometricAuthExtensions.kt */
public final class Class3BiometricAuthExtensionsKt {
    public static final Object authenticate(Class3BiometricAuthPrompt class3BiometricAuthPrompt, AuthPromptHost authPromptHost, BiometricPrompt.CryptoObject cryptoObject, C13635d<? super BiometricPrompt.AuthenticationResult> dVar) {
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74864z();
        AuthPrompt startAuthentication = class3BiometricAuthPrompt.startAuthentication(authPromptHost, cryptoObject, C0271a.f317a, new CoroutineAuthPromptCallback(oVar));
        C13706o.m87928e(startAuthentication, "startAuthentication(\n   …k(continuation)\n        )");
        oVar.mo74843d(new Class3BiometricAuthExtensionsKt$authenticate$2$1(startAuthentication));
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w;
    }

    public static final AuthPrompt authenticateWithClass3Biometrics(FragmentActivity fragmentActivity, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, Executor executor, AuthPromptCallback authPromptCallback) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        C13706o.m87929f(fragmentActivity, "<this>");
        C13706o.m87929f(charSequence, "title");
        C13706o.m87929f(charSequence2, "negativeButtonText");
        AuthPromptCallback authPromptCallback2 = authPromptCallback;
        C13706o.m87929f(authPromptCallback2, "callback");
        return startClass3BiometricAuthenticationInternal(new AuthPromptHost(fragmentActivity), cryptoObject, charSequence, charSequence2, charSequence3, charSequence4, z, executor, authPromptCallback2);
    }

    public static /* synthetic */ AuthPrompt authenticateWithClass3Biometrics$default(FragmentActivity fragmentActivity, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, Executor executor, AuthPromptCallback authPromptCallback, int i, Object obj) {
        return authenticateWithClass3Biometrics(fragmentActivity, cryptoObject, charSequence, charSequence2, (i & 8) != 0 ? null : charSequence3, (i & 16) != 0 ? null : charSequence4, (i & 32) != 0 ? true : z, (i & 64) != 0 ? null : executor, authPromptCallback);
    }

    private static final Class3BiometricAuthPrompt buildClass3BiometricAuthPrompt(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z) {
        Class3BiometricAuthPrompt.Builder builder = new Class3BiometricAuthPrompt.Builder(charSequence, charSequence2);
        if (charSequence3 != null) {
            builder.setSubtitle(charSequence3);
        }
        if (charSequence4 != null) {
            builder.setDescription(charSequence4);
        }
        builder.setConfirmationRequired(z);
        Class3BiometricAuthPrompt build = builder.build();
        C13706o.m87928e(build, "Builder(title, negativeB…uired)\n    }\n    .build()");
        return build;
    }

    private static final AuthPrompt startClass3BiometricAuthenticationInternal(AuthPromptHost authPromptHost, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, Executor executor, AuthPromptCallback authPromptCallback) {
        Class3BiometricAuthPrompt buildClass3BiometricAuthPrompt = buildClass3BiometricAuthPrompt(charSequence, charSequence2, charSequence3, charSequence4, z);
        if (executor == null) {
            AuthPrompt startAuthentication = buildClass3BiometricAuthPrompt.startAuthentication(authPromptHost, cryptoObject, authPromptCallback);
            C13706o.m87928e(startAuthentication, "{\n        prompt.startAu…, crypto, callback)\n    }");
            return startAuthentication;
        }
        AuthPrompt startAuthentication2 = buildClass3BiometricAuthPrompt.startAuthentication(authPromptHost, cryptoObject, executor, authPromptCallback);
        C13706o.m87928e(startAuthentication2, "{\n        prompt.startAu…executor, callback)\n    }");
        return startAuthentication2;
    }

    public static /* synthetic */ Object authenticateWithClass3Biometrics$default(FragmentActivity fragmentActivity, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, C13635d dVar, int i, Object obj) {
        return authenticateWithClass3Biometrics(fragmentActivity, cryptoObject, charSequence, charSequence2, (i & 8) != 0 ? null : charSequence3, (i & 16) != 0 ? null : charSequence4, (i & 32) != 0 ? true : z, (C13635d<? super BiometricPrompt.AuthenticationResult>) dVar);
    }

    public static final Object authenticateWithClass3Biometrics(FragmentActivity fragmentActivity, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, C13635d<? super BiometricPrompt.AuthenticationResult> dVar) {
        return authenticate(buildClass3BiometricAuthPrompt(charSequence, charSequence2, charSequence3, charSequence4, z), new AuthPromptHost(fragmentActivity), cryptoObject, dVar);
    }

    public static /* synthetic */ AuthPrompt authenticateWithClass3Biometrics$default(Fragment fragment, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, Executor executor, AuthPromptCallback authPromptCallback, int i, Object obj) {
        return authenticateWithClass3Biometrics(fragment, cryptoObject, charSequence, charSequence2, (i & 8) != 0 ? null : charSequence3, (i & 16) != 0 ? null : charSequence4, (i & 32) != 0 ? true : z, (i & 64) != 0 ? null : executor, authPromptCallback);
    }

    public static /* synthetic */ Object authenticateWithClass3Biometrics$default(Fragment fragment, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, C13635d dVar, int i, Object obj) {
        return authenticateWithClass3Biometrics(fragment, cryptoObject, charSequence, charSequence2, (i & 8) != 0 ? null : charSequence3, (i & 16) != 0 ? null : charSequence4, (i & 32) != 0 ? true : z, (C13635d<? super BiometricPrompt.AuthenticationResult>) dVar);
    }

    public static final AuthPrompt authenticateWithClass3Biometrics(Fragment fragment, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, Executor executor, AuthPromptCallback authPromptCallback) {
        Fragment fragment2 = fragment;
        C13706o.m87929f(fragment, "<this>");
        C13706o.m87929f(charSequence, "title");
        C13706o.m87929f(charSequence2, "negativeButtonText");
        AuthPromptCallback authPromptCallback2 = authPromptCallback;
        C13706o.m87929f(authPromptCallback2, "callback");
        return startClass3BiometricAuthenticationInternal(new AuthPromptHost(fragment), cryptoObject, charSequence, charSequence2, charSequence3, charSequence4, z, executor, authPromptCallback2);
    }

    public static final Object authenticateWithClass3Biometrics(Fragment fragment, BiometricPrompt.CryptoObject cryptoObject, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, C13635d<? super BiometricPrompt.AuthenticationResult> dVar) {
        return authenticate(buildClass3BiometricAuthPrompt(charSequence, charSequence2, charSequence3, charSequence4, z), new AuthPromptHost(fragment), cryptoObject, dVar);
    }
}

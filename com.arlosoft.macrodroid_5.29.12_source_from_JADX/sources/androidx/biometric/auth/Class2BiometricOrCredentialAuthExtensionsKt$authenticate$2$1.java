package androidx.biometric.auth;

import kotlin.Metadata;
import kotlin.jvm.internal.C13708q;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, mo71668d2 = {"", "it", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: Class2BiometricOrCredentialAuthExtensions.kt */
final class Class2BiometricOrCredentialAuthExtensionsKt$authenticate$2$1 extends C13708q implements C16265l<Throwable, C13339u> {
    final /* synthetic */ AuthPrompt $authPrompt;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Class2BiometricOrCredentialAuthExtensionsKt$authenticate$2$1(AuthPrompt authPrompt) {
        super(1);
        this.$authPrompt = authPrompt;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C13339u.f61331a;
    }

    public final void invoke(Throwable th) {
        this.$authPrompt.cancelAuthentication();
    }
}

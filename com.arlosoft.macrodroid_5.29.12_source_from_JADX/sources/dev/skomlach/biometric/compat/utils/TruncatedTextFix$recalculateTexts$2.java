package dev.skomlach.biometric.compat.utils;

import dev.skomlach.biometric.compat.BiometricPromptCompat;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.C13708q;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "str", "Lja/u;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
/* compiled from: TruncatedTextFix.kt */
final class TruncatedTextFix$recalculateTexts$2 extends C13708q implements C16265l<String, C13339u> {
    final /* synthetic */ C16254a<C13339u> $action;
    final /* synthetic */ BiometricPromptCompat.Builder $builder;
    final /* synthetic */ AtomicInteger $counter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TruncatedTextFix$recalculateTexts$2(BiometricPromptCompat.Builder builder, AtomicInteger atomicInteger, C16254a<C13339u> aVar) {
        super(1);
        this.$builder = builder;
        this.$counter = atomicInteger;
        this.$action = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C13339u.f61331a;
    }

    public final void invoke(String str) {
        this.$builder.setSubtitle((CharSequence) str);
        if (this.$counter.decrementAndGet() == 0) {
            this.$action.invoke();
        }
    }
}

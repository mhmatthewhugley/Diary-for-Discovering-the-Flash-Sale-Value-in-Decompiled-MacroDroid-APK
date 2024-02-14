package androidx.window.embedding;

import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "values", "Lja/u;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
/* compiled from: EmbeddingCompat.kt */
final class EmbeddingCompat$setEmbeddingCallback$1 extends C13708q implements C16265l<List<?>, C13339u> {
    final /* synthetic */ EmbeddingInterfaceCompat.EmbeddingCallbackInterface $embeddingCallback;
    final /* synthetic */ EmbeddingCompat this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EmbeddingCompat$setEmbeddingCallback$1(EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface, EmbeddingCompat embeddingCompat) {
        super(1);
        this.$embeddingCallback = embeddingCallbackInterface;
        this.this$0 = embeddingCompat;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<?>) (List) obj);
        return C13339u.f61331a;
    }

    public final void invoke(List<?> list) {
        C13706o.m87929f(list, "values");
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (next instanceof SplitInfo) {
                arrayList.add(next);
            }
        }
        this.$embeddingCallback.onSplitInfoChanged(this.this$0.adapter.translate((List<? extends SplitInfo>) arrayList));
    }
}

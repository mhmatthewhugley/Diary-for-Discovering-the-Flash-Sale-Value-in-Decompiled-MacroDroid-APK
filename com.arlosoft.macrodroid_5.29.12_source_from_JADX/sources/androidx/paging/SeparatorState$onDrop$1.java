package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16265l;
import p424wa.C16788e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n"}, mo71668d2 = {"", "R", "T", "Landroidx/paging/TransformablePage;", "stash", "", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: Separators.kt */
final class SeparatorState$onDrop$1 extends C13708q implements C16265l<TransformablePage<T>, Boolean> {
    final /* synthetic */ C16788e $pageOffsetsToDrop;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SeparatorState$onDrop$1(C16788e eVar) {
        super(1);
        this.$pageOffsetsToDrop = eVar;
    }

    public final Boolean invoke(TransformablePage<T> transformablePage) {
        C13706o.m87929f(transformablePage, "stash");
        int[] originalPageOffsets = transformablePage.getOriginalPageOffsets();
        C16788e eVar = this.$pageOffsetsToDrop;
        int length = originalPageOffsets.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (eVar.mo79775k(originalPageOffsets[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        return Boolean.valueOf(z);
    }
}

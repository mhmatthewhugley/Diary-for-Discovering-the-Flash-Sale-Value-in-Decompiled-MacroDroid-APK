package androidx.paging;

import androidx.paging.HintHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\n\u0010\u0002\u001a\u00060\u0000R\u00020\u00012\n\u0010\u0003\u001a\u00060\u0000R\u00020\u0001H\n"}, mo71668d2 = {"Landroidx/paging/HintHandler$HintFlow;", "Landroidx/paging/HintHandler;", "prependHint", "appendHint", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: HintHandler.kt */
final class HintHandler$forceSetHint$2 extends C13708q implements C16269p<HintHandler.HintFlow, HintHandler.HintFlow, C13339u> {
    final /* synthetic */ LoadType $loadType;
    final /* synthetic */ ViewportHint $viewportHint;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HintHandler$forceSetHint$2(LoadType loadType, ViewportHint viewportHint) {
        super(2);
        this.$loadType = loadType;
        this.$viewportHint = viewportHint;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((HintHandler.HintFlow) obj, (HintHandler.HintFlow) obj2);
        return C13339u.f61331a;
    }

    public final void invoke(HintHandler.HintFlow hintFlow, HintHandler.HintFlow hintFlow2) {
        C13706o.m87929f(hintFlow, "prependHint");
        C13706o.m87929f(hintFlow2, "appendHint");
        if (this.$loadType == LoadType.PREPEND) {
            hintFlow.setValue(this.$viewportHint);
        } else {
            hintFlow2.setValue(this.$viewportHint);
        }
    }
}

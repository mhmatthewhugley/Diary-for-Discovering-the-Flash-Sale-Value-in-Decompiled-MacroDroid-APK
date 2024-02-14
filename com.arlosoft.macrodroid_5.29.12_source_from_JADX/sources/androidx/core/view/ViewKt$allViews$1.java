package androidx.core.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13664k;
import kotlin.sequences.C15120j;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo71668d2 = {"Lkotlin/sequences/j;", "Landroid/view/View;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
@C13658f(mo71893c = "androidx.core.view.ViewKt$allViews$1", mo71894f = "View.kt", mo71895l = {414, 416}, mo71896m = "invokeSuspend")
/* compiled from: View.kt */
final class ViewKt$allViews$1 extends C13664k implements C16269p<C15120j<? super View>, C13635d<? super C13339u>, Object> {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ViewKt$allViews$1(View view, C13635d<? super ViewKt$allViews$1> dVar) {
        super(2, dVar);
        this.$this_allViews = view;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, dVar);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    public final Object invoke(C15120j<? super View> jVar, C13635d<? super C13339u> dVar) {
        return ((ViewKt$allViews$1) create(jVar, dVar)).invokeSuspend(C13339u.f61331a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlin.sequences.j} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            p297ja.C13332o.m85685b(r5)
            goto L_0x004f
        L_0x0012:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x001a:
            java.lang.Object r1 = r4.L$0
            kotlin.sequences.j r1 = (kotlin.sequences.C15120j) r1
            p297ja.C13332o.m85685b(r5)
            goto L_0x0037
        L_0x0022:
            p297ja.C13332o.m85685b(r5)
            java.lang.Object r5 = r4.L$0
            r1 = r5
            kotlin.sequences.j r1 = (kotlin.sequences.C15120j) r1
            android.view.View r5 = r4.$this_allViews
            r4.L$0 = r1
            r4.label = r3
            java.lang.Object r5 = r1.mo74423b(r5, r4)
            if (r5 != r0) goto L_0x0037
            return r0
        L_0x0037:
            android.view.View r5 = r4.$this_allViews
            boolean r3 = r5 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x004f
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            kotlin.sequences.h r5 = androidx.core.view.ViewGroupKt.getDescendants(r5)
            r3 = 0
            r4.L$0 = r3
            r4.label = r2
            java.lang.Object r5 = r1.mo74429e(r5, r4)
            if (r5 != r0) goto L_0x004f
            return r0
        L_0x004f:
            ja.u r5 = p297ja.C13339u.f61331a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewKt$allViews$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.k */
/* compiled from: predefinedEnhancementInfo.kt */
public final class C14383k {

    /* renamed from: a */
    private final C14396q f63146a;

    /* renamed from: b */
    private final List<C14396q> f63147b;

    public C14383k() {
        this((C14396q) null, (List) null, 3, (C13695i) null);
    }

    public C14383k(C14396q qVar, List<C14396q> list) {
        C13706o.m87929f(list, "parametersInfo");
        this.f63146a = qVar;
        this.f63147b = list;
    }

    /* renamed from: a */
    public final List<C14396q> mo73063a() {
        return this.f63147b;
    }

    /* renamed from: b */
    public final C14396q mo73064b() {
        return this.f63146a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14383k(C14396q qVar, List list, int i, C13695i iVar) {
        this((i & 1) != 0 ? null : qVar, (i & 2) != 0 ? C13614t.m87748j() : list);
    }
}

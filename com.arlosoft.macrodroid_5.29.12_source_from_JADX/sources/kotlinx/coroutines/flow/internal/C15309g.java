package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.C13646h;
import kotlin.jvm.internal.C13695i;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, mo71668d2 = {"Lkotlinx/coroutines/flow/internal/g;", "T", "Lkotlinx/coroutines/flow/internal/f;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/e;", "onBufferOverflow", "Lkotlinx/coroutines/flow/internal/d;", "h", "Lkotlinx/coroutines/flow/f;", "i", "Lkotlinx/coroutines/flow/g;", "collector", "Lja/u;", "p", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "flow", "<init>", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/e;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.internal.g */
/* compiled from: ChannelFlow.kt */
public final class C15309g<T> extends C15307f<T, T> {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15309g(C15285f fVar, C13640g gVar, int i, C15220e eVar, int i2, C13695i iVar) {
        this(fVar, (i2 & 2) != 0 ? C13646h.f61899a : gVar, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? C15220e.SUSPEND : eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C15303d<T> mo74657h(C13640g gVar, int i, C15220e eVar) {
        return new C15309g(this.f64536f, gVar, i, eVar);
    }

    /* renamed from: i */
    public C15285f<T> mo74659i() {
        return this.f64536f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public Object mo74685p(C15288g<? super T> gVar, C13635d<? super C13339u> dVar) {
        Object collect = this.f64536f.collect(gVar, dVar);
        return collect == C13652d.m87832c() ? collect : C13339u.f61331a;
    }

    public C15309g(C15285f<? extends T> fVar, C13640g gVar, int i, C15220e eVar) {
        super(fVar, gVar, i, eVar);
    }
}

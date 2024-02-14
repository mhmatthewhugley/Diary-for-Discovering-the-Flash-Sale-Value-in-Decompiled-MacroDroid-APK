package p477uf;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.channels.C15245x;
import p297ja.C13329n;
import p297ja.C13332o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo71668d2 = {"E", "Lkotlinx/coroutines/channels/x;", "element", "", "a", "(Lkotlinx/coroutines/channels/x;Ljava/lang/Object;)Z", "coroutines"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* renamed from: uf.a */
/* compiled from: SendChannel.kt */
public final class C17481a {
    /* renamed from: a */
    public static final <E> boolean m101260a(C15245x<? super E> xVar, E e) {
        Boolean bool;
        C13706o.m87929f(xVar, "$this$offerCatching");
        try {
            C13329n.C13330a aVar = C13329n.f61327a;
            bool = C13329n.m85676a(Boolean.valueOf(xVar.offer(e)));
        } catch (Throwable th) {
            C13329n.C13330a aVar2 = C13329n.f61327a;
            bool = C13329n.m85676a(C13332o.m85684a(th));
        }
        Boolean bool2 = Boolean.FALSE;
        if (C13329n.m85680e(bool)) {
            bool = bool2;
        }
        return ((Boolean) bool).booleanValue();
    }
}

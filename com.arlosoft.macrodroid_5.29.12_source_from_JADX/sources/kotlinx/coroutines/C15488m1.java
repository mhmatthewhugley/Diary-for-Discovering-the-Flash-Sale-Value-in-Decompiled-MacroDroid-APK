package kotlinx.coroutines;

import java.io.Closeable;
import kotlin.Metadata;
import kotlin.coroutines.C13629b;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13708q;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo71668d2 = {"Lkotlinx/coroutines/m1;", "Lkotlinx/coroutines/h0;", "Ljava/io/Closeable;", "<init>", "()V", "a", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.m1 */
/* compiled from: Executors.kt */
public abstract class C15488m1 extends C15415h0 implements Closeable {

    /* renamed from: a */
    public static final C15489a f64709a = new C15489a((C13695i) null);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo71668d2 = {"Lkotlinx/coroutines/m1$a;", "Lkotlin/coroutines/b;", "Lkotlinx/coroutines/h0;", "Lkotlinx/coroutines/m1;", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.m1$a */
    /* compiled from: Executors.kt */
    public static final class C15489a extends C13629b<C15415h0, C15488m1> {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"Lkotlin/coroutines/g$b;", "it", "Lkotlinx/coroutines/m1;", "a", "(Lkotlin/coroutines/g$b;)Lkotlinx/coroutines/m1;"}, mo71669k = 3, mo71670mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.m1$a$a */
        /* compiled from: Executors.kt */
        static final class C15490a extends C13708q implements C16265l<C13640g.C13643b, C15488m1> {

            /* renamed from: a */
            public static final C15490a f64710a = new C15490a();

            C15490a() {
                super(1);
            }

            /* renamed from: a */
            public final C15488m1 invoke(C13640g.C13643b bVar) {
                if (bVar instanceof C15488m1) {
                    return (C15488m1) bVar;
                }
                return null;
            }
        }

        private C15489a() {
            super(C15415h0.Key, C15490a.f64710a);
        }

        public /* synthetic */ C15489a(C13695i iVar) {
            this();
        }
    }
}

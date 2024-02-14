package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.C13646h;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.jvm.internal.C13695i;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.channels.C15239r;
import kotlinx.coroutines.flow.internal.C15303d;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BR\u0012(\u0010\u0013\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, mo71668d2 = {"Lkotlinx/coroutines/flow/b;", "T", "Lkotlinx/coroutines/flow/d;", "Lkotlinx/coroutines/channels/r;", "scope", "Lja/u;", "f", "(Lkotlinx/coroutines/channels/r;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/e;", "onBufferOverflow", "Lkotlinx/coroutines/flow/internal/d;", "h", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "block", "<init>", "(Lqa/p;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/e;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.b */
/* compiled from: Builders.kt */
final class C15274b<T> extends C15279d<T> {

    /* renamed from: g */
    private final C16269p<C15239r<? super T>, C13635d<? super C13339u>, Object> f64498g;

    @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    @C13658f(mo71893c = "kotlinx.coroutines.flow.CallbackFlowBuilder", mo71894f = "Builders.kt", mo71895l = {336}, mo71896m = "collectTo")
    /* renamed from: kotlinx.coroutines.flow.b$a */
    /* compiled from: Builders.kt */
    static final class C15275a extends C13656d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C15274b<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15275a(C15274b<T> bVar, C13635d<? super C15275a> dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo74656f((C15239r) null, this);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15274b(C16269p pVar, C13640g gVar, int i, C15220e eVar, int i2, C13695i iVar) {
        this(pVar, (i2 & 2) != 0 ? C13646h.f61899a : gVar, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? C15220e.SUSPEND : eVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo74656f(kotlinx.coroutines.channels.C15239r<? super T> r5, kotlin.coroutines.C13635d<? super p297ja.C13339u> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.C15274b.C15275a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.b$a r0 = (kotlinx.coroutines.flow.C15274b.C15275a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.b$a r0 = new kotlinx.coroutines.flow.b$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.r r5 = (kotlinx.coroutines.channels.C15239r) r5
            p297ja.C13332o.m85685b(r6)
            goto L_0x0043
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            p297ja.C13332o.m85685b(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = super.mo74656f(r5, r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            boolean r5 = r5.isClosedForSend()
            if (r5 == 0) goto L_0x004c
            ja.u r5 = p297ja.C13339u.f61331a
            return r5
        L_0x004c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15274b.mo74656f(kotlinx.coroutines.channels.r, kotlin.coroutines.d):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C15303d<T> mo74657h(C13640g gVar, int i, C15220e eVar) {
        return new C15274b(this.f64498g, gVar, i, eVar);
    }

    public C15274b(C16269p<? super C15239r<? super T>, ? super C13635d<? super C13339u>, ? extends Object> pVar, C13640g gVar, int i, C15220e eVar) {
        super(pVar, gVar, i, eVar);
        this.f64498g = pVar;
    }
}

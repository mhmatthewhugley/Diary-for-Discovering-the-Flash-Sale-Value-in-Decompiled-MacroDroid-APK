package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.jvm.internal.C13695i;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.channels.C15241t;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, mo71668d2 = {"T", "Lkotlinx/coroutines/flow/g;", "Lkotlinx/coroutines/channels/t;", "channel", "Lja/u;", "c", "(Lkotlinx/coroutines/flow/g;Lkotlinx/coroutines/channels/t;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "consume", "d", "(Lkotlinx/coroutines/flow/g;Lkotlinx/coroutines/channels/t;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/f;", "b", "kotlinx-coroutines-core"}, mo71669k = 5, mo71670mv = {1, 6, 0}, mo71673xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.j */
/* compiled from: Channels.kt */
final /* synthetic */ class C15340j {

    @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    @C13658f(mo71893c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", mo71894f = "Channels.kt", mo71895l = {51, 62}, mo71896m = "emitAllImpl$FlowKt__ChannelsKt")
    /* renamed from: kotlinx.coroutines.flow.j$a */
    /* compiled from: Channels.kt */
    static final class C15341a<T> extends C13656d {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C15341a(C13635d<? super C15341a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C15340j.m94202d((C15288g) null, (C15241t) null, false, this);
        }
    }

    /* renamed from: b */
    public static final <T> C15285f<T> m94200b(C15241t<? extends T> tVar) {
        return new C15277c(tVar, true, (C13640g) null, 0, (C15220e) null, 28, (C13695i) null);
    }

    /* renamed from: c */
    public static final <T> Object m94201c(C15288g<? super T> gVar, C15241t<? extends T> tVar, C13635d<? super C13339u> dVar) {
        Object d = m94202d(gVar, tVar, true, dVar);
        return d == C13652d.m87832c() ? d : C13339u.f61331a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0084 A[SYNTHETIC, Splitter:B:36:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0085 A[Catch:{ all -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m94202d(kotlinx.coroutines.flow.C15288g<? super T> r7, kotlinx.coroutines.channels.C15241t<? extends T> r8, boolean r9, kotlin.coroutines.C13635d<? super p297ja.C13339u> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.C15340j.C15341a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.flow.j$a r0 = (kotlinx.coroutines.flow.C15340j.C15341a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.j$a r0 = new kotlinx.coroutines.flow.j$a
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0057
            if (r2 == r4) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.t r8 = (kotlinx.coroutines.channels.C15241t) r8
            java.lang.Object r9 = r0.L$0
            kotlinx.coroutines.flow.g r9 = (kotlinx.coroutines.flow.C15288g) r9
            p297ja.C13332o.m85685b(r10)     // Catch:{ all -> 0x0055 }
        L_0x0035:
            r6 = r9
            r9 = r7
            r7 = r6
            goto L_0x005d
        L_0x0039:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0041:
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.t r8 = (kotlinx.coroutines.channels.C15241t) r8
            java.lang.Object r9 = r0.L$0
            kotlinx.coroutines.flow.g r9 = (kotlinx.coroutines.flow.C15288g) r9
            p297ja.C13332o.m85685b(r10)     // Catch:{ all -> 0x0055 }
            kotlinx.coroutines.channels.j r10 = (kotlinx.coroutines.channels.C15226j) r10     // Catch:{ all -> 0x0055 }
            java.lang.Object r10 = r10.mo74576l()     // Catch:{ all -> 0x0055 }
            goto L_0x006f
        L_0x0055:
            r9 = move-exception
            goto L_0x009c
        L_0x0057:
            p297ja.C13332o.m85685b(r10)
            kotlinx.coroutines.flow.C15290h.m94129o(r7)
        L_0x005d:
            r0.L$0 = r7     // Catch:{ all -> 0x0098 }
            r0.L$1 = r8     // Catch:{ all -> 0x0098 }
            r0.Z$0 = r9     // Catch:{ all -> 0x0098 }
            r0.label = r4     // Catch:{ all -> 0x0098 }
            java.lang.Object r10 = r8.mo74537n(r0)     // Catch:{ all -> 0x0098 }
            if (r10 != r1) goto L_0x006c
            return r1
        L_0x006c:
            r6 = r9
            r9 = r7
            r7 = r6
        L_0x006f:
            r2 = 0
            boolean r5 = kotlinx.coroutines.channels.C15226j.m93861i(r10)     // Catch:{ all -> 0x0055 }
            if (r5 == 0) goto L_0x0085
            java.lang.Throwable r9 = kotlinx.coroutines.channels.C15226j.m93857e(r10)     // Catch:{ all -> 0x0055 }
            if (r9 != 0) goto L_0x0084
            if (r7 == 0) goto L_0x0081
            kotlinx.coroutines.channels.C15230k.m93868a(r8, r2)
        L_0x0081:
            ja.u r7 = p297ja.C13339u.f61331a
            return r7
        L_0x0084:
            throw r9     // Catch:{ all -> 0x0055 }
        L_0x0085:
            java.lang.Object r10 = kotlinx.coroutines.channels.C15226j.m93859g(r10)     // Catch:{ all -> 0x0055 }
            r0.L$0 = r9     // Catch:{ all -> 0x0055 }
            r0.L$1 = r8     // Catch:{ all -> 0x0055 }
            r0.Z$0 = r7     // Catch:{ all -> 0x0055 }
            r0.label = r3     // Catch:{ all -> 0x0055 }
            java.lang.Object r10 = r9.emit(r10, r0)     // Catch:{ all -> 0x0055 }
            if (r10 != r1) goto L_0x0035
            return r1
        L_0x0098:
            r7 = move-exception
            r6 = r9
            r9 = r7
            r7 = r6
        L_0x009c:
            throw r9     // Catch:{ all -> 0x009d }
        L_0x009d:
            r10 = move-exception
            if (r7 == 0) goto L_0x00a3
            kotlinx.coroutines.channels.C15230k.m93868a(r8, r9)
        L_0x00a3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15340j.m94202d(kotlinx.coroutines.flow.g, kotlinx.coroutines.channels.t, boolean, kotlin.coroutines.d):java.lang.Object");
    }
}

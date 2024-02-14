package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15423h2;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", mo71894f = "RepeatOnLifecycle.kt", mo71895l = {84}, mo71896m = "invokeSuspend")
/* compiled from: RepeatOnLifecycle.kt */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
    final /* synthetic */ C16269p<C15478k0, C13635d<? super C13339u>, Object> $block;
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
    @C13658f(mo71893c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", mo71894f = "RepeatOnLifecycle.kt", mo71895l = {166}, mo71896m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1 */
    /* compiled from: RepeatOnLifecycle.kt */
    static final class C07271 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C07271(lifecycle, state, k0Var, pVar, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C07271) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: kotlin.jvm.internal.d0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: kotlin.jvm.internal.d0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r1 = r16
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r2 = r1.label
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0038
                if (r2 != r4) goto L_0x0030
                java.lang.Object r0 = r1.L$5
                qa.p r0 = (p370qa.C16269p) r0
                java.lang.Object r0 = r1.L$4
                kotlinx.coroutines.k0 r0 = (kotlinx.coroutines.C15478k0) r0
                java.lang.Object r0 = r1.L$3
                androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
                java.lang.Object r0 = r1.L$2
                androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle.State) r0
                java.lang.Object r0 = r1.L$1
                r2 = r0
                kotlin.jvm.internal.d0 r2 = (kotlin.jvm.internal.C13684d0) r2
                java.lang.Object r0 = r1.L$0
                r5 = r0
                kotlin.jvm.internal.d0 r5 = (kotlin.jvm.internal.C13684d0) r5
                p297ja.C13332o.m85685b(r17)     // Catch:{ all -> 0x002d }
                goto L_0x00a4
            L_0x002d:
                r0 = move-exception
                goto L_0x00c1
            L_0x0030:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0038:
                p297ja.C13332o.m85685b(r17)
                androidx.lifecycle.Lifecycle r2 = r4
                androidx.lifecycle.Lifecycle$State r2 = r2.getCurrentState()
                androidx.lifecycle.Lifecycle$State r5 = androidx.lifecycle.Lifecycle.State.DESTROYED
                if (r2 != r5) goto L_0x0048
                ja.u r0 = p297ja.C13339u.f61331a
                return r0
            L_0x0048:
                kotlin.jvm.internal.d0 r2 = new kotlin.jvm.internal.d0
                r2.<init>()
                kotlin.jvm.internal.d0 r13 = new kotlin.jvm.internal.d0
                r13.<init>()
                androidx.lifecycle.Lifecycle$State r5 = r5     // Catch:{ all -> 0x00be }
                androidx.lifecycle.Lifecycle r14 = r4     // Catch:{ all -> 0x00be }
                kotlinx.coroutines.k0 r8 = r6     // Catch:{ all -> 0x00be }
                qa.p<kotlinx.coroutines.k0, kotlin.coroutines.d<? super ja.u>, java.lang.Object> r12 = r7     // Catch:{ all -> 0x00be }
                r1.L$0 = r2     // Catch:{ all -> 0x00be }
                r1.L$1 = r13     // Catch:{ all -> 0x00be }
                r1.L$2 = r5     // Catch:{ all -> 0x00be }
                r1.L$3 = r14     // Catch:{ all -> 0x00be }
                r1.L$4 = r8     // Catch:{ all -> 0x00be }
                r1.L$5 = r12     // Catch:{ all -> 0x00be }
                r1.label = r4     // Catch:{ all -> 0x00be }
                kotlinx.coroutines.o r15 = new kotlinx.coroutines.o     // Catch:{ all -> 0x00be }
                kotlin.coroutines.d r6 = kotlin.coroutines.intrinsics.C13649c.m87831b(r16)     // Catch:{ all -> 0x00be }
                r15.<init>(r6, r4)     // Catch:{ all -> 0x00be }
                r15.mo74864z()     // Catch:{ all -> 0x00be }
                androidx.lifecycle.Lifecycle$Event r6 = androidx.lifecycle.Lifecycle.Event.upTo(r5)     // Catch:{ all -> 0x00be }
                androidx.lifecycle.Lifecycle$Event r9 = androidx.lifecycle.Lifecycle.Event.downFrom(r5)     // Catch:{ all -> 0x00be }
                r5 = 0
                kotlinx.coroutines.sync.b r11 = kotlinx.coroutines.sync.C15544d.m94682b(r5, r4, r3)     // Catch:{ all -> 0x00be }
                androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r10 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch:{ all -> 0x00be }
                r5 = r10
                r7 = r2
                r3 = r10
                r10 = r15
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00be }
                r13.element = r3     // Catch:{ all -> 0x00be }
                r10 = r3
                androidx.lifecycle.LifecycleEventObserver r10 = (androidx.lifecycle.LifecycleEventObserver) r10     // Catch:{ all -> 0x00be }
                r14.addObserver(r10)     // Catch:{ all -> 0x00be }
                java.lang.Object r3 = r15.mo74862w()     // Catch:{ all -> 0x00be }
                java.lang.Object r5 = kotlin.coroutines.intrinsics.C13652d.m87832c()     // Catch:{ all -> 0x00be }
                if (r3 != r5) goto L_0x009f
                kotlin.coroutines.jvm.internal.C13660h.m87847c(r16)     // Catch:{ all -> 0x00be }
            L_0x009f:
                if (r3 != r0) goto L_0x00a2
                return r0
            L_0x00a2:
                r5 = r2
                r2 = r13
            L_0x00a4:
                T r0 = r5.element
                kotlinx.coroutines.w1 r0 = (kotlinx.coroutines.C15561w1) r0
                if (r0 != 0) goto L_0x00ab
                goto L_0x00af
            L_0x00ab:
                r3 = 0
                kotlinx.coroutines.C15561w1.C15562a.m94723a(r0, r3, r4, r3)
            L_0x00af:
                T r0 = r2.element
                androidx.lifecycle.LifecycleEventObserver r0 = (androidx.lifecycle.LifecycleEventObserver) r0
                if (r0 != 0) goto L_0x00b6
                goto L_0x00bb
            L_0x00b6:
                androidx.lifecycle.Lifecycle r2 = r4
                r2.removeObserver(r0)
            L_0x00bb:
                ja.u r0 = p297ja.C13339u.f61331a
                return r0
            L_0x00be:
                r0 = move-exception
                r5 = r2
                r2 = r13
            L_0x00c1:
                T r3 = r5.element
                kotlinx.coroutines.w1 r3 = (kotlinx.coroutines.C15561w1) r3
                if (r3 != 0) goto L_0x00c8
                goto L_0x00cc
            L_0x00c8:
                r5 = 0
                kotlinx.coroutines.C15561w1.C15562a.m94723a(r3, r5, r4, r5)
            L_0x00cc:
                T r2 = r2.element
                androidx.lifecycle.LifecycleEventObserver r2 = (androidx.lifecycle.LifecycleEventObserver) r2
                if (r2 != 0) goto L_0x00d3
                goto L_0x00d8
            L_0x00d3:
                androidx.lifecycle.Lifecycle r3 = r4
                r3.removeObserver(r2)
            L_0x00d8:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.C07271.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, C16269p<? super C15478k0, ? super C13635d<? super C13339u>, ? extends Object> pVar, C13635d<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> dVar) {
        super(2, dVar);
        this.$this_repeatOnLifecycle = lifecycle;
        this.$state = state;
        this.$block = pVar;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$this_repeatOnLifecycle, this.$state, this.$block, dVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            final C15478k0 k0Var = (C15478k0) this.L$0;
            C15423h2 o = C15186a1.m93731c().mo74507o();
            final Lifecycle lifecycle = this.$this_repeatOnLifecycle;
            final Lifecycle.State state = this.$state;
            final C16269p<C15478k0, C13635d<? super C13339u>, Object> pVar = this.$block;
            C07271 r3 = new C07271((C13635d<? super C07271>) null);
            this.label = 1;
            if (C15414h.m94298g(o, r3, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13339u.f61331a;
    }
}

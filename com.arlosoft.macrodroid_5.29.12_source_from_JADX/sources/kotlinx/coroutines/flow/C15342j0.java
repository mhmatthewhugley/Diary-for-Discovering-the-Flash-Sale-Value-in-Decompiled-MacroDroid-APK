package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.flow.internal.C15300a;
import kotlinx.coroutines.flow.internal.C15324n;
import kotlinx.coroutines.flow.internal.C15328q;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u0010/\u001a\u00020\u0005¢\u0006\u0004\b0\u0010-J!\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010(R*\u0010\f\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00008V@VX\u000e¢\u0006\u0012\u0012\u0004\b.\u0010\u0013\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-\u0002\u0004\n\u0002\b\u0019¨\u00061"}, mo71668d2 = {"Lkotlinx/coroutines/flow/j0;", "T", "Lkotlinx/coroutines/flow/internal/a;", "Lkotlinx/coroutines/flow/l0;", "Lkotlinx/coroutines/flow/v;", "", "Lkotlinx/coroutines/flow/internal/n;", "expectedState", "newState", "", "o", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "value", "b", "(Ljava/lang/Object;)Z", "Lja/u;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "g", "()V", "Lkotlinx/coroutines/flow/g;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "m", "()Lkotlinx/coroutines/flow/l0;", "", "size", "", "n", "(I)[Lkotlinx/coroutines/flow/l0;", "Lkotlin/coroutines/g;", "context", "capacity", "Lkotlinx/coroutines/channels/e;", "onBufferOverflow", "Lkotlinx/coroutines/flow/f;", "a", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/e;)Lkotlinx/coroutines/flow/f;", "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "initialState", "<init>", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.j0 */
/* compiled from: StateFlow.kt */
final class C15342j0<T> extends C15300a<C15348l0> implements C15402v<T>, C15285f, C15324n<T> {
    private volatile /* synthetic */ Object _state;

    /* renamed from: g */
    private int f64562g;

    @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    @C13658f(mo71893c = "kotlinx.coroutines.flow.StateFlowImpl", mo71894f = "StateFlow.kt", mo71895l = {386, 398, 403}, mo71896m = "collect")
    /* renamed from: kotlinx.coroutines.flow.j0$a */
    /* compiled from: StateFlow.kt */
    static final class C15343a extends C13656d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C15342j0<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15343a(C15342j0<T> j0Var, C13635d<? super C15343a> dVar) {
            super(dVar);
            this.this$0 = j0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect((C15288g) null, this);
        }
    }

    public C15342j0(Object obj) {
        this._state = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        r8 = (kotlinx.coroutines.flow.C15348l0[]) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        if (r8 != null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0031, code lost:
        r2 = r8.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0033, code lost:
        if (r3 >= r2) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0035, code lost:
        r4 = r8[r3];
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0039, code lost:
        if (r4 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003c, code lost:
        r4.mo74704f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0040, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r8 = r6.f64562g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0043, code lost:
        if (r8 != r7) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
        r6.f64562g = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0049, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r7 = mo74680l();
        r2 = p297ja.C13339u.f61331a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0050, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0051, code lost:
        r5 = r8;
        r8 = r7;
        r7 = r5;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m94203o(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r6.mo74680l()
            monitor-enter(r6)
            java.lang.Object r0 = r6._state     // Catch:{ all -> 0x005e }
            r1 = 0
            if (r7 == 0) goto L_0x0011
            boolean r7 = kotlin.jvm.internal.C13706o.m87924a(r0, r7)     // Catch:{ all -> 0x005e }
            if (r7 != 0) goto L_0x0011
            monitor-exit(r6)
            return r1
        L_0x0011:
            boolean r7 = kotlin.jvm.internal.C13706o.m87924a(r0, r8)     // Catch:{ all -> 0x005e }
            r0 = 1
            if (r7 == 0) goto L_0x001a
            monitor-exit(r6)
            return r0
        L_0x001a:
            r6._state = r8     // Catch:{ all -> 0x005e }
            int r7 = r6.f64562g     // Catch:{ all -> 0x005e }
            r8 = r7 & 1
            if (r8 != 0) goto L_0x0058
            int r7 = r7 + r0
            r6.f64562g = r7     // Catch:{ all -> 0x005e }
            kotlinx.coroutines.flow.internal.c[] r8 = r6.mo74680l()     // Catch:{ all -> 0x005e }
            ja.u r2 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x005e }
            monitor-exit(r6)
        L_0x002c:
            kotlinx.coroutines.flow.l0[] r8 = (kotlinx.coroutines.flow.C15348l0[]) r8
            if (r8 != 0) goto L_0x0031
            goto L_0x0040
        L_0x0031:
            int r2 = r8.length
            r3 = 0
        L_0x0033:
            if (r3 >= r2) goto L_0x0040
            r4 = r8[r3]
            int r3 = r3 + 1
            if (r4 != 0) goto L_0x003c
            goto L_0x0033
        L_0x003c:
            r4.mo74704f()
            goto L_0x0033
        L_0x0040:
            monitor-enter(r6)
            int r8 = r6.f64562g     // Catch:{ all -> 0x0055 }
            if (r8 != r7) goto L_0x004a
            int r7 = r7 + r0
            r6.f64562g = r7     // Catch:{ all -> 0x0055 }
            monitor-exit(r6)
            return r0
        L_0x004a:
            kotlinx.coroutines.flow.internal.c[] r7 = r6.mo74680l()     // Catch:{ all -> 0x0055 }
            ja.u r2 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0055 }
            monitor-exit(r6)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x002c
        L_0x0055:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x0058:
            int r7 = r7 + 2
            r6.f64562g = r7     // Catch:{ all -> 0x005e }
            monitor-exit(r6)
            return r0
        L_0x005e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15342j0.m94203o(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: a */
    public C15285f<T> mo74651a(C13640g gVar, int i, C15220e eVar) {
        return C15346k0.m94218d(this, gVar, i, eVar);
    }

    /* renamed from: b */
    public boolean mo74652b(T t) {
        setValue(t);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: kotlinx.coroutines.flow.l0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: kotlinx.coroutines.flow.j0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00aa A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ab A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ba A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bc A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cf A[Catch:{ all -> 0x0073 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d0 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d7 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(kotlinx.coroutines.flow.C15288g<? super T> r11, kotlin.coroutines.C13635d<?> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof kotlinx.coroutines.flow.C15342j0.C15343a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            kotlinx.coroutines.flow.j0$a r0 = (kotlinx.coroutines.flow.C15342j0.C15343a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.j0$a r0 = new kotlinx.coroutines.flow.j0$a
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0076
            if (r2 == r6) goto L_0x0061
            if (r2 == r5) goto L_0x004a
            if (r2 != r4) goto L_0x0042
            java.lang.Object r11 = r0.L$4
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.w1 r2 = (kotlinx.coroutines.C15561w1) r2
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.flow.l0 r6 = (kotlinx.coroutines.flow.C15348l0) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.flow.g r7 = (kotlinx.coroutines.flow.C15288g) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.j0 r8 = (kotlinx.coroutines.flow.C15342j0) r8
            p297ja.C13332o.m85685b(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x00a6
        L_0x0042:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004a:
            java.lang.Object r11 = r0.L$4
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.w1 r2 = (kotlinx.coroutines.C15561w1) r2
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.flow.l0 r6 = (kotlinx.coroutines.flow.C15348l0) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.flow.g r7 = (kotlinx.coroutines.flow.C15288g) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.j0 r8 = (kotlinx.coroutines.flow.C15342j0) r8
            p297ja.C13332o.m85685b(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x00d1
        L_0x0061:
            java.lang.Object r11 = r0.L$2
            r6 = r11
            kotlinx.coroutines.flow.l0 r6 = (kotlinx.coroutines.flow.C15348l0) r6
            java.lang.Object r11 = r0.L$1
            kotlinx.coroutines.flow.g r11 = (kotlinx.coroutines.flow.C15288g) r11
            java.lang.Object r2 = r0.L$0
            r8 = r2
            kotlinx.coroutines.flow.j0 r8 = (kotlinx.coroutines.flow.C15342j0) r8
            p297ja.C13332o.m85685b(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x0097
        L_0x0073:
            r11 = move-exception
            goto L_0x00ed
        L_0x0076:
            p297ja.C13332o.m85685b(r12)
            kotlinx.coroutines.flow.internal.c r12 = r10.mo74677f()
            kotlinx.coroutines.flow.l0 r12 = (kotlinx.coroutines.flow.C15348l0) r12
            boolean r2 = r11 instanceof kotlinx.coroutines.flow.C15352m0     // Catch:{ all -> 0x00ea }
            if (r2 == 0) goto L_0x0095
            r2 = r11
            kotlinx.coroutines.flow.m0 r2 = (kotlinx.coroutines.flow.C15352m0) r2     // Catch:{ all -> 0x00ea }
            r0.L$0 = r10     // Catch:{ all -> 0x00ea }
            r0.L$1 = r11     // Catch:{ all -> 0x00ea }
            r0.L$2 = r12     // Catch:{ all -> 0x00ea }
            r0.label = r6     // Catch:{ all -> 0x00ea }
            java.lang.Object r2 = r2.mo74707a(r0)     // Catch:{ all -> 0x00ea }
            if (r2 != r1) goto L_0x0095
            return r1
        L_0x0095:
            r8 = r10
            r6 = r12
        L_0x0097:
            kotlin.coroutines.g r12 = r0.getContext()     // Catch:{ all -> 0x0073 }
            kotlinx.coroutines.w1$b r2 = kotlinx.coroutines.C15561w1.f64808x     // Catch:{ all -> 0x0073 }
            kotlin.coroutines.g$b r12 = r12.get(r2)     // Catch:{ all -> 0x0073 }
            kotlinx.coroutines.w1 r12 = (kotlinx.coroutines.C15561w1) r12     // Catch:{ all -> 0x0073 }
            r7 = r11
            r2 = r12
            r11 = r3
        L_0x00a6:
            java.lang.Object r12 = r8._state     // Catch:{ all -> 0x0073 }
            if (r2 != 0) goto L_0x00ab
            goto L_0x00ae
        L_0x00ab:
            kotlinx.coroutines.C15575z1.m94760h(r2)     // Catch:{ all -> 0x0073 }
        L_0x00ae:
            if (r11 == 0) goto L_0x00b6
            boolean r9 = kotlin.jvm.internal.C13706o.m87924a(r11, r12)     // Catch:{ all -> 0x0073 }
            if (r9 != 0) goto L_0x00d1
        L_0x00b6:
            kotlinx.coroutines.internal.a0 r11 = kotlinx.coroutines.flow.internal.C15328q.f64550a     // Catch:{ all -> 0x0073 }
            if (r12 != r11) goto L_0x00bc
            r11 = r3
            goto L_0x00bd
        L_0x00bc:
            r11 = r12
        L_0x00bd:
            r0.L$0 = r8     // Catch:{ all -> 0x0073 }
            r0.L$1 = r7     // Catch:{ all -> 0x0073 }
            r0.L$2 = r6     // Catch:{ all -> 0x0073 }
            r0.L$3 = r2     // Catch:{ all -> 0x0073 }
            r0.L$4 = r12     // Catch:{ all -> 0x0073 }
            r0.label = r5     // Catch:{ all -> 0x0073 }
            java.lang.Object r11 = r7.emit(r11, r0)     // Catch:{ all -> 0x0073 }
            if (r11 != r1) goto L_0x00d0
            return r1
        L_0x00d0:
            r11 = r12
        L_0x00d1:
            boolean r12 = r6.mo74705g()     // Catch:{ all -> 0x0073 }
            if (r12 != 0) goto L_0x00a6
            r0.L$0 = r8     // Catch:{ all -> 0x0073 }
            r0.L$1 = r7     // Catch:{ all -> 0x0073 }
            r0.L$2 = r6     // Catch:{ all -> 0x0073 }
            r0.L$3 = r2     // Catch:{ all -> 0x0073 }
            r0.L$4 = r11     // Catch:{ all -> 0x0073 }
            r0.label = r4     // Catch:{ all -> 0x0073 }
            java.lang.Object r12 = r6.mo74702d(r0)     // Catch:{ all -> 0x0073 }
            if (r12 != r1) goto L_0x00a6
            return r1
        L_0x00ea:
            r11 = move-exception
            r8 = r10
            r6 = r12
        L_0x00ed:
            r8.mo74678j(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15342j0.collect(kotlinx.coroutines.flow.g, kotlin.coroutines.d):java.lang.Object");
    }

    public Object emit(T t, C13635d<? super C13339u> dVar) {
        setValue(t);
        return C13339u.f61331a;
    }

    /* renamed from: g */
    public void mo74653g() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    public T getValue() {
        T t = C15328q.f64550a;
        T t2 = this._state;
        if (t2 == t) {
            return null;
        }
        return t2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C15348l0 mo74654h() {
        return new C15348l0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C15348l0[] mo74655i(int i) {
        return new C15348l0[i];
    }

    public void setValue(T t) {
        if (t == null) {
            t = C15328q.f64550a;
        }
        m94203o((Object) null, t);
    }
}

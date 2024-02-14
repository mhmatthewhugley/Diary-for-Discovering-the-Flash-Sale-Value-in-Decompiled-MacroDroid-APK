package kotlinx.coroutines.flow;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15202c1;
import kotlinx.coroutines.C15497o;
import kotlinx.coroutines.C15505q;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.flow.internal.C15300a;
import kotlinx.coroutines.flow.internal.C15301b;
import kotlinx.coroutines.flow.internal.C15302c;
import kotlinx.coroutines.flow.internal.C15324n;
import kotlinx.coroutines.internal.C15429a0;
import p297ja.C13329n;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001FB\u001f\u0012\u0006\u0010H\u001a\u00020\u0015\u0012\u0006\u0010J\u001a\u00020\u0015\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bd\u0010eJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002J9\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00132\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J(\u0010#\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0002J\b\u0010$\u001a\u00020\fH\u0002J\u0012\u0010\u0001\u001a\u0004\u0018\u00010\u00052\u0006\u0010%\u001a\u00020\u0003H\u0002J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0003H\u0002J\u0012\u0010(\u001a\u0004\u0018\u00010\u00052\u0006\u0010'\u001a\u00020\u000eH\u0002J\u001b\u0010)\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J3\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010+0\u00132\u0014\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010+0\u0013H\u0002¢\u0006\u0004\b-\u0010.J!\u00102\u001a\u0002012\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/H@ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b4\u0010\nJ\u001b\u00105\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b5\u0010\u001bJ\u000f\u00106\u001a\u00020\u000eH\u0000¢\u0006\u0004\b6\u00107J%\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010+0\u00132\u0006\u00108\u001a\u00020\u000eH\u0000¢\u0006\u0004\b9\u0010:J\b\u0010;\u001a\u00020\u0003H\u0014J\u001f\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00132\u0006\u0010<\u001a\u00020\u0015H\u0014¢\u0006\u0004\b=\u0010>J\b\u0010?\u001a\u00020\fH\u0016J&\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000E2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\u00152\u0006\u0010D\u001a\u00020CH\u0016R\u0014\u0010H\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010GR\u0014\u0010J\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010GR\u0014\u0010D\u001a\u00020C8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010LR \u0010O\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010R\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010S\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010QR\u0016\u0010T\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010GR\u0016\u0010U\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010GR\u0014\u0010V\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\bQ\u00107R\u0014\u0010Y\u001a\u00020\u00158BX\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020\u00158BX\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010XR\u0014\u0010\\\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\bG\u00107R\u0014\u0010^\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b]\u00107R\u001a\u0010c\u001a\u00028\u00008DX\u0004¢\u0006\f\u0012\u0004\ba\u0010b\u001a\u0004\b_\u0010`\u0002\u0004\n\u0002\b\u0019¨\u0006f"}, mo71668d2 = {"Lkotlinx/coroutines/flow/a0;", "T", "Lkotlinx/coroutines/flow/internal/a;", "Lkotlinx/coroutines/flow/c0;", "Lkotlinx/coroutines/flow/u;", "", "Lkotlinx/coroutines/flow/internal/n;", "value", "", "Q", "(Ljava/lang/Object;)Z", "R", "Lja/u;", "D", "", "newHead", "A", "item", "G", "", "curBuffer", "", "curSize", "newSize", "P", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "F", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/a0$a;", "emitter", "x", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "U", "y", "slot", "S", "index", "L", "w", "(Lkotlinx/coroutines/flow/c0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/d;", "resumesIn", "H", "([Lkotlin/coroutines/d;)[Lkotlin/coroutines/d;", "Lkotlinx/coroutines/flow/g;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "emit", "W", "()J", "oldIndex", "V", "(J)[Lkotlin/coroutines/d;", "B", "size", "C", "(I)[Lkotlinx/coroutines/flow/c0;", "g", "Lkotlin/coroutines/g;", "context", "capacity", "Lkotlinx/coroutines/channels/e;", "onBufferOverflow", "Lkotlinx/coroutines/flow/f;", "a", "I", "replay", "o", "bufferCapacity", "p", "Lkotlinx/coroutines/channels/e;", "s", "[Ljava/lang/Object;", "buffer", "z", "J", "replayIndex", "minCollectorIndex", "bufferSize", "queueSize", "head", "N", "()I", "replaySize", "O", "totalSize", "bufferEndIndex", "M", "queueEndIndex", "K", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "()V", "lastReplayedLocked", "<init>", "(IILkotlinx/coroutines/channels/e;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.a0 */
/* compiled from: SharedFlow.kt */
public class C15270a0<T> extends C15300a<C15278c0> implements C15401u<T>, C15285f, C15324n<T> {

    /* renamed from: A */
    private long f64485A;

    /* renamed from: B */
    private int f64486B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public int f64487C;

    /* renamed from: g */
    private final int f64488g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final int f64489o;

    /* renamed from: p */
    private final C15220e f64490p;

    /* renamed from: s */
    private Object[] f64491s;

    /* renamed from: z */
    private long f64492z;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo71668d2 = {"Lkotlinx/coroutines/flow/a0$a;", "Lkotlinx/coroutines/c1;", "Lja/u;", "dispose", "Lkotlinx/coroutines/flow/a0;", "a", "Lkotlinx/coroutines/flow/a0;", "flow", "", "c", "J", "index", "", "d", "Ljava/lang/Object;", "value", "Lkotlin/coroutines/d;", "f", "Lkotlin/coroutines/d;", "cont", "<init>", "(Lkotlinx/coroutines/flow/a0;JLjava/lang/Object;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.a0$a */
    /* compiled from: SharedFlow.kt */
    private static final class C15271a implements C15202c1 {

        /* renamed from: a */
        public final C15270a0<?> f64493a;

        /* renamed from: c */
        public long f64494c;

        /* renamed from: d */
        public final Object f64495d;

        /* renamed from: f */
        public final C13635d<C13339u> f64496f;

        public C15271a(C15270a0<?> a0Var, long j, Object obj, C13635d<? super C13339u> dVar) {
            this.f64493a = a0Var;
            this.f64494c = j;
            this.f64495d = obj;
            this.f64496f = dVar;
        }

        public void dispose() {
            this.f64493a.m94071x(this);
        }
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    /* renamed from: kotlinx.coroutines.flow.a0$b */
    /* compiled from: SharedFlow.kt */
    public /* synthetic */ class C15272b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f64497a;

        static {
            int[] iArr = new int[C15220e.values().length];
            iArr[C15220e.SUSPEND.ordinal()] = 1;
            iArr[C15220e.DROP_LATEST.ordinal()] = 2;
            iArr[C15220e.DROP_OLDEST.ordinal()] = 3;
            f64497a = iArr;
        }
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    @C13658f(mo71893c = "kotlinx.coroutines.flow.SharedFlowImpl", mo71894f = "SharedFlow.kt", mo71895l = {373, 380, 383}, mo71896m = "collect$suspendImpl")
    /* renamed from: kotlinx.coroutines.flow.a0$c */
    /* compiled from: SharedFlow.kt */
    static final class C15273c extends C13656d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C15270a0<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15273c(C15270a0<T> a0Var, C13635d<? super C15273c> dVar) {
            super(dVar);
            this.this$0 = a0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C15270a0.m94073z(this.this$0, (C15288g) null, this);
        }
    }

    public C15270a0(int i, int i2, C15220e eVar) {
        this.f64488g = i;
        this.f64489o = i2;
        this.f64490p = eVar;
    }

    /* renamed from: A */
    private final void m94042A(long j) {
        C15302c[] e;
        if (!(this.f64529c == 0 || (e = this.f64528a) == null)) {
            int i = 0;
            int length = e.length;
            while (i < length) {
                C15302c cVar = e[i];
                i++;
                if (cVar != null) {
                    C15278c0 c0Var = (C15278c0) cVar;
                    long j2 = c0Var.f64503a;
                    if (j2 >= 0 && j2 < j) {
                        c0Var.f64503a = j;
                    }
                }
            }
        }
        this.f64485A = j;
    }

    /* renamed from: D */
    private final void m94043D() {
        Object[] objArr = this.f64491s;
        C13706o.m87926c(objArr);
        C15276b0.m94092g(objArr, m94049J(), (Object) null);
        this.f64486B--;
        long J = m94049J() + 1;
        if (this.f64492z < J) {
            this.f64492z = J;
        }
        if (this.f64485A < J) {
            m94042A(J);
        }
    }

    /* renamed from: E */
    static /* synthetic */ Object m94044E(C15270a0 a0Var, Object obj, C13635d dVar) {
        if (a0Var.mo74652b(obj)) {
            return C13339u.f61331a;
        }
        Object F = a0Var.m94045F(obj, dVar);
        return F == C13652d.m87832c() ? F : C13339u.f61331a;
    }

    /* renamed from: F */
    private final Object m94045F(T t, C13635d<? super C13339u> dVar) {
        C13635d<C13339u>[] dVarArr;
        C15271a aVar;
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74864z();
        C13635d<C13339u>[] dVarArr2 = C15301b.f64532a;
        synchronized (this) {
            if (m94055Q(t)) {
                C13329n.C13330a aVar2 = C13329n.f61327a;
                oVar.resumeWith(C13329n.m85676a(C13339u.f61331a));
                dVarArr = m94047H(dVarArr2);
                aVar = null;
            } else {
                C15271a aVar3 = new C15271a(this, ((long) m94053O()) + m94049J(), t, oVar);
                m94046G(aVar3);
                this.f64487C = this.f64487C + 1;
                if (this.f64489o == 0) {
                    dVarArr2 = m94047H(dVarArr2);
                }
                dVarArr = dVarArr2;
                aVar = aVar3;
            }
        }
        if (aVar != null) {
            C15505q.m94587a(oVar, aVar);
        }
        int i = 0;
        int length = dVarArr.length;
        while (i < length) {
            C13635d<C13339u> dVar2 = dVarArr[i];
            i++;
            if (dVar2 != null) {
                C13329n.C13330a aVar4 = C13329n.f61327a;
                dVar2.resumeWith(C13329n.m85676a(C13339u.f61331a));
            }
        }
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w == C13652d.m87832c() ? w : C13339u.f61331a;
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public final void m94046G(Object obj) {
        int O = m94053O();
        Object[] objArr = this.f64491s;
        if (objArr == null) {
            objArr = m94054P((Object[]) null, 0, 2);
        } else if (O >= objArr.length) {
            objArr = m94054P(objArr, O, objArr.length * 2);
        }
        C15276b0.m94092g(objArr, m94049J() + ((long) O), obj);
    }

    /* JADX WARNING: type inference failed for: r12v6, types: [java.lang.Object[], java.lang.Object] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0011, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0011, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r4 = (kotlinx.coroutines.flow.C15278c0) r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.coroutines.C13635d<p297ja.C13339u>[] m94047H(kotlin.coroutines.C13635d<p297ja.C13339u>[] r12) {
        /*
            r11 = this;
            int r0 = r12.length
            int r1 = r11.f64529c
            if (r1 != 0) goto L_0x0008
            goto L_0x004b
        L_0x0008:
            kotlinx.coroutines.flow.internal.c[] r1 = r11.f64528a
            if (r1 != 0) goto L_0x000f
            goto L_0x004b
        L_0x000f:
            r2 = 0
            int r3 = r1.length
        L_0x0011:
            if (r2 >= r3) goto L_0x004b
            r4 = r1[r2]
            int r2 = r2 + 1
            if (r4 == 0) goto L_0x0011
            kotlinx.coroutines.flow.c0 r4 = (kotlinx.coroutines.flow.C15278c0) r4
            kotlin.coroutines.d<? super ja.u> r5 = r4.f64504b
            if (r5 != 0) goto L_0x0020
            goto L_0x0011
        L_0x0020:
            long r6 = r11.m94057S(r4)
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x002b
            goto L_0x0011
        L_0x002b:
            int r6 = r12.length
            if (r0 < r6) goto L_0x003f
            int r6 = r12.length
            r7 = 2
            int r6 = r6 * 2
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r6)
            java.lang.String r6 = "copyOf(this, newSize)"
            kotlin.jvm.internal.C13706o.m87928e(r12, r6)
        L_0x003f:
            r6 = r12
            kotlin.coroutines.d[] r6 = (kotlin.coroutines.C13635d[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f64504b = r0
            r0 = r7
            goto L_0x0011
        L_0x004b:
            kotlin.coroutines.d[] r12 = (kotlin.coroutines.C13635d[]) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15270a0.m94047H(kotlin.coroutines.d[]):kotlin.coroutines.d[]");
    }

    /* renamed from: I */
    private final long m94048I() {
        return m94049J() + ((long) this.f64486B);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public final long m94049J() {
        return Math.min(this.f64485A, this.f64492z);
    }

    /* renamed from: L */
    private final Object m94050L(long j) {
        Object[] objArr = this.f64491s;
        C13706o.m87926c(objArr);
        Object c = C15276b0.m94091f(objArr, j);
        return c instanceof C15271a ? ((C15271a) c).f64495d : c;
    }

    /* renamed from: M */
    private final long m94051M() {
        return m94049J() + ((long) this.f64486B) + ((long) this.f64487C);
    }

    /* renamed from: N */
    private final int m94052N() {
        return (int) ((m94049J() + ((long) this.f64486B)) - this.f64492z);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public final int m94053O() {
        return this.f64486B + this.f64487C;
    }

    /* renamed from: P */
    private final Object[] m94054P(Object[] objArr, int i, int i2) {
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.f64491s = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long J = m94049J();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + J;
                C15276b0.m94092g(objArr2, j, C15276b0.m94091f(objArr, j));
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public final boolean m94055Q(T t) {
        if (mo74679k() == 0) {
            return m94056R(t);
        }
        if (this.f64486B >= this.f64489o && this.f64485A <= this.f64492z) {
            int i = C15272b.f64497a[this.f64490p.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
        }
        m94046G(t);
        int i2 = this.f64486B + 1;
        this.f64486B = i2;
        if (i2 > this.f64489o) {
            m94043D();
        }
        if (m94052N() > this.f64488g) {
            m94059U(this.f64492z + 1, this.f64485A, m94048I(), m94051M());
        }
        return true;
    }

    /* renamed from: R */
    private final boolean m94056R(T t) {
        if (this.f64488g == 0) {
            return true;
        }
        m94046G(t);
        int i = this.f64486B + 1;
        this.f64486B = i;
        if (i > this.f64488g) {
            m94043D();
        }
        this.f64485A = m94049J() + ((long) this.f64486B);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public final long m94057S(C15278c0 c0Var) {
        long j = c0Var.f64503a;
        if (j < m94048I()) {
            return j;
        }
        if (this.f64489o <= 0 && j <= m94049J() && this.f64487C != 0) {
            return j;
        }
        return -1;
    }

    /* renamed from: T */
    private final Object m94058T(C15278c0 c0Var) {
        Object obj;
        C13635d<C13339u>[] dVarArr = C15301b.f64532a;
        synchronized (this) {
            long S = m94057S(c0Var);
            if (S < 0) {
                obj = C15276b0.f64499a;
            } else {
                long j = c0Var.f64503a;
                Object L = m94050L(S);
                c0Var.f64503a = S + 1;
                Object obj2 = L;
                dVarArr = mo74649V(j);
                obj = obj2;
            }
        }
        int i = 0;
        int length = dVarArr.length;
        while (i < length) {
            C13635d<C13339u> dVar = dVarArr[i];
            i++;
            if (dVar != null) {
                C13329n.C13330a aVar = C13329n.f61327a;
                dVar.resumeWith(C13329n.m85676a(C13339u.f61331a));
            }
        }
        return obj;
    }

    /* renamed from: U */
    private final void m94059U(long j, long j2, long j3, long j4) {
        long j5 = j;
        long j6 = j2;
        long min = Math.min(j6, j);
        for (long J = m94049J(); J < min; J = 1 + J) {
            Object[] objArr = this.f64491s;
            C13706o.m87926c(objArr);
            C15276b0.m94092g(objArr, J, (Object) null);
        }
        this.f64492z = j5;
        this.f64485A = j6;
        this.f64486B = (int) (j3 - min);
        this.f64487C = (int) (j4 - j3);
    }

    /* renamed from: w */
    private final Object m94070w(C15278c0 c0Var, C13635d<? super C13339u> dVar) {
        C13339u uVar;
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74864z();
        synchronized (this) {
            if (m94057S(c0Var) < 0) {
                c0Var.f64504b = oVar;
            } else {
                C13329n.C13330a aVar = C13329n.f61327a;
                oVar.resumeWith(C13329n.m85676a(C13339u.f61331a));
            }
            uVar = C13339u.f61331a;
        }
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w == C13652d.m87832c() ? w : uVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public final void m94071x(C15271a aVar) {
        synchronized (this) {
            if (aVar.f64494c >= m94049J()) {
                Object[] objArr = this.f64491s;
                C13706o.m87926c(objArr);
                if (C15276b0.m94091f(objArr, aVar.f64494c) == aVar) {
                    C15276b0.m94092g(objArr, aVar.f64494c, C15276b0.f64499a);
                    m94072y();
                    C13339u uVar = C13339u.f61331a;
                }
            }
        }
    }

    /* renamed from: y */
    private final void m94072y() {
        if (this.f64489o != 0 || this.f64487C > 1) {
            Object[] objArr = this.f64491s;
            C13706o.m87926c(objArr);
            while (this.f64487C > 0 && C15276b0.m94091f(objArr, (m94049J() + ((long) m94053O())) - 1) == C15276b0.f64499a) {
                this.f64487C--;
                C15276b0.m94092g(objArr, m94049J() + ((long) m94053O()), (Object) null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: kotlinx.coroutines.flow.c0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab A[Catch:{ all -> 0x00d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c2 A[Catch:{ all -> 0x00d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object m94073z(kotlinx.coroutines.flow.C15270a0 r8, kotlinx.coroutines.flow.C15288g r9, kotlin.coroutines.C13635d r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.C15270a0.C15273c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.flow.a0$c r0 = (kotlinx.coroutines.flow.C15270a0.C15273c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.a0$c r0 = new kotlinx.coroutines.flow.a0$c
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0075
            if (r2 == r5) goto L_0x005e
            if (r2 == r4) goto L_0x004a
            if (r2 != r3) goto L_0x0042
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.w1 r8 = (kotlinx.coroutines.C15561w1) r8
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.flow.c0 r9 = (kotlinx.coroutines.flow.C15278c0) r9
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.g r2 = (kotlinx.coroutines.flow.C15288g) r2
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.a0 r5 = (kotlinx.coroutines.flow.C15270a0) r5
        L_0x003b:
            p297ja.C13332o.m85685b(r10)     // Catch:{ all -> 0x005b }
            r10 = r2
            r2 = r8
            r8 = r5
            goto L_0x00a3
        L_0x0042:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x004a:
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.w1 r8 = (kotlinx.coroutines.C15561w1) r8
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.flow.c0 r9 = (kotlinx.coroutines.flow.C15278c0) r9
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.g r2 = (kotlinx.coroutines.flow.C15288g) r2
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.a0 r5 = (kotlinx.coroutines.flow.C15270a0) r5
            goto L_0x003b
        L_0x005b:
            r8 = move-exception
            goto L_0x00db
        L_0x005e:
            java.lang.Object r8 = r0.L$2
            r9 = r8
            kotlinx.coroutines.flow.c0 r9 = (kotlinx.coroutines.flow.C15278c0) r9
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.flow.g r8 = (kotlinx.coroutines.flow.C15288g) r8
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.a0 r2 = (kotlinx.coroutines.flow.C15270a0) r2
            p297ja.C13332o.m85685b(r10)     // Catch:{ all -> 0x0071 }
            r10 = r8
            r8 = r2
            goto L_0x0097
        L_0x0071:
            r8 = move-exception
            r5 = r2
            goto L_0x00db
        L_0x0075:
            p297ja.C13332o.m85685b(r10)
            kotlinx.coroutines.flow.internal.c r10 = r8.mo74677f()
            kotlinx.coroutines.flow.c0 r10 = (kotlinx.coroutines.flow.C15278c0) r10
            boolean r2 = r9 instanceof kotlinx.coroutines.flow.C15352m0     // Catch:{ all -> 0x00d7 }
            if (r2 == 0) goto L_0x0094
            r2 = r9
            kotlinx.coroutines.flow.m0 r2 = (kotlinx.coroutines.flow.C15352m0) r2     // Catch:{ all -> 0x00d7 }
            r0.L$0 = r8     // Catch:{ all -> 0x00d7 }
            r0.L$1 = r9     // Catch:{ all -> 0x00d7 }
            r0.L$2 = r10     // Catch:{ all -> 0x00d7 }
            r0.label = r5     // Catch:{ all -> 0x00d7 }
            java.lang.Object r2 = r2.mo74707a(r0)     // Catch:{ all -> 0x00d7 }
            if (r2 != r1) goto L_0x0094
            return r1
        L_0x0094:
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0097:
            kotlin.coroutines.g r2 = r0.getContext()     // Catch:{ all -> 0x00d3 }
            kotlinx.coroutines.w1$b r5 = kotlinx.coroutines.C15561w1.f64808x     // Catch:{ all -> 0x00d3 }
            kotlin.coroutines.g$b r2 = r2.get(r5)     // Catch:{ all -> 0x00d3 }
            kotlinx.coroutines.w1 r2 = (kotlinx.coroutines.C15561w1) r2     // Catch:{ all -> 0x00d3 }
        L_0x00a3:
            java.lang.Object r5 = r8.m94058T(r9)     // Catch:{ all -> 0x00d3 }
            kotlinx.coroutines.internal.a0 r6 = kotlinx.coroutines.flow.C15276b0.f64499a     // Catch:{ all -> 0x00d3 }
            if (r5 == r6) goto L_0x00c2
            if (r2 != 0) goto L_0x00ae
            goto L_0x00b1
        L_0x00ae:
            kotlinx.coroutines.C15575z1.m94760h(r2)     // Catch:{ all -> 0x00d3 }
        L_0x00b1:
            r0.L$0 = r8     // Catch:{ all -> 0x00d3 }
            r0.L$1 = r10     // Catch:{ all -> 0x00d3 }
            r0.L$2 = r9     // Catch:{ all -> 0x00d3 }
            r0.L$3 = r2     // Catch:{ all -> 0x00d3 }
            r0.label = r3     // Catch:{ all -> 0x00d3 }
            java.lang.Object r5 = r10.emit(r5, r0)     // Catch:{ all -> 0x00d3 }
            if (r5 != r1) goto L_0x00a3
            return r1
        L_0x00c2:
            r0.L$0 = r8     // Catch:{ all -> 0x00d3 }
            r0.L$1 = r10     // Catch:{ all -> 0x00d3 }
            r0.L$2 = r9     // Catch:{ all -> 0x00d3 }
            r0.L$3 = r2     // Catch:{ all -> 0x00d3 }
            r0.label = r4     // Catch:{ all -> 0x00d3 }
            java.lang.Object r5 = r8.m94070w(r9, r0)     // Catch:{ all -> 0x00d3 }
            if (r5 != r1) goto L_0x00a3
            return r1
        L_0x00d3:
            r10 = move-exception
            r5 = r8
            r8 = r10
            goto L_0x00db
        L_0x00d7:
            r9 = move-exception
            r5 = r8
            r8 = r9
            r9 = r10
        L_0x00db:
            r5.mo74678j(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15270a0.m94073z(kotlinx.coroutines.flow.a0, kotlinx.coroutines.flow.g, kotlin.coroutines.d):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public C15278c0 mo74654h() {
        return new C15278c0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C15278c0[] mo74655i(int i) {
        return new C15278c0[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final T mo74648K() {
        Object[] objArr = this.f64491s;
        C13706o.m87926c(objArr);
        return C15276b0.m94091f(objArr, (this.f64492z + ((long) m94052N())) - 1);
    }

    /* renamed from: V */
    public final C13635d<C13339u>[] mo74649V(long j) {
        int i;
        long j2;
        C15302c[] e;
        if (j > this.f64485A) {
            return C15301b.f64532a;
        }
        long J = m94049J();
        long j3 = ((long) this.f64486B) + J;
        long j4 = 1;
        if (this.f64489o == 0 && this.f64487C > 0) {
            j3++;
        }
        if (!(this.f64529c == 0 || (e = this.f64528a) == null)) {
            int length = e.length;
            int i2 = 0;
            while (i2 < length) {
                C15302c cVar = e[i2];
                i2++;
                if (cVar != null) {
                    long j5 = ((C15278c0) cVar).f64503a;
                    if (j5 >= 0 && j5 < j3) {
                        j3 = j5;
                    }
                }
            }
        }
        if (j3 <= this.f64485A) {
            return C15301b.f64532a;
        }
        long I = m94048I();
        if (mo74679k() > 0) {
            i = Math.min(this.f64487C, this.f64489o - ((int) (I - j3)));
        } else {
            i = this.f64487C;
        }
        C13635d<C13339u>[] dVarArr = C15301b.f64532a;
        long j6 = ((long) this.f64487C) + I;
        if (i > 0) {
            dVarArr = new C13635d[i];
            Object[] objArr = this.f64491s;
            C13706o.m87926c(objArr);
            long j7 = I;
            int i3 = 0;
            while (true) {
                if (I >= j6) {
                    j2 = j3;
                    break;
                }
                long j8 = I + j4;
                Object c = C15276b0.m94091f(objArr, I);
                C15429a0 a0Var = C15276b0.f64499a;
                if (c != a0Var) {
                    Objects.requireNonNull(c, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    C15271a aVar = (C15271a) c;
                    int i4 = i3 + 1;
                    j2 = j3;
                    dVarArr[i3] = aVar.f64496f;
                    C15276b0.m94092g(objArr, I, a0Var);
                    long j9 = j7;
                    C15276b0.m94092g(objArr, j9, aVar.f64495d);
                    j7 = j9 + 1;
                    if (i4 >= i) {
                        break;
                    }
                    i3 = i4;
                    I = j8;
                    j3 = j2;
                } else {
                    long j10 = j7;
                    I = j8;
                }
                j4 = 1;
            }
            I = j7;
        } else {
            j2 = j3;
        }
        int i5 = (int) (I - J);
        long j11 = mo74679k() == 0 ? I : j2;
        long max = Math.max(this.f64492z, I - ((long) Math.min(this.f64488g, i5)));
        if (this.f64489o == 0 && max < j6) {
            Object[] objArr2 = this.f64491s;
            C13706o.m87926c(objArr2);
            if (C13706o.m87924a(C15276b0.m94091f(objArr2, max), C15276b0.f64499a)) {
                I++;
                max++;
            }
        }
        m94059U(max, j11, I, j6);
        m94072y();
        return (dVarArr.length == 0) ^ true ? m94047H(dVarArr) : dVarArr;
    }

    /* renamed from: W */
    public final long mo74650W() {
        long j = this.f64492z;
        if (j < this.f64485A) {
            this.f64485A = j;
        }
        return j;
    }

    /* renamed from: a */
    public C15285f<T> mo74651a(C13640g gVar, int i, C15220e eVar) {
        return C15276b0.m94090e(this, gVar, i, eVar);
    }

    /* renamed from: b */
    public boolean mo74652b(T t) {
        int i;
        boolean z;
        C13635d<C13339u>[] dVarArr = C15301b.f64532a;
        synchronized (this) {
            i = 0;
            if (m94055Q(t)) {
                dVarArr = m94047H(dVarArr);
                z = true;
            } else {
                z = false;
            }
        }
        int length = dVarArr.length;
        while (i < length) {
            C13635d<C13339u> dVar = dVarArr[i];
            i++;
            if (dVar != null) {
                C13329n.C13330a aVar = C13329n.f61327a;
                dVar.resumeWith(C13329n.m85676a(C13339u.f61331a));
            }
        }
        return z;
    }

    public Object collect(C15288g<? super T> gVar, C13635d<?> dVar) {
        return m94073z(this, gVar, dVar);
    }

    public Object emit(T t, C13635d<? super C13339u> dVar) {
        return m94044E(this, t, dVar);
    }

    /* renamed from: g */
    public void mo74653g() {
        synchronized (this) {
            m94059U(m94048I(), this.f64485A, m94048I(), m94051M());
            C13339u uVar = C13339u.f61331a;
        }
    }
}

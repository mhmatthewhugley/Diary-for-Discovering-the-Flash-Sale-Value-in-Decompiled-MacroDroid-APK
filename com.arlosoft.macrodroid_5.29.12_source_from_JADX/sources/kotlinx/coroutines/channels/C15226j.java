package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b@\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0013\u001e\u001dB\u0016\b\u0001\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019\u0001\u0017\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, mo71668d2 = {"Lkotlinx/coroutines/channels/j;", "T", "", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "g", "", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "k", "(Ljava/lang/Object;)Ljava/lang/String;", "", "h", "(Ljava/lang/Object;)I", "other", "", "d", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getHolder$annotations", "()V", "holder", "j", "(Ljava/lang/Object;)Z", "isSuccess", "i", "isClosed", "c", "b", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.channels.j */
/* compiled from: Channel.kt */
public final class C15226j<T> {

    /* renamed from: b */
    public static final C15228b f64449b = new C15228b((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C15229c f64450c = new C15229c();

    /* renamed from: a */
    private final Object f64451a;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo71668d2 = {"Lkotlinx/coroutines/channels/j$a;", "Lkotlinx/coroutines/channels/j$c;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "a", "Ljava/lang/Throwable;", "cause", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.channels.j$a */
    /* compiled from: Channel.kt */
    public static final class C15227a extends C15229c {

        /* renamed from: a */
        public final Throwable f64452a;

        public C15227a(Throwable th) {
            this.f64452a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C15227a) && C13706o.m87924a(this.f64452a, ((C15227a) obj).f64452a);
        }

        public int hashCode() {
            Throwable th = this.f64452a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public String toString() {
            return "Closed(" + this.f64452a + ')';
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u0002H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, mo71668d2 = {"Lkotlinx/coroutines/channels/j$b;", "", "E", "value", "Lkotlinx/coroutines/channels/j;", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "", "cause", "a", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/j$c;", "failed", "Lkotlinx/coroutines/channels/j$c;", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.channels.j$b */
    /* compiled from: Channel.kt */
    public static final class C15228b {
        private C15228b() {
        }

        public /* synthetic */ C15228b(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final <E> Object mo74581a(Throwable th) {
            return C15226j.m93855c(new C15227a(th));
        }

        /* renamed from: b */
        public final <E> Object mo74582b() {
            return C15226j.m93855c(C15226j.f64450c);
        }

        /* renamed from: c */
        public final <E> Object mo74583c(E e) {
            return C15226j.m93855c(e);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo71668d2 = {"Lkotlinx/coroutines/channels/j$c;", "", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.channels.j$c */
    /* compiled from: Channel.kt */
    public static class C15229c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ C15226j(Object obj) {
        this.f64451a = obj;
    }

    /* renamed from: b */
    public static final /* synthetic */ C15226j m93854b(Object obj) {
        return new C15226j(obj);
    }

    /* renamed from: c */
    public static <T> Object m93855c(Object obj) {
        return obj;
    }

    /* renamed from: d */
    public static boolean m93856d(Object obj, Object obj2) {
        return (obj2 instanceof C15226j) && C13706o.m87924a(obj, ((C15226j) obj2).mo74576l());
    }

    /* renamed from: e */
    public static final Throwable m93857e(Object obj) {
        C15227a aVar = obj instanceof C15227a ? (C15227a) obj : null;
        if (aVar == null) {
            return null;
        }
        return aVar.f64452a;
    }

    /* renamed from: f */
    public static final T m93858f(Object obj) {
        if (!(obj instanceof C15229c)) {
            return obj;
        }
        return null;
    }

    /* renamed from: g */
    public static final T m93859g(Object obj) {
        Throwable th;
        if (!(obj instanceof C15229c)) {
            return obj;
        }
        if (!(obj instanceof C15227a) || (th = ((C15227a) obj).f64452a) == null) {
            throw new IllegalStateException(C13706o.m87936m("Trying to call 'getOrThrow' on a failed channel result: ", obj).toString());
        }
        throw th;
    }

    /* renamed from: h */
    public static int m93860h(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: i */
    public static final boolean m93861i(Object obj) {
        return obj instanceof C15227a;
    }

    /* renamed from: j */
    public static final boolean m93862j(Object obj) {
        return !(obj instanceof C15229c);
    }

    /* renamed from: k */
    public static String m93863k(Object obj) {
        if (obj instanceof C15227a) {
            return ((C15227a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m93856d(this.f64451a, obj);
    }

    public int hashCode() {
        return m93860h(this.f64451a);
    }

    /* renamed from: l */
    public final /* synthetic */ Object mo74576l() {
        return this.f64451a;
    }

    public String toString() {
        return m93863k(this.f64451a);
    }
}

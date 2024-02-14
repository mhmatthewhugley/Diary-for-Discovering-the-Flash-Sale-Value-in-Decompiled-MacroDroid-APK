package p297ja;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b@\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u0018\u0010B\u0016\b\u0001\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\rø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\u0001\u0017\u0001\u0004\u0018\u00010\rø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, mo71668d2 = {"Lja/n;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "c", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "g", "(Ljava/lang/Object;)Ljava/lang/String;", "", "d", "(Ljava/lang/Object;)I", "", "other", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "f", "(Ljava/lang/Object;)Z", "isSuccess", "e", "isFailure", "value", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: ja.n */
/* compiled from: Result.kt */
public final class C13329n<T> implements Serializable {

    /* renamed from: a */
    public static final C13330a f61327a = new C13330a((C13695i) null);
    private final Object value;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo71668d2 = {"Lja/n$a;", "", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: ja.n$a */
    /* compiled from: Result.kt */
    public static final class C13330a {
        private C13330a() {
        }

        public /* synthetic */ C13330a(C13695i iVar) {
            this();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000f"}, mo71668d2 = {"Lja/n$b;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "exception", "<init>", "(Ljava/lang/Throwable;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: ja.n$b */
    /* compiled from: Result.kt */
    public static final class C13331b implements Serializable {
        public final Throwable exception;

        public C13331b(Throwable th) {
            C13706o.m87929f(th, "exception");
            this.exception = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C13331b) && C13706o.m87924a(this.exception, ((C13331b) obj).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "Failure(" + this.exception + ')';
        }
    }

    /* renamed from: a */
    public static <T> Object m85676a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static boolean m85677b(Object obj, Object obj2) {
        return (obj2 instanceof C13329n) && C13706o.m87924a(obj, ((C13329n) obj2).mo70160h());
    }

    /* renamed from: c */
    public static final Throwable m85678c(Object obj) {
        if (obj instanceof C13331b) {
            return ((C13331b) obj).exception;
        }
        return null;
    }

    /* renamed from: d */
    public static int m85679d(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: e */
    public static final boolean m85680e(Object obj) {
        return obj instanceof C13331b;
    }

    /* renamed from: f */
    public static final boolean m85681f(Object obj) {
        return !(obj instanceof C13331b);
    }

    /* renamed from: g */
    public static String m85682g(Object obj) {
        if (obj instanceof C13331b) {
            return ((C13331b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m85677b(this.value, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ Object mo70160h() {
        return this.value;
    }

    public int hashCode() {
        return m85679d(this.value);
    }

    public String toString() {
        return m85682g(this.value);
    }
}

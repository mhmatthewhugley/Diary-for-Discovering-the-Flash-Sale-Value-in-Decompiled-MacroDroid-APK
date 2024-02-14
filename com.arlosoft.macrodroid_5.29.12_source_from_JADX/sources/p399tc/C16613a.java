package p399tc;

import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H&J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\bR\"\u0010\u000f\u001a\u00020\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, mo71668d2 = {"Ltc/a;", "", "", "f", "Ltc/d;", "queue", "Lja/u;", "e", "(Ltc/d;)V", "", "toString", "Ltc/d;", "d", "()Ltc/d;", "setQueue$okhttp", "nextExecuteNanoTime", "J", "c", "()J", "g", "(J)V", "name", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "", "cancelable", "Z", "a", "()Z", "<init>", "(Ljava/lang/String;Z)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: tc.a */
/* compiled from: Task.kt */
public abstract class C16613a {

    /* renamed from: a */
    private C16616d f67452a;

    /* renamed from: b */
    private long f67453b;

    /* renamed from: c */
    private final String f67454c;

    /* renamed from: d */
    private final boolean f67455d;

    public C16613a(String str, boolean z) {
        C13706o.m87929f(str, "name");
        this.f67454c = str;
        this.f67455d = z;
        this.f67453b = -1;
    }

    /* renamed from: a */
    public final boolean mo79467a() {
        return this.f67455d;
    }

    /* renamed from: b */
    public final String mo79468b() {
        return this.f67454c;
    }

    /* renamed from: c */
    public final long mo79469c() {
        return this.f67453b;
    }

    /* renamed from: d */
    public final C16616d mo79470d() {
        return this.f67452a;
    }

    /* renamed from: e */
    public final void mo79471e(C16616d dVar) {
        C13706o.m87929f(dVar, "queue");
        C16616d dVar2 = this.f67452a;
        if (dVar2 != dVar) {
            if (dVar2 == null) {
                this.f67452a = dVar;
                return;
            }
            throw new IllegalStateException("task is in multiple queues".toString());
        }
    }

    /* renamed from: f */
    public abstract long mo76151f();

    /* renamed from: g */
    public final void mo79472g(long j) {
        this.f67453b = j;
    }

    public String toString() {
        return this.f67454c;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16613a(String str, boolean z, int i, C13695i iVar) {
        this(str, (i & 2) != 0 ? true : z);
    }
}

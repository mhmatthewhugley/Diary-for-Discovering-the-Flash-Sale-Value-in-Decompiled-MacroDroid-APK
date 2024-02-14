package p226cd;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0000H\u0016J\b\u0010\u000e\u001a\u00020\u0000H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u0013"}, mo71668d2 = {"Lcd/z;", "", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "g", "h", "", "e", "c", "deadlineNanoTime", "d", "b", "a", "Lja/u;", "f", "<init>", "()V", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: cd.z */
/* compiled from: Timeout.kt */
public class C11213z {

    /* renamed from: d */
    public static final C11215b f54157d = new C11215b((C13695i) null);

    /* renamed from: e */
    public static final C11213z f54158e = new C11214a();

    /* renamed from: a */
    private boolean f54159a;

    /* renamed from: b */
    private long f54160b;

    /* renamed from: c */
    private long f54161c;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, mo71668d2 = {"cd/z$a", "Lcd/z;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "g", "deadlineNanoTime", "d", "Lja/u;", "f", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* renamed from: cd.z$a */
    /* compiled from: Timeout.kt */
    public static final class C11214a extends C11213z {
        C11214a() {
        }

        /* renamed from: d */
        public C11213z mo62523d(long j) {
            return this;
        }

        /* renamed from: f */
        public void mo62525f() {
        }

        /* renamed from: g */
        public C11213z mo62526g(long j, TimeUnit timeUnit) {
            C13706o.m87929f(timeUnit, "unit");
            return this;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo71668d2 = {"Lcd/z$b;", "", "Lcd/z;", "NONE", "Lcd/z;", "<init>", "()V", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* renamed from: cd.z$b */
    /* compiled from: Timeout.kt */
    public static final class C11215b {
        private C11215b() {
        }

        public /* synthetic */ C11215b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: a */
    public C11213z mo62520a() {
        this.f54159a = false;
        return this;
    }

    /* renamed from: b */
    public C11213z mo62521b() {
        this.f54161c = 0;
        return this;
    }

    /* renamed from: c */
    public long mo62522c() {
        if (this.f54159a) {
            return this.f54160b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    /* renamed from: d */
    public C11213z mo62523d(long j) {
        this.f54159a = true;
        this.f54160b = j;
        return this;
    }

    /* renamed from: e */
    public boolean mo62524e() {
        return this.f54159a;
    }

    /* renamed from: f */
    public void mo62525f() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        } else if (this.f54159a && this.f54160b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: g */
    public C11213z mo62526g(long j, TimeUnit timeUnit) {
        C13706o.m87929f(timeUnit, "unit");
        if (j >= 0) {
            this.f54161c = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(C13706o.m87936m("timeout < 0: ", Long.valueOf(j)).toString());
    }

    /* renamed from: h */
    public long mo62569h() {
        return this.f54161c;
    }
}

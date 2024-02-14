package p226cd;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0016J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001J\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0001H\u0016J\b\u0010\u000f\u001a\u00020\u0001H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\"\u0010\u0002\u001a\u00020\u00018\u0007@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, mo71668d2 = {"Lcd/h;", "Lcd/z;", "delegate", "j", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "g", "", "e", "c", "deadlineNanoTime", "d", "b", "a", "Lja/u;", "f", "Lcd/z;", "i", "()Lcd/z;", "setDelegate", "(Lcd/z;)V", "<init>", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: cd.h */
/* compiled from: ForwardingTimeout.kt */
public class C11192h extends C11213z {

    /* renamed from: f */
    private C11213z f54110f;

    public C11192h(C11213z zVar) {
        C13706o.m87929f(zVar, "delegate");
        this.f54110f = zVar;
    }

    /* renamed from: a */
    public C11213z mo62520a() {
        return this.f54110f.mo62520a();
    }

    /* renamed from: b */
    public C11213z mo62521b() {
        return this.f54110f.mo62521b();
    }

    /* renamed from: c */
    public long mo62522c() {
        return this.f54110f.mo62522c();
    }

    /* renamed from: d */
    public C11213z mo62523d(long j) {
        return this.f54110f.mo62523d(j);
    }

    /* renamed from: e */
    public boolean mo62524e() {
        return this.f54110f.mo62524e();
    }

    /* renamed from: f */
    public void mo62525f() throws IOException {
        this.f54110f.mo62525f();
    }

    /* renamed from: g */
    public C11213z mo62526g(long j, TimeUnit timeUnit) {
        C13706o.m87929f(timeUnit, "unit");
        return this.f54110f.mo62526g(j, timeUnit);
    }

    /* renamed from: i */
    public final C11213z mo62527i() {
        return this.f54110f;
    }

    /* renamed from: j */
    public final C11192h mo62528j(C11213z zVar) {
        C13706o.m87929f(zVar, "delegate");
        this.f54110f = zVar;
        return this;
    }
}

package kotlinx.coroutines.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15202c1;
import kotlinx.coroutines.C15415h0;
import kotlinx.coroutines.C15423h2;
import kotlinx.coroutines.C15492n;
import kotlinx.coroutines.C15546t0;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b%\u0010&J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0016J\u001e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00018VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, mo71668d2 = {"Lkotlinx/coroutines/internal/t;", "Lkotlinx/coroutines/h2;", "Lkotlinx/coroutines/t0;", "", "C", "Lkotlin/coroutines/g;", "context", "", "isDispatchNeeded", "", "parallelism", "Lkotlinx/coroutines/h0;", "limitedParallelism", "", "timeMillis", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlinx/coroutines/c1;", "j", "B", "Lkotlinx/coroutines/n;", "Lja/u;", "continuation", "D", "", "toString", "", "a", "Ljava/lang/Throwable;", "cause", "c", "Ljava/lang/String;", "errorHint", "o", "()Lkotlinx/coroutines/h2;", "immediate", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.t */
/* compiled from: MainDispatchers.kt */
final class C15465t extends C15423h2 implements C15546t0 {

    /* renamed from: a */
    private final Throwable f64693a;

    /* renamed from: c */
    private final String f64694c;

    public C15465t(Throwable th, String str) {
        this.f64693a = th;
        this.f64694c = str;
    }

    /* renamed from: C */
    private final Void m94468C() {
        String m;
        if (this.f64693a != null) {
            String str = this.f64694c;
            String str2 = "";
            if (!(str == null || (m = C13706o.m87936m(". ", str)) == null)) {
                str2 = m;
            }
            throw new IllegalStateException(C13706o.m87936m("Module with the Main dispatcher had failed to initialize", str2), this.f64693a);
        }
        C15464s.m94466d();
        throw new KotlinNothingValueException();
    }

    /* renamed from: B */
    public Void dispatch(C13640g gVar, Runnable runnable) {
        m94468C();
        throw new KotlinNothingValueException();
    }

    /* renamed from: D */
    public Void mo74504f(long j, C15492n<? super C13339u> nVar) {
        m94468C();
        throw new KotlinNothingValueException();
    }

    public boolean isDispatchNeeded(C13640g gVar) {
        m94468C();
        throw new KotlinNothingValueException();
    }

    /* renamed from: j */
    public C15202c1 mo74506j(long j, Runnable runnable, C13640g gVar) {
        m94468C();
        throw new KotlinNothingValueException();
    }

    public C15415h0 limitedParallelism(int i) {
        m94468C();
        throw new KotlinNothingValueException();
    }

    /* renamed from: o */
    public C15423h2 mo74507o() {
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        Throwable th = this.f64693a;
        sb.append(th != null ? C13706o.m87936m(", cause=", th) : "");
        sb.append(']');
        return sb.toString();
    }
}

package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlinx.coroutines.C15498o0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0011"}, mo71668d2 = {"Lkotlinx/coroutines/scheduling/k;", "Lkotlinx/coroutines/scheduling/h;", "Lja/u;", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "d", "Ljava/lang/Runnable;", "block", "", "submissionTime", "Lkotlinx/coroutines/scheduling/i;", "taskContext", "<init>", "(Ljava/lang/Runnable;JLkotlinx/coroutines/scheduling/i;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.scheduling.k */
/* compiled from: Tasks.kt */
public final class C15531k extends C15528h {

    /* renamed from: d */
    public final Runnable f64771d;

    public C15531k(Runnable runnable, long j, C15529i iVar) {
        super(j, iVar);
        this.f64771d = runnable;
    }

    public void run() {
        try {
            this.f64771d.run();
        } finally {
            this.f64769c.mo74894a();
        }
    }

    public String toString() {
        return "Task[" + C15498o0.m94571a(this.f64771d) + '@' + C15498o0.m94572b(this.f64771d) + ", " + this.f64768a + ", " + this.f64769c + ']';
    }
}

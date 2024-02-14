package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlinx.coroutines.internal.C15431b0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\u00008\u0000X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0016\u0010\u000f\u001a\u00020\f8\u0000@\u0000X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0013\u001a\u00020\u00108\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00108\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, mo71668d2 = {"", "a", "J", "WORK_STEALING_TIME_RESOLUTION_NS", "", "b", "I", "CORE_POOL_SIZE", "c", "MAX_POOL_SIZE", "d", "IDLE_WORKER_KEEP_ALIVE_NS", "Lkotlinx/coroutines/scheduling/g;", "e", "Lkotlinx/coroutines/scheduling/g;", "schedulerTimeSource", "Lkotlinx/coroutines/scheduling/i;", "f", "Lkotlinx/coroutines/scheduling/i;", "NonBlockingContext", "g", "BlockingContext", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.scheduling.l */
/* compiled from: Tasks.kt */
public final class C15532l {

    /* renamed from: a */
    public static final long f64772a = C15435d0.m94359e("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: b */
    public static final int f64773b = C15435d0.m94358d("kotlinx.coroutines.scheduler.core.pool.size", C16792h.m99540b(C15431b0.m94339a(), 2), 1, 0, 8, (Object) null);

    /* renamed from: c */
    public static final int f64774c = C15435d0.m94358d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, (Object) null);

    /* renamed from: d */
    public static final long f64775d = TimeUnit.SECONDS.toNanos(C15435d0.m94359e("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));

    /* renamed from: e */
    public static C15527g f64776e = C15525e.f64762a;

    /* renamed from: f */
    public static final C15529i f64777f = new C15530j(0);

    /* renamed from: g */
    public static final C15529i f64778g = new C15530j(1);
}
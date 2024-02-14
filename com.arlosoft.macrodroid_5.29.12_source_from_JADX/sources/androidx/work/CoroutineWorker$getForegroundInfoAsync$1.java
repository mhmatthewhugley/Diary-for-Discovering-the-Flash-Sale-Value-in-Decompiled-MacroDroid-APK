package androidx.work;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", mo71894f = "CoroutineWorker.kt", mo71895l = {134}, mo71896m = "invokeSuspend")
/* compiled from: CoroutineWorker.kt */
final class CoroutineWorker$getForegroundInfoAsync$1 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
    final /* synthetic */ JobListenableFuture<ForegroundInfo> $jobFuture;
    Object L$0;
    int label;
    final /* synthetic */ CoroutineWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoroutineWorker$getForegroundInfoAsync$1(JobListenableFuture<ForegroundInfo> jobListenableFuture, CoroutineWorker coroutineWorker, C13635d<? super CoroutineWorker$getForegroundInfoAsync$1> dVar) {
        super(2, dVar);
        this.$jobFuture = jobListenableFuture;
        this.this$0 = coroutineWorker;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new CoroutineWorker$getForegroundInfoAsync$1(this.$jobFuture, this.this$0, dVar);
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
        return ((CoroutineWorker$getForegroundInfoAsync$1) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        JobListenableFuture<ForegroundInfo> jobListenableFuture;
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            JobListenableFuture<ForegroundInfo> jobListenableFuture2 = this.$jobFuture;
            CoroutineWorker coroutineWorker = this.this$0;
            this.L$0 = jobListenableFuture2;
            this.label = 1;
            Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
            if (foregroundInfo == c) {
                return c;
            }
            jobListenableFuture = jobListenableFuture2;
            obj = foregroundInfo;
        } else if (i == 1) {
            jobListenableFuture = (JobListenableFuture) this.L$0;
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jobListenableFuture.complete(obj);
        return C13339u.f61331a;
    }
}

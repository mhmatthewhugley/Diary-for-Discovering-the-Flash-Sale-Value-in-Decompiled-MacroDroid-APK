package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15202c1;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15482l0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0013\u0010\u0004\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, mo71668d2 = {"Landroidx/lifecycle/EmittedSource;", "Lkotlinx/coroutines/c1;", "Lja/u;", "removeSource", "disposeNow", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "dispose", "Landroidx/lifecycle/LiveData;", "source", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/MediatorLiveData;", "mediator", "Landroidx/lifecycle/MediatorLiveData;", "", "disposed", "Z", "<init>", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/MediatorLiveData;)V", "lifecycle-livedata-ktx_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: CoroutineLiveData.kt */
public final class EmittedSource implements C15202c1 {
    private boolean disposed;
    private final MediatorLiveData<?> mediator;
    private final LiveData<?> source;

    public EmittedSource(LiveData<?> liveData, MediatorLiveData<?> mediatorLiveData) {
        C13706o.m87929f(liveData, "source");
        C13706o.m87929f(mediatorLiveData, "mediator");
        this.source = liveData;
        this.mediator = mediatorLiveData;
    }

    /* access modifiers changed from: private */
    @MainThread
    public final void removeSource() {
        if (!this.disposed) {
            this.mediator.removeSource(this.source);
            this.disposed = true;
        }
    }

    public void dispose() {
        C15561w1 unused = C15473j.m94492d(C15482l0.m94502a(C15186a1.m93731c().mo74507o()), (C13640g) null, (C15486m0) null, new EmittedSource$dispose$1(this, (C13635d<? super EmittedSource$dispose$1>) null), 3, (Object) null);
    }

    public final Object disposeNow(C13635d<? super C13339u> dVar) {
        Object g = C15414h.m94298g(C15186a1.m93731c().mo74507o(), new EmittedSource$disposeNow$2(this, (C13635d<? super EmittedSource$disposeNow$2>) null), dVar);
        return g == C13652d.m87832c() ? g : C13339u.f61331a;
    }
}

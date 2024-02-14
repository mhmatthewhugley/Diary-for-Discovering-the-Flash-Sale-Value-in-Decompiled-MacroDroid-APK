package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.C13646h;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15414h;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\\\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2*\b\u0001\u0010\u0010\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\\\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132*\b\u0001\u0010\u0010\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\t8\u0000XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017*V\b\u0000\u0010\u0018\u001a\u0004\b\u0000\u0010\u0000\"$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b2$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, mo71668d2 = {"T", "Landroidx/lifecycle/MediatorLiveData;", "Landroidx/lifecycle/LiveData;", "source", "Landroidx/lifecycle/EmittedSource;", "addDisposableSource", "(Landroidx/lifecycle/MediatorLiveData;Landroidx/lifecycle/LiveData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "context", "", "timeoutInMs", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/coroutines/d;", "Lja/u;", "", "block", "liveData", "(Lkotlin/coroutines/g;JLqa/p;)Landroidx/lifecycle/LiveData;", "Ljava/time/Duration;", "timeout", "(Lkotlin/coroutines/g;Ljava/time/Duration;Lqa/p;)Landroidx/lifecycle/LiveData;", "DEFAULT_TIMEOUT", "J", "Block", "lifecycle-livedata-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: CoroutineLiveData.kt */
public final class CoroutineLiveDataKt {
    public static final long DEFAULT_TIMEOUT = 5000;

    public static final <T> Object addDisposableSource(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, C13635d<? super EmittedSource> dVar) {
        return C15414h.m94298g(C15186a1.m93731c().mo74507o(), new CoroutineLiveDataKt$addDisposableSource$2(mediatorLiveData, liveData, (C13635d<? super CoroutineLiveDataKt$addDisposableSource$2>) null), dVar);
    }

    public static final <T> LiveData<T> liveData(C13640g gVar, long j, C16269p<? super LiveDataScope<T>, ? super C13635d<? super C13339u>, ? extends Object> pVar) {
        C13706o.m87929f(gVar, "context");
        C13706o.m87929f(pVar, "block");
        return new CoroutineLiveData(gVar, j, pVar);
    }

    public static /* synthetic */ LiveData liveData$default(C13640g gVar, long j, C16269p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C13646h.f61899a;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return liveData(gVar, j, pVar);
    }

    @RequiresApi(26)
    public static final <T> LiveData<T> liveData(C13640g gVar, Duration duration, C16269p<? super LiveDataScope<T>, ? super C13635d<? super C13339u>, ? extends Object> pVar) {
        C13706o.m87929f(gVar, "context");
        C13706o.m87929f(duration, "timeout");
        C13706o.m87929f(pVar, "block");
        return new CoroutineLiveData(gVar, duration.toMillis(), pVar);
    }

    public static /* synthetic */ LiveData liveData$default(C13640g gVar, Duration duration, C16269p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C13646h.f61899a;
        }
        return liveData(gVar, duration, pVar);
    }
}

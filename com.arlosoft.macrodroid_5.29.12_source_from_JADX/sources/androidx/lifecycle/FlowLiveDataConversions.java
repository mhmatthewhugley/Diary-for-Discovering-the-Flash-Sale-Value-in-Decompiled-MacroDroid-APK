package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.C13646h;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15290h;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007\u001a\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0006\u001a0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u000b"}, mo71668d2 = {"T", "Lkotlinx/coroutines/flow/f;", "Lkotlin/coroutines/g;", "context", "", "timeoutInMs", "Landroidx/lifecycle/LiveData;", "asLiveData", "asFlow", "Ljava/time/Duration;", "timeout", "lifecycle-livedata-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: FlowLiveData.kt */
public final class FlowLiveDataConversions {
    public static final <T> C15285f<T> asFlow(LiveData<T> liveData) {
        C13706o.m87929f(liveData, "<this>");
        return C15290h.m94132r(new FlowLiveDataConversions$asFlow$1(liveData, (C13635d<? super FlowLiveDataConversions$asFlow$1>) null));
    }

    public static final <T> LiveData<T> asLiveData(C15285f<? extends T> fVar) {
        C13706o.m87929f(fVar, "<this>");
        return asLiveData$default((C15285f) fVar, (C13640g) null, 0, 3, (Object) null);
    }

    public static final <T> LiveData<T> asLiveData(C15285f<? extends T> fVar, C13640g gVar) {
        C13706o.m87929f(fVar, "<this>");
        C13706o.m87929f(gVar, "context");
        return asLiveData$default((C15285f) fVar, gVar, 0, 2, (Object) null);
    }

    public static final <T> LiveData<T> asLiveData(C15285f<? extends T> fVar, C13640g gVar, long j) {
        C13706o.m87929f(fVar, "<this>");
        C13706o.m87929f(gVar, "context");
        return CoroutineLiveDataKt.liveData(gVar, j, new FlowLiveDataConversions$asLiveData$1(fVar, (C13635d<? super FlowLiveDataConversions$asLiveData$1>) null));
    }

    public static /* synthetic */ LiveData asLiveData$default(C15285f fVar, C13640g gVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C13646h.f61899a;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return asLiveData(fVar, gVar, j);
    }

    @RequiresApi(26)
    public static final <T> LiveData<T> asLiveData(C15285f<? extends T> fVar, C13640g gVar, Duration duration) {
        C13706o.m87929f(fVar, "<this>");
        C13706o.m87929f(gVar, "context");
        C13706o.m87929f(duration, "timeout");
        return asLiveData(fVar, gVar, duration.toMillis());
    }

    public static /* synthetic */ LiveData asLiveData$default(C15285f fVar, C13640g gVar, Duration duration, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C13646h.f61899a;
        }
        return asLiveData(fVar, gVar, duration);
    }
}

package splitties.lifecycle.coroutines;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.C15573z;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "splitties/lifecycle/coroutines/LifecycleKt$createJob$2$1", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
/* compiled from: Lifecycle.kt */
final class LifecycleKt$createJob$$inlined$also$lambda$1 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
    final /* synthetic */ Lifecycle.State $activeWhile$inlined;
    final /* synthetic */ C15573z $job;
    final /* synthetic */ Lifecycle $this_createJob$inlined;
    int label;

    /* renamed from: p$ */
    private C15478k0 f69209p$;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LifecycleKt$createJob$$inlined$also$lambda$1(C15573z zVar, C13635d dVar, Lifecycle lifecycle, Lifecycle.State state) {
        super(2, dVar);
        this.$job = zVar;
        this.$this_createJob$inlined = lifecycle;
        this.$activeWhile$inlined = state;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        C13706o.m87929f(dVar, "completion");
        LifecycleKt$createJob$$inlined$also$lambda$1 lifecycleKt$createJob$$inlined$also$lambda$1 = new LifecycleKt$createJob$$inlined$also$lambda$1(this.$job, dVar, this.$this_createJob$inlined, this.$activeWhile$inlined);
        lifecycleKt$createJob$$inlined$also$lambda$1.f69209p$ = (C15478k0) obj;
        return lifecycleKt$createJob$$inlined$also$lambda$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((LifecycleKt$createJob$$inlined$also$lambda$1) create(obj, (C13635d) obj2)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C13652d.m87832c();
        if (this.label == 0) {
            C13332o.m85685b(obj);
            this.$this_createJob$inlined.addObserver(new LifecycleEventObserver(this) {

                /* renamed from: a */
                final /* synthetic */ LifecycleKt$createJob$$inlined$also$lambda$1 f69210a;

                {
                    this.f69210a = r1;
                }

                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    C13706o.m87929f(lifecycleOwner, "source");
                    C13706o.m87929f(event, NotificationCompat.CATEGORY_EVENT);
                    if (this.f69210a.$this_createJob$inlined.getCurrentState().compareTo(this.f69210a.$activeWhile$inlined) < 0) {
                        this.f69210a.$this_createJob$inlined.removeObserver(this);
                        C15561w1.C15562a.m94723a(this.f69210a.$job, (CancellationException) null, 1, (Object) null);
                    }
                }
            });
            return C13339u.f61331a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

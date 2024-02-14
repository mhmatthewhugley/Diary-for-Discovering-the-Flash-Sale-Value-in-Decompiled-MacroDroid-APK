package p387s9;

import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;
import p292io.grpc.C12530b;
import p292io.grpc.C12542c;
import p292io.grpc.C12548d;
import p387s9.C16512d;

/* renamed from: s9.d */
/* compiled from: AbstractStub */
public abstract class C16512d<S extends C16512d<S>> {

    /* renamed from: a */
    private final C12548d f67231a;

    /* renamed from: b */
    private final C12542c f67232b;

    /* renamed from: s9.d$a */
    /* compiled from: AbstractStub */
    public interface C16513a<T extends C16512d<T>> {
        /* renamed from: a */
        T mo63813a(C12548d dVar, C12542c cVar);
    }

    protected C16512d(C12548d dVar, C12542c cVar) {
        this.f67231a = (C12548d) Preconditions.m5393t(dVar, "channel");
        this.f67232b = (C12542c) Preconditions.m5393t(cVar, "callOptions");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract S mo63817a(C12548d dVar, C12542c cVar);

    /* renamed from: b */
    public final C12542c mo79315b() {
        return this.f67232b;
    }

    /* renamed from: c */
    public final S mo79316c(C12530b bVar) {
        return mo63817a(this.f67231a, this.f67232b.mo69086k(bVar));
    }

    /* renamed from: d */
    public final S mo79317d(Executor executor) {
        return mo63817a(this.f67231a, this.f67232b.mo69088m(executor));
    }
}

package p292io.grpc;

import com.google.common.base.MoreObjects;

/* renamed from: io.grpc.v0 */
/* compiled from: PartialForwardingClientCall */
abstract class C13004v0<ReqT, RespT> extends C12558f<ReqT, RespT> {
    C13004v0() {
    }

    /* renamed from: a */
    public void mo63035a() {
        mo63036e().mo63035a();
    }

    /* renamed from: b */
    public void mo69131b(int i) {
        mo63036e().mo69131b(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C12558f<?, ?> mo63036e();

    public String toString() {
        return MoreObjects.m5334c(this).mo22194d("delegate", mo63036e()).toString();
    }
}

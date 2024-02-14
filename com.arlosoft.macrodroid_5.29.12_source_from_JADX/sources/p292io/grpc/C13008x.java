package p292io.grpc;

import com.google.common.base.MoreObjects;
import java.util.concurrent.TimeUnit;
import p292io.grpc.C13008x;

/* renamed from: io.grpc.x */
/* compiled from: ForwardingChannelBuilder */
public abstract class C13008x<T extends C13008x<T>> extends C12951p0<T> {
    protected C13008x() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C12951p0<?> mo69866e();

    /* renamed from: f */
    public T mo69745c(long j, TimeUnit timeUnit) {
        mo69866e().mo69745c(j, timeUnit);
        return mo69868g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final T mo69868g() {
        return this;
    }

    /* renamed from: h */
    public T mo69746d() {
        mo69866e().mo69746d();
        return mo69868g();
    }

    public String toString() {
        return MoreObjects.m5334c(this).mo22194d("delegate", mo69866e()).toString();
    }
}

package p292io.grpc;

import java.util.concurrent.TimeUnit;
import p292io.grpc.C12951p0;

/* renamed from: io.grpc.p0 */
/* compiled from: ManagedChannelBuilder */
public abstract class C12951p0<T extends C12951p0<T>> {
    /* renamed from: b */
    public static C12951p0<?> m85026b(String str) {
        return ManagedChannelProvider.m83629d().mo69014a(str);
    }

    /* renamed from: a */
    public abstract C12930o0 mo69212a();

    /* renamed from: c */
    public T mo69745c(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public T mo69746d() {
        throw new UnsupportedOperationException();
    }
}

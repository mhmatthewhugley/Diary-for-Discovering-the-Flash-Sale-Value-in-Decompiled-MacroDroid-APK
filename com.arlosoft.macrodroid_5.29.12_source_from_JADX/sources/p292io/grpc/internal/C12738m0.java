package p292io.grpc.internal;

import java.io.InputStream;
import p292io.grpc.C12909l;

/* renamed from: io.grpc.internal.m0 */
/* compiled from: Framer */
public interface C12738m0 {
    /* renamed from: a */
    C12738m0 mo69155a(C12909l lVar);

    /* renamed from: b */
    void mo69156b(InputStream inputStream);

    void close();

    /* renamed from: d */
    void mo69158d(int i);

    void flush();

    boolean isClosed();
}

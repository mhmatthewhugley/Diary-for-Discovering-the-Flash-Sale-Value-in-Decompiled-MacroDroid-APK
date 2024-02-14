package p292io.grpc;

import com.google.common.annotations.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p292io.grpc.C12905k;

/* renamed from: io.grpc.m */
/* compiled from: CompressorRegistry */
public final class C12923m {

    /* renamed from: b */
    private static final C12923m f60470b = new C12923m(new C12905k.C12906a(), C12905k.C12907b.f60451a);

    /* renamed from: a */
    private final ConcurrentMap<String, C12909l> f60471a = new ConcurrentHashMap();

    @VisibleForTesting
    C12923m(C12909l... lVarArr) {
        for (C12909l lVar : lVarArr) {
            this.f60471a.put(lVar.mo69668a(), lVar);
        }
    }

    /* renamed from: a */
    public static C12923m m84930a() {
        return f60470b;
    }

    /* renamed from: b */
    public C12909l mo69698b(String str) {
        return (C12909l) this.f60471a.get(str);
    }
}

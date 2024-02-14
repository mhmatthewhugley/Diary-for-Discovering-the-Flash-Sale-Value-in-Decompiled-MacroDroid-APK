package p292io.grpc;

import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import p292io.grpc.C12527a1;
import p360p9.C16120f;

/* renamed from: io.grpc.ManagedChannelProvider */
public abstract class ManagedChannelProvider {
    @VisibleForTesting

    /* renamed from: a */
    static final Iterable<Class<?>> f59382a;

    /* renamed from: b */
    private static final ManagedChannelProvider f59383b;

    /* renamed from: io.grpc.ManagedChannelProvider$ProviderNotFoundException */
    public static final class ProviderNotFoundException extends RuntimeException {
        private static final long serialVersionUID = 1;

        public ProviderNotFoundException(String str) {
            super(str);
        }
    }

    /* renamed from: io.grpc.ManagedChannelProvider$a */
    class C12518a implements C12527a1.C12529b<ManagedChannelProvider> {
        C12518a() {
        }

        /* renamed from: c */
        public int mo69018b(ManagedChannelProvider managedChannelProvider) {
            return managedChannelProvider.mo69016c();
        }

        /* renamed from: d */
        public boolean mo69017a(ManagedChannelProvider managedChannelProvider) {
            return managedChannelProvider.mo69015b();
        }
    }

    /* renamed from: io.grpc.ManagedChannelProvider$b */
    private static final class C12519b implements Iterable<Class<?>> {
        private C12519b() {
        }

        /* synthetic */ C12519b(C12518a aVar) {
            this();
        }

        public Iterator<Class<?>> iterator() {
            ArrayList arrayList = new ArrayList();
            Class<C16120f> cls = C16120f.class;
            try {
                int i = C16120f.f66144c;
                arrayList.add(cls);
            } catch (ClassNotFoundException unused) {
            }
            try {
                arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
            } catch (ClassNotFoundException unused2) {
            }
            return arrayList.iterator();
        }
    }

    static {
        Class cls = ManagedChannelProvider.class;
        C12519b bVar = new C12519b((C12518a) null);
        f59382a = bVar;
        f59383b = (ManagedChannelProvider) C12527a1.m83661e(cls, bVar, cls.getClassLoader(), new C12518a());
    }

    /* renamed from: d */
    public static ManagedChannelProvider m83629d() {
        ManagedChannelProvider managedChannelProvider = f59383b;
        if (managedChannelProvider != null) {
            return managedChannelProvider;
        }
        throw new ProviderNotFoundException("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C12951p0<?> mo69014a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo69015b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo69016c();
}

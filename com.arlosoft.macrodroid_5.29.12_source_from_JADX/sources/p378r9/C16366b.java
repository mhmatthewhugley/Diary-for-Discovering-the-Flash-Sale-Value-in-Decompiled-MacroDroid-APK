package p378r9;

import com.google.common.base.Preconditions;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import p292io.grpc.C12537b1;
import p292io.grpc.C12908k0;
import p292io.grpc.C12972r0;

/* renamed from: r9.b */
/* compiled from: ProtoLiteUtils */
public final class C16366b {

    /* renamed from: a */
    static volatile ExtensionRegistryLite f66922a = ExtensionRegistryLite.m80520b();

    /* renamed from: r9.b$a */
    /* compiled from: ProtoLiteUtils */
    private static final class C16367a<T extends MessageLite> implements C12972r0.C12975c {

        /* renamed from: c */
        private static final ThreadLocal<Reference<byte[]>> f66923c = new ThreadLocal<>();

        /* renamed from: a */
        private final Parser<T> f66924a;

        /* renamed from: b */
        private final T f66925b;

        C16367a(T t) {
            this.f66925b = t;
            this.f66924a = t.mo65178f();
        }

        /* renamed from: d */
        private T m98119d(CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
            T t = (MessageLite) this.f66924a.mo64739b(codedInputStream, C16366b.f66922a);
            try {
                codedInputStream.mo64958a(0);
                return t;
            } catch (InvalidProtocolBufferException e) {
                e.mo65249i(t);
                throw e;
            }
        }

        /* renamed from: c */
        public T mo69801b(InputStream inputStream) {
            byte[] bArr;
            if ((inputStream instanceof C16365a) && ((C16365a) inputStream).mo79054e() == this.f66924a) {
                try {
                    return ((C16365a) inputStream).mo79053c();
                } catch (IllegalStateException unused) {
                }
            }
            CodedInputStream codedInputStream = null;
            try {
                if (inputStream instanceof C12908k0) {
                    int available = inputStream.available();
                    if (available > 0 && available <= 4194304) {
                        ThreadLocal<Reference<byte[]>> threadLocal = f66923c;
                        Reference reference = threadLocal.get();
                        if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < available) {
                            bArr = new byte[available];
                            threadLocal.set(new WeakReference(bArr));
                        }
                        int i = available;
                        while (true) {
                            if (i <= 0) {
                                break;
                            }
                            int read = inputStream.read(bArr, available - i, i);
                            if (read == -1) {
                                break;
                            }
                            i -= read;
                        }
                        if (i == 0) {
                            codedInputStream = CodedInputStream.m79838j(bArr, 0, available);
                        } else {
                            throw new RuntimeException("size inaccurate: " + available + " != " + (available - i));
                        }
                    } else if (available == 0) {
                        return this.f66925b;
                    }
                }
                if (codedInputStream == null) {
                    codedInputStream = CodedInputStream.m79834f(inputStream);
                }
                codedInputStream.mo64956F(Integer.MAX_VALUE);
                try {
                    return m98119d(codedInputStream);
                } catch (InvalidProtocolBufferException e) {
                    throw C12537b1.f59421t.mo69066q("Invalid protobuf byte sequence").mo69065p(e).mo69057d();
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        /* renamed from: e */
        public InputStream mo69800a(T t) {
            return new C16365a(t, this.f66924a);
        }
    }

    /* renamed from: a */
    static long m98117a(InputStream inputStream, OutputStream outputStream) throws IOException {
        Preconditions.m5393t(inputStream, "inputStream cannot be null!");
        Preconditions.m5393t(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: b */
    public static <T extends MessageLite> C12972r0.C12975c<T> m98118b(T t) {
        return new C16367a(t);
    }
}

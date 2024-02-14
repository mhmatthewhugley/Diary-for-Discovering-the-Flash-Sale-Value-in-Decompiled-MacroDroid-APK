package p146p4;

import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p083e4.C7275g;
import p084e5.C7284c;
import p102h4.C7376a;
import p102h4.C7384g;
import p108i4.C7401d;
import p146p4.C8105n;

/* renamed from: p4.b */
/* compiled from: ByteArrayLoader */
public class C8067b<Data> implements C8105n<byte[], Data> {

    /* renamed from: a */
    private final C8070b<Data> f19662a;

    /* renamed from: p4.b$a */
    /* compiled from: ByteArrayLoader */
    public static class C8068a implements C8107o<byte[], ByteBuffer> {

        /* renamed from: p4.b$a$a */
        /* compiled from: ByteArrayLoader */
        class C8069a implements C8070b<ByteBuffer> {
            C8069a() {
            }

            /* renamed from: a */
            public Class<ByteBuffer> mo38081a() {
                return ByteBuffer.class;
            }

            /* renamed from: c */
            public ByteBuffer mo38082b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @NonNull
        /* renamed from: a */
        public C8105n<byte[], ByteBuffer> mo38078a(@NonNull C8113r rVar) {
            return new C8067b(new C8069a());
        }
    }

    /* renamed from: p4.b$b */
    /* compiled from: ByteArrayLoader */
    public interface C8070b<Data> {
        /* renamed from: a */
        Class<Data> mo38081a();

        /* renamed from: b */
        Data mo38082b(byte[] bArr);
    }

    /* renamed from: p4.b$c */
    /* compiled from: ByteArrayLoader */
    private static class C8071c<Data> implements C7401d<Data> {

        /* renamed from: a */
        private final byte[] f19664a;

        /* renamed from: c */
        private final C8070b<Data> f19665c;

        C8071c(byte[] bArr, C8070b<Data> bVar) {
            this.f19664a = bArr;
            this.f19665c = bVar;
        }

        @NonNull
        /* renamed from: a */
        public Class<Data> mo37430a() {
            return this.f19665c.mo38081a();
        }

        /* renamed from: b */
        public void mo37435b() {
        }

        public void cancel() {
        }

        @NonNull
        /* renamed from: d */
        public C7376a mo37438d() {
            return C7376a.LOCAL;
        }

        /* renamed from: f */
        public void mo37440f(@NonNull C7275g gVar, @NonNull C7401d.C7402a<? super Data> aVar) {
            aVar.mo33008e(this.f19665c.mo38082b(this.f19664a));
        }
    }

    /* renamed from: p4.b$d */
    /* compiled from: ByteArrayLoader */
    public static class C8072d implements C8107o<byte[], InputStream> {

        /* renamed from: p4.b$d$a */
        /* compiled from: ByteArrayLoader */
        class C8073a implements C8070b<InputStream> {
            C8073a() {
            }

            /* renamed from: a */
            public Class<InputStream> mo38081a() {
                return InputStream.class;
            }

            /* renamed from: c */
            public InputStream mo38082b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @NonNull
        /* renamed from: a */
        public C8105n<byte[], InputStream> mo38078a(@NonNull C8113r rVar) {
            return new C8067b(new C8073a());
        }
    }

    public C8067b(C8070b<Data> bVar) {
        this.f19662a = bVar;
    }

    /* renamed from: c */
    public C8105n.C8106a<Data> mo38074b(@NonNull byte[] bArr, int i, int i2, @NonNull C7384g gVar) {
        return new C8105n.C8106a<>(new C7284c(bArr), new C8071c(bArr, this.f19662a));
    }

    /* renamed from: d */
    public boolean mo38073a(@NonNull byte[] bArr) {
        return true;
    }
}

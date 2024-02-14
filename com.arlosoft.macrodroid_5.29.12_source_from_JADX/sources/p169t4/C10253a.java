package p169t4;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import p108i4.C7403e;

/* renamed from: t4.a */
/* compiled from: ByteBufferRewinder */
public class C10253a implements C7403e<ByteBuffer> {

    /* renamed from: a */
    private final ByteBuffer f23389a;

    /* renamed from: t4.a$a */
    /* compiled from: ByteBufferRewinder */
    public static class C10254a implements C7403e.C7404a<ByteBuffer> {
        @NonNull
        /* renamed from: a */
        public Class<ByteBuffer> mo37448a() {
            return ByteBuffer.class;
        }

        @NonNull
        /* renamed from: c */
        public C7403e<ByteBuffer> mo37449b(ByteBuffer byteBuffer) {
            return new C10253a(byteBuffer);
        }
    }

    public C10253a(ByteBuffer byteBuffer) {
        this.f23389a = byteBuffer;
    }

    /* renamed from: b */
    public void mo37447b() {
    }

    @NonNull
    /* renamed from: c */
    public ByteBuffer mo37446a() {
        this.f23389a.position(0);
        return this.f23389a;
    }
}

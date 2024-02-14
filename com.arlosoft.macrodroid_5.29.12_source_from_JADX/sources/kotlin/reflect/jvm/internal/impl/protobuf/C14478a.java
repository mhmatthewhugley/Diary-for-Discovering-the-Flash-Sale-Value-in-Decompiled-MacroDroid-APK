package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.C14516o;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a */
/* compiled from: AbstractMessageLite */
public abstract class C14478a implements C14516o {
    protected int memoizedHashCode = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public UninitializedMessageException mo73279h() {
        return new UninitializedMessageException(this);
    }

    /* renamed from: i */
    public void mo73280i(OutputStream outputStream) throws IOException {
        int c = mo71015c();
        CodedOutputStream J = CodedOutputStream.m90731J(outputStream, CodedOutputStream.m90753u(CodedOutputStream.m90754v(c) + c));
        J.mo73264o0(c);
        mo71018g(J);
        J.mo73234I();
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a */
    /* compiled from: AbstractMessageLite */
    public static abstract class C14479a<BuilderType extends C14479a> implements C14516o.C14517a {
        /* renamed from: k */
        protected static UninitializedMessageException m90815k(C14516o oVar) {
            return new UninitializedMessageException(oVar);
        }

        /* renamed from: h */
        public abstract BuilderType mo71034h0(C14488e eVar, C14490f fVar) throws IOException;

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a$a */
        /* compiled from: AbstractMessageLite */
        static final class C14480a extends FilterInputStream {

            /* renamed from: a */
            private int f63322a;

            C14480a(InputStream inputStream, int i) {
                super(inputStream);
                this.f63322a = i;
            }

            public int available() throws IOException {
                return Math.min(super.available(), this.f63322a);
            }

            public int read() throws IOException {
                if (this.f63322a <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f63322a--;
                }
                return read;
            }

            public long skip(long j) throws IOException {
                long skip = super.skip(Math.min(j, (long) this.f63322a));
                if (skip >= 0) {
                    this.f63322a = (int) (((long) this.f63322a) - skip);
                }
                return skip;
            }

            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f63322a;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.f63322a -= read;
                }
                return read;
            }
        }
    }
}

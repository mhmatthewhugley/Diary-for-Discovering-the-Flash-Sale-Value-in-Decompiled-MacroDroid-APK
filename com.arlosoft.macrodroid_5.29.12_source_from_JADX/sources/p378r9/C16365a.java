package p378r9;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p292io.grpc.C12908k0;
import p292io.grpc.C13003v;

/* renamed from: r9.a */
/* compiled from: ProtoInputStream */
final class C16365a extends InputStream implements C13003v, C12908k0 {

    /* renamed from: a */
    private MessageLite f66919a;

    /* renamed from: c */
    private final Parser<?> f66920c;

    /* renamed from: d */
    private ByteArrayInputStream f66921d;

    C16365a(MessageLite messageLite, Parser<?> parser) {
        this.f66919a = messageLite;
        this.f66920c = parser;
    }

    public int available() {
        MessageLite messageLite = this.f66919a;
        if (messageLite != null) {
            return messageLite.mo65174c();
        }
        ByteArrayInputStream byteArrayInputStream = this.f66921d;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    /* renamed from: b */
    public int mo69859b(OutputStream outputStream) throws IOException {
        MessageLite messageLite = this.f66919a;
        if (messageLite != null) {
            int c = messageLite.mo65174c();
            this.f66919a.writeTo(outputStream);
            this.f66919a = null;
            return c;
        }
        ByteArrayInputStream byteArrayInputStream = this.f66921d;
        if (byteArrayInputStream == null) {
            return 0;
        }
        int a = (int) C16366b.m98117a(byteArrayInputStream, outputStream);
        this.f66921d = null;
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public MessageLite mo79053c() {
        MessageLite messageLite = this.f66919a;
        if (messageLite != null) {
            return messageLite;
        }
        throw new IllegalStateException("message not available");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Parser<?> mo79054e() {
        return this.f66920c;
    }

    public int read() {
        if (this.f66919a != null) {
            this.f66921d = new ByteArrayInputStream(this.f66919a.mo64718h());
            this.f66919a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f66921d;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        MessageLite messageLite = this.f66919a;
        if (messageLite != null) {
            int c = messageLite.mo65174c();
            if (c == 0) {
                this.f66919a = null;
                this.f66921d = null;
                return -1;
            } else if (i2 >= c) {
                CodedOutputStream Z0 = CodedOutputStream.m80108Z0(bArr, i, c);
                this.f66919a.mo65180k(Z0);
                Z0.mo65022U0();
                Z0.mo65021U();
                this.f66919a = null;
                this.f66921d = null;
                return c;
            } else {
                this.f66921d = new ByteArrayInputStream(this.f66919a.mo64718h());
                this.f66919a = null;
            }
        }
        ByteArrayInputStream byteArrayInputStream = this.f66921d;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}

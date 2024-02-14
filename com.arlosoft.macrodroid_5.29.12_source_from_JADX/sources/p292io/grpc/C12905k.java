package p292io.grpc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.http.protocol.HTTP;

/* renamed from: io.grpc.k */
/* compiled from: Codec */
public interface C12905k extends C12909l, C12995t {

    /* renamed from: io.grpc.k$a */
    /* compiled from: Codec */
    public static final class C12906a implements C12905k {
        /* renamed from: a */
        public String mo69668a() {
            return "gzip";
        }

        /* renamed from: b */
        public InputStream mo69669b(InputStream inputStream) throws IOException {
            return new GZIPInputStream(inputStream);
        }

        /* renamed from: c */
        public OutputStream mo69670c(OutputStream outputStream) throws IOException {
            return new GZIPOutputStream(outputStream);
        }
    }

    /* renamed from: io.grpc.k$b */
    /* compiled from: Codec */
    public static final class C12907b implements C12905k {

        /* renamed from: a */
        public static final C12905k f60451a = new C12907b();

        private C12907b() {
        }

        /* renamed from: a */
        public String mo69668a() {
            return HTTP.IDENTITY_CODING;
        }

        /* renamed from: b */
        public InputStream mo69669b(InputStream inputStream) {
            return inputStream;
        }

        /* renamed from: c */
        public OutputStream mo69670c(OutputStream outputStream) {
            return outputStream;
        }
    }
}

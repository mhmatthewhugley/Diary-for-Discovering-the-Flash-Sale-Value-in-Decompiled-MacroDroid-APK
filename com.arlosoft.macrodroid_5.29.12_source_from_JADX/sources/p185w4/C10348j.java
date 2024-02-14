package p185w4;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.C6659a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p102h4.C7384g;
import p102h4.C7385h;
import p120k4.C7587c;
import p126l4.C7667b;

/* renamed from: w4.j */
/* compiled from: StreamGifDecoder */
public class C10348j implements C7385h<InputStream, C10336c> {

    /* renamed from: a */
    private final List<ImageHeaderParser> f23552a;

    /* renamed from: b */
    private final C7385h<ByteBuffer, C10336c> f23553b;

    /* renamed from: c */
    private final C7667b f23554c;

    public C10348j(List<ImageHeaderParser> list, C7385h<ByteBuffer, C10336c> hVar, C7667b bVar) {
        this.f23552a = list;
        this.f23553b = hVar;
        this.f23554c = bVar;
    }

    /* renamed from: e */
    private static byte[] m40626e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e);
            return null;
        }
    }

    /* renamed from: c */
    public C7587c<C10336c> mo37384b(@NonNull InputStream inputStream, int i, int i2, @NonNull C7384g gVar) throws IOException {
        byte[] e = m40626e(inputStream);
        if (e == null) {
            return null;
        }
        return this.f23553b.mo37384b(ByteBuffer.wrap(e), i, i2, gVar);
    }

    /* renamed from: d */
    public boolean mo37383a(@NonNull InputStream inputStream, @NonNull C7384g gVar) throws IOException {
        return !((Boolean) gVar.mo37379c(C10347i.f23551b)).booleanValue() && C6659a.m25237b(this.f23552a, inputStream, this.f23554c) == ImageHeaderParser.ImageType.GIF;
    }
}

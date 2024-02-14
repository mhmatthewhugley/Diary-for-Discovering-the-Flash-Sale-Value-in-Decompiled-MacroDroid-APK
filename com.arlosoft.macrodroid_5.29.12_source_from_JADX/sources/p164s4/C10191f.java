package p164s4;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;
import p090f5.C7302a;
import p102h4.C7384g;
import p102h4.C7385h;
import p120k4.C7587c;

/* renamed from: s4.f */
/* compiled from: ByteBufferBitmapDecoder */
public class C10191f implements C7385h<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C10207k f23300a;

    public C10191f(C10207k kVar) {
        this.f23300a = kVar;
    }

    /* renamed from: c */
    public C7587c<Bitmap> mo37384b(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull C7384g gVar) throws IOException {
        return this.f23300a.mo40806d(C7302a.m30178e(byteBuffer), i, i2, gVar);
    }

    /* renamed from: d */
    public boolean mo37383a(@NonNull ByteBuffer byteBuffer, @NonNull C7384g gVar) {
        return this.f23300a.mo40809n(byteBuffer);
    }
}

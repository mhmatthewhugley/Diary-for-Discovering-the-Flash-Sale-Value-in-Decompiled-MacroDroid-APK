package p191x4;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import p102h4.C7384g;
import p120k4.C7587c;
import p169t4.C10255b;

/* renamed from: x4.a */
/* compiled from: BitmapBytesTranscoder */
public class C10379a implements C10383e<Bitmap, byte[]> {

    /* renamed from: a */
    private final Bitmap.CompressFormat f23598a;

    /* renamed from: b */
    private final int f23599b;

    public C10379a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Nullable
    /* renamed from: a */
    public C7587c<byte[]> mo41060a(@NonNull C7587c<Bitmap> cVar, @NonNull C7384g gVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        cVar.get().compress(this.f23598a, this.f23599b, byteArrayOutputStream);
        cVar.recycle();
        return new C10255b(byteArrayOutputStream.toByteArray());
    }

    public C10379a(@NonNull Bitmap.CompressFormat compressFormat, int i) {
        this.f23598a = compressFormat;
        this.f23599b = i;
    }
}

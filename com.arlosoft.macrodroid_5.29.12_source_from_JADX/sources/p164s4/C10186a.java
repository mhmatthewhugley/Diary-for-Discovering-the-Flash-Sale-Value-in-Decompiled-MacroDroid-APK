package p164s4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.IOException;
import p090f5.C7315j;
import p102h4.C7384g;
import p102h4.C7385h;
import p120k4.C7587c;

/* renamed from: s4.a */
/* compiled from: BitmapDrawableDecoder */
public class C10186a<DataType> implements C7385h<DataType, BitmapDrawable> {

    /* renamed from: a */
    private final C7385h<DataType, Bitmap> f23291a;

    /* renamed from: b */
    private final Resources f23292b;

    public C10186a(@NonNull Resources resources, @NonNull C7385h<DataType, Bitmap> hVar) {
        this.f23292b = (Resources) C7315j.m30204d(resources);
        this.f23291a = (C7385h) C7315j.m30204d(hVar);
    }

    /* renamed from: a */
    public boolean mo37383a(@NonNull DataType datatype, @NonNull C7384g gVar) throws IOException {
        return this.f23291a.mo37383a(datatype, gVar);
    }

    /* renamed from: b */
    public C7587c<BitmapDrawable> mo37384b(@NonNull DataType datatype, int i, int i2, @NonNull C7384g gVar) throws IOException {
        return C10216q.m40191d(this.f23292b, this.f23291a.mo37384b(datatype, i, i2, gVar));
    }
}

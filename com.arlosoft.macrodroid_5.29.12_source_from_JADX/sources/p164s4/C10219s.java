package p164s4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p102h4.C7384g;
import p102h4.C7385h;
import p120k4.C7587c;
import p126l4.C7669d;
import p174u4.C10295d;

/* renamed from: s4.s */
/* compiled from: ResourceBitmapDecoder */
public class C10219s implements C7385h<Uri, Bitmap> {

    /* renamed from: a */
    private final C10295d f23348a;

    /* renamed from: b */
    private final C7669d f23349b;

    public C10219s(C10295d dVar, C7669d dVar2) {
        this.f23348a = dVar;
        this.f23349b = dVar2;
    }

    @Nullable
    /* renamed from: c */
    public C7587c<Bitmap> mo37384b(@NonNull Uri uri, int i, int i2, @NonNull C7384g gVar) {
        C7587c<Drawable> c = this.f23348a.mo37384b(uri, i, i2, gVar);
        if (c == null) {
            return null;
        }
        return C10210l.m40176a(this.f23349b, c.get(), i, i2);
    }

    /* renamed from: d */
    public boolean mo37383a(@NonNull Uri uri, @NonNull C7384g gVar) {
        return "android.resource".equals(uri.getScheme());
    }
}

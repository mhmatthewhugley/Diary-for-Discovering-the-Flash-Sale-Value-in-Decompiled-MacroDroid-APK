package p191x4;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p102h4.C7384g;
import p120k4.C7587c;
import p126l4.C7669d;
import p164s4.C10189d;
import p185w4.C10336c;

/* renamed from: x4.c */
/* compiled from: DrawableBytesTranscoder */
public final class C10381c implements C10383e<Drawable, byte[]> {

    /* renamed from: a */
    private final C7669d f23601a;

    /* renamed from: b */
    private final C10383e<Bitmap, byte[]> f23602b;

    /* renamed from: c */
    private final C10383e<C10336c, byte[]> f23603c;

    public C10381c(@NonNull C7669d dVar, @NonNull C10383e<Bitmap, byte[]> eVar, @NonNull C10383e<C10336c, byte[]> eVar2) {
        this.f23601a = dVar;
        this.f23602b = eVar;
        this.f23603c = eVar2;
    }

    @NonNull
    /* renamed from: b */
    private static C7587c<C10336c> m40710b(@NonNull C7587c<Drawable> cVar) {
        return cVar;
    }

    @Nullable
    /* renamed from: a */
    public C7587c<byte[]> mo41060a(@NonNull C7587c<Drawable> cVar, @NonNull C7384g gVar) {
        Drawable drawable = cVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f23602b.mo41060a(C10189d.m40094d(((BitmapDrawable) drawable).getBitmap(), this.f23601a), gVar);
        }
        if (drawable instanceof C10336c) {
            return this.f23603c.mo41060a(m40710b(cVar), gVar);
        }
        return null;
    }
}

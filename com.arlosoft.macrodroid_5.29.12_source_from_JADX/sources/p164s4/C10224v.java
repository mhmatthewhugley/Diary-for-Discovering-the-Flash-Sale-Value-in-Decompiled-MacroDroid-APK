package p164s4;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import p090f5.C7316k;
import p102h4.C7384g;
import p102h4.C7385h;
import p120k4.C7587c;

/* renamed from: s4.v */
/* compiled from: UnitBitmapDecoder */
public final class C10224v implements C7385h<Bitmap, Bitmap> {

    /* renamed from: s4.v$a */
    /* compiled from: UnitBitmapDecoder */
    private static final class C10225a implements C7587c<Bitmap> {

        /* renamed from: a */
        private final Bitmap f23359a;

        C10225a(@NonNull Bitmap bitmap) {
            this.f23359a = bitmap;
        }

        @NonNull
        /* renamed from: a */
        public Bitmap get() {
            return this.f23359a;
        }

        @NonNull
        /* renamed from: b */
        public Class<Bitmap> mo33103b() {
            return Bitmap.class;
        }

        public int getSize() {
            return C7316k.m30212g(this.f23359a);
        }

        public void recycle() {
        }
    }

    /* renamed from: c */
    public C7587c<Bitmap> mo37384b(@NonNull Bitmap bitmap, int i, int i2, @NonNull C7384g gVar) {
        return new C10225a(bitmap);
    }

    /* renamed from: d */
    public boolean mo37383a(@NonNull Bitmap bitmap, @NonNull C7384g gVar) {
        return true;
    }
}

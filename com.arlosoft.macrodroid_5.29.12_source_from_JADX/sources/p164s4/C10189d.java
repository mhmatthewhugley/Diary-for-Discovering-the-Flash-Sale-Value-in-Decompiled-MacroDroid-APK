package p164s4;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p090f5.C7315j;
import p090f5.C7316k;
import p120k4.C7586b;
import p120k4.C7587c;
import p126l4.C7669d;

/* renamed from: s4.d */
/* compiled from: BitmapResource */
public class C10189d implements C7587c<Bitmap>, C7586b {

    /* renamed from: a */
    private final Bitmap f23298a;

    /* renamed from: c */
    private final C7669d f23299c;

    public C10189d(@NonNull Bitmap bitmap, @NonNull C7669d dVar) {
        this.f23298a = (Bitmap) C7315j.m30205e(bitmap, "Bitmap must not be null");
        this.f23299c = (C7669d) C7315j.m30205e(dVar, "BitmapPool must not be null");
    }

    @Nullable
    /* renamed from: d */
    public static C10189d m40094d(@Nullable Bitmap bitmap, @NonNull C7669d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new C10189d(bitmap, dVar);
    }

    /* renamed from: a */
    public void mo37659a() {
        this.f23298a.prepareToDraw();
    }

    @NonNull
    /* renamed from: b */
    public Class<Bitmap> mo33103b() {
        return Bitmap.class;
    }

    @NonNull
    /* renamed from: c */
    public Bitmap get() {
        return this.f23298a;
    }

    public int getSize() {
        return C7316k.m30212g(this.f23298a);
    }

    public void recycle() {
        this.f23299c.mo37692c(this.f23298a);
    }
}

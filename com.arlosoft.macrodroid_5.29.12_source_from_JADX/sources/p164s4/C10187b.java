package p164s4;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.File;
import p102h4.C7378c;
import p102h4.C7384g;
import p102h4.C7386i;
import p120k4.C7587c;
import p126l4.C7669d;

/* renamed from: s4.b */
/* compiled from: BitmapDrawableEncoder */
public class C10187b implements C7386i<BitmapDrawable> {

    /* renamed from: a */
    private final C7669d f23293a;

    /* renamed from: b */
    private final C7386i<Bitmap> f23294b;

    public C10187b(C7669d dVar, C7386i<Bitmap> iVar) {
        this.f23293a = dVar;
        this.f23294b = iVar;
    }

    @NonNull
    /* renamed from: b */
    public C7378c mo37385b(@NonNull C7384g gVar) {
        return this.f23294b.mo37385b(gVar);
    }

    /* renamed from: c */
    public boolean mo37372a(@NonNull C7587c<BitmapDrawable> cVar, @NonNull File file, @NonNull C7384g gVar) {
        return this.f23294b.mo37372a(new C10189d(cVar.get().getBitmap(), this.f23293a), file, gVar);
    }
}

package p185w4;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import p090f5.C7302a;
import p102h4.C7378c;
import p102h4.C7384g;
import p102h4.C7386i;
import p120k4.C7587c;

/* renamed from: w4.d */
/* compiled from: GifDrawableEncoder */
public class C10338d implements C7386i<C10336c> {
    @NonNull
    /* renamed from: b */
    public C7378c mo37385b(@NonNull C7384g gVar) {
        return C7378c.SOURCE;
    }

    /* renamed from: c */
    public boolean mo37372a(@NonNull C7587c<C10336c> cVar, @NonNull File file, @NonNull C7384g gVar) {
        try {
            C7302a.m30177d(cVar.get().mo40965c(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}

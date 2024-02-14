package p028d;

import agency.tango.materialintroscreen.R$dimen;
import android.view.View;
import androidx.annotation.FloatRange;
import p017c.C1421a;

/* renamed from: d.e */
/* compiled from: ExitDefaultTranslation */
public class C1971e implements C1421a {
    /* renamed from: a */
    public void mo16878a(View view, @FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        view.setTranslationY(f * ((float) view.getResources().getDimensionPixelOffset(R$dimen.y_offset)));
    }
}

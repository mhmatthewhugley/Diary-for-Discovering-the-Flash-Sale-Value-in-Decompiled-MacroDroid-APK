package p043p;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;
import androidx.annotation.NonNull;

/* renamed from: p.a */
/* compiled from: LPaint */
public class C2044a extends Paint {
    public C2044a() {
    }

    public void setTextLocales(@NonNull LocaleList localeList) {
    }

    public C2044a(int i) {
        super(i);
    }

    public C2044a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C2044a(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}

package p197z0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import org.apache.commons.cli.HelpFormatter;
import p061b1.C2240a;

/* renamed from: z0.a */
/* compiled from: AvatarPlaceholder */
public class C10430a extends Drawable {

    /* renamed from: a */
    private Paint f23685a;

    /* renamed from: b */
    private Paint f23686b;

    /* renamed from: c */
    private RectF f23687c;

    /* renamed from: d */
    private String f23688d;

    /* renamed from: e */
    private int f23689e;

    /* renamed from: f */
    private String f23690f;

    /* renamed from: g */
    private float f23691g;

    /* renamed from: h */
    private float f23692h;

    /* renamed from: i */
    private Path f23693i;

    public C10430a(String str, @NonNull String str2) {
        this(str, 33, str2);
    }

    /* renamed from: a */
    private float m40840a() {
        int i = this.f23689e;
        if (i < 0 || i > 100) {
            this.f23689e = 33;
        }
        return (((float) getBounds().height()) * ((float) this.f23689e)) / 100.0f;
    }

    /* renamed from: b */
    private float m40841b() {
        return (((float) getBounds().width()) / 2.0f) - (this.f23685a.measureText(this.f23688d) / 2.0f);
    }

    /* renamed from: c */
    private float m40842c() {
        return (((float) getBounds().height()) / 2.0f) - ((this.f23685a.ascent() + this.f23685a.descent()) / 2.0f);
    }

    /* renamed from: d */
    private String m40843d(String str) {
        return C2240a.m9132a(str) ? str.substring(0, 1).toUpperCase() : this.f23690f;
    }

    /* renamed from: e */
    private String m40844e(String str) {
        if (C2240a.m9133b(str)) {
            return "#3F51B5";
        }
        return String.format("#FF%06X", new Object[]{Integer.valueOf(str.hashCode() & ViewCompat.MEASURED_SIZE_MASK)});
    }

    /* renamed from: f */
    private String m40845f(String str) {
        return C2240a.m9132a(str) ? str : HelpFormatter.DEFAULT_OPT_PREFIX;
    }

    /* renamed from: g */
    private void m40846g() {
        this.f23685a.setTextSize(m40840a());
        this.f23691g = m40841b();
        this.f23692h = m40842c();
    }

    public void draw(@NonNull Canvas canvas) {
        if (this.f23687c == null) {
            this.f23687c = new RectF(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
            m40846g();
        }
        canvas.drawRect(this.f23687c, this.f23686b);
        canvas.drawText(this.f23688d, this.f23691g, this.f23692h, this.f23685a);
    }

    public int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        RectF rectF = this.f23687c;
        if (rectF == null) {
            this.f23687c = new RectF((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        } else {
            rectF.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        }
        m40846g();
    }

    public void setAlpha(int i) {
        this.f23685a.setAlpha(i);
        this.f23686b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f23685a.setColorFilter(colorFilter);
        this.f23686b.setColorFilter(colorFilter);
    }

    public C10430a(String str, @IntRange int i, @NonNull String str2) {
        this.f23693i = new Path();
        this.f23690f = m40845f(str2);
        this.f23688d = m40843d(str);
        this.f23689e = i;
        Paint paint = new Paint();
        this.f23685a = paint;
        paint.setAntiAlias(true);
        this.f23685a.setColor(Color.parseColor("white"));
        this.f23685a.setTypeface(Typeface.create("sans-serif-light", 1));
        Paint paint2 = new Paint();
        this.f23686b = paint2;
        paint2.setAntiAlias(true);
        this.f23686b.setStyle(Paint.Style.FILL);
        this.f23686b.setColor(Color.parseColor(m40844e(str)));
    }
}

package com.arlosoft.macrodroid.avatar.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.R$styleable;
import p455ag.C17105a;

public class AvatarView extends AppCompatImageView {

    /* renamed from: A */
    int f10023A;

    /* renamed from: B */
    int f10024B;

    /* renamed from: C */
    private Paint f10025C = new Paint();

    /* renamed from: D */
    private Paint f10026D = new Paint();

    /* renamed from: E */
    private Rect f10027E;

    /* renamed from: a */
    private int f10028a;

    /* renamed from: c */
    private int f10029c;

    /* renamed from: d */
    private int f10030d;

    /* renamed from: f */
    private int f10031f;

    /* renamed from: g */
    private int f10032g;

    /* renamed from: o */
    private int f10033o;

    /* renamed from: p */
    private int f10034p;

    /* renamed from: s */
    private Drawable f10035s;

    /* renamed from: z */
    int f10036z;

    public AvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    /* renamed from: a */
    private void m15067a(TypedArray typedArray) {
        this.f10031f = typedArray.getColor(0, this.f10028a);
        this.f10032g = typedArray.getDimensionPixelSize(1, this.f10029c);
        this.f10033o = typedArray.getInt(2, this.f10030d);
    }

    /* renamed from: b */
    private Bitmap m15068b(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int i = this.f10034p;
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            int i2 = this.f10036z;
            int i3 = this.f10032g;
            canvas.drawCircle((float) (i2 + i3), (float) (i3 + i2), (float) i2, this.f10025C);
            Rect rect = this.f10027E;
            canvas.drawBitmap(bitmap, rect, rect, this.f10026D);
            return createBitmap;
        } catch (OutOfMemoryError e) {
            C17105a.m100580b(e, "OutOfMemoryError occurred while generating bitmap", new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    private Bitmap m15069c(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        try {
            int i = this.f10034p;
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i2 = this.f10034p;
            drawable.setBounds(0, 0, i2, i2);
            drawable.draw(canvas);
            return createBitmap;
        } catch (OutOfMemoryError e) {
            C17105a.m100580b(e, "OutOfMemoryError occurred while generating bitmap", new Object[0]);
            return null;
        }
    }

    /* renamed from: e */
    private void m15070e(Canvas canvas) {
        int height = canvas.getHeight();
        int width = canvas.getWidth();
        int min = Math.min(width, height);
        this.f10034p = min;
        this.f10023A = (width - min) / 2;
        this.f10024B = (height - min) / 2;
        this.f10036z = (min - (this.f10032g * 2)) / 2;
        int i = this.f10034p;
        this.f10027E = new Rect(0, 0, i, i);
        mo27432d();
        if (this.f10034p != 0) {
            this.f10035s = getDrawable();
        }
    }

    /* renamed from: f */
    private void m15071f() {
        this.f10028a = getResources().getColor(2131101114);
        this.f10029c = getResources().getDimensionPixelSize(C17529R$dimen.av_default_border_width);
        this.f10030d = 33;
    }

    private void init(Context context, AttributeSet attributeSet) {
        m15071f();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.AvatarView, 0, 0);
            try {
                m15067a(obtainStyledAttributes);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f10025C.setAntiAlias(true);
        this.f10025C.setStyle(Paint.Style.FILL);
        this.f10025C.setColor(this.f10031f);
        this.f10026D.setAntiAlias(true);
        this.f10026D.setColor(getResources().getColor(C17528R$color.av_bitmap_background_color));
        this.f10026D.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo27432d() {
        int i = this.f10034p;
        if (i / 3 < this.f10032g) {
            this.f10032g = i / 3;
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        Bitmap b;
        m15070e(canvas);
        if (this.f10034p != 0 && (b = m15068b(m15069c(this.f10035s))) != null) {
            canvas.translate((float) this.f10023A, (float) this.f10024B);
            int i = this.f10036z;
            int i2 = this.f10032g;
            canvas.drawCircle((float) (i + i2), (float) (i + i2), (float) (i + i2), this.f10025C);
            canvas.drawBitmap(b, 0.0f, 0.0f, (Paint) null);
        }
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}

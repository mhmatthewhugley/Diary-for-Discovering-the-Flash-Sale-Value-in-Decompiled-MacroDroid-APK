package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.C0144Px;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.PluralsRes;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.core.view.ViewCompat;
import com.google.android.material.C10462R;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

public class BadgeDrawable extends Drawable implements TextDrawableHelper.TextDrawableDelegate {
    @StyleRes

    /* renamed from: H */
    private static final int f48656H = C10462R.style.Widget_MaterialComponents_Badge;
    @AttrRes

    /* renamed from: I */
    private static final int f48657I = C10462R.attr.badgeStyle;

    /* renamed from: A */
    private float f48658A;

    /* renamed from: B */
    private int f48659B;

    /* renamed from: C */
    private float f48660C;

    /* renamed from: D */
    private float f48661D;

    /* renamed from: E */
    private float f48662E;
    @Nullable

    /* renamed from: F */
    private WeakReference<View> f48663F;
    @Nullable

    /* renamed from: G */
    private WeakReference<FrameLayout> f48664G;
    @NonNull

    /* renamed from: a */
    private final WeakReference<Context> f48665a;
    @NonNull

    /* renamed from: c */
    private final MaterialShapeDrawable f48666c = new MaterialShapeDrawable();
    @NonNull

    /* renamed from: d */
    private final TextDrawableHelper f48667d;
    @NonNull

    /* renamed from: f */
    private final Rect f48668f = new Rect();

    /* renamed from: g */
    private float f48669g;

    /* renamed from: o */
    private float f48670o;

    /* renamed from: p */
    private float f48671p;
    @NonNull

    /* renamed from: s */
    private final SavedState f48672s;

    /* renamed from: z */
    private float f48673z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeGravity {
    }

    private BadgeDrawable(@NonNull Context context) {
        this.f48665a = new WeakReference<>(context);
        ThemeEnforcement.m68817c(context);
        Resources resources = context.getResources();
        this.f48669g = (float) resources.getDimensionPixelSize(C10462R.dimen.mtrl_badge_radius);
        this.f48671p = (float) resources.getDimensionPixelSize(C10462R.dimen.mtrl_badge_long_text_horizontal_padding);
        this.f48670o = (float) resources.getDimensionPixelSize(C10462R.dimen.mtrl_badge_with_text_radius);
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.f48667d = textDrawableHelper;
        textDrawableHelper.mo58218e().setTextAlign(Paint.Align.CENTER);
        this.f48672s = new SavedState(context);
        m67414F(C10462R.style.TextAppearance_MaterialComponents_Badge);
    }

    /* renamed from: E */
    private void m67413E(@Nullable TextAppearance textAppearance) {
        Context context;
        if (this.f48667d.mo58217d() != textAppearance && (context = (Context) this.f48665a.get()) != null) {
            this.f48667d.mo58221h(textAppearance, context);
            m67417M();
        }
    }

    /* renamed from: F */
    private void m67414F(@StyleRes int i) {
        Context context = (Context) this.f48665a.get();
        if (context != null) {
            m67413E(new TextAppearance(context, i));
        }
    }

    /* renamed from: J */
    private void m67415J(final View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != C10462R.C10465id.mtrl_anchor_parent) {
            WeakReference<FrameLayout> weakReference = this.f48664G;
            if (weakReference == null || weakReference.get() != viewGroup) {
                m67416K(view);
                final FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(C10462R.C10465id.mtrl_anchor_parent);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.f48664G = new WeakReference<>(frameLayout);
                frameLayout.post(new Runnable() {
                    public void run() {
                        BadgeDrawable.this.mo56808L(view, frameLayout);
                    }
                });
            }
        }
    }

    /* renamed from: K */
    private static void m67416K(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    /* renamed from: M */
    private void m67417M() {
        Context context = (Context) this.f48665a.get();
        WeakReference<View> weakReference = this.f48663F;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f48668f);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.f48664G;
            if (weakReference2 != null) {
                viewGroup = (FrameLayout) weakReference2.get();
            }
            if (viewGroup != null || BadgeUtils.f48693a) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            m67419b(context, rect2, view);
            BadgeUtils.m67490g(this.f48668f, this.f48673z, this.f48658A, this.f48661D, this.f48662E);
            this.f48666c.mo58653X(this.f48660C);
            if (!rect.equals(this.f48668f)) {
                this.f48666c.setBounds(this.f48668f);
            }
        }
    }

    /* renamed from: N */
    private void m67418N() {
        this.f48659B = ((int) Math.pow(10.0d, ((double) mo56820l()) - 1.0d)) - 1;
    }

    /* renamed from: b */
    private void m67419b(@NonNull Context context, @NonNull Rect rect, @NonNull View view) {
        int p = m67426p();
        int t = this.f48672s.f48692z;
        if (t == 8388691 || t == 8388693) {
            this.f48658A = (float) (rect.bottom - p);
        } else {
            this.f48658A = (float) (rect.top + p);
        }
        if (mo56821m() <= 9) {
            float f = !mo56825r() ? this.f48669g : this.f48670o;
            this.f48660C = f;
            this.f48662E = f;
            this.f48661D = f;
        } else {
            float f2 = this.f48670o;
            this.f48660C = f2;
            this.f48662E = f2;
            this.f48661D = (this.f48667d.mo58219f(m67424g()) / 2.0f) + this.f48671p;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(mo56825r() ? C10462R.dimen.mtrl_badge_text_horizontal_edge_offset : C10462R.dimen.mtrl_badge_horizontal_edge_offset);
        int o = m67425o();
        int t2 = this.f48672s.f48692z;
        if (t2 == 8388659 || t2 == 8388691) {
            this.f48673z = ViewCompat.getLayoutDirection(view) == 0 ? (((float) rect.left) - this.f48661D) + ((float) dimensionPixelSize) + ((float) o) : ((((float) rect.right) + this.f48661D) - ((float) dimensionPixelSize)) - ((float) o);
        } else {
            this.f48673z = ViewCompat.getLayoutDirection(view) == 0 ? ((((float) rect.right) + this.f48661D) - ((float) dimensionPixelSize)) - ((float) o) : (((float) rect.left) - this.f48661D) + ((float) dimensionPixelSize) + ((float) o);
        }
    }

    @NonNull
    /* renamed from: c */
    public static BadgeDrawable m67420c(@NonNull Context context) {
        return m67421d(context, (AttributeSet) null, f48657I, f48656H);
    }

    @NonNull
    /* renamed from: d */
    private static BadgeDrawable m67421d(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.m67427s(context, attributeSet, i, i2);
        return badgeDrawable;
    }

    @NonNull
    /* renamed from: e */
    static BadgeDrawable m67422e(@NonNull Context context, @NonNull SavedState savedState) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.m67429u(savedState);
        return badgeDrawable;
    }

    /* renamed from: f */
    private void m67423f(Canvas canvas) {
        Rect rect = new Rect();
        String g = m67424g();
        this.f48667d.mo58218e().getTextBounds(g, 0, g.length(), rect);
        canvas.drawText(g, this.f48673z, this.f48658A + ((float) (rect.height() / 2)), this.f48667d.mo58218e());
    }

    @NonNull
    /* renamed from: g */
    private String m67424g() {
        if (mo56821m() <= this.f48659B) {
            return NumberFormat.getInstance().format((long) mo56821m());
        }
        Context context = (Context) this.f48665a.get();
        if (context == null) {
            return "";
        }
        return context.getString(C10462R.string.mtrl_exceed_max_badge_number_suffix, new Object[]{Integer.valueOf(this.f48659B), "+"});
    }

    /* renamed from: o */
    private int m67425o() {
        return (mo56825r() ? this.f48672s.f48680D : this.f48672s.f48678B) + this.f48672s.f48682F;
    }

    /* renamed from: p */
    private int m67426p() {
        return (mo56825r() ? this.f48672s.f48681E : this.f48672s.f48679C) + this.f48672s.f48683G;
    }

    /* renamed from: s */
    private void m67427s(Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        TypedArray h = ThemeEnforcement.m68822h(context, attributeSet, C10462R.styleable.Badge, i, i2, new int[0]);
        mo56803C(h.getInt(C10462R.styleable.Badge_maxCharacterCount, 4));
        int i3 = C10462R.styleable.Badge_number;
        if (h.hasValue(i3)) {
            mo56804D(h.getInt(i3, 0));
        }
        mo56830x(m67428t(context, h, C10462R.styleable.Badge_backgroundColor));
        int i4 = C10462R.styleable.Badge_badgeTextColor;
        if (h.hasValue(i4)) {
            mo56832z(m67428t(context, h, i4));
        }
        mo56831y(h.getInt(C10462R.styleable.Badge_badgeGravity, 8388661));
        mo56802B(h.getDimensionPixelOffset(C10462R.styleable.Badge_horizontalOffset, 0));
        mo56806H(h.getDimensionPixelOffset(C10462R.styleable.Badge_verticalOffset, 0));
        mo56801A(h.getDimensionPixelOffset(C10462R.styleable.Badge_horizontalOffsetWithText, mo56819k()));
        mo56805G(h.getDimensionPixelOffset(C10462R.styleable.Badge_verticalOffsetWithText, mo56824q()));
        int i5 = C10462R.styleable.Badge_badgeRadius;
        if (h.hasValue(i5)) {
            this.f48669g = (float) h.getDimensionPixelSize(i5, (int) this.f48669g);
        }
        int i6 = C10462R.styleable.Badge_badgeWidePadding;
        if (h.hasValue(i6)) {
            this.f48671p = (float) h.getDimensionPixelSize(i6, (int) this.f48671p);
        }
        int i7 = C10462R.styleable.Badge_badgeWithTextRadius;
        if (h.hasValue(i7)) {
            this.f48670o = (float) h.getDimensionPixelSize(i7, (int) this.f48670o);
        }
        h.recycle();
    }

    /* renamed from: t */
    private static int m67428t(Context context, @NonNull TypedArray typedArray, @StyleableRes int i) {
        return MaterialResources.m69121a(context, typedArray, i).getDefaultColor();
    }

    /* renamed from: u */
    private void m67429u(@NonNull SavedState savedState) {
        mo56803C(savedState.f48688g);
        if (savedState.f48687f != -1) {
            mo56804D(savedState.f48687f);
        }
        mo56830x(savedState.f48684a);
        mo56832z(savedState.f48685c);
        mo56831y(savedState.f48692z);
        mo56802B(savedState.f48678B);
        mo56806H(savedState.f48679C);
        mo56801A(savedState.f48680D);
        mo56805G(savedState.f48681E);
        mo56828v(savedState.f48682F);
        mo56829w(savedState.f48683G);
        mo56807I(savedState.f48677A);
    }

    /* renamed from: A */
    public void mo56801A(@C0144Px int i) {
        int unused = this.f48672s.f48680D = i;
        m67417M();
    }

    /* renamed from: B */
    public void mo56802B(@C0144Px int i) {
        int unused = this.f48672s.f48678B = i;
        m67417M();
    }

    /* renamed from: C */
    public void mo56803C(int i) {
        if (this.f48672s.f48688g != i) {
            int unused = this.f48672s.f48688g = i;
            m67418N();
            this.f48667d.mo58222i(true);
            m67417M();
            invalidateSelf();
        }
    }

    /* renamed from: D */
    public void mo56804D(int i) {
        int max = Math.max(0, i);
        if (this.f48672s.f48687f != max) {
            int unused = this.f48672s.f48687f = max;
            this.f48667d.mo58222i(true);
            m67417M();
            invalidateSelf();
        }
    }

    /* renamed from: G */
    public void mo56805G(@C0144Px int i) {
        int unused = this.f48672s.f48681E = i;
        m67417M();
    }

    /* renamed from: H */
    public void mo56806H(@C0144Px int i) {
        int unused = this.f48672s.f48679C = i;
        m67417M();
    }

    /* renamed from: I */
    public void mo56807I(boolean z) {
        setVisible(z, false);
        boolean unused = this.f48672s.f48677A = z;
        if (BadgeUtils.f48693a && mo56816i() != null && !z) {
            ((ViewGroup) mo56816i().getParent()).invalidate();
        }
    }

    /* renamed from: L */
    public void mo56808L(@NonNull View view, @Nullable FrameLayout frameLayout) {
        this.f48663F = new WeakReference<>(view);
        boolean z = BadgeUtils.f48693a;
        if (!z || frameLayout != null) {
            this.f48664G = new WeakReference<>(frameLayout);
        } else {
            m67415J(view);
        }
        if (!z) {
            m67416K(view);
        }
        m67417M();
        invalidateSelf();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo56809a() {
        invalidateSelf();
    }

    public void draw(@NonNull Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f48666c.draw(canvas);
            if (mo56825r()) {
                m67423f(canvas);
            }
        }
    }

    public int getAlpha() {
        return this.f48672s.f48686d;
    }

    public int getIntrinsicHeight() {
        return this.f48668f.height();
    }

    public int getIntrinsicWidth() {
        return this.f48668f.width();
    }

    public int getOpacity() {
        return -3;
    }

    @Nullable
    /* renamed from: h */
    public CharSequence mo56815h() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!mo56825r()) {
            return this.f48672s.f48689o;
        }
        if (this.f48672s.f48690p <= 0 || (context = (Context) this.f48665a.get()) == null) {
            return null;
        }
        if (mo56821m() <= this.f48659B) {
            return context.getResources().getQuantityString(this.f48672s.f48690p, mo56821m(), new Object[]{Integer.valueOf(mo56821m())});
        }
        return context.getString(this.f48672s.f48691s, new Object[]{Integer.valueOf(this.f48659B)});
    }

    @Nullable
    /* renamed from: i */
    public FrameLayout mo56816i() {
        WeakReference<FrameLayout> weakReference = this.f48664G;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public boolean isStateful() {
        return false;
    }

    /* renamed from: j */
    public int mo56818j() {
        return this.f48672s.f48678B;
    }

    @C0144Px
    /* renamed from: k */
    public int mo56819k() {
        return this.f48672s.f48678B;
    }

    /* renamed from: l */
    public int mo56820l() {
        return this.f48672s.f48688g;
    }

    /* renamed from: m */
    public int mo56821m() {
        if (!mo56825r()) {
            return 0;
        }
        return this.f48672s.f48687f;
    }

    @NonNull
    /* renamed from: n */
    public SavedState mo56822n() {
        return this.f48672s;
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @C0144Px
    /* renamed from: q */
    public int mo56824q() {
        return this.f48672s.f48679C;
    }

    /* renamed from: r */
    public boolean mo56825r() {
        return this.f48672s.f48687f != -1;
    }

    public void setAlpha(int i) {
        int unused = this.f48672s.f48686d = i;
        this.f48667d.mo58218e().setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo56828v(int i) {
        int unused = this.f48672s.f48682F = i;
        m67417M();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo56829w(int i) {
        int unused = this.f48672s.f48683G = i;
        m67417M();
    }

    /* renamed from: x */
    public void mo56830x(@ColorInt int i) {
        int unused = this.f48672s.f48684a = i;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (this.f48666c.mo58684x() != valueOf) {
            this.f48666c.mo58656a0(valueOf);
            invalidateSelf();
        }
    }

    /* renamed from: y */
    public void mo56831y(int i) {
        if (this.f48672s.f48692z != i) {
            int unused = this.f48672s.f48692z = i;
            WeakReference<View> weakReference = this.f48663F;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.f48663F.get();
                WeakReference<FrameLayout> weakReference2 = this.f48664G;
                mo56808L(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
            }
        }
    }

    /* renamed from: z */
    public void mo56832z(@ColorInt int i) {
        int unused = this.f48672s.f48685c = i;
        if (this.f48667d.mo58218e().getColor() != i) {
            this.f48667d.mo58218e().setColor(i);
            invalidateSelf();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            @NonNull
            /* renamed from: a */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel);
            }

            @NonNull
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        /* access modifiers changed from: private */

        /* renamed from: A */
        public boolean f48677A;
        /* access modifiers changed from: private */
        @Dimension(unit = 1)

        /* renamed from: B */
        public int f48678B;
        /* access modifiers changed from: private */
        @Dimension(unit = 1)

        /* renamed from: C */
        public int f48679C;
        /* access modifiers changed from: private */
        @Dimension(unit = 1)

        /* renamed from: D */
        public int f48680D;
        /* access modifiers changed from: private */
        @Dimension(unit = 1)

        /* renamed from: E */
        public int f48681E;
        /* access modifiers changed from: private */
        @Dimension(unit = 1)

        /* renamed from: F */
        public int f48682F;
        /* access modifiers changed from: private */
        @Dimension(unit = 1)

        /* renamed from: G */
        public int f48683G;
        /* access modifiers changed from: private */
        @ColorInt

        /* renamed from: a */
        public int f48684a;
        /* access modifiers changed from: private */
        @ColorInt

        /* renamed from: c */
        public int f48685c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f48686d = 255;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f48687f = -1;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f48688g;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: o */
        public CharSequence f48689o;
        /* access modifiers changed from: private */
        @PluralsRes

        /* renamed from: p */
        public int f48690p;
        /* access modifiers changed from: private */
        @StringRes

        /* renamed from: s */
        public int f48691s;
        /* access modifiers changed from: private */

        /* renamed from: z */
        public int f48692z;

        public SavedState(@NonNull Context context) {
            this.f48685c = new TextAppearance(context, C10462R.style.TextAppearance_MaterialComponents_Badge).mo58603i().getDefaultColor();
            this.f48689o = context.getString(C10462R.string.mtrl_badge_numberless_content_description);
            this.f48690p = C10462R.plurals.mtrl_badge_content_description;
            this.f48691s = C10462R.string.mtrl_exceed_max_badge_number_content_description;
            this.f48677A = true;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.f48684a);
            parcel.writeInt(this.f48685c);
            parcel.writeInt(this.f48686d);
            parcel.writeInt(this.f48687f);
            parcel.writeInt(this.f48688g);
            parcel.writeString(this.f48689o.toString());
            parcel.writeInt(this.f48690p);
            parcel.writeInt(this.f48692z);
            parcel.writeInt(this.f48678B);
            parcel.writeInt(this.f48679C);
            parcel.writeInt(this.f48680D);
            parcel.writeInt(this.f48681E);
            parcel.writeInt(this.f48682F);
            parcel.writeInt(this.f48683G);
            parcel.writeInt(this.f48677A ? 1 : 0);
        }

        protected SavedState(@NonNull Parcel parcel) {
            this.f48684a = parcel.readInt();
            this.f48685c = parcel.readInt();
            this.f48686d = parcel.readInt();
            this.f48687f = parcel.readInt();
            this.f48688g = parcel.readInt();
            this.f48689o = parcel.readString();
            this.f48690p = parcel.readInt();
            this.f48692z = parcel.readInt();
            this.f48678B = parcel.readInt();
            this.f48679C = parcel.readInt();
            this.f48680D = parcel.readInt();
            this.f48681E = parcel.readInt();
            this.f48682F = parcel.readInt();
            this.f48683G = parcel.readInt();
            this.f48677A = parcel.readInt() != 0;
        }
    }
}

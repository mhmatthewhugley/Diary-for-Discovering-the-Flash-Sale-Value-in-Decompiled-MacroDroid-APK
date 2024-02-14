package p277h9;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.CheckResult;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import p255es.dmoral.toasty.R$drawable;
import p255es.dmoral.toasty.R$id;
import p255es.dmoral.toasty.R$layout;

/* renamed from: h9.a */
/* compiled from: Toasty */
public class C12408a {
    /* access modifiers changed from: private */
    @ColorInt

    /* renamed from: a */
    public static int f59125a = Color.parseColor("#FFFFFF");
    /* access modifiers changed from: private */
    @ColorInt

    /* renamed from: b */
    public static int f59126b = Color.parseColor("#D50000");
    /* access modifiers changed from: private */
    @ColorInt

    /* renamed from: c */
    public static int f59127c = Color.parseColor("#3F51B5");
    /* access modifiers changed from: private */
    @ColorInt

    /* renamed from: d */
    public static int f59128d = Color.parseColor("#388E3C");
    /* access modifiers changed from: private */
    @ColorInt

    /* renamed from: e */
    public static int f59129e = Color.parseColor("#FFA900");
    @ColorInt

    /* renamed from: f */
    private static int f59130f = Color.parseColor("#353A3E");

    /* renamed from: g */
    private static final Typeface f59131g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static Typeface f59132h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static int f59133i = 16;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static boolean f59134j = true;

    /* renamed from: h9.a$a */
    /* compiled from: Toasty */
    public static class C12409a {
        @ColorInt

        /* renamed from: a */
        private int f59135a = C12408a.f59125a;
        @ColorInt

        /* renamed from: b */
        private int f59136b = C12408a.f59126b;
        @ColorInt

        /* renamed from: c */
        private int f59137c = C12408a.f59127c;
        @ColorInt

        /* renamed from: d */
        private int f59138d = C12408a.f59128d;
        @ColorInt

        /* renamed from: e */
        private int f59139e = C12408a.f59129e;

        /* renamed from: f */
        private Typeface f59140f = C12408a.f59132h;

        /* renamed from: g */
        private int f59141g = C12408a.f59133i;

        /* renamed from: h */
        private boolean f59142h = C12408a.f59134j;

        private C12409a() {
        }

        @CheckResult
        /* renamed from: b */
        public static C12409a m83286b() {
            return new C12409a();
        }

        /* renamed from: a */
        public void mo68757a() {
            int unused = C12408a.f59125a = this.f59135a;
            int unused2 = C12408a.f59126b = this.f59136b;
            int unused3 = C12408a.f59127c = this.f59137c;
            int unused4 = C12408a.f59128d = this.f59138d;
            int unused5 = C12408a.f59129e = this.f59139e;
            Typeface unused6 = C12408a.f59132h = this.f59140f;
            int unused7 = C12408a.f59133i = this.f59141g;
            boolean unused8 = C12408a.f59134j = this.f59142h;
        }

        @CheckResult
        /* renamed from: c */
        public C12409a mo68758c(@ColorInt int i) {
            this.f59135a = i;
            return this;
        }

        @CheckResult
        /* renamed from: d */
        public C12409a mo68759d(boolean z) {
            this.f59142h = z;
            return this;
        }
    }

    static {
        Typeface create = Typeface.create("sans-serif-condensed", 0);
        f59131g = create;
        f59132h = create;
    }

    @CheckResult
    /* renamed from: q */
    public static Toast m83283q(@NonNull Context context, @NonNull CharSequence charSequence, @DrawableRes int i, @ColorInt int i2, int i3, boolean z, boolean z2) {
        return m83284r(context, charSequence, C12410b.m83290a(context, i), i2, i3, z, z2);
    }

    @CheckResult
    /* renamed from: r */
    public static Toast m83284r(@NonNull Context context, @NonNull CharSequence charSequence, Drawable drawable, @ColorInt int i, int i2, boolean z, boolean z2) {
        Drawable drawable2;
        Toast makeText = Toast.makeText(context, "", i2);
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R$layout.toast_layout, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R$id.toast_icon);
        TextView textView = (TextView) inflate.findViewById(R$id.toast_text);
        if (z2) {
            drawable2 = C12410b.m83292c(context, i);
        } else {
            drawable2 = C12410b.m83290a(context, R$drawable.toast_frame);
        }
        C12410b.m83291b(inflate, drawable2);
        if (!z) {
            imageView.setVisibility(8);
        } else if (drawable != null) {
            if (f59134j) {
                drawable = C12410b.m83293d(drawable, f59125a);
            }
            C12410b.m83291b(imageView, drawable);
        } else {
            throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
        }
        textView.setText(charSequence);
        textView.setTextColor(f59125a);
        textView.setTypeface(f59132h);
        textView.setTextSize(2, (float) f59133i);
        makeText.setView(inflate);
        return makeText;
    }

    @CheckResult
    /* renamed from: s */
    public static Toast m83285s(@NonNull Context context, @NonNull CharSequence charSequence, Drawable drawable, int i, boolean z) {
        return m83284r(context, charSequence, drawable, -1, i, z, false);
    }
}

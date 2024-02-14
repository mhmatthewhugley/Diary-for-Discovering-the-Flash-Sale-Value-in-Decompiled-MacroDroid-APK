package p277h9;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import p255es.dmoral.toasty.R$drawable;

/* renamed from: h9.b */
/* compiled from: ToastyUtils */
final class C12410b {
    /* renamed from: a */
    static Drawable m83290a(@NonNull Context context, @DrawableRes int i) {
        return context.getDrawable(i);
    }

    /* renamed from: b */
    static void m83291b(@NonNull View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: c */
    static Drawable m83292c(@NonNull Context context, @ColorInt int i) {
        return m83293d((NinePatchDrawable) m83290a(context, R$drawable.toast_frame), i);
    }

    /* renamed from: d */
    static Drawable m83293d(@NonNull Drawable drawable, @ColorInt int i) {
        drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        return drawable;
    }
}

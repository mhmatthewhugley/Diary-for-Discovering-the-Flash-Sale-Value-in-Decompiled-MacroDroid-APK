package p174u4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* renamed from: u4.a */
/* compiled from: DrawableDecoderCompat */
public final class C10292a {

    /* renamed from: a */
    private static volatile boolean f23449a = true;

    /* renamed from: a */
    public static Drawable m40438a(Context context, @DrawableRes int i, @Nullable Resources.Theme theme) {
        return m40440c(context, context, i, theme);
    }

    /* renamed from: b */
    public static Drawable m40439b(Context context, Context context2, @DrawableRes int i) {
        return m40440c(context, context2, i, (Resources.Theme) null);
    }

    /* renamed from: c */
    private static Drawable m40440c(Context context, Context context2, @DrawableRes int i, @Nullable Resources.Theme theme) {
        try {
            if (f23449a) {
                return m40442e(context2, i, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f23449a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return ContextCompat.getDrawable(context2, i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m40441d(context2, i, theme);
    }

    /* renamed from: d */
    private static Drawable m40441d(Context context, @DrawableRes int i, @Nullable Resources.Theme theme) {
        return ResourcesCompat.getDrawable(context.getResources(), i, theme);
    }

    /* renamed from: e */
    private static Drawable m40442e(Context context, @DrawableRes int i, @Nullable Resources.Theme theme) {
        if (theme != null) {
            context = new ContextThemeWrapper(context, theme);
        }
        return AppCompatResources.getDrawable(context, i);
    }
}

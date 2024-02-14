package p487zf;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13321g;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u0001¨\u0006\u0007"}, mo71668d2 = {"Landroid/content/Context;", "", "drawableResId", "Landroid/graphics/drawable/Drawable;", "a", "attr", "b", "resources_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* renamed from: zf.a */
/* compiled from: DrawableResources.kt */
public final class C17520a {

    /* renamed from: a */
    private static final C13321g f69351a = C13323i.m85669b(C17521a.f69352a);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Landroid/util/TypedValue;", "a", "()Landroid/util/TypedValue;"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: zf.a$a */
    /* compiled from: DrawableResources.kt */
    static final class C17521a extends C13708q implements C16254a<TypedValue> {

        /* renamed from: a */
        public static final C17521a f69352a = new C17521a();

        C17521a() {
            super(0);
        }

        /* renamed from: a */
        public final TypedValue invoke() {
            return new TypedValue();
        }
    }

    /* renamed from: a */
    public static final Drawable m101267a(Context context, @DrawableRes int i) {
        C13706o.m87929f(context, "$this$drawable");
        return context.getDrawable(i);
    }

    /* renamed from: b */
    public static final Drawable m101268b(Context context, @AttrRes int i) {
        C13706o.m87929f(context, "$this$styledDrawable");
        return m101267a(context, C17522b.m101271b(context, i, false, 2, (Object) null));
    }
}

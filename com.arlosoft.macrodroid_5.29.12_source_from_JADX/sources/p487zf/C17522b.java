package p487zf;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.annotation.AnyRes;
import androidx.annotation.AttrRes;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p484yf.C17517a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0006"}, mo71668d2 = {"Landroid/content/Context;", "", "attrRes", "", "resolveRefs", "a", "resources_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* renamed from: zf.b */
/* compiled from: StyledAttributes.kt */
public final class C17522b {

    /* renamed from: a */
    private static final TypedValue f69353a = new TypedValue();

    /* renamed from: b */
    private static final TypedValue f69354b = new TypedValue();

    /* renamed from: c */
    private static final int[] f69355c = new int[1];

    /* renamed from: d */
    private static final int[] f69356d = new int[1];

    @AnyRes
    /* renamed from: a */
    public static final int m101270a(Context context, @AttrRes int i, boolean z) {
        int i2;
        C13706o.m87929f(context, "$this$resolveThemeAttribute");
        if (C17517a.f69347b == Thread.currentThread()) {
            Resources.Theme theme = context.getTheme();
            TypedValue typedValue = f69353a;
            if (theme.resolveAttribute(i, typedValue, z)) {
                return typedValue.resourceId;
            }
            throw new Resources.NotFoundException("Couldn't resolve attribute resource #0x" + Integer.toHexString(i) + " from the theme of this Context.");
        }
        TypedValue typedValue2 = f69354b;
        synchronized (typedValue2) {
            if (context.getTheme().resolveAttribute(i, typedValue2, z)) {
                i2 = typedValue2.resourceId;
            } else {
                throw new Resources.NotFoundException("Couldn't resolve attribute resource #0x" + Integer.toHexString(i) + " from the theme of this Context.");
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static /* synthetic */ int m101271b(Context context, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return m101270a(context, i, z);
    }
}

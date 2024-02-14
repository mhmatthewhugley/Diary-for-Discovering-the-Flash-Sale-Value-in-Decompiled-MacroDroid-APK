package p029d0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo71668d2 = {"Ld0/a;", "", "a", "excuseme_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: d0.a */
/* compiled from: DesignUtils.kt */
public final class C1973a {

    /* renamed from: a */
    public static final C1974a f6055a = new C1974a((C13695i) null);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, mo71668d2 = {"Ld0/a$a;", "", "Landroid/content/Context;", "context", "", "color", "", "a", "<init>", "()V", "excuseme_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: d0.a$a */
    /* compiled from: DesignUtils.kt */
    public static final class C1974a {
        private C1974a() {
        }

        public /* synthetic */ C1974a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final int mo23992a(Context context, String str) {
            C13706o.m87930g(context, "context");
            C13706o.m87930g(str, TypedValues.Custom.S_COLOR);
            try {
                Resources resources = context.getResources();
                Context applicationContext = context.getApplicationContext();
                C13706o.m87925b(applicationContext, "context.applicationContext");
                ColorStateList colorStateList = AppCompatResources.getColorStateList(context, resources.getIdentifier(str, TypedValues.Custom.S_COLOR, applicationContext.getPackageName()));
                C13706o.m87925b(colorStateList, "AppCompatResources.getCo…      )\n                )");
                return colorStateList.getDefaultColor();
            } catch (Exception unused) {
                return Color.parseColor(str);
            }
        }
    }
}

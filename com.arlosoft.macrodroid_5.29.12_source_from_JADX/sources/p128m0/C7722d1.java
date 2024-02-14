package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.FontScaleAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.d1 */
/* compiled from: FontScaleActionInfo.kt */
public final class C7722d1 extends C3072g {

    /* renamed from: j */
    public static final C7723a f18693j = new C7723a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18694k = new C7722d1();
    @StringRes

    /* renamed from: g */
    private final int f18695g = C17541R$string.action_font_scale;

    /* renamed from: h */
    private final int f18696h = C17530R$drawable.ic_text_size;
    @StringRes

    /* renamed from: i */
    private final int f18697i = C17541R$string.action_font_scale_help;

    /* renamed from: m0.d1$a */
    /* compiled from: FontScaleActionInfo.kt */
    public static final class C7723a {
        private C7723a() {
        }

        public /* synthetic */ C7723a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37748a() {
            return C7722d1.f18694k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32202v() {
        return f18693j.mo37748a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new FontScaleAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18697i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18696h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18695g;
    }
}

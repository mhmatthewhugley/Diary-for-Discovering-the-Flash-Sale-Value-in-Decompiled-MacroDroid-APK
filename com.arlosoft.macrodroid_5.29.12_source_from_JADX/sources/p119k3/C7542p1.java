package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.ScreenContentTrigger;
import kotlin.jvm.internal.C13695i;

/* renamed from: k3.p1 */
/* compiled from: ScreenContentTriggerInfo.kt */
public final class C7542p1 extends C5889c8 {

    /* renamed from: j */
    public static final C7543a f18427j = new C7543a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18428k = new C7542p1();
    @StringRes

    /* renamed from: g */
    private final int f18429g = C17541R$string.trigger_screen_content;

    /* renamed from: h */
    private final int f18430h = C17530R$drawable.ic_cellphone_text;
    @StringRes

    /* renamed from: i */
    private final int f18431i = C17541R$string.trigger_screen_content_help;

    /* renamed from: k3.p1$a */
    /* compiled from: ScreenContentTriggerInfo.kt */
    public static final class C7543a {
        private C7543a() {
        }

        public /* synthetic */ C7543a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37648a() {
            return C7542p1.f18428k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m31389v() {
        return f18427j.mo37648a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ScreenContentTrigger(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18431i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18430h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18429g;
    }
}

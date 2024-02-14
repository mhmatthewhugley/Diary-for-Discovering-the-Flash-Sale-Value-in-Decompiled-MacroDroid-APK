package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.FloatingTextAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.c1 */
/* compiled from: FloatingTextActionInfo.kt */
public final class C7714c1 extends C3072g {

    /* renamed from: j */
    public static final C7715a f18682j = new C7715a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18683k = new C7714c1();
    @StringRes

    /* renamed from: g */
    private final int f18684g = C17541R$string.action_floating_text;

    /* renamed from: h */
    private final int f18685h = C17530R$drawable.ic_card_text;
    @StringRes

    /* renamed from: i */
    private final int f18686i = C17541R$string.action_floating_text_help;

    /* renamed from: m0.c1$a */
    /* compiled from: FloatingTextActionInfo.kt */
    public static final class C7715a {
        private C7715a() {
        }

        public /* synthetic */ C7715a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37747a() {
            return C7714c1.f18683k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32165v() {
        return f18682j.mo37747a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new FloatingTextAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18686i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18685h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18684g;
    }
}

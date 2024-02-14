package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.HomeButtonLongPressTrigger;
import kotlin.jvm.internal.C13695i;

/* renamed from: k3.l0 */
/* compiled from: HomeButtonLongPressTriggerInfo.kt */
public final class C7527l0 extends C5889c8 {

    /* renamed from: j */
    public static final C7528a f18406j = new C7528a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18407k = new C7527l0();
    @StringRes

    /* renamed from: g */
    private final int f18408g = C17541R$string.trigger_home_button_long_press;

    /* renamed from: h */
    private final int f18409h = C17530R$drawable.ic_home_button;
    @StringRes

    /* renamed from: i */
    private final int f18410i = C17541R$string.trigger_home_button_long_press_help;

    /* renamed from: k3.l0$a */
    /* compiled from: HomeButtonLongPressTriggerInfo.kt */
    public static final class C7528a {
        private C7528a() {
        }

        public /* synthetic */ C7528a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37646a() {
            return C7527l0.f18407k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m31316v() {
        return f18406j.mo37646a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new HomeButtonLongPressTrigger(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18410i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18409h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18408g;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 23;
    }
}

package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.DisableMacroDroidAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.o0 */
/* compiled from: DisableMacrodroidActionInfo.kt */
public final class C7807o0 extends C3072g {

    /* renamed from: j */
    public static final C7808a f18834j = new C7808a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18835k = new C7807o0();
    @StringRes

    /* renamed from: g */
    private final int f18836g = C17541R$string.action_disable_macrodroid;

    /* renamed from: h */
    private final int f18837h = C17530R$drawable.material_ic_grid_off_24px_svg;
    @StringRes

    /* renamed from: i */
    private final int f18838i = C17541R$string.action_disable_macrodroid_help;

    /* renamed from: m0.o0$a */
    /* compiled from: DisableMacrodroidActionInfo.kt */
    public static final class C7808a {
        private C7808a() {
        }

        public /* synthetic */ C7808a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37764a() {
            return C7807o0.f18835k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32621v() {
        return f18834j.mo37764a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new DisableMacroDroidAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18838i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18837h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18836g;
    }
}

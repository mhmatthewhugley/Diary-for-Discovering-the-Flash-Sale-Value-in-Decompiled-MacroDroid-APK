package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.JsonOutputAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.p1 */
/* compiled from: JsonOutputActionInfo.kt */
public final class C7815p1 extends C3072g {

    /* renamed from: j */
    public static final C7816a f18845j = new C7816a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18846k = new C7815p1();
    @StringRes

    /* renamed from: g */
    private final int f18847g = C17541R$string.action_json_output;

    /* renamed from: h */
    private final int f18848h = C17530R$drawable.ic_code_braces;
    @StringRes

    /* renamed from: i */
    private final int f18849i = C17541R$string.action_json_output_help;

    /* renamed from: m0.p1$a */
    /* compiled from: JsonOutputActionInfo.kt */
    public static final class C7816a {
        private C7816a() {
        }

        public /* synthetic */ C7816a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37765a() {
            return C7815p1.f18846k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32659v() {
        return f18845j.mo37765a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new JsonOutputAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18849i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18848h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18847g;
    }
}

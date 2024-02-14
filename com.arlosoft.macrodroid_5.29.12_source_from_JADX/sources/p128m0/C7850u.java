package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ClearVariablesAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.u */
/* compiled from: ClearVariablesActionInfo.kt */
public final class C7850u extends C3072g {

    /* renamed from: j */
    public static final C7851a f18902j = new C7851a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18903k = new C7850u();
    @StringRes

    /* renamed from: g */
    private final int f18904g = C17541R$string.action_clear_variables;

    /* renamed from: h */
    private final int f18905h = C17530R$drawable.material_ic_delete_sweep_24px_svg;
    @StringRes

    /* renamed from: i */
    private final int f18906i = C17541R$string.action_clear_variables_help;

    /* renamed from: m0.u$a */
    /* compiled from: ClearVariablesActionInfo.kt */
    public static final class C7851a {
        private C7851a() {
        }

        public /* synthetic */ C7851a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37772a() {
            return C7850u.f18903k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32828v() {
        return f18902j.mo37772a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ClearVariablesAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18906i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18905h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18904g;
    }
}

package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.ActionBlockAction;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.b */
/* compiled from: ActionBlockActionInfo.kt */
public final class C7699b extends C3072g {

    /* renamed from: j */
    public static final C7700a f18649j = new C7700a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18650k = new C7699b();
    @StringRes

    /* renamed from: g */
    private final int f18651g = C17541R$string.action_action_block;

    /* renamed from: h */
    private final int f18652h = C17530R$drawable.text_box_multiple;
    @StringRes

    /* renamed from: i */
    private final int f18653i = C17541R$string.action_action_block_help;

    /* renamed from: m0.b$a */
    /* compiled from: ActionBlockActionInfo.kt */
    public static final class C7700a {
        private C7700a() {
        }

        public /* synthetic */ C7700a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37741a() {
            return C7699b.f18650k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32108v() {
        return f18649j.mo37741a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ActionBlockAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18653i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18652h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18651g;
    }
}

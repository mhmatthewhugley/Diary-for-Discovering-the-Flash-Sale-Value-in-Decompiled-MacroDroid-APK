package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.DrawerOpenCloseTrigger;
import kotlin.jvm.internal.C13695i;

/* renamed from: k3.a0 */
/* compiled from: DrawerOpenCloseTriggerInfo.kt */
public final class C7473a0 extends C5889c8 {

    /* renamed from: j */
    public static final C7474a f18322j = new C7474a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18323k = new C7473a0();
    @StringRes

    /* renamed from: g */
    private final int f18324g = C17541R$string.trigger_drawer_open_close;

    /* renamed from: h */
    private final int f18325h = C17530R$drawable.ic_page_layout_sidebar_right_white_24dp;
    @StringRes

    /* renamed from: i */
    private final int f18326i = C17541R$string.trigger_drawer_open_close_help;

    /* renamed from: k3.a0$a */
    /* compiled from: DrawerOpenCloseTriggerInfo.kt */
    public static final class C7474a {
        private C7474a() {
        }

        public /* synthetic */ C7474a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37636a() {
            return C7473a0.f18323k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m31061v() {
        return f18322j.mo37636a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new DrawerOpenCloseTrigger(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18326i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18325h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18324g;
    }
}

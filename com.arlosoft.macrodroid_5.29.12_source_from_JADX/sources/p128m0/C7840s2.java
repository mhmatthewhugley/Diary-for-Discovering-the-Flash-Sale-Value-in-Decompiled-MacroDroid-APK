package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ReadScreenContentsAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.s2 */
/* compiled from: ReadScreenContentsActionInfo.kt */
public final class C7840s2 extends C3072g {

    /* renamed from: j */
    public static final C7841a f18889j = new C7841a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18890k = new C7840s2();
    @StringRes

    /* renamed from: g */
    private final int f18891g = C17541R$string.read_screen_contents;

    /* renamed from: h */
    private final int f18892h = C17530R$drawable.ic_cellphone_text;
    @StringRes

    /* renamed from: i */
    private final int f18893i = C17541R$string.read_screen_contents_help;

    /* renamed from: m0.s2$a */
    /* compiled from: ReadScreenContentsActionInfo.kt */
    public static final class C7841a {
        private C7841a() {
        }

        public /* synthetic */ C7841a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37771a() {
            return C7840s2.f18890k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32777v() {
        return f18889j.mo37771a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ReadScreenContentsAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18893i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18892h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18891g;
    }
}

package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.UpdateClipboardAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.y4 */
/* compiled from: UpdateClipboardActionInfo.kt */
public final class C7885y4 extends C3072g {

    /* renamed from: j */
    public static final C7886a f18955j = new C7886a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18956k = new C7885y4();
    @StringRes

    /* renamed from: g */
    private final int f18957g = C17541R$string.action_update_clipboard;

    /* renamed from: h */
    private final int f18958h = C17530R$drawable.clipboard_arrow_up;
    @StringRes

    /* renamed from: i */
    private final int f18959i = C17541R$string.action_update_clipboard_help;

    /* renamed from: m0.y4$a */
    /* compiled from: UpdateClipboardActionInfo.kt */
    public static final class C7886a {
        private C7886a() {
        }

        public /* synthetic */ C7886a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37778a() {
            return C7885y4.f18956k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32996v() {
        return f18955j.mo37778a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new UpdateClipboardAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18959i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18958h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18957g;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 29;
    }
}

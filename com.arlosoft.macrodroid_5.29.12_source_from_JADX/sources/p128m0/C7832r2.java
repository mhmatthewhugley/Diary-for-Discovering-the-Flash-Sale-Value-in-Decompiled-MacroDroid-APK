package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ReadFileAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.r2 */
/* compiled from: ReadFileActionInfo.kt */
public final class C7832r2 extends C3072g {

    /* renamed from: j */
    public static final C7833a f18875j = new C7833a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18876k = new C7832r2();
    @StringRes

    /* renamed from: g */
    private final int f18877g = C17541R$string.action_read_from_file;

    /* renamed from: h */
    private final int f18878h = C17530R$drawable.ic_file_import;
    @StringRes

    /* renamed from: i */
    private final int f18879i = C17541R$string.action_read_from_file_help;

    /* renamed from: m0.r2$a */
    /* compiled from: ReadFileActionInfo.kt */
    public static final class C7833a {
        private C7833a() {
        }

        public /* synthetic */ C7833a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37769a() {
            return C7832r2.f18876k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32743v() {
        return f18875j.mo37769a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ReadFileAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18879i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18878h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18877g;
    }
}

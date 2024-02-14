package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ExportLogAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.x0 */
/* compiled from: ExportLogActionInfo.kt */
public final class C7873x0 extends C3072g {

    /* renamed from: j */
    public static final C7874a f18937j = new C7874a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18938k = new C7873x0();
    @StringRes

    /* renamed from: g */
    private final int f18939g = C17541R$string.action_export_log;

    /* renamed from: h */
    private final int f18940h = C17530R$drawable.ic_database_export;
    @StringRes

    /* renamed from: i */
    private final int f18941i = C17541R$string.action_export_log_help;

    /* renamed from: m0.x0$a */
    /* compiled from: ExportLogActionInfo.kt */
    public static final class C7874a {
        private C7874a() {
        }

        public /* synthetic */ C7874a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37776a() {
            return C7873x0.f18938k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32940v() {
        return f18937j.mo37776a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ExportLogAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18941i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18940h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18939g;
    }
}

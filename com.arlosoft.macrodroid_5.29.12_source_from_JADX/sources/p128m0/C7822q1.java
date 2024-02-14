package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.JsonParseAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.q1 */
/* compiled from: JsonParseActionInfo.kt */
public final class C7822q1 extends C3072g {

    /* renamed from: k */
    public static final C7823a f18855k = new C7823a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final C4001c1 f18856l = new C7822q1();
    @StringRes

    /* renamed from: g */
    private final int f18857g = C17541R$string.action_json_parse;

    /* renamed from: h */
    private final int f18858h = C17530R$drawable.ic_code_json;
    @StringRes

    /* renamed from: i */
    private final int f18859i = C17541R$string.action_json_parse_help;

    /* renamed from: j */
    private final boolean f18860j;

    /* renamed from: m0.q1$a */
    /* compiled from: JsonParseActionInfo.kt */
    public static final class C7823a {
        private C7823a() {
        }

        public /* synthetic */ C7823a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37766a() {
            return C7822q1.f18856l;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32696v() {
        return f18855k.mo37766a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new JsonParseAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18859i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18858h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18857g;
    }

    /* renamed from: p */
    public boolean mo27898p() {
        return this.f18860j;
    }
}

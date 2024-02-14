package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ClearDictionaryArrayEntryAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.List;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.r */
/* compiled from: ClearDictionaryArrayEntryActionInfo.kt */
public final class C7827r extends C3072g {

    /* renamed from: j */
    public static final C7828a f18864j = new C7828a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18865k = new C7827r();
    @StringRes

    /* renamed from: g */
    private final int f18866g = C17541R$string.action_clear_dictionary_array_entry;

    /* renamed from: h */
    private final int f18867h = C17530R$drawable.ic_delete_sweep_outline;
    @StringRes

    /* renamed from: i */
    private final int f18868i = C17541R$string.action_clear_dictionary_array_entry_help;

    /* renamed from: m0.r$a */
    /* compiled from: ClearDictionaryArrayEntryActionInfo.kt */
    public static final class C7828a {
        private C7828a() {
        }

        public /* synthetic */ C7828a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37767a() {
            return C7827r.f18865k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32724v() {
        return f18864j.mo37767a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ClearDictionaryArrayEntryAction(activity, macro);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public List<Integer> mo27890d() {
        return C13614t.m87744f(Integer.valueOf(C17541R$string.variable), Integer.valueOf(C17541R$string.delete));
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18868i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18867h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18866g;
    }
}

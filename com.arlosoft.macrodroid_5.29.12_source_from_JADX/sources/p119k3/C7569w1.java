package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.SleepTrigger;
import java.util.List;
import kotlin.jvm.internal.C13695i;

/* renamed from: k3.w1 */
/* compiled from: SleepTriggerInfo.kt */
public final class C7569w1 extends C5889c8 {

    /* renamed from: j */
    public static final C7570a f18474j = new C7570a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18475k = new C7569w1();
    @StringRes

    /* renamed from: g */
    private final int f18476g = C17541R$string.trigger_sleep;

    /* renamed from: h */
    private final int f18477h = C17530R$drawable.ic_baseline_bed_24;
    @StringRes

    /* renamed from: i */
    private final int f18478i = C17541R$string.trigger_sleep_help;

    /* renamed from: k3.w1$a */
    /* compiled from: SleepTriggerInfo.kt */
    public static final class C7570a {
        private C7570a() {
        }

        public /* synthetic */ C7570a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37654a() {
            return C7569w1.f18475k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m31510v() {
        return f18474j.mo37654a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SleepTrigger(activity, macro);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public List<Integer> mo27890d() {
        return C13614t.m87744f(Integer.valueOf(C17541R$string.trigger_sleep_woke_up));
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18478i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18477h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18476g;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 29;
    }
}

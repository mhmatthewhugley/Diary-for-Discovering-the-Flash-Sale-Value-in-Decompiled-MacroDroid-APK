package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.VolumeLongPressTrigger;
import java.util.List;
import kotlin.jvm.internal.C13695i;

/* renamed from: k3.e2 */
/* compiled from: VolumeLongPressTriggerInfo.kt */
public final class C7494e2 extends C5889c8 {

    /* renamed from: l */
    public static final C7495a f18352l = new C7495a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final C4001c1 f18353m = new C7494e2();
    @StringRes

    /* renamed from: g */
    private final int f18354g = C17541R$string.trigger_volume_long_press;

    /* renamed from: h */
    private final int f18355h = C17530R$drawable.ic_webhook_white_24dp;
    @StringRes

    /* renamed from: i */
    private final int f18356i = C17541R$string.trigger_volume_long_press_help;

    /* renamed from: j */
    private final List<String> f18357j = C13612s.m87736e("android.permission.SET_VOLUME_KEY_LONG_PRESS_LISTENER");

    /* renamed from: k */
    private final boolean f18358k = true;

    /* renamed from: k3.e2$a */
    /* compiled from: VolumeLongPressTriggerInfo.kt */
    public static final class C7495a {
        private C7495a() {
        }

        public /* synthetic */ C7495a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37639a() {
            return C7494e2.f18353m;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m31161v() {
        return f18352l.mo37639a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new VolumeLongPressTrigger(activity, macro);
    }

    /* renamed from: c */
    public List<String> mo27889c() {
        return this.f18357j;
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18356i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18355h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18354g;
    }

    /* renamed from: q */
    public boolean mo27899q() {
        return this.f18358k;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 26;
    }
}

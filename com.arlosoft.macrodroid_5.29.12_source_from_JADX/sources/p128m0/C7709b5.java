package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.VoiceInputAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.b5 */
/* compiled from: VoiceInputActionInfo.kt */
public final class C7709b5 extends C3072g {

    /* renamed from: j */
    public static final C7710a f18671j = new C7710a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18672k = new C7709b5();
    @StringRes

    /* renamed from: g */
    private final int f18673g = C17541R$string.action_voice_input;

    /* renamed from: h */
    private final int f18674h = C17530R$drawable.material_ic_record_voice_over_24px_svg;
    @StringRes

    /* renamed from: i */
    private final int f18675i = C17541R$string.action_voice_input_help;

    /* renamed from: m0.b5$a */
    /* compiled from: VoiceInputActionInfo.kt */
    public static final class C7710a {
        private C7710a() {
        }

        public /* synthetic */ C7710a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37745a() {
            return C7709b5.f18672k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32146v() {
        return f18671j.mo37745a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new VoiceInputAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18675i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18674h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18673g;
    }
}

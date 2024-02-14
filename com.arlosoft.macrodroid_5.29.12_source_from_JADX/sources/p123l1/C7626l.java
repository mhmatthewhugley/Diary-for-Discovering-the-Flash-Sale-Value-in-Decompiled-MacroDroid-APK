package p123l1;

import android.app.Activity;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.ClipboardConstraint;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: l1.l */
/* compiled from: ClipboardConstraintInfo.kt */
public final class C7626l extends C4227b0 {

    /* renamed from: g */
    public static final C7627a f18533g = new C7627a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7626l f18534h = new C7626l();

    /* renamed from: l1.l$a */
    /* compiled from: ClipboardConstraintInfo.kt */
    public static final class C7627a {
        private C7627a() {
        }

        public /* synthetic */ C7627a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C7626l mo37667a() {
            return C7626l.f18534h;
        }
    }

    /* renamed from: v */
    public static final C7626l m31765v() {
        return f18533g.mo37667a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ClipboardConstraint(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_clipboard_contents_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_clipboard_text_white_24dp;
    }

    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_clipboard_contents;
    }
}

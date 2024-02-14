package p087f2;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import com.arlosoft.macrodroid.logging.systemlog.macrofilter.MacroLogFilterActivity;

/* renamed from: f2.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12219c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MacroLogFilterActivity f58706a;

    /* renamed from: c */
    public final /* synthetic */ EditText f58707c;

    /* renamed from: d */
    public final /* synthetic */ String f58708d;

    /* renamed from: f */
    public final /* synthetic */ int f58709f;

    /* renamed from: g */
    public final /* synthetic */ Dialog f58710g;

    public /* synthetic */ C12219c(MacroLogFilterActivity macroLogFilterActivity, EditText editText, String str, int i, Dialog dialog) {
        this.f58706a = macroLogFilterActivity;
        this.f58707c = editText;
        this.f58708d = str;
        this.f58709f = i;
        this.f58710g = dialog;
    }

    public final void onClick(View view) {
        MacroLogFilterActivity.m18931o2(this.f58706a, this.f58707c, this.f58708d, this.f58709f, this.f58710g, view);
    }
}

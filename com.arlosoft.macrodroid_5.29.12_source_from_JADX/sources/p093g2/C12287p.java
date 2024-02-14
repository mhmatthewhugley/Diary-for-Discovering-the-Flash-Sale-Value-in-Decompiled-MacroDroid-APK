package p093g2;

import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.macrolist.MacroListFragment;

/* renamed from: g2.p */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12287p implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MacroListFragment f58938a;

    /* renamed from: c */
    public final /* synthetic */ EditText f58939c;

    /* renamed from: d */
    public final /* synthetic */ Macro f58940d;

    /* renamed from: f */
    public final /* synthetic */ Spinner f58941f;

    /* renamed from: g */
    public final /* synthetic */ EditText f58942g;

    /* renamed from: o */
    public final /* synthetic */ AppCompatDialog f58943o;

    public /* synthetic */ C12287p(MacroListFragment macroListFragment, EditText editText, Macro macro, Spinner spinner, EditText editText2, AppCompatDialog appCompatDialog) {
        this.f58938a = macroListFragment;
        this.f58939c = editText;
        this.f58940d = macro;
        this.f58941f = spinner;
        this.f58942g = editText2;
        this.f58943o = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f58938a.m19135S1(this.f58939c, this.f58940d, this.f58941f, this.f58942g, this.f58943o, view);
    }
}

package p093g2;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.macrolist.MacroListFragment;

/* renamed from: g2.s */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12290s implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MacroListFragment f58950a;

    /* renamed from: c */
    public final /* synthetic */ Macro f58951c;

    /* renamed from: d */
    public final /* synthetic */ EditText f58952d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f58953f;

    public /* synthetic */ C12290s(MacroListFragment macroListFragment, Macro macro, EditText editText, AppCompatDialog appCompatDialog) {
        this.f58950a = macroListFragment;
        this.f58951c = macro;
        this.f58952d = editText;
        this.f58953f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f58950a.m19164f2(this.f58951c, this.f58952d, this.f58953f, view);
    }
}

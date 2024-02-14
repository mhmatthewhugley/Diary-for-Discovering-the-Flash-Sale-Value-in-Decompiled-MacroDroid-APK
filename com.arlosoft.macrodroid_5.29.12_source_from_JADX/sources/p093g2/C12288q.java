package p093g2;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.macrolist.MacroListFragment;

/* renamed from: g2.q */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12288q implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MacroListFragment f58944a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f58945c;

    /* renamed from: d */
    public final /* synthetic */ EditText f58946d;

    /* renamed from: f */
    public final /* synthetic */ String f58947f;

    public /* synthetic */ C12288q(MacroListFragment macroListFragment, AppCompatDialog appCompatDialog, EditText editText, String str) {
        this.f58944a = macroListFragment;
        this.f58945c = appCompatDialog;
        this.f58946d = editText;
        this.f58947f = str;
    }

    public final void onClick(View view) {
        this.f58944a.m19169h2(this.f58945c, this.f58946d, this.f58947f, view);
    }
}

package p236d4;

import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.wizard.WizardActivity;

/* renamed from: d4.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11943h implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ WizardActivity f58125a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f58126c;

    /* renamed from: d */
    public final /* synthetic */ EditText f58127d;

    /* renamed from: f */
    public final /* synthetic */ Spinner f58128f;

    public /* synthetic */ C11943h(WizardActivity wizardActivity, AppCompatDialog appCompatDialog, EditText editText, Spinner spinner) {
        this.f58125a = wizardActivity;
        this.f58126c = appCompatDialog;
        this.f58127d = editText;
        this.f58128f = spinner;
    }

    public final void onClick(View view) {
        this.f58125a.m25161j2(this.f58126c, this.f58127d, this.f58128f, view);
    }
}

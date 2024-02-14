package p236d4;

import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.wizard.WizardActivity;

/* renamed from: d4.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11942g implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ WizardActivity f58121a;

    /* renamed from: c */
    public final /* synthetic */ Spinner f58122c;

    /* renamed from: d */
    public final /* synthetic */ EditText f58123d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f58124f;

    public /* synthetic */ C11942g(WizardActivity wizardActivity, Spinner spinner, EditText editText, AppCompatDialog appCompatDialog) {
        this.f58121a = wizardActivity;
        this.f58122c = spinner;
        this.f58123d = editText;
        this.f58124f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f58121a.m25158g2(this.f58122c, this.f58123d, this.f58124f, view);
    }
}

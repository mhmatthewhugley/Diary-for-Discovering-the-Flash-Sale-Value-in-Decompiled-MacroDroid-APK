package p183w2;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.stopwatch.StopWatchesActivity;

/* renamed from: w2.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C17497h implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ StopWatchesActivity f69302a;

    /* renamed from: c */
    public final /* synthetic */ EditText f69303c;

    /* renamed from: d */
    public final /* synthetic */ String f69304d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f69305f;

    public /* synthetic */ C17497h(StopWatchesActivity stopWatchesActivity, EditText editText, String str, AppCompatDialog appCompatDialog) {
        this.f69302a = stopWatchesActivity;
        this.f69303c = editText;
        this.f69304d = str;
        this.f69305f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f69302a.m20363i2(this.f69303c, this.f69304d, this.f69305f, view);
    }
}

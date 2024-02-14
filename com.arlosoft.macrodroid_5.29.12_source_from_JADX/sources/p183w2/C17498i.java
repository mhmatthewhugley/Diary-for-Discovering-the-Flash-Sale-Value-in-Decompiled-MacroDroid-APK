package p183w2;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.stopwatch.StopWatchesActivity;
import java.util.List;

/* renamed from: w2.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C17498i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ StopWatchesActivity f69306a;

    /* renamed from: c */
    public final /* synthetic */ EditText f69307c;

    /* renamed from: d */
    public final /* synthetic */ List f69308d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f69309f;

    public /* synthetic */ C17498i(StopWatchesActivity stopWatchesActivity, EditText editText, List list, AppCompatDialog appCompatDialog) {
        this.f69306a = stopWatchesActivity;
        this.f69307c = editText;
        this.f69308d = list;
        this.f69309f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f69306a.m20360f2(this.f69307c, this.f69308d, this.f69309f, view);
    }
}

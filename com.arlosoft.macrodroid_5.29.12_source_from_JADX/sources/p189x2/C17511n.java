package p189x2;

import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.util.Pair;
import com.arlosoft.macrodroid.common.SelectableItem;

/* renamed from: x2.n */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C17511n implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ RadioButton f69331a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f69332c;

    /* renamed from: d */
    public final /* synthetic */ Pair f69333d;

    /* renamed from: f */
    public final /* synthetic */ CheckBox f69334f;

    /* renamed from: g */
    public final /* synthetic */ SelectableItem f69335g;

    /* renamed from: o */
    public final /* synthetic */ AppCompatDialog f69336o;

    public /* synthetic */ C17511n(RadioButton radioButton, RadioButton radioButton2, Pair pair, CheckBox checkBox, SelectableItem selectableItem, AppCompatDialog appCompatDialog) {
        this.f69331a = radioButton;
        this.f69332c = radioButton2;
        this.f69333d = pair;
        this.f69334f = checkBox;
        this.f69335g = selectableItem;
        this.f69336o = appCompatDialog;
    }

    public final void onClick(View view) {
        C10375p.m40698g(this.f69331a, this.f69332c, this.f69333d, this.f69334f, this.f69335g, this.f69336o, view);
    }
}

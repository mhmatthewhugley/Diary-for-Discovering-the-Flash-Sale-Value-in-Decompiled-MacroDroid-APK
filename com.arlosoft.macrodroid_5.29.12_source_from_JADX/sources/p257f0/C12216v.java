package p257f0;

import android.view.View;
import com.arlosoft.macrodroid.action.activities.VariableValuePrompt;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import java.util.ArrayList;

/* renamed from: f0.v */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12216v implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ VariableValuePrompt f58699a;

    /* renamed from: c */
    public final /* synthetic */ MacroDroidVariable f58700c;

    /* renamed from: d */
    public final /* synthetic */ int f58701d;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f58702f;

    /* renamed from: g */
    public final /* synthetic */ int f58703g;

    public /* synthetic */ C12216v(VariableValuePrompt variableValuePrompt, MacroDroidVariable macroDroidVariable, int i, ArrayList arrayList, int i2) {
        this.f58699a = variableValuePrompt;
        this.f58700c = macroDroidVariable;
        this.f58701d = i;
        this.f58702f = arrayList;
        this.f58703g = i2;
    }

    public final void onClick(View view) {
        this.f58699a.m14015X1(this.f58700c, this.f58701d, this.f58702f, this.f58703g, view);
    }
}

package p257f0;

import android.view.View;
import com.arlosoft.macrodroid.action.activities.ConfirmDialogActivity;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Stack;

/* renamed from: f0.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12199e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ConfirmDialogActivity f58651a;

    /* renamed from: c */
    public final /* synthetic */ TriggerContextInfo f58652c;

    /* renamed from: d */
    public final /* synthetic */ Macro f58653d;

    /* renamed from: f */
    public final /* synthetic */ boolean f58654f;

    /* renamed from: g */
    public final /* synthetic */ Trigger f58655g;

    /* renamed from: o */
    public final /* synthetic */ int f58656o;

    /* renamed from: p */
    public final /* synthetic */ boolean f58657p;

    /* renamed from: s */
    public final /* synthetic */ Stack f58658s;

    /* renamed from: z */
    public final /* synthetic */ ResumeMacroInfo f58659z;

    public /* synthetic */ C12199e(ConfirmDialogActivity confirmDialogActivity, TriggerContextInfo triggerContextInfo, Macro macro, boolean z, Trigger trigger, int i, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo) {
        this.f58651a = confirmDialogActivity;
        this.f58652c = triggerContextInfo;
        this.f58653d = macro;
        this.f58654f = z;
        this.f58655g = trigger;
        this.f58656o = i;
        this.f58657p = z2;
        this.f58658s = stack;
        this.f58659z = resumeMacroInfo;
    }

    public final void onClick(View view) {
        this.f58651a.m13919N1(this.f58652c, this.f58653d, this.f58654f, this.f58655g, this.f58656o, this.f58657p, this.f58658s, this.f58659z, view);
    }
}

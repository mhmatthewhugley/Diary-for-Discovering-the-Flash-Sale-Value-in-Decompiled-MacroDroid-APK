package p257f0;

import android.view.View;
import com.arlosoft.macrodroid.action.activities.MessageDialogActivity;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Stack;

/* renamed from: f0.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12202h implements View.OnClickListener {

    /* renamed from: A */
    public final /* synthetic */ ResumeMacroInfo f58662A;

    /* renamed from: a */
    public final /* synthetic */ MessageDialogActivity f58663a;

    /* renamed from: c */
    public final /* synthetic */ boolean f58664c;

    /* renamed from: d */
    public final /* synthetic */ TriggerContextInfo f58665d;

    /* renamed from: f */
    public final /* synthetic */ Macro f58666f;

    /* renamed from: g */
    public final /* synthetic */ boolean f58667g;

    /* renamed from: o */
    public final /* synthetic */ Trigger f58668o;

    /* renamed from: p */
    public final /* synthetic */ int f58669p;

    /* renamed from: s */
    public final /* synthetic */ boolean f58670s;

    /* renamed from: z */
    public final /* synthetic */ Stack f58671z;

    public /* synthetic */ C12202h(MessageDialogActivity messageDialogActivity, boolean z, TriggerContextInfo triggerContextInfo, Macro macro, boolean z2, Trigger trigger, int i, boolean z3, Stack stack, ResumeMacroInfo resumeMacroInfo) {
        this.f58663a = messageDialogActivity;
        this.f58664c = z;
        this.f58665d = triggerContextInfo;
        this.f58666f = macro;
        this.f58667g = z2;
        this.f58668o = trigger;
        this.f58669p = i;
        this.f58670s = z3;
        this.f58671z = stack;
        this.f58662A = resumeMacroInfo;
    }

    public final void onClick(View view) {
        this.f58663a.m13928M1(this.f58664c, this.f58665d, this.f58666f, this.f58667g, this.f58668o, this.f58669p, this.f58670s, this.f58671z, this.f58662A, view);
    }
}

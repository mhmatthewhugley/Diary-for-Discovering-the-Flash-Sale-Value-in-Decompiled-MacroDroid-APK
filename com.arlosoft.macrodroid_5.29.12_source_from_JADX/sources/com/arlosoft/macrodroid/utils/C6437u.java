package com.arlosoft.macrodroid.utils;

import android.content.Context;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.action.DisableMacroAction;
import com.arlosoft.macrodroid.action.ForceMacroRunAction;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16265l;

/* renamed from: com.arlosoft.macrodroid.utils.u */
/* compiled from: DeleteMacroHelper.kt */
public final class C6437u {

    /* renamed from: com.arlosoft.macrodroid.utils.u$a */
    /* compiled from: DeleteMacroHelper.kt */
    static final class C6438a extends C13708q implements C16265l<Macro, CharSequence> {

        /* renamed from: a */
        public static final C6438a f15064a = new C6438a();

        C6438a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(Macro macro) {
            C13706o.m87929f(macro, "m");
            return String.valueOf(macro.getName());
        }
    }

    /* renamed from: a */
    public static final String m24740a(Context context, Macro macro) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(macro, "thisMacro");
        List<Macro> z = C4934n.m18998M().mo29710z();
        ArrayList arrayList = new ArrayList();
        for (Macro actions : z) {
            Iterator<Action> it = actions.getActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Action next = it.next();
                if (next instanceof ForceMacroRunAction) {
                    ForceMacroRunAction forceMacroRunAction = (ForceMacroRunAction) next;
                    if (forceMacroRunAction.mo25116C3() == macro.getGUID()) {
                        Macro X0 = forceMacroRunAction.mo27837X0();
                        C13706o.m87928e(X0, "action.macro");
                        arrayList.add(X0);
                        break;
                    }
                }
                if (next instanceof DisableMacroAction) {
                    DisableMacroAction disableMacroAction = (DisableMacroAction) next;
                    if (disableMacroAction.mo24971s3() == macro.getGUID()) {
                        Macro X02 = disableMacroAction.mo27837X0();
                        C13706o.m87928e(X02, "action.macro");
                        arrayList.add(X02);
                        break;
                    }
                }
            }
        }
        if (!(!arrayList.isEmpty())) {
            return "";
        }
        String g0 = C13566b0.m87432g0(C13566b0.m87451z0(arrayList, 4), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C6438a.f15064a, 31, (Object) null);
        C13696i0 i0Var = C13696i0.f61931a;
        String format = String.format(context.getString(C17541R$string.warning_other_macros_reference_this_macro) + "\n\n", Arrays.copyOf(new Object[]{g0}, 1));
        C13706o.m87928e(format, "format(format, *args)");
        return format;
    }
}

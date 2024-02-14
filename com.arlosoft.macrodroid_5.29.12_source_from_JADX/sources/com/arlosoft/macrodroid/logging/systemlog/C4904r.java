package com.arlosoft.macrodroid.logging.systemlog;

import android.text.Html;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.database.room.C4402h;
import com.arlosoft.macrodroid.database.room.C4403i;
import com.arlosoft.macrodroid.database.room.SystemLogEntry;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import p139o1.C8022q0;
import p352oe.C15861e;
import p374qe.C16310b;

/* renamed from: com.arlosoft.macrodroid.logging.systemlog.r */
/* compiled from: SystemLogViewHolder.kt */
public final class C4904r extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final C8022q0 f12326a;

    /* renamed from: b */
    private final C4876a f12327b;

    /* renamed from: c */
    private final SimpleDateFormat f12328c = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());

    /* renamed from: d */
    private final SimpleDateFormat f12329d = new SimpleDateFormat("EEEE d MMMM y");

    /* renamed from: e */
    private final C16310b f12330e = C16310b.m97930g("EEEE d MMMM y");

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.r$a */
    /* compiled from: SystemLogViewHolder.kt */
    public /* synthetic */ class C4905a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12331a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f12332b;

        static {
            int[] iArr = new int[C4402h.values().length];
            iArr[C4402h.TRIGGER.ordinal()] = 1;
            iArr[C4402h.ACTION.ordinal()] = 2;
            iArr[C4402h.CONSTRAINT.ordinal()] = 3;
            iArr[C4402h.LOCAL_VARIABLE.ordinal()] = 4;
            iArr[C4402h.GLOBAL_VARIABLE.ordinal()] = 5;
            f12331a = iArr;
            int[] iArr2 = new int[C4403i.values().length];
            iArr2[C4403i.VERBOSE.ordinal()] = 1;
            iArr2[C4403i.WARNING.ordinal()] = 2;
            iArr2[C4403i.ERROR.ordinal()] = 3;
            iArr2[C4403i.DEBUG.ordinal()] = 4;
            f12332b = iArr2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4904r(C8022q0 q0Var, C4876a aVar) {
        super(q0Var.getRoot());
        C13706o.m87929f(q0Var, "binding");
        C13706o.m87929f(aVar, "macroMovementMethod");
        this.f12326a = q0Var;
        this.f12327b = aVar;
    }

    /* renamed from: u */
    private final void m18954u(SystemLogEntry systemLogEntry) {
        int i = C4905a.f12331a[systemLogEntry.mo28683a().ordinal()];
        if (i == 1) {
            C8022q0 q0Var = this.f12326a;
            q0Var.f19417f.setTextColor(ContextCompat.getColor(q0Var.getRoot().getContext(), C17528R$color.log_text_trigger));
        } else if (i == 2) {
            C8022q0 q0Var2 = this.f12326a;
            q0Var2.f19417f.setTextColor(ContextCompat.getColor(q0Var2.getRoot().getContext(), C17528R$color.log_text_action));
        } else if (i == 3) {
            C8022q0 q0Var3 = this.f12326a;
            q0Var3.f19417f.setTextColor(ContextCompat.getColor(q0Var3.getRoot().getContext(), C17528R$color.log_text_action_constraint_fail));
        } else if (i == 4 || i == 5) {
            C8022q0 q0Var4 = this.f12326a;
            q0Var4.f19417f.setTextColor(ContextCompat.getColor(q0Var4.getRoot().getContext(), C17528R$color.log_variable));
        } else {
            m18955v(systemLogEntry);
        }
    }

    /* renamed from: v */
    private final void m18955v(SystemLogEntry systemLogEntry) {
        int i = C4905a.f12332b[systemLogEntry.mo28686d().ordinal()];
        if (i == 1) {
            C8022q0 q0Var = this.f12326a;
            q0Var.f19417f.setTextColor(ContextCompat.getColor(q0Var.getRoot().getContext(), C17528R$color.log_detailed));
        } else if (i == 2) {
            C8022q0 q0Var2 = this.f12326a;
            q0Var2.f19417f.setTextColor(ContextCompat.getColor(q0Var2.getRoot().getContext(), C17528R$color.log_text_warning));
        } else if (i == 3) {
            C8022q0 q0Var3 = this.f12326a;
            q0Var3.f19417f.setTextColor(ContextCompat.getColor(q0Var3.getRoot().getContext(), C17528R$color.log_text_error));
        } else if (i != 4) {
            C8022q0 q0Var4 = this.f12326a;
            q0Var4.f19417f.setTextColor(ContextCompat.getColor(q0Var4.getRoot().getContext(), C17528R$color.default_text_color));
        } else {
            C8022q0 q0Var5 = this.f12326a;
            q0Var5.f19417f.setTextColor(ContextCompat.getColor(q0Var5.getRoot().getContext(), C17528R$color.log_debug));
        }
    }

    /* renamed from: w */
    private final String m18956w(String str, boolean z) {
        String str2;
        if (str.length() < 25) {
            str2 = str;
        } else {
            StringBuilder sb = new StringBuilder();
            String substring = str.substring(0, 23);
            C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append("..");
            str2 = sb.toString();
        }
        if (!z) {
            str2 = "<b>" + str2 + "</b>";
        }
        try {
            return "<a href=\"macrodroid://www.macrodroid.com/macro/" + URLEncoder.encode(str, "UTF-8") + "\">" + str2 + "</a>";
        } catch (Exception unused) {
            return "<a href=\"macrodroid://www.macrodroid.com/macro/" + str + "\">" + str2 + "</a>";
        }
    }

    /* renamed from: x */
    private final String m18957x(String str) {
        return "<a href=\"" + str + "\">" + str + "</a>";
    }

    /* renamed from: t */
    public final void mo29497t(SystemLogEntry systemLogEntry, C15861e eVar, boolean z, float f, boolean z2) {
        C13706o.m87929f(systemLogEntry, "logEntry");
        this.f12326a.f19418g.setTextSize(f - ((float) 2));
        this.f12326a.f19417f.setTextSize(f);
        this.f12326a.f19418g.setText(this.f12328c.format(new Date(systemLogEntry.mo28691g())));
        String e = systemLogEntry.mo28688e();
        if (systemLogEntry.mo28692h() != null) {
            e = systemLogEntry.mo28692h() + ' ' + e;
        }
        if (systemLogEntry.mo28690f() == 0 || systemLogEntry.mo28683a() == C4402h.GLOBAL_VARIABLE) {
            String i = systemLogEntry.mo28694i();
            if (i != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(e);
                sb.append(". ");
                C13696i0 i0Var = C13696i0.f61931a;
                String string = this.f12326a.getRoot().getContext().getString(C17541R$string.system_log_please_see_link);
                C13706o.m87928e(string, "binding.root.context.get…stem_log_please_see_link)");
                String format = String.format(string, Arrays.copyOf(new Object[]{m18957x(i)}, 1));
                C13706o.m87928e(format, "format(format, *args)");
                sb.append(format);
                e = sb.toString();
            }
        } else {
            Macro Q = C4934n.m18998M().mo29682Q(systemLogEntry.mo28690f());
            if (Q != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e);
                sb2.append(' ');
                String name = Q.getName();
                C13706o.m87928e(name, "macro.name");
                sb2.append(m18956w(name, z2));
                e = sb2.toString();
            }
        }
        this.f12326a.f19417f.setText(Html.fromHtml(e));
        this.f12326a.f19417f.setMovementMethod(this.f12327b);
        if (eVar == null) {
            LinearLayout linearLayout = this.f12326a.f19413b;
            C13706o.m87928e(linearLayout, "binding.dateHeader");
            linearLayout.setVisibility(8);
            LinearLayout linearLayout2 = this.f12326a.f19414c;
            C13706o.m87928e(linearLayout2, "binding.dateHeaderBottom");
            linearLayout2.setVisibility(8);
        } else if (z) {
            LinearLayout linearLayout3 = this.f12326a.f19414c;
            C13706o.m87928e(linearLayout3, "binding.dateHeaderBottom");
            linearLayout3.setVisibility(0);
            LinearLayout linearLayout4 = this.f12326a.f19413b;
            C13706o.m87928e(linearLayout4, "binding.dateHeader");
            linearLayout4.setVisibility(8);
            this.f12326a.f19416e.setText(eVar.mo75717x(this.f12330e));
        } else {
            LinearLayout linearLayout5 = this.f12326a.f19413b;
            C13706o.m87928e(linearLayout5, "binding.dateHeader");
            linearLayout5.setVisibility(0);
            LinearLayout linearLayout6 = this.f12326a.f19414c;
            C13706o.m87928e(linearLayout6, "binding.dateHeaderBottom");
            linearLayout6.setVisibility(8);
            this.f12326a.f19415d.setText(eVar.mo75717x(this.f12330e));
        }
        m18954u(systemLogEntry);
    }
}

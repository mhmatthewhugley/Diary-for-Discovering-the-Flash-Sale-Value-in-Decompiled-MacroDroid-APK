package com.arlosoft.macrodroid.templatestore.reportmacro;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.templatestore.reportmacro.C5240c;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import org.apache.http.cookie.ClientCookie;
import p139o1.C8010k0;
import p139o1.C8012l0;
import p139o1.C8014m0;

/* renamed from: com.arlosoft.macrodroid.templatestore.reportmacro.b */
/* compiled from: ReportMacroActivity.kt */
public final class C5235b extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: b */
    public static final C5237b f13062b = new C5237b((C13695i) null);

    /* renamed from: a */
    private final List<C5240c> f13063a;

    /* renamed from: com.arlosoft.macrodroid.templatestore.reportmacro.b$a */
    /* compiled from: ReportMacroActivity.kt */
    public static final class C5236a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final C8010k0 f13064a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5236a(C8010k0 k0Var) {
            super(k0Var.getRoot());
            C13706o.m87929f(k0Var, "binding");
            this.f13064a = k0Var;
        }

        /* renamed from: t */
        public final void mo30377t(C5240c.C5241a aVar) {
            C13706o.m87929f(aVar, ClientCookie.COMMENT_ATTR);
            this.f13064a.f19327b.setText(aVar.mo30380a());
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.reportmacro.b$b */
    /* compiled from: ReportMacroActivity.kt */
    public static final class C5237b {
        private C5237b() {
        }

        public /* synthetic */ C5237b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.reportmacro.b$c */
    /* compiled from: ReportMacroActivity.kt */
    public static final class C5238c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final C8012l0 f13065a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5238c(C8012l0 l0Var) {
            super(l0Var.getRoot());
            C13706o.m87929f(l0Var, "binding");
            this.f13065a = l0Var;
        }

        /* renamed from: t */
        public final void mo30378t(C5240c.C5242b bVar) {
            C13706o.m87929f(bVar, "reasonCodeWithCount");
            C8012l0 l0Var = this.f13065a;
            TextView textView = l0Var.f19335c;
            Resources resources = l0Var.getRoot().getResources();
            int b = bVar.mo30385b();
            textView.setText(resources.getString(b != 0 ? b != 1 ? b != 2 ? b != 3 ? C17541R$string.report_macro_reason_exact_copy : C17541R$string.report_macro_reason_bad_language_offensive : C17541R$string.report_macro_reason_non_functional : C17541R$string.report_macro_reason_trivial_macro : C17541R$string.report_macro_reason_spam));
            this.f13065a.f19334b.setText(String.valueOf(bVar.mo30384a()));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.reportmacro.b$d */
    /* compiled from: ReportMacroActivity.kt */
    public static final class C5239d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final C8014m0 f13066a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5239d(C8014m0 m0Var) {
            super(m0Var.getRoot());
            C13706o.m87929f(m0Var, "binding");
            this.f13066a = m0Var;
        }

        /* renamed from: t */
        public final void mo30379t(C5240c.C5243c cVar) {
            String str;
            C13706o.m87929f(cVar, "summary");
            this.f13066a.f19355c.setText(String.valueOf(cVar.mo30390b()));
            this.f13066a.f19354b.setText(String.valueOf(cVar.mo30389a()));
            TextView textView = this.f13066a.f19356d;
            if (cVar.mo30389a() == 0) {
                str = "NA";
            } else {
                C13696i0 i0Var = C13696i0.f61931a;
                str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((float) cVar.mo30390b()) / ((float) cVar.mo30389a()))}, 1));
                C13706o.m87928e(str, "format(format, *args)");
            }
            textView.setText(str);
        }
    }

    public C5235b(List<? extends C5240c> list) {
        C13706o.m87929f(list, "entries");
        this.f13063a = list;
        setHasStableIds(true);
    }

    public int getItemCount() {
        return this.f13063a.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        C5240c cVar = this.f13063a.get(i);
        if (cVar instanceof C5240c.C5243c) {
            return 0;
        }
        return cVar instanceof C5240c.C5242b ? 1 : 2;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C13706o.m87929f(viewHolder, "holder");
        if (viewHolder instanceof C5239d) {
            C5240c cVar = this.f13063a.get(i);
            C13706o.m87927d(cVar, "null cannot be cast to non-null type com.arlosoft.macrodroid.templatestore.reportmacro.ReportEntry.Summary");
            ((C5239d) viewHolder).mo30379t((C5240c.C5243c) cVar);
        } else if (viewHolder instanceof C5238c) {
            C5240c cVar2 = this.f13063a.get(i);
            C13706o.m87927d(cVar2, "null cannot be cast to non-null type com.arlosoft.macrodroid.templatestore.reportmacro.ReportEntry.ReasonCodeWithCount");
            ((C5238c) viewHolder).mo30378t((C5240c.C5242b) cVar2);
        } else if (viewHolder instanceof C5236a) {
            C5240c cVar3 = this.f13063a.get(i);
            C13706o.m87927d(cVar3, "null cannot be cast to non-null type com.arlosoft.macrodroid.templatestore.reportmacro.ReportEntry.Comment");
            ((C5236a) viewHolder).mo30377t((C5240c.C5241a) cVar3);
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        if (i == 0) {
            C8014m0 c = C8014m0.m33372c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C13706o.m87928e(c, "inflate(LayoutInflater.f….context), parent, false)");
            return new C5239d(c);
        } else if (i != 1) {
            C8010k0 c2 = C8010k0.m33358c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C13706o.m87928e(c2, "inflate(LayoutInflater.f….context), parent, false)");
            return new C5236a(c2);
        } else {
            C8012l0 c3 = C8012l0.m33365c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C13706o.m87928e(c3, "inflate(LayoutInflater.f….context), parent, false)");
            return new C5238c(c3);
        }
    }
}

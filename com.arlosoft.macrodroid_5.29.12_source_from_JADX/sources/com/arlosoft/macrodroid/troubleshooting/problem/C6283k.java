package com.arlosoft.macrodroid.troubleshooting.problem;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.editscreen.EditMacroActivity;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import org.apmem.tools.layouts.FlowLayout;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.k */
/* compiled from: ProblemsListAdapter.kt */
public final class C6283k extends RecyclerView.Adapter<C6284a> {

    /* renamed from: a */
    private final List<C6255c> f14823a;

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.k$a */
    /* compiled from: ProblemsListAdapter.kt */
    public static final class C6284a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final int f14824a;

        /* renamed from: b */
        private final int f14825b;

        /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.k$a$a */
        /* compiled from: ProblemsListAdapter.kt */
        static final class C6285a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            final /* synthetic */ C6255c $problem;
            int label;
            final /* synthetic */ C6284a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6285a(C6255c cVar, C6284a aVar, C13635d<? super C6285a> dVar) {
                super(3, dVar);
                this.$problem = cVar;
                this.this$0 = aVar;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C6285a(this.$problem, this.this$0, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C6255c cVar = this.$problem;
                    Context context = this.this$0.itemView.getContext();
                    C13706o.m87927d(context, "null cannot be cast to non-null type android.app.Activity");
                    cVar.mo32283f((Activity) context);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.k$a$b */
        /* compiled from: ProblemsListAdapter.kt */
        static final class C6286b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            final /* synthetic */ C6255c $problem;
            int label;
            final /* synthetic */ C6284a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6286b(C6255c cVar, C6284a aVar, C13635d<? super C6286b> dVar) {
                super(3, dVar);
                this.$problem = cVar;
                this.this$0 = aVar;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C6286b(this.$problem, this.this$0, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C6255c cVar = this.$problem;
                    Context context = this.this$0.itemView.getContext();
                    C13706o.m87927d(context, "null cannot be cast to non-null type android.app.Activity");
                    cVar.mo32284g((Activity) context);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6284a(View view) {
            super(view);
            C13706o.m87929f(view, "itemView");
            this.f14824a = view.getContext().getResources().getDimensionPixelOffset(C17529R$dimen.margin_small);
            this.f14825b = view.getContext().getResources().getDimensionPixelOffset(C17529R$dimen.margin_micro);
        }

        /* access modifiers changed from: private */
        /* renamed from: v */
        public static final void m24401v(C6284a aVar, Macro macro, View view) {
            C13706o.m87929f(aVar, "this$0");
            C13706o.m87929f(macro, "$macro");
            Intent intent = new Intent(aVar.itemView.getContext(), EditMacroActivity.class);
            intent.putExtra("MacroId", macro.getId());
            aVar.itemView.getContext().startActivity(intent);
        }

        /* renamed from: u */
        public final void mo32291u(C6255c cVar) {
            C13706o.m87929f(cVar, "problem");
            Context context = this.itemView.getContext();
            C13706o.m87928e(context, "itemView.context");
            ((TextView) this.itemView.findViewById(C17532R$id.problemDescription)).setText(cVar.mo32280c(context));
            Context context2 = this.itemView.getContext();
            C13706o.m87928e(context2, "itemView.context");
            String e = cVar.mo32282e(context2);
            if (e != null) {
                View view = this.itemView;
                int i = C17532R$id.problemTitle;
                ((TextView) view.findViewById(i)).setText(e);
                TextView textView = (TextView) this.itemView.findViewById(i);
                C13706o.m87928e(textView, "itemView.problemTitle");
                textView.setVisibility(0);
            } else {
                TextView textView2 = (TextView) this.itemView.findViewById(C17532R$id.problemTitle);
                C13706o.m87928e(textView2, "itemView.problemTitle");
                textView2.setVisibility(8);
            }
            if (cVar.mo32279b() == null) {
                Button button = (Button) this.itemView.findViewById(C17532R$id.configureButton);
                C13706o.m87928e(button, "itemView.configureButton");
                button.setVisibility(8);
            } else {
                View view2 = this.itemView;
                int i2 = C17532R$id.configureButton;
                Button button2 = (Button) view2.findViewById(i2);
                C13706o.m87928e(button2, "itemView.configureButton");
                button2.setVisibility(0);
                ((Button) this.itemView.findViewById(i2)).setText(this.itemView.getContext().getString(cVar.mo32279b().intValue()));
                Button button3 = (Button) this.itemView.findViewById(i2);
                C13706o.m87928e(button3, "itemView.configureButton");
                C4666m.m18147o(button3, (C13640g) null, new C6285a(cVar, this, (C13635d<? super C6285a>) null), 1, (Object) null);
            }
            if (cVar.mo32278a() == null) {
                Button button4 = (Button) this.itemView.findViewById(C17532R$id.configureButton2);
                C13706o.m87928e(button4, "itemView.configureButton2");
                button4.setVisibility(8);
            } else {
                View view3 = this.itemView;
                int i3 = C17532R$id.configureButton2;
                Button button5 = (Button) view3.findViewById(i3);
                C13706o.m87928e(button5, "itemView.configureButton2");
                button5.setVisibility(0);
                ((Button) this.itemView.findViewById(i3)).setText(this.itemView.getContext().getString(cVar.mo32278a().intValue()));
                Button button6 = (Button) this.itemView.findViewById(i3);
                C13706o.m87928e(button6, "itemView.configureButton2");
                C4666m.m18147o(button6, (C13640g) null, new C6286b(cVar, this, (C13635d<? super C6286b>) null), 1, (Object) null);
            }
            for (Macro next : cVar.mo32281d()) {
                TextView textView3 = new TextView(this.itemView.getContext());
                textView3.setText(next.getName());
                textView3.setTextColor(-1);
                textView3.setTextSize(12.0f);
                textView3.setPaintFlags(textView3.getPaintFlags() | 8);
                int i4 = this.f14824a;
                int i5 = this.f14825b;
                textView3.setPadding(i4, i5, i4, i5);
                ((FlowLayout) this.itemView.findViewById(C17532R$id.macroList)).addView(textView3, -2, -2);
                textView3.setOnClickListener(new C6282j(this, next));
            }
        }
    }

    public C6283k(List<? extends C6255c> list) {
        C13706o.m87929f(list, "problemList");
        this.f14823a = list;
    }

    /* renamed from: B */
    public void onBindViewHolder(C6284a aVar, int i) {
        C13706o.m87929f(aVar, "holder");
        aVar.mo32291u(this.f14823a.get(i));
    }

    /* renamed from: C */
    public C6284a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.troubleshooting_problem, viewGroup, false);
        C13706o.m87928e(inflate, "from(parent.context).inf…g_problem, parent, false)");
        return new C6284a(inflate);
    }

    public int getItemCount() {
        return this.f14823a.size();
    }
}

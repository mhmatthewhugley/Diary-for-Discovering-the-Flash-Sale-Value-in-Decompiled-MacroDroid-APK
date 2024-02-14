package com.arlosoft.macrodroid.actionblock.list;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.action.IfConditionAction;
import com.arlosoft.macrodroid.action.LoopAction;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.utils.C6416p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import org.apmem.tools.layouts.FlowLayout;
import p139o1.C8020p0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.actionblock.list.s */
/* compiled from: ActionBlockAdapter.kt */
public final class C3771s extends RecyclerView.ViewHolder {

    /* renamed from: h */
    public static final C3772a f9852h = new C3772a((C13695i) null);

    /* renamed from: a */
    private final C8020p0 f9853a;

    /* renamed from: b */
    private final boolean f9854b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3751b f9855c;

    /* renamed from: d */
    private final int f9856d;

    /* renamed from: e */
    private final int f9857e;

    /* renamed from: f */
    private final int f9858f;

    /* renamed from: g */
    private final int f9859g;

    /* renamed from: com.arlosoft.macrodroid.actionblock.list.s$a */
    /* compiled from: ActionBlockAdapter.kt */
    public static final class C3772a {
        private C3772a() {
        }

        public /* synthetic */ C3772a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.list.s$b */
    /* compiled from: ActionBlockAdapter.kt */
    static final class C3773b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ ActionBlock $actionBlock;
        int label;
        final /* synthetic */ C3771s this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3773b(C3771s sVar, ActionBlock actionBlock, C13635d<? super C3773b> dVar) {
            super(3, dVar);
            this.this$0 = sVar;
            this.$actionBlock = actionBlock;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3773b(this.this$0, this.$actionBlock, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.f9855c.mo27235b(this.$actionBlock);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.list.s$c */
    /* compiled from: ActionBlockAdapter.kt */
    static final class C3774c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ ActionBlock $actionBlock;
        int label;
        final /* synthetic */ C3771s this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3774c(C3771s sVar, ActionBlock actionBlock, C13635d<? super C3774c> dVar) {
            super(3, dVar);
            this.this$0 = sVar;
            this.$actionBlock = actionBlock;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3774c(this.this$0, this.$actionBlock, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.f9855c.mo27236e(this.$actionBlock);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3771s(C8020p0 p0Var, boolean z, C3751b bVar) {
        super(p0Var.getRoot());
        C13706o.m87929f(p0Var, "binding");
        C13706o.m87929f(bVar, "actionBlockClickListener");
        this.f9853a = p0Var;
        this.f9854b = z;
        this.f9855c = bVar;
        this.f9856d = p0Var.f19398b.getResources().getColor(2131101114);
        this.f9857e = p0Var.f19398b.getResources().getColor(C17528R$color.action_block_link);
        this.f9858f = p0Var.f19398b.getResources().getDimensionPixelSize(C17529R$dimen.margin_small);
        this.f9859g = p0Var.f19398b.getResources().getDimensionPixelSize(C17529R$dimen.margin_micro);
    }

    /* renamed from: w */
    private final void m14779w(ActionBlock actionBlock, TextView textView) {
        int c;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        textView.setMaxLines(C5163j2.m19947D0(this.itemView.getContext()));
        ArrayList<Action> actions = actionBlock.getActions();
        if (actionBlock.getActions().size() > 0) {
            int i = 0;
            while (i < 99) {
                if (actions.size() > i) {
                    Action action = actions.get(i);
                    CharSequence V0 = action.mo24875V0();
                    if (action.mo27822G1()) {
                        spannableStringBuilder.append(V0);
                    } else {
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append(V0);
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.itemView.getContext(), C17528R$color.disabled_action_color)), length, spannableStringBuilder.length(), 33);
                    }
                    if (!(action instanceof IfConditionAction) ? !(!(action instanceof LoopAction) || (c = C6416p0.m24706c(actions, i)) < 0) : (c = C6416p0.m24705b(actions, i)) >= 0) {
                        i = c;
                    }
                    if (i < actionBlock.getActions().size() - 1 && i < 98) {
                        spannableStringBuilder.append(", ");
                    }
                }
                i++;
            }
            textView.setText(spannableStringBuilder);
            return;
        }
        textView.setText(C17541R$string.none);
    }

    /* renamed from: x */
    private final void m14780x(ActionBlock actionBlock, FlowLayout flowLayout, Map<String, ? extends ArrayList<Macro>> map) {
        flowLayout.removeAllViews();
        ArrayList arrayList = (ArrayList) map.get(actionBlock.getName());
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Macro macro = (Macro) it.next();
                TextView textView = new TextView(flowLayout.getContext());
                textView.setText(macro.getName());
                textView.setTextColor(macro.isActionBlock ? this.f9857e : this.f9856d);
                textView.setTextSize(12.0f);
                textView.setPaintFlags(textView.getPaintFlags() | 8);
                int i = this.f9858f;
                int i2 = this.f9859g;
                textView.setPadding(i, i2, i, i2);
                flowLayout.addView(textView, -2, -2);
                textView.setOnClickListener(new C3770r(this, macro));
            }
            return;
        }
        TextView textView2 = new TextView(flowLayout.getContext());
        textView2.setText('(' + flowLayout.getContext().getString(C17541R$string.not_used) + ')');
        textView2.setTextSize(12.0f);
        textView2.setTextColor(this.f9856d);
        int i3 = this.f9858f;
        int i4 = this.f9859g;
        textView2.setPadding(i3, i4, i3, i4);
        flowLayout.addView(textView2);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static final void m14781y(C3771s sVar, Macro macro, View view) {
        C13706o.m87929f(sVar, "this$0");
        C13706o.m87929f(macro, "$macro");
        sVar.f9855c.mo27234a(macro);
    }

    /* renamed from: v */
    public final void mo27266v(ActionBlock actionBlock, Map<String, ? extends ArrayList<Macro>> map) {
        C13706o.m87929f(actionBlock, "actionBlock");
        C13706o.m87929f(map, "actionBlockMacroMap");
        this.f9853a.f19405i.setText(actionBlock.getName());
        TextView textView = this.f9853a.f19402f;
        C13706o.m87928e(textView, "binding.description");
        String description = actionBlock.getDescription();
        textView.setVisibility((description == null || description.length() == 0) ^ true ? 0 : 8);
        this.f9853a.f19402f.setText(actionBlock.getDescription());
        LinearLayout linearLayout = this.f9853a.f19398b;
        C13706o.m87928e(linearLayout, "binding.actionBlockContainer");
        C4666m.m18147o(linearLayout, (C13640g) null, new C3773b(this, actionBlock, (C13635d<? super C3773b>) null), 1, (Object) null);
        LinearLayout linearLayout2 = this.f9853a.f19398b;
        C13706o.m87928e(linearLayout2, "binding.actionBlockContainer");
        C4666m.m18152t(linearLayout2, (C13640g) null, false, new C3774c(this, actionBlock, (C13635d<? super C3774c>) null), 3, (Object) null);
        TextView textView2 = this.f9853a.f19399c;
        C13706o.m87928e(textView2, "binding.actionsList");
        m14779w(actionBlock, textView2);
        if (this.f9854b) {
            FlowLayout flowLayout = this.f9853a.f19406j;
            C13706o.m87928e(flowLayout, "binding.usedInList");
            flowLayout.setVisibility(0);
            View view = this.f9853a.f19401e;
            C13706o.m87928e(view, "binding.bottomSpace");
            view.setVisibility(8);
            FlowLayout flowLayout2 = this.f9853a.f19406j;
            C13706o.m87928e(flowLayout2, "binding.usedInList");
            m14780x(actionBlock, flowLayout2, map);
            return;
        }
        FlowLayout flowLayout3 = this.f9853a.f19406j;
        C13706o.m87928e(flowLayout3, "binding.usedInList");
        flowLayout3.setVisibility(8);
        View view2 = this.f9853a.f19401e;
        C13706o.m87928e(view2, "binding.bottomSpace");
        view2.setVisibility(0);
    }
}

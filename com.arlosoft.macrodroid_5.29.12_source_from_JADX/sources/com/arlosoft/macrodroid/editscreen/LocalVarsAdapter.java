package com.arlosoft.macrodroid.editscreen;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.actionblock.edit.C3740z;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16270q;

/* compiled from: LocalVarsAdapter.kt */
public final class LocalVarsAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    private final boolean f11606a;

    /* renamed from: b */
    private final boolean f11607b;

    /* renamed from: c */
    private final Resources f11608c;

    /* renamed from: d */
    private final boolean f11609d;

    /* renamed from: e */
    private final C16265l<MacroDroidVariable, C13339u> f11610e;

    /* renamed from: f */
    private final C3740z f11611f;

    /* renamed from: g */
    private List<MacroDroidVariable> f11612g;

    /* compiled from: LocalVarsAdapter.kt */
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final boolean f11613a;

        /* renamed from: b */
        private final Resources f11614b;

        /* renamed from: c */
        private final boolean f11615c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C16265l<MacroDroidVariable, C13339u> f11616d;
        @BindView(2131363112)
        public ImageView icon;
        @BindView(2131362908)
        public TextView iconText;
        @BindView(2131364065)
        public ViewGroup mainContainer;
        @BindView(2131363113)
        public TextView name;
        @BindView(2131363110)
        public TextView value;

        /* renamed from: com.arlosoft.macrodroid.editscreen.LocalVarsAdapter$ViewHolder$a */
        /* compiled from: LocalVarsAdapter.kt */
        static final class C4592a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            final /* synthetic */ MacroDroidVariable $variable;
            int label;
            final /* synthetic */ ViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4592a(ViewHolder viewHolder, MacroDroidVariable macroDroidVariable, C13635d<? super C4592a> dVar) {
                super(3, dVar);
                this.this$0 = viewHolder;
                this.$variable = macroDroidVariable;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C4592a(this.this$0, this.$variable, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.f11616d.invoke(this.$variable);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view, boolean z, Resources resources, boolean z2, C16265l<? super MacroDroidVariable, C13339u> lVar) {
            super(view);
            C13706o.m87929f(view, "itemView");
            C13706o.m87929f(resources, "resources");
            C13706o.m87929f(lVar, "clickListener");
            this.f11613a = z;
            this.f11614b = resources;
            this.f11615c = z2;
            this.f11616d = lVar;
            ButterKnife.bind((Object) this, view);
            int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(C17529R$dimen.edit_entry_horizontal_padding);
            mo29012x().setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            mo29011w().setVisibility(0);
        }

        /* renamed from: u */
        public final void mo29009u(MacroDroidVariable macroDroidVariable) {
            int i;
            String str;
            String str2;
            String str3;
            C13706o.m87929f(macroDroidVariable, "variable");
            mo29013y().setText(macroDroidVariable.getName());
            C4666m.m18147o(mo29012x(), (C13640g) null, new C4592a(this, macroDroidVariable, (C13635d<? super C4592a>) null), 1, (Object) null);
            if (this.f11615c) {
                mo29010v().setBackgroundResource(C17530R$drawable.circular_icon_background_action_dark);
            } else {
                mo29010v().setBackgroundResource(C17530R$drawable.circular_icon_background_local_variable_dark);
            }
            ImageView v = mo29010v();
            if (macroDroidVariable.mo27751a0()) {
                i = C17530R$drawable.ic_dictionary;
            } else {
                i = macroDroidVariable.mo27748X() ? C17530R$drawable.ic_code_brackets : 0;
            }
            v.setImageResource(i);
            if (macroDroidVariable.mo27749Y()) {
                str = this.f11614b.getString(macroDroidVariable.mo27762j() ? C17541R$string.true_label : C17541R$string.false_label);
            } else {
                str = macroDroidVariable.mo27769m0();
            }
            C13706o.m87928e(str, "if (variable.isBoolean) …MagicText()\n            }");
            if (macroDroidVariable.mo27751a0() || macroDroidVariable.mo27748X()) {
                C13696i0 i0Var = C13696i0.f61931a;
                String string = this.f11614b.getString(C17541R$string.variable_multi_entry_num_entries);
                C13706o.m87928e(string, "resources.getString(R.st…_multi_entry_num_entries)");
                str2 = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(macroDroidVariable.mo27770n().getEntries().size())}, 1));
                C13706o.m87928e(str2, "format(format, *args)");
            } else {
                if (str.length() == 0) {
                    str2 = '<' + this.itemView.getContext().getString(C17541R$string.empty) + '>';
                } else {
                    str2 = macroDroidVariable.mo27769m0();
                }
            }
            TextView z = mo29014z();
            if (this.f11615c) {
                C13696i0 i0Var2 = C13696i0.f61931a;
                String string2 = this.itemView.getContext().getString(C17541R$string.action_block_variable_default_value);
                C13706o.m87928e(string2, "itemView.context.getStri…k_variable_default_value)");
                str2 = String.format(string2, Arrays.copyOf(new Object[]{str2}, 1));
                C13706o.m87928e(str2, "format(format, *args)");
            }
            z.setText(str2);
            TextView w = mo29011w();
            if (macroDroidVariable.mo27749Y()) {
                String string3 = this.itemView.getContext().getString(C17541R$string.bool);
                C13706o.m87928e(string3, "itemView.context.getString(R.string.bool)");
                str3 = String.valueOf(C15182y.m93713V0(string3));
            } else if (macroDroidVariable.mo27750Z()) {
                String string4 = this.itemView.getContext().getString(C17541R$string.decimal);
                C13706o.m87928e(string4, "itemView.context.getString(R.string.decimal)");
                str3 = String.valueOf(C15182y.m93713V0(string4));
            } else if (macroDroidVariable.mo27753b0()) {
                String string5 = this.itemView.getContext().getString(C17541R$string.integer);
                C13706o.m87928e(string5, "itemView.context.getString(R.string.integer)");
                str3 = String.valueOf(C15182y.m93713V0(string5));
            } else if (macroDroidVariable.mo27756d0()) {
                String string6 = this.itemView.getContext().getString(C17541R$string.string);
                C13706o.m87928e(string6, "itemView.context.getString(R.string.string)");
                str3 = String.valueOf(C15182y.m93713V0(string6));
            } else {
                str3 = "";
            }
            w.setText(str3);
        }

        /* renamed from: v */
        public final ImageView mo29010v() {
            ImageView imageView = this.icon;
            if (imageView != null) {
                return imageView;
            }
            C13706o.m87945v("icon");
            return null;
        }

        /* renamed from: w */
        public final TextView mo29011w() {
            TextView textView = this.iconText;
            if (textView != null) {
                return textView;
            }
            C13706o.m87945v("iconText");
            return null;
        }

        /* renamed from: x */
        public final ViewGroup mo29012x() {
            ViewGroup viewGroup = this.mainContainer;
            if (viewGroup != null) {
                return viewGroup;
            }
            C13706o.m87945v("mainContainer");
            return null;
        }

        /* renamed from: y */
        public final TextView mo29013y() {
            TextView textView = this.name;
            if (textView != null) {
                return textView;
            }
            C13706o.m87945v("name");
            return null;
        }

        /* renamed from: z */
        public final TextView mo29014z() {
            TextView textView = this.value;
            if (textView != null) {
                return textView;
            }
            C13706o.m87945v("value");
            return null;
        }
    }

    public final class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f11617a;

        @UiThread
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f11617a = viewHolder;
            viewHolder.name = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.macro_edit_entry_name, "field 'name'", TextView.class);
            viewHolder.value = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.macro_edit_entry_detail, "field 'value'", TextView.class);
            viewHolder.mainContainer = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.topLevelContainer, "field 'mainContainer'", ViewGroup.class);
            viewHolder.icon = (ImageView) Utils.findRequiredViewAsType(view, C17532R$id.macro_edit_entry_icon, "field 'icon'", ImageView.class);
            viewHolder.iconText = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.iconText, "field 'iconText'", TextView.class);
        }

        public void unbind() {
            ViewHolder viewHolder = this.f11617a;
            if (viewHolder != null) {
                this.f11617a = null;
                viewHolder.name = null;
                viewHolder.value = null;
                viewHolder.mainContainer = null;
                viewHolder.icon = null;
                viewHolder.iconText = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.LocalVarsAdapter$a */
    /* compiled from: LocalVarsAdapter.kt */
    public /* synthetic */ class C4593a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11618a;

        static {
            int[] iArr = new int[C3740z.values().length];
            iArr[C3740z.INPUT.ordinal()] = 1;
            iArr[C3740z.OUTPUT.ordinal()] = 2;
            iArr[C3740z.LOCAL_WORKING_VAR.ordinal()] = 3;
            f11618a = iArr;
        }
    }

    public LocalVarsAdapter(Macro macro, boolean z, boolean z2, Resources resources, boolean z3, C16265l<? super MacroDroidVariable, C13339u> lVar, C3740z zVar) {
        int i;
        List<MacroDroidVariable> list;
        C13706o.m87929f(macro, "macro");
        C13706o.m87929f(resources, "resources");
        C13706o.m87929f(lVar, "clickListener");
        this.f11606a = z;
        this.f11607b = z2;
        this.f11608c = resources;
        this.f11609d = z3;
        this.f11610e = lVar;
        this.f11611f = zVar;
        if (zVar == null) {
            i = -1;
        } else {
            i = C4593a.f11618a[zVar.ordinal()];
        }
        if (i == -1) {
            list = macro.getLocalVariablesSorted();
            C13706o.m87928e(list, "macro.localVariablesSorted");
        } else if (i == 1) {
            list = macro.getInputOnlyActionBlockVariables(true);
            C13706o.m87928e(list, "macro.getInputOnlyActionBlockVariables(true)");
        } else if (i == 2) {
            list = macro.getOutputOnlyActionBlockVariables(true);
            C13706o.m87928e(list, "macro.getOutputOnlyActionBlockVariables(true)");
        } else if (i == 3) {
            list = macro.getActionBlockWorkingVariables(true);
            C13706o.m87928e(list, "macro.getActionBlockWorkingVariables(true)");
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f11612g = list;
    }

    /* renamed from: B */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        C13706o.m87929f(viewHolder, "holder");
        viewHolder.mo29009u(this.f11612g.get(i));
    }

    /* renamed from: C */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f11606a ? C17535R$layout.macro_edit_entry_small : C17535R$layout.macro_edit_entry, viewGroup, false);
        C13706o.m87928e(inflate, "from(parent.context).inf…te(layout, parent, false)");
        return new ViewHolder(inflate, this.f11607b, this.f11608c, this.f11609d, this.f11610e);
    }

    public int getItemCount() {
        return this.f11612g.size();
    }
}

package com.arlosoft.macrodroid.actionblock.edit;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p038md.C2034f;
import p139o1.C8000f0;

/* renamed from: com.arlosoft.macrodroid.actionblock.edit.y */
/* compiled from: ActionBlockOutputVarAdapter.kt */
public final class C3738y extends RecyclerView.Adapter<C3739a> {

    /* renamed from: a */
    private final List<MacroDroidVariable> f9797a;

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.y$a */
    /* compiled from: ActionBlockOutputVarAdapter.kt */
    public static final class C3739a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final C8000f0 f9798a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3739a(C8000f0 f0Var) {
            super(f0Var.getRoot());
            C13706o.m87929f(f0Var, "binding");
            this.f9798a = f0Var;
        }

        /* renamed from: t */
        public final void mo27224t(MacroDroidVariable macroDroidVariable) {
            C13706o.m87929f(macroDroidVariable, "variable");
            this.f9798a.f19266c.setText(macroDroidVariable.getName());
            if (macroDroidVariable.toString().length() == 0) {
                TextView textView = this.f9798a.f19268e;
                C13706o.m87928e(textView, "binding.value");
                C2034f.m8419a(textView, ContextCompat.getColor(this.f9798a.getRoot().getContext(), C17528R$color.white_transparent));
                C8000f0 f0Var = this.f9798a;
                f0Var.f19268e.setText(f0Var.getRoot().getContext().getString(C17541R$string.empty));
                return;
            }
            TextView textView2 = this.f9798a.f19268e;
            C13706o.m87928e(textView2, "binding.value");
            C2034f.m8419a(textView2, ContextCompat.getColor(this.f9798a.getRoot().getContext(), 2131101114));
            this.f9798a.f19268e.setText(macroDroidVariable.toString());
        }
    }

    public C3738y(List<MacroDroidVariable> list) {
        C13706o.m87929f(list, "varsList");
        this.f9797a = list;
    }

    /* renamed from: B */
    public void onBindViewHolder(C3739a aVar, int i) {
        C13706o.m87929f(aVar, "holder");
        aVar.mo27224t(this.f9797a.get(i));
    }

    /* renamed from: C */
    public C3739a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        C8000f0 c = C8000f0.m33323c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C13706o.m87928e(c, "inflate(LayoutInflater.f….context), parent, false)");
        return new C3739a(c);
    }

    public int getItemCount() {
        return this.f9797a.size();
    }
}

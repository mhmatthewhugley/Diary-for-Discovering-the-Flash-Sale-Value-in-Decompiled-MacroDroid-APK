package com.arlosoft.macrodroid.logging.systemlog.variablefilter;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.logging.systemlog.variablefilter.C4907a;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import org.jetbrains.anko.sdk27.coroutines.C16061a;
import p139o1.C8026s0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16271r;

/* renamed from: com.arlosoft.macrodroid.logging.systemlog.variablefilter.b */
/* compiled from: VariableLogFilterAdapter.kt */
public final class C4909b extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final C8026s0 f12343a;

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.variablefilter.b$a */
    /* compiled from: VariableLogFilterAdapter.kt */
    static final class C4910a extends C13665l implements C16271r<C15478k0, CompoundButton, Boolean, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4907a.C4908a $filterChangeListener;
        final /* synthetic */ C4911c $variableWithFilteredState;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4910a(C4907a.C4908a aVar, C4911c cVar, C13635d<? super C4910a> dVar) {
            super(4, dVar);
            this.$filterChangeListener = aVar;
            this.$variableWithFilteredState = cVar;
        }

        /* renamed from: h */
        public final Object mo29503h(C15478k0 k0Var, CompoundButton compoundButton, boolean z, C13635d<? super C13339u> dVar) {
            C4910a aVar = new C4910a(this.$filterChangeListener, this.$variableWithFilteredState, dVar);
            aVar.Z$0 = z;
            return aVar.invokeSuspend(C13339u.f61331a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return mo29503h((C15478k0) obj, (CompoundButton) obj2, ((Boolean) obj3).booleanValue(), (C13635d) obj4);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$filterChangeListener.mo29498a(this.$variableWithFilteredState.mo29504a().getName(), this.Z$0);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4909b(C8026s0 s0Var) {
        super(s0Var.getRoot());
        C13706o.m87929f(s0Var, "binding");
        this.f12343a = s0Var;
    }

    /* renamed from: t */
    public final void mo29502t(C4911c cVar, C4907a.C4908a aVar) {
        C13706o.m87929f(cVar, "variableWithFilteredState");
        C13706o.m87929f(aVar, "filterChangeListener");
        this.f12343a.f19443c.setText(cVar.mo29504a().getName());
        this.f12343a.f19442b.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        this.f12343a.f19442b.setChecked(cVar.mo29505b());
        CheckBox checkBox = this.f12343a.f19442b;
        C13706o.m87928e(checkBox, "binding.filterEnabledCheckbox");
        C16061a.m96671b(checkBox, (C13640g) null, new C4910a(aVar, cVar, (C13635d<? super C4910a>) null), 1, (Object) null);
    }
}

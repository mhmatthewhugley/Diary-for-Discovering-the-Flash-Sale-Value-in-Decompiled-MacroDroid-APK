package com.arlosoft.macrodroid.variables;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p038md.C2034f;
import p139o1.C8018o0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.variables.b */
/* compiled from: DictionaryVariableAdapter.kt */
public final class C6489b extends RecyclerView.Adapter<C6491b> {

    /* renamed from: a */
    private VariableValue.Dictionary f15110a;

    /* renamed from: b */
    private final C6490a f15111b;

    /* renamed from: c */
    private List<VariableValue.DictionaryEntry> f15112c;

    /* renamed from: com.arlosoft.macrodroid.variables.b$a */
    /* compiled from: DictionaryVariableAdapter.kt */
    public interface C6490a {
        /* renamed from: a */
        void mo32679a(VariableValue.DictionaryEntry dictionaryEntry, boolean z);
    }

    /* renamed from: com.arlosoft.macrodroid.variables.b$b */
    /* compiled from: DictionaryVariableAdapter.kt */
    public final class C6491b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final C8018o0 f15113a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C6490a f15114b;

        /* renamed from: c */
        private final boolean f15115c;

        /* renamed from: d */
        final /* synthetic */ C6489b f15116d;

        /* renamed from: com.arlosoft.macrodroid.variables.b$b$a */
        /* compiled from: DictionaryVariableAdapter.kt */
        static final class C6492a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            final /* synthetic */ VariableValue.DictionaryEntry $dictionaryEntry;
            int label;
            final /* synthetic */ C6491b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6492a(C6491b bVar, VariableValue.DictionaryEntry dictionaryEntry, C13635d<? super C6492a> dVar) {
                super(3, dVar);
                this.this$0 = bVar;
                this.$dictionaryEntry = dictionaryEntry;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C6492a(this.this$0, this.$dictionaryEntry, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.f15114b.mo32679a(this.$dictionaryEntry, true);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: com.arlosoft.macrodroid.variables.b$b$b */
        /* compiled from: DictionaryVariableAdapter.kt */
        static final class C6493b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            final /* synthetic */ VariableValue.DictionaryEntry $dictionaryEntry;
            int label;
            final /* synthetic */ C6491b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6493b(C6491b bVar, VariableValue.DictionaryEntry dictionaryEntry, C13635d<? super C6493b> dVar) {
                super(3, dVar);
                this.this$0 = bVar;
                this.$dictionaryEntry = dictionaryEntry;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C6493b(this.this$0, this.$dictionaryEntry, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.f15114b.mo32679a(this.$dictionaryEntry, false);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6491b(C6489b bVar, C8018o0 o0Var, C6490a aVar, boolean z) {
            super(o0Var.getRoot());
            C13706o.m87929f(o0Var, "binding");
            C13706o.m87929f(aVar, "elementSelectedListener");
            this.f15116d = bVar;
            this.f15113a = o0Var;
            this.f15114b = aVar;
            this.f15115c = z;
        }

        /* renamed from: u */
        public final void mo32680u(VariableValue.DictionaryEntry dictionaryEntry) {
            C13706o.m87929f(dictionaryEntry, "dictionaryEntry");
            this.f15113a.f19386c.setText(dictionaryEntry.getKey());
            ViewGroup.LayoutParams layoutParams = this.f15113a.f19386c.getLayoutParams();
            C13706o.m87927d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams).weight = this.f15115c ? 20.0f : 50.0f;
            VariableValue variable = dictionaryEntry.getVariable();
            if (!(variable instanceof VariableValue.Empty)) {
                if (!(variable.getValueAsText().length() == 0)) {
                    this.f15113a.f19388e.setText(variable.getValueAsText());
                    TextView textView = this.f15113a.f19388e;
                    C13706o.m87928e(textView, "binding.value");
                    C2034f.m8419a(textView, ContextCompat.getColor(this.f15113a.getRoot().getContext(), 2131101114));
                    TextView textView2 = this.f15113a.f19386c;
                    C13706o.m87928e(textView2, "binding.key");
                    C4666m.m18147o(textView2, (C13640g) null, new C6492a(this, dictionaryEntry, (C13635d<? super C6492a>) null), 1, (Object) null);
                    TextView textView3 = this.f15113a.f19388e;
                    C13706o.m87928e(textView3, "binding.value");
                    C4666m.m18147o(textView3, (C13640g) null, new C6493b(this, dictionaryEntry, (C13635d<? super C6493b>) null), 1, (Object) null);
                    C8018o0 o0Var = this.f15113a;
                    TextView textView4 = o0Var.f19387d;
                    MacroDroidVariable.C3984b bVar = MacroDroidVariable.f10326c;
                    Context context = o0Var.getRoot().getContext();
                    C13706o.m87928e(context, "binding.root.context");
                    textView4.setText(bVar.mo27786b(context, variable.getVariableType()));
                }
            }
            C8018o0 o0Var2 = this.f15113a;
            o0Var2.f19388e.setText(o0Var2.getRoot().getContext().getText(C17541R$string.empty));
            TextView textView5 = this.f15113a.f19388e;
            C13706o.m87928e(textView5, "binding.value");
            C2034f.m8419a(textView5, ContextCompat.getColor(this.f15113a.getRoot().getContext(), C17528R$color.white_transparent));
            TextView textView22 = this.f15113a.f19386c;
            C13706o.m87928e(textView22, "binding.key");
            C4666m.m18147o(textView22, (C13640g) null, new C6492a(this, dictionaryEntry, (C13635d<? super C6492a>) null), 1, (Object) null);
            TextView textView32 = this.f15113a.f19388e;
            C13706o.m87928e(textView32, "binding.value");
            C4666m.m18147o(textView32, (C13640g) null, new C6493b(this, dictionaryEntry, (C13635d<? super C6493b>) null), 1, (Object) null);
            C8018o0 o0Var3 = this.f15113a;
            TextView textView42 = o0Var3.f19387d;
            MacroDroidVariable.C3984b bVar2 = MacroDroidVariable.f10326c;
            Context context2 = o0Var3.getRoot().getContext();
            C13706o.m87928e(context2, "binding.root.context");
            textView42.setText(bVar2.mo27786b(context2, variable.getVariableType()));
        }
    }

    public C6489b(VariableValue.Dictionary dictionary, C6490a aVar) {
        C13706o.m87929f(dictionary, "dictionary");
        C13706o.m87929f(aVar, "elementSelectedListener");
        this.f15110a = dictionary;
        this.f15111b = aVar;
        this.f15112c = dictionary.getEntriesSorted();
    }

    /* renamed from: B */
    public void onBindViewHolder(C6491b bVar, int i) {
        C13706o.m87929f(bVar, "holder");
        bVar.mo32680u(this.f15112c.get(i));
    }

    /* renamed from: C */
    public C6491b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        C8018o0 c = C8018o0.m33386c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C13706o.m87928e(c, "inflate(LayoutInflater.f….context), parent, false)");
        return new C6491b(this, c, this.f15111b, this.f15110a.isArray());
    }

    /* renamed from: D */
    public final void mo32678D(VariableValue.Dictionary dictionary) {
        C13706o.m87929f(dictionary, "dictionary");
        this.f15110a = dictionary;
        this.f15112c = dictionary.getEntriesSorted();
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f15112c.size();
    }
}

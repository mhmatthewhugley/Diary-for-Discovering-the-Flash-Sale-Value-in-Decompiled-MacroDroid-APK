package com.arlosoft.macrodroid.logcat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.extensions.C4666m;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.logcat.b */
/* compiled from: LogcatMessageAdapter.kt */
public final class C4843b extends RecyclerView.Adapter<C4845b> implements Filterable {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<LogcatMessage> f12195a;

    /* renamed from: c */
    private final C4844a f12196c;

    /* renamed from: d */
    private List<LogcatMessage> f12197d;

    /* renamed from: com.arlosoft.macrodroid.logcat.b$a */
    /* compiled from: LogcatMessageAdapter.kt */
    public interface C4844a {
        /* renamed from: a */
        void mo29380a(LogcatMessage logcatMessage);
    }

    /* renamed from: com.arlosoft.macrodroid.logcat.b$b */
    /* compiled from: LogcatMessageAdapter.kt */
    public static final class C4845b extends RecyclerView.ViewHolder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C4844a f12198a;

        /* renamed from: com.arlosoft.macrodroid.logcat.b$b$a */
        /* compiled from: LogcatMessageAdapter.kt */
        static final class C4846a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            final /* synthetic */ LogcatMessage $logcatMessage;
            int label;
            final /* synthetic */ C4845b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4846a(C4845b bVar, LogcatMessage logcatMessage, C13635d<? super C4846a> dVar) {
                super(3, dVar);
                this.this$0 = bVar;
                this.$logcatMessage = logcatMessage;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C4846a(this.this$0, this.$logcatMessage, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.f12198a.mo29380a(this.$logcatMessage);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4845b(View view, C4844a aVar) {
            super(view);
            C13706o.m87929f(view, "itemView");
            C13706o.m87929f(aVar, "clickListener");
            this.f12198a = aVar;
        }

        /* renamed from: u */
        public final void mo29386u(LogcatMessage logcatMessage) {
            C13706o.m87929f(logcatMessage, "logcatMessage");
            ((TextView) this.itemView.findViewById(C17532R$id.componentName)).setText(logcatMessage.mo29367a());
            ((TextView) this.itemView.findViewById(C17532R$id.message)).setText(logcatMessage.mo29368b());
            LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(C17532R$id.container);
            C13706o.m87928e(linearLayout, "itemView.container");
            C4666m.m18147o(linearLayout, (C13640g) null, new C4846a(this, logcatMessage, (C13635d<? super C4846a>) null), 1, (Object) null);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logcat.b$c */
    /* compiled from: LogcatMessageAdapter.kt */
    public static final class C4847c extends Filter {

        /* renamed from: a */
        final /* synthetic */ C4843b f12199a;

        C4847c(C4843b bVar) {
            this.f12199a = bVar;
        }

        /* access modifiers changed from: protected */
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            List<LogcatMessage> list;
            C13706o.m87929f(charSequence, "constraint");
            if (charSequence.length() == 0) {
                list = this.f12199a.f12195a;
            } else {
                C4843b bVar = this.f12199a;
                String lowerCase = charSequence.toString().toLowerCase();
                C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase()");
                list = bVar.mo29381C(lowerCase);
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = list;
            return filterResults;
        }

        /* access modifiers changed from: protected */
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            C13706o.m87929f(charSequence, "constraint");
            C13706o.m87929f(filterResults, "results");
            C4843b bVar = this.f12199a;
            Object obj = filterResults.values;
            C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.collections.List<com.arlosoft.macrodroid.logcat.LogcatMessage>");
            bVar.mo29384F((List) obj);
            this.f12199a.notifyDataSetChanged();
        }
    }

    public C4843b(List<LogcatMessage> list, C4844a aVar) {
        C13706o.m87929f(list, "logcatList");
        C13706o.m87929f(aVar, "clickListener");
        this.f12195a = list;
        this.f12196c = aVar;
        this.f12197d = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final List<LogcatMessage> mo29381C(String str) {
        C13706o.m87929f(str, "constraint");
        ArrayList arrayList = new ArrayList();
        for (LogcatMessage next : this.f12195a) {
            String lowerCase = next.mo29368b().toLowerCase();
            C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase()");
            if (C15177w.m93663N(lowerCase, str, false, 2, (Object) null)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: D */
    public void onBindViewHolder(C4845b bVar, int i) {
        C13706o.m87929f(bVar, "holder");
        bVar.mo29386u(this.f12197d.get(i));
    }

    /* renamed from: E */
    public C4845b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.item_logcat_message, viewGroup, false);
        C13706o.m87928e(inflate, "from(parent.context).inf…t_message, parent, false)");
        return new C4845b(inflate, this.f12196c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final void mo29384F(List<LogcatMessage> list) {
        C13706o.m87929f(list, "<set-?>");
        this.f12197d = list;
    }

    public Filter getFilter() {
        return new C4847c(this);
    }

    public int getItemCount() {
        return this.f12197d.size();
    }
}

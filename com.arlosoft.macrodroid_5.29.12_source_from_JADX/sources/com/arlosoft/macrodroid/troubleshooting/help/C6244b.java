package com.arlosoft.macrodroid.troubleshooting.help;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.extensions.C4666m;
import java.util.Arrays;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import net.cachapa.expandablelayout.ExpandableLayout;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.troubleshooting.help.b */
/* compiled from: HelpListAdapter.kt */
public final class C6244b extends RecyclerView.Adapter<C6245a> {

    /* renamed from: a */
    private final List<C6225a> f14796a;

    /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.b$a */
    /* compiled from: HelpListAdapter.kt */
    public static final class C6245a extends RecyclerView.ViewHolder {

        /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.b$a$a */
        /* compiled from: HelpListAdapter.kt */
        static final class C6246a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            int label;
            final /* synthetic */ C6245a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6246a(C6245a aVar, C13635d<? super C6246a> dVar) {
                super(3, dVar);
                this.this$0 = aVar;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C6246a(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    View view = this.this$0.itemView;
                    int i = C17532R$id.expandableLayout;
                    boolean g = ((ExpandableLayout) view.findViewById(i)).mo75517g();
                    ((ExpandableLayout) this.this$0.itemView.findViewById(i)).setExpanded(!((ExpandableLayout) this.this$0.itemView.findViewById(i)).mo75517g());
                    ViewPropertyAnimator animate = ((ImageView) this.this$0.itemView.findViewById(C17532R$id.chevron)).animate();
                    animate.setDuration(400);
                    animate.rotation(g ? 0.0f : 90.0f);
                    animate.start();
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.b$a$b */
        /* compiled from: HelpListAdapter.kt */
        static final class C6247b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            final /* synthetic */ C6225a $helpItem;
            int label;
            final /* synthetic */ C6245a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6247b(C6225a aVar, C6245a aVar2, C13635d<? super C6247b> dVar) {
                super(3, dVar);
                this.$helpItem = aVar;
                this.this$0 = aVar2;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C6247b(this.$helpItem, this.this$0, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C6225a aVar = this.$helpItem;
                    Context context = this.this$0.itemView.getContext();
                    C13706o.m87928e(context, "itemView.context");
                    aVar.mo32249g(context);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.b$a$c */
        /* compiled from: HelpListAdapter.kt */
        static final class C6248c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            final /* synthetic */ C6225a $helpItem;
            int label;
            final /* synthetic */ C6245a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6248c(C6225a aVar, C6245a aVar2, C13635d<? super C6248c> dVar) {
                super(3, dVar);
                this.$helpItem = aVar;
                this.this$0 = aVar2;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C6248c(this.$helpItem, this.this$0, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C6225a aVar = this.$helpItem;
                    Context context = this.this$0.itemView.getContext();
                    C13706o.m87928e(context, "itemView.context");
                    aVar.mo32250h(context, 0);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.b$a$d */
        /* compiled from: HelpListAdapter.kt */
        static final class C6249d extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            final /* synthetic */ C6225a $helpItem;
            int label;
            final /* synthetic */ C6245a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6249d(C6225a aVar, C6245a aVar2, C13635d<? super C6249d> dVar) {
                super(3, dVar);
                this.$helpItem = aVar;
                this.this$0 = aVar2;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C6249d(this.$helpItem, this.this$0, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C6225a aVar = this.$helpItem;
                    Context context = this.this$0.itemView.getContext();
                    C13706o.m87928e(context, "itemView.context");
                    aVar.mo32250h(context, 1);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: com.arlosoft.macrodroid.troubleshooting.help.b$a$e */
        /* compiled from: HelpListAdapter.kt */
        static final class C6250e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            final /* synthetic */ C6225a $helpItem;
            int label;
            final /* synthetic */ C6245a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6250e(C6225a aVar, C6245a aVar2, C13635d<? super C6250e> dVar) {
                super(3, dVar);
                this.$helpItem = aVar;
                this.this$0 = aVar2;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C6250e(this.$helpItem, this.this$0, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C6225a aVar = this.$helpItem;
                    Context context = this.this$0.itemView.getContext();
                    C13706o.m87928e(context, "itemView.context");
                    aVar.mo32250h(context, 2);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6245a(View view) {
            super(view);
            C13706o.m87929f(view, "itemView");
        }

        /* renamed from: t */
        public final void mo32255t(C6225a aVar) {
            String str;
            C6225a aVar2 = aVar;
            C13706o.m87929f(aVar2, "helpItem");
            ((TextView) this.itemView.findViewById(C17532R$id.helpDescription)).setText(this.itemView.getContext().getString(aVar.mo32245c()));
            ((TextView) this.itemView.findViewById(C17532R$id.helpTitle)).setText(this.itemView.getContext().getString(aVar.mo32248f()));
            View view = this.itemView;
            int i = C17532R$id.actionButton;
            Button button = (Button) view.findViewById(i);
            C13706o.m87928e(button, "itemView.actionButton");
            int i2 = 0;
            button.setVisibility(aVar.mo32244b() != null && aVar.mo32252j() ? 0 : 8);
            Integer b = aVar.mo32244b();
            if (b != null) {
                ((Button) this.itemView.findViewById(i)).setText(this.itemView.getContext().getString(b.intValue()));
            }
            LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(C17532R$id.helpHeader);
            C13706o.m87928e(linearLayout, "itemView.helpHeader");
            C4666m.m18147o(linearLayout, (C13640g) null, new C6246a(this, (C13635d<? super C6246a>) null), 1, (Object) null);
            Button button2 = (Button) this.itemView.findViewById(i);
            C13706o.m87928e(button2, "itemView.actionButton");
            C4666m.m18147o(button2, (C13640g) null, new C6247b(aVar2, this, (C13635d<? super C6247b>) null), 1, (Object) null);
            Context context = this.itemView.getContext();
            C13706o.m87928e(context, "itemView.context");
            int d = aVar2.mo32246d(context);
            TextView textView = (TextView) this.itemView.findViewById(C17532R$id.optionalLinksDescription);
            C13706o.m87928e(textView, "itemView.optionalLinksDescription");
            textView.setVisibility(d > 0 ? 0 : 8);
            View view2 = this.itemView;
            int i3 = C17532R$id.optionalButton1;
            Button button3 = (Button) view2.findViewById(i3);
            if (d == 1) {
                str = this.itemView.getContext().getString(C17541R$string.troubleshoot_configuration_screen);
            } else {
                C13696i0 i0Var = C13696i0.f61931a;
                String string = this.itemView.getContext().getString(C17541R$string.troubleshoot_configuration_screen_n);
                C13706o.m87928e(string, "itemView.context.getStri…t_configuration_screen_n)");
                str = String.format(string, Arrays.copyOf(new Object[]{1}, 1));
                C13706o.m87928e(str, "format(format, *args)");
            }
            button3.setText(str);
            Button button4 = (Button) this.itemView.findViewById(i3);
            C13706o.m87928e(button4, "itemView.optionalButton1");
            button4.setVisibility(d > 0 ? 0 : 8);
            View view3 = this.itemView;
            int i4 = C17532R$id.optionalButton2;
            C13696i0 i0Var2 = C13696i0.f61931a;
            String string2 = this.itemView.getContext().getString(C17541R$string.troubleshoot_configuration_screen_n);
            C13706o.m87928e(string2, "itemView.context.getStri…t_configuration_screen_n)");
            String format = String.format(string2, Arrays.copyOf(new Object[]{2}, 1));
            C13706o.m87928e(format, "format(format, *args)");
            ((Button) view3.findViewById(i4)).setText(format);
            Button button5 = (Button) this.itemView.findViewById(i4);
            C13706o.m87928e(button5, "itemView.optionalButton2");
            button5.setVisibility(d > 1 ? 0 : 8);
            View view4 = this.itemView;
            int i5 = C17532R$id.optionalButton3;
            String string3 = this.itemView.getContext().getString(C17541R$string.troubleshoot_configuration_screen_n);
            C13706o.m87928e(string3, "itemView.context.getStri…t_configuration_screen_n)");
            String format2 = String.format(string3, Arrays.copyOf(new Object[]{3}, 1));
            C13706o.m87928e(format2, "format(format, *args)");
            ((Button) view4.findViewById(i5)).setText(format2);
            Button button6 = (Button) this.itemView.findViewById(i5);
            C13706o.m87928e(button6, "itemView.optionalButton3");
            if (!(d > 2)) {
                i2 = 8;
            }
            button6.setVisibility(i2);
            Button button7 = (Button) this.itemView.findViewById(i3);
            C13706o.m87928e(button7, "itemView.optionalButton1");
            C4666m.m18147o(button7, (C13640g) null, new C6248c(aVar2, this, (C13635d<? super C6248c>) null), 1, (Object) null);
            Button button8 = (Button) this.itemView.findViewById(i4);
            C13706o.m87928e(button8, "itemView.optionalButton2");
            C4666m.m18147o(button8, (C13640g) null, new C6249d(aVar2, this, (C13635d<? super C6249d>) null), 1, (Object) null);
            Button button9 = (Button) this.itemView.findViewById(i5);
            C13706o.m87928e(button9, "itemView.optionalButton3");
            C4666m.m18147o(button9, (C13640g) null, new C6250e(aVar2, this, (C13635d<? super C6250e>) null), 1, (Object) null);
        }
    }

    public C6244b(List<? extends C6225a> list) {
        C13706o.m87929f(list, "helpItemList");
        this.f14796a = list;
    }

    /* renamed from: B */
    public void onBindViewHolder(C6245a aVar, int i) {
        C13706o.m87929f(aVar, "holder");
        aVar.mo32255t(this.f14796a.get(i));
    }

    /* renamed from: C */
    public C6245a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.troubleshooting_help_item, viewGroup, false);
        C13706o.m87928e(inflate, "from(parent.context).inf…help_item, parent, false)");
        return new C6245a(inflate);
    }

    public int getItemCount() {
        return this.f14796a.size();
    }
}

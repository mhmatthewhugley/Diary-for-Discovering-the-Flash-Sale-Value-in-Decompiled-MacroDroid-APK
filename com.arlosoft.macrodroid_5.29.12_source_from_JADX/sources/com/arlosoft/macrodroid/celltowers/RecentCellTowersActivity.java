package com.arlosoft.macrodroid.celltowers;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.database.C4373a;
import com.arlosoft.macrodroid.events.LogUpdateEvent;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15423h2;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import org.apmem.tools.layouts.FlowLayout;
import p135n1.C7964a;
import p135n1.C7965b;
import p161s1.C10180a;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16269p;
import p455ag.C17105a;

/* compiled from: RecentCellTowersActivity.kt */
public final class RecentCellTowersActivity extends MacroDroidBaseActivity {
    @BindView(2131362665)
    public ViewGroup emptyView;
    @BindView(2131362961)
    public CardView infoCard;
    @BindView(2131362962)
    public TextView infoCardDetail;
    @BindView(2131362963)
    public Button infoCardGotit;
    @BindView(2131362964)
    public TextView infoCardTitle;
    @BindView(2131363059)
    public ViewGroup loadingView;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C4373a f10178o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public RecentTowersAdapter f10179p;
    @BindView(2131363593)
    public RecyclerView recyclerView;

    /* renamed from: s */
    public Map<Integer, View> f10180s = new LinkedHashMap();

    /* compiled from: RecentCellTowersActivity.kt */
    public static final class RecentTowersAdapter extends RecyclerView.Adapter<ViewHolder> implements Filterable {

        /* renamed from: A */
        private final String f10181A;

        /* renamed from: B */
        private Set<String> f10182B;

        /* renamed from: a */
        private final RecentCellTowersActivity f10183a;

        /* renamed from: c */
        private final C4373a f10184c;

        /* renamed from: d */
        private List<? extends C7965b> f10185d;

        /* renamed from: f */
        private final SimpleDateFormat f10186f = new SimpleDateFormat("HH:mm");

        /* renamed from: g */
        private final List<C7964a> f10187g;

        /* renamed from: o */
        private final int f10188o;

        /* renamed from: p */
        private final int f10189p;

        /* renamed from: s */
        private final int f10190s;

        /* renamed from: z */
        private final int f10191z;

        /* compiled from: RecentCellTowersActivity.kt */
        public final class ViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a */
            final /* synthetic */ RecentTowersAdapter f10192a;
            @BindView(2131362201)
            public CardView cellTowerCard;
            @BindView(2131362197)
            public TextView cellTowerId;
            @BindView(2131362817)
            public FlowLayout flowLayout;
            @BindView(2131362870)
            public ViewGroup headerBg;
            @BindView(2131362928)
            public TextView ignoredLabel;
            @BindView(2131362206)
            public TextView time;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public ViewHolder(RecentTowersAdapter recentTowersAdapter, View view) {
                super(view);
                C13706o.m87929f(view, "itemView");
                this.f10192a = recentTowersAdapter;
                ButterKnife.bind((Object) this, view);
            }

            /* renamed from: t */
            public final CardView mo27605t() {
                CardView cardView = this.cellTowerCard;
                if (cardView != null) {
                    return cardView;
                }
                C13706o.m87945v("cellTowerCard");
                return null;
            }

            /* renamed from: u */
            public final TextView mo27606u() {
                TextView textView = this.cellTowerId;
                if (textView != null) {
                    return textView;
                }
                C13706o.m87945v("cellTowerId");
                return null;
            }

            /* renamed from: v */
            public final FlowLayout mo27607v() {
                FlowLayout flowLayout2 = this.flowLayout;
                if (flowLayout2 != null) {
                    return flowLayout2;
                }
                C13706o.m87945v("flowLayout");
                return null;
            }

            /* renamed from: w */
            public final TextView mo27608w() {
                TextView textView = this.ignoredLabel;
                if (textView != null) {
                    return textView;
                }
                C13706o.m87945v("ignoredLabel");
                return null;
            }

            /* renamed from: x */
            public final TextView mo27609x() {
                TextView textView = this.time;
                if (textView != null) {
                    return textView;
                }
                C13706o.m87945v("time");
                return null;
            }
        }

        public final class ViewHolder_ViewBinding implements Unbinder {

            /* renamed from: a */
            private ViewHolder f10193a;

            @UiThread
            public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
                this.f10193a = viewHolder;
                viewHolder.headerBg = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.header_bg, "field 'headerBg'", ViewGroup.class);
                viewHolder.cellTowerCard = (CardView) Utils.findRequiredViewAsType(view, C17532R$id.cell_tower_record_card, "field 'cellTowerCard'", CardView.class);
                viewHolder.cellTowerId = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.cell_tower_id, "field 'cellTowerId'", TextView.class);
                viewHolder.time = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.cell_tower_time, "field 'time'", TextView.class);
                viewHolder.ignoredLabel = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.ignored_label, "field 'ignoredLabel'", TextView.class);
                viewHolder.flowLayout = (FlowLayout) Utils.findRequiredViewAsType(view, C17532R$id.flow_layout, "field 'flowLayout'", FlowLayout.class);
            }

            public void unbind() {
                ViewHolder viewHolder = this.f10193a;
                if (viewHolder != null) {
                    this.f10193a = null;
                    viewHolder.headerBg = null;
                    viewHolder.cellTowerCard = null;
                    viewHolder.cellTowerId = null;
                    viewHolder.time = null;
                    viewHolder.ignoredLabel = null;
                    viewHolder.flowLayout = null;
                    return;
                }
                throw new IllegalStateException("Bindings already cleared.");
            }
        }

        public RecentTowersAdapter(RecentCellTowersActivity recentCellTowersActivity, C4373a aVar, List<? extends C7965b> list, Set<String> set) {
            C13706o.m87929f(recentCellTowersActivity, "activity");
            C13706o.m87929f(list, "cellTowerRecordList");
            C13706o.m87929f(set, "ignoreCellTowerList");
            this.f10183a = recentCellTowersActivity;
            this.f10184c = aVar;
            setHasStableIds(true);
            this.f10185d = list;
            this.f10182B = set;
            List<C7964a> b = C3932l.m15307e().mo27629b();
            C13706o.m87928e(b, "getInstance().cellTowerGroups");
            this.f10187g = b;
            this.f10188o = ContextCompat.getColor(recentCellTowersActivity, C17528R$color.white_transparent);
            this.f10191z = recentCellTowersActivity.getResources().getDimensionPixelOffset(C17529R$dimen.margin_micro);
            this.f10190s = recentCellTowersActivity.getResources().getDimensionPixelOffset(C17529R$dimen.margin_small);
            String string = recentCellTowersActivity.getString(C17541R$string.no_groups);
            C13706o.m87928e(string, "activity.getString(R.string.no_groups)");
            this.f10181A = string;
            this.f10189p = ContextCompat.getColor(recentCellTowersActivity, C17528R$color.no_groups_color);
        }

        /* access modifiers changed from: private */
        /* renamed from: G */
        public static final void m15293G(RecentTowersAdapter recentTowersAdapter, C7964a aVar, View view) {
            C13706o.m87929f(recentTowersAdapter, "this$0");
            C13706o.m87929f(aVar, "$cellTowerGroup");
            Intent intent = new Intent(recentTowersAdapter.f10183a, CellTowerGroupActivity.class);
            intent.putExtra("CellTowerGroupName", aVar.getName());
            recentTowersAdapter.f10183a.startActivity(intent);
        }

        /* access modifiers changed from: private */
        /* renamed from: H */
        public static final void m15294H(RecentTowersAdapter recentTowersAdapter, C7965b bVar, boolean z, boolean z2, View view) {
            C13706o.m87929f(recentTowersAdapter, "this$0");
            C13706o.m87929f(bVar, "$cellTowerRecord");
            String str = bVar.f19104a;
            C13706o.m87928e(str, "cellTowerRecord.cellId");
            recentTowersAdapter.m15297M(str, z, z2);
        }

        /* renamed from: K */
        private final void m15295K(String str, boolean z) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C7964a next : this.f10187g) {
                if ((!next.contains(str)) && z) {
                    String name = next.getName();
                    C13706o.m87928e(name, "cellTowerGroup.name");
                    arrayList.add(name);
                    arrayList2.add(next);
                } else if (!z && next.contains(str)) {
                    String name2 = next.getName();
                    C13706o.m87928e(name2, "cellTowerGroup.name");
                    arrayList.add(name2);
                    arrayList2.add(next);
                }
            }
            if (arrayList.size() > 0) {
                Object[] array = arrayList.toArray(new String[0]);
                C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                String[] strArr = (String[]) array;
                AlertDialog.Builder builder = new AlertDialog.Builder(this.f10183a, C17542R$style.Theme_App_Dialog_Settings);
                builder.setTitle(z ? C17541R$string.add_to_group : C17541R$string.remove_from_group);
                builder.setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C3921c0(z, arrayList2, str, this));
                AlertDialog create = builder.create();
                C13706o.m87928e(create, "builder.create()");
                create.show();
                return;
            }
            C15626c.makeText(this.f10183a.getApplicationContext(), C17541R$string.no_groups_to_add_to, 0).show();
        }

        /* access modifiers changed from: private */
        /* renamed from: L */
        public static final void m15296L(boolean z, List list, String str, RecentTowersAdapter recentTowersAdapter, DialogInterface dialogInterface, int i) {
            C13706o.m87929f(list, "$groups");
            C13706o.m87929f(str, "$cellId");
            C13706o.m87929f(recentTowersAdapter, "this$0");
            if (z) {
                ((C7964a) list.get(i)).getCellTowerIds().add(str);
                C3932l.m15307e().mo27633h();
            } else {
                ((C7964a) list.get(i)).getCellTowerIds().remove(str);
                C3932l.m15307e().mo27633h();
            }
            recentTowersAdapter.f10183a.refresh();
        }

        /* renamed from: M */
        private final void m15297M(String str, boolean z, boolean z2) {
            String[] strArr;
            String str2;
            if (z) {
                strArr = new String[3];
                String string = this.f10183a.getString(C17541R$string.add_to_group);
                C13706o.m87928e(string, "activity.getString(R.string.add_to_group)");
                strArr[0] = string;
                String string2 = this.f10183a.getString(C17541R$string.remove_from_group);
                C13706o.m87928e(string2, "activity.getString(R.string.remove_from_group)");
                strArr[1] = string2;
                if (z2) {
                    str2 = this.f10183a.getString(C17541R$string.remove_from_global_ignore);
                } else {
                    str2 = this.f10183a.getString(C17541R$string.add_to_global_ignore);
                }
                C13706o.m87928e(str2, "if (isIgnored) activity.…ing.add_to_global_ignore)");
                strArr[2] = str2;
            } else {
                strArr = new String[2];
                String string3 = this.f10183a.getString(C17541R$string.add_to_group);
                C13706o.m87928e(string3, "activity.getString(R.string.add_to_group)");
                strArr[0] = string3;
                String string4 = z2 ? this.f10183a.getString(C17541R$string.remove_from_global_ignore) : this.f10183a.getString(C17541R$string.add_to_global_ignore);
                C13706o.m87928e(string4, "if (isIgnored) activity.…ore\n                    )");
                strArr[1] = string4;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f10183a);
            builder.setTitle((CharSequence) str).setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C3919b0(this, str, z, z2));
            builder.create().show();
        }

        /* access modifiers changed from: private */
        /* renamed from: N */
        public static final void m15298N(RecentTowersAdapter recentTowersAdapter, String str, boolean z, boolean z2, DialogInterface dialogInterface, int i) {
            C13706o.m87929f(recentTowersAdapter, "this$0");
            C13706o.m87929f(str, "$cellTowerId");
            if (i == 0) {
                recentTowersAdapter.m15295K(str, true);
            } else if (i != 1 || !z) {
                C4373a aVar = recentTowersAdapter.f10184c;
                C13706o.m87926c(aVar);
                aVar.mo28651v(str, !z2);
                recentTowersAdapter.f10183a.refresh();
            } else {
                recentTowersAdapter.m15295K(str, false);
            }
        }

        /* renamed from: F */
        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            boolean z;
            C13706o.m87929f(viewHolder, "holder");
            C7965b bVar = (C7965b) this.f10185d.get(i);
            viewHolder.mo27609x().setText(this.f10186f.format(new Date(bVar.f19105b)));
            viewHolder.mo27606u().setText(bVar.f19104a);
            boolean z2 = false;
            if (this.f10182B.contains(bVar.f19104a)) {
                TextView w = viewHolder.mo27608w();
                w.setText('(' + this.f10183a.getString(C17541R$string.ignored) + ')');
                viewHolder.mo27608w().setVisibility(0);
                z = true;
            } else {
                viewHolder.mo27608w().setVisibility(8);
                z = false;
            }
            int i2 = -1;
            viewHolder.mo27609x().setTextColor(z ? this.f10188o : -1);
            viewHolder.mo27606u().setTextColor(z ? this.f10188o : -1);
            viewHolder.mo27607v().removeAllViews();
            if (this.f10187g.size() > 0) {
                for (C7964a next : this.f10187g) {
                    if (next.contains(bVar.f19104a)) {
                        TextView textView = new TextView(this.f10183a);
                        textView.setText(next.getName());
                        textView.setTextSize(12.0f);
                        textView.setTextColor(z ? this.f10188o : -1);
                        textView.setPaintFlags(textView.getPaintFlags() | 8);
                        int i3 = this.f10190s;
                        int i4 = this.f10191z;
                        textView.setPadding(i3, i4, i3, i4);
                        FlowLayout v = viewHolder.mo27607v();
                        C13706o.m87926c(v);
                        v.addView(textView, -2, -2);
                        textView.setOnClickListener(new C3923d0(this, next));
                        z2 = true;
                    }
                }
                if (!z2) {
                    TextView textView2 = new TextView(this.f10183a);
                    textView2.setText(this.f10181A);
                    if (z) {
                        i2 = this.f10188o;
                    }
                    textView2.setTextColor(i2);
                    textView2.setTextSize(12.0f);
                    int i5 = this.f10190s;
                    int i6 = this.f10191z;
                    textView2.setPadding(i5, i6, i5, i6);
                    viewHolder.mo27607v().addView(textView2, -2, -2);
                }
            }
            viewHolder.mo27605t().setOnClickListener(new C3925e0(this, bVar, z2, z));
        }

        /* renamed from: I */
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            C13706o.m87929f(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.list_item_celltower_record, viewGroup, false);
            C13706o.m87928e(inflate, "from(parent.context).inf…er_record, parent, false)");
            return new ViewHolder(this, inflate);
        }

        /* renamed from: J */
        public final void mo27603J(List<? extends C7965b> list, Set<String> set) {
            C13706o.m87929f(list, "cellTowerRecordList");
            C13706o.m87929f(set, "ignoreCellTowerList");
            this.f10185d = list;
            this.f10182B = set;
        }

        public Filter getFilter() {
            return null;
        }

        public int getItemCount() {
            return this.f10185d.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.celltowers.RecentCellTowersActivity$a */
    /* compiled from: RecentCellTowersActivity.kt */
    static final class C3914a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ RecentCellTowersActivity this$0;

        /* renamed from: com.arlosoft.macrodroid.celltowers.RecentCellTowersActivity$a$a */
        /* compiled from: RecentCellTowersActivity.kt */
        static final class C3915a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ Set<String> $ignoreCellTowerList;
            final /* synthetic */ List<C7965b> $recentCellTowerList;
            int label;
            final /* synthetic */ RecentCellTowersActivity this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3915a(RecentCellTowersActivity recentCellTowersActivity, List<C7965b> list, Set<String> set, C13635d<? super C3915a> dVar) {
                super(2, dVar);
                this.this$0 = recentCellTowersActivity;
                this.$recentCellTowerList = list;
                this.$ignoreCellTowerList = set;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C3915a(this.this$0, this.$recentCellTowerList, this.$ignoreCellTowerList, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C3915a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.m15279V1(this.$recentCellTowerList.isEmpty());
                    RecentTowersAdapter S1 = this.this$0.f10179p;
                    RecentTowersAdapter recentTowersAdapter = null;
                    if (S1 == null) {
                        C13706o.m87945v("adapter");
                        S1 = null;
                    }
                    List<C7965b> list = this.$recentCellTowerList;
                    C13706o.m87928e(list, "recentCellTowerList");
                    Set<String> set = this.$ignoreCellTowerList;
                    C13706o.m87928e(set, "ignoreCellTowerList");
                    S1.mo27603J(list, set);
                    RecentTowersAdapter S12 = this.this$0.f10179p;
                    if (S12 == null) {
                        C13706o.m87945v("adapter");
                    } else {
                        recentTowersAdapter = S12;
                    }
                    recentTowersAdapter.notifyDataSetChanged();
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3914a(RecentCellTowersActivity recentCellTowersActivity, C13635d<? super C3914a> dVar) {
            super(2, dVar);
            this.this$0 = recentCellTowersActivity;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C3914a(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C3914a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                long currentTimeMillis = System.currentTimeMillis();
                C4373a T1 = this.this$0.f10178o;
                if (T1 == null) {
                    C13706o.m87945v("m_database");
                    T1 = null;
                }
                List<C7965b> m = T1.mo28644m(System.currentTimeMillis() - ((long) 86400000));
                C4373a T12 = this.this$0.f10178o;
                if (T12 == null) {
                    C13706o.m87945v("m_database");
                    T12 = null;
                }
                Set<String> f = T12.mo28639f();
                long currentTimeMillis2 = System.currentTimeMillis();
                C17105a.m100581c("********* TIME = " + (currentTimeMillis2 - currentTimeMillis) + "ms", new Object[0]);
                C15423h2 c2 = C15186a1.m93731c();
                C3915a aVar = new C3915a(this.this$0, m, f, (C13635d<? super C3915a>) null);
                this.label = 1;
                if (C15414h.m94298g(c2, aVar, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13339u.f61331a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public final void m15279V1(boolean z) {
        mo27598d2().setVisibility(8);
        if (z) {
            mo27593Y1().setVisibility(0);
            mo27599e2().setVisibility(8);
            return;
        }
        mo27593Y1().setVisibility(8);
        mo27599e2().setVisibility(0);
    }

    /* renamed from: W1 */
    private final void m15280W1() {
        if (C5163j2.m19929A6(this)) {
            mo27594Z1().setVisibility(8);
            return;
        }
        mo27594Z1().setCardBackgroundColor(ContextCompat.getColor(this, C17528R$color.cell_towers_primary));
        mo27597c2().setText(C17541R$string.recent_towers);
        mo27595a2().setText(C17541R$string.recent_towers_info);
        mo27596b2().setOnClickListener(new C3917a0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public static final void m15281X1(RecentCellTowersActivity recentCellTowersActivity, View view) {
        C13706o.m87929f(recentCellTowersActivity, "this$0");
        C5163j2.m20050R2(recentCellTowersActivity);
        recentCellTowersActivity.mo27594Z1().setVisibility(8);
    }

    /* access modifiers changed from: private */
    public final void refresh() {
        C15561w1 unused = C15473j.m94492d(LifecycleOwnerKt.getLifecycleScope(this), C15186a1.m93730b(), (C15486m0) null, new C3914a(this, (C13635d<? super C3914a>) null), 2, (Object) null);
    }

    /* renamed from: Y1 */
    public final ViewGroup mo27593Y1() {
        ViewGroup viewGroup = this.emptyView;
        if (viewGroup != null) {
            return viewGroup;
        }
        C13706o.m87945v("emptyView");
        return null;
    }

    /* renamed from: Z1 */
    public final CardView mo27594Z1() {
        CardView cardView = this.infoCard;
        if (cardView != null) {
            return cardView;
        }
        C13706o.m87945v("infoCard");
        return null;
    }

    /* renamed from: a2 */
    public final TextView mo27595a2() {
        TextView textView = this.infoCardDetail;
        if (textView != null) {
            return textView;
        }
        C13706o.m87945v("infoCardDetail");
        return null;
    }

    /* renamed from: b2 */
    public final Button mo27596b2() {
        Button button = this.infoCardGotit;
        if (button != null) {
            return button;
        }
        C13706o.m87945v("infoCardGotit");
        return null;
    }

    /* renamed from: c2 */
    public final TextView mo27597c2() {
        TextView textView = this.infoCardTitle;
        if (textView != null) {
            return textView;
        }
        C13706o.m87945v("infoCardTitle");
        return null;
    }

    /* renamed from: d2 */
    public final ViewGroup mo27598d2() {
        ViewGroup viewGroup = this.loadingView;
        if (viewGroup != null) {
            return viewGroup;
        }
        C13706o.m87945v("loadingView");
        return null;
    }

    /* renamed from: e2 */
    public final RecyclerView mo27599e2() {
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            return recyclerView2;
        }
        C13706o.m87945v("recyclerView");
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_recent_cell_towers);
        ButterKnife.bind((Activity) this);
        C4373a h = C4373a.m17336h();
        C13706o.m87928e(h, "getInstance()");
        this.f10178o = h;
        mo27599e2().setLayoutManager(new LinearLayoutManager(this));
        C4373a aVar = this.f10178o;
        RecentTowersAdapter recentTowersAdapter = null;
        if (aVar == null) {
            C13706o.m87945v("m_database");
            aVar = null;
        }
        this.f10179p = new RecentTowersAdapter(this, aVar, C13614t.m87748j(), C13627z0.m87806d());
        RecyclerView e2 = mo27599e2();
        RecentTowersAdapter recentTowersAdapter2 = this.f10179p;
        if (recentTowersAdapter2 == null) {
            C13706o.m87945v("adapter");
        } else {
            recentTowersAdapter = recentTowersAdapter2;
        }
        e2.setAdapter(recentTowersAdapter);
        C10180a.m40075a().mo80019m(this);
        m15280W1();
        refresh();
    }

    public void onDestroy() {
        C10180a.m40075a().mo80020p(this);
        super.onDestroy();
    }

    public final void onEventMainThread(LogUpdateEvent logUpdateEvent) {
        refresh();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        onBackPressed();
        return true;
    }
}

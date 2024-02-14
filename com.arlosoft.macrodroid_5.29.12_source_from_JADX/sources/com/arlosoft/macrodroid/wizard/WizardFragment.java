package com.arlosoft.macrodroid.wizard;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EdgeEffect;
import android.widget.Filter;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.events.CategoryModeUpdateEvent;
import com.arlosoft.macrodroid.events.FilterEvent;
import com.arlosoft.macrodroid.events.MacroUpdateEvent;
import com.arlosoft.macrodroid.events.SetHelpVisibilityEvent;
import com.arlosoft.macrodroid.events.WizardScrollToTopEvent;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.selectableitemlist.C5096e;
import com.arlosoft.macrodroid.selectableitemlist.C5099g;
import com.arlosoft.macrodroid.selectableitemlist.SelectableItemListItem;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.WidgetPressedTrigger;
import com.arlosoft.macrodroid.utils.C6396j1;
import com.arlosoft.macrodroid.utils.C6415p;
import com.arlosoft.macrodroid.widget.AddSelectableItemInfoCard;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p099h1.C7364d;
import p161s1.C10180a;
import p236d4.C11946k;
import p236d4.C11949n;
import p286i9.C12454b;
import p316l9.C15608g;

/* compiled from: WizardFragment.kt */
public final class WizardFragment extends Fragment implements C5099g, SelectableItemListItem.C5090a {

    /* renamed from: B */
    public static final C6652a f15453B = new C6652a((C13695i) null);

    /* renamed from: A */
    public Map<Integer, View> f15454A = new LinkedHashMap();

    /* renamed from: a */
    private C12454b<C15608g<?>> f15455a;

    /* renamed from: c */
    private WizardItemAdapter f15456c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f15457d;

    /* renamed from: f */
    private Macro f15458f;

    /* renamed from: g */
    private List<C15608g<?>> f15459g;

    /* renamed from: o */
    private boolean f15460o;

    /* renamed from: p */
    private SelectableItem f15461p;
    @BindView(2131363593)
    public RecyclerView recyclerView;

    /* renamed from: s */
    private List<C4001c1> f15462s;

    /* renamed from: z */
    private C5096e f15463z;

    /* renamed from: com.arlosoft.macrodroid.wizard.WizardFragment$a */
    /* compiled from: WizardFragment.kt */
    public static final class C6652a {
        private C6652a() {
        }

        public /* synthetic */ C6652a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final WizardFragment mo32950a(int i) {
            WizardFragment wizardFragment = new WizardFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("itemType", i);
            wizardFragment.setArguments(bundle);
            return wizardFragment;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.wizard.WizardFragment$b */
    /* compiled from: WizardFragment.kt */
    public static final class C6653b extends RecyclerView.EdgeEffectFactory {

        /* renamed from: a */
        final /* synthetic */ WizardFragment f15464a;

        C6653b(WizardFragment wizardFragment) {
            this.f15464a = wizardFragment;
        }

        /* access modifiers changed from: protected */
        public EdgeEffect createEdgeEffect(RecyclerView recyclerView, int i) {
            C13706o.m87929f(recyclerView, "view");
            EdgeEffect edgeEffect = new EdgeEffect(recyclerView.getContext());
            WizardFragment wizardFragment = this.f15464a;
            edgeEffect.setColor(ContextCompat.getColor(wizardFragment.requireContext(), C6415p.m24701c(wizardFragment.f15457d)));
            return edgeEffect;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.wizard.WizardFragment$c */
    /* compiled from: Comparisons.kt */
    public static final class C6654c<T> implements Comparator {

        /* renamed from: a */
        final /* synthetic */ WizardFragment f15465a;

        public C6654c(WizardFragment wizardFragment) {
            this.f15465a = wizardFragment;
        }

        public final int compare(T t, T t2) {
            return C15612b.m94865a(this.f15465a.getString(((C4001c1) t).mo27893k()), this.f15465a.getString(((C4001c1) t2).mo27893k()));
        }
    }

    /* renamed from: e0 */
    private final void m25179e0() {
        Macro macro;
        List<C4001c1> list;
        if (C5163j2.m19964F1(getActivity())) {
            this.f15456c = null;
            m25185r0();
        } else {
            this.f15455a = null;
            FragmentActivity activity = getActivity();
            Macro macro2 = this.f15458f;
            if (macro2 == null) {
                C13706o.m87945v("macro");
                macro = null;
            } else {
                macro = macro2;
            }
            boolean z = !AddSelectableItemInfoCard.m25107h(getActivity(), this.f15457d);
            int i = this.f15457d;
            List<C4001c1> list2 = this.f15462s;
            if (list2 == null) {
                C13706o.m87945v("selectableItemList");
                list = null;
            } else {
                list = list2;
            }
            this.f15456c = new WizardItemAdapter(activity, macro, z, i, list, this);
            mo32940g0().setAdapter(this.f15456c);
            mo32940g0().setHasFixedSize(false);
            mo32940g0().setLayoutManager(new LinearLayoutManager(getActivity()));
        }
        m25183o0();
    }

    /* renamed from: f0 */
    private final List<C7364d> m25180f0() {
        int i = this.f15457d;
        if (i != 0) {
            Macro macro = null;
            if (i != 1) {
                FragmentActivity activity = getActivity();
                C13706o.m87926c(activity);
                Context applicationContext = activity.getApplicationContext();
                Macro macro2 = this.f15458f;
                if (macro2 == null) {
                    C13706o.m87945v("macro");
                } else {
                    macro = macro2;
                }
                List<C7364d> Y2 = Constraint.m16349Y2(applicationContext, macro, true);
                C13706o.m87928e(Y2, "getCategories(activity!!…ationContext, macro,true)");
                return Y2;
            }
            FragmentActivity activity2 = getActivity();
            C13706o.m87926c(activity2);
            Context applicationContext2 = activity2.getApplicationContext();
            Macro macro3 = this.f15458f;
            if (macro3 == null) {
                C13706o.m87945v("macro");
            } else {
                macro = macro3;
            }
            List<C7364d> Z2 = Action.m9595Z2(applicationContext2, macro, false, true);
            C13706o.m87928e(Z2, "getCategories(activity!!…text, macro, false, true)");
            return Z2;
        }
        FragmentActivity activity3 = getActivity();
        C13706o.m87926c(activity3);
        List<C7364d> X2 = Trigger.m23341X2(activity3.getApplicationContext());
        C13706o.m87928e(X2, "getCategories(activity!!.applicationContext)");
        return X2;
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public static final void m25181m0(WizardFragment wizardFragment) {
        C13706o.m87929f(wizardFragment, "this$0");
        wizardFragment.mo32940g0().smoothScrollToPosition(0);
    }

    /* renamed from: n0 */
    private final void m25182n0(List<? extends SelectableItem> list, boolean z) {
        if (z) {
            Iterator<? extends SelectableItem> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((SelectableItem) it.next()) instanceof WidgetPressedTrigger) {
                        m25185r0();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        C5096e eVar = this.f15463z;
        if (eVar == null) {
            C13706o.m87945v("chosenItemsListItem");
            eVar = null;
        }
        eVar.mo30064y(list);
        C12454b<C15608g<?>> bVar = this.f15455a;
        if (bVar != null) {
            bVar.notifyItemChanged(0);
        }
    }

    /* renamed from: o0 */
    private final void m25183o0() {
        WizardItemAdapter wizardItemAdapter;
        Macro macro = null;
        if (C5163j2.m19964F1(getActivity())) {
            int i = this.f15457d;
            if (i == 0) {
                Macro macro2 = this.f15458f;
                if (macro2 == null) {
                    C13706o.m87945v("macro");
                } else {
                    macro = macro2;
                }
                ArrayList<Trigger> triggerList = macro.getTriggerList();
                C13706o.m87928e(triggerList, "macro.triggerList");
                m25182n0(triggerList, true);
            } else if (i == 1) {
                Macro macro3 = this.f15458f;
                if (macro3 == null) {
                    C13706o.m87945v("macro");
                } else {
                    macro = macro3;
                }
                ArrayList<Action> actions = macro.getActions();
                C13706o.m87928e(actions, "macro.actions");
                m25182n0(actions, false);
            } else if (i == 2) {
                Macro macro4 = this.f15458f;
                if (macro4 == null) {
                    C13706o.m87945v("macro");
                } else {
                    macro = macro4;
                }
                List<Constraint> constraints = macro.getConstraints();
                C13706o.m87928e(constraints, "macro.constraints");
                m25182n0(constraints, false);
            }
        } else {
            int i2 = this.f15457d;
            if (i2 == 0) {
                WizardItemAdapter wizardItemAdapter2 = this.f15456c;
                if (wizardItemAdapter2 != null) {
                    List<C4001c1> list = this.f15462s;
                    if (list == null) {
                        C13706o.m87945v("selectableItemList");
                        list = null;
                    }
                    Macro macro5 = this.f15458f;
                    if (macro5 == null) {
                        C13706o.m87945v("macro");
                    } else {
                        macro = macro5;
                    }
                    wizardItemAdapter2.mo32952O(list, macro.getTriggerList());
                }
            } else if (i2 == 1) {
                WizardItemAdapter wizardItemAdapter3 = this.f15456c;
                if (wizardItemAdapter3 != null) {
                    List<C4001c1> list2 = this.f15462s;
                    if (list2 == null) {
                        C13706o.m87945v("selectableItemList");
                        list2 = null;
                    }
                    Macro macro6 = this.f15458f;
                    if (macro6 == null) {
                        C13706o.m87945v("macro");
                    } else {
                        macro = macro6;
                    }
                    wizardItemAdapter3.mo32952O(list2, macro.getActions());
                }
            } else if (i2 == 2 && (wizardItemAdapter = this.f15456c) != null) {
                List<C4001c1> list3 = this.f15462s;
                if (list3 == null) {
                    C13706o.m87945v("selectableItemList");
                    list3 = null;
                }
                Macro macro7 = this.f15458f;
                if (macro7 == null) {
                    C13706o.m87945v("macro");
                } else {
                    macro = macro7;
                }
                wizardItemAdapter.mo32952O(list3, macro.getConstraints());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public static final void m25184p0(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0140  */
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m25185r0() {
        /*
            r22 = this;
            r10 = r22
            androidx.recyclerview.widget.RecyclerView r0 = r22.mo32940g0()
            com.arlosoft.macrodroid.wizard.MacroDroidSmoothScrollStaggeredLayoutManager r1 = new com.arlosoft.macrodroid.wizard.MacroDroidSmoothScrollStaggeredLayoutManager
            androidx.fragment.app.FragmentActivity r2 = r22.getActivity()
            r3 = 2
            r1.<init>(r2, r3)
            r0.setLayoutManager(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f15459g = r0
            com.arlosoft.macrodroid.selectableitemlist.e r0 = new com.arlosoft.macrodroid.selectableitemlist.e
            androidx.fragment.app.FragmentActivity r1 = r22.getActivity()
            kotlin.jvm.internal.C13706o.m87926c(r1)
            com.arlosoft.macrodroid.macro.Macro r2 = r10.f15458f
            java.lang.String r11 = "macro"
            if (r2 != 0) goto L_0x002d
            kotlin.jvm.internal.C13706o.m87945v(r11)
            r2 = 0
        L_0x002d:
            int r3 = r10.f15457d
            r0.<init>(r1, r2, r3)
            r10.f15463z = r0
            java.util.List<l9.g<?>> r1 = r10.f15459g
            r13 = 0
            if (r1 == 0) goto L_0x003c
            r1.add(r13, r0)
        L_0x003c:
            androidx.fragment.app.FragmentActivity r0 = r22.getActivity()
            int r1 = r10.f15457d
            boolean r0 = com.arlosoft.macrodroid.widget.AddSelectableItemInfoCard.m25107h(r0, r1)
            if (r0 != 0) goto L_0x0065
            com.arlosoft.macrodroid.selectableitemlist.h r0 = new com.arlosoft.macrodroid.selectableitemlist.h
            androidx.fragment.app.FragmentActivity r2 = r22.getActivity()
            kotlin.jvm.internal.C13706o.m87926c(r2)
            int r3 = r10.f15457d
            r4 = 0
            d4.l r5 = new d4.l
            r5.<init>(r10)
            r6 = 1
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.List<l9.g<?>> r1 = r10.f15459g
            if (r1 == 0) goto L_0x0065
            r1.add(r13, r0)
        L_0x0065:
            java.util.List r0 = r22.m25180f0()
            java.util.List r14 = r10.m25188v0(r0)
            java.util.Iterator r15 = r14.iterator()
            r0 = 0
            r16 = 0
        L_0x0074:
            boolean r1 = r15.hasNext()
            r9 = 1
            if (r1 == 0) goto L_0x0160
            java.lang.Object r1 = r15.next()
            h1.d r1 = (p099h1.C7364d) r1
            com.arlosoft.macrodroid.selectableitemlist.SelectableItemCategoryHeader r8 = new com.arlosoft.macrodroid.selectableitemlist.SelectableItemCategoryHeader
            int r2 = r0 + 1
            java.util.List r3 = r1.mo37345f()
            java.lang.Object r3 = r3.get(r13)
            com.arlosoft.macrodroid.common.c1 r3 = (com.arlosoft.macrodroid.common.C4001c1) r3
            int r3 = r3.mo26463e()
            r8.<init>(r1, r0, r3)
            r8.mo74945i(r13)
            java.util.List<l9.g<?>> r0 = r10.f15459g
            if (r0 == 0) goto L_0x00a0
            r0.add(r8)
        L_0x00a0:
            java.util.List r0 = r1.mo37345f()
            java.util.Iterator r17 = r0.iterator()
            r3 = r2
        L_0x00a9:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0144
            java.lang.Object r0 = r17.next()
            r4 = r0
            com.arlosoft.macrodroid.common.c1 r4 = (com.arlosoft.macrodroid.common.C4001c1) r4
            boolean r0 = r4 instanceof p119k3.C7514i2
            java.lang.String r1 = "macro.triggerList"
            if (r0 == 0) goto L_0x00e1
            com.arlosoft.macrodroid.macro.Macro r0 = r10.f15458f
            if (r0 != 0) goto L_0x00c4
            kotlin.jvm.internal.C13706o.m87945v(r11)
            r0 = 0
        L_0x00c4:
            java.util.ArrayList r0 = r0.getTriggerList()
            java.util.Iterator r0 = r0.iterator()
        L_0x00cc:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00e1
            java.lang.Object r2 = r0.next()
            kotlin.jvm.internal.C13706o.m87928e(r2, r1)
            com.arlosoft.macrodroid.triggers.Trigger r2 = (com.arlosoft.macrodroid.triggers.Trigger) r2
            boolean r2 = r2 instanceof com.arlosoft.macrodroid.triggers.WidgetPressedTrigger
            if (r2 == 0) goto L_0x00cc
            r0 = 0
            goto L_0x00e2
        L_0x00e1:
            r0 = 1
        L_0x00e2:
            boolean r2 = r4 instanceof p119k3.C7483c
            if (r2 == 0) goto L_0x010a
            com.arlosoft.macrodroid.macro.Macro r2 = r10.f15458f
            if (r2 != 0) goto L_0x00ee
            kotlin.jvm.internal.C13706o.m87945v(r11)
            r2 = 0
        L_0x00ee:
            java.util.ArrayList r2 = r2.getTriggerList()
            java.util.Iterator r2 = r2.iterator()
        L_0x00f6:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x010a
            java.lang.Object r5 = r2.next()
            kotlin.jvm.internal.C13706o.m87928e(r5, r1)
            com.arlosoft.macrodroid.triggers.Trigger r5 = (com.arlosoft.macrodroid.triggers.Trigger) r5
            boolean r5 = r5 instanceof p119k3.C7483c
            if (r5 == 0) goto L_0x00f6
            r0 = 0
        L_0x010a:
            if (r0 == 0) goto L_0x0140
            com.arlosoft.macrodroid.selectableitemlist.SelectableItemListItem r7 = new com.arlosoft.macrodroid.selectableitemlist.SelectableItemListItem
            androidx.fragment.app.FragmentActivity r1 = r22.getActivity()
            kotlin.jvm.internal.C13706o.m87926c(r1)
            int r18 = r3 + 1
            r19 = 0
            r20 = 64
            r21 = 0
            r0 = r7
            r2 = r8
            r5 = r22
            r6 = r22
            r13 = r7
            r7 = r19
            r12 = r8
            r8 = r20
            r20 = r11
            r11 = 1
            r9 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r13.mo74963q(r12)
            r12.mo74947w(r13)
            r8 = r12
            r3 = r18
            r11 = r20
            r9 = 1
            r13 = 0
            goto L_0x00a9
        L_0x0140:
            r20 = r11
            goto L_0x00a9
        L_0x0144:
            r12 = r8
            r20 = r11
            r11 = 1
            int r0 = r16 + 1
            int r1 = r14.size()
            if (r0 != r1) goto L_0x0158
            com.arlosoft.macrodroid.selectableitemlist.f r1 = new com.arlosoft.macrodroid.selectableitemlist.f
            r1.<init>(r12)
            r12.mo74947w(r1)
        L_0x0158:
            r16 = r0
            r0 = r3
            r11 = r20
            r13 = 0
            goto L_0x0074
        L_0x0160:
            r11 = 1
            i9.b r0 = new i9.b
            java.util.List<l9.g<?>> r1 = r10.f15459g
            r2 = 0
            r0.<init>(r1, r2, r11)
            r10.f15455a = r0
            d4.m r1 = p236d4.C11948m.f58135a
            r0.mo68900o0(r1)
            i9.b<l9.g<?>> r0 = r10.f15455a
            if (r0 == 0) goto L_0x017a
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.mo68875Y1(r1)
        L_0x017a:
            i9.b<l9.g<?>> r0 = r10.f15455a
            if (r0 != 0) goto L_0x017f
            goto L_0x0182
        L_0x017f:
            r0.mo68877Z1(r11)
        L_0x0182:
            androidx.recyclerview.widget.RecyclerView r0 = r22.mo32940g0()
            i9.b<l9.g<?>> r1 = r10.f15455a
            r0.setAdapter(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.wizard.WizardFragment.m25185r0():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public static final void m25186s0(WizardFragment wizardFragment) {
        C13706o.m87929f(wizardFragment, "this$0");
        List<C15608g<?>> list = wizardFragment.f15459g;
        if (list != null) {
            C15608g remove = list.remove(0);
        }
        C12454b<C15608g<?>> bVar = wizardFragment.f15455a;
        if (bVar != null) {
            bVar.mo68865R1(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public static final boolean m25187u0(View view, int i) {
        return false;
    }

    /* renamed from: v0 */
    private final List<C7364d> m25188v0(List<? extends C7364d> list) {
        List<C7364d> x0 = C13566b0.m87449x0(list);
        for (C7364d next : x0) {
            List<C4001c1> f = next.mo37345f();
            C13706o.m87928e(f, "cat.items");
            next.mo37346g(C13566b0.m87450y0(f, new C6654c(this)));
        }
        return x0;
    }

    /* renamed from: I */
    public void mo30017I(C4001c1 c1Var) {
        C13706o.m87929f(c1Var, "itemInfo");
        FragmentActivity activity = getActivity();
        C13706o.m87926c(activity);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, C6396j1.m24653a(this.f15457d));
        builder.setTitle(c1Var.mo27893k());
        if (c1Var.mo27902t()) {
            builder.setMessage((CharSequence) C4061t1.m16007n(getActivity(), getString(c1Var.mo27891f())));
        } else {
            builder.setMessage(c1Var.mo27891f());
        }
        builder.setNegativeButton(17039370, (DialogInterface.OnClickListener) C11946k.f58133a);
        C4061t1.m16026w0(builder.show());
    }

    /* renamed from: Y0 */
    public boolean mo30018Y0() {
        return this.f15460o;
    }

    /* renamed from: Z */
    public void mo32939Z() {
        this.f15454A.clear();
    }

    /* renamed from: g0 */
    public final RecyclerView mo32940g0() {
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            return recyclerView2;
        }
        C13706o.m87945v("recyclerView");
        return null;
    }

    /* renamed from: h0 */
    public final void mo32941h0(int i, int i2, Intent intent) {
        SelectableItem selectableItem = this.f15461p;
        if (selectableItem != null) {
            selectableItem.mo24713q1(getActivity(), i, i2, intent);
        }
    }

    /* renamed from: i0 */
    public final void mo32942i0() {
        SelectableItem selectableItem = this.f15461p;
        if (selectableItem != null) {
            selectableItem.mo27864r1();
        }
    }

    /* renamed from: j0 */
    public final void mo32943j0(Object obj) {
        C13706o.m87929f(obj, "obj");
        SelectableItem selectableItem = this.f15461p;
        if (selectableItem != null) {
            selectableItem.mo25307s1(obj);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r0v7, types: [com.arlosoft.macrodroid.macro.Macro] */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10, types: [com.arlosoft.macrodroid.macro.Macro] */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityCreated(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onActivityCreated(r5)
            androidx.fragment.app.FragmentActivity r5 = r4.getActivity()
            java.lang.String r0 = "null cannot be cast to non-null type com.arlosoft.macrodroid.wizard.WizardActivity"
            kotlin.jvm.internal.C13706o.m87927d(r5, r0)
            com.arlosoft.macrodroid.wizard.WizardActivity r5 = (com.arlosoft.macrodroid.wizard.WizardActivity) r5
            com.arlosoft.macrodroid.macro.Macro r5 = r5.mo32926b2()
            java.lang.String r0 = "activity as WizardActivity).macro"
            kotlin.jvm.internal.C13706o.m87928e(r5, r0)
            r4.f15458f = r5
            android.os.Bundle r5 = r4.getArguments()
            kotlin.jvm.internal.C13706o.m87926c(r5)
            java.lang.String r0 = "itemType"
            int r5 = r5.getInt(r0)
            r4.f15457d = r5
            r0 = 0
            if (r5 == 0) goto L_0x006f
            java.lang.String r1 = "macro"
            r2 = 1
            if (r5 == r2) goto L_0x004f
            androidx.fragment.app.FragmentActivity r5 = r4.getActivity()
            if (r5 == 0) goto L_0x003b
            android.content.Context r5 = r5.getApplicationContext()
            goto L_0x003c
        L_0x003b:
            r5 = r0
        L_0x003c:
            com.arlosoft.macrodroid.macro.Macro r3 = r4.f15458f
            if (r3 != 0) goto L_0x0044
            kotlin.jvm.internal.C13706o.m87945v(r1)
            goto L_0x0045
        L_0x0044:
            r0 = r3
        L_0x0045:
            java.util.List r5 = com.arlosoft.macrodroid.constraint.Constraint.m16348X2(r5, r0, r2)
            java.lang.String r0 = "getAllConstraintsInfo(ac…tionContext, macro, true)"
            kotlin.jvm.internal.C13706o.m87928e(r5, r0)
            goto L_0x0082
        L_0x004f:
            androidx.fragment.app.FragmentActivity r5 = r4.getActivity()
            if (r5 == 0) goto L_0x005a
            android.content.Context r5 = r5.getApplicationContext()
            goto L_0x005b
        L_0x005a:
            r5 = r0
        L_0x005b:
            com.arlosoft.macrodroid.macro.Macro r2 = r4.f15458f
            if (r2 != 0) goto L_0x0063
            kotlin.jvm.internal.C13706o.m87945v(r1)
            goto L_0x0064
        L_0x0063:
            r0 = r2
        L_0x0064:
            r1 = 0
            java.util.List r5 = com.arlosoft.macrodroid.action.Action.m9594Y2(r5, r0, r1)
            java.lang.String r0 = "getAllActionsInfo(activi…ionContext, macro, false)"
            kotlin.jvm.internal.C13706o.m87928e(r5, r0)
            goto L_0x0082
        L_0x006f:
            androidx.fragment.app.FragmentActivity r5 = r4.getActivity()
            if (r5 == 0) goto L_0x0079
            android.content.Context r0 = r5.getApplicationContext()
        L_0x0079:
            java.util.List r5 = com.arlosoft.macrodroid.triggers.Trigger.m23340W2(r0)
            java.lang.String r0 = "getAllTriggersInfo(activity?.applicationContext)"
            kotlin.jvm.internal.C13706o.m87928e(r5, r0)
        L_0x0082:
            r4.f15462s = r5
            r4.m25179e0()
            r4.m25183o0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.wizard.WizardFragment.onActivityCreated(android.os.Bundle):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10180a.m40075a().mo80019m(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13706o.m87929f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C17535R$layout.fragment_wizard, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        ViewCompat.setNestedScrollingEnabled(mo32940g0(), false);
        mo32940g0().setEdgeEffectFactory(new C6653b(this));
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        C10180a.m40075a().mo80020p(this);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f15456c = null;
        mo32939Z();
    }

    public final void onEventMainThread(MacroUpdateEvent macroUpdateEvent) {
        C13706o.m87929f(macroUpdateEvent, NotificationCompat.CATEGORY_EVENT);
        if (macroUpdateEvent.f11755b == this.f15457d) {
            m25183o0();
        }
    }

    /* renamed from: q0 */
    public void mo32949q0(boolean z) {
        this.f15460o = z;
    }

    /* renamed from: v1 */
    public void mo30006v1(C4001c1 c1Var) {
        C13706o.m87929f(c1Var, "itemInfo");
        FragmentActivity activity = getActivity();
        Macro macro = this.f15458f;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        SelectableItem b = c1Var.mo27888b(activity, macro);
        this.f15461p = b;
        if (b != null) {
            b.mo25540W1();
        }
    }

    public final void onEventMainThread(WizardScrollToTopEvent wizardScrollToTopEvent) {
        C13706o.m87929f(wizardScrollToTopEvent, NotificationCompat.CATEGORY_EVENT);
        if (wizardScrollToTopEvent.f11764a == this.f15457d) {
            mo32940g0().post(new C11949n(this));
        }
    }

    public final void onEventMainThread(CategoryModeUpdateEvent categoryModeUpdateEvent) {
        C13706o.m87929f(categoryModeUpdateEvent, NotificationCompat.CATEGORY_EVENT);
        m25179e0();
    }

    public final void onEventMainThread(FilterEvent filterEvent) {
        Filter filter;
        C13706o.m87929f(filterEvent, NotificationCompat.CATEGORY_EVENT);
        WizardItemAdapter wizardItemAdapter = this.f15456c;
        if (!(wizardItemAdapter == null || (filter = wizardItemAdapter.getFilter()) == null)) {
            filter.filter(filterEvent.f11746a);
        }
        C12454b<C15608g<?>> bVar = this.f15455a;
        boolean z = true;
        if (bVar == null || !bVar.mo68901o1(filterEvent.f11746a)) {
            z = false;
        }
        if (z) {
            C12454b<C15608g<?>> bVar2 = this.f15455a;
            if (bVar2 != null) {
                bVar2.mo68880a2(filterEvent.f11746a);
            }
            C12454b<C15608g<?>> bVar3 = this.f15455a;
            if (bVar3 != null) {
                List<C15608g<?>> list = this.f15459g;
                C13706o.m87926c(list);
                bVar3.mo68862P0(list);
            }
        }
    }

    public final void onEventMainThread(SetHelpVisibilityEvent setHelpVisibilityEvent) {
        C13706o.m87929f(setHelpVisibilityEvent, NotificationCompat.CATEGORY_EVENT);
        mo32949q0(!mo30018Y0());
        C12454b<C15608g<?>> bVar = this.f15455a;
        if (bVar != null) {
            bVar.notifyDataSetChanged();
        }
        WizardItemAdapter wizardItemAdapter = this.f15456c;
        if (wizardItemAdapter != null) {
            wizardItemAdapter.mo32953P();
        }
    }
}

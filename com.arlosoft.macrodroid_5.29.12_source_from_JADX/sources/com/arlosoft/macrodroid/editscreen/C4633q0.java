package com.arlosoft.macrodroid.editscreen;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.p023dx.rop.code.RegisterSpec;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.action.ParentAction;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.utils.C6416p0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13698j0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p247e6.C12147d;
import p247e6.C12154k;
import p270ga.C12318a;
import p292io.reactivex.subjects.C13240a;
import p297ja.C13339u;
import p367q7.C16225a;
import p370qa.C16265l;
import p414v9.C16747p;
import p414v9.C16749r;
import p440y9.C16971a;

/* renamed from: com.arlosoft.macrodroid.editscreen.q0 */
/* compiled from: SelectableItemsListAdapter.kt */
public final class C4633q0<T extends SelectableItem> extends RecyclerView.Adapter<SelectableItemsViewHolder> implements C12147d<SelectableItemsViewHolder> {

    /* renamed from: A */
    private final C13240a<Boolean> f11683A;

    /* renamed from: B */
    private boolean f11684B;

    /* renamed from: C */
    private boolean f11685C;

    /* renamed from: D */
    private Range<Integer> f11686D;

    /* renamed from: E */
    private boolean f11687E;

    /* renamed from: F */
    private int f11688F = Integer.MAX_VALUE;

    /* renamed from: a */
    private final Activity f11689a;

    /* renamed from: c */
    private final Macro f11690c;

    /* renamed from: d */
    private List<T> f11691d;

    /* renamed from: f */
    private final C16265l<SelectableItem, C13339u> f11692f;

    /* renamed from: g */
    private final C16265l<SelectableItem, C13339u> f11693g;

    /* renamed from: o */
    private final C16265l<SelectableItem, C13339u> f11694o;

    /* renamed from: p */
    private final boolean f11695p;

    /* renamed from: s */
    private final boolean f11696s;

    /* renamed from: z */
    private final C16265l<List<? extends SelectableItem>, C13339u> f11697z;

    /* renamed from: com.arlosoft.macrodroid.editscreen.q0$a */
    /* compiled from: SelectableItemsListAdapter.kt */
    public static final class C4634a<T extends SelectableItem> {

        /* renamed from: a */
        private final int f11698a;

        /* renamed from: b */
        private final int f11699b;

        /* renamed from: c */
        private final List<T> f11700c;

        public C4634a(int i, int i2, List<? extends T> list) {
            C13706o.m87929f(list, "items");
            this.f11698a = i;
            this.f11699b = i2;
            this.f11700c = list;
        }

        /* renamed from: a */
        public final int mo29075a() {
            return this.f11699b;
        }

        /* renamed from: b */
        public final List<T> mo29076b() {
            return this.f11700c;
        }

        /* renamed from: c */
        public final int mo29077c() {
            return this.f11698a;
        }

        /* renamed from: d */
        public final boolean mo29078d(int i) {
            return i >= this.f11698a && i <= this.f11699b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4634a)) {
                return false;
            }
            C4634a aVar = (C4634a) obj;
            return this.f11698a == aVar.f11698a && this.f11699b == aVar.f11699b && C13706o.m87924a(this.f11700c, aVar.f11700c);
        }

        public int hashCode() {
            return (((this.f11698a * 31) + this.f11699b) * 31) + this.f11700c.hashCode();
        }

        public String toString() {
            return "OrderBlock(startPosition=" + this.f11698a + ", endPosition=" + this.f11699b + ", items=" + this.f11700c + ')';
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.q0$b */
    /* compiled from: SelectableItemsListAdapter.kt */
    static final class C4635b extends C13708q implements C16265l<SelectableItem, C13339u> {
        final /* synthetic */ C4633q0<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4635b(C4633q0<T> q0Var) {
            super(1);
            this.this$0 = q0Var;
        }

        /* renamed from: a */
        public final void mo29082a(SelectableItem selectableItem) {
            C13706o.m87929f(selectableItem, "it");
            this.this$0.notifyDataSetChanged();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo29082a((SelectableItem) obj);
            return C13339u.f61331a;
        }
    }

    public C4633q0(Activity activity, Macro macro, List<T> list, C16265l<? super SelectableItem, C13339u> lVar, C16265l<? super SelectableItem, C13339u> lVar2, C16265l<? super SelectableItem, C13339u> lVar3, boolean z, boolean z2, C16265l<? super List<? extends SelectableItem>, C13339u> lVar4) {
        C13706o.m87929f(activity, "context");
        C13706o.m87929f(macro, "macro");
        C13706o.m87929f(list, "items");
        C13706o.m87929f(lVar, "itemListener");
        C13706o.m87929f(lVar2, "itemLongClickListener");
        C13706o.m87929f(lVar3, "itemCollapseExpandListener");
        this.f11689a = activity;
        this.f11690c = macro;
        this.f11691d = list;
        this.f11692f = lVar;
        this.f11693g = lVar2;
        this.f11694o = lVar3;
        this.f11695p = z;
        this.f11696s = z2;
        this.f11697z = lVar4;
        C13240a<Boolean> i0 = C13240a.m85593i0();
        C13706o.m87928e(i0, "create<Boolean>()");
        this.f11683A = i0;
        m18059F();
        setHasStableIds(true);
        m18066V();
    }

    /* renamed from: F */
    private final void m18059F() {
        C16747p.m99408d(C4631p0.f11681a).mo79730q(C12318a.m83030b()).mo79726l(C16971a.m100210a()).mo79729o(new C4625m0(this), new C4627n0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static final C16749r m18060G() {
        return C16747p.m99412k(Boolean.valueOf(C16225a.m97488k(1000, 2)));
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static final void m18061H(C4633q0 q0Var, Boolean bool) {
        C13706o.m87929f(q0Var, "this$0");
        q0Var.f11683A.onNext(bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static final void m18062I(C4633q0 q0Var, Throwable th) {
        C13706o.m87929f(q0Var, "this$0");
        q0Var.f11683A.onNext(Boolean.FALSE);
    }

    /* renamed from: J */
    private final int m18063J() {
        return this.f11695p ? C17535R$layout.macro_edit_entry_small : C17535R$layout.macro_edit_entry;
    }

    /* renamed from: M */
    private final List<C4634a<T>> m18064M() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < this.f11691d.size()) {
            SelectableItem selectableItem = (SelectableItem) this.f11691d.get(i);
            if (!(selectableItem instanceof ParentAction) || !((ParentAction) selectableItem).mo25458J3()) {
                arrayList.add(new C4634a(i, i, C13612s.m87736e(selectableItem)));
            } else {
                List<T> list = this.f11691d;
                C13706o.m87927d(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.arlosoft.macrodroid.action.Action>");
                int f = C6416p0.m24709f(C13698j0.m87903c(list), i);
                arrayList.add(new C4634a(i, f, this.f11691d.subList(i, f + 1)));
                i = f;
            }
            i++;
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public static final void m18065U(C4633q0 q0Var) {
        C13706o.m87929f(q0Var, "this$0");
        q0Var.notifyDataSetChanged();
    }

    /* renamed from: V */
    private final void m18066V() {
        int i = 0;
        while (i < this.f11691d.size()) {
            SelectableItem selectableItem = (SelectableItem) this.f11691d.get(i);
            if (selectableItem instanceof ParentAction) {
                ParentAction parentAction = (ParentAction) selectableItem;
                if (parentAction.mo25458J3()) {
                    List<T> list = this.f11691d;
                    C13706o.m87927d(list, "null cannot be cast to non-null type kotlin.collections.List<com.arlosoft.macrodroid.action.Action>");
                    int f = C6416p0.m24709f(list, i);
                    int i2 = i + 1;
                    if (i2 <= f) {
                        while (true) {
                            ((SelectableItem) this.f11691d.get(i2)).mo27879z2(true);
                            if (i2 == f) {
                                break;
                            }
                            i2++;
                        }
                    }
                    i = f;
                }
                parentAction.mo27879z2(false);
            } else {
                selectableItem.mo27879z2(false);
            }
            i++;
        }
    }

    /* renamed from: K */
    public final Range<Integer> mo29055K() {
        return this.f11686D;
    }

    /* renamed from: L */
    public final boolean mo29056L() {
        return this.f11687E;
    }

    /* renamed from: N */
    public final boolean mo29057N() {
        return this.f11684B;
    }

    /* renamed from: O */
    public final int mo29058O(boolean z) {
        Range<Integer> range = this.f11686D;
        if (range == null) {
            return 0;
        }
        int b = C16792h.m99540b(C16792h.m99542d(range.getUpper().intValue() + (z ? -1 : 1), getItemCount() - 1), 0);
        Integer lower = range.getLower();
        C13706o.m87928e(lower, "it.lower");
        this.f11686D = new Range<>(Integer.valueOf(C16792h.m99542d(lower.intValue(), b)), Integer.valueOf(b));
        notifyDataSetChanged();
        return b;
    }

    /* renamed from: P */
    public final int mo29059P(boolean z) {
        Range<Integer> range = this.f11686D;
        if (range == null) {
            return 0;
        }
        int d = C16792h.m99542d(C16792h.m99540b(range.getLower().intValue() + (z ? -1 : 1), 0), getItemCount() - 1);
        Integer valueOf = Integer.valueOf(d);
        Integer upper = range.getUpper();
        C13706o.m87928e(upper, "it.upper");
        this.f11686D = new Range<>(valueOf, Integer.valueOf(C16792h.m99540b(upper.intValue(), d)));
        notifyDataSetChanged();
        return d;
    }

    /* renamed from: Q */
    public void onBindViewHolder(SelectableItemsViewHolder selectableItemsViewHolder, int i) {
        C13706o.m87929f(selectableItemsViewHolder, "holder");
        if (!this.f11685C) {
            Range<Integer> range = this.f11686D;
            boolean contains = range != null ? range.contains(Integer.valueOf(i)) : false;
            Range<Integer> range2 = this.f11686D;
            Object obj = null;
            Object lower = range2 != null ? range2.getLower() : null;
            if (lower == null) {
                lower = Boolean.FALSE;
            }
            boolean a = C13706o.m87924a(lower, Integer.valueOf(i));
            Range<Integer> range3 = this.f11686D;
            if (range3 != null) {
                obj = range3.getUpper();
            }
            if (obj == null) {
                obj = Boolean.FALSE;
            }
            boolean a2 = C13706o.m87924a(obj, Integer.valueOf(i));
            SelectableItem selectableItem = (SelectableItem) this.f11691d.get(i);
            List<T> list = this.f11691d;
            boolean z = this.f11695p;
            boolean z2 = this.f11684B;
            boolean z3 = this.f11696s;
            boolean z4 = this.f11687E;
            Range<Integer> range4 = this.f11686D;
            boolean z5 = true;
            boolean z6 = range4 == null;
            if (range4 == null) {
                z5 = false;
            }
            selectableItemsViewHolder.mo29016B(selectableItem, list, i, z, z2, z3, contains, a, a2, z4, z6, z5);
        }
    }

    /* renamed from: R */
    public boolean mo29074x(SelectableItemsViewHolder selectableItemsViewHolder, int i, int i2, int i3) {
        C13706o.m87929f(selectableItemsViewHolder, "holder");
        if (!mo29057N()) {
            return false;
        }
        Rect rect = new Rect();
        selectableItemsViewHolder.mo29020Q().getDrawingRect(rect);
        selectableItemsViewHolder.mo29021S().offsetDescendantRectToMyCoords(selectableItemsViewHolder.mo29020Q(), rect);
        boolean contains = rect.contains(i2, i3);
        this.f11685C = contains;
        return contains;
    }

    /* renamed from: S */
    public SelectableItemsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(m18063J(), viewGroup, false);
        Activity activity = this.f11689a;
        Macro macro = this.f11690c;
        C13706o.m87928e(inflate, RegisterSpec.PREFIX);
        return new SelectableItemsViewHolder(activity, macro, inflate, this.f11692f, this.f11693g, this.f11694o, this.f11683A, new C4635b(this));
    }

    /* renamed from: T */
    public C12154k mo29073s(SelectableItemsViewHolder selectableItemsViewHolder, int i) {
        C13706o.m87929f(selectableItemsViewHolder, "holder");
        return null;
    }

    /* renamed from: W */
    public final void mo29064W(boolean z) {
        this.f11684B = z;
        notifyDataSetChanged();
    }

    /* renamed from: X */
    public final void mo29065X(int i, int i2) {
        this.f11686D = new Range<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: Y */
    public final void mo29066Y(boolean z) {
        this.f11687E = z;
        notifyDataSetChanged();
    }

    /* renamed from: Z */
    public final void mo29067Z(List<T> list) {
        C13706o.m87929f(list, "items");
        this.f11691d = list;
        m18066V();
        notifyDataSetChanged();
    }

    /* renamed from: a0 */
    public final void mo29068a0(boolean z) {
        this.f11684B = z;
    }

    /* renamed from: b */
    public void mo29069b(int i) {
    }

    /* renamed from: c */
    public void mo29070c(int i, int i2, boolean z) {
        C16265l<List<? extends SelectableItem>, C13339u> lVar;
        this.f11685C = false;
        if (!(i == i2 || (lVar = this.f11697z) == null)) {
            lVar.invoke(this.f11691d);
        }
        notifyDataSetChanged();
        new Handler(Looper.getMainLooper()).postDelayed(new C4629o0(this), 250);
    }

    public int getItemCount() {
        return this.f11691d.size();
    }

    public long getItemId(int i) {
        return ((SelectableItem) this.f11691d.get(i)).mo27847f1();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.arlosoft.macrodroid.editscreen.q0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.arlosoft.macrodroid.editscreen.q0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.arlosoft.macrodroid.editscreen.q0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.arlosoft.macrodroid.editscreen.q0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.arlosoft.macrodroid.editscreen.q0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.arlosoft.macrodroid.editscreen.q0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.arlosoft.macrodroid.editscreen.q0$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29071h(int r8, int r9) {
        /*
            r7 = this;
            java.util.List r0 = r7.m18064M()
            java.util.List r0 = kotlin.collections.C13566b0.m87405I0(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x000c:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0021
            java.lang.Object r2 = r1.next()
            r4 = r2
            com.arlosoft.macrodroid.editscreen.q0$a r4 = (com.arlosoft.macrodroid.editscreen.C4633q0.C4634a) r4
            boolean r4 = r4.mo29078d(r8)
            if (r4 == 0) goto L_0x000c
            goto L_0x0022
        L_0x0021:
            r2 = r3
        L_0x0022:
            com.arlosoft.macrodroid.editscreen.q0$a r2 = (com.arlosoft.macrodroid.editscreen.C4633q0.C4634a) r2
            if (r2 != 0) goto L_0x0027
            return
        L_0x0027:
            r1 = 0
            r4 = 1
            if (r9 <= r8) goto L_0x005d
            java.util.Iterator r8 = r0.iterator()
        L_0x002f:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L_0x0048
            java.lang.Object r5 = r8.next()
            r6 = r5
            com.arlosoft.macrodroid.editscreen.q0$a r6 = (com.arlosoft.macrodroid.editscreen.C4633q0.C4634a) r6
            int r6 = r6.mo29075a()
            if (r6 < r9) goto L_0x0044
            r6 = 1
            goto L_0x0045
        L_0x0044:
            r6 = 0
        L_0x0045:
            if (r6 == 0) goto L_0x002f
            r3 = r5
        L_0x0048:
            com.arlosoft.macrodroid.editscreen.q0$a r3 = (com.arlosoft.macrodroid.editscreen.C4633q0.C4634a) r3
            if (r3 != 0) goto L_0x004d
            return
        L_0x004d:
            boolean r8 = kotlin.jvm.internal.C13706o.m87924a(r2, r3)
            if (r8 == 0) goto L_0x0054
            return
        L_0x0054:
            r0.remove(r2)
            int r8 = r0.indexOf(r3)
            int r8 = r8 + r4
            goto L_0x008d
        L_0x005d:
            java.util.Iterator r8 = r0.iterator()
        L_0x0061:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L_0x007a
            java.lang.Object r5 = r8.next()
            r6 = r5
            com.arlosoft.macrodroid.editscreen.q0$a r6 = (com.arlosoft.macrodroid.editscreen.C4633q0.C4634a) r6
            int r6 = r6.mo29077c()
            if (r6 < r9) goto L_0x0076
            r6 = 1
            goto L_0x0077
        L_0x0076:
            r6 = 0
        L_0x0077:
            if (r6 == 0) goto L_0x0061
            r3 = r5
        L_0x007a:
            com.arlosoft.macrodroid.editscreen.q0$a r3 = (com.arlosoft.macrodroid.editscreen.C4633q0.C4634a) r3
            if (r3 != 0) goto L_0x007f
            return
        L_0x007f:
            boolean r8 = kotlin.jvm.internal.C13706o.m87924a(r2, r3)
            if (r8 == 0) goto L_0x0086
            return
        L_0x0086:
            r0.remove(r2)
            int r8 = r0.indexOf(r3)
        L_0x008d:
            r0.add(r8, r2)
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = kotlin.collections.C13616u.m87774u(r0, r9)
            r8.<init>(r9)
            java.util.Iterator r9 = r0.iterator()
        L_0x009f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r0 = r9.next()
            com.arlosoft.macrodroid.editscreen.q0$a r0 = (com.arlosoft.macrodroid.editscreen.C4633q0.C4634a) r0
            java.util.List r0 = r0.mo29076b()
            r8.add(r0)
            goto L_0x009f
        L_0x00b3:
            java.util.List r8 = kotlin.collections.C13616u.m87776w(r8)
            java.util.List<T> r9 = r7.f11691d
            r9.clear()
            java.util.List<T> r9 = r7.f11691d
            r9.addAll(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.editscreen.C4633q0.mo29071h(int, int):void");
    }

    /* renamed from: q */
    public boolean mo29072q(int i, int i2) {
        return true;
    }
}

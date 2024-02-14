package com.arlosoft.macrodroid.selectableitemlist;

import android.os.Bundle;
import android.view.View;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.selectableitemlist.classic.SelectableItemAdapter;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p099h1.C7364d;
import p168t2.C10250a;
import p297ja.C13321g;
import p370qa.C16254a;

/* compiled from: AddConditionActivity.kt */
public final class AddConditionActivity extends AddSelectableItemActivity {

    /* renamed from: H */
    private long f12728H;

    /* renamed from: I */
    private final C13321g f12729I = C13323i.m85669b(new C5081b(this));

    /* renamed from: J */
    private final C13321g f12730J = C13323i.m85669b(C5080a.f12735a);

    /* renamed from: K */
    private final int f12731K = C17528R$color.condition_category;

    /* renamed from: L */
    private final C13321g f12732L = C13323i.m85669b(new C5082c(this));

    /* renamed from: M */
    private final boolean f12733M = true;

    /* renamed from: N */
    public Map<Integer, View> f12734N = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.selectableitemlist.AddConditionActivity$a */
    /* compiled from: AddConditionActivity.kt */
    static final class C5080a extends C13708q implements C16254a<Integer> {

        /* renamed from: a */
        public static final C5080a f12735a = new C5080a();

        C5080a() {
            super(0);
        }

        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(C17528R$color.condition_primary);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.selectableitemlist.AddConditionActivity$b */
    /* compiled from: AddConditionActivity.kt */
    static final class C5081b extends C13708q implements C16254a<List<? extends C7364d>> {
        final /* synthetic */ AddConditionActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5081b(AddConditionActivity addConditionActivity) {
            super(0);
            this.this$0 = addConditionActivity;
        }

        /* renamed from: a */
        public final List<C7364d> invoke() {
            AddConditionActivity addConditionActivity = this.this$0;
            List<C7364d> Y2 = Constraint.m16349Y2(addConditionActivity, addConditionActivity.mo30020d2(), false);
            C13706o.m87928e(Y2, "getCategories(this, macro,false)");
            return addConditionActivity.mo30023p2(Y2);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.selectableitemlist.AddConditionActivity$c */
    /* compiled from: AddConditionActivity.kt */
    static final class C5082c extends C13708q implements C16254a<C10250a> {
        final /* synthetic */ AddConditionActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5082c(AddConditionActivity addConditionActivity) {
            super(0);
            this.this$0 = addConditionActivity;
        }

        /* renamed from: a */
        public final C10250a invoke() {
            AddConditionActivity addConditionActivity = this.this$0;
            return new C10250a(addConditionActivity, addConditionActivity.mo30020d2(), !C5163j2.m20285v6(this.this$0), this.this$0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: W1 */
    public int mo29999W1() {
        return ((Number) this.f12730J.getValue()).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: X1 */
    public List<C7364d> mo30000X1() {
        return (List) this.f12729I.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y1 */
    public int mo30001Y1() {
        return this.f12731K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z1 */
    public SelectableItemAdapter mo30002Z1() {
        return (SelectableItemAdapter) this.f12732L.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b2 */
    public int mo30003b2() {
        return C17542R$style.Theme_App_Dialog_Condition;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c2 */
    public int mo30004c2() {
        return 2;
    }

    /* renamed from: e2 */
    public boolean mo30009e2() {
        return this.f12733M;
    }

    /* renamed from: o2 */
    public boolean mo30005o2() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(C17541R$string.add_condition);
        this.f12728H = getIntent().getLongExtra("ParentGUID", 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q2 */
    public void mo30010q2(SelectableItem selectableItem) {
        C13706o.m87927d(selectableItem, "null cannot be cast to non-null type com.arlosoft.macrodroid.constraint.Constraint");
        ((Constraint) selectableItem).mo28119f3(this.f12728H);
    }
}

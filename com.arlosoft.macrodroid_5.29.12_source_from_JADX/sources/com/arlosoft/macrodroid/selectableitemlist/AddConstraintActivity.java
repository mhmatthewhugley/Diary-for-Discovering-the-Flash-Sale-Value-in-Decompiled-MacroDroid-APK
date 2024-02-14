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
import p168t2.C10251b;
import p297ja.C13321g;
import p370qa.C16254a;

/* compiled from: AddConstraintActivity.kt */
public final class AddConstraintActivity extends AddSelectableItemActivity {

    /* renamed from: H */
    private long f12736H;

    /* renamed from: I */
    private final C13321g f12737I = C13323i.m85669b(new C5084b(this));

    /* renamed from: J */
    private final C13321g f12738J = C13323i.m85669b(C5083a.f12741a);

    /* renamed from: K */
    private final C13321g f12739K = C13323i.m85669b(new C5085c(this));

    /* renamed from: L */
    public Map<Integer, View> f12740L = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.selectableitemlist.AddConstraintActivity$a */
    /* compiled from: AddConstraintActivity.kt */
    static final class C5083a extends C13708q implements C16254a<Integer> {

        /* renamed from: a */
        public static final C5083a f12741a = new C5083a();

        C5083a() {
            super(0);
        }

        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(C17528R$color.constraints_primary);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.selectableitemlist.AddConstraintActivity$b */
    /* compiled from: AddConstraintActivity.kt */
    static final class C5084b extends C13708q implements C16254a<List<? extends C7364d>> {
        final /* synthetic */ AddConstraintActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5084b(AddConstraintActivity addConstraintActivity) {
            super(0);
            this.this$0 = addConstraintActivity;
        }

        /* renamed from: a */
        public final List<C7364d> invoke() {
            AddConstraintActivity addConstraintActivity = this.this$0;
            List<C7364d> Y2 = Constraint.m16349Y2(addConstraintActivity, addConstraintActivity.mo30020d2(), false);
            C13706o.m87928e(Y2, "getCategories(this, macro,false)");
            return addConstraintActivity.mo30023p2(Y2);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.selectableitemlist.AddConstraintActivity$c */
    /* compiled from: AddConstraintActivity.kt */
    static final class C5085c extends C13708q implements C16254a<C10251b> {
        final /* synthetic */ AddConstraintActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5085c(AddConstraintActivity addConstraintActivity) {
            super(0);
            this.this$0 = addConstraintActivity;
        }

        /* renamed from: a */
        public final C10251b invoke() {
            AddConstraintActivity addConstraintActivity = this.this$0;
            return new C10251b(addConstraintActivity, addConstraintActivity.mo30020d2(), !C5163j2.m20285v6(this.this$0), this.this$0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: W1 */
    public int mo29999W1() {
        return ((Number) this.f12738J.getValue()).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: X1 */
    public List<C7364d> mo30000X1() {
        return (List) this.f12737I.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y1 */
    public int mo30001Y1() {
        return C17528R$color.constraints_category;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z1 */
    public SelectableItemAdapter mo30002Z1() {
        return (SelectableItemAdapter) this.f12739K.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b2 */
    public int mo30003b2() {
        return C17542R$style.Theme_App_Dialog_Constraint;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c2 */
    public int mo30004c2() {
        return 2;
    }

    /* renamed from: o2 */
    public boolean mo30005o2() {
        return C5163j2.m20285v6(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(C17541R$string.add_constraint);
        this.f12736H = getIntent().getLongExtra("ParentGUID", 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q2 */
    public void mo30010q2(SelectableItem selectableItem) {
        C13706o.m87927d(selectableItem, "null cannot be cast to non-null type com.arlosoft.macrodroid.constraint.Constraint");
        ((Constraint) selectableItem).mo28119f3(this.f12736H);
    }
}

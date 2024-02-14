package com.arlosoft.macrodroid.selectableitemlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.selectableitemlist.classic.SelectActionAdapter;
import com.arlosoft.macrodroid.selectableitemlist.classic.SelectableItemAdapter;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p099h1.C7364d;
import p297ja.C13321g;
import p370qa.C16254a;

/* compiled from: AddActionActivity.kt */
public final class AddActionActivity extends AddSelectableItemActivity {

    /* renamed from: H */
    private final C13321g f12722H = C13323i.m85669b(new C5078a(this));

    /* renamed from: I */
    private int f12723I;

    /* renamed from: J */
    private long f12724J;

    /* renamed from: K */
    private long f12725K;

    /* renamed from: L */
    private final C13321g f12726L = C13323i.m85669b(new C5079b(this));

    /* renamed from: M */
    public Map<Integer, View> f12727M = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.selectableitemlist.AddActionActivity$a */
    /* compiled from: AddActionActivity.kt */
    static final class C5078a extends C13708q implements C16254a<List<? extends C7364d>> {
        final /* synthetic */ AddActionActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5078a(AddActionActivity addActionActivity) {
            super(0);
            this.this$0 = addActionActivity;
        }

        /* renamed from: a */
        public final List<C7364d> invoke() {
            AddActionActivity addActionActivity = this.this$0;
            List<C7364d> Z2 = Action.m9595Z2(addActionActivity, addActionActivity.mo30020d2(), false, false);
            C13706o.m87928e(Z2, "getCategories(this, macro, false, false)");
            return addActionActivity.mo30023p2(Z2);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.selectableitemlist.AddActionActivity$b */
    /* compiled from: AddActionActivity.kt */
    static final class C5079b extends C13708q implements C16254a<SelectActionAdapter> {
        final /* synthetic */ AddActionActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5079b(AddActionActivity addActionActivity) {
            super(0);
            this.this$0 = addActionActivity;
        }

        /* renamed from: a */
        public final SelectActionAdapter invoke() {
            AddActionActivity addActionActivity = this.this$0;
            return new SelectActionAdapter(addActionActivity, addActionActivity.mo30020d2(), !C5163j2.m20253r6(this.this$0), this.this$0, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: W1 */
    public int mo29999W1() {
        return C17528R$color.actions_primary;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X1 */
    public List<C7364d> mo30000X1() {
        return (List) this.f12722H.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y1 */
    public int mo30001Y1() {
        return C17528R$color.actions_category;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z1 */
    public SelectableItemAdapter mo30002Z1() {
        return (SelectableItemAdapter) this.f12726L.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b2 */
    public int mo30003b2() {
        return C17542R$style.Theme_App_Dialog_Action;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c2 */
    public int mo30004c2() {
        return 1;
    }

    /* renamed from: o2 */
    public boolean mo30005o2() {
        return C5163j2.m20253r6(this);
    }

    public void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setTitle(C17541R$string.add_action);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            this.f12723I = extras.getInt("NextActionIndex");
            this.f12724J = extras.getLong("ParentGUID", 0);
            this.f12725K = extras.getLong("ParentGUIDInsert", 0);
            Action action = (Action) extras.getParcelable("current_action");
            if (action != null) {
                C4001c1 T0 = action.mo24673T0();
                C13706o.m87928e(T0, "action.info");
                mo30006v1(T0);
            }
        }
    }

    /* renamed from: v1 */
    public void mo30006v1(C4001c1 c1Var) {
        C13706o.m87929f(c1Var, "itemInfo");
        mo30021h2(c1Var.mo27888b(this, mo30020d2()));
        SelectableItem a2 = mo30019a2();
        C13706o.m87927d(a2, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.Action");
        ((Action) a2).mo24701f3(this.f12724J, this.f12725K);
        mo30010q2(mo30019a2());
    }
}

package com.arlosoft.macrodroid.selectableitemlist;

import android.os.Bundle;
import android.view.View;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.selectableitemlist.classic.SelectableItemAdapter;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p099h1.C7364d;
import p168t2.C10252c;
import p297ja.C13321g;
import p370qa.C16254a;

/* compiled from: AddTriggerActivity.kt */
public final class AddTriggerActivity extends AddSelectableItemActivity {

    /* renamed from: H */
    private long f12755H;

    /* renamed from: I */
    private final C13321g f12756I = C13323i.m85669b(new C5088a(this));

    /* renamed from: J */
    private final C13321g f12757J = C13323i.m85669b(new C5089b(this));

    /* renamed from: K */
    public Map<Integer, View> f12758K = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.selectableitemlist.AddTriggerActivity$a */
    /* compiled from: AddTriggerActivity.kt */
    static final class C5088a extends C13708q implements C16254a<List<? extends C7364d>> {
        final /* synthetic */ AddTriggerActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5088a(AddTriggerActivity addTriggerActivity) {
            super(0);
            this.this$0 = addTriggerActivity;
        }

        /* renamed from: a */
        public final List<C7364d> invoke() {
            AddTriggerActivity addTriggerActivity = this.this$0;
            List<C7364d> X2 = Trigger.m23341X2(addTriggerActivity);
            C13706o.m87928e(X2, "getCategories(this)");
            return addTriggerActivity.mo30023p2(X2);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.selectableitemlist.AddTriggerActivity$b */
    /* compiled from: AddTriggerActivity.kt */
    static final class C5089b extends C13708q implements C16254a<C10252c> {
        final /* synthetic */ AddTriggerActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5089b(AddTriggerActivity addTriggerActivity) {
            super(0);
            this.this$0 = addTriggerActivity;
        }

        /* renamed from: a */
        public final C10252c invoke() {
            AddTriggerActivity addTriggerActivity = this.this$0;
            return new C10252c(addTriggerActivity, addTriggerActivity.mo30020d2(), !C5163j2.m19945C6(this.this$0), this.this$0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: W1 */
    public int mo29999W1() {
        return C17528R$color.trigger_primary;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X1 */
    public List<C7364d> mo30000X1() {
        return (List) this.f12756I.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y1 */
    public int mo30001Y1() {
        return C17528R$color.trigger_category;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z1 */
    public SelectableItemAdapter mo30002Z1() {
        return (SelectableItemAdapter) this.f12757J.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b2 */
    public int mo30003b2() {
        return C17542R$style.Theme_App_Dialog_Trigger;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c2 */
    public int mo30004c2() {
        return 0;
    }

    /* renamed from: o2 */
    public boolean mo30005o2() {
        return C5163j2.m19945C6(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(C17541R$string.add_trigger);
        this.f12755H = getIntent().getLongExtra("ParentGUID", 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q2 */
    public void mo30010q2(SelectableItem selectableItem) {
        C13706o.m87927d(selectableItem, "null cannot be cast to non-null type com.arlosoft.macrodroid.triggers.Trigger");
        ((Trigger) selectableItem).mo31546d3(this.f12755H);
    }
}

package com.arlosoft.macrodroid.accessibility;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import androidx.appcompat.app.ActionBar;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.accessibility.C2308c;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.utils.C6364b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15478k0;
import p139o1.C7999f;
import p150q2.C8164a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16270q;

/* compiled from: KeepAccessibilityServicesRunningActivity.kt */
public final class KeepAccessibilityServicesRunningActivity extends MacroDroidBaseActivity implements C2308c.C2309a {

    /* renamed from: o */
    private C7999f f7108o;

    /* renamed from: p */
    private C2308c f7109p;

    /* renamed from: s */
    private List<C2304a> f7110s;

    /* renamed from: z */
    public Map<Integer, View> f7111z = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.accessibility.KeepAccessibilityServicesRunningActivity$a */
    /* compiled from: KeepAccessibilityServicesRunningActivity.kt */
    static final class C2302a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ KeepAccessibilityServicesRunningActivity this$0;

        /* renamed from: com.arlosoft.macrodroid.accessibility.KeepAccessibilityServicesRunningActivity$a$a */
        /* compiled from: KeepAccessibilityServicesRunningActivity.kt */
        static final class C2303a extends C13708q implements C16254a<C13339u> {
            final /* synthetic */ KeepAccessibilityServicesRunningActivity this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2303a(KeepAccessibilityServicesRunningActivity keepAccessibilityServicesRunningActivity) {
                super(0);
                this.this$0 = keepAccessibilityServicesRunningActivity;
            }

            public final void invoke() {
                this.this$0.m9545T1();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2302a(KeepAccessibilityServicesRunningActivity keepAccessibilityServicesRunningActivity, C13635d<? super C2302a> dVar) {
            super(3, dVar);
            this.this$0 = keepAccessibilityServicesRunningActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2302a(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C6364b.m24611b(this.this$0, C13612s.m87736e("android.permission.WRITE_SECURE_SETTINGS"), new C2303a(this.this$0));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: S1 */
    private final void m9544S1() {
        List<C2304a> I0 = C13566b0.m87405I0(m9548W1());
        this.f7110s = I0;
        C2308c cVar = null;
        if (I0 == null) {
            C13706o.m87945v("serviceList");
            I0 = null;
        }
        this.f7109p = new C2308c(I0, this);
        C7999f fVar = this.f7108o;
        if (fVar == null) {
            C13706o.m87945v("binding");
            fVar = null;
        }
        RecyclerView recyclerView = fVar.f19259b;
        C2308c cVar2 = this.f7109p;
        if (cVar2 == null) {
            C13706o.m87945v("adapter");
        } else {
            cVar = cVar2;
        }
        recyclerView.setAdapter(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public final void m9545T1() {
        C7999f fVar = this.f7108o;
        if (fVar == null) {
            C13706o.m87945v("binding");
            fVar = null;
        }
        CardView cardView = fVar.f19260c;
        C13706o.m87928e(cardView, "binding.adbHackCard");
        int i = 0;
        if (!(ContextCompat.checkSelfPermission(this, "android.permission.WRITE_SECURE_SETTINGS") != 0 && !C8164a.m33886a())) {
            i = 8;
        }
        cardView.setVisibility(i);
        C7999f fVar2 = this.f7108o;
        if (fVar2 == null) {
            C13706o.m87945v("binding");
            fVar2 = null;
        }
        Button button = fVar2.f19261d;
        C13706o.m87928e(button, "binding.adbHackOkButton");
        C4666m.m18147o(button, (C13640g) null, new C2302a(this, (C13635d<? super C2302a>) null), 1, (Object) null);
    }

    /* renamed from: U1 */
    private final void m9546U1() {
        C7999f fVar = null;
        if (C5163j2.m19969F6(this)) {
            C7999f fVar2 = this.f7108o;
            if (fVar2 == null) {
                C13706o.m87945v("binding");
            } else {
                fVar = fVar2;
            }
            fVar.f19262e.f19257f.setVisibility(8);
            return;
        }
        C7999f fVar3 = this.f7108o;
        if (fVar3 == null) {
            C13706o.m87945v("binding");
            fVar3 = null;
        }
        fVar3.f19262e.f19257f.setCardBackgroundColor(ContextCompat.getColor(this, C17528R$color.quick_settings_config_primary));
        C7999f fVar4 = this.f7108o;
        if (fVar4 == null) {
            C13706o.m87945v("binding");
            fVar4 = null;
        }
        fVar4.f19262e.f19256e.setText(C17541R$string.keep_accessibility_services_running);
        C7999f fVar5 = this.f7108o;
        if (fVar5 == null) {
            C13706o.m87945v("binding");
            fVar5 = null;
        }
        fVar5.f19262e.f19254c.setText(C17541R$string.keep_accessibility_services_running_info_card);
        C7999f fVar6 = this.f7108o;
        if (fVar6 == null) {
            C13706o.m87945v("binding");
        } else {
            fVar = fVar6;
        }
        fVar.f19262e.f19255d.setOnClickListener(new C2312d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public static final void m9547V1(KeepAccessibilityServicesRunningActivity keepAccessibilityServicesRunningActivity, View view) {
        C13706o.m87929f(keepAccessibilityServicesRunningActivity, "this$0");
        C5163j2.m20029O2(keepAccessibilityServicesRunningActivity.getApplicationContext());
        C7999f fVar = keepAccessibilityServicesRunningActivity.f7108o;
        if (fVar == null) {
            C13706o.m87945v("binding");
            fVar = null;
        }
        fVar.f19262e.f19257f.setVisibility(8);
    }

    /* renamed from: W1 */
    private final List<C2304a> m9548W1() {
        Object systemService = getSystemService("accessibility");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        List<AccessibilityServiceInfo> installedAccessibilityServiceList = ((AccessibilityManager) systemService).getInstalledAccessibilityServiceList();
        List<String> f = C5163j2.m20150f(this);
        ArrayList arrayList = new ArrayList();
        for (AccessibilityServiceInfo next : installedAccessibilityServiceList) {
            String obj = next.getResolveInfo().loadLabel(getPackageManager()).toString();
            String id = next.getId();
            C13706o.m87928e(id, "service.id");
            arrayList.add(new C2304a(obj, id, f.contains(next.getId())));
        }
        return arrayList;
    }

    /* renamed from: J0 */
    public void mo24653J0(String str, boolean z, int i) {
        C13706o.m87929f(str, "serviceid");
        List<String> f = C5163j2.m20150f(this);
        C13706o.m87928e(f, "getAccessibilityServicesToKeepRunning(this)");
        List I0 = C13566b0.m87405I0(f);
        if (z) {
            I0.add(str);
        } else {
            I0.remove(str);
        }
        C5163j2.m20154f3(this, I0);
        List<C2304a> list = this.f7110s;
        C2308c cVar = null;
        if (list == null) {
            C13706o.m87945v("serviceList");
            list = null;
        }
        List<C2304a> list2 = this.f7110s;
        if (list2 == null) {
            C13706o.m87945v("serviceList");
            list2 = null;
        }
        list.set(i, C2304a.m9551b(list2.get(i), (String) null, (String) null, z, 3, (Object) null));
        C2308c cVar2 = this.f7109p;
        if (cVar2 == null) {
            C13706o.m87945v("adapter");
        } else {
            cVar = cVar2;
        }
        cVar.notifyItemChanged(i);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C7999f c = C7999f.m33319c(getLayoutInflater());
        C13706o.m87928e(c, "inflate(layoutInflater)");
        this.f7108o = c;
        if (c == null) {
            C13706o.m87945v("binding");
            c = null;
        }
        setContentView((View) c.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        setTitle(C17541R$string.keep_accessibility_services_running);
        m9546U1();
        m9544S1();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m9545T1();
    }
}

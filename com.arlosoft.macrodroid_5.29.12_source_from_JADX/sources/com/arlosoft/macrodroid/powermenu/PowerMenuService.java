package com.arlosoft.macrodroid.powermenu;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.service.controls.Control;
import android.service.controls.ControlsProviderService;
import android.service.controls.actions.ControlAction;
import android.service.controls.templates.StatelessTemplate;
import androidx.annotation.RequiresApi;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.InvokedByPowerMenuTrigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6368b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Flow;
import java.util.function.Consumer;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p292io.reactivex.processors.C13233b;
import p329me.C15730a;
import p330n2.C15752a;

@RequiresApi(29)
/* compiled from: PowerMenuService.kt */
public final class PowerMenuService extends ControlsProviderService {

    /* renamed from: c */
    public static final C5061a f12670c = new C5061a((C13695i) null);

    /* renamed from: a */
    private final C13233b<Control> f12671a;

    /* renamed from: com.arlosoft.macrodroid.powermenu.PowerMenuService$a */
    /* compiled from: PowerMenuService.kt */
    public static final class C5061a {
        private C5061a() {
        }

        public /* synthetic */ C5061a(C13695i iVar) {
            this();
        }
    }

    public PowerMenuService() {
        C13233b<Control> D = C13233b.m85570D();
        C13706o.m87928e(D, "create<Control>()");
        this.f12671a = D;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m19506b(List list, Flow.Subscriber subscriber) {
        C13706o.m87929f(list, "$controls");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            subscriber.onNext((Control) it.next());
        }
        subscriber.onComplete();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context, com.arlosoft.macrodroid.powermenu.PowerMenuService, android.service.controls.ControlsProviderService] */
    /* renamed from: c */
    private final List<Control> m19507c() {
        Context baseContext = getBaseContext();
        C13706o.m87928e(baseContext, "baseContext");
        PendingIntent activity = PendingIntent.getActivity(baseContext, 11, new Intent(), C6368b1.f14960c | 134217728);
        ArrayList arrayList = new ArrayList();
        for (Macro next : C4934n.m18998M().mo29710z()) {
            Control build = new Control.StatelessBuilder(String.valueOf(next.getGUID()), activity).setTitle(next.getName()).setSubtitle(next.getCategory()).setCustomIcon(Icon.createWithResource(this, C17530R$drawable.launcher_no_border)).setDeviceType(0).setStructure(getString(C17541R$string.macrodroid)).build();
            C13706o.m87928e(build, "StatelessBuilder(macro.g…                 .build()");
            arrayList.add(build);
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context, com.arlosoft.macrodroid.powermenu.PowerMenuService, android.service.controls.ControlsProviderService] */
    public Flow.Publisher<Control> createPublisherFor(List<String> list) {
        C13706o.m87929f(list, "controlIds");
        m19507c();
        List<Macro> z = C4934n.m18998M().mo29710z();
        PendingIntent activity = PendingIntent.getActivity(this, 1, new Intent(), C6368b1.f14960c | 134217728);
        for (Macro next : z) {
            if (list.contains(String.valueOf(next.getGUID()))) {
                Control build = new Control.StatefulBuilder(String.valueOf(next.getGUID()), activity).setTitle(next.getName()).setSubtitle(next.getCategory()).setStructure(getString(C17541R$string.macrodroid)).setDeviceType(0).setCustomIcon(Icon.createWithResource(this, C17530R$drawable.launcher_no_border)).setStatus(1).setControlTemplate(new StatelessTemplate(getString(C17541R$string.macrodroid))).build();
                C13706o.m87928e(build, "StatefulBuilder(macro.gu…                 .build()");
                this.f12671a.onNext(build);
            }
        }
        Flow.Publisher<Control> a = C15730a.m95051a(this.f12671a);
        C13706o.m87928e(a, "toFlowPublisher(updatePublisher)");
        return a;
    }

    public Flow.Publisher<Control> createPublisherForAllAvailable() {
        return new C15752a(m19507c());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.arlosoft.macrodroid.powermenu.PowerMenuService, android.service.controls.ControlsProviderService] */
    public void performControlAction(String str, ControlAction controlAction, Consumer<Integer> consumer) {
        C13706o.m87929f(str, "controlId");
        C13706o.m87929f(controlAction, "action");
        C13706o.m87929f(consumer, "consumer");
        consumer.accept(1);
        Macro Q = C4934n.m18998M().mo29682Q(Long.parseLong(str));
        if (Q != null) {
            Q.setTriggerThatInvoked(InvokedByPowerMenuTrigger.m22495g3());
            Q.invokeActions(new TriggerContextInfo(""));
            Control build = new Control.StatefulBuilder(String.valueOf(Q.getGUID()), PendingIntent.getActivity(this, 1, new Intent(), 134217728 | C6368b1.f14960c)).setTitle(Q.getName()).setSubtitle(Q.getCategory()).setStructure(getString(C17541R$string.macrodroid)).setDeviceType(0).setCustomIcon(Icon.createWithResource(this, C17530R$drawable.launcher_no_border)).setStatus(1).setControlTemplate(new StatelessTemplate(getString(C17541R$string.macrodroid))).build();
            C13706o.m87928e(build, "StatefulBuilder(macro.gu…                 .build()");
            this.f12671a.onNext(build);
            return;
        }
        C4878b.m18868g("Power control failed - macro not found");
    }
}

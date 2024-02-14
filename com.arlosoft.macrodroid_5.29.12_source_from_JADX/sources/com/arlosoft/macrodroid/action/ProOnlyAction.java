package com.arlosoft.macrodroid.action;

import android.content.Intent;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.upgrade.UpgradeActivity2;
import kotlin.jvm.internal.C13706o;

/* compiled from: ProOnlyAction.kt */
public abstract class ProOnlyAction extends Action {

    /* renamed from: d */
    public transient C4083b f7454d;

    public ProOnlyAction() {
        m11887D1();
    }

    /* renamed from: D1 */
    private final void m11887D1() {
        MacroDroidApplication.f9883I.mo27302a().mo38305j(this);
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return mo25487j3().mo28009e().mo28008a();
    }

    /* renamed from: N0 */
    public String mo24938N0() {
        if (!mo25487j3().mo28009e().mo28008a()) {
            return SelectableItem.m15535j1(C17541R$string.pro_version_required);
        }
        return null;
    }

    /* renamed from: b3 */
    public void mo24698b3(TriggerContextInfo triggerContextInfo) {
        if (!mo25487j3().mo28009e().mo28008a()) {
            Long Y0 = mo27840Y0();
            C13706o.m87928e(Y0, "macroGuid");
            C4878b.m18869h(mo24738G0() + ": " + SelectableItem.m15535j1(C17541R$string.pro_version_required), Y0.longValue());
        } else if (mo27839Y()) {
            mo24675a3(triggerContextInfo);
        }
    }

    /* renamed from: j3 */
    public final C4083b mo25487j3() {
        C4083b bVar = this.f7454d;
        if (bVar != null) {
            return bVar;
        }
        C13706o.m87945v("premiumStatusHandler");
        return null;
    }

    /* renamed from: x1 */
    public void mo25283x1() {
        mo27850j0().startActivity(new Intent(mo27850j0(), UpgradeActivity2.class));
    }
}

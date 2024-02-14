package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.ArrayList;
import java.util.Iterator;
import p119k3.C7532m1;

public class RecentAppsTrigger extends Trigger {
    public static final Parcelable.Creator<RecentAppsTrigger> CREATOR = new C5726a();
    private static final String PACKAGE_ANDROID_SYSTEM_UI = "com.android.systemui";
    private static final String PACKAGE_NEXUS_LAUNCHER = "com.google.android.apps.nexuslauncher";
    private static final Handler mainThreadHandler = new Handler(Looper.getMainLooper());

    /* renamed from: com.arlosoft.macrodroid.triggers.RecentAppsTrigger$a */
    class C5726a implements Parcelable.Creator<RecentAppsTrigger> {
        C5726a() {
        }

        /* renamed from: a */
        public RecentAppsTrigger createFromParcel(Parcel parcel) {
            return new RecentAppsTrigger(parcel, (C5726a) null);
        }

        /* renamed from: b */
        public RecentAppsTrigger[] newArray(int i) {
            return new RecentAppsTrigger[i];
        }
    }

    /* synthetic */ RecentAppsTrigger(Parcel parcel, C5726a aVar) {
        this(parcel);
    }

    /* renamed from: h3 */
    public static void m23021h3(String str, String str2) {
        if (str.equals(PACKAGE_ANDROID_SYSTEM_UI) && str2.endsWith("RecentsActivity")) {
            ArrayList<Macro> arrayList = new ArrayList<>();
            for (Macro next : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                while (it.hasNext()) {
                    Trigger next2 = it.next();
                    if ((next2 instanceof RecentAppsTrigger) && next2.mo31374R2()) {
                        next.setTriggerThatInvoked(next2);
                        if (next.canInvoke(next.getTriggerContextInfo())) {
                            arrayList.add(next);
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                for (Macro q6Var : arrayList) {
                    mainThreadHandler.post(new C6055q6(q6Var));
                }
            }
        }
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return Build.VERSION.SDK_INT <= 27;
    }

    /* renamed from: N0 */
    public String mo24938N0() {
        if (mo24824M1()) {
            return super.mo24938N0();
        }
        return String.format(SelectableItem.m15535j1(C17541R$string.feature_only_available_up_to_android_version), new Object[]{8});
    }

    /* renamed from: S2 */
    public void mo30885S2() {
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7532m1.m31339u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
    }

    /* renamed from: f2 */
    public boolean mo24749f2() {
        return true;
    }

    public RecentAppsTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public RecentAppsTrigger() {
    }

    private RecentAppsTrigger(Parcel parcel) {
        super(parcel);
    }
}

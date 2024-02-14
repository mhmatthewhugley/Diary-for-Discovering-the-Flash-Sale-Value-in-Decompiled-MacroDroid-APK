package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.receivers.IpAddressChangeReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p119k3.C7545q0;
import p148q0.C8151a;

/* compiled from: IpAddressChangeTrigger.kt */
public final class IpAddressChangeTrigger extends Trigger {
    public static final Parcelable.Creator<IpAddressChangeTrigger> CREATOR = new C5674a();

    /* renamed from: d */
    public static final C5676c f13634d = new C5676c((C13695i) null);
    private static final C5675b networkCallback = new C5675b();
    private static IpAddressChangeReceiver s_connectivityChangeTriggerReceiver;
    private static int s_triggerCounter;

    /* renamed from: com.arlosoft.macrodroid.triggers.IpAddressChangeTrigger$a */
    /* compiled from: IpAddressChangeTrigger.kt */
    public static final class C5674a implements Parcelable.Creator<IpAddressChangeTrigger> {
        C5674a() {
        }

        /* renamed from: a */
        public IpAddressChangeTrigger createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new IpAddressChangeTrigger(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public IpAddressChangeTrigger[] newArray(int i) {
            return new IpAddressChangeTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.IpAddressChangeTrigger$b */
    /* compiled from: IpAddressChangeTrigger.kt */
    public static final class C5675b extends ConnectivityManager.NetworkCallback {
        C5675b() {
        }

        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            C13706o.m87929f(network, "network");
            C13706o.m87929f(linkProperties, "linkProperties");
            super.onLinkPropertiesChanged(network, linkProperties);
            ArrayList arrayList = new ArrayList();
            String M = C4061t1.m15967M();
            MacroDroidApplication.C3787a aVar = MacroDroidApplication.f9883I;
            String l1 = C5163j2.m20200l1(aVar.mo27303b());
            if (!C13706o.m87924a(M, "?") && !C13706o.m87924a(M, l1)) {
                C5163j2.m20101Y4(aVar.mo27303b(), M);
                if (l1 != null) {
                    for (Macro next : C4934n.m18998M().mo29679I()) {
                        Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Trigger next2 = it.next();
                            if ((next2 instanceof IpAddressChangeTrigger) && next2.mo31374R2()) {
                                if (next.canInvoke(next.getTriggerContextInfo())) {
                                    arrayList.add(next);
                                    next.setTriggerThatInvoked(next2);
                                }
                            }
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Macro macro = (Macro) it2.next();
                        macro.invokeActions(macro.getTriggerContextInfo());
                    }
                }
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.IpAddressChangeTrigger$c */
    /* compiled from: IpAddressChangeTrigger.kt */
    public static final class C5676c {
        private C5676c() {
        }

        public /* synthetic */ C5676c(C13695i iVar) {
            this();
        }
    }

    public IpAddressChangeTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ IpAddressChangeTrigger(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    Object systemService = mo27827K0().getSystemService("connectivity");
                    C13706o.m87927d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                    ((ConnectivityManager) systemService).unregisterNetworkCallback(networkCallback);
                } else {
                    MacroDroidApplication.f9883I.mo27303b().unregisterReceiver(s_connectivityChangeTriggerReceiver);
                }
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            s_connectivityChangeTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7545q0.f18433j.mo37649a();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            if (Build.VERSION.SDK_INT >= 24) {
                Object systemService = mo27827K0().getSystemService("connectivity");
                C13706o.m87927d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                ((ConnectivityManager) systemService).registerDefaultNetworkCallback(networkCallback);
            } else {
                s_connectivityChangeTriggerReceiver = new IpAddressChangeReceiver();
                MacroDroidApplication.f9883I.mo27303b().registerReceiver(s_connectivityChangeTriggerReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            }
        }
        s_triggerCounter++;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
    }

    private IpAddressChangeTrigger() {
    }

    private IpAddressChangeTrigger(Parcel parcel) {
        super(parcel);
    }
}

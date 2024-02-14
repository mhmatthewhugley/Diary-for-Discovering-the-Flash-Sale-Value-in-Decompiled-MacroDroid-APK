package com.arlosoft.macrodroid.celltowers;

import android.app.IntentService;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import androidx.core.util.Pair;
import com.arlosoft.macrodroid.celltowers.C3943v;
import com.arlosoft.macrodroid.database.C4373a;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.CellTowerTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p135n1.C7964a;
import p161s1.C10180a;
import p161s1.C10181b;

public class CellTowerService extends IntentService {

    /* renamed from: a */
    private static List<String> f10163a;

    /* renamed from: c */
    private static List<C3943v.C3944a> f10164c;

    public CellTowerService() {
        super("CellTowerService");
    }

    /* renamed from: b */
    private boolean m15256b(String str, List<String> list) {
        for (String equals : list) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m15257c(ArrayList arrayList, PowerManager.WakeLock wakeLock) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Macro macro = (Macro) it.next();
            macro.invokeActions(macro.getTriggerContextInfo());
        }
        if (wakeLock.isHeld()) {
            wakeLock.release();
        }
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        int i;
        Iterator<Macro> it;
        boolean z;
        boolean z2;
        Iterator<String> it2;
        C7964a d;
        if (f10163a == null) {
            f10163a = new ArrayList();
            f10164c = new ArrayList();
        }
        PowerManager.WakeLock newWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, "macrodroid:celltowerservice");
        newWakeLock.setReferenceCounted(false);
        newWakeLock.acquire(5000);
        Set<String> f = C4373a.m17336h().mo28639f();
        List<C3943v.C3944a> a = C3943v.m15317a(this);
        C4373a i2 = C4373a.m17337i(this);
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<String> arrayList = new ArrayList<>();
        for (C3943v.C3944a next : a) {
            if (!f.contains(next.f10258c)) {
                arrayList.add(next.f10258c);
            }
        }
        if (a.size() == f10163a.size()) {
            i = 0;
            for (C3943v.C3944a next2 : a) {
                Iterator<C3943v.C3944a> it3 = f10164c.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (next2.f10258c.equals(it3.next().f10258c)) {
                            i++;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        } else {
            i = 0;
        }
        if (a.size() > 0 && i != a.size()) {
            i2.mo28650u(currentTimeMillis - 604800000);
            for (C3943v.C3944a aVar : a) {
                i2.mo28635a(aVar.f10258c, currentTimeMillis);
            }
            C10180a.m40075a().mo80018i(new C10181b());
        }
        ArrayList arrayList2 = new ArrayList();
        f10164c = arrayList2;
        arrayList2.addAll(a);
        if (arrayList.size() == 0) {
            C4878b.m18879r("No (non-ignored) towers found");
            if (newWakeLock.isHeld()) {
                newWakeLock.release();
                return;
            }
            return;
        }
        C4878b.m18879r("Cell towers found = " + arrayList.size());
        for (String str : arrayList) {
            C4878b.m18879r("-> " + str);
        }
        String c = CellTowerBackgroundScanService.m15185c();
        if (!(c == null || (d = C3932l.m15307e().mo27631d(c)) == null)) {
            boolean z3 = false;
            for (String str2 : arrayList) {
                if (!d.getCellTowerIds().contains(str2)) {
                    d.getCellTowerIds().add(str2);
                    C4878b.m18873l("BG Scan found new cell: " + str2 + " adding to group " + c);
                    z3 = true;
                }
            }
            if (z3) {
                C3932l.m15307e().mo27633h();
            }
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        Iterator<Macro> it4 = C4934n.m18998M().mo29679I().iterator();
        while (it4.hasNext()) {
            Macro next3 = it4.next();
            Iterator<Trigger> it5 = next3.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it5.hasNext()) {
                    it = it4;
                    break;
                }
                Trigger next4 = it5.next();
                if (next4 instanceof CellTowerTrigger) {
                    CellTowerTrigger cellTowerTrigger = (CellTowerTrigger) next4;
                    C7964a d2 = C3932l.m15307e().mo27631d(cellTowerTrigger.mo31042i3());
                    if (d2 != null) {
                        Pair pair = (Pair) hashMap.get(d2.getName());
                        if (pair == null) {
                            C4878b.m18879r("Checking cell towers against group: " + d2.getName());
                            Iterator<String> it6 = d2.getCellTowerIds().iterator();
                            z2 = false;
                            z = false;
                            while (it6.hasNext()) {
                                String next5 = it6.next();
                                if (!d2.isIgnore(next5)) {
                                    it2 = it6;
                                    if (m15256b(next5, f10163a)) {
                                        z2 = true;
                                    }
                                    if (m15256b(next5, arrayList)) {
                                        z = true;
                                    }
                                } else {
                                    it2 = it6;
                                }
                                it6 = it2;
                            }
                            it = it4;
                            hashMap.put(d2.getName(), new Pair(Boolean.valueOf(z2), Boolean.valueOf(z)));
                            C4878b.m18879r("-> Previously in range = " + z2 + ", Currently in range = " + z);
                        } else {
                            it = it4;
                            boolean booleanValue = ((Boolean) pair.first).booleanValue();
                            z = ((Boolean) pair.second).booleanValue();
                            z2 = booleanValue;
                        }
                    } else {
                        it = it4;
                        C4878b.m18879r("Checking cell towers against legacy group: " + cellTowerTrigger.mo31042i3());
                        z2 = false;
                        for (String next6 : cellTowerTrigger.mo31043j3()) {
                            if (m15256b(next6, f10163a)) {
                                z2 = true;
                            }
                            if (m15256b(next6, arrayList)) {
                                z2 = true;
                            }
                        }
                        C4878b.m18879r("-> Previously in range = " + z2 + ", Currently in range = " + false);
                        z = false;
                    }
                    if (cellTowerTrigger.mo31044k3()) {
                        if (z && !z2 && next4.mo31374R2()) {
                            C4878b.m18879r("[" + cellTowerTrigger.mo31042i3() + "] Cell tower now in range");
                            next3.setTriggerThatInvoked(next4);
                            if (next3.canInvoke(next3.getTriggerContextInfo())) {
                                arrayList3.add(next3);
                            }
                        }
                    } else if (z2 && !z && next4.mo31374R2()) {
                        C4878b.m18879r("[" + cellTowerTrigger.mo31042i3() + "] All cell towers now out of range");
                        next3.setTriggerThatInvoked(next4);
                        if (next3.canInvoke(next3.getTriggerContextInfo())) {
                            arrayList3.add(next3);
                        }
                    }
                } else {
                    it = it4;
                }
                it4 = it;
            }
            it4 = it;
        }
        new Handler(Looper.getMainLooper()).post(new C3942u(arrayList3, newWakeLock));
        f10163a = arrayList;
    }
}

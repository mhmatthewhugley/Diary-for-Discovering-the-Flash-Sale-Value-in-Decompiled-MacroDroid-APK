package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import androidx.core.app.NotificationCompat;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.celltowers.CellTowerListActivity;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.receivers.CheckCellCoverageReceiver;
import com.arlosoft.macrodroid.utils.C6368b1;
import java.util.ArrayList;
import java.util.List;
import p112j2.C7439d0;
import p119k3.C7548r;
import p135n1.C7964a;
import p136n3.C7968b;
import p148q0.C8151a;

public class CellTowerTrigger extends Trigger {
    public static final Parcelable.Creator<CellTowerTrigger> CREATOR = new C5624a();
    private static final int REQUEST_CODE_CELL_TOWER_LIST = 63475623;
    private static C7968b s_cellLocationTriggerReceiver;
    private static PendingIntent s_pendingIntent;
    private static int s_triggerCounter;
    private static C5625b s_updateRateReceiver;
    private String m_cellGroupName;
    private ArrayList<String> m_cellIds;
    private boolean m_inRange;

    /* renamed from: com.arlosoft.macrodroid.triggers.CellTowerTrigger$a */
    class C5624a implements Parcelable.Creator<CellTowerTrigger> {
        C5624a() {
        }

        /* renamed from: a */
        public CellTowerTrigger createFromParcel(Parcel parcel) {
            return new CellTowerTrigger(parcel, (C5624a) null);
        }

        /* renamed from: b */
        public CellTowerTrigger[] newArray(int i) {
            return new CellTowerTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.CellTowerTrigger$b */
    private class C5625b extends BroadcastReceiver {
        private C5625b() {
        }

        public void onReceive(Context context, Intent intent) {
            CellTowerTrigger.m21958p3(CellTowerTrigger.this.mo27827K0());
        }

        /* synthetic */ C5625b(CellTowerTrigger cellTowerTrigger, C5624a aVar) {
            this();
        }
    }

    /* synthetic */ CellTowerTrigger(Parcel parcel, C5624a aVar) {
        this(parcel);
    }

    /* renamed from: l3 */
    private String[] m21955l3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.trigger_cell_tower_in_range), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_cell_tower_out_of_range)};
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public /* synthetic */ void m21956m3() {
        try {
            ((TelephonyManager) mo27827K0().getSystemService("phone")).listen(s_cellLocationTriggerReceiver, 0);
        } catch (SecurityException unused) {
            C7439d0.m30909o0(mo27827K0(), "android.permission.READ_PHONE_STATE", SelectableItem.m15535j1(C17541R$string.trigger_cell_tower), true, false);
            C4878b.m18869h(mo24738G0() + " requires permission", mo27840Y0().longValue());
        }
        s_cellLocationTriggerReceiver = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public /* synthetic */ void m21957n3() {
        s_cellLocationTriggerReceiver = new C7968b();
        try {
            ((TelephonyManager) mo27827K0().getSystemService("phone")).listen(s_cellLocationTriggerReceiver, 16);
        } catch (SecurityException unused) {
            C7439d0.m30909o0(mo27827K0(), "android.permission.READ_PHONE_STATE", SelectableItem.m15535j1(C17541R$string.trigger_cell_tower), true, false);
            C4878b.m18869h(mo24738G0() + " requires permission", mo27840Y0().longValue());
        }
    }

    /* renamed from: p3 */
    public static void m21958p3(Context context) {
        int w = C5163j2.m20286w(context) * 60;
        if (w == 0) {
            w = 30;
        }
        long currentTimeMillis = System.currentTimeMillis() + ((long) (w * 1000));
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent pendingIntent = s_pendingIntent;
        if (pendingIntent != null) {
            alarmManager.cancel(pendingIntent);
        } else {
            s_pendingIntent = PendingIntent.getBroadcast(context, 0, new Intent(context, CheckCellCoverageReceiver.class), 134217728 | C6368b1.f14959b);
        }
        C4878b.m18864c("+++ Scheduling cell tower check in: " + ((currentTimeMillis - System.currentTimeMillis()) / 1000) + "s");
        if (C5163j2.m20294x(context)) {
            alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(currentTimeMillis, s_pendingIntent), s_pendingIntent);
        } else if (Build.VERSION.SDK_INT >= 23) {
            alarmManager.setExactAndAllowWhileIdle(0, currentTimeMillis, s_pendingIntent);
        } else {
            alarmManager.setExact(0, currentTimeMillis, s_pendingIntent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_inRange ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_inRange ? m21955l3()[0] : m21955l3()[1];
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_cellGroupName;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            new Handler(mo27827K0().getMainLooper()).post(new C5907e2(this));
            if (s_pendingIntent != null) {
                ((AlarmManager) mo27827K0().getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(s_pendingIntent);
                s_pendingIntent = null;
            }
            if (s_updateRateReceiver != null) {
                try {
                    mo27827K0().unregisterReceiver(s_updateRateReceiver);
                } catch (Exception e) {
                    C8151a.m33873n(e);
                }
            }
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7548r.m31412u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            m21958p3(mo27827K0());
            IntentFilter intentFilter = new IntentFilter("CellTowerUpdateRateIntent");
            s_updateRateReceiver = new C5625b(this, (C5624a) null);
            mo27827K0().registerReceiver(s_updateRateReceiver, intentFilter);
            new Handler(mo27827K0().getMainLooper()).post(new C5919f2(this));
        }
        s_triggerCounter++;
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m21955l3();
    }

    /* renamed from: i3 */
    public String mo31042i3() {
        return this.m_cellGroupName;
    }

    /* renamed from: j3 */
    public List<String> mo31043j3() {
        return this.m_cellIds;
    }

    /* renamed from: k3 */
    public boolean mo31044k3() {
        return this.m_inRange;
    }

    /* renamed from: n2 */
    public boolean mo25733n2() {
        return Build.VERSION.SDK_INT > 26;
    }

    /* renamed from: o3 */
    public void mo31045o3() {
        if (this.m_cellIds != null) {
            for (int i = 0; i < this.m_cellIds.size(); i++) {
                ArrayList<String> arrayList = this.m_cellIds;
                arrayList.set(i, C7964a.convertLegacyCellTowerId(arrayList.get(i)));
            }
        }
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        if (i == REQUEST_CODE_CELL_TOWER_LIST && i2 == -1) {
            this.m_cellGroupName = intent.getStringExtra("CellTowerGroupName");
            this.m_cellIds = intent.getStringArrayListExtra("CellTowerList");
            mo24689O1();
        }
    }

    /* renamed from: q3 */
    public void mo31046q3(String str) {
        this.m_cellGroupName = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        Activity j0 = mo27850j0();
        Intent intent = new Intent(j0, CellTowerListActivity.class);
        intent.putExtra("ThemeType", 1);
        j0.startActivityForResult(intent, REQUEST_CODE_CELL_TOWER_LIST);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_inRange ? 1 : 0);
        parcel.writeString(this.m_cellGroupName);
        parcel.writeStringList(this.m_cellIds);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_inRange = i == 0;
    }

    public CellTowerTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private CellTowerTrigger() {
        this.m_inRange = true;
        this.m_cellIds = new ArrayList<>();
    }

    private CellTowerTrigger(Parcel parcel) {
        super(parcel);
        this.m_inRange = parcel.readInt() != 0;
        this.m_cellGroupName = parcel.readString();
        ArrayList<String> arrayList = new ArrayList<>();
        this.m_cellIds = arrayList;
        parcel.readStringList(arrayList);
    }
}

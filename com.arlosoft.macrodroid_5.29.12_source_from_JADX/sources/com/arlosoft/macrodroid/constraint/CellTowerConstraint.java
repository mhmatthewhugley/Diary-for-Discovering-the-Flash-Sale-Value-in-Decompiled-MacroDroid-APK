package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.celltowers.C3932l;
import com.arlosoft.macrodroid.celltowers.C3943v;
import com.arlosoft.macrodroid.celltowers.CellTowerListActivity;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.database.C4373a;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.selectableitemlist.AddConditionActivity;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p123l1.C7624k;
import p135n1.C7964a;

public class CellTowerConstraint extends Constraint {
    public static final Parcelable.Creator<CellTowerConstraint> CREATOR = new C4128a();
    private static final int REQUEST_CODE_PICK_CELL_TOWER = 38234444;
    private String m_cellGroupName;
    private ArrayList<String> m_cellIds;
    private boolean m_inRange;

    /* renamed from: com.arlosoft.macrodroid.constraint.CellTowerConstraint$a */
    class C4128a implements Parcelable.Creator<CellTowerConstraint> {
        C4128a() {
        }

        /* renamed from: a */
        public CellTowerConstraint createFromParcel(Parcel parcel) {
            return new CellTowerConstraint(parcel, (C4128a) null);
        }

        /* renamed from: b */
        public CellTowerConstraint[] newArray(int i) {
            return new CellTowerConstraint[i];
        }
    }

    /* synthetic */ CellTowerConstraint(Parcel parcel, C4128a aVar) {
        this(parcel);
    }

    /* renamed from: h3 */
    private String[] m16308h3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_cell_towers_in_range), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_cell_towers_out_of_range)};
    }

    /* renamed from: i3 */
    private boolean m16309i3(String str, List<C3943v.C3944a> list) {
        for (C3943v.C3944a aVar : list) {
            if (aVar.f10258c.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_inRange ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_inRange ? m16308h3()[0] : m16308h3()[1];
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_cellGroupName;
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        boolean z;
        List<C3943v.C3944a> a = C3943v.m15317a(mo27827K0());
        Set<String> f = C4373a.m17336h().mo28639f();
        C7964a d = C3932l.m15307e().mo27631d(this.m_cellGroupName);
        if (d == null) {
            Iterator<String> it = this.m_cellIds.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (m16309i3(it.next(), a)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        } else {
            Iterator<String> it2 = d.getCellTowerIds().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                String next = it2.next();
                if (!f.contains(next) && !d.isIgnore(next) && m16309i3(next, a)) {
                    C4878b.m18880s("Cell Tower constraint - found cellId: " + next + " matches group: " + d.getName(), mo27840Y0().longValue());
                    z = true;
                    break;
                }
            }
            C4878b.m18880s("Cell Tower constraint - no tower found from group: " + d.getName(), mo27840Y0().longValue());
            C4878b.m18880s("Cell Towers found: " + a, mo27840Y0().longValue());
        }
        if (this.m_inRange == z) {
            return true;
        }
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7624k.m31754u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.ACCESS_COARSE_LOCATION"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16308h3();
    }

    /* renamed from: g3 */
    public String mo28100g3() {
        return this.m_cellGroupName;
    }

    /* renamed from: j3 */
    public void mo28101j3() {
        if (this.m_cellIds != null) {
            for (int i = 0; i < this.m_cellIds.size(); i++) {
                ArrayList<String> arrayList = this.m_cellIds;
                arrayList.set(i, C7964a.convertLegacyCellTowerId(arrayList.get(i)));
            }
        }
    }

    /* renamed from: k3 */
    public void mo28102k3(String str) {
        this.m_cellGroupName = str;
    }

    /* renamed from: n2 */
    public boolean mo25733n2() {
        return Build.VERSION.SDK_INT > 26;
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        if (i == REQUEST_CODE_PICK_CELL_TOWER && i2 == -1) {
            mo27877y2(activity);
            this.m_cellGroupName = intent.getStringExtra("CellTowerGroupName");
            this.m_cellIds = intent.getStringArrayListExtra("CellTowerList");
            mo24689O1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        Activity j0 = mo27850j0();
        Intent intent = new Intent(j0, CellTowerListActivity.class);
        intent.putExtra("ThemeType", j0 instanceof AddConditionActivity ? 3 : 2);
        j0.startActivityForResult(intent, REQUEST_CODE_PICK_CELL_TOWER);
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

    public CellTowerConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private CellTowerConstraint() {
        this.m_inRange = true;
        this.m_cellIds = new ArrayList<>();
    }

    private CellTowerConstraint(Parcel parcel) {
        super(parcel);
        this.m_inRange = parcel.readInt() != 0;
        this.m_cellGroupName = parcel.readString();
        ArrayList<String> arrayList = new ArrayList<>();
        this.m_cellIds = arrayList;
        parcel.readStringList(arrayList);
    }
}

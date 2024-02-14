package p167t1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.constraint.GeofenceConstraint;
import com.arlosoft.macrodroid.constraint.LogicConstraint;
import com.arlosoft.macrodroid.geofences.C4708a;
import com.arlosoft.macrodroid.geofences.GeofenceInfo;
import com.arlosoft.macrodroid.geofences.GeofenceStore;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.LocationTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.util.Iterator;
import java.util.List;
import p081e1.C7264a;

/* renamed from: t1.k */
/* compiled from: ConfigureZonePresenter */
public class C10248k {

    /* renamed from: a */
    private C10249l f23382a;

    /* renamed from: b */
    private GeofenceInfo f23383b;

    /* renamed from: c */
    private boolean f23384c;

    /* renamed from: d */
    private boolean f23385d;

    /* renamed from: e */
    private GeofenceStore f23386e;

    /* renamed from: f */
    private final C7264a f23387f;

    /* renamed from: g */
    private final String f23388g;

    public C10248k(@NonNull C7264a aVar, @Nullable String str) {
        this.f23387f = aVar;
        this.f23388g = str;
        GeofenceStore geofenceStore = (GeofenceStore) aVar.mo37133c("GeofenceInfo", GeofenceStore.class);
        this.f23386e = geofenceStore;
        if (geofenceStore == null) {
            this.f23386e = new GeofenceStore();
        }
    }

    /* renamed from: g */
    private void m40285g(Constraint constraint, String str, String str2) {
        if (constraint instanceof GeofenceConstraint) {
            GeofenceConstraint geofenceConstraint = (GeofenceConstraint) constraint;
            if (geofenceConstraint.mo28164q3() != null && geofenceConstraint.mo28164q3().equals(str)) {
                geofenceConstraint.mo28165z3(str2);
            }
        }
        if (constraint instanceof LogicConstraint) {
            for (Constraint g : ((LogicConstraint) constraint).mo27826J0()) {
                m40285g(g, str, str2);
            }
        }
    }

    /* renamed from: a */
    public void mo40859a() {
        this.f23382a.mo29217P0(this.f23383b.getRadius());
    }

    /* renamed from: b */
    public void mo40860b() {
        String str = this.f23388g;
        if (str != null) {
            this.f23386e.removeGeofence(str);
            this.f23387f.mo37132b("GeofenceInfo", this.f23386e);
            C4708a.m18258a(this.f23383b.getId());
        }
        this.f23382a.mo29214F(true);
    }

    /* renamed from: c */
    public void mo40861c() {
        if (!this.f23384c) {
            this.f23382a.mo29214F(true);
        } else {
            this.f23382a.mo29215L();
        }
    }

    /* renamed from: d */
    public void mo40862d(String str) {
        this.f23383b = new GeofenceInfo(this.f23383b.getId(), str, this.f23383b.getLatitude(), this.f23383b.getLongitude(), this.f23383b.getRadius(), 0);
        this.f23384c = true;
        mo40869l();
    }

    /* renamed from: e */
    public void mo40863e() {
        this.f23382a.mo29219S(this.f23383b.getRadius());
    }

    /* renamed from: f */
    public void mo40864f(int i) {
        this.f23383b = new GeofenceInfo(this.f23383b.getId(), this.f23383b.getName(), this.f23383b.getLatitude(), this.f23383b.getLongitude(), i, 0);
        this.f23382a.mo29216P(i);
        this.f23382a.mo29217P0(i);
        this.f23384c = true;
        mo40869l();
    }

    /* renamed from: h */
    public void mo40865h() {
        this.f23382a.mo29221d1();
    }

    /* renamed from: i */
    public void mo40866i(String str, String str2) {
        List<GeofenceInfo> geofenceList = this.f23386e.getGeofenceList();
        if (str2.length() == 0) {
            this.f23382a.mo29222i0();
            return;
        }
        for (GeofenceInfo next : geofenceList) {
            if (!next.getId().equals(this.f23388g) && next.getName().equals(str2)) {
                this.f23382a.mo29213D1();
                return;
            }
        }
        GeofenceInfo geofenceInfo = new GeofenceInfo(this.f23383b.getId(), str2, this.f23383b.getLatitude(), this.f23383b.getLongitude(), this.f23383b.getRadius(), 0);
        this.f23383b = geofenceInfo;
        this.f23386e.setGeofence(geofenceInfo.getId(), this.f23383b);
        this.f23387f.mo37132b("GeofenceInfo", this.f23386e);
        this.f23382a.mo29218R();
        for (Macro next2 : C4934n.m18998M().mo29673C()) {
            Iterator<Trigger> it = next2.getTriggerList().iterator();
            while (it.hasNext()) {
                Trigger next3 = it.next();
                if (next3 instanceof LocationTrigger) {
                    ((LocationTrigger) next3).mo31292v3();
                }
                for (Constraint g : next3.mo27826J0()) {
                    m40285g(g, str, str2);
                }
            }
            Iterator<Action> it2 = next2.getActions().iterator();
            while (it2.hasNext()) {
                for (Constraint g2 : it2.next().mo27826J0()) {
                    m40285g(g2, str, str2);
                }
            }
            for (Constraint g3 : next2.getConstraints()) {
                m40285g(g3, str, str2);
            }
        }
    }

    /* renamed from: j */
    public void mo40867j(double d, double d2) {
        GeofenceInfo geofenceInfo = new GeofenceInfo(this.f23383b.getId(), this.f23383b.getName(), d, d2, this.f23383b.getRadius(), 0);
        this.f23383b = geofenceInfo;
        this.f23382a.mo29217P0(geofenceInfo.getRadius());
        if (this.f23385d) {
            this.f23384c = true;
        } else {
            this.f23385d = true;
        }
        mo40869l();
    }

    /* renamed from: k */
    public void mo40868k(int i) {
        this.f23383b = new GeofenceInfo(this.f23383b.getId(), this.f23383b.getName(), this.f23383b.getLatitude(), this.f23383b.getLongitude(), i, 0);
        this.f23382a.mo29216P(i);
        this.f23382a.mo29217P0(i);
        this.f23382a.mo29223j0(Math.min(SamsungIrisUnlockModule.IRIS_ERROR_NEED_TO_RETRY, i));
    }

    /* renamed from: l */
    public void mo40869l() {
        if (!this.f23384c || this.f23383b.getName().length() <= 0) {
            this.f23382a.mo29220W(false);
        } else {
            this.f23382a.mo29220W(true);
        }
    }

    /* renamed from: m */
    public void mo40870m(C10249l lVar, GeofenceInfo geofenceInfo) {
        this.f23382a = lVar;
        this.f23383b = geofenceInfo;
        lVar.mo29216P(geofenceInfo.getRadius());
    }
}

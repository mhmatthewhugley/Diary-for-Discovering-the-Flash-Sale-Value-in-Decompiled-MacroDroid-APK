package org.altbeacon.beacon.service;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.Region;
import p097gd.C7354d;

/* renamed from: org.altbeacon.beacon.service.p */
/* compiled from: SettingsData */
public class C16030p implements Serializable {

    /* renamed from: a */
    private static final String f65973a = C16030p.class.getSimpleName();
    Boolean mAndroidLScanningDisabled;
    ArrayList<BeaconParser> mBeaconParsers;
    Boolean mHardwareEqualityEnforced;
    Long mRegionExitPeriod;
    Boolean mRegionStatePersistenceEnabled;
    Boolean mUseTrackingCache;

    /* renamed from: c */
    public static C16030p m96655c(@NonNull Bundle bundle) {
        bundle.setClassLoader(Region.class.getClassLoader());
        if (bundle.get("SettingsData") != null) {
            return (C16030p) bundle.getSerializable("SettingsData");
        }
        return null;
    }

    /* renamed from: a */
    public void mo76527a(@NonNull BeaconService beaconService) {
        String str = f65973a;
        C7354d.m30376a(str, "Applying settings changes to scanner in other process", new Object[0]);
        BeaconManager A = BeaconManager.m33479A(beaconService);
        List<BeaconParser> r = A.mo38009r();
        boolean z = true;
        if (r.size() == this.mBeaconParsers.size()) {
            int i = 0;
            while (true) {
                if (i >= r.size()) {
                    z = false;
                    break;
                } else if (!r.get(i).equals(this.mBeaconParsers.get(i))) {
                    String str2 = f65973a;
                    C7354d.m30376a(str2, "Beacon parsers have changed to: " + this.mBeaconParsers.get(i).mo38023k(), new Object[0]);
                    break;
                } else {
                    i++;
                }
            }
        } else {
            C7354d.m30376a(str, "Beacon parsers have been added or removed.", new Object[0]);
        }
        if (z) {
            C7354d.m30376a(f65973a, "Updating beacon parsers", new Object[0]);
            A.mo38009r().clear();
            A.mo38009r().addAll(this.mBeaconParsers);
            beaconService.mo76402d();
        } else {
            C7354d.m30376a(f65973a, "Beacon parsers unchanged.", new Object[0]);
        }
        C16015f d = C16015f.m96542d(beaconService);
        if (d.mo76443h() && !this.mRegionStatePersistenceEnabled.booleanValue()) {
            d.mo76452s();
        } else if (!d.mo76443h() && this.mRegionStatePersistenceEnabled.booleanValue()) {
            d.mo76450q();
        }
        BeaconManager.m33486X(this.mAndroidLScanningDisabled.booleanValue());
        BeaconManager.m33488a0(this.mRegionExitPeriod.longValue());
        C16016g.m96565e(this.mUseTrackingCache.booleanValue());
        Beacon.m33457u(this.mHardwareEqualityEnforced.booleanValue());
    }

    /* renamed from: b */
    public C16030p mo76528b(@NonNull Context context) {
        BeaconManager A = BeaconManager.m33479A(context);
        this.mBeaconParsers = new ArrayList<>(A.mo38009r());
        this.mRegionStatePersistenceEnabled = Boolean.valueOf(A.mo37983R());
        this.mAndroidLScanningDisabled = Boolean.valueOf(BeaconManager.m33483M());
        this.mRegionExitPeriod = Long.valueOf(BeaconManager.m33480H());
        this.mUseTrackingCache = Boolean.valueOf(C16016g.m96564d());
        this.mHardwareEqualityEnforced = Boolean.valueOf(Beacon.m33455h());
        return this;
    }

    /* renamed from: d */
    public Bundle mo76529d() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("SettingsData", this);
        return bundle;
    }
}

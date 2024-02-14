package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.WorkRequest;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.LocationTrigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.google.android.gms.location.LocationRequest;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.concurrent.TimeUnit;
import org.apache.commons.p353io.FilenameUtils;
import p053xe.C2164a;
import p128m0.C7731e1;
import p459ef.C17163i;

public class ForceLocationUpdateAction extends Action {
    public static final Parcelable.Creator<ForceLocationUpdateAction> CREATOR = new C2467a();
    private transient C17163i subscription;

    /* renamed from: com.arlosoft.macrodroid.action.ForceLocationUpdateAction$a */
    class C2467a implements Parcelable.Creator<ForceLocationUpdateAction> {
        C2467a() {
        }

        /* renamed from: a */
        public ForceLocationUpdateAction createFromParcel(Parcel parcel) {
            return new ForceLocationUpdateAction(parcel, (C2467a) null);
        }

        /* renamed from: b */
        public ForceLocationUpdateAction[] newArray(int i) {
            return new ForceLocationUpdateAction[i];
        }
    }

    /* synthetic */ ForceLocationUpdateAction(Parcel parcel, C2467a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public /* synthetic */ void m10836l3(Location location) {
        if (location != null) {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
            decimalFormatSymbols.setDecimalSeparator(FilenameUtils.EXTENSION_SEPARATOR);
            DecimalFormat decimalFormat = new DecimalFormat("#.#######", decimalFormatSymbols);
            String str = "http://maps.google.com/maps?q=" + location.getLatitude() + "," + location.getLongitude() + "&center=" + decimalFormat.format(location.getLatitude()) + "," + decimalFormat.format(location.getLongitude());
            C4878b.m18874m("Forced Location Update: <a href=\"" + str + "\">" + str + " (Uncertainty=" + location.getAccuracy() + "m)</a>", mo27840Y0().longValue());
        } else {
            C4878b.m18869h("Force location update failed (location is null)", mo27840Y0().longValue());
        }
        C17163i iVar = this.subscription;
        if (iVar != null && !iVar.mo80449b()) {
            this.subscription.mo80450d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public /* synthetic */ void m10837m3(Throwable th) {
        C4878b.m18869h("Force location update failed: " + th.toString(), mo27840Y0().longValue());
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7731e1.m32246u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        LocationTrigger.m22607k3();
        C17163i iVar = this.subscription;
        if (iVar == null || iVar.mo80449b()) {
            C4878b.m18874m("Forcing a location update", mo27840Y0().longValue());
            try {
                this.subscription = new C2164a(mo27827K0()).mo24388a(LocationRequest.m64672l2().mo54187p2(102).mo54186o2(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS)).mo80438n(30, TimeUnit.SECONDS).mo80435k(new C3163j6(this), new C3191k6(this));
            } catch (SecurityException unused) {
                C4878b.m18869h("Force location update failed - required location permission", mo27840Y0().longValue());
            }
        }
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
    }

    public ForceLocationUpdateAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private ForceLocationUpdateAction() {
    }

    private ForceLocationUpdateAction(Parcel parcel) {
        super(parcel);
    }
}

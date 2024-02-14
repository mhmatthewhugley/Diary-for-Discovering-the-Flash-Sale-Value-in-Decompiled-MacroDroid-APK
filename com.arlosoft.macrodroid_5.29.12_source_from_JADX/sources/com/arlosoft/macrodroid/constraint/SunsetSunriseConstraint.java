package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.activities.LocationChooserActivity;
import java.util.Arrays;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import p123l1.C7657y0;
import p319lc.C15626c;

/* compiled from: SunsetSunriseConstraint.kt */
public final class SunsetSunriseConstraint extends Constraint {
    public static final Parcelable.Creator<SunsetSunriseConstraint> CREATOR = new C4191a();
    private static final int OPTION_AFTER_SUNRISE = 1;
    private static final int OPTION_AFTER_SUNSET = 3;
    private static final int OPTION_BEFORE_SUNRISE = 0;
    private static final int OPTION_BEFORE_SUNSET = 2;
    private static final int SET_LOCATION = 1;

    /* renamed from: f */
    public static final C4192b f10761f = new C4192b((C13695i) null);
    private int option;

    /* renamed from: com.arlosoft.macrodroid.constraint.SunsetSunriseConstraint$a */
    /* compiled from: SunsetSunriseConstraint.kt */
    public static final class C4191a implements Parcelable.Creator<SunsetSunriseConstraint> {
        C4191a() {
        }

        /* renamed from: a */
        public SunsetSunriseConstraint createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new SunsetSunriseConstraint(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public SunsetSunriseConstraint[] newArray(int i) {
            return new SunsetSunriseConstraint[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.SunsetSunriseConstraint$b */
    /* compiled from: SunsetSunriseConstraint.kt */
    public static final class C4192b {
        private C4192b() {
        }

        public /* synthetic */ C4192b(C13695i iVar) {
            this();
        }
    }

    public SunsetSunriseConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ SunsetSunriseConstraint(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: h3 */
    private final String[] m17043h3() {
        C13696i0 i0Var = C13696i0.f61931a;
        String j1 = SelectableItem.m15535j1(C17541R$string.before_sunrise_option);
        C13706o.m87928e(j1, "getString(R.string.before_sunrise_option)");
        String format = String.format(j1, Arrays.copyOf(new Object[0], 0));
        C13706o.m87928e(format, "format(format, *args)");
        String j12 = SelectableItem.m15535j1(C17541R$string.after_sunrise_option);
        C13706o.m87928e(j12, "getString(R.string.after_sunrise_option)");
        String format2 = String.format(j12, Arrays.copyOf(new Object[0], 0));
        C13706o.m87928e(format2, "format(format, *args)");
        String j13 = SelectableItem.m15535j1(C17541R$string.before_sunset_option);
        C13706o.m87928e(j13, "getString(R.string.before_sunset_option)");
        String format3 = String.format(j13, Arrays.copyOf(new Object[0], 0));
        C13706o.m87928e(format3, "format(format, *args)");
        String j14 = SelectableItem.m15535j1(C17541R$string.after_sunset_option);
        C13706o.m87928e(j14, "getString(R.string.after_sunset_option)");
        String format4 = String.format(j14, Arrays.copyOf(new Object[0], 0));
        C13706o.m87928e(format4, "format(format, *args)");
        return new String[]{format, format2, format3, format4};
    }

    /* renamed from: i3 */
    private final void m17044i3(Activity activity) {
        C13706o.m87926c(activity);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, mo24705l0());
        builder.setTitle((int) C17541R$string.trigger_weather_set_location);
        builder.setMessage((int) C17541R$string.trigger_sunrise_sunset_location_set_message).setCancelable(true).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4248e3(activity, this));
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public static final void m17045j3(Activity activity, SunsetSunriseConstraint sunsetSunriseConstraint, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(sunsetSunriseConstraint, "this$0");
        try {
            activity.startActivityForResult(new Intent(activity, LocationChooserActivity.class), 1);
        } catch (NoClassDefFoundError unused) {
            C15626c.m94876a(sunsetSunriseConstraint.mo27827K0().getApplicationContext(), sunsetSunriseConstraint.mo27827K0().getString(C17541R$string.toast_broken_map_activity), 0).show();
        }
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.option;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m17043h3()[this.option];
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cb  */
    /* renamed from: Q2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo28033Q2(com.arlosoft.macrodroid.triggers.TriggerContextInfo r9) {
        /*
            r8 = this;
            android.content.Context r9 = r8.mo27827K0()
            java.lang.String r9 = com.arlosoft.macrodroid.settings.C5163j2.m20145e2(r9)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 0
            if (r0 == 0) goto L_0x0022
            java.lang.Long r9 = r8.mo27840Y0()
            java.lang.String r0 = "macroGuid"
            kotlin.jvm.internal.C13706o.m87928e(r9, r0)
            long r2 = r9.longValue()
            java.lang.String r9 = "Failed to evaluate sunset/sunrise constraint - no location set"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r9, r2)
            return r1
        L_0x0022:
            java.lang.String r0 = "locationString"
            kotlin.jvm.internal.C13706o.m87928e(r9, r0)
            kotlin.text.j r0 = new kotlin.text.j
            java.lang.String r2 = ","
            r0.<init>((java.lang.String) r2)
            java.util.List r9 = r0.mo74470e(r9, r1)
            boolean r0 = r9.isEmpty()
            r2 = 1
            if (r0 != 0) goto L_0x0062
            int r0 = r9.size()
            java.util.ListIterator r0 = r9.listIterator(r0)
        L_0x0041:
            boolean r3 = r0.hasPrevious()
            if (r3 == 0) goto L_0x0062
            java.lang.Object r3 = r0.previous()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0055
            r3 = 1
            goto L_0x0056
        L_0x0055:
            r3 = 0
        L_0x0056:
            if (r3 != 0) goto L_0x0041
            int r0 = r0.nextIndex()
            int r0 = r0 + r2
            java.util.List r9 = kotlin.collections.C13566b0.m87451z0(r9, r0)
            goto L_0x0066
        L_0x0062:
            java.util.List r9 = kotlin.collections.C13614t.m87748j()
        L_0x0066:
            java.lang.String[] r0 = new java.lang.String[r1]
            java.lang.Object[] r9 = r9.toArray(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            kotlin.jvm.internal.C13706o.m87927d(r9, r0)
            java.lang.String[] r9 = (java.lang.String[]) r9
            r0 = r9[r1]
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r9 = r9[r2]
            java.lang.Double r9 = java.lang.Double.valueOf(r9)
            c7.a r3 = new c7.a
            java.lang.String r4 = "lat"
            kotlin.jvm.internal.C13706o.m87928e(r0, r4)
            double r4 = r0.doubleValue()
            java.lang.String r0 = "lon"
            kotlin.jvm.internal.C13706o.m87928e(r9, r0)
            double r6 = r9.doubleValue()
            r3.<init>(r4, r6)
            a7.a r9 = new a7.a
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            r9.<init>(r3, r0)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            int r3 = r8.option
            if (r3 == 0) goto L_0x00bd
            if (r3 != r2) goto L_0x00aa
            goto L_0x00bd
        L_0x00aa:
            java.util.Calendar r9 = r9.mo62044b(r0)
            boolean r9 = r0.before(r9)
            int r0 = r8.option
            r3 = 2
            if (r0 != r3) goto L_0x00b9
            r1 = r9
            goto L_0x00bc
        L_0x00b9:
            if (r9 != 0) goto L_0x00bc
            r1 = 1
        L_0x00bc:
            return r1
        L_0x00bd:
            java.util.Calendar r9 = r9.mo62043a(r0)
            boolean r9 = r0.before(r9)
            int r0 = r8.option
            if (r0 != 0) goto L_0x00cb
            r1 = r9
            goto L_0x00ce
        L_0x00cb:
            if (r9 != 0) goto L_0x00ce
            r1 = 1
        L_0x00ce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.constraint.SunsetSunriseConstraint.mo28033Q2(com.arlosoft.macrodroid.triggers.TriggerContextInfo):boolean");
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7657y0.f18564g.mo37671a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m17043h3();
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        C13706o.m87929f(activity, "activity");
        mo27877y2(activity);
        if (i == 1 && i2 == -1 && intent != null) {
            double doubleExtra = intent.getDoubleExtra("Latitude", 0.0d);
            double doubleExtra2 = intent.getDoubleExtra("Longitude", 0.0d);
            Context K0 = mo27827K0();
            StringBuilder sb = new StringBuilder();
            sb.append(doubleExtra);
            sb.append(',');
            sb.append(doubleExtra2);
            C5163j2.m20067T5(K0, sb.toString());
            super.mo24689O1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        String e2 = C5163j2.m20145e2(mo27827K0());
        C13706o.m87928e(e2, "getSunriseSunsetLatLon(context)");
        if (e2.length() == 0) {
            m17044i3(mo27850j0());
        } else {
            super.mo24689O1();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.option);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.option = i;
    }

    private SunsetSunriseConstraint() {
    }

    private SunsetSunriseConstraint(Parcel parcel) {
        super(parcel);
        this.option = parcel.readInt();
    }
}

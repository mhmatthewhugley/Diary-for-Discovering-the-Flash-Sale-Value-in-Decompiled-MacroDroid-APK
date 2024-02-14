package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.extensions.C4656c;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.receivers.SleepReceiver;
import com.google.android.gms.location.ActivityRecognition;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.tasks.Task;
import com.innovattic.rangeseekbar.RangeSeekBar;
import java.util.Arrays;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import p119k3.C7569w1;

/* compiled from: SleepTrigger.kt */
public final class SleepTrigger extends Trigger {
    public static final Parcelable.Creator<SleepTrigger> CREATOR = new C5745a();
    private static final int OPTION_FALL_ASLEEP = 0;
    private static final int OPTION_WAKE_UP = 1;

    /* renamed from: d */
    public static final C5746b f13681d = new C5746b((C13695i) null);
    private static PendingIntent pendingIntent;
    private static int triggerCount;
    private int option;

    /* renamed from: com.arlosoft.macrodroid.triggers.SleepTrigger$a */
    /* compiled from: SleepTrigger.kt */
    public static final class C5745a implements Parcelable.Creator<SleepTrigger> {
        C5745a() {
        }

        /* renamed from: a */
        public SleepTrigger createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new SleepTrigger(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public SleepTrigger[] newArray(int i) {
            return new SleepTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.SleepTrigger$b */
    /* compiled from: SleepTrigger.kt */
    public static final class C5746b {
        private C5746b() {
        }

        public /* synthetic */ C5746b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.SleepTrigger$c */
    /* compiled from: SleepTrigger.kt */
    public static final class C5747c implements RangeSeekBar.C11668b {

        /* renamed from: a */
        final /* synthetic */ TextView f13682a;

        /* renamed from: b */
        final /* synthetic */ TextView f13683b;

        C5747c(TextView textView, TextView textView2) {
            this.f13682a = textView;
            this.f13683b = textView2;
        }

        /* renamed from: a */
        public void mo31503a() {
        }

        /* renamed from: b */
        public void mo31504b() {
        }

        /* renamed from: c */
        public void mo31505c(int i, int i2) {
            TextView textView = this.f13682a;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            TextView textView2 = this.f13683b;
            if (textView2 != null) {
                textView2.setText(String.valueOf(i2));
            }
        }
    }

    public SleepTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ SleepTrigger(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: m3 */
    private final boolean m23195m3() {
        return ContextCompat.checkSelfPermission(mo27827K0(), "android.permission.ACTIVITY_RECOGNITION") == 0;
    }

    /* renamed from: n3 */
    private final void m23196n3() {
        if (mo27836X()) {
            AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.dialog_sleep_tracking_confidence);
            appCompatDialog.setTitle((CharSequence) m23199q3()[this.option]);
            C4656c.m18114c(appCompatDialog, 0);
            RangeSeekBar rangeSeekBar = (RangeSeekBar) appCompatDialog.findViewById(C17532R$id.rangeSeekBar);
            Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
            Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
            TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.awakeThresholdValue);
            TextView textView2 = (TextView) appCompatDialog.findViewById(C17532R$id.asleepThresholdValue);
            int a2 = C5163j2.m20113a2(mo27827K0());
            int Z1 = C5163j2.m20105Z1(mo27827K0());
            if (rangeSeekBar != null) {
                rangeSeekBar.setMinThumbValue(a2);
            }
            if (rangeSeekBar != null) {
                rangeSeekBar.setMaxThumbValue(Z1);
            }
            if (textView != null) {
                textView.setText(String.valueOf(a2));
            }
            if (textView2 != null) {
                textView2.setText(String.valueOf(Z1));
            }
            if (rangeSeekBar != null) {
                rangeSeekBar.setSeekBarChangeListener(new C5747c(textView, textView2));
            }
            if (button != null) {
                button.setOnClickListener(new C5936g7(appCompatDialog, this, rangeSeekBar));
            }
            if (button2 != null) {
                button2.setOnClickListener(new C5924f7(appCompatDialog));
            }
            appCompatDialog.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public static final void m23197o3(AppCompatDialog appCompatDialog, SleepTrigger sleepTrigger, RangeSeekBar rangeSeekBar, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        C13706o.m87929f(sleepTrigger, "this$0");
        appCompatDialog.dismiss();
        int i = 0;
        C5163j2.m20039P5(sleepTrigger.mo27827K0(), rangeSeekBar != null ? rangeSeekBar.getMinThumbValue() : 0);
        Context K0 = sleepTrigger.mo27827K0();
        if (rangeSeekBar != null) {
            i = rangeSeekBar.getMaxThumbValue();
        }
        C5163j2.m20032O5(K0, i);
        sleepTrigger.mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public static final void m23198p3(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.cancel();
    }

    /* renamed from: q3 */
    private final String[] m23199q3() {
        C13696i0 i0Var = C13696i0.f61931a;
        String j1 = SelectableItem.m15535j1(C17541R$string.trigger_sleep_fell_asleep);
        C13706o.m87928e(j1, "getString(R.string.trigger_sleep_fell_asleep)");
        String format = String.format(j1, Arrays.copyOf(new Object[0], 0));
        C13706o.m87928e(format, "format(format, *args)");
        String j12 = SelectableItem.m15535j1(C17541R$string.trigger_sleep_woke_up);
        C13706o.m87928e(j12, "getString(R.string.trigger_sleep_woke_up)");
        String format2 = String.format(j12, Arrays.copyOf(new Object[0], 0));
        C13706o.m87928e(format2, "format(format, *args)");
        return new String[]{format, format2};
    }

    /* renamed from: r3 */
    private final void m23200r3(PendingIntent pendingIntent2) {
        if (m23195m3()) {
            Task<Void> H = ActivityRecognition.m64622a(mo27827K0()).mo54117H(pendingIntent2, SleepSegmentRequest.m64699l2());
            C13706o.m87928e(H, "getClient(context).reque…quest()\n                )");
            H.mo23708i(new C5972j7(this));
            H.mo23705f(new C5948h7(this));
            return;
        }
        C4878b.m18868g("Cannot subscribe to sleep data, activity recognition permission has not been granted");
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static final void m23201s3(SleepTrigger sleepTrigger, Void voidR) {
        C13706o.m87929f(sleepTrigger, "this$0");
        C4878b.m18879r("Sleep tracking enabled");
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public static final void m23202t3(SleepTrigger sleepTrigger, Exception exc) {
        C13706o.m87929f(sleepTrigger, "this$0");
        C13706o.m87929f(exc, "exception");
        C4878b.m18879r("Failed to subscribe to sleep sleep data: " + exc);
    }

    /* renamed from: v3 */
    private final void m23203v3(PendingIntent pendingIntent2) {
        try {
            Task<Void> G = ActivityRecognition.m64622a(mo27827K0()).mo54116G(pendingIntent2);
            C13706o.m87928e(G, "getClient(context).remov…entUpdates(pendingIntent)");
            G.mo23708i(new C5984k7(this));
            G.mo23705f(C5960i7.f14113a);
        } catch (Exception e) {
            C4878b.m18868g("Exception when unsubscribing to sleep data: " + e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public static final void m23204w3(SleepTrigger sleepTrigger, Void voidR) {
        C13706o.m87929f(sleepTrigger, "this$0");
        C4878b.m18864c("Sleep tracking disabled.");
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public static final void m23205x3(Exception exc) {
        C13706o.m87929f(exc, "exception");
        C4878b.m18868g("Exception when unsubscribing to sleep data: " + exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m23199q3()[this.option];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = triggerCount - 1;
        triggerCount = i;
        if (i == 0) {
            PendingIntent pendingIntent2 = pendingIntent;
            if (pendingIntent2 != null) {
                m23203v3(pendingIntent2);
            }
            pendingIntent = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7569w1.f18474j.mo37654a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo25559a1() + " (" + mo24672O0() + ')';
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (triggerCount == 0) {
            SleepReceiver.C6075a aVar = SleepReceiver.f14376a;
            Context K0 = mo27827K0();
            C13706o.m87928e(K0, "context");
            PendingIntent a = aVar.mo31976a(K0);
            pendingIntent = a;
            C13706o.m87926c(a);
            m23200r3(a);
        }
        triggerCount++;
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return Build.VERSION.SDK_INT >= 29 ? new String[]{"android.permission.ACTIVITY_RECOGNITION"} : new String[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m23199q3();
    }

    /* renamed from: u3 */
    public final boolean mo31498u3() {
        return this.option == 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        m23196n3();
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

    public SleepTrigger() {
    }

    private SleepTrigger(Parcel parcel) {
        super(parcel);
        this.option = parcel.readInt();
    }
}

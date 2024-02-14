package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.triggers.WidgetPressedTrigger;
import com.arlosoft.macrodroid.triggers.activities.WidgetConfigureActivity;
import com.arlosoft.macrodroid.triggers.receivers.widget.WidgetProviderCustom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p057a2.C2224m;
import p128m0.C7880y;
import p148q0.C8151a;
import p319lc.C15626c;

public class ConfigureWidgetButtonAction extends Action implements C2224m {
    public static final Parcelable.Creator<ConfigureWidgetButtonAction> CREATOR = new C2374a();
    private static final int MACRO_ID_THIS_MACRO = -99;
    private static final int REQUEST_CODE_WIDGET_CONFIGURE = 12934543;
    private boolean m_faded;
    private String m_imagePackageName;
    private String m_imageResourceName;
    private String m_imageUri;
    private long m_macroId;
    private transient List<Long> m_macroIdList;
    private String m_optionName;
    private transient List<String> m_optionNames;
    private long m_triggerGUID;
    private transient List<Long> m_triggerGUIDList;
    private String m_widgetLabel;

    /* renamed from: com.arlosoft.macrodroid.action.ConfigureWidgetButtonAction$a */
    class C2374a implements Parcelable.Creator<ConfigureWidgetButtonAction> {
        C2374a() {
        }

        /* renamed from: a */
        public ConfigureWidgetButtonAction createFromParcel(Parcel parcel) {
            return new ConfigureWidgetButtonAction(parcel, (C2374a) null);
        }

        /* renamed from: b */
        public ConfigureWidgetButtonAction[] newArray(int i) {
            return new ConfigureWidgetButtonAction[i];
        }
    }

    /* synthetic */ ConfigureWidgetButtonAction(Parcel parcel, C2374a aVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private WidgetPressedTrigger m10204j3() {
        Macro macro;
        if ((mo27837X0() == null || this.m_macroId != mo27837X0().getGUID()) && this.m_macroId != -99) {
            macro = C4934n.m18998M().mo29682Q(this.m_macroId);
        } else {
            macro = mo27837X0();
        }
        if (macro == null) {
            macro = mo27837X0();
        }
        SelectableItem findChildByGUID = macro.findChildByGUID(this.m_triggerGUID);
        if (!(findChildByGUID instanceof WidgetPressedTrigger)) {
            return null;
        }
        return (WidgetPressedTrigger) findChildByGUID;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        for (int i = 0; i < this.m_triggerGUIDList.size(); i++) {
            if (this.m_triggerGUIDList.get(i).longValue() == this.m_triggerGUID) {
                this.m_optionName = this.m_optionNames.get(i);
                return i;
            }
        }
        this.m_optionName = this.m_optionNames.get(0);
        long longValue = this.m_macroIdList.get(0).longValue();
        this.m_macroId = longValue;
        if (longValue == mo27840Y0().longValue()) {
            this.m_macroId = -99;
        }
        this.m_triggerGUID = this.m_triggerGUIDList.get(0).longValue();
        return 0;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_widgetLabel};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 1) {
            this.m_widgetLabel = strArr[0];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: J2 */
    public void mo24888J2() {
        if (m10204j3() == null) {
            for (Trigger next : mo27837X0().getTriggerList()) {
                if (next instanceof WidgetPressedTrigger) {
                    this.m_triggerGUID = next.mo27847f1();
                }
            }
        }
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return m10204j3() != null;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_widgetLabel;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7880y.m32968u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        String t0 = C4023j0.m15760t0(mo27827K0(), this.m_widgetLabel, triggerContextInfo, mo27837X0());
        WidgetPressedTrigger j3 = m10204j3();
        if (j3 != null) {
            j3.mo31661p3(t0);
            long j = this.m_macroId;
            if (j == -99) {
                j = mo27840Y0().longValue();
            }
            WidgetProviderCustom.m24073d(mo27827K0(), (Parcelable) null, j, t0, this.m_imageResourceName, this.m_imagePackageName, this.m_imageUri, this.m_faded);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        boolean z;
        List<Macro> B = C4934n.m18998M().mo29672B(false);
        this.m_triggerGUIDList = new ArrayList();
        this.m_macroIdList = new ArrayList();
        this.m_optionNames = new ArrayList();
        Iterator<Macro> it = B.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().getGUID() == mo27837X0().getGUID()) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            B.add(0, mo27837X0());
        }
        for (Macro next : B) {
            Iterator<Trigger> it2 = next.getTriggerList().iterator();
            while (it2.hasNext()) {
                Trigger next2 = it2.next();
                if (next2 instanceof WidgetPressedTrigger) {
                    WidgetPressedTrigger widgetPressedTrigger = (WidgetPressedTrigger) next2;
                    if (widgetPressedTrigger.mo31660m3() == 4) {
                        this.m_optionNames.add(next.getName() + " (" + widgetPressedTrigger.mo31659l3() + ")");
                        this.m_macroIdList.add(Long.valueOf(next2.mo27837X0().getGUID()));
                        this.m_triggerGUIDList.add(Long.valueOf(next2.mo27847f1()));
                    }
                }
            }
        }
        if (this.m_optionNames.size() == 0) {
            C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.no_custom_widget_buttons_found, 0).show();
        }
        return (String[]) this.m_optionNames.toArray(new String[0]);
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i == REQUEST_CODE_WIDGET_CONFIGURE && i2 != 0) {
            this.m_imageResourceName = intent.getStringExtra("drawableName");
            this.m_imagePackageName = intent.getStringExtra("drawablePackageName");
            this.m_widgetLabel = intent.getStringExtra("widgetText");
            this.m_faded = intent.getBooleanExtra("fadedImage", false);
            Uri data = intent.getData();
            if (data != null) {
                this.m_imageUri = data.toString();
            }
            mo24689O1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        String[] g1 = mo24676g1();
        if (g1 != null && g1.length > 0) {
            mo27848g0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        WidgetPressedTrigger j3;
        if (this.m_widgetLabel == null && (j3 = m10204j3()) != null) {
            this.m_widgetLabel = j3.mo31659l3();
            this.m_imageResourceName = j3.mo31655h3();
            this.m_imagePackageName = j3.mo31658k3();
            Uri j32 = j3.mo31657j3();
            if (j32 != null) {
                this.m_imageUri = j32.toString();
            }
        }
        Intent intent = new Intent(mo27827K0(), WidgetConfigureActivity.class);
        String str = this.m_widgetLabel;
        if (str != null && str.length() > 0) {
            intent.putExtra("widgetText", this.m_widgetLabel);
        }
        intent.putExtra("item_type", 1);
        intent.putExtra("drawablePackageName", this.m_imagePackageName);
        intent.putExtra("drawableName", this.m_imageResourceName);
        intent.putExtra("drawableUri", this.m_imageUri);
        intent.putExtra("show_faded_image", true);
        intent.putExtra("fadedImage", this.m_faded);
        intent.putExtra("MacroId", mo27837X0().getId());
        mo27850j0().startActivityForResult(intent, REQUEST_CODE_WIDGET_CONFIGURE);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.m_triggerGUID);
        parcel.writeLong(this.m_macroId);
        parcel.writeString(this.m_widgetLabel);
        parcel.writeString(this.m_imageResourceName);
        parcel.writeString(this.m_imagePackageName);
        parcel.writeString(this.m_imageUri);
        parcel.writeInt(this.m_faded ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_triggerGUID = this.m_triggerGUIDList.get(i).longValue();
        this.m_optionName = this.m_optionNames.get(i);
        long longValue = this.m_macroIdList.get(i).longValue();
        this.m_macroId = longValue;
        if (longValue == mo27840Y0().longValue()) {
            this.m_macroId = -99;
        }
    }

    public ConfigureWidgetButtonAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public ConfigureWidgetButtonAction() {
    }

    private ConfigureWidgetButtonAction(Parcel parcel) {
        super(parcel);
        this.m_triggerGUID = parcel.readLong();
        this.m_macroId = parcel.readLong();
        this.m_widgetLabel = parcel.readString();
        this.m_imageResourceName = parcel.readString();
        this.m_imagePackageName = parcel.readString();
        this.m_imageUri = parcel.readString();
        this.m_faded = parcel.readInt() != 0;
    }
}

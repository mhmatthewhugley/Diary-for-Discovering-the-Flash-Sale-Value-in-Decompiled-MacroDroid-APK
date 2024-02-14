package com.arlosoft.macrodroid.triggers;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.Contact;
import com.arlosoft.macrodroid.common.IncomingSMS;
import com.arlosoft.macrodroid.data.NotificationContextInfo;
import com.arlosoft.macrodroid.data.WeatherContextInfo;

public class TriggerContextInfo implements Parcelable {
    public static final Parcelable.Creator<TriggerContextInfo> CREATOR = new C5757a();

    /* renamed from: A */
    private String f13697A;

    /* renamed from: B */
    private String f13698B;

    /* renamed from: C */
    private String f13699C;

    /* renamed from: D */
    private String f13700D;

    /* renamed from: E */
    private String f13701E;

    /* renamed from: F */
    private String f13702F;

    /* renamed from: G */
    private String f13703G;

    /* renamed from: H */
    private String f13704H;

    /* renamed from: I */
    private Trigger f13705I;

    /* renamed from: a */
    private String f13706a;

    /* renamed from: c */
    private String f13707c;

    /* renamed from: d */
    private NotificationContextInfo f13708d;

    /* renamed from: f */
    private IncomingSMS f13709f;

    /* renamed from: g */
    private Contact f13710g;

    /* renamed from: o */
    private WeatherContextInfo f13711o;

    /* renamed from: p */
    private String f13712p;

    /* renamed from: s */
    private String f13713s;

    /* renamed from: z */
    private String f13714z;

    /* renamed from: com.arlosoft.macrodroid.triggers.TriggerContextInfo$a */
    class C5757a implements Parcelable.Creator<TriggerContextInfo> {
        C5757a() {
        }

        /* renamed from: a */
        public TriggerContextInfo createFromParcel(Parcel parcel) {
            return new TriggerContextInfo(parcel, (C5757a) null);
        }

        /* renamed from: b */
        public TriggerContextInfo[] newArray(int i) {
            return new TriggerContextInfo[i];
        }
    }

    /* synthetic */ TriggerContextInfo(Parcel parcel, C5757a aVar) {
        this(parcel);
    }

    /* renamed from: b */
    public static TriggerContextInfo m23361b(Trigger trigger, String str) {
        TriggerContextInfo triggerContextInfo = new TriggerContextInfo(trigger);
        triggerContextInfo.f13705I = trigger;
        triggerContextInfo.f13707c = str;
        return triggerContextInfo;
    }

    /* renamed from: c */
    public static TriggerContextInfo m23362c(Trigger trigger, String str, String str2) {
        TriggerContextInfo triggerContextInfo = new TriggerContextInfo(trigger);
        triggerContextInfo.f13705I = trigger;
        triggerContextInfo.f13703G = str;
        triggerContextInfo.f13704H = str2;
        return triggerContextInfo;
    }

    /* renamed from: a */
    public void mo31549a() {
        this.f13705I = null;
    }

    /* renamed from: d */
    public String mo31550d() {
        return this.f13713s;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo31552e() {
        return this.f13700D;
    }

    /* renamed from: f */
    public String mo31553f() {
        return this.f13701E;
    }

    /* renamed from: g */
    public String mo31554g() {
        return this.f13702F;
    }

    /* renamed from: h */
    public String mo31555h() {
        return this.f13714z;
    }

    /* renamed from: i */
    public String mo31556i() {
        return this.f13697A;
    }

    /* renamed from: j */
    public String mo31557j() {
        return this.f13698B;
    }

    /* renamed from: k */
    public String mo31558k() {
        return this.f13699C;
    }

    /* renamed from: l */
    public String mo31559l() {
        return this.f13712p;
    }

    /* renamed from: m */
    public Contact mo31560m() {
        return this.f13710g;
    }

    /* renamed from: n */
    public IncomingSMS mo31561n() {
        return this.f13709f;
    }

    /* renamed from: o */
    public NotificationContextInfo mo31562o() {
        return this.f13708d;
    }

    /* renamed from: p */
    public String mo31563p() {
        return this.f13707c;
    }

    /* renamed from: q */
    public Trigger mo31564q() {
        return this.f13705I;
    }

    /* renamed from: r */
    public String mo31565r() {
        return this.f13706a;
    }

    /* renamed from: s */
    public String mo31566s() {
        return this.f13704H;
    }

    /* renamed from: t */
    public String mo31567t() {
        return this.f13703G;
    }

    /* renamed from: u */
    public WeatherContextInfo mo31568u() {
        return this.f13711o;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13706a);
        parcel.writeString(this.f13707c);
        parcel.writeParcelable(this.f13708d, i);
        parcel.writeParcelable(this.f13709f, i);
        parcel.writeParcelable(this.f13710g, i);
        parcel.writeParcelable(this.f13711o, i);
        parcel.writeString(this.f13712p);
        parcel.writeString(this.f13713s);
    }

    public TriggerContextInfo(String str) {
        this.f13706a = str;
    }

    public TriggerContextInfo(Trigger trigger) {
        if (trigger != null) {
            this.f13705I = trigger;
            this.f13706a = trigger.getClass().getSimpleName();
        }
    }

    public TriggerContextInfo(Trigger trigger, String str) {
        if (trigger != null) {
            this.f13705I = trigger;
            this.f13706a = trigger.getClass().getSimpleName();
        }
        this.f13707c = str;
    }

    public TriggerContextInfo(Trigger trigger, NotificationContextInfo notificationContextInfo) {
        if (trigger != null) {
            this.f13705I = trigger;
            this.f13706a = trigger.getClass().getSimpleName();
        }
        this.f13708d = notificationContextInfo;
    }

    public TriggerContextInfo(Trigger trigger, IncomingSMS incomingSMS) {
        if (trigger != null) {
            this.f13705I = trigger;
            this.f13706a = trigger.getClass().getSimpleName();
        }
        this.f13709f = incomingSMS;
    }

    public TriggerContextInfo(Trigger trigger, WeatherContextInfo weatherContextInfo) {
        if (trigger != null) {
            this.f13705I = trigger;
            this.f13706a = trigger.getClass().getSimpleName();
        }
        this.f13711o = weatherContextInfo;
    }

    public TriggerContextInfo(Trigger trigger, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        if (trigger != null) {
            this.f13705I = trigger;
            this.f13706a = trigger.getClass().getSimpleName();
        }
        this.f13712p = str;
        this.f13713s = str2;
        this.f13714z = str3;
        this.f13697A = str4;
        this.f13699C = str6;
        this.f13700D = str7;
        this.f13698B = str5;
        this.f13702F = str9;
    }

    private TriggerContextInfo(Parcel parcel) {
        this.f13706a = parcel.readString();
        this.f13707c = parcel.readString();
        this.f13708d = (NotificationContextInfo) parcel.readParcelable(NotificationContextInfo.class.getClassLoader());
        this.f13709f = (IncomingSMS) parcel.readParcelable(IncomingSMS.class.getClassLoader());
        this.f13710g = (Contact) parcel.readParcelable(Contact.class.getClassLoader());
        this.f13711o = (WeatherContextInfo) parcel.readParcelable(WeatherContextInfo.class.getClassLoader());
        this.f13712p = parcel.readString();
        this.f13713s = parcel.readString();
    }
}

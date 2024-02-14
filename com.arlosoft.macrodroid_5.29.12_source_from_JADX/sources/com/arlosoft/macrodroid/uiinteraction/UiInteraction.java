package com.arlosoft.macrodroid.uiinteraction;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.DontObfuscate;
import kotlin.jvm.internal.C13706o;
import p014b3.C1405a;

@DontObfuscate
/* compiled from: UiInteraction.kt */
public final class UiInteraction implements Parcelable {
    public static final Parcelable.Creator<UiInteraction> CREATOR = new C6288a();
    private final String contentDescription;
    private final int eventType;
    private final int hashCode;
    private final String packageName;
    private final Point screenXY;
    private final long timestamp;
    private final String viewIdResourceName;
    private final String viewText;

    /* renamed from: com.arlosoft.macrodroid.uiinteraction.UiInteraction$a */
    /* compiled from: UiInteraction.kt */
    public static final class C6288a implements Parcelable.Creator<UiInteraction> {
        /* renamed from: a */
        public final UiInteraction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new UiInteraction(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), (Point) parcel.readParcelable(UiInteraction.class.getClassLoader()), parcel.readLong());
        }

        /* renamed from: b */
        public final UiInteraction[] newArray(int i) {
            return new UiInteraction[i];
        }
    }

    public UiInteraction(String str, int i, String str2, String str3, String str4, int i2, Point point, long j) {
        C13706o.m87929f(str, "packageName");
        C13706o.m87929f(str2, "viewIdResourceName");
        C13706o.m87929f(str3, "viewText");
        C13706o.m87929f(str4, "contentDescription");
        C13706o.m87929f(point, "screenXY");
        this.packageName = str;
        this.eventType = i;
        this.viewIdResourceName = str2;
        this.viewText = str3;
        this.contentDescription = str4;
        this.hashCode = i2;
        this.screenXY = point;
        this.timestamp = j;
    }

    public static /* synthetic */ UiInteraction copy$default(UiInteraction uiInteraction, String str, int i, String str2, String str3, String str4, int i2, Point point, long j, int i3, Object obj) {
        UiInteraction uiInteraction2 = uiInteraction;
        int i4 = i3;
        return uiInteraction.copy((i4 & 1) != 0 ? uiInteraction2.packageName : str, (i4 & 2) != 0 ? uiInteraction2.eventType : i, (i4 & 4) != 0 ? uiInteraction2.viewIdResourceName : str2, (i4 & 8) != 0 ? uiInteraction2.viewText : str3, (i4 & 16) != 0 ? uiInteraction2.contentDescription : str4, (i4 & 32) != 0 ? uiInteraction2.hashCode : i2, (i4 & 64) != 0 ? uiInteraction2.screenXY : point, (i4 & 128) != 0 ? uiInteraction2.timestamp : j);
    }

    public final String component1() {
        return this.packageName;
    }

    public final int component2() {
        return this.eventType;
    }

    public final String component3() {
        return this.viewIdResourceName;
    }

    public final String component4() {
        return this.viewText;
    }

    public final String component5() {
        return this.contentDescription;
    }

    public final int component6() {
        return this.hashCode;
    }

    public final Point component7() {
        return this.screenXY;
    }

    public final long component8() {
        return this.timestamp;
    }

    public final UiInteraction copy(String str, int i, String str2, String str3, String str4, int i2, Point point, long j) {
        C13706o.m87929f(str, "packageName");
        C13706o.m87929f(str2, "viewIdResourceName");
        C13706o.m87929f(str3, "viewText");
        String str5 = str4;
        C13706o.m87929f(str5, "contentDescription");
        Point point2 = point;
        C13706o.m87929f(point2, "screenXY");
        return new UiInteraction(str, i, str2, str3, str5, i2, point2, j);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiInteraction)) {
            return false;
        }
        UiInteraction uiInteraction = (UiInteraction) obj;
        return C13706o.m87924a(this.packageName, uiInteraction.packageName) && this.eventType == uiInteraction.eventType && C13706o.m87924a(this.viewIdResourceName, uiInteraction.viewIdResourceName) && C13706o.m87924a(this.viewText, uiInteraction.viewText) && C13706o.m87924a(this.contentDescription, uiInteraction.contentDescription) && this.hashCode == uiInteraction.hashCode && C13706o.m87924a(this.screenXY, uiInteraction.screenXY) && this.timestamp == uiInteraction.timestamp;
    }

    public final String getContentDescription() {
        return this.contentDescription;
    }

    public final int getEventType() {
        return this.eventType;
    }

    public final int getHashCode() {
        return this.hashCode;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final Point getScreenXY() {
        return this.screenXY;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getViewIdResourceName() {
        return this.viewIdResourceName;
    }

    public final String getViewText() {
        return this.viewText;
    }

    public int hashCode() {
        return (((((((((((((this.packageName.hashCode() * 31) + this.eventType) * 31) + this.viewIdResourceName.hashCode()) * 31) + this.viewText.hashCode()) * 31) + this.contentDescription.hashCode()) * 31) + this.hashCode) * 31) + this.screenXY.hashCode()) * 31) + C1405a.m633a(this.timestamp);
    }

    public String toString() {
        return "UiInteraction(packageName=" + this.packageName + ", eventType=" + this.eventType + ", viewIdResourceName=" + this.viewIdResourceName + ", viewText=" + this.viewText + ", contentDescription=" + this.contentDescription + ", hashCode=" + this.hashCode + ", screenXY=" + this.screenXY + ", timestamp=" + this.timestamp + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        parcel.writeString(this.packageName);
        parcel.writeInt(this.eventType);
        parcel.writeString(this.viewIdResourceName);
        parcel.writeString(this.viewText);
        parcel.writeString(this.contentDescription);
        parcel.writeInt(this.hashCode);
        parcel.writeParcelable(this.screenXY, i);
        parcel.writeLong(this.timestamp);
    }
}

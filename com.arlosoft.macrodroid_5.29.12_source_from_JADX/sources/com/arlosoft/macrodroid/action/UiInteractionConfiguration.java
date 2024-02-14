package com.arlosoft.macrodroid.action;

import android.content.res.Resources;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.DontObfuscate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: UIInteractionAction.kt */
public abstract class UiInteractionConfiguration implements Parcelable {
    private final String type;

    @DontObfuscate
    /* compiled from: UIInteractionAction.kt */
    public static final class ClearSelection extends UiInteractionConfiguration {
        public static final Parcelable.Creator<ClearSelection> CREATOR = new C2762a();
        public static final ClearSelection INSTANCE = new ClearSelection();

        /* renamed from: com.arlosoft.macrodroid.action.UiInteractionConfiguration$ClearSelection$a */
        /* compiled from: UIInteractionAction.kt */
        public static final class C2762a implements Parcelable.Creator<ClearSelection> {
            /* renamed from: a */
            public final ClearSelection createFromParcel(Parcel parcel) {
                C13706o.m87929f(parcel, "parcel");
                parcel.readInt();
                return ClearSelection.INSTANCE;
            }

            /* renamed from: b */
            public final ClearSelection[] newArray(int i) {
                return new ClearSelection[i];
            }
        }

        private ClearSelection() {
            super((C13695i) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C13706o.m87929f(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @DontObfuscate
    /* compiled from: UIInteractionAction.kt */
    public static final class Click extends UiInteractionConfiguration {
        public static final Parcelable.Creator<Click> CREATOR = new C2764b();
        public static final C2763a Companion = new C2763a((C13695i) null);
        public static final int TEXT_MATCH_ANY = 0;
        public static final int TEXT_MATCH_EXACT = 1;
        private final int clickOption;
        private final String contentDescription;
        private final boolean longClick;
        private final String textContent;
        private final int textMatchOption;
        private final String viewId;
        private final String xVarName;
        private final Point xyPoint;
        private final String yVarName;

        /* renamed from: com.arlosoft.macrodroid.action.UiInteractionConfiguration$Click$a */
        /* compiled from: UIInteractionAction.kt */
        public static final class C2763a {
            private C2763a() {
            }

            public /* synthetic */ C2763a(C13695i iVar) {
                this();
            }
        }

        /* renamed from: com.arlosoft.macrodroid.action.UiInteractionConfiguration$Click$b */
        /* compiled from: UIInteractionAction.kt */
        public static final class C2764b implements Parcelable.Creator<Click> {
            /* renamed from: a */
            public final Click createFromParcel(Parcel parcel) {
                C13706o.m87929f(parcel, "parcel");
                return new Click(parcel.readInt(), parcel.readInt() != 0, (Point) parcel.readParcelable(Click.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final Click[] newArray(int i) {
                return new Click[i];
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Click(int i, boolean z, Point point, String str, String str2, String str3, int i2, String str4, String str5, int i3, C13695i iVar) {
            this(i, z, point, str, str2, str3, (i3 & 64) != 0 ? 0 : i2, str4, str5);
        }

        public static /* synthetic */ Click copy$default(Click click, int i, boolean z, Point point, String str, String str2, String str3, int i2, String str4, String str5, int i3, Object obj) {
            Click click2 = click;
            int i4 = i3;
            return click.copy((i4 & 1) != 0 ? click2.clickOption : i, (i4 & 2) != 0 ? click2.longClick : z, (i4 & 4) != 0 ? click2.xyPoint : point, (i4 & 8) != 0 ? click2.xVarName : str, (i4 & 16) != 0 ? click2.yVarName : str2, (i4 & 32) != 0 ? click2.textContent : str3, (i4 & 64) != 0 ? click2.textMatchOption : i2, (i4 & 128) != 0 ? click2.contentDescription : str4, (i4 & 256) != 0 ? click2.viewId : str5);
        }

        public final int component1() {
            return this.clickOption;
        }

        public final boolean component2() {
            return this.longClick;
        }

        public final Point component3() {
            return this.xyPoint;
        }

        public final String component4() {
            return this.xVarName;
        }

        public final String component5() {
            return this.yVarName;
        }

        public final String component6() {
            return this.textContent;
        }

        public final int component7() {
            return this.textMatchOption;
        }

        public final String component8() {
            return this.contentDescription;
        }

        public final String component9() {
            return this.viewId;
        }

        public final Click copy(int i, boolean z, Point point, String str, String str2, String str3, int i2, String str4, String str5) {
            return new Click(i, z, point, str, str2, str3, i2, str4, str5);
        }

        public String describe() {
            StringBuilder sb = new StringBuilder();
            sb.append("id: ");
            sb.append(this.viewId);
            sb.append("\n\ncontentDescription: ");
            sb.append(this.contentDescription);
            sb.append("\n\ntext: ");
            sb.append(this.textContent);
            sb.append("\n\nx,y: ");
            Point point = this.xyPoint;
            Integer num = null;
            sb.append(point != null ? Integer.valueOf(point.x) : null);
            sb.append(", ");
            Point point2 = this.xyPoint;
            if (point2 != null) {
                num = Integer.valueOf(point2.y);
            }
            sb.append(num);
            return sb.toString();
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Click)) {
                return false;
            }
            Click click = (Click) obj;
            return this.clickOption == click.clickOption && this.longClick == click.longClick && C13706o.m87924a(this.xyPoint, click.xyPoint) && C13706o.m87924a(this.xVarName, click.xVarName) && C13706o.m87924a(this.yVarName, click.yVarName) && C13706o.m87924a(this.textContent, click.textContent) && this.textMatchOption == click.textMatchOption && C13706o.m87924a(this.contentDescription, click.contentDescription) && C13706o.m87924a(this.viewId, click.viewId);
        }

        public final int getClickOption() {
            return this.clickOption;
        }

        public final String getContentDescription() {
            return this.contentDescription;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
            if (r0 == null) goto L_0x003e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String getExtendedDetail(android.content.res.Resources r8) {
            /*
                r7 = this;
                java.lang.String r0 = "res"
                kotlin.jvm.internal.C13706o.m87929f(r8, r0)
                int r0 = r7.clickOption
                java.lang.String r1 = ""
                if (r0 == 0) goto L_0x00e2
                r8 = 1
                if (r0 == r8) goto L_0x00db
                r8 = 44
                r2 = 2
                r3 = 0
                if (r0 == r2) goto L_0x00a2
                r4 = 3
                if (r0 == r4) goto L_0x0022
                r8 = 4
                if (r0 == r8) goto L_0x001c
                goto L_0x00ee
            L_0x001c:
                java.lang.String r8 = r7.viewId
                if (r8 != 0) goto L_0x00e0
                goto L_0x00ee
            L_0x0022:
                java.lang.String r0 = r7.viewId
                java.lang.String r4 = ", "
                if (r0 == 0) goto L_0x003e
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "id:"
                r5.append(r6)
                r5.append(r0)
                r5.append(r4)
                java.lang.String r0 = r5.toString()
                if (r0 != 0) goto L_0x008c
            L_0x003e:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r5 = r7.textContent
                if (r5 == 0) goto L_0x0066
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r6 = 34
                r5.append(r6)
                java.lang.String r6 = r7.textContent
                r5.append(r6)
                java.lang.String r6 = "\", "
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                if (r5 != 0) goto L_0x0065
                goto L_0x0066
            L_0x0065:
                r1 = r5
            L_0x0066:
                r0.append(r1)
                android.graphics.Point r1 = r7.xyPoint
                if (r1 == 0) goto L_0x0084
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                int r6 = r1.x
                r5.append(r6)
                r5.append(r8)
                int r8 = r1.y
                r5.append(r8)
                java.lang.String r8 = r5.toString()
                goto L_0x0085
            L_0x0084:
                r8 = r3
            L_0x0085:
                r0.append(r8)
                java.lang.String r0 = r0.toString()
            L_0x008c:
                r8 = 0
                boolean r1 = kotlin.text.C15176v.m93640u(r0, r4, r8, r2, r3)
                if (r1 == 0) goto L_0x00a1
                int r1 = r0.length()
                int r1 = r1 - r2
                java.lang.String r0 = r0.substring(r8, r1)
                java.lang.String r8 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.C13706o.m87928e(r0, r8)
            L_0x00a1:
                return r0
            L_0x00a2:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r7.xVarName
                if (r1 != 0) goto L_0x00bb
                android.graphics.Point r1 = r7.xyPoint
                if (r1 == 0) goto L_0x00b6
                int r1 = r1.x
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                goto L_0x00b7
            L_0x00b6:
                r1 = r3
            L_0x00b7:
                java.lang.String r1 = java.lang.String.valueOf(r1)
            L_0x00bb:
                r0.append(r1)
                r0.append(r8)
                java.lang.String r8 = r7.yVarName
                if (r8 != 0) goto L_0x00d3
                android.graphics.Point r8 = r7.xyPoint
                if (r8 == 0) goto L_0x00cf
                int r8 = r8.y
                java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            L_0x00cf:
                java.lang.String r8 = java.lang.String.valueOf(r3)
            L_0x00d3:
                r0.append(r8)
                java.lang.String r1 = r0.toString()
                goto L_0x00ee
            L_0x00db:
                java.lang.String r8 = r7.textContent
                if (r8 != 0) goto L_0x00e0
                goto L_0x00ee
            L_0x00e0:
                r1 = r8
                goto L_0x00ee
            L_0x00e2:
                r0 = 2131955623(0x7f130fa7, float:1.9547779E38)
                java.lang.String r1 = r8.getString(r0)
                java.lang.String r8 = "res.getString(R.string.u…nteraction_current_focus)"
                kotlin.jvm.internal.C13706o.m87928e(r1, r8)
            L_0x00ee:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.UiInteractionConfiguration.Click.getExtendedDetail(android.content.res.Resources):java.lang.String");
        }

        public final boolean getLongClick() {
            return this.longClick;
        }

        public final String getTextContent() {
            return this.textContent;
        }

        public final int getTextMatchOption() {
            return this.textMatchOption;
        }

        public final String getViewId() {
            return this.viewId;
        }

        public final String getXVarName() {
            return this.xVarName;
        }

        public final Point getXyPoint() {
            return this.xyPoint;
        }

        public final String getYVarName() {
            return this.yVarName;
        }

        public int hashCode() {
            int i = this.clickOption * 31;
            boolean z = this.longClick;
            if (z) {
                z = true;
            }
            int i2 = (i + (z ? 1 : 0)) * 31;
            Point point = this.xyPoint;
            int i3 = 0;
            int hashCode = (i2 + (point == null ? 0 : point.hashCode())) * 31;
            String str = this.xVarName;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.yVarName;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.textContent;
            int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.textMatchOption) * 31;
            String str4 = this.contentDescription;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.viewId;
            if (str5 != null) {
                i3 = str5.hashCode();
            }
            return hashCode5 + i3;
        }

        public String toString() {
            return "Click(clickOption=" + this.clickOption + ", longClick=" + this.longClick + ", xyPoint=" + this.xyPoint + ", xVarName=" + this.xVarName + ", yVarName=" + this.yVarName + ", textContent=" + this.textContent + ", textMatchOption=" + this.textMatchOption + ", contentDescription=" + this.contentDescription + ", viewId=" + this.viewId + ')';
        }

        public final Click withTextAndViewId(String str, String str2) {
            C13706o.m87929f(str, "newText");
            C13706o.m87929f(str2, "newViewId");
            return new Click(this.clickOption, this.longClick, this.xyPoint, this.xVarName, this.yVarName, str, this.textMatchOption, this.contentDescription, str2);
        }

        public void writeToParcel(Parcel parcel, int i) {
            C13706o.m87929f(parcel, "out");
            parcel.writeInt(this.clickOption);
            parcel.writeInt(this.longClick ? 1 : 0);
            parcel.writeParcelable(this.xyPoint, i);
            parcel.writeString(this.xVarName);
            parcel.writeString(this.yVarName);
            parcel.writeString(this.textContent);
            parcel.writeInt(this.textMatchOption);
            parcel.writeString(this.contentDescription);
            parcel.writeString(this.viewId);
        }

        public Click(int i, boolean z, Point point, String str, String str2, String str3, int i2, String str4, String str5) {
            super((C13695i) null);
            this.clickOption = i;
            this.longClick = z;
            this.xyPoint = point;
            this.xVarName = str;
            this.yVarName = str2;
            this.textContent = str3;
            this.textMatchOption = i2;
            this.contentDescription = str4;
            this.viewId = str5;
        }
    }

    @DontObfuscate
    /* compiled from: UIInteractionAction.kt */
    public static final class Copy extends UiInteractionConfiguration {
        public static final Parcelable.Creator<Copy> CREATOR = new C2765a();
        public static final Copy INSTANCE = new Copy();

        /* renamed from: com.arlosoft.macrodroid.action.UiInteractionConfiguration$Copy$a */
        /* compiled from: UIInteractionAction.kt */
        public static final class C2765a implements Parcelable.Creator<Copy> {
            /* renamed from: a */
            public final Copy createFromParcel(Parcel parcel) {
                C13706o.m87929f(parcel, "parcel");
                parcel.readInt();
                return Copy.INSTANCE;
            }

            /* renamed from: b */
            public final Copy[] newArray(int i) {
                return new Copy[i];
            }
        }

        private Copy() {
            super((C13695i) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C13706o.m87929f(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @DontObfuscate
    /* compiled from: UIInteractionAction.kt */
    public static final class Cut extends UiInteractionConfiguration {
        public static final Parcelable.Creator<Cut> CREATOR = new C2766a();
        public static final Cut INSTANCE = new Cut();

        /* renamed from: com.arlosoft.macrodroid.action.UiInteractionConfiguration$Cut$a */
        /* compiled from: UIInteractionAction.kt */
        public static final class C2766a implements Parcelable.Creator<Cut> {
            /* renamed from: a */
            public final Cut createFromParcel(Parcel parcel) {
                C13706o.m87929f(parcel, "parcel");
                parcel.readInt();
                return Cut.INSTANCE;
            }

            /* renamed from: b */
            public final Cut[] newArray(int i) {
                return new Cut[i];
            }
        }

        private Cut() {
            super((C13695i) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C13706o.m87929f(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @DontObfuscate
    /* compiled from: UIInteractionAction.kt */
    public static final class Gesture extends UiInteractionConfiguration {
        public static final Parcelable.Creator<Gesture> CREATOR = new C2767a();
        private final int durationMs;
        private final String durationVarName;
        private final int endX;
        private final int endY;
        private final int startX;
        private final int startY;
        private final boolean waitBeforeNext;
        private final String xEndVarName;
        private final String xStartVarName;
        private final String yEndVarName;
        private final String yStartVarName;

        /* renamed from: com.arlosoft.macrodroid.action.UiInteractionConfiguration$Gesture$a */
        /* compiled from: UIInteractionAction.kt */
        public static final class C2767a implements Parcelable.Creator<Gesture> {
            /* renamed from: a */
            public final Gesture createFromParcel(Parcel parcel) {
                C13706o.m87929f(parcel, "parcel");
                return new Gesture(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final Gesture[] newArray(int i) {
                return new Gesture[i];
            }
        }

        public Gesture(int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, String str4, String str5, boolean z) {
            super((C13695i) null);
            this.startX = i;
            this.startY = i2;
            this.endX = i3;
            this.endY = i4;
            this.durationMs = i5;
            this.xStartVarName = str;
            this.yStartVarName = str2;
            this.xEndVarName = str3;
            this.yEndVarName = str4;
            this.durationVarName = str5;
            this.waitBeforeNext = z;
        }

        public static /* synthetic */ Gesture copy$default(Gesture gesture, int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, String str4, String str5, boolean z, int i6, Object obj) {
            Gesture gesture2 = gesture;
            int i7 = i6;
            return gesture.copy((i7 & 1) != 0 ? gesture2.startX : i, (i7 & 2) != 0 ? gesture2.startY : i2, (i7 & 4) != 0 ? gesture2.endX : i3, (i7 & 8) != 0 ? gesture2.endY : i4, (i7 & 16) != 0 ? gesture2.durationMs : i5, (i7 & 32) != 0 ? gesture2.xStartVarName : str, (i7 & 64) != 0 ? gesture2.yStartVarName : str2, (i7 & 128) != 0 ? gesture2.xEndVarName : str3, (i7 & 256) != 0 ? gesture2.yEndVarName : str4, (i7 & 512) != 0 ? gesture2.durationVarName : str5, (i7 & 1024) != 0 ? gesture2.waitBeforeNext : z);
        }

        public final int component1() {
            return this.startX;
        }

        public final String component10() {
            return this.durationVarName;
        }

        public final boolean component11() {
            return this.waitBeforeNext;
        }

        public final int component2() {
            return this.startY;
        }

        public final int component3() {
            return this.endX;
        }

        public final int component4() {
            return this.endY;
        }

        public final int component5() {
            return this.durationMs;
        }

        public final String component6() {
            return this.xStartVarName;
        }

        public final String component7() {
            return this.yStartVarName;
        }

        public final String component8() {
            return this.xEndVarName;
        }

        public final String component9() {
            return this.yEndVarName;
        }

        public final Gesture copy(int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, String str4, String str5, boolean z) {
            return new Gesture(i, i2, i3, i4, i5, str, str2, str3, str4, str5, z);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Gesture)) {
                return false;
            }
            Gesture gesture = (Gesture) obj;
            return this.startX == gesture.startX && this.startY == gesture.startY && this.endX == gesture.endX && this.endY == gesture.endY && this.durationMs == gesture.durationMs && C13706o.m87924a(this.xStartVarName, gesture.xStartVarName) && C13706o.m87924a(this.yStartVarName, gesture.yStartVarName) && C13706o.m87924a(this.xEndVarName, gesture.xEndVarName) && C13706o.m87924a(this.yEndVarName, gesture.yEndVarName) && C13706o.m87924a(this.durationVarName, gesture.durationVarName) && this.waitBeforeNext == gesture.waitBeforeNext;
        }

        public final int getDurationMs() {
            return this.durationMs;
        }

        public final String getDurationVarName() {
            return this.durationVarName;
        }

        public final int getEndX() {
            return this.endX;
        }

        public final int getEndY() {
            return this.endY;
        }

        public String getExtendedDetail(Resources resources) {
            C13706o.m87929f(resources, "res");
            StringBuilder sb = new StringBuilder();
            Object obj = this.durationVarName;
            if (obj == null) {
                obj = Integer.valueOf(this.durationMs);
            }
            sb.append(obj);
            sb.append(' ');
            sb.append(resources.getString(C17541R$string.milliseconds_capital));
            sb.append(": ");
            Object obj2 = this.xStartVarName;
            if (obj2 == null) {
                obj2 = Integer.valueOf(this.startX);
            }
            sb.append(obj2);
            sb.append(',');
            Object obj3 = this.yStartVarName;
            if (obj3 == null) {
                obj3 = Integer.valueOf(this.startY);
            }
            sb.append(obj3);
            sb.append(" -> ");
            Object obj4 = this.xEndVarName;
            if (obj4 == null) {
                obj4 = Integer.valueOf(this.endX);
            }
            sb.append(obj4);
            sb.append(',');
            Object obj5 = this.yEndVarName;
            if (obj5 == null) {
                obj5 = Integer.valueOf(this.endY);
            }
            sb.append(obj5);
            return sb.toString();
        }

        public final int getStartX() {
            return this.startX;
        }

        public final int getStartY() {
            return this.startY;
        }

        public final boolean getWaitBeforeNext() {
            return this.waitBeforeNext;
        }

        public final String getXEndVarName() {
            return this.xEndVarName;
        }

        public final String getXStartVarName() {
            return this.xStartVarName;
        }

        public final String getYEndVarName() {
            return this.yEndVarName;
        }

        public final String getYStartVarName() {
            return this.yStartVarName;
        }

        public int hashCode() {
            int i = ((((((((this.startX * 31) + this.startY) * 31) + this.endX) * 31) + this.endY) * 31) + this.durationMs) * 31;
            String str = this.xStartVarName;
            int i2 = 0;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.yStartVarName;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.xEndVarName;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.yEndVarName;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.durationVarName;
            if (str5 != null) {
                i2 = str5.hashCode();
            }
            int i3 = (hashCode4 + i2) * 31;
            boolean z = this.waitBeforeNext;
            if (z) {
                z = true;
            }
            return i3 + (z ? 1 : 0);
        }

        public String toString() {
            return "Gesture(startX=" + this.startX + ", startY=" + this.startY + ", endX=" + this.endX + ", endY=" + this.endY + ", durationMs=" + this.durationMs + ", xStartVarName=" + this.xStartVarName + ", yStartVarName=" + this.yStartVarName + ", xEndVarName=" + this.xEndVarName + ", yEndVarName=" + this.yEndVarName + ", durationVarName=" + this.durationVarName + ", waitBeforeNext=" + this.waitBeforeNext + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C13706o.m87929f(parcel, "out");
            parcel.writeInt(this.startX);
            parcel.writeInt(this.startY);
            parcel.writeInt(this.endX);
            parcel.writeInt(this.endY);
            parcel.writeInt(this.durationMs);
            parcel.writeString(this.xStartVarName);
            parcel.writeString(this.yStartVarName);
            parcel.writeString(this.xEndVarName);
            parcel.writeString(this.yEndVarName);
            parcel.writeString(this.durationVarName);
            parcel.writeInt(this.waitBeforeNext ? 1 : 0);
        }
    }

    @DontObfuscate
    /* compiled from: UIInteractionAction.kt */
    public static final class GestureEntry implements Parcelable {
        public static final Parcelable.Creator<GestureEntry> CREATOR = new C2768a();
        private final int endX;
        private final int endY;
        private final String xEndVarName;
        private final String yEndVarName;

        /* renamed from: com.arlosoft.macrodroid.action.UiInteractionConfiguration$GestureEntry$a */
        /* compiled from: UIInteractionAction.kt */
        public static final class C2768a implements Parcelable.Creator<GestureEntry> {
            /* renamed from: a */
            public final GestureEntry createFromParcel(Parcel parcel) {
                C13706o.m87929f(parcel, "parcel");
                return new GestureEntry(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final GestureEntry[] newArray(int i) {
                return new GestureEntry[i];
            }
        }

        public GestureEntry(int i, int i2, String str, String str2) {
            this.endX = i;
            this.endY = i2;
            this.xEndVarName = str;
            this.yEndVarName = str2;
        }

        public static /* synthetic */ GestureEntry copy$default(GestureEntry gestureEntry, int i, int i2, String str, String str2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = gestureEntry.endX;
            }
            if ((i3 & 2) != 0) {
                i2 = gestureEntry.endY;
            }
            if ((i3 & 4) != 0) {
                str = gestureEntry.xEndVarName;
            }
            if ((i3 & 8) != 0) {
                str2 = gestureEntry.yEndVarName;
            }
            return gestureEntry.copy(i, i2, str, str2);
        }

        public final int component1() {
            return this.endX;
        }

        public final int component2() {
            return this.endY;
        }

        public final String component3() {
            return this.xEndVarName;
        }

        public final String component4() {
            return this.yEndVarName;
        }

        public final GestureEntry copy(int i, int i2, String str, String str2) {
            return new GestureEntry(i, i2, str, str2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GestureEntry)) {
                return false;
            }
            GestureEntry gestureEntry = (GestureEntry) obj;
            return this.endX == gestureEntry.endX && this.endY == gestureEntry.endY && C13706o.m87924a(this.xEndVarName, gestureEntry.xEndVarName) && C13706o.m87924a(this.yEndVarName, gestureEntry.yEndVarName);
        }

        public final int getEndX() {
            return this.endX;
        }

        public final int getEndY() {
            return this.endY;
        }

        public final String getXEndVarName() {
            return this.xEndVarName;
        }

        public final String getYEndVarName() {
            return this.yEndVarName;
        }

        public int hashCode() {
            int i = ((this.endX * 31) + this.endY) * 31;
            String str = this.xEndVarName;
            int i2 = 0;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.yEndVarName;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "GestureEntry(endX=" + this.endX + ", endY=" + this.endY + ", xEndVarName=" + this.xEndVarName + ", yEndVarName=" + this.yEndVarName + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C13706o.m87929f(parcel, "out");
            parcel.writeInt(this.endX);
            parcel.writeInt(this.endY);
            parcel.writeString(this.xEndVarName);
            parcel.writeString(this.yEndVarName);
        }
    }

    @DontObfuscate
    /* compiled from: UIInteractionAction.kt */
    public static final class GestureSequence extends UiInteractionConfiguration {
        public static final Parcelable.Creator<GestureSequence> CREATOR = new C2769a();
        private final int durationMs;
        private final String durationVarName;
        private final List<GestureEntry> gestures;
        private final int startX;
        private final int startY;
        private final boolean waitBeforeNext;
        private final String xStartVarName;
        private final String yStartVarName;

        /* renamed from: com.arlosoft.macrodroid.action.UiInteractionConfiguration$GestureSequence$a */
        /* compiled from: UIInteractionAction.kt */
        public static final class C2769a implements Parcelable.Creator<GestureSequence> {
            /* renamed from: a */
            public final GestureSequence createFromParcel(Parcel parcel) {
                C13706o.m87929f(parcel, "parcel");
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                int readInt4 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt4);
                for (int i = 0; i != readInt4; i++) {
                    arrayList.add(GestureEntry.CREATOR.createFromParcel(parcel));
                }
                return new GestureSequence(readInt, readInt2, readInt3, readString, readString2, readString3, z, arrayList);
            }

            /* renamed from: b */
            public final GestureSequence[] newArray(int i) {
                return new GestureSequence[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GestureSequence(int i, int i2, int i3, String str, String str2, String str3, boolean z, List<GestureEntry> list) {
            super((C13695i) null);
            C13706o.m87929f(list, "gestures");
            this.startX = i;
            this.startY = i2;
            this.durationMs = i3;
            this.xStartVarName = str;
            this.yStartVarName = str2;
            this.durationVarName = str3;
            this.waitBeforeNext = z;
            this.gestures = list;
        }

        public static /* synthetic */ GestureSequence copy$default(GestureSequence gestureSequence, int i, int i2, int i3, String str, String str2, String str3, boolean z, List list, int i4, Object obj) {
            GestureSequence gestureSequence2 = gestureSequence;
            int i5 = i4;
            return gestureSequence.copy((i5 & 1) != 0 ? gestureSequence2.startX : i, (i5 & 2) != 0 ? gestureSequence2.startY : i2, (i5 & 4) != 0 ? gestureSequence2.durationMs : i3, (i5 & 8) != 0 ? gestureSequence2.xStartVarName : str, (i5 & 16) != 0 ? gestureSequence2.yStartVarName : str2, (i5 & 32) != 0 ? gestureSequence2.durationVarName : str3, (i5 & 64) != 0 ? gestureSequence2.waitBeforeNext : z, (i5 & 128) != 0 ? gestureSequence2.gestures : list);
        }

        public final int component1() {
            return this.startX;
        }

        public final int component2() {
            return this.startY;
        }

        public final int component3() {
            return this.durationMs;
        }

        public final String component4() {
            return this.xStartVarName;
        }

        public final String component5() {
            return this.yStartVarName;
        }

        public final String component6() {
            return this.durationVarName;
        }

        public final boolean component7() {
            return this.waitBeforeNext;
        }

        public final List<GestureEntry> component8() {
            return this.gestures;
        }

        public final GestureSequence copy(int i, int i2, int i3, String str, String str2, String str3, boolean z, List<GestureEntry> list) {
            List<GestureEntry> list2 = list;
            C13706o.m87929f(list2, "gestures");
            return new GestureSequence(i, i2, i3, str, str2, str3, z, list2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GestureSequence)) {
                return false;
            }
            GestureSequence gestureSequence = (GestureSequence) obj;
            return this.startX == gestureSequence.startX && this.startY == gestureSequence.startY && this.durationMs == gestureSequence.durationMs && C13706o.m87924a(this.xStartVarName, gestureSequence.xStartVarName) && C13706o.m87924a(this.yStartVarName, gestureSequence.yStartVarName) && C13706o.m87924a(this.durationVarName, gestureSequence.durationVarName) && this.waitBeforeNext == gestureSequence.waitBeforeNext && C13706o.m87924a(this.gestures, gestureSequence.gestures);
        }

        public final int getDurationMs() {
            return this.durationMs;
        }

        public final String getDurationVarName() {
            return this.durationVarName;
        }

        public String getExtendedDetail(Resources resources) {
            C13706o.m87929f(resources, "res");
            C13696i0 i0Var = C13696i0.f61931a;
            String string = resources.getString(C17541R$string.ui_interaction_gesture_sequence_number_of_swipes);
            C13706o.m87928e(string, "res.getString(R.string.u…equence_number_of_swipes)");
            String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.gestures.size())}, 1));
            C13706o.m87928e(format, "format(format, *args)");
            return format;
        }

        public final List<GestureEntry> getGestures() {
            return this.gestures;
        }

        public final int getStartX() {
            return this.startX;
        }

        public final int getStartY() {
            return this.startY;
        }

        public final boolean getWaitBeforeNext() {
            return this.waitBeforeNext;
        }

        public final String getXStartVarName() {
            return this.xStartVarName;
        }

        public final String getYStartVarName() {
            return this.yStartVarName;
        }

        public int hashCode() {
            int i = ((((this.startX * 31) + this.startY) * 31) + this.durationMs) * 31;
            String str = this.xStartVarName;
            int i2 = 0;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.yStartVarName;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.durationVarName;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            int i3 = (hashCode2 + i2) * 31;
            boolean z = this.waitBeforeNext;
            if (z) {
                z = true;
            }
            return ((i3 + (z ? 1 : 0)) * 31) + this.gestures.hashCode();
        }

        public String toString() {
            return "GestureSequence(startX=" + this.startX + ", startY=" + this.startY + ", durationMs=" + this.durationMs + ", xStartVarName=" + this.xStartVarName + ", yStartVarName=" + this.yStartVarName + ", durationVarName=" + this.durationVarName + ", waitBeforeNext=" + this.waitBeforeNext + ", gestures=" + this.gestures + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C13706o.m87929f(parcel, "out");
            parcel.writeInt(this.startX);
            parcel.writeInt(this.startY);
            parcel.writeInt(this.durationMs);
            parcel.writeString(this.xStartVarName);
            parcel.writeString(this.yStartVarName);
            parcel.writeString(this.durationVarName);
            parcel.writeInt(this.waitBeforeNext ? 1 : 0);
            List<GestureEntry> list = this.gestures;
            parcel.writeInt(list.size());
            for (GestureEntry writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
    }

    @DontObfuscate
    /* compiled from: UIInteractionAction.kt */
    public static final class Paste extends UiInteractionConfiguration {
        public static final Parcelable.Creator<Paste> CREATOR = new C2770a();
        private final boolean forceClear;
        private final String text;
        private final boolean useClipboard;

        /* renamed from: com.arlosoft.macrodroid.action.UiInteractionConfiguration$Paste$a */
        /* compiled from: UIInteractionAction.kt */
        public static final class C2770a implements Parcelable.Creator<Paste> {
            /* renamed from: a */
            public final Paste createFromParcel(Parcel parcel) {
                C13706o.m87929f(parcel, "parcel");
                boolean z = true;
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new Paste(z2, z, parcel.readString());
            }

            /* renamed from: b */
            public final Paste[] newArray(int i) {
                return new Paste[i];
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Paste(boolean z, boolean z2, String str, int i, C13695i iVar) {
            this(z, z2, (i & 4) != 0 ? "" : str);
        }

        public static /* synthetic */ Paste copy$default(Paste paste, boolean z, boolean z2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = paste.useClipboard;
            }
            if ((i & 2) != 0) {
                z2 = paste.forceClear;
            }
            if ((i & 4) != 0) {
                str = paste.text;
            }
            return paste.copy(z, z2, str);
        }

        public final boolean component1() {
            return this.useClipboard;
        }

        public final boolean component2() {
            return this.forceClear;
        }

        public final String component3() {
            return this.text;
        }

        public final Paste copy(boolean z, boolean z2, String str) {
            C13706o.m87929f(str, "text");
            return new Paste(z, z2, str);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Paste)) {
                return false;
            }
            Paste paste = (Paste) obj;
            return this.useClipboard == paste.useClipboard && this.forceClear == paste.forceClear && C13706o.m87924a(this.text, paste.text);
        }

        public String getExtendedDetail(Resources resources) {
            C13706o.m87929f(resources, "res");
            if (!this.useClipboard) {
                return this.text;
            }
            String string = resources.getString(C17541R$string.clipboard_text);
            C13706o.m87928e(string, "{\n                res.ge…board_text)\n            }");
            return string;
        }

        public final boolean getForceClear() {
            return this.forceClear;
        }

        public final String getText() {
            return this.text;
        }

        public final boolean getUseClipboard() {
            return this.useClipboard;
        }

        public int hashCode() {
            boolean z = this.useClipboard;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.forceClear;
            if (!z3) {
                z2 = z3;
            }
            return ((i + (z2 ? 1 : 0)) * 31) + this.text.hashCode();
        }

        public String toString() {
            return "Paste(useClipboard=" + this.useClipboard + ", forceClear=" + this.forceClear + ", text=" + this.text + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C13706o.m87929f(parcel, "out");
            parcel.writeInt(this.useClipboard ? 1 : 0);
            parcel.writeInt(this.forceClear ? 1 : 0);
            parcel.writeString(this.text);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Paste(boolean z, boolean z2, String str) {
            super((C13695i) null);
            C13706o.m87929f(str, "text");
            this.useClipboard = z;
            this.forceClear = z2;
            this.text = str;
        }
    }

    @DontObfuscate
    /* compiled from: UIInteractionAction.kt */
    public static final class PressBack extends UiInteractionConfiguration {
        public static final Parcelable.Creator<PressBack> CREATOR = new C2771a();
        public static final PressBack INSTANCE = new PressBack();

        /* renamed from: com.arlosoft.macrodroid.action.UiInteractionConfiguration$PressBack$a */
        /* compiled from: UIInteractionAction.kt */
        public static final class C2771a implements Parcelable.Creator<PressBack> {
            /* renamed from: a */
            public final PressBack createFromParcel(Parcel parcel) {
                C13706o.m87929f(parcel, "parcel");
                parcel.readInt();
                return PressBack.INSTANCE;
            }

            /* renamed from: b */
            public final PressBack[] newArray(int i) {
                return new PressBack[i];
            }
        }

        private PressBack() {
            super((C13695i) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C13706o.m87929f(parcel, "out");
            parcel.writeInt(1);
        }
    }

    private UiInteractionConfiguration() {
        String simpleName = getClass().getSimpleName();
        C13706o.m87928e(simpleName, "this.javaClass.simpleName");
        this.type = simpleName;
    }

    public /* synthetic */ UiInteractionConfiguration(C13695i iVar) {
        this();
    }

    public String describe() {
        return "";
    }

    public String getExtendedDetail(Resources resources) {
        C13706o.m87929f(resources, "res");
        return "";
    }

    public final String getType() {
        return this.type;
    }
}

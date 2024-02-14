package com.arlosoft.macrodroid.templatestore.model;

import com.arlosoft.macrodroid.common.DontObfuscate;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: Report.kt */
public final class Report {

    /* renamed from: id */
    private final int f13053id;
    private final int macroId;
    private final int reasonCode;
    private final String reasonText;
    private final int userId;

    public Report(int i, int i2, int i3, int i4, String str) {
        C13706o.m87929f(str, "reasonText");
        this.f13053id = i;
        this.userId = i2;
        this.macroId = i3;
        this.reasonCode = i4;
        this.reasonText = str;
    }

    public static /* synthetic */ Report copy$default(Report report, int i, int i2, int i3, int i4, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = report.f13053id;
        }
        if ((i5 & 2) != 0) {
            i2 = report.userId;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = report.macroId;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = report.reasonCode;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            str = report.reasonText;
        }
        return report.copy(i, i6, i7, i8, str);
    }

    public final int component1() {
        return this.f13053id;
    }

    public final int component2() {
        return this.userId;
    }

    public final int component3() {
        return this.macroId;
    }

    public final int component4() {
        return this.reasonCode;
    }

    public final String component5() {
        return this.reasonText;
    }

    public final Report copy(int i, int i2, int i3, int i4, String str) {
        C13706o.m87929f(str, "reasonText");
        return new Report(i, i2, i3, i4, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Report)) {
            return false;
        }
        Report report = (Report) obj;
        return this.f13053id == report.f13053id && this.userId == report.userId && this.macroId == report.macroId && this.reasonCode == report.reasonCode && C13706o.m87924a(this.reasonText, report.reasonText);
    }

    public final int getId() {
        return this.f13053id;
    }

    public final int getMacroId() {
        return this.macroId;
    }

    public final int getReasonCode() {
        return this.reasonCode;
    }

    public final String getReasonText() {
        return this.reasonText;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((this.f13053id * 31) + this.userId) * 31) + this.macroId) * 31) + this.reasonCode) * 31) + this.reasonText.hashCode();
    }

    public String toString() {
        return "Report(id=" + this.f13053id + ", userId=" + this.userId + ", macroId=" + this.macroId + ", reasonCode=" + this.reasonCode + ", reasonText=" + this.reasonText + ')';
    }
}

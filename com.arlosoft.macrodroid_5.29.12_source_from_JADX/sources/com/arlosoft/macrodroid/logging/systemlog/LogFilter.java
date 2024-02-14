package com.arlosoft.macrodroid.logging.systemlog;

import com.arlosoft.macrodroid.common.DontObfuscate;
import com.arlosoft.macrodroid.database.room.C4403i;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: LogFilter.kt */
public final class LogFilter {
    public static final C4854a Companion = new C4854a((C13695i) null);
    /* access modifiers changed from: private */
    public static final LogFilter defaultConfig = new LogFilter(C4403i.INFO.mo28734d(), true, true, true, (List) null, (List) null, 48, (C13695i) null);
    private final List<Long> disabledMacroIds;
    private final List<String> disabledVariableNames;
    private final int logLevel;
    private final boolean showActions;
    private final boolean showConstraints;
    private final boolean showTriggers;

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.LogFilter$a */
    /* compiled from: LogFilter.kt */
    public static final class C4854a {
        private C4854a() {
        }

        public /* synthetic */ C4854a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final LogFilter mo29418a() {
            return LogFilter.defaultConfig;
        }
    }

    public LogFilter(int i, boolean z, boolean z2, boolean z3, List<Long> list, List<String> list2) {
        C13706o.m87929f(list, "disabledMacroIds");
        C13706o.m87929f(list2, "disabledVariableNames");
        this.logLevel = i;
        this.showTriggers = z;
        this.showActions = z2;
        this.showConstraints = z3;
        this.disabledMacroIds = list;
        this.disabledVariableNames = list2;
    }

    public static /* synthetic */ LogFilter copy$default(LogFilter logFilter, int i, boolean z, boolean z2, boolean z3, List<Long> list, List<String> list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = logFilter.logLevel;
        }
        if ((i2 & 2) != 0) {
            z = logFilter.showTriggers;
        }
        boolean z4 = z;
        if ((i2 & 4) != 0) {
            z2 = logFilter.showActions;
        }
        boolean z5 = z2;
        if ((i2 & 8) != 0) {
            z3 = logFilter.showConstraints;
        }
        boolean z6 = z3;
        if ((i2 & 16) != 0) {
            list = logFilter.disabledMacroIds;
        }
        List<Long> list3 = list;
        if ((i2 & 32) != 0) {
            list2 = logFilter.disabledVariableNames;
        }
        return logFilter.copy(i, z4, z5, z6, list3, list2);
    }

    public static final LogFilter getDefaultConfig() {
        return Companion.mo29418a();
    }

    public final int component1() {
        return this.logLevel;
    }

    public final boolean component2() {
        return this.showTriggers;
    }

    public final boolean component3() {
        return this.showActions;
    }

    public final boolean component4() {
        return this.showConstraints;
    }

    public final List<Long> component5() {
        return this.disabledMacroIds;
    }

    public final List<String> component6() {
        return this.disabledVariableNames;
    }

    public final LogFilter copy(int i, boolean z, boolean z2, boolean z3, List<Long> list, List<String> list2) {
        C13706o.m87929f(list, "disabledMacroIds");
        C13706o.m87929f(list2, "disabledVariableNames");
        return new LogFilter(i, z, z2, z3, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogFilter)) {
            return false;
        }
        LogFilter logFilter = (LogFilter) obj;
        return this.logLevel == logFilter.logLevel && this.showTriggers == logFilter.showTriggers && this.showActions == logFilter.showActions && this.showConstraints == logFilter.showConstraints && C13706o.m87924a(this.disabledMacroIds, logFilter.disabledMacroIds) && C13706o.m87924a(this.disabledVariableNames, logFilter.disabledVariableNames);
    }

    public final List<Long> getDisabledMacroIds() {
        return this.disabledMacroIds;
    }

    public final List<String> getDisabledVariableNames() {
        return this.disabledVariableNames;
    }

    public final int getLogLevel() {
        return this.logLevel;
    }

    public final C4403i getLogLevelEnum() {
        return C4403i.f11214a.mo28735a(this.logLevel);
    }

    public final boolean getShowActions() {
        return this.showActions;
    }

    public final boolean getShowConstraints() {
        return this.showConstraints;
    }

    public final boolean getShowTriggers() {
        return this.showTriggers;
    }

    public int hashCode() {
        int i = this.logLevel * 31;
        boolean z = this.showTriggers;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (i + (z ? 1 : 0)) * 31;
        boolean z3 = this.showActions;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.showConstraints;
        if (!z4) {
            z2 = z4;
        }
        return ((((i3 + (z2 ? 1 : 0)) * 31) + this.disabledMacroIds.hashCode()) * 31) + this.disabledVariableNames.hashCode();
    }

    public String toString() {
        return "LogFilter(logLevel=" + this.logLevel + ", showTriggers=" + this.showTriggers + ", showActions=" + this.showActions + ", showConstraints=" + this.showConstraints + ", disabledMacroIds=" + this.disabledMacroIds + ", disabledVariableNames=" + this.disabledVariableNames + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LogFilter(int i, boolean z, boolean z2, boolean z3, List list, List list2, int i2, C13695i iVar) {
        this(i, z, z2, z3, (i2 & 16) != 0 ? C13614t.m87748j() : list, (i2 & 32) != 0 ? C13614t.m87748j() : list2);
    }
}

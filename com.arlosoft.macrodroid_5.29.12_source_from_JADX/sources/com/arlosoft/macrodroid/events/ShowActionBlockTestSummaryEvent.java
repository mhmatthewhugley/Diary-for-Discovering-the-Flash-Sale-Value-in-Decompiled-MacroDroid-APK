package com.arlosoft.macrodroid.events;

import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import java.util.List;
import kotlin.jvm.internal.C13706o;

/* compiled from: ShowActionBlockTestSummaryEvent.kt */
public final class ShowActionBlockTestSummaryEvent {

    /* renamed from: a */
    private final ActionBlock f11762a;

    /* renamed from: b */
    private final List<MacroDroidVariable> f11763b;

    public ShowActionBlockTestSummaryEvent(ActionBlock actionBlock, List<MacroDroidVariable> list) {
        C13706o.m87929f(actionBlock, "actionBlock");
        C13706o.m87929f(list, "outputVars");
        this.f11762a = actionBlock;
        this.f11763b = list;
    }

    /* renamed from: a */
    public final List<MacroDroidVariable> mo29103a() {
        return this.f11763b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowActionBlockTestSummaryEvent)) {
            return false;
        }
        ShowActionBlockTestSummaryEvent showActionBlockTestSummaryEvent = (ShowActionBlockTestSummaryEvent) obj;
        return C13706o.m87924a(this.f11762a, showActionBlockTestSummaryEvent.f11762a) && C13706o.m87924a(this.f11763b, showActionBlockTestSummaryEvent.f11763b);
    }

    public int hashCode() {
        return (this.f11762a.hashCode() * 31) + this.f11763b.hashCode();
    }

    public String toString() {
        return "ShowActionBlockTestSummaryEvent(actionBlock=" + this.f11762a + ", outputVars=" + this.f11763b + ')';
    }
}

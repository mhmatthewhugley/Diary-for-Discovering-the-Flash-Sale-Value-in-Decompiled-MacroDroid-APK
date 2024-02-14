package com.arlosoft.macrodroid.taskerplugin;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.twofortyfouram.locale.sdk.host.model.Plugin;
import java.util.List;
import kotlin.jvm.internal.C13706o;

/* compiled from: TaskerPluginHelper.kt */
public final class App extends ExpandableGroup<Plugin> {

    /* renamed from: d */
    private final String f13049d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public App(String str, String str2, List<Plugin> list) {
        super(str, list);
        C13706o.m87929f(str, "packageName");
        C13706o.m87929f(str2, "appName");
        C13706o.m87929f(list, "items");
        this.f13049d = str2;
    }

    /* renamed from: d */
    public final String mo30173d() {
        return this.f13049d;
    }
}

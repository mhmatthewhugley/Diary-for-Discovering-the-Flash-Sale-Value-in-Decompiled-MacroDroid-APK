package com.arlosoft.macrodroid.quicksettings;

import com.arlosoft.macrodroid.common.DontObfuscate;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: QuickSettingsData.kt */
public final class QuickSettingsData {
    public static final C5068a Companion = new C5068a((C13695i) null);
    public static final int NUM_BUTTONS = 8;
    public static final String QUICK_SETTINGS_CACHE = "QuickSettings";
    public static final String QUICK_SETTINGS_DATA_KEY = "QuickSettingsData";
    @SerializedName(alternate = {"a"}, value = "quickSettingsButtonList")
    private final List<QuickSettingButton> quickSettingsButtonList;

    /* renamed from: com.arlosoft.macrodroid.quicksettings.QuickSettingsData$a */
    /* compiled from: QuickSettingsData.kt */
    public static final class C5068a {
        private C5068a() {
        }

        public /* synthetic */ C5068a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final QuickSettingsData mo29973a() {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 8; i++) {
                arrayList.add(QuickSettingButton.Companion.mo29959b());
            }
            return new QuickSettingsData(arrayList);
        }
    }

    public QuickSettingsData(List<QuickSettingButton> list) {
        C13706o.m87929f(list, "quickSettingsButtonList");
        this.quickSettingsButtonList = list;
    }

    public static /* synthetic */ QuickSettingsData copy$default(QuickSettingsData quickSettingsData, List<QuickSettingButton> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = quickSettingsData.quickSettingsButtonList;
        }
        return quickSettingsData.copy(list);
    }

    public static final QuickSettingsData createDefault() {
        return Companion.mo29973a();
    }

    public final List<QuickSettingButton> component1() {
        return this.quickSettingsButtonList;
    }

    public final QuickSettingsData copy(List<QuickSettingButton> list) {
        C13706o.m87929f(list, "quickSettingsButtonList");
        return new QuickSettingsData(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QuickSettingsData) && C13706o.m87924a(this.quickSettingsButtonList, ((QuickSettingsData) obj).quickSettingsButtonList);
    }

    public final List<QuickSettingButton> getQuickSettingsButtonList() {
        return this.quickSettingsButtonList;
    }

    public int hashCode() {
        return this.quickSettingsButtonList.hashCode();
    }

    public final void replaceButton(QuickSettingButton quickSettingButton, QuickSettingButton quickSettingButton2) {
        C13706o.m87929f(quickSettingButton, "buttonToReplace");
        C13706o.m87929f(quickSettingButton2, "buttonToAdd");
        int indexOf = this.quickSettingsButtonList.indexOf(quickSettingButton);
        if (indexOf >= 0) {
            this.quickSettingsButtonList.remove(indexOf);
            this.quickSettingsButtonList.add(indexOf, quickSettingButton2);
        }
    }

    public String toString() {
        return "QuickSettingsData(quickSettingsButtonList=" + this.quickSettingsButtonList + ')';
    }

    public final void upddateFrom4To8IfRequired() {
        if (this.quickSettingsButtonList.size() == 4) {
            for (int i = 4; i < 8; i++) {
                this.quickSettingsButtonList.add(QuickSettingButton.Companion.mo29959b());
            }
        }
    }
}

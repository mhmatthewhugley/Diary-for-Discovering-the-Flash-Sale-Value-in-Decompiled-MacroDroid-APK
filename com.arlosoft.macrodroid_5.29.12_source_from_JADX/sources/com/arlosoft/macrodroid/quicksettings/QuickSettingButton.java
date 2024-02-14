package com.arlosoft.macrodroid.quicksettings;

import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.common.DontObfuscate;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: QuickSettingButton.kt */
public final class QuickSettingButton {
    public static final C5066a Companion = new C5066a((C13695i) null);
    @SerializedName(alternate = {"f"}, value = "collapseOnPress")
    private final boolean collapseOnPress;
    @SerializedName(alternate = {"c"}, value = "enabled")
    private final boolean enabled;
    @SerializedName(alternate = {"b"}, value = "image")
    private final int image;
    private final String imageName;
    @SerializedName(alternate = {"d"}, value = "isToggle")
    private final boolean isToggle;
    @SerializedName(alternate = {"a"}, value = "label")
    private final String label;
    @SerializedName(alternate = {"e"}, value = "toggleOn")
    private final boolean toggleOn;

    /* renamed from: com.arlosoft.macrodroid.quicksettings.QuickSettingButton$a */
    /* compiled from: QuickSettingButton.kt */
    public static final class C5066a {
        private C5066a() {
        }

        public /* synthetic */ C5066a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final QuickSettingButton mo29958a(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
            C13706o.m87929f(str, "label");
            return new QuickSettingButton(str, i, z, z2, z3, z4, str2);
        }

        /* renamed from: b */
        public final QuickSettingButton mo29959b() {
            return new QuickSettingButton("", C17530R$drawable.ic_settings_applications_white_24dp, false, true, true, false, "ic_settings_applications_white_24dp");
        }
    }

    public QuickSettingButton(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        C13706o.m87929f(str, "label");
        this.label = str;
        this.image = i;
        this.enabled = z;
        this.isToggle = z2;
        this.toggleOn = z3;
        this.collapseOnPress = z4;
        this.imageName = str2;
    }

    public static /* synthetic */ QuickSettingButton copy$default(QuickSettingButton quickSettingButton, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = quickSettingButton.label;
        }
        if ((i2 & 2) != 0) {
            i = quickSettingButton.image;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            z = quickSettingButton.enabled;
        }
        boolean z5 = z;
        if ((i2 & 8) != 0) {
            z2 = quickSettingButton.isToggle;
        }
        boolean z6 = z2;
        if ((i2 & 16) != 0) {
            z3 = quickSettingButton.toggleOn;
        }
        boolean z7 = z3;
        if ((i2 & 32) != 0) {
            z4 = quickSettingButton.collapseOnPress;
        }
        boolean z8 = z4;
        if ((i2 & 64) != 0) {
            str2 = quickSettingButton.imageName;
        }
        return quickSettingButton.copy(str, i3, z5, z6, z7, z8, str2);
    }

    public static final QuickSettingButton create(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        return Companion.mo29958a(str, i, z, z2, z3, z4, str2);
    }

    public static final QuickSettingButton createDefault() {
        return Companion.mo29959b();
    }

    public final String component1() {
        return this.label;
    }

    public final int component2() {
        return this.image;
    }

    public final boolean component3() {
        return this.enabled;
    }

    public final boolean component4() {
        return this.isToggle;
    }

    public final boolean component5() {
        return this.toggleOn;
    }

    public final boolean component6() {
        return this.collapseOnPress;
    }

    public final String component7() {
        return this.imageName;
    }

    public final QuickSettingButton copy(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        C13706o.m87929f(str, "label");
        return new QuickSettingButton(str, i, z, z2, z3, z4, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickSettingButton)) {
            return false;
        }
        QuickSettingButton quickSettingButton = (QuickSettingButton) obj;
        return C13706o.m87924a(this.label, quickSettingButton.label) && this.image == quickSettingButton.image && this.enabled == quickSettingButton.enabled && this.isToggle == quickSettingButton.isToggle && this.toggleOn == quickSettingButton.toggleOn && this.collapseOnPress == quickSettingButton.collapseOnPress && C13706o.m87924a(this.imageName, quickSettingButton.imageName);
    }

    public final boolean getCollapseOnPress() {
        return this.collapseOnPress;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getImage() {
        return this.image;
    }

    public final String getImageName() {
        return this.imageName;
    }

    public final String getLabel() {
        return this.label;
    }

    public final boolean getToggleOn() {
        return this.toggleOn;
    }

    public int hashCode() {
        int hashCode = ((this.label.hashCode() * 31) + this.image) * 31;
        boolean z = this.enabled;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.isToggle;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.toggleOn;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.collapseOnPress;
        if (!z5) {
            z2 = z5;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        String str = this.imageName;
        return i4 + (str == null ? 0 : str.hashCode());
    }

    public final boolean isToggle() {
        return this.isToggle;
    }

    public String toString() {
        return "QuickSettingButton(label=" + this.label + ", image=" + this.image + ", enabled=" + this.enabled + ", isToggle=" + this.isToggle + ", toggleOn=" + this.toggleOn + ", collapseOnPress=" + this.collapseOnPress + ", imageName=" + this.imageName + ')';
    }
}

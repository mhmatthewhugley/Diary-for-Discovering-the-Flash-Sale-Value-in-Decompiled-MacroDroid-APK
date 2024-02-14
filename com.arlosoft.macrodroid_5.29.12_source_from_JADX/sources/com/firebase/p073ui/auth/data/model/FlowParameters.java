package com.firebase.p073ui.auth.data.model;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.firebase.p073ui.auth.AuthMethodPickerLayout;
import com.firebase.p073ui.auth.AuthUI;
import com.google.firebase.auth.ActionCodeSettings;
import java.util.Collections;
import java.util.List;
import p153q5.C8180d;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.data.model.FlowParameters */
public class FlowParameters implements Parcelable {
    public static final Parcelable.Creator<FlowParameters> CREATOR = new C6851a();

    /* renamed from: A */
    public final boolean f15978A;

    /* renamed from: B */
    public final boolean f15979B;

    /* renamed from: C */
    public final boolean f15980C;

    /* renamed from: D */
    public final boolean f15981D;

    /* renamed from: E */
    public final boolean f15982E;
    @Nullable

    /* renamed from: F */
    public final AuthMethodPickerLayout f15983F;
    @NonNull

    /* renamed from: a */
    public final String f15984a;
    @NonNull

    /* renamed from: c */
    public final List<AuthUI.IdpConfig> f15985c;
    @Nullable

    /* renamed from: d */
    public final AuthUI.IdpConfig f15986d;
    @StyleRes

    /* renamed from: f */
    public final int f15987f;
    @DrawableRes

    /* renamed from: g */
    public final int f15988g;
    @Nullable

    /* renamed from: o */
    public final String f15989o;
    @Nullable

    /* renamed from: p */
    public final String f15990p;
    @Nullable

    /* renamed from: s */
    public String f15991s;
    @Nullable

    /* renamed from: z */
    public final ActionCodeSettings f15992z;

    /* renamed from: com.firebase.ui.auth.data.model.FlowParameters$a */
    static class C6851a implements Parcelable.Creator<FlowParameters> {
        C6851a() {
        }

        /* renamed from: a */
        public FlowParameters createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            return new FlowParameters(parcel.readString(), parcel2.createTypedArrayList(AuthUI.IdpConfig.CREATOR), (AuthUI.IdpConfig) parcel2.readParcelable(AuthUI.IdpConfig.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (ActionCodeSettings) parcel2.readParcelable(ActionCodeSettings.class.getClassLoader()), (AuthMethodPickerLayout) parcel2.readParcelable(AuthMethodPickerLayout.class.getClassLoader()));
        }

        /* renamed from: b */
        public FlowParameters[] newArray(int i) {
            return new FlowParameters[i];
        }
    }

    public FlowParameters(@NonNull String str, @NonNull List<AuthUI.IdpConfig> list, @Nullable AuthUI.IdpConfig idpConfig, @StyleRes int i, @DrawableRes int i2, @Nullable String str2, @Nullable String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, @Nullable String str4, @Nullable ActionCodeSettings actionCodeSettings, @Nullable AuthMethodPickerLayout authMethodPickerLayout) {
        String str5 = str;
        this.f15984a = (String) C8180d.m33938b(str, "appName cannot be null", new Object[0]);
        List<AuthUI.IdpConfig> list2 = list;
        this.f15985c = Collections.unmodifiableList((List) C8180d.m33938b(list, "providers cannot be null", new Object[0]));
        this.f15986d = idpConfig;
        this.f15987f = i;
        this.f15988g = i2;
        this.f15989o = str2;
        this.f15990p = str3;
        this.f15978A = z;
        this.f15979B = z2;
        this.f15980C = z3;
        this.f15981D = z4;
        this.f15982E = z5;
        this.f15991s = str4;
        this.f15992z = actionCodeSettings;
        this.f15983F = authMethodPickerLayout;
    }

    /* renamed from: a */
    public static FlowParameters m25800a(Intent intent) {
        return (FlowParameters) intent.getParcelableExtra("extra_flow_params");
    }

    /* renamed from: b */
    public AuthUI.IdpConfig mo34139b() {
        AuthUI.IdpConfig idpConfig = this.f15986d;
        return idpConfig != null ? idpConfig : this.f15985c.get(0);
    }

    /* renamed from: c */
    public boolean mo34140c() {
        return this.f15980C;
    }

    /* renamed from: d */
    public boolean mo34141d() {
        return mo34144f("google.com") || this.f15979B || this.f15978A;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public boolean mo34143e() {
        return !TextUtils.isEmpty(this.f15990p);
    }

    /* renamed from: f */
    public boolean mo34144f(String str) {
        for (AuthUI.IdpConfig b : this.f15985c) {
            if (b.mo34057b().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo34145g() {
        return this.f15985c.size() == 1;
    }

    /* renamed from: h */
    public boolean mo34146h() {
        return !TextUtils.isEmpty(this.f15989o);
    }

    /* renamed from: i */
    public boolean mo34147i() {
        return this.f15986d == null && (!mo34145g() || this.f15981D);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f15984a);
        parcel.writeTypedList(this.f15985c);
        parcel.writeParcelable(this.f15986d, i);
        parcel.writeInt(this.f15987f);
        parcel.writeInt(this.f15988g);
        parcel.writeString(this.f15989o);
        parcel.writeString(this.f15990p);
        parcel.writeInt(this.f15978A ? 1 : 0);
        parcel.writeInt(this.f15979B ? 1 : 0);
        parcel.writeInt(this.f15980C ? 1 : 0);
        parcel.writeInt(this.f15981D ? 1 : 0);
        parcel.writeInt(this.f15982E ? 1 : 0);
        parcel.writeString(this.f15991s);
        parcel.writeParcelable(this.f15992z, i);
        parcel.writeParcelable(this.f15983F, i);
    }
}

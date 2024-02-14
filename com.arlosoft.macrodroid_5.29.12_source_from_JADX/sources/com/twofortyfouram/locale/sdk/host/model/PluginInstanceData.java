package com.twofortyfouram.locale.sdk.host.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.twofortyfouram.locale.sdk.host.internal.BundleSerializer;
import java.util.Arrays;
import java.util.Locale;
import p276h8.C12406a;
import p295j8.C13301a;
import p305k8.C13418c;

public final class PluginInstanceData implements Parcelable {
    @NonNull
    public static final Parcelable.Creator<PluginInstanceData> CREATOR = new Parcelable.Creator<PluginInstanceData>() {
        public PluginInstanceData createFromParcel(Parcel parcel) {
            C12406a.m83260d(parcel, "in");
            PluginType valueOf = PluginType.valueOf(parcel.readString());
            String readString = parcel.readString();
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            return new PluginInstanceData(valueOf, readString, bArr, parcel.readString());
        }

        public PluginInstanceData[] newArray(int i) {
            return new PluginInstanceData[i];
        }
    };
    public static final int MAXIMUM_BUNDLE_SIZE_BYTES = 25000;
    @NonNull
    private String mBlurb;
    @NonNull
    private final String mRegistryName;
    @NonNull
    private final byte[] mSerializedBundle;
    @NonNull
    private final PluginType mType;

    public PluginInstanceData(@NonNull PluginType pluginType, @NonNull String str, @NonNull byte[] bArr, String str2) {
        C12406a.m83260d(pluginType, "type");
        C12406a.m83260d(str, "registryName");
        C12406a.m83260d(bArr, "serializedBundle");
        this.mType = pluginType;
        this.mRegistryName = str;
        this.mSerializedBundle = copyArray(bArr);
        this.mBlurb = str2 == null ? "" : str2;
    }

    @NonNull
    private static byte[] copyArray(@NonNull byte[] bArr) {
        C12406a.m83260d(bArr, "toCopy");
        if (C13301a.m85633a(9)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PluginInstanceData.class != obj.getClass()) {
            return false;
        }
        PluginInstanceData pluginInstanceData = (PluginInstanceData) obj;
        if (this.mBlurb.equals(pluginInstanceData.mBlurb) && this.mRegistryName.equals(pluginInstanceData.mRegistryName) && Arrays.equals(this.mSerializedBundle, pluginInstanceData.mSerializedBundle) && this.mType == pluginInstanceData.mType) {
            return true;
        }
        return false;
    }

    @NonNull
    public String getBlurb() {
        return this.mBlurb;
    }

    @NonNull
    public String getRegistryName() {
        return this.mRegistryName;
    }

    @NonNull
    public byte[] getSerializedBundle() {
        return copyArray(this.mSerializedBundle);
    }

    @NonNull
    public PluginType getType() {
        return this.mType;
    }

    public int hashCode() {
        return (((((this.mType.hashCode() * 31) + this.mRegistryName.hashCode()) * 31) + Arrays.hashCode(this.mSerializedBundle)) * 31) + this.mBlurb.hashCode();
    }

    public void setBlurb(String str) {
        this.mBlurb = str;
    }

    @NonNull
    public String toString() {
        Bundle bundle;
        try {
            bundle = BundleSerializer.deserializeFromByteArray(this.mSerializedBundle);
        } catch (ClassNotFoundException unused) {
            bundle = null;
        }
        return String.format(Locale.US, "PluginInstanceData{mType='%s', mRegistryName='%s', mBlurb='%s', mSerializedBundle='%s'", new Object[]{this.mType, this.mRegistryName, this.mBlurb, C13418c.m85854a(bundle)});
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        C12406a.m83260d(parcel, "dest");
        parcel.writeString(this.mType.name());
        parcel.writeString(this.mRegistryName);
        parcel.writeInt(this.mSerializedBundle.length);
        parcel.writeByteArray(this.mSerializedBundle);
        parcel.writeString(this.mBlurb);
    }
}

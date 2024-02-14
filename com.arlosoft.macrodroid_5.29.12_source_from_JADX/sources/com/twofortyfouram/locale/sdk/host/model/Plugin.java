package com.twofortyfouram.locale.sdk.host.model;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import com.twofortyfouram.locale.sdk.host.C11788R;
import java.util.Locale;
import p276h8.C12406a;
import p285i8.C12447a;

public final class Plugin implements Parcelable {
    @NonNull
    public static final Parcelable.Creator<Plugin> CREATOR = new Parcelable.Creator<Plugin>() {
        public Plugin createFromParcel(Parcel parcel) {
            return new Plugin(PluginType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), (PluginConfiguration) parcel.readParcelable(getClass().getClassLoader()));
        }

        public Plugin[] newArray(int i) {
            return new Plugin[i];
        }
    };
    @NonNull
    private final String mActivityClassName;
    @NonNull
    private final PluginConfiguration mConfiguration;
    @NonNull
    private final String mPackageName;
    @NonNull
    private final String mReceiverClassName;
    @NonNull
    private final String mRegistryName;
    @NonNull
    private final PluginType mType;
    private final int mVersionCode;

    public Plugin(@NonNull PluginType pluginType, @Size(min = 1) @NonNull String str, @Size(min = 1) @NonNull String str2, @Size(min = 1) @NonNull String str3, int i, @NonNull PluginConfiguration pluginConfiguration) {
        C12406a.m83260d(pluginType, "type");
        C12406a.m83259c(str, "packageName");
        C12406a.m83259c(str2, "activityClassName");
        C12406a.m83259c(str3, "receiverClassName");
        C12406a.m83260d(pluginConfiguration, "configuration");
        this.mType = pluginType;
        this.mPackageName = str;
        this.mActivityClassName = str2;
        this.mReceiverClassName = str3;
        this.mRegistryName = generateRegistryName(str, str2);
        this.mVersionCode = i;
        this.mConfiguration = pluginConfiguration;
    }

    @NonNull
    public static String generateRegistryName(@NonNull String str, @NonNull String str2) {
        C12406a.m83259c(str, "packageName");
        C12406a.m83259c(str2, "activityName");
        return String.format(Locale.US, "%s:%s", new Object[]{str, str2});
    }

    @NonNull
    private ComponentName getComponentName() {
        return new ComponentName(getPackageName(), getActivityClassName());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Plugin.class != obj.getClass()) {
            return false;
        }
        Plugin plugin = (Plugin) obj;
        if (this.mVersionCode == plugin.mVersionCode && this.mActivityClassName.equals(plugin.mActivityClassName) && this.mConfiguration.equals(plugin.mConfiguration) && this.mPackageName.equals(plugin.mPackageName) && this.mReceiverClassName.equals(plugin.mReceiverClassName) && this.mRegistryName.equals(plugin.mRegistryName) && this.mType == plugin.mType) {
            return true;
        }
        return false;
    }

    @NonNull
    public final String getActivityClassName() {
        return this.mActivityClassName;
    }

    @Nullable
    public final Drawable getActivityIcon(@NonNull Context context) {
        Drawable drawable;
        C12406a.m83260d(context, "context");
        PackageManager packageManager = context.getPackageManager();
        try {
            drawable = packageManager.getActivityIcon(getComponentName());
        } catch (PackageManager.NameNotFoundException unused) {
            drawable = packageManager.getDefaultActivityIcon();
        }
        if (!(drawable instanceof BitmapDrawable)) {
            return drawable;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C11788R.dimen.com_twofortyfouram_locale_sdk_host_plugin_icon_size);
        if (drawable.getIntrinsicHeight() == dimensionPixelSize && drawable.getIntrinsicWidth() == dimensionPixelSize) {
            return drawable;
        }
        C12447a.m83384a("WARNING: Plug-in %s Activity icon size %dx%d is inappropriate for current screen resolution.  Icon should be %dx%d pixels", getActivityClassName(), Integer.valueOf(drawable.getIntrinsicWidth()), Integer.valueOf(drawable.getIntrinsicHeight()), Integer.valueOf(dimensionPixelSize), Integer.valueOf(dimensionPixelSize));
        return new BitmapDrawable(resources, Bitmap.createScaledBitmap(((BitmapDrawable) drawable).getBitmap(), dimensionPixelSize, dimensionPixelSize, false));
    }

    @NonNull
    public final String getActivityLabel(@NonNull Context context) {
        CharSequence charSequence;
        C12406a.m83260d(context, "context");
        CharSequence activityClassName = getActivityClassName();
        PackageManager packageManager = context.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(getComponentName(), 0);
            int i = activityInfo.labelRes;
            if (i == 0 && (charSequence = activityInfo.nonLocalizedLabel) != null) {
                activityClassName = charSequence;
            } else if (i != 0) {
                activityClassName = packageManager.getText(getPackageName(), activityInfo.labelRes, activityInfo.applicationInfo);
            }
            if (activityClassName == null || activityClassName.length() == 0) {
                activityClassName = getActivityClassName();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return activityClassName.toString();
    }

    @NonNull
    public final PluginConfiguration getConfiguration() {
        return this.mConfiguration;
    }

    @NonNull
    public final String getPackageName() {
        return this.mPackageName;
    }

    @NonNull
    public final String getReceiverClassName() {
        return this.mReceiverClassName;
    }

    @NonNull
    public final String getRegistryName() {
        return this.mRegistryName;
    }

    @NonNull
    public final PluginType getType() {
        return this.mType;
    }

    public final int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return (((((((((((this.mType.hashCode() * 31) + this.mPackageName.hashCode()) * 31) + this.mActivityClassName.hashCode()) * 31) + this.mReceiverClassName.hashCode()) * 31) + this.mRegistryName.hashCode()) * 31) + this.mVersionCode) * 31) + this.mConfiguration.hashCode();
    }

    public String toString() {
        return String.format(Locale.US, "Plugin [mType=%s, mPackageName=%s, mActivityClassName=%s, mReceiverClassName=%s, mVersionCode=%s, mConfiguration=%s]", new Object[]{this.mType, this.mPackageName, this.mActivityClassName, this.mReceiverClassName, Integer.valueOf(this.mVersionCode), this.mConfiguration});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mType.name());
        parcel.writeString(this.mPackageName);
        parcel.writeString(this.mActivityClassName);
        parcel.writeString(this.mReceiverClassName);
        parcel.writeInt(this.mVersionCode);
        parcel.writeParcelable(this.mConfiguration, i);
    }
}

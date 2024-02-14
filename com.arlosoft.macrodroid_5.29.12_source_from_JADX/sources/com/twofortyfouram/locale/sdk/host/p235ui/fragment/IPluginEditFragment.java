package com.twofortyfouram.locale.sdk.host.p235ui.fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import com.twofortyfouram.locale.sdk.host.model.Plugin;
import com.twofortyfouram.locale.sdk.host.model.PluginErrorEdit;
import com.twofortyfouram.locale.sdk.host.model.PluginInstanceData;
import java.util.EnumSet;

/* renamed from: com.twofortyfouram.locale.sdk.host.ui.fragment.IPluginEditFragment */
public interface IPluginEditFragment {
    @NonNull
    public static final String ARG_EXTRA_PARCELABLE_CURRENT_PLUGIN = "com.twofortyfouram.locale.sdk.host.ui.fragment.PluginEditFragment.arg.PARCELABLE_CURRENT_PLUGIN";
    @NonNull
    public static final String ARG_EXTRA_PARCELABLE_PREVIOUS_PLUGIN_INSTANCE_DATA = "com.twofortyfouram.locale.sdk.host.ui.fragment.PluginEditFragment.arg.PARCELABLE_PREVIOUS_PLUGIN_INSTANCE_DATA";

    void handleCancel(@NonNull Plugin plugin);

    void handleErrors(@NonNull Plugin plugin, @Size(min = 1) @NonNull EnumSet<PluginErrorEdit> enumSet);

    void handleSave(@NonNull Plugin plugin, @NonNull PluginInstanceData pluginInstanceData, @Nullable String[] strArr);
}

package com.twofortyfouram.locale.sdk.host.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import com.twofortyfouram.locale.sdk.host.model.Plugin;
import com.twofortyfouram.locale.sdk.host.model.PluginErrorEdit;
import com.twofortyfouram.locale.sdk.host.model.PluginInstanceData;
import com.twofortyfouram.locale.sdk.host.p235ui.fragment.IPluginEditFragment;
import java.util.EnumSet;
import p276h8.C12406a;
import p276h8.C12407b;
import p285i8.C12447a;
import p305k8.C13419d;

public final class PluginEditDelegate {
    @NonNull
    public static Plugin getCurrentPlugin(@NonNull Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable(IPluginEditFragment.ARG_EXTRA_PARCELABLE_CURRENT_PLUGIN);
        if (parcelable == null) {
            throw new IllegalArgumentException(C12447a.m83390g("Arg %s is missing", IPluginEditFragment.ARG_EXTRA_PARCELABLE_CURRENT_PLUGIN));
        } else if (parcelable instanceof Plugin) {
            return (Plugin) parcelable;
        } else {
            throw new IllegalArgumentException(C12447a.m83390g("Arg %s is the wrong type", IPluginEditFragment.ARG_EXTRA_PARCELABLE_CURRENT_PLUGIN));
        }
    }

    @NonNull
    public static Intent getPluginStartIntent(@NonNull Plugin plugin, @Nullable PluginInstanceData pluginInstanceData, @Nullable String str) {
        C12406a.m83260d(plugin, "plugin");
        Intent intent = new Intent(plugin.getType().getActivityIntentAction());
        intent.setClassName(plugin.getPackageName(), plugin.getActivityClassName());
        intent.putExtra("com.twofortyfouram.locale.intent.extra.BREADCRUMB", str);
        TaskerPlugin.Host.addCapabilities(intent, 126);
        if (pluginInstanceData != null) {
            Bundle bundle = null;
            try {
                bundle = BundleSerializer.deserializeFromByteArray(pluginInstanceData.getSerializedBundle());
            } catch (AssertionError | Exception unused) {
            }
            if (bundle != null) {
                intent.putExtra("com.twofortyfouram.locale.intent.extra.BUNDLE", bundle);
                intent.putExtra("com.twofortyfouram.locale.intent.extra.BLURB", pluginInstanceData.getBlurb());
                if (plugin.getConfiguration().isBackwardsCompatibilityEnabled()) {
                    intent.putExtras(bundle);
                }
            }
        }
        return intent;
    }

    @Nullable
    public static PluginInstanceData getPreviousPluginInstanceData(@NonNull Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable(IPluginEditFragment.ARG_EXTRA_PARCELABLE_PREVIOUS_PLUGIN_INSTANCE_DATA);
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof PluginInstanceData) {
            return (PluginInstanceData) parcelable;
        }
        throw new IllegalArgumentException(C12447a.m83390g("Arg %s is the wrong type", IPluginEditFragment.ARG_EXTRA_PARCELABLE_PREVIOUS_PLUGIN_INSTANCE_DATA));
    }

    @NonNull
    public static EnumSet<PluginErrorEdit> isIntentValid(@Nullable Intent intent, @NonNull Plugin plugin) {
        EnumSet<PluginErrorEdit> noneOf = EnumSet.noneOf(PluginErrorEdit.class);
        if (intent == null) {
            noneOf.add(PluginErrorEdit.INTENT_NULL);
        } else {
            if (C13419d.m85855a(intent)) {
                noneOf.add(PluginErrorEdit.PRIVATE_SERIALIZABLE);
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                noneOf.add(PluginErrorEdit.BLURB_MISSING);
                noneOf.add(PluginErrorEdit.BUNDLE_MISSING);
            } else {
                Bundle bundle = extras.getBundle("com.twofortyfouram.locale.intent.extra.BUNDLE");
                if (C13419d.m85856b(bundle)) {
                    noneOf.add(PluginErrorEdit.PRIVATE_SERIALIZABLE);
                }
                if (bundle == null) {
                    if (plugin.getConfiguration().isBackwardsCompatibilityEnabled()) {
                        Bundle bundle2 = new Bundle(intent.getExtras());
                        bundle2.remove("com.twofortyfouram.locale.intent.extra.BLURB");
                        intent.putExtra("com.twofortyfouram.locale.intent.extra.BUNDLE", bundle2);
                    } else {
                        noneOf.add(PluginErrorEdit.BUNDLE_MISSING);
                    }
                }
                try {
                    if (extras.getString("com.twofortyfouram.locale.intent.extra.BLURB") == null) {
                        extras.putString("com.twofortyfouram.locale.intent.extra.BLURB", "");
                    }
                    C12407b.m83264c(extras, "com.twofortyfouram.locale.intent.extra.BLURB", false, true);
                } catch (AssertionError unused) {
                    noneOf.add(PluginErrorEdit.BLURB_MISSING);
                }
            }
        }
        return noneOf;
    }

    @NonNull
    public static Bundle newArgs(@NonNull Plugin plugin, @Nullable PluginInstanceData pluginInstanceData) {
        C12406a.m83260d(plugin, "plugin");
        Bundle bundle = new Bundle();
        bundle.putParcelable(IPluginEditFragment.ARG_EXTRA_PARCELABLE_CURRENT_PLUGIN, plugin);
        if (pluginInstanceData != null) {
            bundle.putParcelable(IPluginEditFragment.ARG_EXTRA_PARCELABLE_PREVIOUS_PLUGIN_INSTANCE_DATA, pluginInstanceData);
        }
        return bundle;
    }

    @Nullable
    public static byte[] serializeBundle(@NonNull Bundle bundle, @NonNull EnumSet<PluginErrorEdit> enumSet) {
        byte[] bArr;
        C12406a.m83260d(bundle, "bundle");
        try {
            bArr = BundleSerializer.serializeToByteArray(bundle);
        } catch (Exception unused) {
            enumSet.add(PluginErrorEdit.BUNDLE_NOT_SERIALIZABLE);
            bArr = null;
        }
        if (bArr == null || 25000 >= bArr.length) {
            return bArr;
        }
        enumSet.add(PluginErrorEdit.BUNDLE_TOO_LARGE);
        return null;
    }
}

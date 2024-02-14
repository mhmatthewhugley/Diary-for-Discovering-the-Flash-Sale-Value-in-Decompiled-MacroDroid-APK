package com.twofortyfouram.locale.sdk.host.p235ui.fragment;

import android.app.ActionBar;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import com.twofortyfouram.locale.sdk.host.internal.BundleSerializer;
import com.twofortyfouram.locale.sdk.host.internal.PluginEditDelegate;
import com.twofortyfouram.locale.sdk.host.model.Plugin;
import com.twofortyfouram.locale.sdk.host.model.PluginErrorEdit;
import com.twofortyfouram.locale.sdk.host.model.PluginInstanceData;
import java.util.EnumSet;
import p276h8.C12406a;
import p285i8.C12447a;
import p295j8.C13301a;
import p305k8.C13416a;

/* renamed from: com.twofortyfouram.locale.sdk.host.ui.fragment.AbstractSupportPluginEditFragment */
public abstract class AbstractSupportPluginEditFragment extends Fragment implements IPluginEditFragment {
    private static final int REQUEST_CODE_EDIT_PLUGIN = 1;
    @Nullable
    private Plugin mPlugin = null;
    @Nullable
    private PluginInstanceData mPreviousPluginInstanceData = null;

    @Nullable
    private String getBreadcrumbHoneycomb() {
        CharSequence subtitle;
        ActionBar actionBar = getActivity().getActionBar();
        if (actionBar == null || (subtitle = actionBar.getSubtitle()) == null) {
            return null;
        }
        return subtitle.toString();
    }

    private void handleCancelInternal(@NonNull Plugin plugin) {
        C12406a.m83260d(plugin, "plugin");
        handleCancel(plugin);
        removeSelf();
    }

    private void handleErrorsInternal(@NonNull Plugin plugin, @NonNull EnumSet<PluginErrorEdit> enumSet) {
        handleErrors(plugin, enumSet);
        removeSelf();
    }

    private void handleSaveInternal(@NonNull Bundle bundle, @NonNull String str, @Nullable Bundle bundle2, @Nullable String str2, @Nullable String[] strArr) {
        if (!str.equals(str2) || !C13416a.m85852a(bundle, bundle2)) {
            EnumSet<E> noneOf = EnumSet.noneOf(PluginErrorEdit.class);
            byte[] serializeBundle = PluginEditDelegate.serializeBundle(bundle, noneOf);
            if (serializeBundle != null) {
                handleSave(this.mPlugin, new PluginInstanceData(this.mPlugin.getType(), this.mPlugin.getRegistryName(), serializeBundle, str), strArr);
                removeSelf();
                return;
            }
            handleErrorsInternal(this.mPlugin, noneOf);
            return;
        }
        removeSelf();
    }

    @NonNull
    public static Bundle newArgs(@NonNull Plugin plugin, @Nullable PluginInstanceData pluginInstanceData) {
        C12406a.m83260d(plugin, "plugin");
        return PluginEditDelegate.newArgs(plugin, pluginInstanceData);
    }

    private void removeSelf() {
        getFragmentManager().beginTransaction().remove(this).commit();
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        String str;
        Bundle bundle;
        if (1 != i) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            C12447a.m83384a("Received result code RESULT_OK", new Object[0]);
            EnumSet<PluginErrorEdit> isIntentValid = PluginEditDelegate.isIntentValid(intent, this.mPlugin);
            if (isIntentValid.isEmpty()) {
                Bundle bundleExtra = intent.getBundleExtra("com.twofortyfouram.locale.intent.extra.BUNDLE");
                String stringExtra = intent.getStringExtra("com.twofortyfouram.locale.intent.extra.BLURB");
                PluginInstanceData pluginInstanceData = this.mPreviousPluginInstanceData;
                Bundle bundle2 = null;
                if (pluginInstanceData != null) {
                    try {
                        bundle2 = BundleSerializer.deserializeFromByteArray(pluginInstanceData.getSerializedBundle());
                    } catch (ClassNotFoundException unused) {
                    }
                    str = this.mPreviousPluginInstanceData.getBlurb();
                    bundle = bundle2;
                } else {
                    bundle = null;
                    str = null;
                }
                handleSaveInternal(bundleExtra, stringExtra, bundle, str, TaskerPlugin.getRelevantVariableList(intent.getExtras()));
                return;
            }
            handleErrorsInternal(this.mPlugin, isIntentValid);
        } else if (i2 != 0) {
            C12447a.m83384a("ERROR: Received illegal result code %d", Integer.valueOf(i2));
            handleErrorsInternal(this.mPlugin, EnumSet.of(PluginErrorEdit.UNKNOWN_ACTIVITY_RESULT_CODE));
        } else {
            C12447a.m83384a("Received result code RESULT_CANCELED", new Object[0]);
            handleCancelInternal(this.mPlugin);
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mPlugin = PluginEditDelegate.getCurrentPlugin(arguments);
            this.mPreviousPluginInstanceData = PluginEditDelegate.getPreviousPluginInstanceData(arguments);
            return;
        }
        throw new IllegalArgumentException("arguments are missing");
    }

    public void onCreate(@Nullable Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (C13301a.m85633a(11)) {
            str = getBreadcrumbHoneycomb();
        } else {
            CharSequence title = getActivity().getTitle();
            str = title != null ? title.toString() : null;
        }
        try {
            startActivityForResult(PluginEditDelegate.getPluginStartIntent(this.mPlugin, this.mPreviousPluginInstanceData, str), 1);
        } catch (ActivityNotFoundException unused) {
            handleErrorsInternal(this.mPlugin, EnumSet.of(PluginErrorEdit.ACTIVITY_NOT_FOUND_EXCEPTION));
        } catch (SecurityException unused2) {
            handleErrorsInternal(this.mPlugin, EnumSet.of(PluginErrorEdit.SECURITY_EXCEPTION));
        }
    }
}

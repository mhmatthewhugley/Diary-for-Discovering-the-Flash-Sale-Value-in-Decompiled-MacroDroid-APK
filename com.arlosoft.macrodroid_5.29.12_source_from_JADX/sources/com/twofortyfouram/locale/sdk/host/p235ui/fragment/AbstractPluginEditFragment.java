package com.twofortyfouram.locale.sdk.host.p235ui.fragment;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import com.twofortyfouram.locale.sdk.host.internal.BundleSerializer;
import com.twofortyfouram.locale.sdk.host.internal.PluginEditDelegate;
import com.twofortyfouram.locale.sdk.host.model.Plugin;
import com.twofortyfouram.locale.sdk.host.model.PluginErrorEdit;
import com.twofortyfouram.locale.sdk.host.model.PluginInstanceData;
import java.util.EnumSet;
import p276h8.C12406a;
import p285i8.C12447a;

/* renamed from: com.twofortyfouram.locale.sdk.host.ui.fragment.AbstractPluginEditFragment */
public abstract class AbstractPluginEditFragment extends Fragment implements IPluginEditFragment {
    private static final int REQUEST_CODE_EDIT_PLUGIN = 1;
    @NonNull
    private static final String STATE_BOOLEAN_IS_SAVED_INSTANCE = (AbstractSupportPluginEditFragment.class.getName() + ".state.BOOLEAN_IS_SAVED_INSTANCE");
    @Nullable
    private Plugin mPlugin = null;
    @Nullable
    private PluginInstanceData mPreviousPluginInstanceData = null;

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
        EnumSet<E> noneOf = EnumSet.noneOf(PluginErrorEdit.class);
        byte[] serializeBundle = serializeBundle(bundle, noneOf);
        if (serializeBundle != null) {
            handleSave(this.mPlugin, new PluginInstanceData(this.mPlugin.getType(), this.mPlugin.getRegistryName(), serializeBundle, str), strArr);
            removeSelf();
            return;
        }
        handleErrorsInternal(this.mPlugin, noneOf);
    }

    @NonNull
    public static Bundle newArgs(@NonNull Plugin plugin, @Nullable PluginInstanceData pluginInstanceData) {
        C12406a.m83260d(plugin, "plugin");
        return PluginEditDelegate.newArgs(plugin, pluginInstanceData);
    }

    private void removeSelf() {
        getFragmentManager().beginTransaction().remove(this).commit();
    }

    @Nullable
    private static byte[] serializeBundle(@NonNull Bundle bundle, @NonNull EnumSet<PluginErrorEdit> enumSet) {
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

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mPlugin = PluginEditDelegate.getCurrentPlugin(arguments);
            this.mPreviousPluginInstanceData = PluginEditDelegate.getPreviousPluginInstanceData(arguments);
            return;
        }
        throw new IllegalArgumentException("arguments are missing");
    }

    public void onCreate(@Nullable Bundle bundle) {
        CharSequence subtitle;
        super.onCreate(bundle);
        if (bundle == null) {
            String str = null;
            ActionBar actionBar = getActivity().getActionBar();
            if (!(actionBar == null || (subtitle = actionBar.getSubtitle()) == null)) {
                str = subtitle.toString();
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

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(STATE_BOOLEAN_IS_SAVED_INSTANCE, true);
    }
}

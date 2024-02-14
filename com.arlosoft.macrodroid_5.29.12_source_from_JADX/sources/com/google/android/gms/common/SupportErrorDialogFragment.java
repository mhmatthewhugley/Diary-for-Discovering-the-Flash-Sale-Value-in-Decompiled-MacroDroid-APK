package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class SupportErrorDialogFragment extends DialogFragment {

    /* renamed from: a */
    private Dialog f3077a;

    /* renamed from: c */
    private DialogInterface.OnCancelListener f3078c;
    @Nullable

    /* renamed from: d */
    private Dialog f3079d;

    @NonNull
    /* renamed from: U */
    public static SupportErrorDialogFragment m3581U(@NonNull Dialog dialog, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) Preconditions.m4489l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        supportErrorDialogFragment.f3077a = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.f3078c = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    public void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f3078c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = this.f3077a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f3079d == null) {
            this.f3079d = new AlertDialog.Builder((Context) Preconditions.m4488k(getContext())).create();
        }
        return this.f3079d;
    }

    public void show(@NonNull FragmentManager fragmentManager, @Nullable String str) {
        super.show(fragmentManager, str);
    }
}

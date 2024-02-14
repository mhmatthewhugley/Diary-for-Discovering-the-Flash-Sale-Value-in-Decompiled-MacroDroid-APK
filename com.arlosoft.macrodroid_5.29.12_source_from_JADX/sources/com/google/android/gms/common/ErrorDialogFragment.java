package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ErrorDialogFragment extends DialogFragment {

    /* renamed from: a */
    private Dialog f3049a;

    /* renamed from: c */
    private DialogInterface.OnCancelListener f3050c;
    @Nullable

    /* renamed from: d */
    private Dialog f3051d;

    @NonNull
    /* renamed from: a */
    public static ErrorDialogFragment m3519a(@NonNull Dialog dialog, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Dialog dialog2 = (Dialog) Preconditions.m4489l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        errorDialogFragment.f3049a = dialog2;
        if (onCancelListener != null) {
            errorDialogFragment.f3050c = onCancelListener;
        }
        return errorDialogFragment;
    }

    public void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f3050c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = this.f3049a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f3051d == null) {
            this.f3051d = new AlertDialog.Builder((Context) Preconditions.m4488k(getActivity())).create();
        }
        return this.f3051d;
    }

    public void show(@NonNull FragmentManager fragmentManager, @Nullable String str) {
        super.show(fragmentManager, str);
    }
}

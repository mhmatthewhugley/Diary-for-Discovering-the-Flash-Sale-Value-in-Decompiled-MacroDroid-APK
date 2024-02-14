package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class BottomSheetDialogFragment extends AppCompatDialogFragment {

    /* renamed from: a */
    private boolean f48872a;

    private class BottomSheetDismissCallback extends BottomSheetBehavior.BottomSheetCallback {
        private BottomSheetDismissCallback() {
        }

        /* renamed from: a */
        public void mo28985a(@NonNull View view, float f) {
        }

        /* renamed from: b */
        public void mo28986b(@NonNull View view, int i) {
            if (i == 5) {
                BottomSheetDialogFragment.this.m67697V();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m67697V() {
        if (this.f48872a) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    /* renamed from: W */
    private void m67698W(@NonNull BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.f48872a = z;
        if (bottomSheetBehavior.mo56933C() == 5) {
            m67697V();
            return;
        }
        if (getDialog() instanceof BottomSheetDialog) {
            ((BottomSheetDialog) getDialog()).mo56974l();
        }
        bottomSheetBehavior.mo56959o(new BottomSheetDismissCallback());
        bottomSheetBehavior.mo56951Y(5);
    }

    /* renamed from: X */
    private boolean m67699X(boolean z) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof BottomSheetDialog)) {
            return false;
        }
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialog;
        BottomSheetBehavior<FrameLayout> j = bottomSheetDialog.mo56972j();
        if (!j.mo56935F() || !bottomSheetDialog.mo56973k()) {
            return false;
        }
        m67698W(j, z);
        return true;
    }

    public void dismiss() {
        if (!m67699X(false)) {
            super.dismiss();
        }
    }

    public void dismissAllowingStateLoss() {
        if (!m67699X(true)) {
            super.dismissAllowingStateLoss();
        }
    }

    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        return new BottomSheetDialog(getContext(), getTheme());
    }
}

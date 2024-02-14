package com.arlosoft.macrodroid.bugreporting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.settings.C5163j2;

public class SubmitBugFragment extends Fragment {
    @BindView(2131362656)
    EditText emailAddress;

    /* renamed from: U */
    public static SubmitBugFragment m15162U() {
        return new SubmitBugFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C17535R$layout.fragment_submit_bug, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        String Q = C5163j2.m20040Q(getActivity());
        if (Q != null) {
            this.emailAddress.setText(Q);
        }
        return inflate;
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131363898})
    public void onFabClicked() {
        ((ReportBugActivity) getActivity()).mo27494k2(this.emailAddress.getText().toString());
    }
}

package com.arlosoft.macrodroid.bugreporting;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.ArrayList;
import java.util.List;

public class SelectMacrosFragment extends Fragment {

    /* renamed from: a */
    private List<Macro> f10087a;
    @BindView(2131363116)
    ListView macroListView;

    /* renamed from: V */
    private void m15157V() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle((CharSequence) getContext().getString(C17541R$string.no_macros_selected));
        builder.setMessage((int) C17541R$string.confirm_no_macros);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3895d(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* renamed from: W */
    private void m15158W() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle((CharSequence) getContext().getString(C17541R$string.error));
        builder.setMessage((int) C17541R$string.too_many_macros);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m15159X(DialogInterface dialogInterface, int i) {
        ((ReportBugActivity) getActivity()).mo27493h2(new ArrayList());
    }

    /* renamed from: Z */
    public static SelectMacrosFragment m15160Z() {
        SelectMacrosFragment selectMacrosFragment = new SelectMacrosFragment();
        selectMacrosFragment.setArguments(new Bundle());
        return selectMacrosFragment;
    }

    /* renamed from: a0 */
    private void m15161a0() {
        ArrayList arrayList = new ArrayList();
        for (Macro name : this.f10087a) {
            arrayList.add(name.getName());
        }
        this.macroListView.setAdapter(new ArrayAdapter(getActivity(), C17535R$layout.multi_choice_list_item, arrayList));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C17535R$layout.fragment_bug_macro_select, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        this.f10087a = C4934n.m18998M().mo29672B(true);
        m15161a0();
        return inflate;
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131362390})
    public void onFabClicked() {
        SparseBooleanArray checkedItemPositions = this.macroListView.getCheckedItemPositions();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.macroListView.getCount(); i++) {
            if (checkedItemPositions.get(i)) {
                arrayList.add(this.f10087a.get(i));
            }
        }
        if (arrayList.size() == 0) {
            m15157V();
        } else if (arrayList.size() <= 4) {
            ((ReportBugActivity) getActivity()).mo27493h2(arrayList);
        } else {
            m15158W();
        }
    }
}

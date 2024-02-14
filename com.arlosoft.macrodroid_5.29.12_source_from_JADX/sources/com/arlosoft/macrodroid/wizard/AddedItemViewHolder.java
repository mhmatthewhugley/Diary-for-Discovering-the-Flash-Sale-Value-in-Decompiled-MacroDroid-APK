package com.arlosoft.macrodroid.wizard;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.events.MacroUpdateEvent;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.utils.C6415p;
import java.util.ArrayList;
import java.util.List;
import p161s1.C10180a;
import p236d4.C11936a;
import p236d4.C11937b;

public class AddedItemViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private Activity f15424a;
    @BindView(2131362367)
    FrameLayout andOrLayout;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Macro f15425b;

    /* renamed from: c */
    private int f15426c;
    @BindView(2131362965)
    CardView cardView;
    @BindView(2131362368)
    Spinner constraintSpinner;
    @BindView(2131362666)
    TextView emptyText;
    @BindView(2131362996)
    LinearLayout listLayout;

    /* renamed from: com.arlosoft.macrodroid.wizard.AddedItemViewHolder$a */
    class C6643a implements AdapterView.OnItemSelectedListener {
        C6643a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            Macro v = AddedItemViewHolder.this.f15425b;
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            v.setConstraintIsOrCondition(z);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public AddedItemViewHolder(Activity activity, View view, Macro macro, int i) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f15424a = activity;
        this.f15425b = macro;
        this.f15426c = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m25139x(SelectableItem selectableItem, int i, List list, View view) {
        m25141z(selectableItem, i, list.size());
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m25140y(String[] strArr, SelectableItem selectableItem, int i, DialogInterface dialogInterface, int i2) {
        String str = strArr[i2];
        if (str.equals(this.f15424a.getString(C17541R$string.configure))) {
            selectableItem.mo24687G2(this.f15425b);
            selectableItem.mo27877y2(this.f15424a);
            selectableItem.mo25540W1();
        } else if (str.equals(this.f15424a.getString(C17541R$string.delete))) {
            this.f15425b.removeItem(selectableItem);
            C10180a.m40075a().mo80018i(new MacroUpdateEvent(1, selectableItem.mo24673T0().mo26466j(), i, -1));
        } else if (str.equals(this.f15424a.getString(C17541R$string.move_up))) {
            selectableItem.mo24693V1(true);
            C10180a.m40075a().mo80018i(new MacroUpdateEvent(2, selectableItem.mo24673T0().mo26466j(), i, i - 1));
        } else if (str.equals(this.f15424a.getString(C17541R$string.move_down))) {
            selectableItem.mo24693V1(false);
            C10180a.m40075a().mo80018i(new MacroUpdateEvent(2, selectableItem.mo24673T0().mo26466j(), i, i + 1));
        }
    }

    /* renamed from: z */
    private void m25141z(SelectableItem selectableItem, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        if (selectableItem.mo24788B1()) {
            arrayList.add(this.f15424a.getString(C17541R$string.configure));
        }
        arrayList.add(this.f15424a.getString(C17541R$string.delete));
        if (this.f15426c == 1) {
            if (i < i2 - 1 && i2 > 1) {
                arrayList.add(this.f15424a.getString(C17541R$string.move_down));
            }
            if (i > 0) {
                arrayList.add(this.f15424a.getString(C17541R$string.move_up));
            }
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f15424a);
        builder.setTitle((CharSequence) selectableItem.mo27831M0()).setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C11936a(this, strArr, selectableItem, i));
        builder.create().show();
    }

    /* renamed from: w */
    public void mo32920w(List<? extends SelectableItem> list) {
        this.cardView.setCardBackgroundColor(ContextCompat.getColor(this.f15424a, C6415p.m24702d(this.f15426c)));
        this.listLayout.removeAllViews();
        if (list.size() == 0) {
            this.andOrLayout.setVisibility(8);
            this.emptyText.setVisibility(0);
            TextView textView = this.emptyText;
            textView.setText("(" + this.f15424a.getString(SelectableItem.m15533b1(this.f15426c)) + ")");
            return;
        }
        this.emptyText.setVisibility(8);
        if (this.f15426c != 2 || list.size() <= 1) {
            this.andOrLayout.setVisibility(8);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f15424a.getString(C17541R$string.and));
            arrayList.add(this.f15424a.getString(C17541R$string.f7057or));
            ArrayAdapter arrayAdapter = new ArrayAdapter(this.f15424a, C17535R$layout.simple_spinner_item_white_text, arrayList);
            arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
            this.constraintSpinner.setAdapter(arrayAdapter);
            this.andOrLayout.setVisibility(0);
            this.constraintSpinner.setSelection(this.f15425b.isConstraintOrCondition() ? 1 : 0);
            this.constraintSpinner.setOnItemSelectedListener(new C6643a());
        }
        this.emptyText.setVisibility(8);
        LayoutInflater layoutInflater = this.f15424a.getLayoutInflater();
        int i = 0;
        for (SelectableItem selectableItem : list) {
            View inflate = layoutInflater.inflate(C17535R$layout.macro_edit_entry, this.listLayout, false);
            TextView textView2 = (TextView) inflate.findViewById(C17532R$id.macro_edit_entry_detail);
            ImageView imageView = (ImageView) inflate.findViewById(C17532R$id.macro_edit_entry_icon);
            ((TextView) inflate.findViewById(C17532R$id.macro_edit_entry_name)).setText(selectableItem.mo24738G0());
            String O0 = selectableItem.mo24672O0();
            if (TextUtils.isEmpty(O0)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(O0);
            }
            imageView.setImageResource(selectableItem.mo25558S0());
            imageView.setBackgroundResource(selectableItem.mo24673T0().mo26464h(true));
            this.listLayout.addView(inflate);
            inflate.setOnClickListener(new C11937b(this, selectableItem, i, list));
            i++;
        }
    }
}

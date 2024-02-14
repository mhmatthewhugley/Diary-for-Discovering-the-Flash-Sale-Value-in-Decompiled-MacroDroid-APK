package com.arlosoft.macrodroid.celltowers;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.database.C4373a;
import com.arlosoft.macrodroid.events.LogUpdateEvent;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.util.List;
import p161s1.C10180a;

public class IgnoredCellTowersActivity extends MacroDroidBaseActivity {
    @BindView(2131362665)
    ViewGroup emptyView;
    @BindView(2131362961)
    CardView infoCard;
    @BindView(2131362962)
    TextView infoCardDetail;
    @BindView(2131362963)
    Button infoCardGotit;
    @BindView(2131362964)
    TextView infoCardTitle;

    /* renamed from: o */
    private C4373a f10165o;

    /* renamed from: p */
    private IgnoredTowersAdapter f10166p;
    @BindView(2131363593)
    RecyclerView recyclerView;

    public static class IgnoredTowersAdapter extends RecyclerView.Adapter<ViewHolder> implements Filterable {

        /* renamed from: a */
        private final IgnoredCellTowersActivity f10167a;

        /* renamed from: c */
        private List<String> f10168c;

        /* renamed from: d */
        private final C4373a f10169d;

        class ViewHolder extends RecyclerView.ViewHolder {
            @BindView(2131362207)
            TextView cellId;
            @BindView(2131362200)
            TextView cellTowerCount;
            @BindView(2131362202)
            ViewGroup cellTowerRow;
            @BindView(2131362199)
            CheckBox checkBox;

            public ViewHolder(View view) {
                super(view);
                ButterKnife.bind((Object) this, view);
            }
        }

        public class ViewHolder_ViewBinding implements Unbinder {

            /* renamed from: a */
            private ViewHolder f10171a;

            @UiThread
            public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
                this.f10171a = viewHolder;
                viewHolder.cellTowerCount = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.cell_tower_list_row_item_count, "field 'cellTowerCount'", TextView.class);
                viewHolder.checkBox = (CheckBox) Utils.findRequiredViewAsType(view, C17532R$id.cell_tower_list_row_checkbox, "field 'checkBox'", CheckBox.class);
                viewHolder.cellId = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.cellid_name, "field 'cellId'", TextView.class);
                viewHolder.cellTowerRow = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.cell_tower_row, "field 'cellTowerRow'", ViewGroup.class);
            }

            @CallSuper
            public void unbind() {
                ViewHolder viewHolder = this.f10171a;
                if (viewHolder != null) {
                    this.f10171a = null;
                    viewHolder.cellTowerCount = null;
                    viewHolder.checkBox = null;
                    viewHolder.cellId = null;
                    viewHolder.cellTowerRow = null;
                    return;
                }
                throw new IllegalStateException("Bindings already cleared.");
            }
        }

        public IgnoredTowersAdapter(IgnoredCellTowersActivity ignoredCellTowersActivity, C4373a aVar, List<String> list) {
            this.f10167a = ignoredCellTowersActivity;
            this.f10169d = aVar;
            setHasStableIds(true);
            this.f10168c = list;
        }

        /* access modifiers changed from: private */
        /* renamed from: D */
        public /* synthetic */ void m15268D(String str, View view) {
            m15270I(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: E */
        public /* synthetic */ void m15269E(String str, DialogInterface dialogInterface, int i) {
            if (i == 0) {
                this.f10169d.mo28651v(str, false);
                this.f10167a.refresh();
            }
        }

        /* renamed from: I */
        private void m15270I(String str) {
            String[] strArr = {this.f10167a.getString(C17541R$string.remove_from_global_ignore)};
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f10167a);
            builder.setTitle((CharSequence) str).setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C3947y(this, str));
            builder.create().show();
        }

        /* renamed from: F */
        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            String str = this.f10168c.get(i);
            viewHolder.cellId.setText(str);
            viewHolder.cellTowerCount.setText(String.valueOf(i + 1));
            viewHolder.cellTowerRow.setOnClickListener(new C3948z(this, str));
        }

        /* renamed from: G */
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ViewHolder viewHolder = new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.cell_tower_list_row, viewGroup, false));
            viewHolder.checkBox.setVisibility(8);
            return viewHolder;
        }

        /* renamed from: H */
        public void mo27588H(List<String> list) {
            this.f10168c = list;
        }

        public Filter getFilter() {
            return null;
        }

        public int getItemCount() {
            return this.f10168c.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.celltowers.IgnoredCellTowersActivity$a */
    class C3912a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f10172a;

        C3912a(Button button) {
            this.f10172a = button;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f10172a.setEnabled(i3 > 0);
        }
    }

    /* renamed from: T1 */
    private void m15261T1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_Settings);
        builder.setTitle((int) C17541R$string.trigger_cell_tower_add_tower_id);
        EditText editText = new EditText(this);
        editText.setInputType(524289);
        editText.setHint(C17541R$string.trigger_cell_tower_enter_group_name_hint);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(C17529R$dimen.margin_medium);
        builder.setView(editText, dimensionPixelOffset, getResources().getDimensionPixelSize(C17529R$dimen.input_text_dialog_top_margin), dimensionPixelOffset, 0);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3945w(this, editText));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        AlertDialog show = builder.show();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(show.getWindow().getAttributes());
        layoutParams.width = -1;
        show.getWindow().setAttributes(layoutParams);
        Button button = show.getButton(-1);
        button.setEnabled(false);
        editText.addTextChangedListener(new C3912a(button));
    }

    /* renamed from: U1 */
    private void m15262U1(boolean z) {
        if (z) {
            this.emptyView.setVisibility(0);
            this.recyclerView.setVisibility(8);
            return;
        }
        this.emptyView.setVisibility(8);
        this.recyclerView.setVisibility(0);
    }

    /* renamed from: V1 */
    private void m15263V1() {
        if (C5163j2.m20237p6(this)) {
            this.infoCard.setVisibility(8);
            return;
        }
        this.infoCard.setCardBackgroundColor(ContextCompat.getColor(this, C17528R$color.cell_towers_primary));
        this.infoCardTitle.setText(C17541R$string.ignored_towers);
        this.infoCardDetail.setText(C17541R$string.ignored_towers_info);
        this.infoCardGotit.setOnClickListener(new C3946x(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public /* synthetic */ void m15264W1(EditText editText, DialogInterface dialogInterface, int i) {
        this.f10165o.mo28651v(editText.getText().toString(), true);
        refresh();
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public /* synthetic */ void m15265X1(View view) {
        C5163j2.m19965F2(this);
        this.infoCard.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public void refresh() {
        List<String> g = this.f10165o.mo28640g();
        this.f10166p.mo27588H(g);
        this.f10166p.notifyDataSetChanged();
        m15262U1(g.isEmpty());
    }

    @OnClick({2131361914})
    public void onAddTowerButtonClick() {
        m15261T1();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_ignored_cell_towers);
        ButterKnife.bind((Activity) this);
        C4373a h = C4373a.m17336h();
        this.f10165o = h;
        List<String> g = h.mo28640g();
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        IgnoredTowersAdapter ignoredTowersAdapter = new IgnoredTowersAdapter(this, this.f10165o, g);
        this.f10166p = ignoredTowersAdapter;
        this.recyclerView.setAdapter(ignoredTowersAdapter);
        C10180a.m40075a().mo80019m(this);
        m15262U1(g.isEmpty());
        m15263V1();
    }

    public void onDestroy() {
        C10180a.m40075a().mo80020p(this);
        super.onDestroy();
    }

    public void onEventMainThread(LogUpdateEvent logUpdateEvent) {
        refresh();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        onBackPressed();
        return true;
    }
}

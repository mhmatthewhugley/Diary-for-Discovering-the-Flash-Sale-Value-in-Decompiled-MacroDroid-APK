package com.arlosoft.macrodroid.settings;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.categories.Category;
import com.arlosoft.macrodroid.categories.CategoryList;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.utils.C6409o;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p081e1.C7264a;
import p099h1.C7361a;

public class EditCategoriesActivity extends MacroDroidDaggerBaseActivity implements C6409o.C6411b {

    /* renamed from: A */
    private C6409o f12810A;

    /* renamed from: B */
    private ListView f12811B;

    /* renamed from: C */
    private C7264a f12812C;

    /* renamed from: D */
    C7361a f12813D;
    @BindView(2131362962)
    TextView infoCardDetail;
    @BindView(2131362963)
    Button infoCardGotIt;
    @BindView(2131362964)
    TextView infoCardTitle;
    @BindView(2131362965)
    CardView infoCardView;
    @BindView(2131362762)
    FloatingActionButton plusButton;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public List<String> f12814s;

    /* renamed from: z */
    private CategoryList f12815z;

    /* renamed from: com.arlosoft.macrodroid.settings.EditCategoriesActivity$a */
    class C5105a extends ArrayAdapter<String> {
        C5105a(Context context, int i, String[] strArr) {
            super(context, i, strArr);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = ((LayoutInflater) EditCategoriesActivity.this.getSystemService("layout_inflater")).inflate(C17535R$layout.list_item_category, (ViewGroup) null);
            }
            ImageView imageView = (ImageView) view.findViewById(C17532R$id.lockImage);
            ((TextView) view.findViewById(C17532R$id.categoryName)).setText((String) getItem(i));
            EditCategoriesActivity editCategoriesActivity = EditCategoriesActivity.this;
            if (editCategoriesActivity.m19712h2((String) editCategoriesActivity.f12814s.get(i + 1))) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
            return view;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.settings.EditCategoriesActivity$b */
    class C5106b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f12817a;

        /* renamed from: c */
        final /* synthetic */ EditText f12818c;

        C5106b(Button button, EditText editText) {
            this.f12817a = button;
            this.f12818c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f12817a.setEnabled(this.f12818c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.settings.EditCategoriesActivity$c */
    class C5107c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f12820a;

        /* renamed from: c */
        final /* synthetic */ EditText f12821c;

        C5107c(Button button, EditText editText) {
            this.f12820a = button;
            this.f12821c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f12820a.setEnabled(this.f12821c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.settings.EditCategoriesActivity$d */
    class C5108d implements C6409o.C6412c {

        /* renamed from: a */
        final /* synthetic */ int f12823a;

        C5108d(int i) {
            this.f12823a = i;
        }

        /* renamed from: a */
        public void mo24616a() {
        }

        /* renamed from: b */
        public void mo24617b() {
            EditCategoriesActivity.this.m19710f2(this.f12823a);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.settings.EditCategoriesActivity$e */
    class C5109e implements C6409o.C6412c {

        /* renamed from: a */
        final /* synthetic */ int f12825a;

        C5109e(int i) {
            this.f12825a = i;
        }

        /* renamed from: a */
        public void mo24616a() {
        }

        /* renamed from: b */
        public void mo24617b() {
            EditCategoriesActivity.this.m19711g2(this.f12825a, true);
        }
    }

    /* renamed from: d2 */
    private void m19708d2() {
        if (C5163j2.m20269t6(this)) {
            this.infoCardView.setVisibility(8);
            return;
        }
        this.infoCardView.setCardBackgroundColor(ContextCompat.getColor(this, C17528R$color.categories_primary));
        this.infoCardTitle.setText(C17541R$string.categories);
        this.infoCardDetail.setText(C17541R$string.categories_info_card_help);
        this.infoCardGotIt.setOnClickListener(new C5152h(this));
    }

    /* renamed from: e2 */
    private void m19709e2() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(this);
        appCompatDialog.setContentView((int) C17535R$layout.mode_name_dialog);
        appCompatDialog.setTitle((int) C17541R$string.add_category);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.mode_name_dialog_mode_name);
        editText.setHint(C17541R$string.enter_category_name);
        editText.addTextChangedListener(new C5107c(button, editText));
        button.setOnClickListener(new C5160j(this, appCompatDialog, editText));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C5138f(appCompatDialog));
        appCompatDialog.show();
        C4666m.m18141i(editText);
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public void m19710f2(int i) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(this);
        appCompatDialog.setContentView((int) C17535R$layout.mode_name_dialog);
        appCompatDialog.setTitle((int) C17541R$string.rename_category);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.mode_name_dialog_mode_name);
        editText.setHint(C17541R$string.enter_category_name);
        String str = this.f12814s.get(i);
        editText.setText(str);
        editText.addTextChangedListener(new C5106b(button, editText));
        button.setOnClickListener(new C5156i(this, editText, str, appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C5148g(appCompatDialog));
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public void m19711g2(int i, boolean z) {
        if (i < this.f12814s.size()) {
            String str = this.f12814s.get(i);
            ArrayList arrayList = new ArrayList();
            Iterator<Macro> it = C4934n.m18998M().mo29710z().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Macro next = it.next();
                if (next.getCategory().equals(str)) {
                    arrayList.add(next);
                    break;
                }
            }
            if (arrayList.size() > 0) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle((int) C17541R$string.delete_category);
                builder.setMessage((int) C17541R$string.are_you_sure_delete_category);
                builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5128d(this, str, i, arrayList));
                builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
                builder.show();
            } else {
                this.f12814s.remove(i);
                C5163j2.m20258s3(this, this.f12814s);
                m19722r2();
            }
            CategoryList k = this.f12810A.mo32447k();
            k.deleteCategory(str);
            this.f12812C.mo37132b(Category.CATEGORIES_KEY, k);
            if (z) {
                this.f12810A.mo32446j(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public boolean m19712h2(String str) {
        Category categoryByName = this.f12815z.getCategoryByName(str);
        return categoryByName != null && categoryByName.isLocked();
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public /* synthetic */ void m19713i2(View view) {
        C5163j2.m19994J2(getApplicationContext());
        this.infoCardView.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public /* synthetic */ void m19714j2(AppCompatDialog appCompatDialog, EditText editText, View view) {
        appCompatDialog.cancel();
        this.f12814s.add(editText.getText().toString());
        C5163j2.m20258s3(this, this.f12814s);
        m19722r2();
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public /* synthetic */ void m19716l2(EditText editText, String str, AppCompatDialog appCompatDialog, View view) {
        this.f12813D.mo37340e(this, str, editText.getText().toString());
        appCompatDialog.dismiss();
        m19722r2();
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public /* synthetic */ void m19718n2(String str, int i, List list, DialogInterface dialogInterface, int i2) {
        for (Macro next : C4934n.m18998M().mo29710z()) {
            if (next.getCategory().equals(str)) {
                next.setCategory(this.f12814s.get(0));
            }
        }
        dialogInterface.dismiss();
        this.f12814s.remove(i);
        C5163j2.m20258s3(this, this.f12814s);
        m19722r2();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Macro macro = (Macro) it.next();
            macro.setCategory(getString(C17541R$string.uncategorized));
            C4934n.m18998M().mo29696p0(macro, false);
        }
        C4934n.m18998M().mo29702s0();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public /* synthetic */ void m19719o2(AdapterView adapterView, View view, int i, long j) {
        m19721q2(i + 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public /* synthetic */ void m19720p2(boolean z, String str, int i, DialogInterface dialogInterface, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (z) {
                        this.f12810A.mo32450v(this, str);
                    } else {
                        this.f12810A.mo32448t(this, str);
                    }
                }
            } else if (z) {
                this.f12810A.mo32449u(this, getString(C17541R$string.delete_category), str, C5163j2.m19992J0(this), 0, new C5109e(i));
            } else {
                m19711g2(i, false);
            }
        } else if (z) {
            this.f12810A.mo32449u(this, getString(C17541R$string.rename_category), str, C5163j2.m19992J0(this), 0, new C5108d(i));
        } else {
            m19710f2(i);
        }
    }

    /* renamed from: q2 */
    private void m19721q2(int i) {
        String str = this.f12814s.get(i);
        boolean h2 = m19712h2(str);
        String[] strArr = new String[3];
        strArr[0] = getString(C17541R$string.rename_category);
        strArr[1] = getString(C17541R$string.delete_category);
        strArr[2] = getString(h2 ? C17541R$string.remove_category_lock : C17541R$string.lock_category);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((CharSequence) this.f12814s.get(i)).setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C5134e(this, h2, str, i));
        builder.create().show();
    }

    /* renamed from: r2 */
    private void m19722r2() {
        refresh();
    }

    private void refresh() {
        int i;
        HashMap hashMap = new HashMap();
        Iterator<Macro> it = C4934n.m18998M().mo29672B(false).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String category = it.next().getCategory();
            if (category == null) {
                category = getString(C17541R$string.uncategorized);
            }
            Integer num = (Integer) hashMap.get(category);
            if (num != null) {
                hashMap.put(category, Integer.valueOf(num.intValue() + 1));
            } else {
                hashMap.put(category, 1);
            }
        }
        CategoryList categoryList = (CategoryList) this.f12812C.mo37133c(Category.CATEGORIES_KEY, CategoryList.class);
        this.f12815z = categoryList;
        if (categoryList == null) {
            this.f12815z = new CategoryList(new ArrayList());
        }
        List<String> A = C4061t1.m15944A(this);
        this.f12814s = A;
        String[] strArr = new String[(A.size() - 1)];
        for (i = 1; i < this.f12814s.size(); i++) {
            Integer num2 = (Integer) hashMap.get(this.f12814s.get(i));
            int i2 = i - 1;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f12814s.get(i));
            sb.append(" (");
            sb.append(num2 != null ? num2.intValue() : 0);
            sb.append(")");
            strArr[i2] = sb.toString();
        }
        this.f12814s.toArray(strArr);
        C5105a aVar = new C5105a(this, C17535R$layout.list_item_category, strArr);
        this.f12811B.setDivider((Drawable) null);
        this.f12811B.setAdapter(aVar);
        this.f12811B.setOnItemClickListener(new C5166k(this));
    }

    /* renamed from: k0 */
    public void mo24615k0() {
        refresh();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.edit_categories);
        ButterKnife.bind((Activity) this);
        setTitle(C17541R$string.categories);
        this.f12811B = (ListView) findViewById(C17532R$id.edit_categories_list);
        C7264a q = MacroDroidApplication.m14845u().mo27293q(Category.CATEGORY_CACHE);
        this.f12812C = q;
        this.f12810A = new C6409o(q, this);
        refresh();
        ViewCompat.setNestedScrollingEnabled(this.f12811B, true);
        m19708d2();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131362762})
    public void onPlusButtonClicked() {
        m19709e2();
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }
}

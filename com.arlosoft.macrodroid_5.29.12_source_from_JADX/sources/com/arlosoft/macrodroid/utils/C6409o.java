package com.arlosoft.macrodroid.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.categories.Category;
import com.arlosoft.macrodroid.categories.CategoryList;
import com.arlosoft.macrodroid.common.C4004d1;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.util.ArrayList;
import java.util.Iterator;
import p081e1.C7264a;
import p319lc.C15626c;

/* renamed from: com.arlosoft.macrodroid.utils.o */
/* compiled from: CategoryPasswordHelper */
public class C6409o {

    /* renamed from: a */
    private C7264a f15032a;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: b */
    public C6411b f15033b;

    /* renamed from: com.arlosoft.macrodroid.utils.o$a */
    /* compiled from: CategoryPasswordHelper */
    class C6410a implements C6412c {

        /* renamed from: a */
        final /* synthetic */ Activity f15034a;

        /* renamed from: b */
        final /* synthetic */ String f15035b;

        /* renamed from: c */
        final /* synthetic */ String f15036c;

        C6410a(Activity activity, String str, String str2) {
            this.f15034a = activity;
            this.f15035b = str;
            this.f15036c = str2;
        }

        /* renamed from: a */
        public void mo24616a() {
        }

        /* renamed from: b */
        public void mo24617b() {
            C6409o.this.m24681w(this.f15034a, this.f15035b, this.f15036c);
            if (C6409o.this.f15033b != null) {
                C6409o.this.f15033b.mo24615k0();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.utils.o$b */
    /* compiled from: CategoryPasswordHelper */
    public interface C6411b {
        /* renamed from: k0 */
        void mo24615k0();
    }

    /* renamed from: com.arlosoft.macrodroid.utils.o$c */
    /* compiled from: CategoryPasswordHelper */
    public interface C6412c {
        /* renamed from: a */
        void mo24616a();

        /* renamed from: b */
        void mo24617b();
    }

    public C6409o(C7264a aVar, @Nullable C6411b bVar) {
        this.f15032a = aVar;
        this.f15033b = bVar;
    }

    /* renamed from: l */
    private String m24673l(String str) {
        return C4004d1.m15682d(str, 24);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m24674m(EditText editText, Activity activity, String str, String str2, Dialog dialog, View view) {
        String obj = editText.getText().toString();
        if (obj.length() < 3) {
            C15626c.makeText(activity, C17541R$string.invalid_password, 1).show();
        } else if (str == null) {
            mo32449u(activity, activity.getString(C17541R$string.confirm_password), str2, m24673l(obj), 0, new C6410a(activity, str2, obj));
            dialog.dismiss();
        } else if (m24673l(editText.getText().toString()).equals(str)) {
            m24681w(activity, str2, obj);
            C6411b bVar = this.f15033b;
            if (bVar != null) {
                bVar.mo24615k0();
            }
            dialog.dismiss();
        } else {
            C15626c.makeText(activity, C17541R$string.invalid_password, 1).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m24677p(EditText editText, String str, C6412c cVar, Dialog dialog, Activity activity, View view) {
        if (m24673l(editText.getText().toString()).equals(str)) {
            cVar.mo24617b();
            dialog.dismiss();
            return;
        }
        C15626c.makeText(activity, C17541R$string.invalid_password, 1).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m24679r(EditText editText, Activity activity, Dialog dialog, String str, View view) {
        if (m24673l(editText.getText().toString()).equals(C5163j2.m19992J0(activity))) {
            dialog.dismiss();
            m24681w(activity, str, (String) null);
            C6411b bVar = this.f15033b;
            if (bVar != null) {
                bVar.mo24615k0();
                return;
            }
            return;
        }
        C15626c.makeText(activity, C17541R$string.invalid_password, 1).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m24681w(@NonNull Activity activity, @NonNull String str, @Nullable String str2) {
        String str3;
        CategoryList k = mo32447k();
        Category categoryByName = k.getCategoryByName(str);
        if (str2 == null) {
            str3 = null;
        } else {
            str3 = m24673l(str2);
        }
        if (str2 != null) {
            C5163j2.m20307y4(activity, str3);
        }
        if (categoryByName != null) {
            k.getCategories().remove(categoryByName);
            if (str2 != null) {
                k.getCategories().add(new Category(categoryByName.getName(), categoryByName.getColor(), categoryByName.isExpanded(), true));
            } else {
                k.getCategories().add(new Category(str, categoryByName.getColor(), categoryByName.isExpanded(), false));
            }
        } else {
            k.getCategories().add(new Category(str, ContextCompat.getColor(activity, C17528R$color.default_macro_tile_color), false, true));
        }
        this.f15032a.mo37132b(Category.CATEGORIES_KEY, k);
        if (str2 == null) {
            mo32446j(activity);
        }
    }

    /* renamed from: j */
    public void mo32446j(Context context) {
        boolean z;
        Iterator<Category> it = mo32447k().getCategories().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().isLocked()) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            C5163j2.m20307y4(context, (String) null);
        }
    }

    /* renamed from: k */
    public CategoryList mo32447k() {
        CategoryList categoryList = (CategoryList) this.f15032a.mo37133c(Category.CATEGORIES_KEY, CategoryList.class);
        return (categoryList == null || categoryList.getCategories() == null) ? new CategoryList(new ArrayList()) : categoryList;
    }

    /* renamed from: t */
    public void mo32448t(@NonNull Activity activity, @NonNull String str) {
        String J0 = C5163j2.m19992J0(activity);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        View inflate = activity.getLayoutInflater().inflate(C17535R$layout.dialog_lock_category, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(C17532R$id.passwordEntry);
        Button button = (Button) inflate.findViewById(C17532R$id.lockCateogryButton);
        Button button2 = (Button) inflate.findViewById(C17532R$id.cancelButton);
        ((TextView) inflate.findViewById(C17532R$id.lockCategoryInfo)).setVisibility(J0 != null ? 8 : 0);
        builder.setTitle((int) C17541R$string.lock_category);
        builder.setView(inflate);
        AlertDialog create = builder.create();
        create.getWindow().clearFlags(131080);
        create.getWindow().setSoftInputMode(5);
        create.show();
        button.setOnClickListener(new C6403m(this, editText, activity, J0, str, create));
        button2.setOnClickListener(new C6397k(create));
        editText.requestFocus();
    }

    /* renamed from: u */
    public void mo32449u(@NonNull Activity activity, @NonNull String str, @NonNull String str2, String str3, @Nullable int i, C6412c cVar) {
        AlertDialog.Builder builder;
        View view;
        Activity activity2 = activity;
        int i2 = i;
        if (i2 > 0) {
            view = LayoutInflater.from(new ContextThemeWrapper(activity, i2)).inflate(C17535R$layout.dialog_password_prompt, (ViewGroup) null);
            builder = new AlertDialog.Builder(activity, i2);
        } else {
            view = activity.getLayoutInflater().inflate(C17535R$layout.dialog_password_prompt, (ViewGroup) null);
            builder = new AlertDialog.Builder(activity);
        }
        EditText editText = (EditText) view.findViewById(C17532R$id.passwordEntry);
        String str4 = str;
        builder.setTitle((CharSequence) str);
        builder.setView(view);
        AlertDialog create = builder.create();
        create.getWindow().clearFlags(131080);
        create.getWindow().setSoftInputMode(5);
        create.show();
        C6412c cVar2 = cVar;
        create.setOnCancelListener(new C6386h(cVar2));
        ((Button) view.findViewById(C17532R$id.okButton)).setOnClickListener(new C6406n(this, editText, str3, cVar2, create, activity));
        ((Button) view.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C6394j(create));
        editText.requestFocus();
    }

    /* renamed from: v */
    public void mo32450v(@NonNull Activity activity, @NonNull String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        View inflate = activity.getLayoutInflater().inflate(C17535R$layout.dialog_password_prompt, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(C17532R$id.passwordEntry);
        builder.setTitle((int) C17541R$string.remove_category_lock);
        builder.setView(inflate);
        AlertDialog create = builder.create();
        create.getWindow().clearFlags(131080);
        create.getWindow().setSoftInputMode(5);
        create.show();
        ((Button) inflate.findViewById(C17532R$id.okButton)).setOnClickListener(new C6400l(this, editText, activity, create, str));
        ((Button) inflate.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C6390i(create));
        editText.requestFocus();
    }
}

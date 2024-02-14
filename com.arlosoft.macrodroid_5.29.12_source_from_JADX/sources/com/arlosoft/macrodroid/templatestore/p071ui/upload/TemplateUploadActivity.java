package com.arlosoft.macrodroid.templatestore.p071ui.upload;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.avatar.views.AvatarView;
import com.arlosoft.macrodroid.categories.Category;
import com.arlosoft.macrodroid.categories.CategoryList;
import com.arlosoft.macrodroid.common.C4004d1;
import com.arlosoft.macrodroid.extensions.C4656c;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.macrolist.MacroListCategoryHeader;
import com.arlosoft.macrodroid.macrolist.MacroListItem;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.templatestore.model.MacroTemplate;
import com.arlosoft.macrodroid.templatestore.model.TemplateCategory;
import com.arlosoft.macrodroid.templatestore.p071ui.C5276c;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.C5331h;
import com.arlosoft.macrodroid.templatestore.p071ui.templateList.C5418h;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import java.text.Collator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.C13592k0;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p058a3.C2227a;
import p077d2.C7244a;
import p078d3.C7245d;
import p093g2.C7328a;
import p256eu.davidea.flexibleadapter.common.SmoothScrollLinearLayoutManager;
import p286i9.C12454b;
import p296j9.C13309a;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.upload.TemplateUploadActivity */
/* compiled from: TemplateUploadActivity.kt */
public final class TemplateUploadActivity extends MacroDroidDaggerBaseActivity implements C5512q {

    /* renamed from: L */
    public static final C5490a f13428L = new C5490a((C13695i) null);

    /* renamed from: A */
    public C5527g f13429A;

    /* renamed from: B */
    public C2227a f13430B;

    /* renamed from: C */
    public C7328a f13431C;

    /* renamed from: D */
    public C7245d f13432D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public AppCompatDialog f13433E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public AppCompatDialog f13434F;

    /* renamed from: G */
    private C12454b<MacroListCategoryHeader> f13435G;

    /* renamed from: H */
    private CategoryList f13436H;

    /* renamed from: I */
    private final HashSet<String> f13437I = new HashSet<>();

    /* renamed from: J */
    private final HashSet<String> f13438J = new HashSet<>();

    /* renamed from: K */
    public Map<Integer, View> f13439K = new LinkedHashMap();

    /* renamed from: s */
    public C5511p f13440s;

    /* renamed from: z */
    public C5331h f13441z;

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.upload.TemplateUploadActivity$a */
    /* compiled from: TemplateUploadActivity.kt */
    public static final class C5490a {
        private C5490a() {
        }

        public /* synthetic */ C5490a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final Intent mo30741a(Context context, Integer num, Macro macro, String str, String str2) {
            C13706o.m87929f(context, "context");
            Intent intent = new Intent(context, TemplateUploadActivity.class);
            intent.putExtra("macro", macro != null ? macro.getGUID() : 0);
            intent.putExtra("default_category", str2);
            intent.putExtra("default_description", str);
            intent.putExtra("updating_macro_id", num);
            return intent;
        }

        /* renamed from: b */
        public final Intent mo30742b(Context context, Integer num, String str, String str2, String str3) {
            C13706o.m87929f(context, "context");
            C13706o.m87929f(str, "macroName");
            Intent intent = new Intent(context, TemplateUploadActivity.class);
            intent.putExtra("macro_name", str);
            intent.putExtra("default_category", str3);
            intent.putExtra("default_description", str2);
            intent.putExtra("updating_macro_id", num);
            return intent;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.upload.TemplateUploadActivity$b */
    /* compiled from: TemplateUploadActivity.kt */
    static final class C5491b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ List<TemplateCategory> $categories;
        final /* synthetic */ Spinner $categorySpinner;
        final /* synthetic */ EditText $descriptionText;
        final /* synthetic */ String[] $languageCodes;
        final /* synthetic */ Spinner $languageSpinner;
        final /* synthetic */ Macro $macro;
        final /* synthetic */ TextView $nameText;
        final /* synthetic */ boolean $updatingMacro;
        int label;
        final /* synthetic */ TemplateUploadActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5491b(TemplateUploadActivity templateUploadActivity, TextView textView, EditText editText, Macro macro, String[] strArr, Spinner spinner, List<TemplateCategory> list, Spinner spinner2, boolean z, C13635d<? super C5491b> dVar) {
            super(3, dVar);
            this.this$0 = templateUploadActivity;
            this.$nameText = textView;
            this.$descriptionText = editText;
            this.$macro = macro;
            this.$languageCodes = strArr;
            this.$languageSpinner = spinner;
            this.$categories = list;
            this.$categorySpinner = spinner2;
            this.$updatingMacro = z;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5491b(this.this$0, this.$nameText, this.$descriptionText, this.$macro, this.$languageCodes, this.$languageSpinner, this.$categories, this.$categorySpinner, this.$updatingMacro, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C5511p g2 = this.this$0.mo30731g2();
                TextView textView = this.$nameText;
                Editable editable = null;
                String valueOf = String.valueOf(textView != null ? textView.getText() : null);
                EditText editText = this.$descriptionText;
                if (editText != null) {
                    editable = editText.getText();
                }
                String valueOf2 = String.valueOf(editable);
                Macro macro = this.$macro;
                String[] strArr = this.$languageCodes;
                Spinner spinner = this.$languageSpinner;
                int i = 0;
                String str = strArr[spinner != null ? spinner.getSelectedItemPosition() : 0];
                C13706o.m87928e(str, "languageCodes[languageSp…                    ?: 0]");
                List<TemplateCategory> list = this.$categories;
                Spinner spinner2 = this.$categorySpinner;
                if (spinner2 != null) {
                    i = spinner2.getSelectedItemPosition();
                }
                g2.mo30757s(valueOf, valueOf2, macro, str, list.get(i).getId(), this.$updatingMacro);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.upload.TemplateUploadActivity$c */
    /* compiled from: TemplateUploadActivity.kt */
    static final class C5492c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ boolean $updatingMacro;
        int label;
        final /* synthetic */ TemplateUploadActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5492c(TemplateUploadActivity templateUploadActivity, boolean z, C13635d<? super C5492c> dVar) {
            super(3, dVar);
            this.this$0 = templateUploadActivity;
            this.$updatingMacro = z;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5492c(this.this$0, this.$updatingMacro, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                AppCompatDialog b2 = this.this$0.f13434F;
                if (b2 != null) {
                    b2.dismiss();
                }
                if (this.$updatingMacro) {
                    this.this$0.finish();
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.upload.TemplateUploadActivity$d */
    /* compiled from: TemplateUploadActivity.kt */
    static final class C5493d extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ int $categoryId;
        final /* synthetic */ MacroTemplate $macroTemplate;
        final /* synthetic */ boolean $updatingMacro;
        int label;
        final /* synthetic */ TemplateUploadActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5493d(TemplateUploadActivity templateUploadActivity, MacroTemplate macroTemplate, int i, boolean z, C13635d<? super C5493d> dVar) {
            super(3, dVar);
            this.this$0 = templateUploadActivity;
            this.$macroTemplate = macroTemplate;
            this.$categoryId = i;
            this.$updatingMacro = z;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5493d(this.this$0, this.$macroTemplate, this.$categoryId, this.$updatingMacro, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C5511p g2 = this.this$0.mo30731g2();
                Macro macro = this.$macroTemplate.getMacro();
                C13706o.m87926c(macro);
                g2.mo30760v(macro, this.$macroTemplate.getLanguage(), this.$categoryId, this.$updatingMacro);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.upload.TemplateUploadActivity$e */
    /* compiled from: TemplateUploadActivity.kt */
    static final class C5494e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ boolean $updatingMacro;
        int label;
        final /* synthetic */ TemplateUploadActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5494e(TemplateUploadActivity templateUploadActivity, boolean z, C13635d<? super C5494e> dVar) {
            super(3, dVar);
            this.this$0 = templateUploadActivity;
            this.$updatingMacro = z;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5494e(this.this$0, this.$updatingMacro, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                AppCompatDialog c2 = this.this$0.f13433E;
                if (c2 != null) {
                    c2.dismiss();
                }
                if (this.$updatingMacro) {
                    this.this$0.finish();
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.upload.TemplateUploadActivity$f */
    /* compiled from: TemplateUploadActivity.kt */
    public static final class C5495f implements C5276c {
        C5495f() {
        }

        /* renamed from: a */
        public void mo30433a(MacroTemplate macroTemplate) {
            C13706o.m87929f(macroTemplate, "macroTemplate");
        }

        /* renamed from: b */
        public void mo30434b(MacroTemplate macroTemplate, boolean z) {
            C13706o.m87929f(macroTemplate, "macroTemplate");
        }

        /* renamed from: c */
        public void mo30435c(MacroTemplate macroTemplate) {
            C13706o.m87929f(macroTemplate, "macroTemplate");
        }

        /* renamed from: d */
        public void mo30436d(MacroTemplate macroTemplate) {
            C13706o.m87929f(macroTemplate, "macroTemplate");
        }

        /* renamed from: e */
        public void mo30437e(MacroTemplate macroTemplate, AvatarView avatarView) {
            C13706o.m87929f(macroTemplate, "macroTemplate");
            C13706o.m87929f(avatarView, "avatarImage");
        }

        /* renamed from: f */
        public void mo30438f(MacroTemplate macroTemplate) {
            C13706o.m87929f(macroTemplate, "macroTemplate");
        }

        /* renamed from: h */
        public void mo30439h(MacroTemplate macroTemplate) {
            C13706o.m87929f(macroTemplate, "macroTemplate");
        }

        /* renamed from: i */
        public void mo30440i(MacroTemplate macroTemplate) {
            C13706o.m87929f(macroTemplate, "macroTemplate");
        }
    }

    /* renamed from: d2 */
    private final String m21130d2(String str) {
        String d = C4004d1.m15682d(str, 24);
        C13706o.m87928e(d, "calculateSerialCode(password, 24)");
        return d;
    }

    /* renamed from: k2 */
    private final void m21131k2(MacroListCategoryHeader macroListCategoryHeader) {
        C12454b<MacroListCategoryHeader> bVar = this.f13435G;
        C12454b<MacroListCategoryHeader> bVar2 = null;
        if (bVar == null) {
            C13706o.m87945v("adapter");
            bVar = null;
        }
        int b1 = bVar.mo68881b1(macroListCategoryHeader);
        CategoryList categoryList = this.f13436H;
        if (categoryList == null) {
            C13706o.m87945v("categoryList");
            categoryList = null;
        }
        Category categoryByName = categoryList.getCategoryByName(macroListCategoryHeader.mo29720z().getName());
        boolean z = true;
        if (!macroListCategoryHeader.mo74943c()) {
            if (categoryByName == null || !categoryByName.isLocked() || this.f13437I.contains(categoryByName.getName())) {
                z = false;
            }
            if (z) {
                String string = getString(C17541R$string.unlock_category);
                C13706o.m87928e(string, "getString(R.string.unlock_category)");
                m21140t2(string, macroListCategoryHeader.mo29720z().getName(), C5163j2.m19992J0(this), macroListCategoryHeader);
                return;
            }
            C12454b<MacroListCategoryHeader> bVar3 = this.f13435G;
            if (bVar3 == null) {
                C13706o.m87945v("adapter");
            } else {
                bVar2 = bVar3;
            }
            bVar2.mo68856J0(b1);
            return;
        }
        C12454b<MacroListCategoryHeader> bVar4 = this.f13435G;
        if (bVar4 == null) {
            C13706o.m87945v("adapter");
        } else {
            bVar2 = bVar4;
        }
        bVar2.mo68845B0(b1, true);
        if (categoryByName != null && this.f13438J.contains(categoryByName.getName())) {
            this.f13438J.remove(categoryByName.getName());
        }
    }

    /* renamed from: l2 */
    private final void m21132l2() {
        C12454b<MacroListCategoryHeader> bVar;
        CategoryList categoryList = null;
        C12454b<MacroListCategoryHeader> bVar2 = new C12454b<>(new ArrayList(), (Object) null, true);
        this.f13435G = bVar2;
        bVar2.mo68900o0(C5504i.f13457a);
        C12454b<MacroListCategoryHeader> bVar3 = this.f13435G;
        if (bVar3 == null) {
            C13706o.m87945v("adapter");
            bVar3 = null;
        }
        bVar3.mo68875Y1(Integer.MAX_VALUE);
        C12454b<MacroListCategoryHeader> bVar4 = this.f13435G;
        if (bVar4 == null) {
            C13706o.m87945v("adapter");
            bVar4 = null;
        }
        bVar4.mo68877Z1(true);
        int i = C17532R$id.recyclerView;
        ((RecyclerView) mo30727a2(i)).setLayoutManager(new SmoothScrollLinearLayoutManager(this));
        RecyclerView recyclerView = (RecyclerView) mo30727a2(i);
        C12454b<MacroListCategoryHeader> bVar5 = this.f13435G;
        if (bVar5 == null) {
            C13706o.m87945v("adapter");
            bVar5 = null;
        }
        recyclerView.setAdapter(bVar5);
        ((RecyclerView) mo30727a2(i)).setHasFixedSize(true);
        int i2 = 0;
        ((RecyclerView) mo30727a2(i)).addItemDecoration(new C13309a(this).mo70136a(C17535R$layout.macro_list_row, 0, 3, 0, 0).mo70142i(true).mo70141h(false).mo70143j(0));
        HashMap<String, List<Macro>> G = C4934n.m18998M().mo29677G();
        ArrayList arrayList = new ArrayList();
        Collator instance = Collator.getInstance(C5163j2.m19963F0(this));
        instance.setStrength(0);
        ArrayList arrayList2 = new ArrayList(G.keySet());
        C13622x.m87781y(arrayList2, new C5506k(instance));
        CategoryList categoryList2 = (CategoryList) MacroDroidApplication.f9883I.mo27303b().mo27293q(Category.CATEGORY_CACHE).mo37133c(Category.CATEGORIES_KEY, CategoryList.class);
        if (categoryList2 == null) {
            categoryList2 = new CategoryList(new ArrayList());
        }
        this.f13436H = categoryList2;
        Iterator it = arrayList2.iterator();
        int i3 = 0;
        int i4 = 100000;
        while (it.hasNext()) {
            String str = (String) it.next();
            CategoryList categoryList3 = this.f13436H;
            if (categoryList3 == null) {
                C13706o.m87945v("categoryList");
                categoryList3 = categoryList;
            }
            C13706o.m87928e(str, "categoryName");
            Category categoryByName = categoryList3.getCategoryByName(str);
            if (categoryByName == null) {
                categoryByName = new Category(str, ContextCompat.getColor(this, C17528R$color.default_macro_tile_color), false, false);
            }
            Category category = categoryByName;
            int i5 = i4 + 1;
            MacroListCategoryHeader macroListCategoryHeader = r10;
            MacroListCategoryHeader macroListCategoryHeader2 = new MacroListCategoryHeader(category, i4, true, false, false, new C5502g(this), (View.OnLongClickListener) null, mo30730f2());
            List<Macro> list = G.get(str);
            if (list != null) {
                C13622x.m87781y(list, new C5505j(instance));
            }
            C13706o.m87926c(list);
            int i6 = i3;
            int i7 = 0;
            for (Macro macro : list) {
                int i8 = i7 + 1;
                int i9 = i6 + 1;
                boolean z = i7 == list.size() - 1;
                C5500e eVar = r7;
                C5500e eVar2 = new C5500e(this, macro);
                macroListCategoryHeader.mo74947w(new MacroListItem(macroListCategoryHeader, i6, macro, category, 0, false, 0, false, false, z, eVar, C5501f.f13454a, C5503h.f13456a, false, mo30730f2(), true, this.f13437I));
                i7 = i8;
                i6 = i9;
            }
            arrayList.add(macroListCategoryHeader);
            i3 = i6;
            i4 = i5;
            categoryList = null;
        }
        C12454b<MacroListCategoryHeader> bVar6 = this.f13435G;
        if (bVar6 == null) {
            C13706o.m87945v("adapter");
            bVar = null;
        } else {
            bVar = bVar6;
        }
        bVar.mo68889f2(arrayList);
        LinearLayout linearLayout = (LinearLayout) mo30727a2(C17532R$id.emptyView);
        C13706o.m87928e(linearLayout, "emptyView");
        if (!arrayList.isEmpty()) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final boolean m21133m2(View view, int i) {
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final int m21134n2(Collator collator, String str, String str2) {
        return collator.compare(str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m21135o2(TemplateUploadActivity templateUploadActivity, MacroListCategoryHeader macroListCategoryHeader) {
        C13706o.m87929f(templateUploadActivity, "this$0");
        C13706o.m87928e(macroListCategoryHeader, "it");
        templateUploadActivity.m21131k2(macroListCategoryHeader);
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final int m21136p2(Collator collator, Macro macro, Macro macro2) {
        return collator.compare(macro.getName(), macro2.getName());
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final void m21137q2(TemplateUploadActivity templateUploadActivity, Macro macro, View view) {
        C13706o.m87929f(templateUploadActivity, "this$0");
        C5511p g2 = templateUploadActivity.mo30731g2();
        C13706o.m87928e(macro, "macro");
        g2.mo30758t(macro);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public static final boolean m21138r2(View view) {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m21139s2(MacroListItem macroListItem) {
    }

    /* renamed from: t2 */
    private final void m21140t2(String str, String str2, String str3, MacroListCategoryHeader macroListCategoryHeader) {
        String str4;
        CategoryList categoryList = this.f13436H;
        if (categoryList == null) {
            C13706o.m87945v("categoryList");
            str4 = str2;
            categoryList = null;
        } else {
            str4 = str2;
        }
        Category categoryByName = categoryList.getCategoryByName(str4);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View inflate = getLayoutInflater().inflate(C17535R$layout.dialog_password_prompt, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(C17532R$id.passwordEntry);
        Button button = (Button) inflate.findViewById(C17532R$id.okButton);
        Button button2 = (Button) inflate.findViewById(C17532R$id.cancelButton);
        String str5 = str;
        builder.setTitle((CharSequence) str);
        builder.setView(inflate);
        AlertDialog create = builder.create();
        C13706o.m87928e(create, "alert.create()");
        Window window = create.getWindow();
        if (window != null) {
            window.clearFlags(131080);
        }
        Window window2 = create.getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(5);
        }
        create.show();
        button.setOnClickListener(new C5499d(this, editText, str3, str2, macroListCategoryHeader, categoryByName, create));
        button2.setOnClickListener(new C5498c(create));
        editText.requestFocus();
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public static final void m21141u2(TemplateUploadActivity templateUploadActivity, EditText editText, String str, String str2, MacroListCategoryHeader macroListCategoryHeader, Category category, Dialog dialog, View view) {
        C13706o.m87929f(templateUploadActivity, "this$0");
        C13706o.m87929f(str2, "$categoryName");
        C13706o.m87929f(macroListCategoryHeader, "$categoryHeader");
        C13706o.m87929f(dialog, "$dialog");
        if (C13706o.m87924a(templateUploadActivity.m21130d2(editText.getText().toString()), str)) {
            templateUploadActivity.f13437I.add(str2);
            macroListCategoryHeader.mo29715E(true);
            C12454b<MacroListCategoryHeader> bVar = templateUploadActivity.f13435G;
            C12454b<MacroListCategoryHeader> bVar2 = null;
            if (bVar == null) {
                C13706o.m87945v("adapter");
                bVar = null;
            }
            C12454b<MacroListCategoryHeader> bVar3 = templateUploadActivity.f13435G;
            if (bVar3 == null) {
                C13706o.m87945v("adapter");
                bVar3 = null;
            }
            bVar.notifyItemChanged(bVar3.mo68881b1(macroListCategoryHeader));
            C12454b<MacroListCategoryHeader> bVar4 = templateUploadActivity.f13435G;
            if (bVar4 == null) {
                C13706o.m87945v("adapter");
                bVar4 = null;
            }
            C12454b<MacroListCategoryHeader> bVar5 = templateUploadActivity.f13435G;
            if (bVar5 == null) {
                C13706o.m87945v("adapter");
            } else {
                bVar2 = bVar5;
            }
            bVar4.mo68856J0(bVar2.mo68881b1(macroListCategoryHeader));
            HashSet<String> hashSet = templateUploadActivity.f13438J;
            C13706o.m87926c(category);
            hashSet.add(category.getName());
            dialog.dismiss();
            return;
        }
        C15626c.makeText(templateUploadActivity, C17541R$string.invalid_password, 1).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public static final void m21142v2(Dialog dialog, View view) {
        C13706o.m87929f(dialog, "$dialog");
        dialog.cancel();
    }

    /* renamed from: B */
    public void mo30723B() {
        C15626c.makeText(getApplicationContext(), C17541R$string.duplicate_template_error, 1).show();
    }

    /* renamed from: D0 */
    public void mo30724D0(MacroTemplate macroTemplate, int i, boolean z) {
        Button button;
        MacroTemplate macroTemplate2 = macroTemplate;
        boolean z2 = z;
        C13706o.m87929f(macroTemplate2, "macroTemplate");
        new ArrayAdapter(this, 17367048, C5163j2.m20270u(this)).setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        AppCompatDialog appCompatDialog = new AppCompatDialog(this, C17542R$style.Theme_App_Dialog_Template);
        this.f13433E = appCompatDialog;
        appCompatDialog.setCancelable(false);
        AppCompatDialog appCompatDialog2 = this.f13433E;
        if (appCompatDialog2 != null) {
            appCompatDialog2.setContentView((int) C17535R$layout.dialog_template_preview);
        }
        AppCompatDialog appCompatDialog3 = this.f13433E;
        if (appCompatDialog3 != null) {
            appCompatDialog3.setTitle((CharSequence) getString(C17541R$string.preview));
        }
        AppCompatDialog appCompatDialog4 = this.f13433E;
        if (appCompatDialog4 != null) {
            C4656c.m18115d(appCompatDialog4, 0, 1, (Object) null);
        }
        AppCompatDialog appCompatDialog5 = this.f13433E;
        View findViewById = appCompatDialog5 != null ? appCompatDialog5.findViewById(C17532R$id.cardView) : null;
        C13706o.m87926c(findViewById);
        new C5418h(findViewById, new C5495f(), mo30732h2(), mo30734j2(), mo30729e2(), false, new ArrayList(), false, false, mo30733i2()).mo30621z(macroTemplate2, false, false, false);
        AppCompatDialog appCompatDialog6 = this.f13433E;
        Button button2 = appCompatDialog6 != null ? (Button) appCompatDialog6.findViewById(C17532R$id.uploadButton) : null;
        if (z2 && button2 != null) {
            button2.setText(C17541R$string.update_template);
        }
        if (button2 != null) {
            C4666m.m18147o(button2, (C13640g) null, new C5493d(this, macroTemplate, i, z, (C13635d<? super C5493d>) null), 1, (Object) null);
        }
        AppCompatDialog appCompatDialog7 = this.f13433E;
        if (!(appCompatDialog7 == null || (button = (Button) appCompatDialog7.findViewById(C17532R$id.cancelButton)) == null)) {
            C4666m.m18147o(button, (C13640g) null, new C5494e(this, z2, (C13635d<? super C5494e>) null), 1, (Object) null);
        }
        AppCompatDialog appCompatDialog8 = this.f13433E;
        if (appCompatDialog8 != null) {
            appCompatDialog8.show();
        }
    }

    /* renamed from: N */
    public void mo30725N(Macro macro, int i, boolean z, String str, String str2) {
        Button button;
        Button button2;
        String str3;
        boolean z2 = z;
        C13706o.m87929f(macro, "macro");
        int i2 = 0;
        List<TemplateCategory> I0 = C13566b0.m87405I0(TemplateCategory.Companion.mo30314a(this, false));
        if (i == 0) {
            I0.add(0, new TemplateCategory("< " + getString(C17541R$string.select_category) + " >", 0));
        }
        ArrayList arrayList = new ArrayList(C13616u.m87774u(I0, 10));
        for (TemplateCategory name : I0) {
            arrayList.add(name.getName());
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, arrayList);
        arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        AppCompatDialog appCompatDialog = new AppCompatDialog(this, C17542R$style.Theme_App_Dialog_Template);
        this.f13434F = appCompatDialog;
        appCompatDialog.setCancelable(false);
        AppCompatDialog appCompatDialog2 = this.f13434F;
        if (appCompatDialog2 != null) {
            appCompatDialog2.setContentView((int) C17535R$layout.dialog_upload_details);
        }
        AppCompatDialog appCompatDialog3 = this.f13434F;
        if (appCompatDialog3 != null) {
            appCompatDialog3.setTitle((CharSequence) getString(z2 ? C17541R$string.update_template : C17541R$string.upload_as_template));
        }
        AppCompatDialog appCompatDialog4 = this.f13434F;
        if (appCompatDialog4 != null) {
            C4656c.m18115d(appCompatDialog4, 0, 1, (Object) null);
        }
        AppCompatDialog appCompatDialog5 = this.f13434F;
        EditText editText = appCompatDialog5 != null ? (EditText) appCompatDialog5.findViewById(C17532R$id.descriptionText) : null;
        AppCompatDialog appCompatDialog6 = this.f13434F;
        Spinner spinner = appCompatDialog6 != null ? (Spinner) appCompatDialog6.findViewById(C17532R$id.catgorySpinner) : null;
        AppCompatDialog appCompatDialog7 = this.f13434F;
        Spinner spinner2 = appCompatDialog7 != null ? (Spinner) appCompatDialog7.findViewById(C17532R$id.languageSpinner) : null;
        AppCompatDialog appCompatDialog8 = this.f13434F;
        TextView textView = appCompatDialog8 != null ? (TextView) appCompatDialog8.findViewById(C17532R$id.nameText) : null;
        if (textView != null) {
            textView.setText(macro.getName());
        }
        if (editText != null) {
            String description = macro.getDescription();
            if (description == null || description.length() == 0) {
                str3 = str == null ? "" : str;
            } else {
                str3 = macro.getDescription();
            }
            editText.setText(str3);
        }
        if (editText != null) {
            C4666m.m18154v(editText);
        }
        if (spinner != null) {
            spinner.setAdapter(arrayAdapter);
        }
        String language = Locale.getDefault().getLanguage();
        String[] stringArray = getResources().getStringArray(C17525R$array.languages_codes);
        C13706o.m87928e(stringArray, "resources.getStringArray(R.array.languages_codes)");
        String[] stringArray2 = getResources().getStringArray(C17525R$array.languages);
        C13706o.m87928e(stringArray2, "resources.getStringArray(R.array.languages)");
        C7244a aVar = new C7244a(this, stringArray2, stringArray, mo30729e2());
        if (spinner2 != null) {
            spinner2.setAdapter(aVar);
        }
        int length = stringArray.length;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (!C13706o.m87924a(language, stringArray[i2])) {
                i2++;
            } else if (spinner2 != null) {
                spinner2.setSelection(i2);
            }
        }
        String category = str2 == null ? macro.getCategory() : str2;
        Iterator it = C13566b0.m87411M0(I0).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C13592k0 k0Var = (C13592k0) it.next();
            if (C13706o.m87924a(((TemplateCategory) k0Var.mo71845d()).getName(), category)) {
                if (spinner != null) {
                    spinner.setSelection(k0Var.mo71844c());
                }
            }
        }
        AppCompatDialog appCompatDialog9 = this.f13434F;
        if (!(appCompatDialog9 == null || (button2 = (Button) appCompatDialog9.findViewById(C17532R$id.okButton)) == null)) {
            C5491b bVar = r0;
            C5491b bVar2 = new C5491b(this, textView, editText, macro, stringArray, spinner2, I0, spinner, z, (C13635d<? super C5491b>) null);
            C4666m.m18147o(button2, (C13640g) null, bVar, 1, (Object) null);
        }
        AppCompatDialog appCompatDialog10 = this.f13434F;
        if (!(appCompatDialog10 == null || (button = (Button) appCompatDialog10.findViewById(C17532R$id.cancelButton)) == null)) {
            C4666m.m18147o(button, (C13640g) null, new C5492c(this, z, (C13635d<? super C5492c>) null), 1, (Object) null);
        }
        AppCompatDialog appCompatDialog11 = this.f13434F;
        if (appCompatDialog11 != null) {
            appCompatDialog11.show();
        }
    }

    /* renamed from: S0 */
    public void mo30726S0() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_Template);
        builder.setTitle((int) C17541R$string.invalid_value);
        builder.setMessage((int) C17541R$string.invalid_macro_name_or_description).setCancelable(true).setPositiveButton(17039370, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* renamed from: a2 */
    public View mo30727a2(int i) {
        Map<Integer, View> map = this.f13439K;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: e0 */
    public void mo30728e0() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_Template);
        builder.setTitle((int) C17541R$string.invalid_value);
        builder.setMessage((int) C17541R$string.please_select_a_category).setCancelable(true).setPositiveButton(17039370, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* renamed from: e2 */
    public final C2227a mo30729e2() {
        C2227a aVar = this.f13430B;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("flagProvider");
        return null;
    }

    /* renamed from: f2 */
    public final C7328a mo30730f2() {
        C7328a aVar = this.f13431C;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("headingColorMapper");
        return null;
    }

    /* renamed from: g2 */
    public final C5511p mo30731g2() {
        C5511p pVar = this.f13440s;
        if (pVar != null) {
            return pVar;
        }
        C13706o.m87945v("presenter");
        return null;
    }

    /* renamed from: h2 */
    public final C5331h mo30732h2() {
        C5331h hVar = this.f13441z;
        if (hVar != null) {
            return hVar;
        }
        C13706o.m87945v("profileImageProvider");
        return null;
    }

    /* renamed from: i2 */
    public final C7245d mo30733i2() {
        C7245d dVar = this.f13432D;
        if (dVar != null) {
            return dVar;
        }
        C13706o.m87945v("translationHelper");
        return null;
    }

    /* renamed from: j2 */
    public final C5527g mo30734j2() {
        C5527g gVar = this.f13429A;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("userProvider");
        return null;
    }

    /* renamed from: m0 */
    public void mo30735m0() {
        AppCompatDialog appCompatDialog = this.f13433E;
        if (appCompatDialog != null) {
            appCompatDialog.dismiss();
        }
    }

    /* renamed from: n0 */
    public void mo30736n0() {
        finish();
    }

    /* renamed from: o0 */
    public void mo30737o0() {
        C15626c.makeText(getApplicationContext(), C17541R$string.template_uploaded, 1).show();
    }

    /* renamed from: o1 */
    public void mo30738o1() {
        AppCompatDialog appCompatDialog = this.f13434F;
        if (appCompatDialog != null) {
            appCompatDialog.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        ActionBar supportActionBar;
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_upload_template);
        setSupportActionBar((Toolbar) mo30727a2(C17532R$id.toolbar));
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setDisplayHomeAsUpEnabled(true);
        }
        mo30731g2().mo40891n(this);
        mo30731g2().mo30759u(getIntent().getIntExtra("updating_macro_id", 0), getIntent().getStringExtra("default_description"), getIntent().getStringExtra("default_category"));
        Macro Q = C4934n.m18998M().mo29682Q(getIntent().getLongExtra("macro", 0));
        if (Q != null) {
            mo30731g2().mo30756r(Q);
        }
        String stringExtra = getIntent().getStringExtra("macro_name");
        setTitle(C17541R$string.select_macro);
        if (!(stringExtra == null || (supportActionBar = getSupportActionBar()) == null)) {
            supportActionBar.setSubtitle((CharSequence) stringExtra);
        }
        m21132l2();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    /* renamed from: r0 */
    public void mo30739r0(boolean z) {
        AppCompatDialog appCompatDialog = this.f13433E;
        ViewFlipper viewFlipper = appCompatDialog != null ? (ViewFlipper) appCompatDialog.findViewById(C17532R$id.bottomViewFlipper) : null;
        if (viewFlipper != null) {
            viewFlipper.setDisplayedChild(z ? 1 : 0);
        }
    }

    /* renamed from: s0 */
    public void mo30740s0() {
        C15626c.makeText(getApplicationContext(), C17541R$string.upload_failed, 1).show();
    }
}

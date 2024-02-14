package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import p099h1.C7362b;
import p123l1.C7621j;
import p148q0.C8151a;
import p319lc.C15626c;

/* compiled from: CategoryEnabledConstraint.kt */
public final class CategoryEnabledConstraint extends Constraint implements C7362b {
    public static final Parcelable.Creator<CategoryEnabledConstraint> CREATOR = new C4126a();
    private static final int OPTION_DISABLED = 1;
    private static final int OPTION_ENABLED = 0;

    /* renamed from: f */
    public static final C4127b f10711f = new C4127b((C13695i) null);
    private transient List<String> categoryList;
    private String categoryName;
    private int option;

    /* renamed from: com.arlosoft.macrodroid.constraint.CategoryEnabledConstraint$a */
    /* compiled from: CategoryEnabledConstraint.kt */
    public static final class C4126a implements Parcelable.Creator<CategoryEnabledConstraint> {
        C4126a() {
        }

        /* renamed from: a */
        public CategoryEnabledConstraint createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new CategoryEnabledConstraint(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public CategoryEnabledConstraint[] newArray(int i) {
            return new CategoryEnabledConstraint[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.CategoryEnabledConstraint$b */
    /* compiled from: CategoryEnabledConstraint.kt */
    public static final class C4127b {
        private C4127b() {
        }

        public /* synthetic */ C4127b(C13695i iVar) {
            this();
        }
    }

    public CategoryEnabledConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ CategoryEnabledConstraint(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: i3 */
    private final void m16291i3() {
        m16295m3();
        List<String> list = this.categoryList;
        C13706o.m87926c(list);
        if (list.isEmpty()) {
            C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.no_macros_found, 0).show();
            return;
        }
        String string = mo27827K0().getString(C17541R$string.constraint_category_enabled);
        C13706o.m87928e(string, "context.getString(R.stri…straint_category_enabled)");
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        List<String> list2 = this.categoryList;
        C13706o.m87926c(list2);
        int b0 = C13566b0.m87427b0(list2, this.categoryName);
        if (b0 < 0) {
            b0 = 0;
        }
        builder.setTitle((CharSequence) string);
        List<String> list3 = this.categoryList;
        C13706o.m87926c(list3);
        Object[] array = list3.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        builder.setSingleChoiceItems((CharSequence[]) array, b0, (DialogInterface.OnClickListener) new C4321t(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4326u(this));
        AlertDialog create = builder.create();
        C13706o.m87928e(create, "builder.create()");
        create.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public static final void m16292j3(CategoryEnabledConstraint categoryEnabledConstraint, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(categoryEnabledConstraint, "this$0");
        List<String> list = categoryEnabledConstraint.categoryList;
        C13706o.m87926c(list);
        categoryEnabledConstraint.categoryName = list.get(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m16293k3(CategoryEnabledConstraint categoryEnabledConstraint, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(categoryEnabledConstraint, "this$0");
        categoryEnabledConstraint.mo24689O1();
    }

    /* renamed from: l3 */
    private final String[] m16294l3() {
        C13696i0 i0Var = C13696i0.f61931a;
        String j1 = SelectableItem.m15535j1(C17541R$string.enabled);
        C13706o.m87928e(j1, "getString(R.string.enabled)");
        String format = String.format(j1, Arrays.copyOf(new Object[0], 0));
        C13706o.m87928e(format, "format(format, *args)");
        String j12 = SelectableItem.m15535j1(C17541R$string.disabled);
        C13706o.m87928e(j12, "getString(R.string.disabled)");
        String format2 = String.format(j12, Arrays.copyOf(new Object[0], 0));
        C13706o.m87928e(format2, "format(format, *args)");
        return new String[]{format, format2};
    }

    /* renamed from: m3 */
    private final void m16295m3() {
        String str;
        List<Macro> z = C4934n.m18998M().mo29710z();
        HashSet hashSet = new HashSet();
        for (Macro category : z) {
            String category2 = category.getCategory();
            if (category2 != null) {
                hashSet.add(category2);
            } else {
                C8151a.m33873n(new RuntimeException("ConfigureAppNotificationsAction: Macro has a null category"));
            }
        }
        List<String> I0 = C13566b0.m87405I0(hashSet);
        this.categoryList = I0;
        C13706o.m87926c(I0);
        C13622x.m87780x(I0);
        List<String> list = this.categoryList;
        C13706o.m87926c(list);
        list.remove(SelectableItem.m15535j1(C17541R$string.uncategorized));
        List<String> list2 = this.categoryList;
        C13706o.m87926c(list2);
        String j1 = SelectableItem.m15535j1(C17541R$string.uncategorized);
        C13706o.m87928e(j1, "getString(R.string.uncategorized)");
        list2.add(0, j1);
        if (this.categoryName == null) {
            List<String> list3 = this.categoryList;
            C13706o.m87926c(list3);
            if (list3.size() > 0) {
                List<String> list4 = this.categoryList;
                C13706o.m87926c(list4);
                str = list4.get(0);
            } else {
                str = SelectableItem.m15535j1(C17541R$string.uncategorized);
            }
            this.categoryName = str;
        }
    }

    /* renamed from: B */
    public void mo24964B(String str) {
        C13706o.m87929f(str, "category");
        this.categoryName = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m16294l3()[this.option] + ": " + this.categoryName;
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        if (C5163j2.m19991J(MacroDroidApplication.f9883I.mo27303b()).contains(this.categoryName) == (!(this.option == 0))) {
            return true;
        }
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7621j.f18528g.mo37666a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24672O0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16294l3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        m16291i3();
    }

    /* renamed from: w */
    public String mo24965w() {
        return this.categoryName;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.option);
        parcel.writeString(this.categoryName);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.option = i;
    }

    public CategoryEnabledConstraint() {
    }

    private CategoryEnabledConstraint(Parcel parcel) {
        super(parcel);
        this.option = parcel.readInt();
        this.categoryName = parcel.readString();
    }
}

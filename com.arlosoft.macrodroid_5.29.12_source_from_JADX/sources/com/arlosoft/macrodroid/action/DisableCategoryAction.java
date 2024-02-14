package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.categories.Category;
import com.arlosoft.macrodroid.categories.CategoryList;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.events.CategoryEnabledStateChangeEvent;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6409o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p081e1.C7264a;
import p099h1.C7362b;
import p128m0.C7793m0;
import p148q0.C8151a;
import p161s1.C10180a;

public class DisableCategoryAction extends Action implements C7362b {
    public static final Parcelable.Creator<DisableCategoryAction> CREATOR = new C2407b();
    private String m_category;
    private transient List<String> m_categoryList;
    private final boolean m_enable;
    private int m_state;

    /* renamed from: com.arlosoft.macrodroid.action.DisableCategoryAction$a */
    class C2406a implements C6409o.C6412c {
        C2406a() {
        }

        /* renamed from: a */
        public void mo24616a() {
        }

        /* renamed from: b */
        public void mo24617b() {
            DisableCategoryAction.this.m10454r3();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.DisableCategoryAction$b */
    class C2407b implements Parcelable.Creator<DisableCategoryAction> {
        C2407b() {
        }

        /* renamed from: a */
        public DisableCategoryAction createFromParcel(Parcel parcel) {
            return new DisableCategoryAction(parcel, (C2406a) null);
        }

        /* renamed from: b */
        public DisableCategoryAction[] newArray(int i) {
            return new DisableCategoryAction[i];
        }
    }

    /* synthetic */ DisableCategoryAction(Parcel parcel, C2406a aVar) {
        this(parcel);
    }

    /* renamed from: m3 */
    private String[] m10449m3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_disable_category_enable), SelectableItem.m15535j1(C17541R$string.action_disable_category_disable), SelectableItem.m15535j1(C17541R$string.action_disable_category_toggle)};
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public /* synthetic */ void m10450n3(DialogInterface dialogInterface, int i) {
        this.m_state = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public /* synthetic */ void m10451o3(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* renamed from: p3 */
    private void m10452p3() {
        this.m_categoryList = new ArrayList();
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
        this.m_categoryList.addAll(hashSet);
        Collections.sort(this.m_categoryList);
        this.m_categoryList.remove(SelectableItem.m15535j1(C17541R$string.uncategorized));
        this.m_categoryList.add(0, SelectableItem.m15535j1(C17541R$string.uncategorized));
        if (this.m_category != null) {
            return;
        }
        if (this.m_categoryList.size() > 0) {
            this.m_category = this.m_categoryList.get(0);
        } else {
            this.m_category = SelectableItem.m15535j1(C17541R$string.uncategorized);
        }
    }

    /* renamed from: q3 */
    private void m10453q3(C7264a aVar, String str) {
        new C6409o(aVar, (C6409o.C6411b) null).mo32449u(mo27850j0(), SelectableItem.m15535j1(C17541R$string.enter_category_lock_password), str, C5163j2.m19992J0(mo27850j0()), 0, new C2406a());
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public void m10454r3() {
        int i = this.m_state;
        if (i == -1) {
            i = !this.m_enable;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.select_option);
        builder.setSingleChoiceItems((CharSequence[]) m10449m3(), i, (DialogInterface.OnClickListener) new C3049f4(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3077g4(this));
        builder.create().show();
    }

    /* renamed from: B */
    public void mo24964B(String str) {
        this.m_category = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        if (this.m_category != null) {
            for (int i = 0; i < this.m_categoryList.size(); i++) {
                if (this.m_category.equals(this.m_categoryList.get(i))) {
                    return i;
                }
            }
        }
        return 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        int i;
        Context context;
        if (this.m_state != -1) {
            return m10449m3()[this.m_state];
        }
        StringBuilder sb = new StringBuilder();
        if (this.m_enable) {
            context = mo27827K0();
            i = C17541R$string.enable;
        } else {
            context = mo27827K0();
            i = C17541R$string.disable;
        }
        sb.append(context.getString(i));
        sb.append(" ");
        sb.append(mo27827K0().getString(C17541R$string.action_disable_category_category));
        return sb.toString();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_category;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7793m0.m32545u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        Set<String> J = C5163j2.m19991J(mo27827K0());
        boolean z = this.m_enable;
        int i = this.m_state;
        if (i != -1) {
            if (i == 0) {
                z = true;
            } else if (i == 1) {
                z = false;
            } else if (i == 2) {
                z = J.contains(this.m_category);
            }
        }
        if (z) {
            J.remove(this.m_category);
        } else {
            J.add(this.m_category);
        }
        C5163j2.m19966F3(mo27827K0(), J);
        C4934n.m19014l0();
        for (Macro next : C4934n.m18998M().mo29710z()) {
            if (next.getCategory().equals(this.m_category)) {
                boolean isEnabled = next.isEnabled();
                if (z && isEnabled) {
                    C4934n.m18998M().mo29708x(next, true);
                } else if (!z && isEnabled) {
                    C4934n.m18998M().mo29707w(next, true);
                    next.setEnabledFlag(true);
                }
            }
        }
        C10180a.m40075a().mo80018i(new CategoryEnabledStateChangeEvent(this.m_category, z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        m10452p3();
        String[] strArr = new String[this.m_categoryList.size()];
        int i = 0;
        for (String str : this.m_categoryList) {
            strArr[i] = str;
            i++;
        }
        return strArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return SelectableItem.m15535j1(C17541R$string.action_disable_category);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        Category categoryByName;
        C7264a q = MacroDroidApplication.m14845u().mo27293q(Category.CATEGORY_CACHE);
        CategoryList categoryList = (CategoryList) q.mo37133c(Category.CATEGORIES_KEY, CategoryList.class);
        if (categoryList == null || (categoryByName = categoryList.getCategoryByName(this.m_category)) == null || !categoryByName.isLocked()) {
            m10454r3();
        } else {
            m10453q3(q, this.m_category);
        }
    }

    /* renamed from: w */
    public String mo24965w() {
        return this.m_category;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_category);
        parcel.writeInt(this.m_enable ^ true ? 1 : 0);
        parcel.writeInt(this.m_state);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_category = this.m_categoryList.get(i);
    }

    public DisableCategoryAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private DisableCategoryAction() {
        this.m_enable = true;
        this.m_state = -1;
    }

    private DisableCategoryAction(Parcel parcel) {
        super(parcel);
        this.m_category = parcel.readString();
        this.m_enable = parcel.readInt() == 0;
        this.m_state = parcel.readInt();
    }
}

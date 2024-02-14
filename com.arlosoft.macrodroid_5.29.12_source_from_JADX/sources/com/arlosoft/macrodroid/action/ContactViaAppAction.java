package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.Contact;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p128m0.C7701b0;
import p215b8.C11102b;
import p319lc.C15626c;
import p440y9.C16971a;

/* compiled from: ContactViaAppAction.kt */
public final class ContactViaAppAction extends Action {
    public static final Parcelable.Creator<ContactViaAppAction> CREATOR = new C2383a();

    /* renamed from: d */
    public static final C2384b f7198d = new C2384b((C13695i) null);
    private String appName;
    private String appPackage;
    private Contact contact;

    /* renamed from: id */
    private String f7199id;
    private String mimeType;

    /* renamed from: com.arlosoft.macrodroid.action.ContactViaAppAction$a */
    /* compiled from: ContactViaAppAction.kt */
    public static final class C2383a implements Parcelable.Creator<ContactViaAppAction> {
        C2383a() {
        }

        /* renamed from: a */
        public ContactViaAppAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new ContactViaAppAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public ContactViaAppAction[] newArray(int i) {
            return new ContactViaAppAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ContactViaAppAction$b */
    /* compiled from: ContactViaAppAction.kt */
    public static final class C2384b {
        private C2384b() {
        }

        public /* synthetic */ C2384b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ContactViaAppAction$c */
    /* compiled from: ContactViaAppAction.kt */
    public static final class C2385c {

        /* renamed from: a */
        private final String f7200a;

        /* renamed from: b */
        private final String f7201b;

        /* renamed from: c */
        private final String f7202c;

        /* renamed from: d */
        private final String f7203d;

        public C2385c(String str, String str2, String str3, String str4) {
            C13706o.m87929f(str, "mimeType");
            C13706o.m87929f(str2, "id");
            C13706o.m87929f(str3, "packageName");
            C13706o.m87929f(str4, "appName");
            this.f7200a = str;
            this.f7201b = str2;
            this.f7202c = str3;
            this.f7203d = str4;
        }

        /* renamed from: a */
        public final String mo24908a() {
            return this.f7203d;
        }

        /* renamed from: b */
        public final String mo24909b() {
            return this.f7201b;
        }

        /* renamed from: c */
        public final String mo24910c() {
            return this.f7200a;
        }

        /* renamed from: d */
        public final String mo24911d() {
            return this.f7202c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2385c)) {
                return false;
            }
            C2385c cVar = (C2385c) obj;
            return C13706o.m87924a(this.f7200a, cVar.f7200a) && C13706o.m87924a(this.f7201b, cVar.f7201b) && C13706o.m87924a(this.f7202c, cVar.f7202c) && C13706o.m87924a(this.f7203d, cVar.f7203d);
        }

        public int hashCode() {
            return (((((this.f7200a.hashCode() * 31) + this.f7201b.hashCode()) * 31) + this.f7202c.hashCode()) * 31) + this.f7203d.hashCode();
        }

        public String toString() {
            return "ContactMimeInfo(mimeType=" + this.f7200a + ", id=" + this.f7201b + ", packageName=" + this.f7202c + ", appName=" + this.f7203d + ')';
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ContactViaAppAction$d */
    /* compiled from: ContactViaAppAction.kt */
    private static final class C2386d extends ArrayAdapter<String> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2386d(Context context, @LayoutRes int i, String[] strArr) {
            super(context, i, strArr);
            C13706o.m87929f(context, "context");
            C13706o.m87929f(strArr, "objects");
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C13706o.m87929f(viewGroup, "parent");
            View view2 = super.getView(i, view, viewGroup);
            C13706o.m87928e(view2, "super.getView(position, convertView, parent)");
            TextView textView = (TextView) view2.findViewById(16908308);
            if (textView != null) {
                textView.setText(Html.fromHtml((String) getItem(i)));
            }
            return view2;
        }
    }

    public ContactViaAppAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ ContactViaAppAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: q3 */
    private final void m10286q3(Contact contact2) {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = mo27827K0().getPackageManager();
        ContentResolver contentResolver = mo27827K0().getContentResolver();
        C13706o.m87928e(contentResolver, "context.contentResolver");
        Cursor query = contentResolver.query(ContactsContract.Data.CONTENT_URI, (String[]) null, (String) null, (String[]) null, "display_name");
        ArrayList arrayList = new ArrayList();
        ArrayList<C2385c> arrayList2 = new ArrayList<>();
        if (query != null) {
            while (query.moveToNext()) {
                String string = query.getString(query.getColumnIndex(Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID));
                String string2 = query.getString(query.getColumnIndex("lookup"));
                String string3 = query.getString(query.getColumnIndex("account_type_and_data_set"));
                String string4 = query.getString(query.getColumnIndex("mimetype"));
                if (C13706o.m87924a(string2, contact2.mo27712f())) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.addFlags(268435456);
                    intent.setDataAndType(Uri.parse("content://com.android.contacts/data/" + string), string4);
                    ComponentName resolveActivity = intent.resolveActivity(packageManager);
                    if (resolveActivity != null) {
                        C13706o.m87928e(resolveActivity, "componentName");
                        try {
                            applicationInfo = packageManager.getApplicationInfo(resolveActivity.getPackageName(), 0);
                        } catch (PackageManager.NameNotFoundException unused) {
                            applicationInfo = null;
                        }
                        CharSequence applicationLabel = applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : null;
                        if (applicationLabel != null) {
                            C13706o.m87928e(string4, "mimeType");
                            C13706o.m87928e(string, "id");
                            C13706o.m87928e(string3, "accountType");
                            C2385c cVar = new C2385c(string4, string, string3, applicationLabel.toString());
                            if (!arrayList2.contains(cVar)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("<b>");
                                sb.append(applicationLabel);
                                sb.append("</b><br/><i><small>");
                                String substring = string4.substring(C15177w.m93682a0(string4, "/", 0, false, 6, (Object) null) + 1);
                                C13706o.m87928e(substring, "this as java.lang.String).substring(startIndex)");
                                sb.append(substring);
                                sb.append("</small></i>");
                                arrayList.add(sb.toString());
                                arrayList2.add(cVar);
                            }
                        }
                    }
                }
            }
            query.close();
        }
        Object[] array = arrayList.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        if (strArr.length == 0) {
            C15626c.makeText(mo27827K0(), C17541R$string.no_app_available, 1).show();
            return;
        }
        ArrayList arrayList3 = new ArrayList(C13616u.m87774u(arrayList2, 10));
        for (C2385c c : arrayList2) {
            arrayList3.add(c.mo24910c());
        }
        int max = Math.max(C13566b0.m87427b0(arrayList3, this.mimeType), 0);
        Activity j0 = mo27850j0();
        C13706o.m87928e(j0, "activity");
        C2386d dVar = new C2386d(j0, C17535R$layout.single_choice_list_item, strArr);
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        builder.setSingleChoiceItems((ListAdapter) dVar, max, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C3358q3(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3469t3(arrayList2, this, contact2));
        AlertDialog create = builder.create();
        C13706o.m87928e(create, "builder.create()");
        create.show();
        create.setOnCancelListener(new C3330p3(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public static final void m10287r3(ContactViaAppAction contactViaAppAction, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(contactViaAppAction, "this$0");
        contactViaAppAction.mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static final void m10288s3(List list, ContactViaAppAction contactViaAppAction, Contact contact2, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(list, "$contactMimeInfoList");
        C13706o.m87929f(contactViaAppAction, "this$0");
        C13706o.m87929f(contact2, "$contact");
        C13706o.m87927d(dialogInterface, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
        C2385c cVar = (C2385c) list.get(((AlertDialog) dialogInterface).getListView().getCheckedItemPosition());
        contactViaAppAction.mimeType = cVar.mo24910c();
        contactViaAppAction.contact = contact2;
        contactViaAppAction.appPackage = cVar.mo24911d();
        contactViaAppAction.f7199id = cVar.mo24909b();
        contactViaAppAction.appName = cVar.mo24908a();
        contactViaAppAction.mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public static final void m10289t3(ContactViaAppAction contactViaAppAction, DialogInterface dialogInterface) {
        C13706o.m87929f(contactViaAppAction, "this$0");
        contactViaAppAction.mo24706w1();
    }

    /* renamed from: u3 */
    private final void m10290u3() {
        List<Contact> D = C4061t1.m15950D(mo27827K0());
        C13706o.m87928e(D, "contacts");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(D, 10));
        for (Contact g : D) {
            arrayList.add(g.mo27713g());
        }
        Object[] array = arrayList.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        if (!(strArr.length == 0)) {
            ArrayList arrayList2 = new ArrayList(C13616u.m87774u(D, 10));
            for (Contact f : D) {
                arrayList2.add(f.mo27712f());
            }
            Contact contact2 = this.contact;
            int max = Math.max(arrayList2.indexOf(contact2 != null ? contact2.mo27712f() : null), 0);
            AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
            builder.setTitle((CharSequence) mo24772h1());
            builder.setSingleChoiceItems((CharSequence[]) strArr, max, (DialogInterface.OnClickListener) null);
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C3386r3(this));
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3415s3(this, D));
            AlertDialog create = builder.create();
            C13706o.m87928e(create, "builder.create()");
            create.show();
            create.setOnCancelListener(new C3300o3(this));
            if (strArr.length > 50) {
                ListView listView = create.getListView();
                listView.setFastScrollEnabled(true);
                listView.setPadding(0, 0, mo27827K0().getResources().getDimensionPixelSize(C17529R$dimen.fast_scroll_padding), 0);
                listView.setScrollBarStyle(33554432);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public static final void m10291v3(ContactViaAppAction contactViaAppAction, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(contactViaAppAction, "this$0");
        contactViaAppAction.mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public static final void m10292w3(ContactViaAppAction contactViaAppAction, List list, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(contactViaAppAction, "this$0");
        C13706o.m87927d(dialogInterface, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
        Object obj = list.get(((AlertDialog) dialogInterface).getListView().getCheckedItemPosition());
        C13706o.m87928e(obj, "contacts[position]");
        contactViaAppAction.m10286q3((Contact) obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public static final void m10293x3(ContactViaAppAction contactViaAppAction, DialogInterface dialogInterface) {
        C13706o.m87929f(contactViaAppAction, "this$0");
        contactViaAppAction.mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public static final void m10294y3(ContactViaAppAction contactViaAppAction, boolean z) {
        C13706o.m87929f(contactViaAppAction, "this$0");
        if (z) {
            contactViaAppAction.m10290u3();
        }
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        StringBuilder sb = new StringBuilder();
        Contact contact2 = this.contact;
        sb.append(contact2 != null ? contact2.mo27713g() : null);
        sb.append(" (");
        sb.append(this.appName);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7701b0.f18654j.mo37742a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo24738G0());
        sb.append(" (");
        Contact contact2 = this.contact;
        sb.append(contact2 != null ? contact2.mo27713g() : null);
        sb.append(')');
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            intent.addFlags(268435456);
            intent.setDataAndType(Uri.parse("content://com.android.contacts/data/" + this.f7199id), this.mimeType);
            intent.putExtra("android.intent.extra.TEXT", "This is some test text");
            mo27827K0().startActivity(intent);
        } catch (Exception e) {
            Long Y0 = mo27840Y0();
            C13706o.m87928e(Y0, "macroGuid");
            C4878b.m18869h("Contact via app failed: " + e, Y0.longValue());
            C15626c.m94876a(mo27827K0(), SelectableItem.m15535j1(C17541R$string.error) + ": " + e, 0).show();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.READ_CONTACTS", "android.permission.CALL_PHONE"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Activity j0 = mo27850j0();
        C13706o.m87927d(j0, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        new C11102b((FragmentActivity) j0).mo62231o("android.permission.READ_CONTACTS").mo79679I(C16971a.m100210a()).mo79685P(new C3505u3(this));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mimeType);
        parcel.writeParcelable(this.contact, i);
        parcel.writeString(this.appPackage);
        parcel.writeString(this.appName);
        parcel.writeString(this.f7199id);
    }

    public ContactViaAppAction() {
    }

    private ContactViaAppAction(Parcel parcel) {
        super(parcel);
        this.mimeType = parcel.readString();
        this.contact = (Contact) parcel.readParcelable(Contact.class.getClassLoader());
        this.appPackage = parcel.readString();
        this.appName = parcel.readString();
        this.f7199id = parcel.readString();
    }
}

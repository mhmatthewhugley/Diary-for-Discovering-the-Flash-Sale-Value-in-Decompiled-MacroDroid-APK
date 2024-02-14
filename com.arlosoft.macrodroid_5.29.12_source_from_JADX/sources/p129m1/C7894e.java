package p129m1;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.common.Contact;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p056a1.C2211a;

/* renamed from: m1.e */
/* compiled from: ContactsAdapter */
public class C7894e extends BaseAdapter implements Filterable {

    /* renamed from: a */
    private final C7896b f18966a;

    /* renamed from: c */
    private final Set<Contact> f18967c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<Contact> f18968d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public List<Contact> f18969f;

    /* renamed from: g */
    private Context f18970g;

    /* renamed from: o */
    private PackageManager f18971o;

    /* renamed from: p */
    private C2211a f18972p = new C2211a();

    /* renamed from: m1.e$a */
    /* compiled from: ContactsAdapter */
    class C7895a extends Filter {

        /* renamed from: a */
        boolean f18973a = false;

        C7895a() {
        }

        /* access modifiers changed from: protected */
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = new ArrayList();
            int size = C7894e.this.f18968d.size();
            for (int i = 0; i < size; i++) {
                Contact contact = (Contact) C7894e.this.f18968d.get(i);
                if (charSequence == null || charSequence.toString().length() == 0 || contact.mo27713g().toLowerCase().contains(charSequence.toString().toLowerCase())) {
                    arrayList.add(contact);
                }
            }
            filterResults.count = arrayList.size();
            filterResults.values = arrayList;
            return filterResults;
        }

        /* access modifiers changed from: protected */
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            List unused = C7894e.this.f18969f = (List) filterResults.values;
            C7894e.this.notifyDataSetChanged();
        }
    }

    /* renamed from: m1.e$b */
    /* compiled from: ContactsAdapter */
    public interface C7896b {
        /* renamed from: a */
        void mo37788a(Contact contact);
    }

    public C7894e(@NonNull Activity activity, @NonNull List<Contact> list, @Nullable List<Boolean> list2, @Nullable C7896b bVar) {
        this.f18966a = bVar;
        this.f18970g = activity.getApplicationContext();
        if (list2 != null) {
            this.f18967c = new HashSet();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list2.get(i).booleanValue()) {
                    this.f18967c.add(list.get(i));
                }
            }
        } else {
            this.f18967c = null;
        }
        this.f18971o = this.f18970g.getPackageManager();
        this.f18968d = list;
        this.f18969f = new ArrayList(this.f18968d);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c9, code lost:
        if (r7.equals("-1") == false) goto L_0x00a0;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m33042f(int r7, android.view.View r8) {
        /*
            r6 = this;
            java.lang.Object r7 = r6.getItem(r7)
            com.arlosoft.macrodroid.common.Contact r7 = (com.arlosoft.macrodroid.common.Contact) r7
            r0 = 2131362379(0x7f0a024b, float:1.8344537E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 2131362378(0x7f0a024a, float:1.8344535E38)
            android.view.View r1 = r8.findViewById(r1)
            com.arlosoft.macrodroid.avatar.views.AvatarView r1 = (com.arlosoft.macrodroid.avatar.views.AvatarView) r1
            r2 = 2131363849(0x7f0a0809, float:1.8347518E38)
            android.view.View r2 = r8.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r3 = 2131362229(0x7f0a01b5, float:1.8344233E38)
            android.view.View r3 = r8.findViewById(r3)
            android.widget.CheckBox r3 = (android.widget.CheckBox) r3
            r4 = 2131362932(0x7f0a0474, float:1.8345659E38)
            android.view.View r4 = r8.findViewById(r4)
            android.widget.ViewFlipper r4 = (android.widget.ViewFlipper) r4
            java.util.Set<com.arlosoft.macrodroid.common.Contact> r5 = r6.f18967c
            if (r5 != 0) goto L_0x0045
            r5 = 8
            r3.setVisibility(r5)
            m1.c r3 = new m1.c
            r3.<init>(r6, r7)
            r8.setOnClickListener(r3)
            goto L_0x0062
        L_0x0045:
            r5 = 0
            r3.setOnCheckedChangeListener(r5)
            java.util.Set<com.arlosoft.macrodroid.common.Contact> r5 = r6.f18967c
            boolean r5 = r5.contains(r7)
            r3.setChecked(r5)
            m1.d r5 = new m1.d
            r5.<init>(r6, r7)
            r3.setOnCheckedChangeListener(r5)
            m1.b r5 = new m1.b
            r5.<init>(r3)
            r8.setOnClickListener(r5)
        L_0x0062:
            java.lang.String r8 = r7.mo27713g()
            r0.setText(r8)
            java.lang.String r8 = r7.mo27709b()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r8 = r8.intValue()
            r0 = 0
            if (r8 <= 0) goto L_0x008d
            r4.setDisplayedChild(r0)
            java.lang.String r8 = r7.mo27709b()
            android.net.Uri r8 = r6.mo37785h(r8)
            a1.a r0 = r6.f18972p
            java.lang.String r7 = r7.mo27713g()
            r0.mo41154c(r1, r8, r7)
            goto L_0x00eb
        L_0x008d:
            r8 = 1
            r4.setDisplayedChild(r8)
            java.lang.String r7 = r7.mo27709b()
            r7.hashCode()
            r1 = -1
            int r3 = r7.hashCode()
            switch(r3) {
                case 1444: goto L_0x00c3;
                case 1445: goto L_0x00b8;
                case 1446: goto L_0x00ad;
                case 1447: goto L_0x00a2;
                default: goto L_0x00a0;
            }
        L_0x00a0:
            r0 = -1
            goto L_0x00cc
        L_0x00a2:
            java.lang.String r8 = "-4"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00ab
            goto L_0x00a0
        L_0x00ab:
            r0 = 3
            goto L_0x00cc
        L_0x00ad:
            java.lang.String r8 = "-3"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00b6
            goto L_0x00a0
        L_0x00b6:
            r0 = 2
            goto L_0x00cc
        L_0x00b8:
            java.lang.String r0 = "-2"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00c1
            goto L_0x00a0
        L_0x00c1:
            r0 = 1
            goto L_0x00cc
        L_0x00c3:
            java.lang.String r8 = "-1"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00cc
            goto L_0x00a0
        L_0x00cc:
            switch(r0) {
                case 0: goto L_0x00e5;
                case 1: goto L_0x00de;
                case 2: goto L_0x00d7;
                case 3: goto L_0x00d0;
                default: goto L_0x00cf;
            }
        L_0x00cf:
            goto L_0x00eb
        L_0x00d0:
            r7 = 2131231139(0x7f0801a3, float:1.807835E38)
            r2.setImageResource(r7)
            goto L_0x00eb
        L_0x00d7:
            r7 = 2131233492(0x7f080ad4, float:1.8083123E38)
            r2.setImageResource(r7)
            goto L_0x00eb
        L_0x00de:
            r7 = 2131230878(0x7f08009e, float:1.8077821E38)
            r2.setImageResource(r7)
            goto L_0x00eb
        L_0x00e5:
            r7 = 2131232397(0x7f08068d, float:1.8080902E38)
            r2.setImageResource(r7)
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p129m1.C7894e.m33042f(int, android.view.View):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m33043i(Contact contact, View view) {
        C7896b bVar = this.f18966a;
        if (bVar != null) {
            bVar.mo37788a(contact);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m33044j(Contact contact, CompoundButton compoundButton, boolean z) {
        if (z) {
            this.f18967c.add(contact);
        } else {
            this.f18967c.remove(contact);
        }
    }

    /* renamed from: l */
    private View m33046l(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.contact_list_item, viewGroup, false);
    }

    /* renamed from: g */
    public List<Contact> mo37779g() {
        return new ArrayList(this.f18967c);
    }

    public int getCount() {
        return this.f18969f.size();
    }

    public Filter getFilter() {
        return new C7895a();
    }

    public Object getItem(int i) {
        return this.f18969f.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = m33046l(viewGroup);
        }
        m33042f(i, view);
        return view;
    }

    /* renamed from: h */
    public Uri mo37785h(String str) {
        return ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.valueOf(str).longValue());
    }
}

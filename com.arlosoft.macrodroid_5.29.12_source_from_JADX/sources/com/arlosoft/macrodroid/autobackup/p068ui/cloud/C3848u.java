package com.arlosoft.macrodroid.autobackup.p068ui.cloud;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.google.android.material.card.MaterialCardView;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.u */
/* compiled from: CloudBackupListAdapter.kt */
public final class C3848u extends RecyclerView.Adapter<C3849a> {

    /* renamed from: a */
    private List<C3847t> f9997a;

    /* renamed from: b */
    private final AutoBackupCloudViewModel f9998b;

    /* renamed from: c */
    private String f9999c;

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.u$a */
    /* compiled from: CloudBackupListAdapter.kt */
    public static final class C3849a extends RecyclerView.ViewHolder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final AutoBackupCloudViewModel f10000a;

        /* renamed from: b */
        private final String f10001b;

        /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.u$a$a */
        /* compiled from: CloudBackupListAdapter.kt */
        static final class C3850a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            final /* synthetic */ C3847t $backupInfo;
            final /* synthetic */ String $fileName;
            int label;
            final /* synthetic */ C3849a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3850a(C3849a aVar, C3847t tVar, String str, C13635d<? super C3850a> dVar) {
                super(3, dVar);
                this.this$0 = aVar;
                this.$backupInfo = tVar;
                this.$fileName = str;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C3850a(this.this$0, this.$backupInfo, this.$fileName, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.f10000a.mo27333F(this.$backupInfo, this.$fileName);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.u$a$b */
        /* compiled from: CloudBackupListAdapter.kt */
        static final class C3851b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            final /* synthetic */ C3847t $backupInfo;
            final /* synthetic */ String $fileName;
            int label;
            final /* synthetic */ C3849a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3851b(C3849a aVar, C3847t tVar, String str, C13635d<? super C3851b> dVar) {
                super(3, dVar);
                this.this$0 = aVar;
                this.$backupInfo = tVar;
                this.$fileName = str;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C3851b(this.this$0, this.$backupInfo, this.$fileName, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.f10000a.mo27334G(this.$backupInfo, this.$fileName);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3849a(View view, AutoBackupCloudViewModel autoBackupCloudViewModel, String str) {
            super(view);
            C13706o.m87929f(view, "itemView");
            C13706o.m87929f(autoBackupCloudViewModel, "viewModel");
            this.f10000a = autoBackupCloudViewModel;
            this.f10001b = str;
        }

        /* renamed from: v */
        private final String m15001v(C3847t tVar) {
            String str;
            try {
                String substring = tVar.mo27378a().substring(C15177w.m93687f0(tVar.mo27378a(), "___", 0, false, 6, (Object) null) + 3, C15177w.m93682a0(tVar.mo27378a(), ".zip", 0, false, 6, (Object) null));
                C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                if (substring.equals(this.f10001b)) {
                    str = this.itemView.getContext().getString(C17541R$string.cloud_backup_this_device);
                } else {
                    List x0 = C15177w.m93705x0(tVar.mo27378a(), new String[]{"___"}, false, 0, 6, (Object) null);
                    str = ((String) x0.get(1)) + " (" + ((String) x0.get(2)) + ')';
                }
                C13706o.m87928e(str, "{\n\n                val f…          }\n            }");
                return str;
            } catch (Exception unused) {
                return "";
            }
        }

        /* renamed from: w */
        private final String m15002w(C3847t tVar) {
            try {
                String substring = tVar.mo27378a().substring(0, C15177w.m93682a0(tVar.mo27378a(), "___", 0, false, 6, (Object) null));
                C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                long parseLong = Long.parseLong(substring);
                DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(this.itemView.getContext());
                DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(this.itemView.getContext());
                Date date = new Date(parseLong);
                return dateFormat.format(date) + " - " + timeFormat.format(date);
            } catch (Exception unused) {
                return "?";
            }
        }

        /* renamed from: u */
        public final void mo27387u(C3847t tVar) {
            C13706o.m87929f(tVar, "backupInfo");
            String w = m15002w(tVar);
            ((TextView) this.itemView.findViewById(C17532R$id.fileName)).setText(m15002w(tVar));
            ((TextView) this.itemView.findViewById(C17532R$id.infoLabel)).setText(m15001v(tVar));
            View view = this.itemView;
            int i = C17532R$id.container;
            MaterialCardView materialCardView = (MaterialCardView) view.findViewById(i);
            C13706o.m87928e(materialCardView, "itemView.container");
            C4666m.m18147o(materialCardView, (C13640g) null, new C3850a(this, tVar, w, (C13635d<? super C3850a>) null), 1, (Object) null);
            MaterialCardView materialCardView2 = (MaterialCardView) this.itemView.findViewById(i);
            C13706o.m87928e(materialCardView2, "itemView.container");
            C4666m.m18152t(materialCardView2, (C13640g) null, false, new C3851b(this, tVar, w, (C13635d<? super C3851b>) null), 3, (Object) null);
        }
    }

    public C3848u(List<C3847t> list, AutoBackupCloudViewModel autoBackupCloudViewModel) {
        C13706o.m87929f(list, "backupList");
        C13706o.m87929f(autoBackupCloudViewModel, "viewModel");
        this.f9997a = list;
        this.f9998b = autoBackupCloudViewModel;
        setHasStableIds(true);
    }

    /* renamed from: B */
    public void onBindViewHolder(C3849a aVar, int i) {
        C13706o.m87929f(aVar, "holder");
        aVar.mo27387u(this.f9997a.get(i));
    }

    /* renamed from: C */
    public C3849a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.item_autobackup_file, viewGroup, false);
        C13706o.m87928e(inflate, "from(parent.context).inf…ckup_file, parent, false)");
        return new C3849a(inflate, this.f9998b, this.f9999c);
    }

    /* renamed from: D */
    public final void mo27385D(String str) {
        this.f9999c = str;
    }

    /* renamed from: E */
    public final void mo27386E(List<C3847t> list) {
        C13706o.m87929f(list, "backupList");
        this.f9997a = list;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f9997a.size();
    }

    public long getItemId(int i) {
        return this.f9997a.get(i).mo27379b();
    }
}

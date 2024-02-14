package com.arlosoft.macrodroid.bugreporting.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.ArrayList;
import java.util.List;

public class BugReport implements Parcelable {
    public static final Parcelable.Creator<BugReport> CREATOR = new C3896a();

    /* renamed from: a */
    private List<Macro> f10101a;

    /* renamed from: c */
    private String f10102c;

    /* renamed from: d */
    private String f10103d;

    /* renamed from: f */
    private String f10104f;

    /* renamed from: g */
    private String f10105g;

    /* renamed from: o */
    private ArrayList<Uri> f10106o;

    /* renamed from: p */
    private boolean f10107p;

    /* renamed from: s */
    private boolean f10108s;

    /* renamed from: z */
    private boolean f10109z;

    /* renamed from: com.arlosoft.macrodroid.bugreporting.model.BugReport$a */
    class C3896a implements Parcelable.Creator<BugReport> {
        C3896a() {
        }

        /* renamed from: a */
        public BugReport createFromParcel(Parcel parcel) {
            return new BugReport(parcel, (C3896a) null);
        }

        /* renamed from: b */
        public BugReport[] newArray(int i) {
            return new BugReport[i];
        }
    }

    /* synthetic */ BugReport(Parcel parcel, C3896a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public String mo27501a() {
        return this.f10105g;
    }

    /* renamed from: b */
    public String mo27502b() {
        return this.f10102c;
    }

    /* renamed from: c */
    public String mo27503c() {
        return this.f10103d;
    }

    /* renamed from: d */
    public String mo27504d() {
        return this.f10104f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public List<Macro> mo27506e() {
        return this.f10101a;
    }

    /* renamed from: f */
    public ArrayList<Uri> mo27507f() {
        return this.f10106o;
    }

    /* renamed from: g */
    public boolean mo27508g() {
        return this.f10107p;
    }

    /* renamed from: h */
    public boolean mo27509h() {
        return this.f10109z;
    }

    /* renamed from: i */
    public boolean mo27510i() {
        return this.f10108s;
    }

    /* renamed from: j */
    public void mo27511j(String str) {
        this.f10102c = str;
    }

    /* renamed from: k */
    public void mo27512k(String str) {
        this.f10103d = str;
    }

    /* renamed from: l */
    public void mo27513l(String str) {
        this.f10104f = str;
    }

    /* renamed from: m */
    public void mo27514m(List<Macro> list) {
        this.f10101a = list;
    }

    /* renamed from: n */
    public void mo27515n(ArrayList<Uri> arrayList) {
        this.f10106o = arrayList;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10102c);
        parcel.writeString(this.f10103d);
        parcel.writeString(this.f10104f);
        parcel.writeList(this.f10101a);
        parcel.writeString(this.f10105g);
        parcel.writeInt(this.f10107p ? 1 : 0);
        parcel.writeInt(this.f10108s ? 1 : 0);
        parcel.writeInt(this.f10109z ? 1 : 0);
    }

    public BugReport(String str, boolean z, boolean z2, boolean z3) {
        this.f10105g = str;
        this.f10107p = z;
        this.f10108s = z2;
        this.f10109z = z3;
    }

    private BugReport(Parcel parcel) {
        this.f10102c = parcel.readString();
        this.f10103d = parcel.readString();
        this.f10104f = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f10101a = arrayList;
        parcel.readList(arrayList, Macro.class.getClassLoader());
        this.f10105g = parcel.readString();
        boolean z = true;
        this.f10107p = parcel.readInt() != 0;
        this.f10108s = parcel.readInt() != 0;
        this.f10109z = parcel.readInt() == 0 ? false : z;
    }
}

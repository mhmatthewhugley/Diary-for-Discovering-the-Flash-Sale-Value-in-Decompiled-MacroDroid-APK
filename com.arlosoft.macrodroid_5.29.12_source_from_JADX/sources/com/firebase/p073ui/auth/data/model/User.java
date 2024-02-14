package com.firebase.p073ui.auth.data.model;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.data.model.User */
public class User implements Parcelable {
    public static final Parcelable.Creator<User> CREATOR = new C6852a();

    /* renamed from: a */
    private final String f15993a;

    /* renamed from: c */
    private final String f15994c;

    /* renamed from: d */
    private final String f15995d;

    /* renamed from: f */
    private final String f15996f;

    /* renamed from: g */
    private final Uri f15997g;

    /* renamed from: com.firebase.ui.auth.data.model.User$a */
    static class C6852a implements Parcelable.Creator<User> {
        C6852a() {
        }

        /* renamed from: a */
        public User createFromParcel(Parcel parcel) {
            return new User(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(Uri.class.getClassLoader()), (C6852a) null);
        }

        /* renamed from: b */
        public User[] newArray(int i) {
            return new User[i];
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: com.firebase.ui.auth.data.model.User$b */
    public static class C6853b {

        /* renamed from: a */
        private String f15998a;

        /* renamed from: b */
        private String f15999b;

        /* renamed from: c */
        private String f16000c;

        /* renamed from: d */
        private String f16001d;

        /* renamed from: e */
        private Uri f16002e;

        public C6853b(@NonNull String str, @Nullable String str2) {
            this.f15998a = str;
            this.f15999b = str2;
        }

        /* renamed from: a */
        public User mo34171a() {
            return new User(this.f15998a, this.f15999b, this.f16000c, this.f16001d, this.f16002e, (C6852a) null);
        }

        /* renamed from: b */
        public C6853b mo34172b(String str) {
            this.f16001d = str;
            return this;
        }

        /* renamed from: c */
        public C6853b mo34173c(String str) {
            this.f16000c = str;
            return this;
        }

        /* renamed from: d */
        public C6853b mo34174d(Uri uri) {
            this.f16002e = uri;
            return this;
        }
    }

    /* synthetic */ User(String str, String str2, String str3, String str4, Uri uri, C6852a aVar) {
        this(str, str2, str3, str4, uri);
    }

    /* renamed from: e */
    public static User m25816e(Intent intent) {
        return (User) intent.getParcelableExtra("extra_user");
    }

    /* renamed from: f */
    public static User m25817f(Bundle bundle) {
        return (User) bundle.getParcelable("extra_user");
    }

    @Nullable
    /* renamed from: a */
    public String mo34158a() {
        return this.f15994c;
    }

    @Nullable
    /* renamed from: b */
    public String mo34159b() {
        return this.f15996f;
    }

    @Nullable
    /* renamed from: c */
    public Uri mo34160c() {
        return this.f15997g;
    }

    @NonNull
    /* renamed from: d */
    public String mo34161d() {
        return this.f15993a;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        if (this.f15993a.equals(user.f15993a) && ((str = this.f15994c) != null ? str.equals(user.f15994c) : user.f15994c == null) && ((str2 = this.f15995d) != null ? str2.equals(user.f15995d) : user.f15995d == null) && ((str3 = this.f15996f) != null ? str3.equals(user.f15996f) : user.f15996f == null)) {
            Uri uri = this.f15997g;
            Uri uri2 = user.f15997g;
            if (uri == null) {
                if (uri2 == null) {
                    return true;
                }
            } else if (uri.equals(uri2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f15993a.hashCode() * 31;
        String str = this.f15994c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f15995d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f15996f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Uri uri = this.f15997g;
        if (uri != null) {
            i = uri.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "User{mProviderId='" + this.f15993a + '\'' + ", mEmail='" + this.f15994c + '\'' + ", mPhoneNumber='" + this.f15995d + '\'' + ", mName='" + this.f15996f + '\'' + ", mPhotoUri=" + this.f15997g + '}';
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(this.f15993a);
        parcel.writeString(this.f15994c);
        parcel.writeString(this.f15995d);
        parcel.writeString(this.f15996f);
        parcel.writeParcelable(this.f15997g, i);
    }

    private User(String str, String str2, String str3, String str4, Uri uri) {
        this.f15993a = str;
        this.f15994c = str2;
        this.f15995d = str3;
        this.f15996f = str4;
        this.f15997g = uri;
    }
}

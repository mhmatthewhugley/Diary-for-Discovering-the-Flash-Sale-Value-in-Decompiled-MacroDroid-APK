package com.arlosoft.macrodroid.templatestore.model;

import com.arlosoft.macrodroid.common.DontObfuscate;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: User.kt */
public final class User {
    public static final C5226a Companion = new C5226a((C13695i) null);
    private final String description;
    private final String image;
    private final boolean isErrorUser;
    private final boolean isGuest;
    private final boolean isModerator;
    private final boolean isPirateUser;
    private final int numMacros;
    private final int rating;
    private final int totalUsers;
    private final int userId;
    private final int userRank;
    private final String username;

    /* renamed from: com.arlosoft.macrodroid.templatestore.model.User$a */
    /* compiled from: User.kt */
    public static final class C5226a {
        private C5226a() {
        }

        public /* synthetic */ C5226a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final User mo30362a() {
            return new User(-1, (String) null, (String) null, 0, (String) null, 0, 0, 0, false, false, 1022, (C13695i) null);
        }

        /* renamed from: b */
        public final User mo30363b() {
            return new User(-10, (String) null, (String) null, 0, (String) null, 0, 0, 0, false, false, 1022, (C13695i) null);
        }
    }

    public User() {
        this(0, (String) null, (String) null, 0, (String) null, 0, 0, 0, false, false, 1023, (C13695i) null);
    }

    public User(int i, String str, String str2, int i2, String str3, int i3, int i4, int i5, boolean z, boolean z2) {
        C13706o.m87929f(str, "username");
        C13706o.m87929f(str2, "description");
        C13706o.m87929f(str3, "image");
        this.userId = i;
        this.username = str;
        this.description = str2;
        this.rating = i2;
        this.image = str3;
        this.numMacros = i3;
        this.userRank = i4;
        this.totalUsers = i5;
        this.isModerator = z;
        this.isGuest = z2;
        boolean z3 = true;
        this.isErrorUser = i == -1;
        this.isPirateUser = i != -10 ? false : z3;
    }

    public static /* synthetic */ User copy$default(User user, int i, String str, String str2, int i2, String str3, int i3, int i4, int i5, boolean z, boolean z2, int i6, Object obj) {
        User user2 = user;
        int i7 = i6;
        return user.copy((i7 & 1) != 0 ? user2.userId : i, (i7 & 2) != 0 ? user2.username : str, (i7 & 4) != 0 ? user2.description : str2, (i7 & 8) != 0 ? user2.rating : i2, (i7 & 16) != 0 ? user2.image : str3, (i7 & 32) != 0 ? user2.numMacros : i3, (i7 & 64) != 0 ? user2.userRank : i4, (i7 & 128) != 0 ? user2.totalUsers : i5, (i7 & 256) != 0 ? user2.isModerator : z, (i7 & 512) != 0 ? user2.isGuest : z2);
    }

    public final int component1() {
        return this.userId;
    }

    public final boolean component10() {
        return this.isGuest;
    }

    public final String component2() {
        return this.username;
    }

    public final String component3() {
        return this.description;
    }

    public final int component4() {
        return this.rating;
    }

    public final String component5() {
        return this.image;
    }

    public final int component6() {
        return this.numMacros;
    }

    public final int component7() {
        return this.userRank;
    }

    public final int component8() {
        return this.totalUsers;
    }

    public final boolean component9() {
        return this.isModerator;
    }

    public final User copy(int i, String str, String str2, int i2, String str3, int i3, int i4, int i5, boolean z, boolean z2) {
        C13706o.m87929f(str, "username");
        C13706o.m87929f(str2, "description");
        String str4 = str3;
        C13706o.m87929f(str4, "image");
        return new User(i, str, str2, i2, str4, i3, i4, i5, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return this.userId == user.userId && C13706o.m87924a(this.username, user.username) && C13706o.m87924a(this.description, user.description) && this.rating == user.rating && C13706o.m87924a(this.image, user.image) && this.numMacros == user.numMacros && this.userRank == user.userRank && this.totalUsers == user.totalUsers && this.isModerator == user.isModerator && this.isGuest == user.isGuest;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImage() {
        return this.image;
    }

    public final int getNumMacros() {
        return this.numMacros;
    }

    public final int getRating() {
        return this.rating;
    }

    public final int getTotalUsers() {
        return this.totalUsers;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final int getUserRank() {
        return this.userRank;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.userId * 31) + this.username.hashCode()) * 31) + this.description.hashCode()) * 31) + this.rating) * 31) + this.image.hashCode()) * 31) + this.numMacros) * 31) + this.userRank) * 31) + this.totalUsers) * 31;
        boolean z = this.isModerator;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.isGuest;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public final boolean isCloudBackupOnly() {
        return this.userId == -2;
    }

    public final boolean isErrorUser() {
        return this.isErrorUser;
    }

    public final boolean isGuest() {
        return this.isGuest;
    }

    public final boolean isModerator() {
        return this.isModerator;
    }

    public final boolean isPirateUser() {
        return this.isPirateUser;
    }

    public final boolean isValid() {
        String str = this.username;
        return !(str == null || str.length() == 0);
    }

    public String toString() {
        return "User(userId=" + this.userId + ", username=" + this.username + ", description=" + this.description + ", rating=" + this.rating + ", image=" + this.image + ", numMacros=" + this.numMacros + ", userRank=" + this.userRank + ", totalUsers=" + this.totalUsers + ", isModerator=" + this.isModerator + ", isGuest=" + this.isGuest + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ User(int r12, java.lang.String r13, java.lang.String r14, int r15, java.lang.String r16, int r17, int r18, int r19, boolean r20, boolean r21, int r22, kotlin.jvm.internal.C13695i r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = 0
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 2
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0012
            r3 = r4
            goto L_0x0013
        L_0x0012:
            r3 = r13
        L_0x0013:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0019
            r5 = r4
            goto L_0x001a
        L_0x0019:
            r5 = r14
        L_0x001a:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0020
            r6 = 0
            goto L_0x0021
        L_0x0020:
            r6 = r15
        L_0x0021:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r4 = r16
        L_0x0028:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002e
            r7 = 0
            goto L_0x0030
        L_0x002e:
            r7 = r17
        L_0x0030:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            r8 = 0
            goto L_0x0038
        L_0x0036:
            r8 = r18
        L_0x0038:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003e
            r9 = 0
            goto L_0x0040
        L_0x003e:
            r9 = r19
        L_0x0040:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0046
            r10 = 0
            goto L_0x0048
        L_0x0046:
            r10 = r20
        L_0x0048:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r2 = r21
        L_0x004f:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r5
            r16 = r6
            r17 = r4
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.templatestore.model.User.<init>(int, java.lang.String, java.lang.String, int, java.lang.String, int, int, int, boolean, boolean, int, kotlin.jvm.internal.i):void");
    }
}

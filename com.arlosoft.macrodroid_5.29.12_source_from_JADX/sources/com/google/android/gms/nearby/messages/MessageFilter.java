package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public class MessageFilter extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<MessageFilter> CREATOR = new zzb();
    @NonNull

    /* renamed from: p */
    public static final MessageFilter f47630p;
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f47631a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final List f47632c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final List f47633d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final boolean f47634f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final List f47635g;
    @SafeParcelable.Field

    /* renamed from: o */
    private final int f47636o;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static final class Builder {

        /* renamed from: a */
        private final Set f47637a = new HashSet();

        /* renamed from: b */
        private final List f47638b = new ArrayList();

        /* renamed from: c */
        private final Set f47639c = new HashSet();

        /* renamed from: d */
        private boolean f47640d;

        /* renamed from: e */
        private int f47641e = 0;

        @NonNull
        /* renamed from: a */
        public MessageFilter mo55892a() {
            boolean z = true;
            if (!this.f47640d && this.f47637a.isEmpty()) {
                z = false;
            }
            Preconditions.m4494q(z, "At least one of the include methods must be called.");
            return new MessageFilter(2, new ArrayList(this.f47637a), this.f47638b, this.f47640d, new ArrayList(this.f47639c), this.f47641e);
        }

        @NonNull
        /* renamed from: b */
        public Builder mo55893b() {
            this.f47640d = true;
            return this;
        }
    }

    static {
        Builder builder = new Builder();
        builder.mo55893b();
        f47630p = builder.mo55892a();
    }

    @SafeParcelable.Constructor
    MessageFilter(@SafeParcelable.Param int i, @SafeParcelable.Param List list, @SafeParcelable.Param List list2, @SafeParcelable.Param boolean z, @SafeParcelable.Param List list3, @SafeParcelable.Param int i2) {
        this.f47631a = i;
        this.f47632c = Collections.unmodifiableList((List) Preconditions.m4488k(list));
        this.f47634f = z;
        this.f47633d = Collections.unmodifiableList(list2 == null ? Collections.emptyList() : list2);
        this.f47635g = Collections.unmodifiableList(list3 == null ? Collections.emptyList() : list3);
        this.f47636o = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageFilter)) {
            return false;
        }
        MessageFilter messageFilter = (MessageFilter) obj;
        return this.f47634f == messageFilter.f47634f && Objects.m4470a(this.f47632c, messageFilter.f47632c) && Objects.m4470a(this.f47633d, messageFilter.f47633d) && Objects.m4470a(this.f47635g, messageFilter.f47635g);
    }

    public int hashCode() {
        return Objects.m4471b(this.f47632c, this.f47633d, Boolean.valueOf(this.f47634f), this.f47635g);
    }

    @NonNull
    public String toString() {
        boolean z = this.f47634f;
        String valueOf = String.valueOf(this.f47632c);
        return "MessageFilter{includeAllMyTypes=" + z + ", messageTypes=" + valueOf + "}";
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4558B(parcel, 1, this.f47632c, false);
        SafeParcelWriter.m4558B(parcel, 2, this.f47633d, false);
        SafeParcelWriter.m4565c(parcel, 3, this.f47634f);
        SafeParcelWriter.m4558B(parcel, 4, this.f47635g, false);
        SafeParcelWriter.m4576n(parcel, 5, this.f47636o);
        SafeParcelWriter.m4576n(parcel, 1000, this.f47631a);
        SafeParcelWriter.m4564b(parcel, a);
    }
}

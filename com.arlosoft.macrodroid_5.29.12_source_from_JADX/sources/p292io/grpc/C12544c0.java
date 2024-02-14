package p292io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

/* renamed from: io.grpc.c0 */
/* compiled from: InternalChannelz */
public final class C12544c0 {

    /* renamed from: a */
    public final String f59462a;

    /* renamed from: b */
    public final C12546b f59463b;

    /* renamed from: c */
    public final long f59464c;

    /* renamed from: d */
    public final C12904j0 f59465d;

    /* renamed from: e */
    public final C12904j0 f59466e;

    /* renamed from: io.grpc.c0$a */
    /* compiled from: InternalChannelz */
    public static final class C12545a {

        /* renamed from: a */
        private String f59467a;

        /* renamed from: b */
        private C12546b f59468b;

        /* renamed from: c */
        private Long f59469c;

        /* renamed from: d */
        private C12904j0 f59470d;

        /* renamed from: e */
        private C12904j0 f59471e;

        /* renamed from: a */
        public C12544c0 mo69100a() {
            Preconditions.m5393t(this.f59467a, "description");
            Preconditions.m5393t(this.f59468b, "severity");
            Preconditions.m5393t(this.f59469c, "timestampNanos");
            Preconditions.m5399z(this.f59470d == null || this.f59471e == null, "at least one of channelRef and subchannelRef must be null");
            return new C12544c0(this.f59467a, this.f59468b, this.f59469c.longValue(), this.f59470d, this.f59471e);
        }

        /* renamed from: b */
        public C12545a mo69101b(String str) {
            this.f59467a = str;
            return this;
        }

        /* renamed from: c */
        public C12545a mo69102c(C12546b bVar) {
            this.f59468b = bVar;
            return this;
        }

        /* renamed from: d */
        public C12545a mo69103d(C12904j0 j0Var) {
            this.f59471e = j0Var;
            return this;
        }

        /* renamed from: e */
        public C12545a mo69104e(long j) {
            this.f59469c = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: io.grpc.c0$b */
    /* compiled from: InternalChannelz */
    public enum C12546b {
        CT_UNKNOWN,
        CT_INFO,
        CT_WARNING,
        CT_ERROR
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12544c0)) {
            return false;
        }
        C12544c0 c0Var = (C12544c0) obj;
        if (!Objects.m5349a(this.f59462a, c0Var.f59462a) || !Objects.m5349a(this.f59463b, c0Var.f59463b) || this.f59464c != c0Var.f59464c || !Objects.m5349a(this.f59465d, c0Var.f59465d) || !Objects.m5349a(this.f59466e, c0Var.f59466e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.m5350b(this.f59462a, this.f59463b, Long.valueOf(this.f59464c), this.f59465d, this.f59466e);
    }

    public String toString() {
        return MoreObjects.m5334c(this).mo22194d("description", this.f59462a).mo22194d("severity", this.f59463b).mo22193c("timestampNanos", this.f59464c).mo22194d("channelRef", this.f59465d).mo22194d("subchannelRef", this.f59466e).toString();
    }

    private C12544c0(String str, C12546b bVar, long j, C12904j0 j0Var, C12904j0 j0Var2) {
        this.f59462a = str;
        this.f59463b = (C12546b) Preconditions.m5393t(bVar, "severity");
        this.f59464c = j;
        this.f59465d = j0Var;
        this.f59466e = j0Var2;
    }
}

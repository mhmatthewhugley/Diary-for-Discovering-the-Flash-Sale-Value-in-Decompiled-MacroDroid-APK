package com.google.android.datatransport;

import androidx.annotation.Nullable;
import java.util.Objects;

final class AutoValue_Event<T> extends Event<T> {

    /* renamed from: a */
    private final Integer f1104a;

    /* renamed from: b */
    private final T f1105b;

    /* renamed from: c */
    private final Priority f1106c;

    AutoValue_Event(@Nullable Integer num, T t, Priority priority) {
        this.f1104a = num;
        Objects.requireNonNull(t, "Null payload");
        this.f1105b = t;
        Objects.requireNonNull(priority, "Null priority");
        this.f1106c = priority;
    }

    @Nullable
    /* renamed from: a */
    public Integer mo19261a() {
        return this.f1104a;
    }

    /* renamed from: b */
    public T mo19262b() {
        return this.f1105b;
    }

    /* renamed from: c */
    public Priority mo19263c() {
        return this.f1106c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        Integer num = this.f1104a;
        if (num != null ? num.equals(event.mo19261a()) : event.mo19261a() == null) {
            if (!this.f1105b.equals(event.mo19262b()) || !this.f1106c.equals(event.mo19263c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f1104a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f1105b.hashCode()) * 1000003) ^ this.f1106c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f1104a + ", payload=" + this.f1105b + ", priority=" + this.f1106c + "}";
    }
}

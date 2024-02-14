package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;

@GwtCompatible
@Immutable
@ElementTypesAreNonnullByDefault
public final class HostAndPort implements Serializable {
    private static final long serialVersionUID = 0;
    private final boolean hasBracketlessColons;
    private final String host;
    private final int port;

    /* renamed from: a */
    public boolean mo61164a() {
        return this.port >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostAndPort)) {
            return false;
        }
        HostAndPort hostAndPort = (HostAndPort) obj;
        if (!Objects.m5349a(this.host, hostAndPort.host) || this.port != hostAndPort.port) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.m5350b(this.host, Integer.valueOf(this.port));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.host.length() + 8);
        if (this.host.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(this.host);
            sb.append(']');
        } else {
            sb.append(this.host);
        }
        if (mo61164a()) {
            sb.append(':');
            sb.append(this.port);
        }
        return sb.toString();
    }
}

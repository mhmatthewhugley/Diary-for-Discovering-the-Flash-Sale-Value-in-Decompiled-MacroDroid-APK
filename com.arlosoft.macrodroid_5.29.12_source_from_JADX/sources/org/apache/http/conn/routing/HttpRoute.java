package org.apache.http.conn.routing;

import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Immutable;
import org.apache.http.conn.routing.RouteInfo;

@Immutable
public final class HttpRoute implements RouteInfo, Cloneable {
    private static final HttpHost[] EMPTY_HTTP_HOST_ARRAY = new HttpHost[0];
    private final RouteInfo.LayerType layered;
    private final InetAddress localAddress;
    private final HttpHost[] proxyChain;
    private final boolean secure;
    private final HttpHost targetHost;
    private final RouteInfo.TunnelType tunnelled;

    private HttpRoute(InetAddress inetAddress, HttpHost httpHost, HttpHost[] httpHostArr, boolean z, RouteInfo.TunnelType tunnelType, RouteInfo.LayerType layerType) {
        if (httpHost == null) {
            throw new IllegalArgumentException("Target host may not be null.");
        } else if (httpHostArr == null) {
            throw new IllegalArgumentException("Proxies may not be null.");
        } else if (tunnelType == RouteInfo.TunnelType.TUNNELLED && httpHostArr.length == 0) {
            throw new IllegalArgumentException("Proxy required if tunnelled.");
        } else {
            tunnelType = tunnelType == null ? RouteInfo.TunnelType.PLAIN : tunnelType;
            layerType = layerType == null ? RouteInfo.LayerType.PLAIN : layerType;
            this.targetHost = httpHost;
            this.localAddress = inetAddress;
            this.proxyChain = httpHostArr;
            this.secure = z;
            this.tunnelled = tunnelType;
            this.layered = layerType;
        }
    }

    private static HttpHost[] toChain(HttpHost httpHost) {
        if (httpHost == null) {
            return EMPTY_HTTP_HOST_ARRAY;
        }
        return new HttpHost[]{httpHost};
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        int i = 0;
        if (!(obj instanceof HttpRoute)) {
            return false;
        }
        HttpRoute httpRoute = (HttpRoute) obj;
        boolean equals = this.targetHost.equals(httpRoute.targetHost);
        InetAddress inetAddress = this.localAddress;
        InetAddress inetAddress2 = httpRoute.localAddress;
        boolean z2 = equals & (inetAddress == inetAddress2 || (inetAddress != null && inetAddress.equals(inetAddress2)));
        HttpHost[] httpHostArr = this.proxyChain;
        HttpHost[] httpHostArr2 = httpRoute.proxyChain;
        boolean z3 = z2 & (httpHostArr == httpHostArr2 || httpHostArr.length == httpHostArr2.length);
        if (!(this.secure == httpRoute.secure && this.tunnelled == httpRoute.tunnelled && this.layered == httpRoute.layered)) {
            z = false;
        }
        boolean z4 = z & z3;
        if (z4 && httpHostArr != null) {
            while (z4) {
                HttpHost[] httpHostArr3 = this.proxyChain;
                if (i >= httpHostArr3.length) {
                    break;
                }
                z4 = httpHostArr3[i].equals(httpRoute.proxyChain[i]);
                i++;
            }
        }
        return z4;
    }

    public final int getHopCount() {
        return this.proxyChain.length + 1;
    }

    public final HttpHost getHopTarget(int i) {
        if (i >= 0) {
            int hopCount = getHopCount();
            if (i >= hopCount) {
                throw new IllegalArgumentException("Hop index " + i + " exceeds route length " + hopCount);
            } else if (i < hopCount - 1) {
                return this.proxyChain[i];
            } else {
                return this.targetHost;
            }
        } else {
            throw new IllegalArgumentException("Hop index must not be negative: " + i);
        }
    }

    public final RouteInfo.LayerType getLayerType() {
        return this.layered;
    }

    public final InetAddress getLocalAddress() {
        return this.localAddress;
    }

    public final HttpHost getProxyHost() {
        HttpHost[] httpHostArr = this.proxyChain;
        if (httpHostArr.length == 0) {
            return null;
        }
        return httpHostArr[0];
    }

    public final HttpHost getTargetHost() {
        return this.targetHost;
    }

    public final RouteInfo.TunnelType getTunnelType() {
        return this.tunnelled;
    }

    public final int hashCode() {
        int hashCode = this.targetHost.hashCode();
        InetAddress inetAddress = this.localAddress;
        if (inetAddress != null) {
            hashCode ^= inetAddress.hashCode();
        }
        HttpHost[] httpHostArr = this.proxyChain;
        int length = hashCode ^ httpHostArr.length;
        for (HttpHost hashCode2 : httpHostArr) {
            length ^= hashCode2.hashCode();
        }
        if (this.secure) {
            length ^= 286331153;
        }
        return (length ^ this.tunnelled.hashCode()) ^ this.layered.hashCode();
    }

    public final boolean isLayered() {
        return this.layered == RouteInfo.LayerType.LAYERED;
    }

    public final boolean isSecure() {
        return this.secure;
    }

    public final boolean isTunnelled() {
        return this.tunnelled == RouteInfo.TunnelType.TUNNELLED;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getHopCount() * 30) + 50);
        sb.append("HttpRoute[");
        InetAddress inetAddress = this.localAddress;
        if (inetAddress != null) {
            sb.append(inetAddress);
            sb.append("->");
        }
        sb.append('{');
        if (this.tunnelled == RouteInfo.TunnelType.TUNNELLED) {
            sb.append('t');
        }
        if (this.layered == RouteInfo.LayerType.LAYERED) {
            sb.append('l');
        }
        if (this.secure) {
            sb.append('s');
        }
        sb.append("}->");
        for (HttpHost append : this.proxyChain) {
            sb.append(append);
            sb.append("->");
        }
        sb.append(this.targetHost);
        sb.append(']');
        return sb.toString();
    }

    private static HttpHost[] toChain(HttpHost[] httpHostArr) {
        if (httpHostArr == null || httpHostArr.length < 1) {
            return EMPTY_HTTP_HOST_ARRAY;
        }
        int length = httpHostArr.length;
        int i = 0;
        while (i < length) {
            if (httpHostArr[i] != null) {
                i++;
            } else {
                throw new IllegalArgumentException("Proxy chain may not contain null elements.");
            }
        }
        HttpHost[] httpHostArr2 = new HttpHost[httpHostArr.length];
        System.arraycopy(httpHostArr, 0, httpHostArr2, 0, httpHostArr.length);
        return httpHostArr2;
    }

    public HttpRoute(HttpHost httpHost, InetAddress inetAddress, HttpHost[] httpHostArr, boolean z, RouteInfo.TunnelType tunnelType, RouteInfo.LayerType layerType) {
        this(inetAddress, httpHost, toChain(httpHostArr), z, tunnelType, layerType);
    }

    public HttpRoute(HttpHost httpHost, InetAddress inetAddress, HttpHost httpHost2, boolean z, RouteInfo.TunnelType tunnelType, RouteInfo.LayerType layerType) {
        this(inetAddress, httpHost, toChain(httpHost2), z, tunnelType, layerType);
    }

    public HttpRoute(HttpHost httpHost, InetAddress inetAddress, boolean z) {
        this(inetAddress, httpHost, EMPTY_HTTP_HOST_ARRAY, z, RouteInfo.TunnelType.PLAIN, RouteInfo.LayerType.PLAIN);
    }

    public HttpRoute(HttpHost httpHost) {
        this((InetAddress) null, httpHost, EMPTY_HTTP_HOST_ARRAY, false, RouteInfo.TunnelType.PLAIN, RouteInfo.LayerType.PLAIN);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HttpRoute(org.apache.http.HttpHost r8, java.net.InetAddress r9, org.apache.http.HttpHost r10, boolean r11) {
        /*
            r7 = this;
            org.apache.http.HttpHost[] r3 = toChain((org.apache.http.HttpHost) r10)
            if (r11 == 0) goto L_0x0009
            org.apache.http.conn.routing.RouteInfo$TunnelType r0 = org.apache.http.conn.routing.RouteInfo.TunnelType.TUNNELLED
            goto L_0x000b
        L_0x0009:
            org.apache.http.conn.routing.RouteInfo$TunnelType r0 = org.apache.http.conn.routing.RouteInfo.TunnelType.PLAIN
        L_0x000b:
            r5 = r0
            if (r11 == 0) goto L_0x0011
            org.apache.http.conn.routing.RouteInfo$LayerType r0 = org.apache.http.conn.routing.RouteInfo.LayerType.LAYERED
            goto L_0x0013
        L_0x0011:
            org.apache.http.conn.routing.RouteInfo$LayerType r0 = org.apache.http.conn.routing.RouteInfo.LayerType.PLAIN
        L_0x0013:
            r6 = r0
            r0 = r7
            r1 = r9
            r2 = r8
            r4 = r11
            r0.<init>((java.net.InetAddress) r1, (org.apache.http.HttpHost) r2, (org.apache.http.HttpHost[]) r3, (boolean) r4, (org.apache.http.conn.routing.RouteInfo.TunnelType) r5, (org.apache.http.conn.routing.RouteInfo.LayerType) r6)
            if (r10 == 0) goto L_0x001e
            return
        L_0x001e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Proxy host may not be null."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.routing.HttpRoute.<init>(org.apache.http.HttpHost, java.net.InetAddress, org.apache.http.HttpHost, boolean):void");
    }
}

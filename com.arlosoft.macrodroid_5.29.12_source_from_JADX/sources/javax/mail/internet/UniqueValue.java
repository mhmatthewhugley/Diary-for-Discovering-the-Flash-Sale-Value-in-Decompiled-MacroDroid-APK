package javax.mail.internet;

import java.util.concurrent.atomic.AtomicInteger;
import javax.mail.Session;
import org.apache.commons.p353io.FilenameUtils;

class UniqueValue {

    /* renamed from: id */
    private static AtomicInteger f61347id = new AtomicInteger();

    UniqueValue() {
    }

    public static String getUniqueBoundaryValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("----=_Part_");
        sb.append(f61347id.getAndIncrement());
        sb.append("_");
        sb.append((long) sb.hashCode());
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb.append(System.currentTimeMillis());
        return sb.toString();
    }

    public static String getUniqueMessageIDValue(Session session) {
        InternetAddress localAddress = InternetAddress.getLocalAddress(session);
        String address = localAddress != null ? localAddress.getAddress() : "jakartamailuser@localhost";
        int lastIndexOf = address.lastIndexOf(64);
        if (lastIndexOf >= 0) {
            address = address.substring(lastIndexOf);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(sb.hashCode());
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb.append(f61347id.getAndIncrement());
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb.append(System.currentTimeMillis());
        sb.append(address);
        return sb.toString();
    }
}

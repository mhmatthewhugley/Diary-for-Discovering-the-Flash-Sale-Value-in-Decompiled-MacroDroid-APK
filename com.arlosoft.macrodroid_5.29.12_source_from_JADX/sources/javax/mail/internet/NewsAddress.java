package javax.mail.internet;

import java.util.ArrayList;
import java.util.Locale;
import java.util.StringTokenizer;
import javax.mail.Address;

public class NewsAddress extends Address {
    private static final long serialVersionUID = -4203797299824684143L;
    protected String host;
    protected String newsgroup;

    public NewsAddress() {
    }

    public static NewsAddress[] parse(String str) throws AddressException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            arrayList.add(new NewsAddress(stringTokenizer.nextToken()));
        }
        return (NewsAddress[]) arrayList.toArray(new NewsAddress[arrayList.size()]);
    }

    public boolean equals(Object obj) {
        String str;
        if (!(obj instanceof NewsAddress)) {
            return false;
        }
        NewsAddress newsAddress = (NewsAddress) obj;
        String str2 = this.newsgroup;
        if ((str2 != null || newsAddress.newsgroup != null) && (str2 == null || !str2.equals(newsAddress.newsgroup))) {
            return false;
        }
        String str3 = this.host;
        if ((str3 != null || newsAddress.host != null) && (str3 == null || (str = newsAddress.host) == null || !str3.equalsIgnoreCase(str))) {
            return false;
        }
        return true;
    }

    public String getHost() {
        return this.host;
    }

    public String getNewsgroup() {
        return this.newsgroup;
    }

    public String getType() {
        return "news";
    }

    public int hashCode() {
        String str = this.newsgroup;
        int i = 0;
        if (str != null) {
            i = 0 + str.hashCode();
        }
        String str2 = this.host;
        return str2 != null ? i + str2.toLowerCase(Locale.ENGLISH).hashCode() : i;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setNewsgroup(String str) {
        this.newsgroup = str;
    }

    public String toString() {
        return this.newsgroup;
    }

    public NewsAddress(String str) {
        this(str, (String) null);
    }

    public static String toString(Address[] addressArr) {
        if (addressArr == null || addressArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder(addressArr[0].toString());
        int length = sb.length();
        for (int i = 1; i < addressArr.length; i++) {
            sb.append(",");
            int i2 = length + 1;
            String newsAddress = addressArr[i].toString();
            if (newsAddress.length() + i2 > 76) {
                sb.append("\r\n\t");
                i2 = 8;
            }
            sb.append(newsAddress);
            length = i2 + newsAddress.length();
        }
        return sb.toString();
    }

    public NewsAddress(String str, String str2) {
        this.newsgroup = str.replaceAll("\\s+", "");
        this.host = str2;
    }
}

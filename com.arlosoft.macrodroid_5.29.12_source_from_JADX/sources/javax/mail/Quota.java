package javax.mail;

public class Quota {
    public String quotaRoot;
    public Resource[] resources;

    public static class Resource {
        public long limit;
        public String name;
        public long usage;

        public Resource(String str, long j, long j2) {
            this.name = str;
            this.usage = j;
            this.limit = j2;
        }
    }

    public Quota(String str) {
        this.quotaRoot = str;
    }

    public void setResourceLimit(String str, long j) {
        if (this.resources == null) {
            Resource[] resourceArr = new Resource[1];
            this.resources = resourceArr;
            resourceArr[0] = new Resource(str, 0, j);
            return;
        }
        int i = 0;
        while (true) {
            Resource[] resourceArr2 = this.resources;
            if (i >= resourceArr2.length) {
                int length = resourceArr2.length + 1;
                Resource[] resourceArr3 = new Resource[length];
                System.arraycopy(resourceArr2, 0, resourceArr3, 0, resourceArr2.length);
                resourceArr3[length - 1] = new Resource(str, 0, j);
                this.resources = resourceArr3;
                return;
            } else if (resourceArr2[i].name.equalsIgnoreCase(str)) {
                this.resources[i].limit = j;
                return;
            } else {
                i++;
            }
        }
    }
}

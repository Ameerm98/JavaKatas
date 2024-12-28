package katas.exercises;

public class SemanticVersionComparator {

    /**
     * Compares two semantic version strings to determine their relative order.
     *
     * @param version1 the first version string (e.g., "MAJOR.MINOR.PATCH")
     * @param version2 the second version string (e.g., "MAJOR.MINOR.PATCH")
     * @return -1 if version1 < version2, 1 if version1 > version2, 0 if they are equal
     */
    public static int compareVersions(String version1, String version2) {
        int res =version1.compareTo(version2);
        if(res>0){
            return 1;
        } else if (res<0) {
            return -1;
        }
        return 0;
/*
        if (v1[0].compareTo(v2[0])==1){
            return 1;
        } else if (v1[0].compareTo(v2[0])==-1) {
            return -1;
        }else {
            if (v1[1].compareTo(v2[1])==1){
                return 1;
            } else if (v1[1].compareTo(v2[1])==-1) {
                return -1;
            }else {
                if (v1[2].compareTo(v2[2])==1){
                    return 1;
                }else if (v1[2].compareTo(v2[2])==-1){
                    return -1;
                }else {
                    return 0;
                }
            }
        }


 */


    }

    public static void main(String[] args) {
        System.out.println(compareVersions("1.0.0", "1.0.1")); // Expected: -1
        System.out.println(compareVersions("2.1.0", "1.9.9")); // Expected: 1
        System.out.println(compareVersions("1.2.3", "1.2.3")); // Expected: 0
    }
}

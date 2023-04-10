package LevelOne.lectTen.linkedList;

public class _5_mergeSortArr {

    public static int[] mergeSort(int[] a, int low, int high) {
        if (low == high) {
            return new int[]{a[low]};
        }

        int mid = (low+high)/2;
        int[] a1 = mergeSort(a, low, mid);
        int[] a2 = mergeSort(a, mid+1, high);
        return mergeArrays(a1, a2);
    }

    public static int[] mergeArrays(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int [] res = new int[a.length + b.length];
        int k = 0;
        while (i < a.length && j < b.length) {
            int ele1 = a[i];
            int ele2 = b[j];

            if (ele1 < ele2) {
                res[k] = ele1;
                i++;
            } else {
                res[k] = ele2;
                j++;
            }
            k++;
        }

        while (i < a.length) {
            res[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            res[k] = b[j];
            j++;
            k++;
        }

        return res;
    }

    public static void main(String[] args) {
//        mergeArrays(new int[]{1, 3, 4, 7}, new int[]{2, 5, 6, 8});
        int[] a = new int[]{7, 4, 1, 3, 6, 8, 2, 5};
        int[] res = mergeSort(a, 0, a.length - 1);
        System.out.println("");
    }
}



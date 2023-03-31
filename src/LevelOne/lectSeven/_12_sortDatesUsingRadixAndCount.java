package LevelOne.lectSeven;

public class _12_sortDatesUsingRadixAndCount {
    public static void main(String[] args) {
        String[] datesArr= new String[] {"12041996", "20101996", "12041989", "05061997", "11081987"};
        sortDates(datesArr);
        displayArr(datesArr);
    }

    public static void sortDates(String[] arr) {
        countSort(arr, "days");
        countSort(arr, "months");
        countSort(arr, "years");
    }

    public static void countSort(String[] arr, String cal) {
        int minEle = Integer.MAX_VALUE, maxEle = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int ele = getEle(arr[i], cal);
            if (ele < minEle) minEle = ele;
            if (ele > maxEle) maxEle = ele;
        }

        int range = maxEle - minEle + 1;
        int[] freqArr = new int[range];

        for (int i = 0; i < n; i++) {
            int key = getEle(arr[i], cal);
            key = key - minEle;
            freqArr[key]++;
        }

        // prefix for stable sort
        for (int i = 1; i < freqArr.length; i++) {
            freqArr[i] = freqArr[i] + freqArr[i-1];
        }

        String[] ans = new String[arr.length];

        for (int i = n-1; i >= 0; i--) {
            String ele = arr[i];
            int digit = getEle(arr[i], cal);
            int freKey = digit - minEle;
            int freqVal = freqArr[freKey];
            freqVal -= 1;
            ans[freqVal] = ele;
            freqArr[freKey]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = ans[i];
        }
    }

    public static int getEle(String ele, String cal) {
        if (cal == "days") {
            return Integer.parseInt(ele.substring(0,2));
        } else if (cal == "months") {
            return Integer.parseInt(ele.substring(2, 4));
        } else {
            return Integer.parseInt(ele.substring(4));
        }
    }

    public static void displayArr(String [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t"+arr[i]);
        }
    }
}

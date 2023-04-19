package LevelOne.lectTen.linkedList;

public class _13_isPalindrome2 {
    static  _1_ll.LinkedList ll = new _1_ll.LinkedList();
    static _1_ll.Node left;
    public static void main(String[] args) {
        // PREPARE DATA FOR PALINDROME
        for (int i = 0; i < 5; i++) {
            ll.addLast(i);
        }
        ll.addLast(0);
//        ll.addLast(343);
//        ll.addLast(3433);
        for (int i = 4; i >= 0; i--) {
            ll.addLast(i);
        }
        left = ll.head;
//        boolean check = isPalidrome(ll.head);
//        System.out.println(check);

        _1_ll.LinkedList ll2 = new _1_ll.LinkedList();
        ll2.addLast(1);
        ll2.addLast(2);
        left = ll2.head;
        System.out.println(isPalidrome(ll2.head));
    }

    public static boolean isPalidrome(_1_ll.Node right) {
        // RETURN THIS AS TRUE, NULL AT THE END SAME AS
        // NULL BEFORE HEAD, THIS WILL NOT BE MATCHED
        //
        if (right == null) return true;

        boolean rres = isPalidrome(right.next);

        // IF ANY OF THE PREVIOUS CALL IS FALSE PASS IT ALONG
        // NO NEED TO CHECK FURTHER, AS PALINDROME IS ALREADY FAILED
        // FOR PREVIOUS CALLS
        if (rres == false) {
            return false;
        }
        else if (right.data != left.data) {
            return false;
        };
//        System.out.println("right: "+right.data+"\t pLeft: "+left.data);
        left = left.next;
        return true;
    }

}

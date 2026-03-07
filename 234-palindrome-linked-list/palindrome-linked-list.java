import java.util.*;

class Solution {
    public boolean isPalindrome(ListNode head) {

        List<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

        int left = 0;
        int right = list.size() - 1;

        while(left < right){
            if(!list.get(left).equals(list.get(right))){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
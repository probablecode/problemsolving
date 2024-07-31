// import java.util.Set
import java.util.TreeSet;

class Solution {
    public boolean solution(String[] phoneBook) {
        TreeSet<String> treeSet = new TreeSet<>();
        for (String phoneNumber : phoneBook)
            treeSet.add(phoneNumber);
        String prefix = treeSet.pollFirst();
        while (!treeSet.isEmpty()) {
            String hayStack = treeSet.pollFirst();
            if (hayStack.startsWith(prefix))
                return false;
            prefix = hayStack;
        }
        return true;
    }
}
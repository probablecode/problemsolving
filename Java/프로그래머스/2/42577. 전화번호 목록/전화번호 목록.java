import java.util.TreeSet;
import java.util.Iterator;
class Solution {
    public boolean solution(String[] phoneBook) {
        TreeSet<String> treeSet = new TreeSet<>();
        for (String phoneNumber : phoneBook)
            treeSet.add(phoneNumber);
        Iterator<String> it = treeSet.iterator();
        String prefix = it.next();
        while (it.hasNext()) {
            String hayStack = it.next();
            if (hayStack.startsWith(prefix))
                return false;
            prefix = hayStack;
        }
        return true;
    }
}
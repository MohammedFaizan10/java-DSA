/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        Node oldTemp = head;
        Node newHead = new Node(oldTemp.val);

        Node newTemp = newHead;

        HashMap<Node,Node> map = new HashMap<>();
        map.put(oldTemp,newTemp);

        oldTemp = oldTemp.next;

        while(oldTemp != null){
            Node copynode = new Node(oldTemp.val);
            map.put(oldTemp,copynode);
            newTemp.next = copynode;
            oldTemp = oldTemp.next;
            newTemp = newTemp.next;
        }
        oldTemp = head;
        newTemp = newHead;

        while(oldTemp != null){
            newTemp.random = map.get(oldTemp.random);
            newTemp = newTemp.next;
            oldTemp = oldTemp.next;
        }
        return newHead;
    }
}
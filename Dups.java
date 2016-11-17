public class Dups {
    public static void main(String[] args) {
        Node n = new Node();        
        Node head = n.list(new int[] {5,3,8,5,7,9,7,5,8,3,5,2});
        System.out.println(head);
        removeDups(head);
        System.out.println(head);
        
        head = n.list(new int[] {8});
        System.out.println(head);
        removeDups(head);
        System.out.println(head);
        
        head = n.list(new int[] {5,5,5,5,5,5,5,5,5,5,5,5});
        System.out.println(head);
        removeDups(head);
        System.out.println(head);
    }
    public static void removeDups(Node head) {
        if (head == null)
            return;
        Node current = head;
        Node previous = current;
        Node runner = previous.next;  
        while (current != null) {
            if (runner == null) {                
                current = current.next;  
                if (current != null) {
                    previous = current;
                    runner = previous.next;
                }
            } else if (runner.value == current.value) {
                previous.next = runner.next;
                runner = runner.next;
            } else {
                previous = previous.next;
                runner = runner.next;
            }
        }
        
    }
}
class Node {
        public int value;
        public Node next;
        
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
        public Node() {
        }
        
        @Override
        public String toString() {
            if (this == null)
                return "";
            else if (next == null)
                return "" + value;
            String str = "" + value;
            return str + ", " + next.toString();
        }
        
        public Node list(int[] arr) {
            Node head = new Node(arr[0]);
            Node list = head;
            for(int i = 1; i < arr.length; i++) {
                list.next = new Node(arr[i]);                
                list = list.next;
            }
            return head;
        }
    }
class LinkedList {
    
    Node list = new Node();
    
    public Node build() {
        list = list.list(new int[] {5,3,8,5,7,9,7,5,8,3,5});
        return list;
    }
    
}
public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    /*  Insert into a linked list:
    * - If link list doesn't.
    * - Inserting at the beginning.
    * - Inserting at the ending
    * - Insert anywhere.    */

    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        if (head == null) {
            createLinkedList(nodeValue);
            return;
        } else if (location == 0) {

            node.next = head;
            head = node;

        } else if(location >= size) {
            tail.next = node;
            node.next = null;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while(index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    //Traverse a Linked List
    public void traverseLinkedList(){
        if (head == null) {
            System.out.println("Linked list does not exist");
            return;
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }

        }
            System.out.print("\n");

    }


    /* Search for a Node */

    public boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Node found at location " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found! \n");
        return false;
    }

    /* Deleting a Node from an SLL (Single Linked List)
    *  Deleting at the beginning
    *  Deleting  at the ending
    *  Deleting anywhere on the list. */
}

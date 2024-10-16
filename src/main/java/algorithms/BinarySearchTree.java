package algorithms;

public class BinarySearchTree {
    class Node {
        int key;
        String value;
        Node left, right;

        Node(int key, String value) {
            this.key = key;
            this.value = value;
            left = right = null;
        }

        public Node min() {
            if(left == null) return this;
            return left.min();
        }
    }

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int key, String value) {
        root = insertItem(root, key, value);
    }

    private Node insertItem(Node node, int key, String value) {
        // 왼쪽 노드는 key 미만 값, 오른쪽 노드는 key 초과 값
        if (node == null) {
            node = new Node(key, value);
            return node;
        }
        else if (key < node.key) {
            node.left = insertItem(node.left, key, value);
        }
        else if (key > node.key) {
            node.right = insertItem(node.right, key, value);
        }
        return node; // 키가 이미 있다면 node 반환
    }

    public String get(int key) {
        Node node = getItem(root, key);
        if (node == null) return null;
        return node.value;
    }

    private Node getItem(Node node, int key) {
        if (node == null) {
            return null;
        }
        if(node.key == key) {
            return node;
        }
        else if (key < node.key) {
            return getItem(node.left, key);
        }
        else if (key > node.key) {
            return getItem(node.right, key);
        }
        return null;
    }

    public void delete(int key) {
        root = deleteItem(root, key);
    }

    private Node deleteItem(Node node, int key) {
        if (node == null) return null;
        else if (key < node.key) {
            node.left = deleteItem(node.left, key);
        } else if (key > node.key) {
            node.right = deleteItem(node.right, key);
        }

        // 제거할 키를 찾은 경우
        else {
            if (node.left == null && node.right == null) {
                node = null;
            } else if (node.left == null) {
                node = node.right;
            } else if (node.right == null) {
                node = node.left;
            } else {
                Node minRight = node.right.min();

                node.key = minRight.key;
                node.value = minRight.value;

                node.right = deleteItem(node.right, node.key);
            }
        }
        return node;
    }

    public void prettyPrint() {
        // Hard coded print out of binary tree depth = 3

        int rootLeftKey = root.left == null ? 0 : root.left.key;
        int rootRightKey = root.right == null ? 0 : root.right.key;

        int rootLeftLeftKey = 0;
        int rootLeftRightKey = 0;

        if (root.left != null) {
            rootLeftLeftKey = root.left.left == null ? 0 : root.left.left.key;
            rootLeftRightKey = root.left.right == null ? 0 : root.left.right.key;
        }

        int rootRightLeftKey = 0;
        int rootRightRightKey = 0;

        if (root.right != null) {
            rootRightLeftKey = root.right.left == null ? 0 : root.right.left.key;
            rootRightRightKey = root.right.right == null ? 0 : root.right.right.key;
        }

        System.out.println("     " + root.key);
        System.out.println("   /  \\");
        System.out.println("  " + rootLeftKey + "    " + rootRightKey);
        System.out.println(" / \\  / \\");
        System.out.println(rootLeftLeftKey + "  " + rootLeftRightKey + " " + rootRightLeftKey + "   " + rootRightRightKey);
    }

}

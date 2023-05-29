package binarysearchtreestuderende;

/**
 * This class implements a binary search tree whose nodes hold objects that
 * implement the Comparable interface.
 */
public class BinarySearchTree<E extends Comparable<E>> {
    private Node root;

    /**
     * Constructs an empty tree.
     */
    public BinarySearchTree() {
        root = null;
    }

    /**
     * Inserts a new node into the tree.
     *
     * @param obj the object to insert
     */
    public void add(E obj) {
        Node newNode = new Node();
        newNode.data = obj;
        newNode.left = null;
        newNode.right = null;
        if (root == null) {
            root = newNode;
        } else {
            root.addNode(newNode);
        }
    }

    /**
     * Tries to find an object in the tree.
     *
     * @param obj the object to find
     * @return true if the object is contained in the tree
     */
    public boolean find(E obj) {
        Node current = root;
        boolean found = false;
        while (!found && current != null) {
            int d = current.data.compareTo(obj);
            if (d == 0) {
                found = true;
            } else if (d > 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return found;
    }

    /**
     * Tries to remove an object from the tree. Does nothing if the object is
     * not contained in the tree.
     *
     * @param obj the object to remove
     */
    public void remove(E obj) {
        // Find node to be removed

        Node toBeRemoved = root;
        Node parent = null;
        boolean found = false;
        while (!found && toBeRemoved != null) {
            int d = toBeRemoved.data.compareTo(obj);
            if (d == 0) {
                found = true;
            } else {
                parent = toBeRemoved;
                if (d > 0) {
                    toBeRemoved = toBeRemoved.left;
                } else {
                    toBeRemoved = toBeRemoved.right;
                }
            }
        }

        if (found) {

            // toBeRemoved contains obj

            // If one of the children is empty, use the other

            if (toBeRemoved.left == null || toBeRemoved.right == null) {
                Node newChild;
                if (toBeRemoved.left == null) {
                    newChild = toBeRemoved.right;
                } else {
                    newChild = toBeRemoved.left;
                }

                if (parent == null) // Found in root
                {
                    root = newChild;
                } else if (parent.left == toBeRemoved) {
                    parent.left = newChild;
                } else {
                    parent.right = newChild;
                }

            } else {

                // Neither subtree is empty

                // Find smallest element of the right subtree

                Node smallestParent = toBeRemoved;
                Node smallest = toBeRemoved.right;
                while (smallest.left != null) {
                    smallestParent = smallest;
                    smallest = smallest.left;
                }

                // smallest contains smallest child in right subtree

                // Move contents, unlink child

                toBeRemoved.data = smallest.data;
                if (smallestParent == toBeRemoved) {
                    smallestParent.right = smallest.right;
                } else {
                    smallestParent.left = smallest.right;
                }
            }
        }
    }

    /**
     * Prints the contents of the tree in sorted order.
     */
    public void print() {
        print(root);
        System.out.println();
    }

    /**
     * Prints a node and all of its descendants in sorted order.
     *
     * @param parent the root of the subtree to print
     */
    private void print(Node parent) {
        if (parent != null) {
            print(parent.left);
            System.out.print(parent.data + " ");
            print(parent.right);
        }
    }

    public E findMax() {
        Node node = root;

        while (node.right != null) {
            node = node.right;
        }
        return node.data;
    }

    public E findMin() {
        Node node = root;

        while (node.left != null) {
            node = node.left;
        }
        return node.data;
    }

    public E removeMin() {
        Node parent = root;
        Node node = parent.left;
        Node removed = null;
        boolean found = false;

        while (!found) {
            //root er den sidste node
            if (parent.left == null && parent.right == null) {
                removed = root;
                root = null;
                found = true;
            }

            //højre side
            else if (root.left == null) {
                // bestemmer om node skal være parent.left eller parent.right
                if (parent.left == null) {
                    node = parent.right;
                } else {
                    node = parent.left;
                }

                //tjekker om vi er nederst til venstre
                if (node.left == null) {
                    //if nederst til venstre har en højre,
                    //replaces denne med den nederst til venstre
                    if (node.right != null) {
                        removed = node;
                        parent.right = node.right;
                        found = true;
                    } else {
                        //else remover vi den nederst til venstre
                        removed = node;
                        //alt efter om vi er gået til venstre eller til højre,
                        //så opdateres pointers her
                        if (parent.left == node) {
                            parent.left = null;
                        } else {
                            parent.right = null;
                        }
                        //stopper loop
                        found = true;
                    }
                    //rykker en tak ned
                } else {
                    parent = node;
                    node = parent.right;
                }
            }

            //venstre side
            //hvis vi er nederst til venstre
            else if (node.left == null) {
                //if node.right ikke er null,
                //replaces denne med node
                if (node.right != null) {
                    removed = node;
                    parent.left = node.right;
                    found = true;
                } else {
                    //else fjernes noden og referencen helt
                    removed = node;
                    parent.left = null;
                    found = true;
                }
            } else {
                //rykkes en tak ned
                parent = node;
                node = parent.left;
            }
        }
        return removed.data;
    }

    /*
    public E removeMin() {
    if (root == null) {
        return null; // Håndterer tom liste
    }

    // Hvis roden er den minimale værdi
    if (root.left == null) {
        E removedData = root.data;
        root = root.right; // Opdaterer roden til højre barn
        return removedData;
    }

    Node parent = root;
    Node node = parent.left;

    // Finder den minimale værdi i træet (længst til venstre)
    while (node.left != null) {
        parent = node;
        node = node.left;
    }

    // Gemmer den minimale værdi
    E removedData = node.data;

    // Hvis den minimale værdi er på venstre side
    if (node == parent.left) {
        parent.left = node.right; // Fjerner noden ved at sætte parent.left til højre barn
    } else {
        parent.right = node.right; // Fjerner noden ved at sætte parent.right til højre barn
    }

    return removedData;
    }
     */

    public E removeMax() {
        Node parent = root;
        Node node = parent.right;
        Node removed = null;
        boolean found = false;

        while (!found) {
            // Hvis roden er den sidste node
            if (parent.left == null && parent.right == null) {
                removed = root;
                root = null;
                found = true;
            }

            // Venstre side
            else if (root.right == null) {
                // Bestemmer om noden skal være parent.left eller parent.right
                if (parent.right == null) {
                    node = parent.left;
                } else {
                    node = parent.right;
                }

                // Tjekker om vi er nederst til højre
                if (node.right == null) {
                    // Hvis nederst til højre har en venstre node,
                    // erstatter vi den med noden nederst til højre
                    if (node.left != null) {
                        removed = node;
                        //bestemmer hvilken side af parent som skal fjernes
                        if (parent.left == node) {
                            parent.left = node.left;
                        } else {
                            parent.right = node.left;
                        }
                        found = true;
                    } else {
                        // Ellers fjerner vi noden nederst til højre
                        removed = node;
                        //bestemmer hvilke side af parent som skal fjernes
                        if (parent.left == node) {
                            parent.left = null;
                        } else {
                            parent.right = null;
                        }
                        found = true;
                    }
                }
                // Gå et niveau ned
                else {
                    parent = node;
                    node = parent.right;
                }
            }

            // Højre side
            // Hvis vi er nederst til højre
            else if (node.right == null) {
                // Hvis node.left ikke er null,
                // erstatter vi den med node
                if (node.left != null) {
                    removed = node;
                    parent.right = node.left;
                    found = true;
                } else {
                    // Ellers fjerner vi noden og dens reference helt
                    removed = node;
                    parent.right = null;
                    found = true;
                }
            } else {
                // Gå et niveau ned
                parent = node;
                node = parent.right;
            }
        }
        return removed.data;
    }

    /*
    {
    if (root == null) {
        return null; // Håndterer tom liste
    }

    // Hvis roden er den maksimale værdi
    if (root.right == null) {
        E removedData = root.data;
        root = root.left; // Opdaterer roden til venstre barn
        return removedData;
    }

    Node parent = root;
    Node node = parent.right;

    // Finder den maksimale værdi i træet (længst til højre)
    while (node.right != null) {
        parent = node;
        node = node.right;
    }

    // Gemmer den maksimale værdi
    E removedData = node.data;

    // Hvis den maksimale værdi er på højre side
    if (node == parent.right) {
        parent.right = node.left; // Fjerner noden ved at sætte parent.right til venstre barn
    } else {
        parent.left = node.left; // Fjerner noden ved at sætte parent.left til venstre barn
    }

    return removedData;
}
     */


    /**
     * A node of a tree stores a data item and references to the left and right
     * child nodes.
     */
    private class Node {
        private E data;
        private Node left;
        private Node right;

        /**
         * Inserts a new node as a descendant of this node.
         *
         * @param newNode the node to insert
         */
        private void addNode(Node newNode) {
            int comp = newNode.data.compareTo(data);
            if (comp < 0) {
                if (left == null) {
                    left = newNode;
                } else {
                    left.addNode(newNode);
                }
            } else if (comp > 0) {
                if (right == null) {
                    right = newNode;
                } else {
                    right.addNode(newNode);
                }
            }
        }
    }
}

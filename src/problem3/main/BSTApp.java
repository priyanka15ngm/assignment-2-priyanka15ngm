/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student
public class BSTApp {
  public static void main(String args[]) {
    BST a = new BST();
    Node root = null;
    
    root = a.insert(root, 8);
    root = a.insert(root, 3);
    root = a.insert(root, 6);
    root = a.insert(root, 10);
    root = a.insert(root, 4);
    root = a.insert(root, 7);
    root = a.insert(root, 1);
    root = a.insert(root, 14);
    root = a.insert(root, 13);

    System.out.print("left Nodes are : ");
    a.printLeftNode(root);

	System.out.println("number of nodes which does not have left child : ");
	System.out.print(a.getNoOfNodes(root));
}
 }

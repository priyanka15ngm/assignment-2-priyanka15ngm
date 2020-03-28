/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

public class MyMain {
    public static void main(String args[]) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(8);
        obj.insert(3);
        obj.insert(6);
        obj.insert(10);
        obj.insert(4);
        obj.insert(5);
        obj.insert(7);
        obj.insert(1);
        obj.insert(14);
        System.out.print("left nodes are: ");
        obj.printLeftNode(obj.root);
        System.out.println();
        System.out.println("No of nodes that dosn't have a left child node are: "+ obj.getCount());
    }
}

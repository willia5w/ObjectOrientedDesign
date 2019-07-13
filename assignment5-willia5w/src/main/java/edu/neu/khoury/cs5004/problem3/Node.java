package edu.neu.khoury.cs5004.problem3;

/**
 * This class represents a Node in an IBT.
 */
public class Node {
  private Integer value;
  private Node left;
  private Node right;

  /**
   * Creates a Node given it's value, left pointer, and right pointer.
   *
   * @param value Node's value
   */
  public Node(Integer value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }

  /**
   * Get the Node's value.
   * @return the Node's value
   */
  public Integer getValue() {
    return this.value;
  }

  /**
   * Get the Node's left.
   * @return Get the Node's value
   */
  public Node getLeft() {
    return this.left;
  }

  /**
   * Get the Node's right.
   * @return the Node's right
   */
  public Node getRight() {
    return this.right;
  }

  /**
   * @param left
   */
  public void setLeft(Node left) {
    this.left = left;
  }

  /**
   * @param right
   */
  public void setRight(Node right) {
    this.right = right;
  }
}




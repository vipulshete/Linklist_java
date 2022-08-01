package com.bridgelab.linklist;

public class SimpleLinkList<D> {


	public Nodes<D> headNode = null;
	
	public Nodes<D> tailNode = null;
	
	public Nodes<D> tempNode = null;
	
	void add(Nodes<D> newNode) {
		if(headNode == null && 
		   tailNode == null && 
		   tempNode == null) { // will be true when first call add method
			
			headNode = newNode;
			tailNode = newNode;
			tempNode = newNode;
		} else {
			tempNode.setNextNode(newNode);
			tailNode = newNode;
			tailNode.setNextNode(null);
			tempNode = newNode;
		}
		
		System.out.println("headNode data = " + headNode.getData());
		System.out.println("tailNode data = " + tailNode.getData());
	}
}

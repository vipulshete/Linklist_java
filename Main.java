package com.bridgelab.linklist;


public class Main {

	public static void main(String[] args) {
		Nodes<Integer> firstNode = new Nodes<>(56);
		
		Nodes<Integer> secondNode = new Nodes<>(30);
		
		Nodes<Integer> thirdNode = new Nodes<>(70);
		
		SimpleLinkList<Integer> simpleLinkedList = new SimpleLinkList<>();
		
		simpleLinkedList.add(firstNode);
		simpleLinkedList.add(secondNode);
		simpleLinkedList.add(thirdNode);

	}

}

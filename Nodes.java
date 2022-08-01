package com.bridgelab.linklist;

public class Nodes<D> {

		private D data;
	
	private Nodes<D> nextNode;
	
	public Nodes(D data) {
		this.data = data;
		System.out.println("NODE-" + data);
	}
	
	public void setNextNode(Nodes<D> nextNode) {
		this.nextNode = nextNode;
	}

	public D getData() {
		return data;
	}

	public void setData(D data) {
		this.data = data;
	}

	public Nodes<D> getNextNode() {
		return nextNode;
	}
}

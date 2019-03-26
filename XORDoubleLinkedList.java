
public class XORDoubleLinkedList<T> {

	  //variables
	private XORDLNode<T> Head, Current, Previous;

	  //constructors
	public XORDoubleLinkedList() {}
	public XORDoubleLinkedList(XORDLNode<T> Head) {}
	public XORDoubleLinkedList(XORDoubleLinkedList<T> X) {}

	  //edit
	public void add() {}
	public void remove() {}

	  //traversal
	public XORDLNode<T> Current() {}
	public XORDLNode<T> Next() {}
	public XORDLNode<T> Previous() {}

	  //etc
	public boolean contains() {}
	public boolean equals(XORDoubleLinkedList<S> X) {}
	public String toString() {}

	public class XORDLNode<T> {
		
		  //variables
		T Data;
		XORDLNode<T> Link;

		  //constructors
		public XORDLNode() {}
		public XORDLNode(T X) {}
		public XORDLNode(XORDLNode X) {}

		  //get
		public T Data() {}
		public XORDLNode<T> Link() {}

		  //set
		public void Data(T X) {}
		public void Link(XORDLNode<T> X) {}

		  //etc
		public boolean contains(T X) {}
		public boolean equals(XORDLNode<U> X) {}
		public String toString() {}
	}	
}


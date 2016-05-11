#include "Node.cpp"
#include <iostream>
using namespace std;

class Stack{
private:
	Node * head;
	int numNodes; 

public:
	Stack() {
		head = new Node();
		head->next = NULL;
		numNodes = 0;
	}

	void PushNode(int data) {
		Node * currNode = new Node();
		currNode = head; 

		// The last node in the list points to NULL
		Node * node = new Node(data);
		while(currNode->next != NULL)
		{
			currNode = currNode->next;
		}
		currNode->next = node;
		cout << "Element " << currNode->data << " is pushed into stack" << endl;
		numNodes++;
	}

	int PopNode() {
		Node * currNode = new Node();
		currNode = head;

		if(currNode->next == NULL) {
			cout<< "Stack is empty!!" << endl;
		} else {
			for(int i = 0;i < numNodes - 1; i++)
				currNode = currNode->next;
		}
		
		cout << "Pop out element " << currNode->data << endl;
		currNode->next = NULL;
		numNodes--;
		return currNode->data;
	}

	int GetStackSize() {
		return numNodes; 
	}

	int DisplayStack() {
		cout<< "number of elements: " << numNodes << endl; 
		Node * currNode = new Node();
		currNode = head;
		
		while(currNode->next != NULL)
		{
			cout<< "[" << currNode->data << "]";
			currNode = currNode->next;
		}
		cout<< endl;
	}
};

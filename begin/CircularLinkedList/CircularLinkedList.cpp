#include "Node.cpp"
#include <iostream>
using namespace std;

class CircularLinkedList{
public:
	Node * head;
	Node * tail;
	int numNodes;

public: 
	CircularLinkedList() {
		head = new Node();
		tail = new Node();
		
		head->next = NULL;
		tail->next = NULL;
	}

	void AddAtTheStart(int data) {
		cout << "Adding Node " << data << " at the start" << endl;	
		Node * node = new Node(data);
		Node * endNode = new Node();
		endNode = tail->next; 

		if (numNodes == 0) {
			head->next = node;		
			tail->next = node;
			node->next = node;
		} else {
			node->next = head->next;
			head->next = node;
			endNode->next = node;
		}
		numNodes++;
	}

	void AddAtTheEnd(int data) {
		cout << "Adding Node " << data << " at the end" << endl;
		Node * node = new Node(data);
		Node * endNode = new Node();
		endNode = tail->next;

		if (numNodes == 0) {
			head->next = node;
			tail->next = node;
			node->next = node;
		} else {
			endNode->next = node;
			node->next = head->next;
			tail->next = node;
			
		}
		numNodes++;
	}

	void DeleteAtTheStart() {
		if (numNodes == 0) {
			cout << "Circular LinkedList is empty!!" << endl;
		} else {
			Node * deleteNode = new Node();
			Node * endNode = new Node();
			deleteNode = head->next;
			endNode = tail->next;

			cout << "Deleting Node " << deleteNode->data << " at the start"<< endl;

			head->next = deleteNode->next;
			endNode->next = head->next;
			delete(deleteNode);
			numNodes--;
		}
	}

	int GetSize() {
		return numNodes;
	}

	int GetElementAtIndex(int idx) {
		Node* currNode = new Node();

		if (numNodes == 0) {
			cout << "Circular LinkedList is empty!!" << endl;
		} else {
			currNode = head->next;
			for(int i = 0;i < idx; i++) {
				currNode = currNode->next;
			}
		}
		return currNode->data;
	}

	void PrintElements() {
		if(numNodes != 0){
			Node * currNode = head->next;

//			while(currNode->next != NULL) {
			for (int i = 0;i < numNodes; i++) {
				cout << "[" << currNode->data << "]";
				currNode = currNode->next;
			} cout << endl;
		}
	}

};

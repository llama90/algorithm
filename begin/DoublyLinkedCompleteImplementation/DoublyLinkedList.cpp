#include "Node.cpp"
#include <iostream>
using namespace std;

class DoublyLinkedList{
public:
	Node * head;
	Node * tail;
	int numNodes;

public:
	DoublyLinkedList() {
		head = new Node();
		head->prev = NULL;
		head->next = NULL;

		tail = new Node();
		tail->prev = NULL;
		tail->next = NULL;
		
		numNodes = 0;

		head->next = tail;
		tail->prev = head;
	}

	void AddAtTheStart(int data) {
		cout << "Adding Node " << data << " at the start"<<endl;
		Node * prevNode = new Node();
		Node * nextNode = new Node();
		prevNode = head;
		nextNode = head->next;
		
		Node * node = new Node(data);

		node->prev = prevNode;
		prevNode->next = node;

		node->next = nextNode;
		nextNode->prev = node;
		numNodes++;
	}

	void AddAtTheEnd(int data) {
		cout << "Adding Node " << data << " at the end" << endl;
		Node * prevNode = new Node();
		Node * nextNode = new Node();
		prevNode = tail->prev;
		nextNode = tail;

		Node * node = new Node(data);

		prevNode->next = node;
		node->prev = prevNode;

		nextNode->prev = node;
		node->next = nextNode;
		numNodes++;
	}

	void DeleteAtTheStart() {
		if (numNodes == 0){
			cout << "Doubly LinkedList is empty!!" <<endl;
		} else {	
			Node * prevNode = new Node();
			Node * currNode = new Node();
			Node * nextNode = new Node();
			prevNode = head;
			currNode = head->next;
			nextNode = currNode->next; 
		
			cout << "Deleting Node " << currNode->data << " at the start"<< endl;	

			prevNode->next = nextNode;
			nextNode->prev = prevNode;
			delete(currNode);
			numNodes--;
		}
	}

	void DeleteAtTheEnd() {
		if (numNodes == 0) {
			cout << "Doubly LinkedList is empty!!" <<endl;
		} else {
			Node * prevNode = new Node();
			Node * currNode = new Node();
			Node * nextNode = new Node();
			nextNode = tail;
			currNode = tail->prev;
			prevNode = currNode->prev;

			cout << "Deleting Node " << currNode->data << " at the end"<< endl;	

			nextNode->prev = prevNode;
			prevNode->next = nextNode;
			delete(currNode);
			numNodes--;
		}
	}

	int GetSize() {
		return numNodes;
	}

	int GetElementAtIndex(int idx) {
		Node* currNode = new Node();
		if (numNodes == 0) {
			cout << "Doubly LinkedList is empty!!" <<endl;
		} else {
			currNode = head->next;
			for(int i = 0;i < idx; i++) {	
				currNode = currNode->next;
			}
		}
		return currNode->data;
	}

	void PrintElements() {
		if (numNodes != 0){
			Node* currNode = head->next;

			while(currNode->next != NULL) {
				cout << "[" << currNode->data << "]";
				currNode = currNode->next;
			}
			cout<< endl;
		}
	}
};

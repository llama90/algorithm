#include <iostream>

class Node{
public:
	int data;
	Node * next;
	Node * prev;

public:
	// Constructor 
	Node() { }
	Node(int data) {
		this->data = data;
		this->next = NULL;
		this->prev = NULL;
	}
};

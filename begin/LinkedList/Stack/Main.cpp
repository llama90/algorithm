#include <iostream>
#include "Stack.cpp"
using namespace std;

int main(){
	cout << "Implement Stack Using Linked List" << endl;

	Stack * stack = new Stack();
	stack->PushNode(0);
	stack->DisplayStack();
	stack->PushNode(3);
	stack->DisplayStack();
	stack->PushNode(2);
	stack->DisplayStack();
	stack->PushNode(1);
	stack->DisplayStack();
	stack->PushNode(0);
	stack->DisplayStack();
	stack->PopNode();
	stack->DisplayStack();
	stack->PopNode();
	stack->DisplayStack();
	stack->PopNode();
	stack->DisplayStack();
	stack->PopNode();
	stack->DisplayStack();
	stack->PopNode();
	stack->DisplayStack();

	return 0;
}

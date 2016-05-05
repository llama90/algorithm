#include "SumLeftLeaves.cpp"
#include <iostream>

using namespace std;

int main (){
	
	SumLeftLeaves * sll = new SumLeftLeaves();

	Node * root = new Node(10);
	root->left = new Node(5);
	root->right = new Node(15);
	
	root->left->left = new Node(10);
	root->left->right = new Node(12);

	root->left->right->left = new Node(6);

	root->right->right = new Node(8);
	root->right->right->left = new Node(5);

	sll->AddLeftLeave(root, root);
	sll->PrintTotal();
	

	return 0;
}

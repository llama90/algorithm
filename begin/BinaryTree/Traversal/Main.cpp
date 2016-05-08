#include "Traversal.cpp"

#include <iostream>
using namespace std;

int main() {
	
/*	Node * iroot = new Node(1);
	iroot->left = new Node(2);
	iroot->right = new Node(3);
	iroot->left->left = new Node(4);
	iroot->left->right = new Node(5);

	Traversal * ti = new Traversal();
	ti->TravelInorder(iroot);
*/


/*	Node * proot = new Node(1);
	proot->left = new Node(2);
	proot->right = new Node(3);
	proot->left->left = new Node(4);
	proot->left->right = new Node(5);
	proot->right->left = new Node(6);
	proot->right->right= new Node(7);

	Traversal * pi = new Traversal();
	pi->TravelPreorder(proot);
*/

	Node * proot = new Node(1);
	proot->left = new Node(2);
	proot->right = new Node(3);
	proot->left->left = new Node(4);
	proot->left->right = new Node(5);
	proot->right->left = new Node(6);
	proot->right->right= new Node(7);

	Traversal * pi = new Traversal();
	// pi->TravelPostorder(proot);
	// pi->DeleteAllNode(proot);

	cout << "Does 4 exist in the tree: " << pi->IsPresent(proot, 4) << endl;
	cout << "Does 9 exist in the tree: " << pi->IsPresent(proot, 9) << endl;

	return 0;
}

	

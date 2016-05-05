#include "Node.cpp"
#include <iostream>

using namespace std;

class SumLeftLeaves{
	int totalSum;

public:
	SumLeftLeaves() { totalSum = 0; }
	
	void AddLeftLeave(Node * curr, Node * parent) {
		if ( curr != NULL )
		{
			cout << "curr[" << curr->data << "]\tparent[" << parent->data << "]" << endl;
			AddLeftLeave(curr->left, curr);

			if (curr->left == NULL && curr->right == NULL && parent->left == curr)
				totalSum += curr->data;

			AddLeftLeave(curr->right, curr);
		}
	}

	void PrintTotal() {
		cout << "Sum of left leaves : " << totalSum << endl;
	}
};

#include <iostream>
#include <stack>
#include "Node.cpp"

using namespace std;
class Traversal {
public:

	Traversal() { }

	void TravelPreorder(Node * root)
	{
		stack<Node *> st;
		while(true) {
			while(root != NULL) 
			{
				cout << "[" << root->data << "]";
				st.push(root);
				root = root->left;
			}

			if (st.size() == 0) {
				return;
			}

			root = st.top();
			st.pop();
			root = root->right;
		} cout << endl;
	}

	void TravelInorder(Node * root)
	{
		/* 1. create stack 
		   2. push the root into the stack and set the root = root->left 
			  continue till it hits the NULL 
		   3. if root is null and stack is empty then return, we are done 
		   4. else 
			  a) pop the top node from the stack and set it as, root = popped node
			  b) print the root node and go right, root = roog->right
			  c) go to step 2 
		   5. End if */
		stack<Node *> st;

		while(true) {
			while(root != NULL) { 
				st.push(root);
				root = root->left;
			}
	
			if (st.size() == 0) {
				return;
			}

			root = st.top();
			st.pop();
			cout << "[" << root->data << "]";
			root = root->right;

		} cout << endl;
	}

	void TravelPostorder(Node * root)
	{
			
	}

};

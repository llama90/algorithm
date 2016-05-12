#include <iostream>
#include <stack>
#include <queue>
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
		stack<Node *> st_one;
		stack<Node *> st_two;

		/* 1. push root into stack_one */
		st_one.push(root);

		/* 2. while (stack_one is not empty) */
		while(st_one.size() != 0) {
			/* 3. a) pop the node from stack_one
				  b) push popped node into stack_two */
			st_two.push(st_one.top());
			st_one.pop();
				
			/* 4. push the left and right child nodes of popped node into stack_one */
			if (st_two.top()->left != NULL) st_one.push(st_two.top()->left);
			if (st_two.top()->right != NULL) st_one.push(st_two.top()->right);
		}
		
		/* 5. pop out all the nodes from stack_two and print it */
		int stackSize = st_two.size();
		for(int i = 0;i < stackSize; i++) {
			cout << "[" << st_two.top() << "]";
			st_two.pop();
		} cout << endl;
	}

	void DeleteAllNode(Node * root)
	{		
		stack<Node *> st_one;
		stack<Node *> st_two;

		/* 1. push root into stack_one */
		st_one.push(root);

		/* 2. while (stack_one is not empty) */
		while(st_one.size() != 0) {
			/* 3. a) pop the node from stack_one
				  b) push popped node into stack_two */
			st_two.push(st_one.top());
			st_one.pop();
			
			/* 4. push the left and right child nodes of popped node into stack_one */
			if (st_two.top()->left != NULL) st_one.push(st_two.top()->left);
			if (st_two.top()->right != NULL) st_one.push(st_two.top()->right);
		}
		
		/* 5. pop out all the nodes from stack_two and print it */
		int stackSize = st_two.size();
		for(int i = 0;i < stackSize; i++) {
			Node * node = st_two.top();
			st_two.pop();
			cout << "Deleting Node address" << node << endl;
			delete(node);
		} cout << endl;
	}

	bool IsPresent(Node * root, int element)
	{
		queue<Node *> q;
		Node * curr; 
		/* 1. add root to queue */
		q.push(root);

		while(q.size() != 0){
			/* 2. check if current node has the element return true 
						else add children nodes of current node to queue */
			if(q.front()->data == element) {
				return true;
			} else { 
				curr = q.front();
				q.pop();
				
				if (curr->left != NULL) q.push(curr->left);
				if (curr->right != NULL) q.push(curr->right);
			}
		}
		/* 3. if queue is empty, means element is not in the tree */
		return false;
	}

	int GetSize(Node * root) 
	{
		int size = 0;
		queue<Node *> q;
		Node * curr;
		q.push(root);

		while(q.size() != 0){
			curr = q.front();
			q.pop();
			size++;
			if (curr->left != NULL) q.push(curr->left);		
			if (curr->right != NULL) q.push(curr->right);
		}
		return size;	
	}

	void BFS(Node * root)
	{
		queue<Node *> q;
		Node * curr;
		
		if(root != NULL)
			q.push(root);
		else 
			return;

		cout << "BFS Traversal order: ";
		while(q.size() != 0){
			curr = q.front();
			q.pop();
			
			if(curr->left != NULL) q.push(curr->left);
			if(curr->right != NULL) q.push(curr->right);
			cout << "[" << curr->data << "]";
		} cout<< endl;
	}

	void FindNodeUsingBFS(Node * root, int n){	
		queue<Node *> q;
		Node * curr;
		int node = -1;

		if(root != NULL)
			q.push(root);
		else 
			return;

		cout << "BFS Search node: ";
		while(q.size() != 0){
			curr = q.front();
			q.pop();
			
			if(curr->left != NULL) q.push(curr->left);
			if(curr->right != NULL) q.push(curr->right);
			if(curr->data == n) {
				cout << "[" << curr->data << "]" << endl;
				node = n;
				break;
			}
		} 

		if(node == -1)
			cout << "node not found"<< endl;

	}
};

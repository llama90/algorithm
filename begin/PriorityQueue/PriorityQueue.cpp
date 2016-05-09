#include <iostream>
#include <queue>
using namespace std;

class PriorityQueue{
public:
	int FindTheKthElement(bool isMinHeap, int* arr, int arrSize, int k)
	{
		int n = -1;

		/* Use min-Heap */
		if(isMinHeap == true)
		{
			priority_queue<int, std::vector<int>, std::greater<int> > pqueue;
			
			/* Insert all the elements in the prioirty queue */
			for(int i = 0;i < arrSize; i++) {
				pqueue.push(arr[i]);
			} ;
		
			/* Extract K elements from the priority queue */
			while( k > 0 ){
				n = pqueue.top();
				pqueue.pop();
				k--;
			}
		/* use max-Heap */
		} else {
			priority_queue<int> pqueue;
		
			/* Insert all the elements in the prioirty queue */
			for(int i = 0;i < arrSize; i++) {
				pqueue.push(arr[i]);
			} 
		
			/* Extract K elements from the priority queue */
			while( k > 0 ){
				n = pqueue.top();
				pqueue.pop();
				k--;
			}
		}
		return n;
	}
};


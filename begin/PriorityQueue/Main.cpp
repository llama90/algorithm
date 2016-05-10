#include <iostream>
#include "PriorityQueue.cpp"
#include "BinaryHeap.cpp"
using namespace std;

int main() {
	
	PriorityQueue * pq = new PriorityQueue();

	int arr[] = {3, 2, 1, 7, 8, 4, 10, 16, 12 };
	int size = sizeof(arr) / sizeof(arr[0]);

	cout << "Elements : ";
	for (int i = 0;i < size; i++) {
		cout<< "[" << arr[i] << "]";
	} 
	cout << endl;

/*	int KthElement = pq->FindTheKthElement(true, arr, size, 4);
	cout << "4th smallest element: " << KthElement << endl; 
	
	KthElement = pq->FindTheKthElement(false, arr, size, 4);
	cout << "4th largest element: " << KthElement << endl; 
*/

	BinaryHeap * bh = new BinaryHeap(size);
	bh->CreateHeap(arr, size);
	bh->Display();

	cout << "Extract Min : ";
	for(int i = 0;i < size; i++) {
		cout << "[" << bh->ExtractMin() << "]";
	} 
	cout << endl;

	return 0;
}

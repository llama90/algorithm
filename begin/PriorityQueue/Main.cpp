#include <iostream>
#include "PriorityQueue.cpp"
using namespace std;

int main() {
	
	PriorityQueue * pq = new PriorityQueue();

	int arr[] = {1, 2, 10, 20, 40, 32, 44, 51, 6 };
	int size = sizeof(arr) / sizeof(arr[0]);

	cout << "Elements : ";
	for (int i = 0;i < size; i++) {
		cout<< "[" << arr[i] << "]";
	} 
	cout << endl;

	int KthElement = pq->FindTheKthElement(true, arr, size, 4);
	cout << "4th smallest element: " << KthElement << endl; 
	
	KthElement = pq->FindTheKthElement(false, arr, size, 4);
	cout << "4th largest element: " << KthElement << endl; 
	
	return 0;
}

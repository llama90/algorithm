#include <iostream>
using namespace std;

class BinaryHeap{
private:
	int size;
	int position;
	int * heap;

public:
	BinaryHeap(int size) {
		this->heap = new int[size + 1];	// starting index is 1
		this->size = size;
		position = 0;
	}

	void CreateHeap(int * arr, int size) {
		if(size > 0) {
			for (int i = 0;i < size; i++) {
				Insert(arr[i]);
			}
		}
	}

	void Display() {
		cout<< "Elements : ";
		for(int i = 1;i <= size; i++) {
			cout << "[" << this->heap[i] << "]";
		}
		cout<< endl;
	}

	void Insert(int element) {
		if (position == 0) {
			heap[position + 1] = element;
			position = 2;
		} else {
			heap[position++] = element;	
			BubbleUp();
		}
	}

	void BubbleUp() {
		int pos = position - 1;
		while(pos > 0 && heap[pos/2] > heap[pos]) {
			int temp = heap[pos];
			heap[pos] = heap[pos/2];
			heap[pos/2] = temp;
			pos = pos/2;
		}
	}

	int ExtractMin() {
		int min = heap[1];
		heap[1] = heap[position-1];
		heap[position-1] = 0;
		position--;
		SinkDown(1);
		return min;
	}

	void SinkDown(int k) {
		int a = heap[k];
		int smallest = k;

		if(2 * k < position && heap[smallest] > heap[2*k]) {
			smallest = 2 * k;
		}

		if(2 * k + 1 < position && heap[smallest] > heap[2*k+1]) {
			smallest = 2 * k + 1;
		}

		if(smallest != k){
			Swap(&k, &smallest);
			SinkDown(smallest);
		}
	}

	void Swap(int * a, int * b)
	{
		int temp = heap[*a];
		heap[*a] = heap[*b];
		heap[*b] = temp;
	}

};

#include <iostream>
#include "KthElement.cpp"
using namespace std;

int main() {

	KthElement * kthElement = new KthElement();

	int arr[] = { 1, 2, 10, 20, 40, 32, 44, 51, 6 };
	int size = sizeof(arr) / sizeof(arr[0]);

	cout << "Second largest Element: " << kthElement->FindTheSecondLargestElement(arr, size) << endl;

	return 0;
}

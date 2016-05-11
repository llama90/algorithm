#include <iostream>
#include "DoublyLinkedList.cpp"

using namespace std;

int main() {
	DoublyLinkedList * dll = new DoublyLinkedList();
	dll->PrintElements();

	dll->AddAtTheStart(5);
	dll->PrintElements();
	
	dll->AddAtTheStart(1);
	dll->PrintElements();
	
	dll->DeleteAtTheStart();
	dll->PrintElements();
	
	dll->AddAtTheStart(0);
	dll->PrintElements();
	
	dll->AddAtTheStart(2);
	dll->PrintElements();
	
	dll->AddAtTheStart(3);
	dll->PrintElements();
	
	dll->AddAtTheStart(5);
	dll->PrintElements();
	
	dll->AddAtTheStart(6);
	dll->PrintElements();
	
	dll->AddAtTheEnd(8);
	dll->PrintElements();
	
	dll->AddAtTheEnd(9);
	dll->PrintElements();
	
	dll->AddAtTheEnd(10);
	dll->PrintElements();
	
	dll->DeleteAtTheEnd();
	dll->PrintElements();
	
	dll->AddAtTheEnd(12);
	dll->PrintElements();
	
	dll->DeleteAtTheEnd();
	dll->PrintElements();
	
	dll->AddAtTheEnd(13);
	dll->PrintElements();
	
	dll->AddAtTheEnd(14);
	dll->PrintElements();

	cout << "Linked List Size: " << dll->GetSize() << endl;

	for (int i = 0;i < dll->GetSize(); i++){
		cout << "[" << dll->GetElementAtIndex(i) << "]";	
	} cout << endl;
}

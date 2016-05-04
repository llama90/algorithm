#include "CircularLinkedList.cpp"
#include <iostream>

int main ()
{
	CircularLinkedList * cll = new CircularLinkedList();
	cll->AddAtTheStart(1);
	cll->AddAtTheStart(5);
	cll->AddAtTheStart(3);
	cll->AddAtTheStart(2);
	cll->AddAtTheStart(4);

	cll->AddAtTheEnd(6);
	cll->AddAtTheEnd(8);
	cll->AddAtTheEnd(9);
	cll->AddAtTheEnd(10);
	cll->AddAtTheEnd(7);

	cll->PrintElements();

	cll->DeleteAtTheStart();
	cll->DeleteAtTheStart();
	
	for(int i = 0;i < cll->GetSize(); i++){
		cout << "[" << cll->GetElementAtIndex(i) << "]";
	} cout << endl;

	return 0;
}

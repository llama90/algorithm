#include <iostream>

using namespace std;

class Fibonacci{
public: 
	int Recursive(int x){
		if (x == 0) { 
			return 0;
		} if (x == 1) {
			return 1;
		} else {
			int fibVal = Recursive(x - 1) + Recursive(x - 2);
			return fibVal;
		}
	}

	int DPBottomUp(int x){
		int * fibVal = new int[x + 1];
		fibVal[0] = 0;
		fibVal[1] = 1;

		for(int i = 2;i < x + 1; i++){
			fibVal[i] = fibVal[i - 1] + fibVal[i - 2];
		}

		return fibVal[x];
	}
};;

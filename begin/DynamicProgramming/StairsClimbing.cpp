#include <iostream>
using namespace std;

class StairsClimbing {
public:
	int ClimbStair(int n, int * dyn) {
		if(n < 1){
			return 0;
		} 
		if(dyn[n] > 0){
			return dyn[n];
		}

		dyn[n] = 1 + ClimbStair(n-1, dyn) + ClimbStair(n-2, dyn) + ClimbStair(n-3, dyn);
		return dyn[n];
	}
};

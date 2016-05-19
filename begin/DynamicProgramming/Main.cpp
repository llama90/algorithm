#include <iostream>
#include <chrono>
#include "Fibonacci.cpp"

using namespace std;
using namespace std::chrono;

int main(){
	Fibonacci * fib = new Fibonacci();
	int fibVal = 0;

	high_resolution_clock::time_point begin;
	high_resolution_clock::time_point end;
	
	begin = high_resolution_clock::now();
	fibVal = fib->Recursive(40);
  end = high_resolution_clock::now();
	auto duration = duration_cast<microseconds>( end - begin ).count();
		
  cout << "FibVal: " << fibVal << endl;	
	cout << "Fibonacci Recursive: " << duration << endl;

  begin = high_resolution_clock::now();
	fibVal = fib->DPBottomUp(40);
  end = high_resolution_clock::now();
	duration = duration_cast<microseconds>( end - begin ).count();
		
  cout << "FibVal: " << fibVal << endl;	
	cout << "Fibonacci DynamicProgramming: " << duration << endl;

	return 0;
}

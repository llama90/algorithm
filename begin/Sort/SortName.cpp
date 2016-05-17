#include <iostream>
#include <algorithm>
#include <string>
#include <vector>

using namespace std;

typedef pair<string, string> namePair;

class SortName{
public: 
	static bool SortPair(namePair const& a, namePair const& b){
		return a.second < b.second; 
	}
};

int main() {
	vector<namePair> names{
		{"Daenerys", "Targaryen" },
		{"Jon", "Snow"},
		{"Tyrion", "Lannister"},
		{"Joffrey", "Baratheon"}
	};

	typedef bool(*namePairCompFunc)(namePair const&, namePair const&);

	sort(begin(names), end(names), static_cast<namePairCompFunc>(&SortName::SortPair));

	for(auto& e : names){
		cout << e.first << " " << e.second << endl;
	}
}


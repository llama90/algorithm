class KthElement
{
public:
	int FindTheSecondLargestElement(int * arr, int size) {
		int lst = arr[0];	// largest
		int sst = -1;		// second largest 

		for (int i = 1;i < size; i++) {
			if(lst < arr[i]) {
				sst = lst;
				lst = arr[i];
			} else if(sst < arr[i]) {
				sst = arr[i];
			}
		}
		return sst;
	}
};

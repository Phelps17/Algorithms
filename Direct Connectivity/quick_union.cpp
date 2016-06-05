#include <iostream>
using namespace std;

class QuickUnionUF {
private:
	int id[10];

	int root(int i) {
		while(i != id[i]) {
			i = id[i];
		}

		return i;
	}

public:
	QuickUnionUF(int N) {
		for (int i = 0; i < 10; i++) {
			id[i] = i;
		}
	}

	bool connected(int p, int q) {
		return root(p) == root(q);
	}

	void quick_union(int p, int q) {
		int i = root(p);
		int j = root(q);
		id[i] = j;
	}
};

int main() {
	QuickUnionUF tester(10);



    return 0;
}
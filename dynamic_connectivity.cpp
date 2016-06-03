#include <iostream>
using namespace std;

void print_struct(int arg[], int length) {
    for (int n = 0; n < length; n++) {
        cout << arg[n] << " | ";
    }
    cout << endl;
}

bool connected(int arg[], int a, int b) {
	return (arg[a] == arg[b]);
}

void direct_union(int arg[], int length, int a, int b) {
	for (int n = 0; n < length; n++) {
        if (arg[n] == a) {
        	arg[n] = b;
        }
    }
}

int main ()
{
     int datastruct[10];

     for (int i = 0; i < 10; i++) {
     	datastruct[i] = i;
     }

     print_struct(datastruct, 10);
     cout << "1 and 2 connected? " << connected(datastruct, 1, 2) << endl;

     cout << "Connect 1 and 2..." << endl;
     direct_union(datastruct, 10, 1, 2);
     print_struct(datastruct, 10);
     cout << "1 and 2 connected? " << connected(datastruct, 1, 2) << endl;

     return 0;
}
#include <iostream>
#include <cstdlib>
#include <time.h>

using namespace std;

int main() {
  cout << "Hello World!\n";
  const int SIZE = 100;
  int* arr = new int[SIZE];
  unsigned int time_ui = (unsigned int)( time(NULL) );
  srand( time_ui );

  for (int i = 0; i < SIZE; i++) {
    int val = rand() % 1001;
    arr[i] = val;
    cout << arr[i] << " ";
  }

  int startIdx = 0;
  int endIdx = 0;
  bool present = false;
  for (int i = 0; i < SIZE - 1; i++) {
    if (i - startIdx > 4) {
      endIdx = i;
      present = true;
      break;
    }

    if (arr[i] > arr[i + 1]) {
      startIdx = i + 1;
    }
  }

  if (present) {
    cout << "Sorted subarray bounds:" << startIdx << " " << endIdx;
  } else {
    cout << "No sorted subarray :(";
  }

  cout << endl;
}
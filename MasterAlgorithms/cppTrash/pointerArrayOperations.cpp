#include <iostream>

#define SIZE 6

using namespace std;

int* reverse_array_intonew(int* source, int size) {
  int* reversed = new int[size];
  for (int i = 0; i < size; i++) {
    reversed[size - 1 - i] = source[i];
  }

  return reversed;
}

void shift_array_left(int* arr, int size, int shift_length) {
  for (int i = 0; i < shift_length; i++) {
    int temp = arr[0];
    for (int j = 0; j < size - 1; j++) {
      arr[j] = arr[j + 1];
    }
    arr[size - 1] = temp;
  }
}

void shift_array_right(int* arr, int size, int shift_length) {
  for (int i = 0; i < shift_length; i++) {
    int temp = arr[size - 1];
    for (int j = size - 1; j > 0; j--) {
      arr[j] = arr[j - 1];
    }
    arr[0] = temp;
  }
}

void reverse_existing(int* arr, int size) {
  for (int i = 0; i < size/2; i++) {
    int temp = arr[i];
    arr[i] = arr[size - 1 - i];
    arr[size - 1 - i] = arr[i];
  }

  return;
}

int main() {
  std::cout << "Hello World!\n";
  int arr[SIZE] = { 10, 20, 30, 40, 50, 60 };
  // int* reversed = reverse_array_intonew(arr, SIZE);

  // for (int i = 0; i < SIZE; i++) {
  //   cout << reversed[i] << " ";
  // }

  shift_array_right(arr, SIZE, 2);
  for (int i = 0; i < SIZE; i++) {
    cout << arr[i] << " ";
  }

  cout << endl;

  return 0;
}
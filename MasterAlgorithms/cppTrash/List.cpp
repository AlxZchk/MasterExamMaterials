#include <iostream>

using namespace std;

template<typename T>
class List {
  public:
    List();
    ~List();

    void push_back(T data);
    void pop_front();
    void clear();
    int getSize() { return Size; }
    T& operator[](const int index);

    void push_front(T data);
    void pop_back();
    void insert(T value, int index);
    void removeAt(int index);
  private:
    template<typename V>
    class Node {
      public: 
        Node *pNext;
        V data;

        Node(V data = V(), Node *pNext = nullptr) {
          this->data = data;
          this->pNext = pNext;
        }
    };

    int Size;
    Node<T> *head;
};

template<typename T>
List<T>::List() {
  Size = 0;
  head = nullptr;
}

template<typename T>
List<T>::~List() {
  clear();
}

template<typename T>
void List<T>::push_back(T data) {

  if (head == nullptr) {
    head = new Node<T>(data);
  } else {
    Node<T> *current = this->head;
    while(current->pNext != nullptr) {
      current = current->pNext;
    }

    current->pNext = new Node<T>(data);
  }

  Size++;
}

template<typename T>
void List<T>::pop_front() {
  Node<T> *temp = head;
  head = head->pNext;
  delete temp;

  Size--;
}

template<typename T>
void List<T>::clear() {
  while(Size) {
    pop_front();
  }
}

template<typename T>
void List<T>::push_front(T data) {
  head = new Node<T>(data, head);
  Size++;
}

template<typename T>
void List<T>::insert(T value, int index) {
  if (index == 0) {
    push_front(value);
  } else {
    Node<T> *previous = this->head;

    for (int i = 0; i < index - 1; i++) {
      previous = previous->pNext;
    }

    Node<T> *newNode = new Node<T>(value, previous->pNext);
    previous->pNext = newNode;

    Size++;
  }
}

template<typename T>
void List<T>::removeAt(int index) {
  if (index == 0) {
    pop_front();
  } else {
    Node<T> *previous = head;
    for (int i = 0; i < index - 1; i++) {
      previous = previous->pNext;
    }

    Node<T> *toDelete = previous->pNext;
    previous->pNext = toDelete->pNext;

    delete toDelete;
    Size--;
  }
}

template<typename T>
void List<T>::pop_back() {
  removeAt(Size - 1);
}

template<typename T>
T & List<T>::operator[](const int index) {
  int counter = 0;
  Node<T> *current = this-> head;

  while(current != nullptr) {
    if (counter == index) {
      return current->data;
    }
    current = current->pNext;
    counter++;
  }
}

int main() {
  List<int> lst;
  lst.push_front(5);
  lst.push_front(10);
  lst.push_front(22);

  for (int i = 0; i < lst.getSize(); i++) {
    cout << lst[i] << endl;
  }

  cout << endl;

  lst.insert(99, 1);
  lst.removeAt(2);
  lst.pop_back();
  
  for (int i = 0; i < lst.getSize(); i++) {
    cout << lst[i] << endl;
  }
}
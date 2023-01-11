
#include <bits/stdc++.h>
using namespace std;


struct Node {
	char data;
	struct Node* next;
	Node(char data)
	{
		this->data = data;
		next = NULL;
	}
};

struct LinkedList {
	Node* head;
	LinkedList() { head = NULL; }


	void reverse()
	{
		
		Node* current = head;
		Node *prev = NULL, *next = NULL;

		while (current != NULL) {
			
			next = current->next;
			
			current->next = prev;
			
			prev = current;
			current = next;
		}
		head = prev;
	}

    bool isPalin()
{
 
    Node* slow = head;
    stack<char> s;
 
    
    
    while (slow != NULL) {
        s.push(slow->data);
 
        
        slow = slow->next;
    }
 
    
    
    while (head != NULL) {
 
        
        int i = s.top();
 
        
        s.pop();
 
        
        
        if (head->data != i) {
            return false;
        }
 
        
        head = head->next;
    }
 
    return true;
}


	void print()
	{
		struct Node* temp = head;
		while (temp != NULL) {
			cout << temp->data << " ";
			temp = temp->next;
		}
	}

	void push(int data)
	{
		Node* temp = new Node(data);
		temp->next = head;
		head = temp;
	}
};


int main()
{

	LinkedList ll;
	ll.push('m');
	ll.push('a');
	ll.push('d');
	ll.push('a');
	ll.push('m');

	cout << "Given linked list\n";
	ll.print();

	ll.reverse();

	cout << "\nReversed linked list \n";
	ll.print();
    cout<<endl;
    int result = ll.isPalin();
 
    if (result == 1)
        cout << "Palindrome is true\n";
    else
        cout << "Palindrome is false\n";

	return 0;
}

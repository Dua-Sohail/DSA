#include<iostream>
using namespace std;

class Node{
    public:

    int data;
    Node* next;

    Node(int data){
        this->data=data;
        this->next=NULL;
    }
};

void printnode(Node* head){
    Node* temp= head;
    while(head!=NULL){
    cout<<temp->data<<" ";
    temp=temp->next;
    }

    cout<<endl;
}
int main(){

    Node* head=NULL;
    Node* tail=NULL;

    int n;
    cout<<"Enter Number of Nodes Exixts ";
    cin>>n;

    for(int i=0;i<n;i++){
        int value;
        cout << "Enter value for node " << i+1 << ": ";
        cin >> value;

        
        Node* newNode = new Node(value);

        if(head==NULL){
            head = newNode;
            tail = newNode;
        }
        else{
            tail->next = newNode;
            tail = newNode;
        }
    } 
    
    cout<<"Linked List ";
    printnode(head);
    return 0;
}
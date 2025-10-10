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
int main(){
    Node* first = new Node(10);
    Node* second = new Node(20);
    Node* third = new Node(30);

    first->next=second;
    second->next=third;
    third->next=NULL;

    cout<<"First node: "<<first->data<<endl;
    cout<<"Second node: "<<second->data<<endl;
    cout<<"Third node: "<< third->data<<endl;
    cout<<" Next node: "<< third->next<<endl;

    return 0;
}
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode*temp1,*temp2,*result,*temp;
    temp1=l1;
    temp2=l2;
    while(temp1!=0&&temp2!=0){
        temp1=temp1->next;
        temp2=temp2->next;
    }
    if(temp1==0) result=l2;
    else result=l1;
    temp=result;
    int c=0;
    while(l1!=0&&l2!=0){
        int value=l1->val+l2->val+c;
        if(value>=10){
            value%=10;
            temp->val=value;
            c=1;
        }
        else{
            temp->val=value;
            c=0;
        }
        l1=l1->next;
        l2=l2->next;
        if(temp->next!=0){
            temp=temp->next;
        }
    }
    if(l1==0&&l2==0&&c==1){
        struct ListNode*newNode=(struct ListNode*) malloc(sizeof(struct ListNode));
        temp->next=newNode;
        newNode->val=1;
        newNode->next=NULL;
    }
    while(l1!=0){
        int value=l1->val+c;
        if(value>=10){
            value%=10;
            temp->val=value;
            c=1;
        }
        else{
            temp->val=value;
            c=0;
        }
        l1=l1->next;
        if(temp->next!=0){
            temp=temp->next;
        }
    }
    while(l2!=0){
        int value=l2->val+c;
        if(value>=10){
            value%=10;
            temp->val=value;
            c=1;
        }
        else{
            temp->val=value;
            c=0;
        }
        l2=l2->next;
        if(temp->next!=0){
            temp=temp->next;
        }
    }
    if(c!=0){
        struct ListNode*newNode=(struct ListNode*) malloc(sizeof(struct ListNode));
        temp->next=newNode;
        newNode->val=1;
        newNode->next=NULL;
    }
    return result;
}
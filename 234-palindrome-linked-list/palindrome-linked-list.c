/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool isPalindrome(struct ListNode* head) {
    if(head->next==0) return true;
    int count=0,i=1;
    struct ListNode*temp=head,*temp1;
    while(temp!=0){
        count++;
        temp=temp->next;
    }
    temp=head;
    while(i<count/2){
        temp=temp->next;
        i++;
    }
    if(count%2==0) temp1=temp->next;
    else temp1=temp->next->next;
    temp->next=0;

    struct ListNode*head2=temp1;
    struct ListNode*prev=NULL,*curr=head2,*next=NULL;
    while(curr!=0){
        next=curr->next;
        curr->next=prev;
        prev=curr;
        curr=next;
    }
    head2=prev;
    while(head&&head2){
        if(head->val!=head2->val)
        return false;
        head=head->next;
        head2=head2->next;
    }
    return true;
}
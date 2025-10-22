/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* rotateRight(struct ListNode* head, int k) {
    struct ListNode*temp=head;
    int count=0,i=0;
    while(temp!=0){
        temp=temp->next;
        count++;
    }
    if(count==0) return NULL;
    k%=count;
    if(k==0) return head;
    temp=head;
    while(i<count-1){
        temp=temp->next;
        i++;
    }
    temp->next=head;
    temp=head;
    i=0;
    while(i<(count-k-1)){
        temp=temp->next;
        i++;
    }
    head=temp->next;
    temp->next=0;   
    return head;
}